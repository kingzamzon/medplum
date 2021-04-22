/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class MedicinalProductIndication extends FhirResource {
    public static final String RESOURCE_TYPE = "MedicinalProductIndication";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICITRULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_DISEASESYMPTOMPROCEDURE = "diseaseSymptomProcedure";
    public static final String PROPERTY_DISEASESTATUS = "diseaseStatus";
    public static final String PROPERTY_COMORBIDITY = "comorbidity";
    public static final String PROPERTY_INTENDEDEFFECT = "intendedEffect";
    public static final String PROPERTY_DURATION = "duration";
    public static final String PROPERTY_OTHERTHERAPY = "otherTherapy";
    public static final String PROPERTY_UNDESIRABLEEFFECT = "undesirableEffect";
    public static final String PROPERTY_POPULATION = "population";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public MedicinalProductIndication(final JsonObject data) {
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
     * The medication for which this is an indication.
     */
    public java.util.List<Reference> subject() {
        return getList(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * The disease, symptom or procedure that is the indication for
     * treatment.
     */
    public CodeableConcept diseaseSymptomProcedure() {
        return getObject(CodeableConcept.class, PROPERTY_DISEASESYMPTOMPROCEDURE);
    }

    /**
     * The status of the disease or symptom for which the indication applies.
     */
    public CodeableConcept diseaseStatus() {
        return getObject(CodeableConcept.class, PROPERTY_DISEASESTATUS);
    }

    /**
     * Comorbidity (concurrent condition) or co-infection as part of the
     * indication.
     */
    public java.util.List<CodeableConcept> comorbidity() {
        return getList(CodeableConcept.class, PROPERTY_COMORBIDITY);
    }

    /**
     * The intended effect, aim or strategy to be achieved by the indication.
     */
    public CodeableConcept intendedEffect() {
        return getObject(CodeableConcept.class, PROPERTY_INTENDEDEFFECT);
    }

    /**
     * Timing or duration information as part of the indication.
     */
    public Quantity duration() {
        return getObject(Quantity.class, PROPERTY_DURATION);
    }

    /**
     * Information about the use of the medicinal product in relation to
     * other therapies described as part of the indication.
     */
    public java.util.List<MedicinalProductIndicationOtherTherapy> otherTherapy() {
        return getList(MedicinalProductIndicationOtherTherapy.class, PROPERTY_OTHERTHERAPY);
    }

    /**
     * Describe the undesirable effects of the medicinal product.
     */
    public java.util.List<Reference> undesirableEffect() {
        return getList(Reference.class, PROPERTY_UNDESIRABLEEFFECT);
    }

    /**
     * The population group to which this applies.
     */
    public java.util.List<Population> population() {
        return getList(Population.class, PROPERTY_POPULATION);
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

        public Builder subject(final java.util.List<Reference> subject) {
            b.add(PROPERTY_SUBJECT, FhirObject.toArray(subject));
            return this;
        }

        public Builder diseaseSymptomProcedure(final CodeableConcept diseaseSymptomProcedure) {
            b.add(PROPERTY_DISEASESYMPTOMPROCEDURE, diseaseSymptomProcedure);
            return this;
        }

        public Builder diseaseStatus(final CodeableConcept diseaseStatus) {
            b.add(PROPERTY_DISEASESTATUS, diseaseStatus);
            return this;
        }

        public Builder comorbidity(final java.util.List<CodeableConcept> comorbidity) {
            b.add(PROPERTY_COMORBIDITY, FhirObject.toArray(comorbidity));
            return this;
        }

        public Builder intendedEffect(final CodeableConcept intendedEffect) {
            b.add(PROPERTY_INTENDEDEFFECT, intendedEffect);
            return this;
        }

        public Builder duration(final Quantity duration) {
            b.add(PROPERTY_DURATION, duration);
            return this;
        }

        public Builder otherTherapy(final java.util.List<MedicinalProductIndicationOtherTherapy> otherTherapy) {
            b.add(PROPERTY_OTHERTHERAPY, FhirObject.toArray(otherTherapy));
            return this;
        }

        public Builder undesirableEffect(final java.util.List<Reference> undesirableEffect) {
            b.add(PROPERTY_UNDESIRABLEEFFECT, FhirObject.toArray(undesirableEffect));
            return this;
        }

        public Builder population(final java.util.List<Population> population) {
            b.add(PROPERTY_POPULATION, FhirObject.toArray(population));
            return this;
        }

        public MedicinalProductIndication build() {
            return new MedicinalProductIndication(b.build());
        }
    }

    public static class MedicinalProductIndicationOtherTherapy extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductIndicationOtherTherapy";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_THERAPYRELATIONSHIPTYPE = "therapyRelationshipType";
        public static final String PROPERTY_MEDICATIONCODEABLECONCEPT = "medicationCodeableConcept";
        public static final String PROPERTY_MEDICATIONREFERENCE = "medicationReference";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductIndicationOtherTherapy(final JsonObject data) {
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
         * The type of relationship between the medicinal product indication or
         * contraindication and another therapy.
         */
        public CodeableConcept therapyRelationshipType() {
            return getObject(CodeableConcept.class, PROPERTY_THERAPYRELATIONSHIPTYPE);
        }

        /**
         * Reference to a specific medication (active substance, medicinal
         * product or class of products) as part of an indication or
         * contraindication.
         */
        public CodeableConcept medicationCodeableConcept() {
            return getObject(CodeableConcept.class, PROPERTY_MEDICATIONCODEABLECONCEPT);
        }

        /**
         * Reference to a specific medication (active substance, medicinal
         * product or class of products) as part of an indication or
         * contraindication.
         */
        public Reference medicationReference() {
            return getObject(Reference.class, PROPERTY_MEDICATIONREFERENCE);
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

            public Builder therapyRelationshipType(final CodeableConcept therapyRelationshipType) {
                b.add(PROPERTY_THERAPYRELATIONSHIPTYPE, therapyRelationshipType);
                return this;
            }

            public Builder medicationCodeableConcept(final CodeableConcept medicationCodeableConcept) {
                b.add(PROPERTY_MEDICATIONCODEABLECONCEPT, medicationCodeableConcept);
                return this;
            }

            public Builder medicationReference(final Reference medicationReference) {
                b.add(PROPERTY_MEDICATIONREFERENCE, medicationReference);
                return this;
            }

            public MedicinalProductIndicationOtherTherapy build() {
                return new MedicinalProductIndicationOtherTherapy(b.build());
            }
        }
    }
}
