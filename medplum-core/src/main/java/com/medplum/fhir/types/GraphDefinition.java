/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class GraphDefinition extends FhirResource {
    public static final String RESOURCE_TYPE = "GraphDefinition";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICITRULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_URL = "url";
    public static final String PROPERTY_VERSION = "version";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_EXPERIMENTAL = "experimental";
    public static final String PROPERTY_DATE = "date";
    public static final String PROPERTY_PUBLISHER = "publisher";
    public static final String PROPERTY_CONTACT = "contact";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_USECONTEXT = "useContext";
    public static final String PROPERTY_JURISDICTION = "jurisdiction";
    public static final String PROPERTY_PURPOSE = "purpose";
    public static final String PROPERTY_START = "start";
    public static final String PROPERTY_PROFILE = "profile";
    public static final String PROPERTY_LINK = "link";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public GraphDefinition(final JsonObject data) {
        super(data);
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
     * An absolute URI that is used to identify this graph definition when it
     * is referenced in a specification, model, design or an instance; also
     * called its canonical identifier. This SHOULD be globally unique and
     * SHOULD be a literal address at which at which an authoritative
     * instance of this graph definition is (or will be) published. This URL
     * can be the target of a canonical reference. It SHALL remain the same
     * when the graph definition is stored on different servers.
     */
    public String url() {
        return getString(PROPERTY_URL);
    }

    /**
     * The identifier that is used to identify this version of the graph
     * definition when it is referenced in a specification, model, design or
     * instance. This is an arbitrary value managed by the graph definition
     * author and is not expected to be globally unique. For example, it
     * might be a timestamp (e.g. yyyymmdd) if a managed version is not
     * available. There is also no expectation that versions can be placed in
     * a lexicographical sequence.
     */
    public String version() {
        return getString(PROPERTY_VERSION);
    }

    /**
     * A natural language name identifying the graph definition. This name
     * should be usable as an identifier for the module by machine processing
     * applications such as code generation.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * The status of this graph definition. Enables tracking the life-cycle
     * of the content.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * A Boolean value to indicate that this graph definition is authored for
     * testing purposes (or education/evaluation/marketing) and is not
     * intended to be used for genuine usage.
     */
    public Boolean experimental() {
        return data.getBoolean(PROPERTY_EXPERIMENTAL);
    }

    /**
     * The date  (and optionally time) when the graph definition was
     * published. The date must change when the business version changes and
     * it must change if the status code changes. In addition, it should
     * change when the substantive content of the graph definition changes.
     */
    public java.time.Instant date() {
        return java.time.Instant.parse(data.getString(PROPERTY_DATE));
    }

    /**
     * The name of the organization or individual that published the graph
     * definition.
     */
    public String publisher() {
        return getString(PROPERTY_PUBLISHER);
    }

    /**
     * Contact details to assist a user in finding and communicating with the
     * publisher.
     */
    public java.util.List<ContactDetail> contact() {
        return getList(ContactDetail.class, PROPERTY_CONTACT);
    }

    /**
     * A free text natural language description of the graph definition from
     * a consumer's perspective.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * The content was developed with a focus and intent of supporting the
     * contexts that are listed. These contexts may be general categories
     * (gender, age, ...) or may be references to specific programs
     * (insurance plans, studies, ...) and may be used to assist with
     * indexing and searching for appropriate graph definition instances.
     */
    public java.util.List<UsageContext> useContext() {
        return getList(UsageContext.class, PROPERTY_USECONTEXT);
    }

    /**
     * A legal or geographic region in which the graph definition is intended
     * to be used.
     */
    public java.util.List<CodeableConcept> jurisdiction() {
        return getList(CodeableConcept.class, PROPERTY_JURISDICTION);
    }

    /**
     * Explanation of why this graph definition is needed and why it has been
     * designed as it has.
     */
    public String purpose() {
        return getString(PROPERTY_PURPOSE);
    }

    /**
     * The type of FHIR resource at which instances of this graph start.
     */
    public String start() {
        return getString(PROPERTY_START);
    }

    /**
     * The profile that describes the use of the base resource.
     */
    public String profile() {
        return getString(PROPERTY_PROFILE);
    }

    /**
     * Links this graph makes rules about.
     */
    public java.util.List<GraphDefinitionLink> link() {
        return getList(GraphDefinitionLink.class, PROPERTY_LINK);
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

        public Builder url(final String url) {
            b.add(PROPERTY_URL, url);
            return this;
        }

        public Builder version(final String version) {
            b.add(PROPERTY_VERSION, version);
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder experimental(final Boolean experimental) {
            b.add(PROPERTY_EXPERIMENTAL, experimental);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder publisher(final String publisher) {
            b.add(PROPERTY_PUBLISHER, publisher);
            return this;
        }

        public Builder contact(final java.util.List<ContactDetail> contact) {
            b.add(PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder description(final String description) {
            b.add(PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder useContext(final java.util.List<UsageContext> useContext) {
            b.add(PROPERTY_USECONTEXT, FhirObject.toArray(useContext));
            return this;
        }

        public Builder jurisdiction(final java.util.List<CodeableConcept> jurisdiction) {
            b.add(PROPERTY_JURISDICTION, FhirObject.toArray(jurisdiction));
            return this;
        }

        public Builder purpose(final String purpose) {
            b.add(PROPERTY_PURPOSE, purpose);
            return this;
        }

        public Builder start(final String start) {
            b.add(PROPERTY_START, start);
            return this;
        }

        public Builder profile(final String profile) {
            b.add(PROPERTY_PROFILE, profile);
            return this;
        }

        public Builder link(final java.util.List<GraphDefinitionLink> link) {
            b.add(PROPERTY_LINK, FhirObject.toArray(link));
            return this;
        }

        public GraphDefinition build() {
            return new GraphDefinition(b.build());
        }
    }

    public static class GraphDefinitionCompartment extends FhirObject {
        public static final String RESOURCE_TYPE = "GraphDefinitionCompartment";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_USE = "use";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_RULE = "rule";
        public static final String PROPERTY_EXPRESSION = "expression";
        public static final String PROPERTY_DESCRIPTION = "description";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public GraphDefinitionCompartment(final JsonObject data) {
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
         * Defines how the compartment rule is used - whether it it is used to
         * test whether resources are subject to the rule, or whether it is a
         * rule that must be followed.
         */
        public String use() {
            return getString(PROPERTY_USE);
        }

        /**
         * Identifies the compartment.
         */
        public String code() {
            return getString(PROPERTY_CODE);
        }

        /**
         * identical | matching | different | no-rule | custom.
         */
        public String rule() {
            return getString(PROPERTY_RULE);
        }

        /**
         * Custom rule, as a FHIRPath expression.
         */
        public String expression() {
            return getString(PROPERTY_EXPRESSION);
        }

        /**
         * Documentation for FHIRPath expression.
         */
        public String description() {
            return getString(PROPERTY_DESCRIPTION);
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

            public Builder use(final String use) {
                b.add(PROPERTY_USE, use);
                return this;
            }

            public Builder code(final String code) {
                b.add(PROPERTY_CODE, code);
                return this;
            }

            public Builder rule(final String rule) {
                b.add(PROPERTY_RULE, rule);
                return this;
            }

            public Builder expression(final String expression) {
                b.add(PROPERTY_EXPRESSION, expression);
                return this;
            }

            public Builder description(final String description) {
                b.add(PROPERTY_DESCRIPTION, description);
                return this;
            }

            public GraphDefinitionCompartment build() {
                return new GraphDefinitionCompartment(b.build());
            }
        }
    }

    public static class GraphDefinitionLink extends FhirObject {
        public static final String RESOURCE_TYPE = "GraphDefinitionLink";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_PATH = "path";
        public static final String PROPERTY_SLICENAME = "sliceName";
        public static final String PROPERTY_MIN = "min";
        public static final String PROPERTY_MAX = "max";
        public static final String PROPERTY_DESCRIPTION = "description";
        public static final String PROPERTY_TARGET = "target";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public GraphDefinitionLink(final JsonObject data) {
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
         * A FHIR expression that identifies one of FHIR References to other
         * resources.
         */
        public String path() {
            return getString(PROPERTY_PATH);
        }

        /**
         * Which slice (if profiled).
         */
        public String sliceName() {
            return getString(PROPERTY_SLICENAME);
        }

        /**
         * Minimum occurrences for this link.
         */
        public Integer min() {
            return data.getInt(PROPERTY_MIN);
        }

        /**
         * Maximum occurrences for this link.
         */
        public String max() {
            return getString(PROPERTY_MAX);
        }

        /**
         * Information about why this link is of interest in this graph
         * definition.
         */
        public String description() {
            return getString(PROPERTY_DESCRIPTION);
        }

        /**
         * Potential target for the link.
         */
        public java.util.List<GraphDefinitionTarget> target() {
            return getList(GraphDefinitionTarget.class, PROPERTY_TARGET);
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

            public Builder path(final String path) {
                b.add(PROPERTY_PATH, path);
                return this;
            }

            public Builder sliceName(final String sliceName) {
                b.add(PROPERTY_SLICENAME, sliceName);
                return this;
            }

            public Builder min(final Integer min) {
                b.add(PROPERTY_MIN, min);
                return this;
            }

            public Builder max(final String max) {
                b.add(PROPERTY_MAX, max);
                return this;
            }

            public Builder description(final String description) {
                b.add(PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder target(final java.util.List<GraphDefinitionTarget> target) {
                b.add(PROPERTY_TARGET, FhirObject.toArray(target));
                return this;
            }

            public GraphDefinitionLink build() {
                return new GraphDefinitionLink(b.build());
            }
        }
    }

    public static class GraphDefinitionTarget extends FhirObject {
        public static final String RESOURCE_TYPE = "GraphDefinitionTarget";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_TYPE = "type";
        public static final String PROPERTY_PARAMS = "params";
        public static final String PROPERTY_PROFILE = "profile";
        public static final String PROPERTY_COMPARTMENT = "compartment";
        public static final String PROPERTY_LINK = "link";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public GraphDefinitionTarget(final JsonObject data) {
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
         * Type of resource this link refers to.
         */
        public String type() {
            return getString(PROPERTY_TYPE);
        }

        /**
         * A set of parameters to look up.
         */
        public String params() {
            return getString(PROPERTY_PARAMS);
        }

        /**
         * Profile for the target resource.
         */
        public String profile() {
            return getString(PROPERTY_PROFILE);
        }

        /**
         * Compartment Consistency Rules.
         */
        public java.util.List<GraphDefinitionCompartment> compartment() {
            return getList(GraphDefinitionCompartment.class, PROPERTY_COMPARTMENT);
        }

        /**
         * Additional links from target resource.
         */
        public java.util.List<GraphDefinitionLink> link() {
            return getList(GraphDefinitionLink.class, PROPERTY_LINK);
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

            public Builder type(final String type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public Builder params(final String params) {
                b.add(PROPERTY_PARAMS, params);
                return this;
            }

            public Builder profile(final String profile) {
                b.add(PROPERTY_PROFILE, profile);
                return this;
            }

            public Builder compartment(final java.util.List<GraphDefinitionCompartment> compartment) {
                b.add(PROPERTY_COMPARTMENT, FhirObject.toArray(compartment));
                return this;
            }

            public Builder link(final java.util.List<GraphDefinitionLink> link) {
                b.add(PROPERTY_LINK, FhirObject.toArray(link));
                return this;
            }

            public GraphDefinitionTarget build() {
                return new GraphDefinitionTarget(b.build());
            }
        }
    }
}
