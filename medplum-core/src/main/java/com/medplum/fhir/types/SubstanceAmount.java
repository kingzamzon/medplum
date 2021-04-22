/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class SubstanceAmount extends FhirResource {
    public static final String RESOURCE_TYPE = "SubstanceAmount";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
    public static final String PROPERTY_AMOUNTQUANTITY = "amountQuantity";
    public static final String PROPERTY_AMOUNTRANGE = "amountRange";
    public static final String PROPERTY_AMOUNTSTRING = "amountString";
    public static final String PROPERTY_AMOUNTTYPE = "amountType";
    public static final String PROPERTY_AMOUNTTEXT = "amountText";
    public static final String PROPERTY_REFERENCERANGE = "referenceRange";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public SubstanceAmount(final JsonObject data) {
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
     * Used to capture quantitative values for a variety of elements. If only
     * limits are given, the arithmetic mean would be the average. If only a
     * single definite value for a given element is given, it would be
     * captured in this field.
     */
    public Quantity amountQuantity() {
        return getObject(Quantity.class, PROPERTY_AMOUNTQUANTITY);
    }

    /**
     * Used to capture quantitative values for a variety of elements. If only
     * limits are given, the arithmetic mean would be the average. If only a
     * single definite value for a given element is given, it would be
     * captured in this field.
     */
    public Range amountRange() {
        return getObject(Range.class, PROPERTY_AMOUNTRANGE);
    }

    /**
     * Used to capture quantitative values for a variety of elements. If only
     * limits are given, the arithmetic mean would be the average. If only a
     * single definite value for a given element is given, it would be
     * captured in this field.
     */
    public String amountString() {
        return getString(PROPERTY_AMOUNTSTRING);
    }

    /**
     * Most elements that require a quantitative value will also have a field
     * called amount type. Amount type should always be specified because the
     * actual value of the amount is often dependent on it. EXAMPLE: In
     * capturing the actual relative amounts of substances or molecular
     * fragments it is essential to indicate whether the amount refers to a
     * mole ratio or weight ratio. For any given element an effort should be
     * made to use same the amount type for all related definitional
     * elements.
     */
    public CodeableConcept amountType() {
        return getObject(CodeableConcept.class, PROPERTY_AMOUNTTYPE);
    }

    /**
     * A textual comment on a numeric value.
     */
    public String amountText() {
        return getString(PROPERTY_AMOUNTTEXT);
    }

    /**
     * Reference range of possible or expected values.
     */
    public SubstanceAmountReferenceRange referenceRange() {
        return getObject(SubstanceAmountReferenceRange.class, PROPERTY_REFERENCERANGE);
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

        public Builder amountQuantity(final Quantity amountQuantity) {
            b.add(PROPERTY_AMOUNTQUANTITY, amountQuantity);
            return this;
        }

        public Builder amountRange(final Range amountRange) {
            b.add(PROPERTY_AMOUNTRANGE, amountRange);
            return this;
        }

        public Builder amountString(final String amountString) {
            b.add(PROPERTY_AMOUNTSTRING, amountString);
            return this;
        }

        public Builder amountType(final CodeableConcept amountType) {
            b.add(PROPERTY_AMOUNTTYPE, amountType);
            return this;
        }

        public Builder amountText(final String amountText) {
            b.add(PROPERTY_AMOUNTTEXT, amountText);
            return this;
        }

        public Builder referenceRange(final SubstanceAmountReferenceRange referenceRange) {
            b.add(PROPERTY_REFERENCERANGE, referenceRange);
            return this;
        }

        public SubstanceAmount build() {
            return new SubstanceAmount(b.build());
        }
    }

    public static class SubstanceAmountReferenceRange extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceAmountReferenceRange";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_MODIFIEREXTENSION = "modifierExtension";
        public static final String PROPERTY_LOWLIMIT = "lowLimit";
        public static final String PROPERTY_HIGHLIMIT = "highLimit";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceAmountReferenceRange(final JsonObject data) {
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
         * Lower limit possible or expected.
         */
        public Quantity lowLimit() {
            return getObject(Quantity.class, PROPERTY_LOWLIMIT);
        }

        /**
         * Upper limit possible or expected.
         */
        public Quantity highLimit() {
            return getObject(Quantity.class, PROPERTY_HIGHLIMIT);
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

            public Builder lowLimit(final Quantity lowLimit) {
                b.add(PROPERTY_LOWLIMIT, lowLimit);
                return this;
            }

            public Builder highLimit(final Quantity highLimit) {
                b.add(PROPERTY_HIGHLIMIT, highLimit);
                return this;
            }

            public SubstanceAmountReferenceRange build() {
                return new SubstanceAmountReferenceRange(b.build());
            }
        }
    }
}
