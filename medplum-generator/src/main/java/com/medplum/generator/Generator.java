package com.medplum.generator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonParser;

import org.apache.commons.text.WordUtils;

public class Generator {
    private static final String OUTPUT_PACKAGE = "com.medplum.fhir.types";
    private static final String OUTPUT_PATH = "../medplum-core/src/main/java/com/medplum/fhir/types/";

    public static void main(final String[] args) throws IOException {
        final JsonObject schema = readJson("src/main/resources/fhir/fhir.schema.json");
        final JsonObject definitions = schema.getJsonObject("definitions");

        final List<FhirType> fhirTypes = new ArrayList<>();
        for (final String resourceType : definitions.keySet()) {
            final FhirType fhirType = buildType(
                    resourceType,
                    definitions.getJsonObject(resourceType));

            if (fhirType != null) {
                fhirTypes.add(fhirType);
            }
        }

        final Map<String, FhirType> parentTypes = new HashMap<>();
        for (final FhirType fhirType : fhirTypes) {
            if (fhirType.getParentType() == null) {
                parentTypes.put(fhirType.getOutputName(), fhirType);
            }
        }

        for (final FhirType fhirType : fhirTypes) {
            if (fhirType.getParentType() != null) {
                parentTypes.get(fhirType.getParentType()).getSubTypes().add(fhirType);
            }
        }

        final List<FhirType> outputTypes = new ArrayList<>(parentTypes.values());
        Collections.sort(outputTypes, (o1, o2) -> o1.getOutputName().compareTo(o2.getOutputName()));

        for (final FhirType outputType : parentTypes.values()) {
            writeClassFile(outputType);
        }
    }

