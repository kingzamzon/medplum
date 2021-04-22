/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Procedure extends FhirResource {
    public static final String RESOURCE_TYPE = "Procedure";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICITRULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_INSTANTIATESCANONICAL = "instantiatesCanonical";
    public static final String PROPERTY_INSTANTIATESURI = "instantiatesUri";
    public static final String PROPERTY_BASEDON = "basedOn";
    public static final String PROPERTY_PARTOF = "partOf";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_STATUSREASON = "statusReason";
    public static final String PROPERTY_CATEGORY = "category";
    public static final String PROPERTY_CODE = "code";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_ENCOUNTER = "encounter";
    public static final String PROPERTY_PERFORMEDDATETIME = "performedDateTime";
    public static final String PROPERTY_PERFORMEDPERIOD = "performedPeriod";
    public static final String PROPERTY_PERFORMEDSTRING = "performedString";
    public static final String PROPERTY_PERFORMEDAGE = "performedAge";
    public static final String PROPERTY_PERFORMEDRANGE = "performedRange";
    public static final String PROPERTY_RECORDER = "recorder";
    public static final String PROPERTY_ASSERTER = "asserter";
    public static final String PROPERTY_PERFORMER = "performer";
    public static final String PROPERTY_LOCATION = "location";
    public static final String PROPERTY_REASONCODE = "reasonCode";
    public static final String PROPERTY_REASONREFERENCE = "reasonReference";
    public static final String PROPERTY_BODYSITE = "bodySite";
    public static final String PROPERTY_OUTCOME = "outcome";
    public static final String PROPERTY_REPORT = "report";
    public static final String PROPERTY_COMPLICATION = "complication";
    public static final String PROPERTY_COMPLICATIONDETAIL = "complicationDetail";
    public static final String PROPERTY_FOLLOWUP = "followUp";
    public static final String PROPERTY_NOTE = "note";
    public static final String PROPERTY_FOCALDEVICE = "focalDevice";
    public static final String PROPERTY_USEDREFERENCE = "usedReference";
    public static final String PROPERTY_USEDCODE = "usedCode";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Procedure(final JsonObject data) {
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
     * Business identifiers assigned to this procedure by the performer or
     * other systems which remain constant as the resource is updated and is
     * propagated from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, order set or
     * other definition that is adhered to in whole or in part by this
     * Procedure.
     */
    public java.util.List<String> instantiatesCanonical() {
        return getList(String.class, PROPERTY_INSTANTIATESCANONICAL);
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline,
     * order set or other definition that is adhered to in whole or in part
     * by this Procedure.
     */
    public java.util.List<String> instantiatesUri() {
        return getList(String.class, PROPERTY_INSTANTIATESURI);
    }

    /**
     * A reference to a resource that contains details of the request for
     * this procedure.
     */
    public java.util.List<Reference> basedOn() {
        return getList(Reference.class, PROPERTY_BASEDON);
    }

    /**
     * A larger event of which this particular procedure is a component or
     * step.
     */
    public java.util.List<Reference> partOf() {
        return getList(Reference.class, PROPERTY_PARTOF);
    }

    /**
     * A code specifying the state of the procedure. Generally, this will be
     * the in-progress or completed state.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * Captures the reason for the current state of the procedure.
     */
    public CodeableConcept statusReason() {
        return getObject(CodeableConcept.class, PROPERTY_STATUSREASON);
    }

    /**
     * A code that classifies the procedure for searching, sorting and
     * display purposes (e.g. "Surgical Procedure").
     */
    public CodeableConcept category() {
        return getObject(CodeableConcept.class, PROPERTY_CATEGORY);
    }

    /**
     * The specific procedure that is performed. Use text if the exact nature
     * of the procedure cannot be coded (e.g. "Laparoscopic Appendectomy").
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, PROPERTY_CODE);
    }

    /**
     * The person, animal or group on which the procedure was performed.
     */
    public Reference subject() {
        return getObject(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * The Encounter during which this Procedure was created or performed or
     * to which the creation of this record is tightly associated.
     */
    public Reference encounter() {
        return getObject(Reference.class, PROPERTY_ENCOUNTER);
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure
     * was performed.  Allows a period to support complex procedures that
     * span more than one date, and also allows for the length of the
     * procedure to be captured.
     */
    public String performedDateTime() {
        return getString(PROPERTY_PERFORMEDDATETIME);
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure
     * was performed.  Allows a period to support complex procedures that
     * span more than one date, and also allows for the length of the
     * procedure to be captured.
     */
    public Period performedPeriod() {
        return getObject(Period.class, PROPERTY_PERFORMEDPERIOD);
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure
     * was performed.  Allows a period to support complex procedures that
     * span more than one date, and also allows for the length of the
     * procedure to be captured.
     */
    public String performedString() {
        return getString(PROPERTY_PERFORMEDSTRING);
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure
     * was performed.  Allows a period to support complex procedures that
     * span more than one date, and also allows for the length of the
     * procedure to be captured.
     */
    public Age performedAge() {
        return getObject(Age.class, PROPERTY_PERFORMEDAGE);
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure
     * was performed.  Allows a period to support complex procedures that
     * span more than one date, and also allows for the length of the
     * procedure to be captured.
     */
    public Range performedRange() {
        return getObject(Range.class, PROPERTY_PERFORMEDRANGE);
    }

    /**
     * Individual who recorded the record and takes responsibility for its
     * content.
     */
    public Reference recorder() {
        return getObject(Reference.class, PROPERTY_RECORDER);
    }

    /**
     * Individual who is making the procedure statement.
     */
    public Reference asserter() {
        return getObject(Reference.class, PROPERTY_ASSERTER);
    }

    /**
     * Limited to "real" people rather than equipment.
     */
    public java.util.List<ProcedurePerformer> performer() {
        return getList(ProcedurePerformer.class, PROPERTY_PERFORMER);
    }

    /**
     * The location where the procedure actually happened.  E.g. a newborn at
     * home, a tracheostomy at a restaurant.
     */
    public Reference location() {
        return getObject(Reference.class, PROPERTY_LOCATION);
    }

    /**
     * The coded reason why the procedure was performed. This may be a coded
     * entity of some type, or may simply be present as text.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, PROPERTY_REASONCODE);
    }

    /**
     * The justification of why the procedure was performed.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, PROPERTY_REASONREFERENCE);
    }

    /**
     * Detailed and structured anatomical location information. Multiple
     * locations are allowed - e.g. multiple punch biopsies of a lesion.
     */
    public java.util.List<CodeableConcept> bodySite() {
        return getList(CodeableConcept.class, PROPERTY_BODYSITE);
    }

    /**
     * The outcome of the procedure - did it resolve the reasons for the
     * procedure being performed?
     */
    public CodeableConcept outcome() {
        return getObject(CodeableConcept.class, PROPERTY_OUTCOME);
    }

    /**
     * This could be a histology result, pathology report, surgical report,
     * etc.
     */
    public java.util.List<Reference> report() {
        return getList(Reference.class, PROPERTY_REPORT);
    }

    /**
     * Any complications that occurred during the procedure, or in the
     * immediate post-performance period. These are generally tracked
     * separately from the notes, which will typically describe the procedure
     * itself rather than any 'post procedure' issues.
     */
    public java.util.List<CodeableConcept> complication() {
        return getList(CodeableConcept.class, PROPERTY_COMPLICATION);
    }

    /**
     * Any complications that occurred during the procedure, or in the
     * immediate post-performance period.
     */
    public java.util.List<Reference> complicationDetail() {
        return getList(Reference.class, PROPERTY_COMPLICATIONDETAIL);
    }

    /**
     * If the procedure required specific follow up - e.g. removal of
     * sutures. The follow up may be represented as a simple note or could
     * potentially be more complex, in which case the CarePlan resource can
     * be used.
     */
    public java.util.List<CodeableConcept> followUp() {
        return getList(CodeableConcept.class, PROPERTY_FOLLOWUP);
    }

    /**
     * Any other notes and comments about the procedure.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, PROPERTY_NOTE);
    }

    /**
     * A device that is implanted, removed or otherwise manipulated
     * (calibration, battery replacement, fitting a prosthesis, attaching a
     * wound-vac, etc.) as a focal portion of the Procedure.
     */
    public java.util.List<ProcedureFocalDevice> focalDevice() {
        return getList(ProcedureFocalDevice.class, PROPERTY_FOCALDEVICE);
    }

    /**
     * Identifies medications, devices and any other substance used as part
     * of the procedure.
     */
    public java.util.List<Reference> usedReference() {
        return getList(Reference.class, PROPERTY_USEDREFERENCE);
    }

    /**
     * Identifies coded items that were used as part of the procedure.
     */
    public java.util.List<CodeableConcept> usedCode() {
        return getList(CodeableConcept.class, PROPERTY_USEDCODE);
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

        public Builder instantiatesCanonical(final java.util.List<String> instantiatesCanonical) {
            b.add(PROPERTY_INSTANTIATESCANONICAL, FhirObject.toStringArray(instantiatesCanonical));
            return this;
        }

        public Builder instantiatesUri(final java.util.List<String> instantiatesUri) {
            b.add(PROPERTY_INSTANTIATESURI, FhirObject.toStringArray(instantiatesUri));
            return this;
        }

        public Builder basedOn(final java.util.List<Reference> basedOn) {
            b.add(PROPERTY_BASEDON, FhirObject.toArray(basedOn));
            return this;
        }

        public Builder partOf(final java.util.List<Reference> partOf) {
            b.add(PROPERTY_PARTOF, FhirObject.toArray(partOf));
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder statusReason(final CodeableConcept statusReason) {
            b.add(PROPERTY_STATUSREASON, statusReason);
            return this;
        }

        public Builder category(final CodeableConcept category) {
            b.add(PROPERTY_CATEGORY, category);
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

        public Builder performedDateTime(final String performedDateTime) {
            b.add(PROPERTY_PERFORMEDDATETIME, performedDateTime);
            return this;
        }

        public Builder performedPeriod(final Period performedPeriod) {
            b.add(PROPERTY_PERFORMEDPERIOD, performedPeriod);
            return this;
        }

        public Builder performedString(final String performedString) {
            b.add(PROPERTY_PERFORMEDSTRING, performedString);
            return this;
        }

        public Builder performedAge(final Age performedAge) {
            b.add(PROPERTY_PERFORMEDAGE, performedAge);
            return this;
        }

        public Builder performedRange(final Range performedRange) {
            b.add(PROPERTY_PERFORMEDRANGE, performedRange);
            return this;
        }

        public Builder recorder(final Reference recorder) {
            b.add(PROPERTY_RECORDER, recorder);
            return this;
        }

        public Builder asserter(final Reference asserter) {
            b.add(PROPERTY_ASSERTER, asserter);
            return this;
        }

        public Builder performer(final java.util.List<ProcedurePerformer> performer) {
            b.add(PROPERTY_PERFORMER, FhirObject.toArray(performer));
            return this;
        }

        public Builder location(final Reference location) {
            b.add(PROPERTY_LOCATION, location);
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

        public Builder bodySite(final java.util.List<CodeableConcept> bodySite) {
            b.add(PROPERTY_BODYSITE, FhirObject.toArray(bodySite));
            return this;
        }

        public Builder outcome(final CodeableConcept outcome) {
            b.add(PROPERTY_OUTCOME, outcome);
            return this;
        }

        public Builder report(final java.util.List<Reference> report) {
            b.add(PROPERTY_REPORT, FhirObject.toArray(report));
            return this;
        }

        public Builder complication(final java.util.List<CodeableConcept> complication) {
            b.add(PROPERTY_COMPLICATION, FhirObject.toArray(complication));
            return this;
        }

        public Builder complicationDetail(final java.util.List<Reference> complicationDetail) {
            b.add(PROPERTY_COMPLICATIONDETAIL, FhirObject.toArray(complicationDetail));
            return this;
        }

        public Builder followUp(final java.util.List<CodeableConcept> followUp) {
            b.add(PROPERTY_FOLLOWUP, FhirObject.toArray(followUp));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder focalDevice(final java.util.List<ProcedureFocalDevice> focalDevice) {
            b.add(PROPERTY_FOCALDEVICE, FhirObject.toArray(focalDevice));
            return this;
        }

        public Builder usedReference(final java.util.List<Reference> usedReference) {
            b.add(PROPERTY_USEDREFERENCE, FhirObject.toArray(usedReference));
            return this;
        }

        public Builder usedCode(final java.util.List<CodeableConcept> usedCode) {
            b.add(PROPERTY_USEDCODE, FhirObject.toArray(usedCode));
            return this;
        }

        public Procedure build() {
            return new Procedure(b.build());
        }
    }

    public static class ProcedureFocalDevice extends FhirObject {
        public static final String RESOURCE_TYPE = "ProcedureFocalDevice";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_ACTION = "action";
        public static final String PROPERTY_MANIPULATED = "manipulated";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ProcedureFocalDevice(final JsonObject data) {
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
         * The kind of change that happened to the device during the procedure.
         */
        public CodeableConcept action() {
            return getObject(CodeableConcept.class, PROPERTY_ACTION);
        }

        /**
         * The device that was manipulated (changed) during the procedure.
         */
        public Reference manipulated() {
            return getObject(Reference.class, PROPERTY_MANIPULATED);
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

            public Builder action(final CodeableConcept action) {
                b.add(PROPERTY_ACTION, action);
                return this;
            }

            public Builder manipulated(final Reference manipulated) {
                b.add(PROPERTY_MANIPULATED, manipulated);
                return this;
            }

            public ProcedureFocalDevice build() {
                return new ProcedureFocalDevice(b.build());
            }
        }
    }

    public static class ProcedurePerformer extends FhirObject {
        public static final String RESOURCE_TYPE = "ProcedurePerformer";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_FUNCTION = "function";
        public static final String PROPERTY_ACTOR = "actor";
        public static final String PROPERTY_ONBEHALFOF = "onBehalfOf";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ProcedurePerformer(final JsonObject data) {
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
         * Distinguishes the type of involvement of the performer in the
         * procedure. For example, surgeon, anaesthetist, endoscopist.
         */
        public CodeableConcept function() {
            return getObject(CodeableConcept.class, PROPERTY_FUNCTION);
        }

        /**
         * The practitioner who was involved in the procedure.
         */
        public Reference actor() {
            return getObject(Reference.class, PROPERTY_ACTOR);
        }

        /**
         * The organization the device or practitioner was acting on behalf of.
         */
        public Reference onBehalfOf() {
            return getObject(Reference.class, PROPERTY_ONBEHALFOF);
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

            public Builder function(final CodeableConcept function) {
                b.add(PROPERTY_FUNCTION, function);
                return this;
            }

            public Builder actor(final Reference actor) {
                b.add(PROPERTY_ACTOR, actor);
                return this;
            }

            public Builder onBehalfOf(final Reference onBehalfOf) {
                b.add(PROPERTY_ONBEHALFOF, onBehalfOf);
                return this;
            }

            public ProcedurePerformer build() {
                return new ProcedurePerformer(b.build());
            }
        }
    }
}
