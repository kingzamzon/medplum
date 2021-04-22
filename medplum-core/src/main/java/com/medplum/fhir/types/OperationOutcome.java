/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

import com.medplum.fhir.StandardOperations;

public class OperationOutcome extends FhirResource {
    public static final String RESOURCE_TYPE = "OperationOutcome";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICITRULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_ISSUE = "issue";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_RESOURCE = "resource";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public OperationOutcome(final JsonObject data) {
        super(data);
    }

    public boolean isOk() {
        final String id = id();
        return id.equals(StandardOperations.ALL_OK_ID) || id.equals(StandardOperations.CREATED_ID);
    }

    /**
     * A reference to a set of rules that were followed when the resource was
     * constructed, and which must be understood when processing the content.
     * Often, this is a reference to an implementation guide that defines the
     * special rules along with other profiles etc.
     */
    public String implicitRules() {
        return getString(PROPERTY_IMPLICITRULES);
    }

    /**
     * The base language in which the resource is written.
     */
    public String language() {
        return getString(PROPERTY_LANGUAGE);
    }

    /**
     * A human-readable narrative that contains a summary of the resource and
     * can be used to represent the content of the resource to a human. The
     * narrative need not encode all the structured data, but is required to
     * contain sufficient detail to make it "clinically safe" for a human to
     * just read the narrative. Resource definitions may define what content
     * should be represented in the narrative to ensure clinical safety.
     */
    public Narrative text() {
        return getObject(Narrative.class, PROPERTY_TEXT);
    }