    private static JsonObject readJson(final String filename) {
        try (final InputStream in = new FileInputStream(filename);
                final JsonParser parser = Json.createParser(in)) {
            parser.next();
            return parser.getObject();
        } catch (final IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static FhirType buildType(final String resourceType, final JsonObject typeDefinition) throws IOException {
        if (typeDefinition == null) {
            throw new RuntimeException("Resource type '" + resourceType + "' type definition is null");
        }

        final JsonObject propertyDefinitions = typeDefinition.getJsonObject("properties");
        if (propertyDefinitions == null) {
            return null;
        }

        final String parentType;
        final String outputName;
        if (resourceType.contains("_")) {
            final String[] parts = resourceType.split("_");
            parentType = parts[0];
            outputName = parts[0] + parts[1];
        } else {
            parentType = null;
            outputName = resourceType;
        }

        final FhirType result = new FhirType(typeDefinition, resourceType, parentType, outputName);

        for (final Entry<String, JsonValue> propertyDefinition : propertyDefinitions.entrySet()) {
            final String inputName = propertyDefinition.getKey();
            if (inputName.startsWith("_") || inputName.equals("extension")) {
                continue;
            }

            final String javaType = getJavaType(resourceType, inputName, propertyDefinition.getValue().asJsonObject());

            final Property property = new Property();
            property.setInputName(inputName);
            property.setJavaType(javaType);
            property.setDescription(propertyDefinition.getValue().asJsonObject().getString("description"));
            result.getProperties().add(property);

            if (inputName.equals("resourceType")) {
                result.setResource(true);
            }
        }

        return result;
    }

    public static void writeClassFile(final FhirType fhirType) throws IOException {
        final FileBuilder b = new FileBuilder();
        b.append("/*");
        b.append(" * Generated by " + Generator.class.getName());
        b.append(" * Do not edit manually.");
        b.append(" */");
        b.newLine();
        b.append("package " + OUTPUT_PACKAGE + ";");
        b.newLine();

        if (fhirType.isResource() && fhirType.getSubTypes().isEmpty()) {
            b.append("import jakarta.json.JsonObject;");
        } else {
            b.append("import jakarta.json.Json;");
            b.append("import jakarta.json.JsonObject;");
            b.append("import jakarta.json.JsonObjectBuilder;");
        }

        if (fhirType.getOutputName().equals("OperationOutcome")) {
            b.newLine();
            b.append("import com.medplum.fhir.StandardOperations;");
        }

        writeJsonClass(b, fhirType, true);
        Files.writeString(Path.of(OUTPUT_PATH + fhirType.getOutputName() + ".java"), b.toString());
    }

    public static void writeJsonClass(final FileBuilder b, final FhirType fhirType, final boolean topLevel) {
        final String resourceType = fhirType.getOutputName();

        b.newLine();

        if (topLevel) {
            b.append("public class " + resourceType + " extends FhirResource {");
        } else {
            b.append("public static class " + resourceType + " extends FhirObject {");
        }

        final String prevPrefix = b.getPrefix();
        b.setPrefix(prevPrefix + "    ");

        b.append("public static final String RESOURCE_TYPE = \"" + resourceType + "\";");

        for (final Property property : fhirType.getProperties()) {
            b.append("public static final String " + property.getConstantName() + " = \"" + property.getInputName() + "\";");
        }

        b.newLine();
        b.append("public static Builder create() {");
        b.append("    return new Builder();");
        b.append("}");
        b.newLine();
        b.append("public static Builder create(final JsonObject data) {");
        b.append("    return new Builder(data);");
        b.append("}");
        b.newLine();
        b.append("public " + resourceType + "(final JsonObject data) {");
        b.append("    super(data);");
        b.append("}");

        if (resourceType.equals("OperationOutcome")) {
            b.newLine();
            b.append("public boolean isOk() {");
            b.append("    final String id = id();");
            b.append("    return id.equals(StandardOperations.ALL_OK_ID) || id.equals(StandardOperations.CREATED_ID);");
            b.append("}");
        }

        for (final Property property : fhirType.getProperties()) {
            final String propertyName = property.getOutputName();

            if (fhirType.isResource() && Arrays.asList("resourceType", "id", "meta").contains(propertyName)) {
                // Ignore properties inherited from FhirResource
                continue;
            }

            final String javaType = property.getJavaType();

            b.newLine();
            b.append("/**");

            for (final String descriptionLine : property.getDescription().split("\n")) {
                for (final String javadocLine : WordUtils.wrap(descriptionLine, 70).split("\n")) {
                    if (javadocLine.isBlank()) {
                        b.append(" *");
                    } else {
                        b.append(" * " + javadocLine);
                    }
                }
            }

            b.append(" */");

            if (javaType.equals("FhirResource")) {
                b.append("public FhirResource " + propertyName + "() {");
                b.append("    return getObject(FhirResource.class, " + property.getConstantName() + ");");
                b.append("}");
                b.newLine();
                b.append("public <T extends FhirResource> T " + propertyName + "(final Class<T> c) {");
                b.append("    return getObject(c, " + property.getConstantName() + ");");
                b.append("}");
            } else {
                b.append("public " + javaType + " " + propertyName + "() {");

                switch (javaType) {
                case "String":
                    b.append("    return getString(" + property.getConstantName() + ");");
                    break;

                case "Boolean":
                    b.append("    return data.getBoolean(" + property.getConstantName() + ");");
                    break;

                case "Integer":
                    b.append("    return data.getInt(" + property.getConstantName() + ");");
                    break;

                case "Double":
                    b.append("    return data.getJsonNumber(" + property.getConstantName() + ").doubleValue();");
                    break;

                case "java.time.Instant":
                    b.append("    return java.time.Instant.parse(data.getString(" + property.getConstantName() + "));");
                    break;

                default:
                    if (javaType.startsWith("java.util.List<")) {
                        final String className = javaType.substring("java.util.List<".length(), javaType.length() - 1);
                        b.append("    return getList(" + className + ".class, " + property.getConstantName() + ");");
                    } else {
                        b.append("    return getObject(" + javaType + ".class, " + property.getConstantName() + ");");
                    }
                }
                b.append("}");
            }
        }

        b.newLine();

        if (fhirType.isResource()) {
            b.append("public static class Builder extends FhirResource.Builder {");
            b.newLine();
            b.append("    private Builder() {");
            b.append("        super(RESOURCE_TYPE);");
            b.append("    }");
            b.newLine();
            b.append("    private Builder(final JsonObject data) {");
            b.append("        super(RESOURCE_TYPE, data);");
            b.append("    }");
        } else {
            b.append("public static class Builder {");
            b.append("    private final JsonObjectBuilder b;");
            b.newLine();
            b.append("    private Builder() {");
            b.append("        b = Json.createObjectBuilder();");
            b.append("    }");
            b.newLine();
            b.append("    private Builder(final JsonObject data) {");
            b.append("        b = Json.createObjectBuilder(data);");
            b.append("    }");
        }

        for (final Property property : fhirType.getProperties()) {
            final String propertyName = property.getOutputName();
            String javaType = property.getJavaType();

            if (javaType.equals("FhirResource")) {
                // Be a bit more permissive in the builder
                javaType = "JsonObject";
            }

            b.newLine();
            b.append("    public Builder " + propertyName + "(final " + javaType + " " + propertyName + ") {");
            if (javaType.equals("java.time.Instant")) {
                b.append("        b.add(" + property.getConstantName() + ", " + propertyName + ".toString());");
            } else if (javaType.equals("java.util.List<String>")) {
                b.append("        b.add(" + property.getConstantName() + ", FhirObject.toStringArray(" + propertyName + "));");
            } else if (javaType.equals("java.util.List<Integer>")) {
                b.append("        b.add(" + property.getConstantName() + ", FhirObject.toIntegerArray(" + propertyName + "));");
            } else if (javaType.equals("java.util.List<Double>")) {
                b.append("        b.add(" + property.getConstantName() + ", FhirObject.toDoubleArray(" + propertyName + "));");
            } else if (javaType.equals("java.util.List<java.time.Instant>")) {
                b.append("        b.add(" + property.getConstantName() + ", FhirObject.toInstantArray(" + propertyName + "));");
            } else if (javaType.equals("java.util.List<JsonObject>")) {
                b.append("        b.add(" + property.getConstantName() + ", FhirObject.toJsonObjectArray(" + propertyName + "));");
            } else if (javaType.startsWith("java.util.List<")) {
                b.append("        b.add(" + property.getConstantName() + ", FhirObject.toArray(" + propertyName + "));");
            } else {
                b.append("        b.add(" + property.getConstantName() + ", " + propertyName + ");");
            }
            b.append("        return this;");
            b.append("    }");
        }

        b.newLine();
        b.append("    public " + resourceType + " build() {");
        b.append("        return new " + resourceType + "(b.build());");
        b.append("    }");
        b.append("}");

        Collections.sort(fhirType.getSubTypes(), (o1, o2) -> o1.getOutputName().compareTo(o2.getOutputName()));

        for (final FhirType subType : fhirType.getSubTypes()) {
            b.newLine();
            writeJsonClass(b, subType, false);
        }

        b.setPrefix(prevPrefix);
        b.append("}");
    }

    private static String getJavaType(final String resourceType, final String propertyName, final JsonObject fhirPropertyDefinition) {
        final String constValue = fhirPropertyDefinition.getString("const", null);
        if (constValue != null) {
            return "String";
        }

        if (resourceType.equals("OperationOutcome") && propertyName.equals("resource")) {
            return "FhirResource";
        }

        final String typeValue = fhirPropertyDefinition.getString("type", null);
        if (typeValue != null) {
            if (typeValue.equals("array")) {
                final JsonObject itemDefinition = fhirPropertyDefinition.getJsonObject("items");
                if (itemDefinition != null && itemDefinition.containsKey("$ref")) {
                    return "java.util.List<" + getJavaTypeFromDefinition(itemDefinition.getString("$ref")) + ">";
                } else if (itemDefinition != null && itemDefinition.containsKey("enum")) {
                    return "java.util.List<String>";
                } else {
                    return "JsonArray";
                }

            } else {
                return getJavaTypeFromDefinition(typeValue);
            }
        }

        final JsonValue enumValue = fhirPropertyDefinition.get("enum");
        if (enumValue != null) {
            return "String";
        }

        final String ref = fhirPropertyDefinition.getString("$ref", null);
        if (ref != null) {
            return getJavaTypeFromDefinition(ref);
        }

        System.out.println("unhandled property definition:");
        System.out.println(fhirPropertyDefinition.toString());
        return "JsonValue";
    }

    private static String getJavaTypeFromDefinition(String ref) {
        if (ref.startsWith("#/definitions/")) {
            ref = ref.replace("#/definitions/", "");
        }

        switch (ref) {
        case "boolean":
            return "Boolean";

        case "base64Binary":
        case "canonical":
        case "code":
        case "id":
        case "markdown":
        case "string":
        case "uri":
        case "url":
        case "xhtml":
            return "String";

        case "date":
        case "dateTime":
        case "instant":
        case "time":
            return "java.time.Instant";

        case "decimal":
            return "Double";

        case "integer":
        case "positiveInt":
        case "unsignedInt":
        case "number":
            return "Integer";

        case "ResourceList":
            return "FhirResource";
        }

        return ref.replaceAll("_", "");
    }
}
