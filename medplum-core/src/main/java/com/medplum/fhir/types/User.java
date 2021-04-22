/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.JsonObject;

public class User extends FhirResource {
    public static final String RESOURCE_TYPE = "User";
    public static final String PROPERTY_RESOURCETYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_EMAIL = "email";
    public static final String PROPERTY_PASSWORDHASH = "passwordHash";
    public static final String PROPERTY_PATIENT = "patient";
    public static final String PROPERTY_PRACTITIONER = "practitioner";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public User(final JsonObject data) {
        super(data);
    }

    /**
     * User email.
     */
    public String email() {
        return getString(PROPERTY_EMAIL);
    }

    /**
     * Encrypted hash of the user's password.
     */
    public String passwordHash() {
        return getString(PROPERTY_PASSWORDHASH);
    }

    /**
     * Optional reference to the user's patient identity.
     */
    public Reference patient() {
        return getObject(Reference.class, PROPERTY_PATIENT);
    }

    /**
     * Optional reference to the user's practitioner identity.
     */
    public Reference practitioner() {
        return getObject(Reference.class, PROPERTY_PRACTITIONER);
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

        public Builder email(final String email) {
            b.add(PROPERTY_EMAIL, email);
            return this;
        }

        public Builder passwordHash(final String passwordHash) {
            b.add(PROPERTY_PASSWORDHASH, passwordHash);
            return this;
        }

        public Builder patient(final Reference patient) {
            b.add(PROPERTY_PATIENT, patient);
            return this;
        }

        public Builder practitioner(final Reference practitioner) {
            b.add(PROPERTY_PRACTITIONER, practitioner);
            return this;
        }

        public User build() {
            return new User(b.build());
        }
    }
}
