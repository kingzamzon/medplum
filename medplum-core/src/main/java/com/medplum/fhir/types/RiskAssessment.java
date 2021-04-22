/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class RiskAssessment extends FhirResource {
    public static final String RESOURCE_TYPE = "RiskAssessment";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICITRULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_BASEDON = "basedOn";
    public static final String PROPERTY_PARENT = "parent";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_METHOD = "method";
    public static final String PROPERTY_CODE = "code";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_ENCOUNTER = "encounter";
    public static final String PROPERTY_OCCURRENCEDATETIME = "occurrenceDateTime";
    public static final String PROPERTY_OCCURRENCEPERIOD = "occurrencePeriod";
    public static final String PROPERTY_CONDITION = "condition";
    public static final String PROPERTY_PERFORMER = "performer";
    public static final String PROPERTY_REASONCODE = "reasonCode";
    public static final String PROPERTY_REASONREFERENCE = "reasonReference";
    public static final String PROPERTY_BASIS = "basis";
    public static final String PROPERTY_PREDICTION = "prediction";
    public static final String PROPERTY_MITIGATION = "mitigation";
    public static final String PROPERTY_NOTE = "note";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public RiskAssessment(final JsonObject data) {
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
     * Business identifier assigned to the risk assessment.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * A reference to the request that is fulfilled by this risk assessment.
     */
    public Reference basedOn() {
        return getObject(Reference.class, PROPERTY_BASEDON);
    }

    /**
     * A reference to a resource that this risk assessment is part of, such
     * as a Procedure.
     */
    public Reference parent() {
        return getObject(Reference.class, PROPERTY_PARENT);
    }

    /**
     * The status of the RiskAssessment, using the same statuses as an
     * Observation.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * The algorithm, process or mechanism used to evaluate the risk.
     */
    public CodeableConcept method() {
        return getObject(CodeableConcept.class, PROPERTY_METHOD);
    }

    /**
     * The type of the risk assessment performed.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, PROPERTY_CODE);
    }

    /**
     * The patient or group the risk assessment applies to.
     */
    public Reference subject() {
        return getObject(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * The encounter where the assessment was performed.
     */
    public Reference encounter() {
        return getObject(Reference.class, PROPERTY_ENCOUNTER);
    }

    /**
     * The date (and possibly time) the risk assessment was performed.
     */
    public String occurrenceDateTime() {
        return getString(PROPERTY_OCCURRENCEDATETIME);
    }

    /**
     * The date (and possibly time) the risk assessment was performed.
     */
    public Period occurrencePeriod() {
        return getObject(Period.class, PROPERTY_OCCURRENCEPERIOD);
    }

    /**
     * For assessments or prognosis specific to a particular condition,
     * indicates the condition being assessed.
     */
    public Reference condition() {
        return getObject(Reference.class, PROPERTY_CONDITION);
    }

    /**
     * The provider or software application that performed the assessment.
     */
    public Reference performer() {
        return getObject(Reference.class, PROPERTY_PERFORMER);
    }

    /**
     * The reason the risk assessment was performed.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, PROPERTY_REASONCODE);
    }

    /**
     * Resources supporting the reason the risk assessment was performed.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, PROPERTY_REASONREFERENCE);
    }

    /**
     * Indicates the source data considered as part of the assessment (for
     * example, FamilyHistory, Observations, Procedures, Conditions, etc.).
     */
    public java.util.List<Reference> basis() {
        return getList(Reference.class, PROPERTY_BASIS);
    }

    /**
     * Describes the expected outcome for the subject.
     */
    public java.util.List<RiskAssessmentPrediction> prediction() {
        return getList(RiskAssessmentPrediction.class, PROPERTY_PREDICTION);
    }

    /**
     * A description of the steps that might be taken to reduce the
     * identified risk(s).
     */
    public String mitigation() {
        return getString(PROPERTY_MITIGATION);
    }

    /**
     * Additional comments about the risk assessment.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, PROPERTY_NOTE);
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

        public Builder basedOn(final Reference basedOn) {
            b.add(PROPERTY_BASEDON, basedOn);
            return this;
        }

        public Builder parent(final Reference parent) {
            b.add(PROPERTY_PARENT, parent);
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder method(final CodeableConcept method) {
            b.add(PROPERTY_METHOD, method);
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

        public Builder occurrenceDateTime(final String occurrenceDateTime) {
            b.add(PROPERTY_OCCURRENCEDATETIME, occurrenceDateTime);
            return this;
        }

        public Builder occurrencePeriod(final Period occurrencePeriod) {
            b.add(PROPERTY_OCCURRENCEPERIOD, occurrencePeriod);
            return this;
        }

        public Builder condition(final Reference condition) {
            b.add(PROPERTY_CONDITION, condition);
            return this;
        }

        public Builder performer(final Reference performer) {
            b.add(PROPERTY_PERFORMER, performer);
            return this;
        }

        public Builder reasonCode(final java.util.List<CodeableConcept> reasonCode) {
            b.add(PROPERTY_REASONCODE, FhirObject.toArray(reasonCode));
            return this;
        }

        public Builder reasonReference(final java.util.List<Reference> reasonReference) {
            b.add(PROPERTY_REASONREFERENCE, FhirObject.toArray(reasonReference));
            return this;
        }

        public Builder basis(final java.util.List<Reference> basis) {
            b.add(PROPERTY_BASIS, FhirObject.toArray(basis));
            return this;
        }

        public Builder prediction(final java.util.List<RiskAssessmentPrediction> prediction) {
            b.add(PROPERTY_PREDICTION, FhirObject.toArray(prediction));
            return this;
        }

        public Builder mitigation(final String mitigation) {
            b.add(PROPERTY_MITIGATION, mitigation);
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public RiskAssessment build() {
            return new RiskAssessment(b.build());
        }
    }

    public static class RiskAssessmentPrediction extends FhirObject {
        public static final String RESOURCE_TYPE = "RiskAssessmentPrediction";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_OUTCOME = "outcome";
        public static final String PROPERTY_PROBABILITYDECIMAL = "probabilityDecimal";
        public static final String PROPERTY_PROBABILITYRANGE = "probabilityRange";
        public static final String PROPERTY_QUALITATIVERISK = "qualitativeRisk";
        public static final String PROPERTY_RELATIVERISK = "relativeRisk";
        public static final String PROPERTY_WHENPERIOD = "whenPeriod";
        public static final String PROPERTY_WHENRANGE = "whenRange";
        public static final String PROPERTY_RATIONALE = "rationale";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public RiskAssessmentPrediction(final JsonObject data) {
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
         * One of the potential outcomes for the patient (e.g. remission, death, 
         * a particular condition).
         */
        public CodeableConcept outcome() {
            return getObject(CodeableConcept.class, PROPERTY_OUTCOME);
        }

        /**
         * Indicates how likely the outcome is (in the specified timeframe).
         */
        public Integer probabilityDecimal() {
            return data.getInt(PROPERTY_PROBABILITYDECIMAL);
        }

        /**
         * Indicates how likely the outcome is (in the specified timeframe).
         */
        public Range probabilityRange() {
            return getObject(Range.class, PROPERTY_PROBABILITYRANGE);
        }

        /**
         * Indicates how likely the outcome is (in the specified timeframe),
         * expressed as a qualitative value (e.g. low, medium, or high).
         */
        public CodeableConcept qualitativeRisk() {
            return getObject(CodeableConcept.class, PROPERTY_QUALITATIVERISK);
        }

        /**
         * Indicates the risk for this particular subject (with their specific
         * characteristics) divided by the risk of the population in general. 
         * (Numbers greater than 1 = higher risk than the population, numbers
         * less than 1 = lower risk.).
         */
        public Double relativeRisk() {
            return data.getJsonNumber(PROPERTY_RELATIVERISK).doubleValue();
        }

        /**
         * Indicates the period of time or age range of the subject to which the
         * specified probability applies.
         */
        public Period whenPeriod() {
            return getObject(Period.class, PROPERTY_WHENPERIOD);
        }

        /**
         * Indicates the period of time or age range of the subject to which the
         * specified probability applies.
         */
        public Range whenRange() {
            return getObject(Range.class, PROPERTY_WHENRANGE);
        }

        /**
         * Additional information explaining the basis for the prediction.
         */
        public String rationale() {
            return getString(PROPERTY_RATIONALE);
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

            public Builder outcome(final CodeableConcept outcome) {
                b.add(PROPERTY_OUTCOME, outcome);
                return this;
            }

            public Builder probabilityDecimal(final Integer probabilityDecimal) {
                b.add(PROPERTY_PROBABILITYDECIMAL, probabilityDecimal);
                return this;
            }

            public Builder probabilityRange(final Range probabilityRange) {
                b.add(PROPERTY_PROBABILITYRANGE, probabilityRange);
                return this;
            }

            public Builder qualitativeRisk(final CodeableConcept qualitativeRisk) {
                b.add(PROPERTY_QUALITATIVERISK, qualitativeRisk);
                return this;
            }

            public Builder relativeRisk(final Double relativeRisk) {
                b.add(PROPERTY_RELATIVERISK, relativeRisk);
                return this;
            }

            public Builder whenPeriod(final Period whenPeriod) {
                b.add(PROPERTY_WHENPERIOD, whenPeriod);
                return this;
            }

            public Builder whenRange(final Range whenRange) {
                b.add(PROPERTY_WHENRANGE, whenRange);
                return this;
            }

            public Builder rationale(final String rationale) {
                b.add(PROPERTY_RATIONALE, rationale);
                return this;
            }

            public RiskAssessmentPrediction build() {
                return new RiskAssessmentPrediction(b.build());
            }
        }
    }
}
