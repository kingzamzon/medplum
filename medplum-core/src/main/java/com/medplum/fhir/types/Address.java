/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

public class Address extends FhirResource {
    public static final String RESOURCE_TYPE = "Address";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_USE = "use";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_LINE = "line";
    public static final String PROPERTY_CITY = "city";
    public static final String PROPERTY_DISTRICT = "district";
    public static final String PROPERTY_STATE = "state";
    public static final String PROPERTY_POSTALCODE = "postalCode";
    public static final String PROPERTY_COUNTRY = "country";
    public static final String PROPERTY_PERIOD = "period";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Address(final JsonObject data) {
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
     * The purpose of this address.
     */
    public String use() {
        return getString(PROPERTY_USE);
    }

    /**
     * Distinguishes between physical addresses (those you can visit) and
     * mailing addresses (e.g. PO Boxes and care-of addresses). Most
     * addresses are both.
     */
    public String type() {
        return getString(PROPERTY_TYPE);
    }

    /**
     * Specifies the entire address as it should be displayed e.g. on a
     * postal label. This may be provided instead of or as well as the
     * specific parts.
     */
    public String text() {
        return getString(PROPERTY_TEXT);
    }

    /**
     * This component contains the house number, apartment number, street
     * name, street direction,  P.O. Box number, delivery hints, and similar
     * address information.
     */
    public java.util.List<String> line() {
        return getList(String.class, PROPERTY_LINE);
    }

    /**
     * The name of the city, town, suburb, village or other community or
     * delivery center.
     */
    public String city() {
        return getString(PROPERTY_CITY);
    }

    /**
     * The name of the administrative area (county).
     */
    public String district() {
        return getString(PROPERTY_DISTRICT);
    }

    /**
     * Sub-unit of a country with limited sovereignty in a federally
     * organized country. A code may be used if codes are in common use (e.g.
     * US 2 letter state codes).
     */
    public String state() {
        return getString(PROPERTY_STATE);
    }

    /**
     * A postal code designating a region defined by the postal service.
     */
    public String postalCode() {
        return getString(PROPERTY_POSTALCODE);
    }

    /**
     * Country - a nation as commonly understood or generally accepted.
     */
    public String country() {
        return getString(PROPERTY_COUNTRY);
    }

    /**
     * Time period when address was/is in use.
     */
    public Period period() {
        return getObject(Period.class, PROPERTY_PERIOD);
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

        public Builder use(final String use) {
            b.add(PROPERTY_USE, use);
            return this;
        }

        public Builder type(final String type) {
            b.add(PROPERTY_TYPE, type);
            return this;
        }

        public Builder text(final String text) {
            b.add(PROPERTY_TEXT, text);
            return this;
        }

        public Builder line(final java.util.List<String> line) {
            b.add(PROPERTY_LINE, FhirObject.toStringArray(line));
            return this;
        }

        public Builder city(final String city) {
            b.add(PROPERTY_CITY, city);
            return this;
        }

        public Builder district(final String district) {
            b.add(PROPERTY_DISTRICT, district);
            return this;
        }

        public Builder state(final String state) {
            b.add(PROPERTY_STATE, state);
            return this;
        }

        public Builder postalCode(final String postalCode) {
            b.add(PROPERTY_POSTALCODE, postalCode);
            return this;
        }

        public Builder country(final String country) {
            b.add(PROPERTY_COUNTRY, country);
            return this;
        }

        public Builder period(final Period period) {
            b.add(PROPERTY_PERIOD, period);
            return this;
        }

        public Address build() {
            return new Address(b.build());
        }
    }
}