    /**
     * These resources do not have an independent existence apart from the
     * resource that contains them - they cannot be identified independently,
     * and nor can they have their own independent transaction scope.
     */
    public java.util.List<FhirResource> contained() {
        return getList(FhirResource.class, PROPERTY_CONTAINED);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource and that modifies the
     * understanding of the element that contains it and/or the understanding
     * of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe
     * and manageable, there is a strict set of governance applied to the
     * definition and use of extensions. Though any implementer is allowed to
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension. Applications processing a
     * resource are required to check for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on
     * Resource or DomainResource (including cannot change the meaning of
     * modifierExtension itself).
     */
    public java.util.List<Extension> modifierExtension() {
        return getList(Extension.class, PROPERTY_MODIFIEREXTENSION);
    }

    /**
     * An error, warning, or information message that results from a system
     * action.
     */
    public java.util.List<OperationOutcomeIssue> issue() {
        return getList(OperationOutcomeIssue.class, PROPERTY_ISSUE);
    }

    /**
     * Optional HTTP status code returned by the operation.
     */
    public Integer status() {
        return data.getInt(PROPERTY_STATUS);
    }

    /**
     * Optional Resource created or modified by this operation.
     */
    public FhirResource resource() {
        return getObject(FhirResource.class, PROPERTY_RESOURCE);
    }

    public <T extends FhirResource> T resource(final Class<T> c) {
        return getObject(c, PROPERTY_RESOURCE);
    }

    public static class Builder extends FhirResource.Builder {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder resourceType(final String resourceType) {
            b.add(PROPERTY_RESOURCETYPE, resourceType);
            return this;
        }

        public Builder id(final String id) {
            b.add(PROPERTY_ID, id);
            return this;
        }

        public Builder meta(final Meta meta) {
            b.add(PROPERTY_META, meta);
            return this;
        }

        public Builder implicitRules(final String implicitRules) {
            b.add(PROPERTY_IMPLICITRULES, implicitRules);
            return this;
        }

        public Builder language(final String language) {
            b.add(PROPERTY_LANGUAGE, language);
            return this;
        }

        public Builder text(final Narrative text) {
            b.add(PROPERTY_TEXT, text);
            return this;
        }

        public Builder contained(final java.util.List<FhirResource> contained) {
            b.add(PROPERTY_CONTAINED, FhirObject.toArray(contained));
            return this;
        }

        public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
            b.add(PROPERTY_MODIFIEREXTENSION, FhirObject.toArray(modifierExtension));
            return this;
        }

        public Builder issue(final java.util.List<OperationOutcomeIssue> issue) {
            b.add(PROPERTY_ISSUE, FhirObject.toArray(issue));
            return this;
        }

        public Builder status(final Integer status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder resource(final JsonObject resource) {
            b.add(PROPERTY_RESOURCE, resource);
            return this;
        }

        public OperationOutcome build() {
            return new OperationOutcome(b.build());
        }
    }

    public static class OperationOutcomeIssue extends FhirObject {
        public static final String RESOURCE_TYPE = "OperationOutcomeIssue";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_SEVERITY = "severity";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_DETAILS = "details";
        public static final String PROPERTY_DIAGNOSTICS = "diagnostics";
        public static final String PROPERTY_LOCATION = "location";
        public static final String PROPERTY_EXPRESSION = "expression";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public OperationOutcomeIssue(final JsonObject data) {
            super(data);
        }

        /**
         * Unique id for the element within a resource (for internal references).
         * This may be any string value that does not contain spaces.
         */
        public String id() {
            return getString(PROPERTY_ID);
        }

        /**
         * May be used to represent additional information that is not part of
         * the basic definition of the element and that modifies the
         * understanding of the element in which it is contained and/or the
         * understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use
         * of extensions safe and manageable, there is a strict set of governance
         * applied to the definition and use of extensions. Though any
         * implementer can define an extension, there is a set of requirements
         * that SHALL be met as part of the definition of the extension.
         * Applications processing a resource are required to check for modifier
         * extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on
         * Resource or DomainResource (including cannot change the meaning of
         * modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, PROPERTY_MODIFIEREXTENSION);
        }

        /**
         * Indicates whether the issue indicates a variation from successful
         * processing.
         */
        public String severity() {
            return getString(PROPERTY_SEVERITY);
        }

        /**
         * Describes the type of the issue. The system that creates an
         * OperationOutcome SHALL choose the most applicable code from the
         * IssueType value set, and may additional provide its own code for the
         * error in the details element.
         */
        public String code() {
            return getString(PROPERTY_CODE);
        }

        /**
         * Additional details about the error. This may be a text description of
         * the error or a system code that identifies the error.
         */
        public CodeableConcept details() {
            return getObject(CodeableConcept.class, PROPERTY_DETAILS);
        }

        /**
         * Additional diagnostic information about the issue.
         */
        public String diagnostics() {
            return getString(PROPERTY_DIAGNOSTICS);
        }

        /**
         * This element is deprecated because it is XML specific. It is replaced
         * by issue.expression, which is format independent, and simpler to
         * parse. 
         *
         * For resource issues, this will be a simple XPath limited to element
         * names, repetition indicators and the default child accessor that
         * identifies one of the elements in the resource that caused this issue
         * to be raised.  For HTTP errors, will be "http." + the parameter name.
         */
        public java.util.List<String> location() {
            return getList(String.class, PROPERTY_LOCATION);
        }

        /**
         * A [simple subset of FHIRPath](fhirpath.html#simple) limited to element
         * names, repetition indicators and the default child accessor that
         * identifies one of the elements in the resource that caused this issue
         * to be raised.
         */
        public java.util.List<String> expression() {
            return getList(String.class, PROPERTY_EXPRESSION);
        }

        public static class Builder {
            private final JsonObjectBuilder b;

            private Builder() {
                b = Json.createObjectBuilder();
            }

            private Builder(final JsonObject data) {
                b = Json.createObjectBuilder(data);
            }

            public Builder id(final String id) {
                b.add(PROPERTY_ID, id);
                return this;
            }

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIEREXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder severity(final String severity) {
                b.add(PROPERTY_SEVERITY, severity);
                return this;
            }

            public Builder code(final String code) {
                b.add(PROPERTY_CODE, code);
                return this;
            }

            public Builder details(final CodeableConcept details) {
                b.add(PROPERTY_DETAILS, details);
                return this;
            }

            public Builder diagnostics(final String diagnostics) {
                b.add(PROPERTY_DIAGNOSTICS, diagnostics);
                return this;
            }

            public Builder location(final java.util.List<String> location) {
                b.add(PROPERTY_LOCATION, FhirObject.toStringArray(location));
                return this;
            }

            public Builder expression(final java.util.List<String> expression) {
                b.add(PROPERTY_EXPRESSION, FhirObject.toStringArray(expression));
                return this;
            }

            public OperationOutcomeIssue build() {
                return new OperationOutcomeIssue(b.build());
            }
        }
    }
}
