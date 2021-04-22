/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class List extends FhirResource {
    public static final String RESOURCE_TYPE = "List";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICITRULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_MODE = "mode";
    public static final String PROPERTY_TITLE = "title";
    public static final String PROPERTY_CODE = "code";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_ENCOUNTER = "encounter";
    public static final String PROPERTY_DATE = "date";
    public static final String PROPERTY_SOURCE = "source";
    public static final String PROPERTY_ORDEREDBY = "orderedBy";
    public static final String PROPERTY_NOTE = "note";
    public static final String PROPERTY_ENTRY = "entry";
    public static final String PROPERTY_EMPTYREASON = "emptyReason";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public List(final JsonObject data) {
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
     * Identifier for the List assigned for business purposes outside the
     * context of FHIR.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * Indicates the current state of this list.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * How this list was prepared - whether it is a working list that is
     * suitable for being maintained on an ongoing basis, or if it represents
     * a snapshot of a list of items from another source, or whether it is a
     * prepared list where items may be marked as added, modified or deleted.
     */
    public String mode() {
        return getString(PROPERTY_MODE);
    }

    /**
     * A label for the list assigned by the author.
     */
    public String title() {
        return getString(PROPERTY_TITLE);
    }

    /**
     * This code defines the purpose of the list - why it was created.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, PROPERTY_CODE);
    }

    /**
     * The common subject (or patient) of the resources that are in the list
     * if there is one.
     */
    public Reference subject() {
        return getObject(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * The encounter that is the context in which this list was created.
     */
    public Reference encounter() {
        return getObject(Reference.class, PROPERTY_ENCOUNTER);
    }

    /**
     * The date that the list was prepared.
     */
    public java.time.Instant date() {
        return java.time.Instant.parse(data.getString(PROPERTY_DATE));
    }

    /**
     * The entity responsible for deciding what the contents of the list
     * were. Where the list was created by a human, this is the same as the
     * author of the list.
     */
    public Reference source() {
        return getObject(Reference.class, PROPERTY_SOURCE);
    }

    /**
     * What order applies to the items in the list.
     */
    public CodeableConcept orderedBy() {
        return getObject(CodeableConcept.class, PROPERTY_ORDEREDBY);
    }

    /**
     * Comments that apply to the overall list.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, PROPERTY_NOTE);
    }

    /**
     * Entries in this list.
     */
    public java.util.List<ListEntry> entry() {
        return getList(ListEntry.class, PROPERTY_ENTRY);
    }

    /**
     * If the list is empty, why the list is empty.
     */
    public CodeableConcept emptyReason() {
        return getObject(CodeableConcept.class, PROPERTY_EMPTYREASON);
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

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder mode(final String mode) {
            b.add(PROPERTY_MODE, mode);
            return this;
        }

        public Builder title(final String title) {
            b.add(PROPERTY_TITLE, title);
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(PROPERTY_CODE, code);
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder encounter(final Reference encounter) {
            b.add(PROPERTY_ENCOUNTER, encounter);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder source(final Reference source) {
            b.add(PROPERTY_SOURCE, source);
            return this;
        }

        public Builder orderedBy(final CodeableConcept orderedBy) {
            b.add(PROPERTY_ORDEREDBY, orderedBy);
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder entry(final java.util.List<ListEntry> entry) {
            b.add(PROPERTY_ENTRY, FhirObject.toArray(entry));
            return this;
        }

        public Builder emptyReason(final CodeableConcept emptyReason) {
            b.add(PROPERTY_EMPTYREASON, emptyReason);
            return this;
        }

        public List build() {
            return new List(b.build());
        }
    }

    public static class ListEntry extends FhirObject {
        public static final String RESOURCE_TYPE = "ListEntry";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_FLAG = "flag";
        public static final String PROPERTY_DELETED = "deleted";
        public static final String PROPERTY_DATE = "date";
        public static final String PROPERTY_ITEM = "item";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ListEntry(final JsonObject data) {
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
         * The flag allows the system constructing the list to indicate the role
         * and significance of the item in the list.
         */
        public CodeableConcept flag() {
            return getObject(CodeableConcept.class, PROPERTY_FLAG);
        }

        /**
         * True if this item is marked as deleted in the list.
         */
        public Boolean deleted() {
            return data.getBoolean(PROPERTY_DELETED);
        }

        /**
         * When this item was added to the list.
         */
        public java.time.Instant date() {
            return java.time.Instant.parse(data.getString(PROPERTY_DATE));
        }

        /**
         * A reference to the actual resource from which data was derived.
         */
        public Reference item() {
            return getObject(Reference.class, PROPERTY_ITEM);
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

            public Builder flag(final CodeableConcept flag) {
                b.add(PROPERTY_FLAG, flag);
                return this;
            }

            public Builder deleted(final Boolean deleted) {
                b.add(PROPERTY_DELETED, deleted);
                return this;
            }

            public Builder date(final java.time.Instant date) {
                b.add(PROPERTY_DATE, date.toString());
                return this;
            }

            public Builder item(final Reference item) {
                b.add(PROPERTY_ITEM, item);
                return this;
            }

            public ListEntry build() {
                return new ListEntry(b.build());
            }
        }
    }
}
