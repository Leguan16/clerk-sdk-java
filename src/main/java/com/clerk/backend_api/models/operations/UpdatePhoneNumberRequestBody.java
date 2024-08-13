/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;


import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class UpdatePhoneNumberRequestBody {

    /**
     * The phone number will be marked as verified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verified")
    private JsonNullable<Boolean> verified;

    /**
     * Set this phone number as the primary phone number for the user.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primary")
    private JsonNullable<Boolean> primary;

    /**
     * Set this phone number as reserved for multi-factor authentication.
     * The phone number must also be verified.
     * If there are no other reserved second factors, the phone number will be set as the default second factor.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reserved_for_second_factor")
    private JsonNullable<Boolean> reservedForSecondFactor;

    @JsonCreator
    public UpdatePhoneNumberRequestBody(
            @JsonProperty("verified") JsonNullable<Boolean> verified,
            @JsonProperty("primary") JsonNullable<Boolean> primary,
            @JsonProperty("reserved_for_second_factor") JsonNullable<Boolean> reservedForSecondFactor) {
        Utils.checkNotNull(verified, "verified");
        Utils.checkNotNull(primary, "primary");
        Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
        this.verified = verified;
        this.primary = primary;
        this.reservedForSecondFactor = reservedForSecondFactor;
    }
    
    public UpdatePhoneNumberRequestBody() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The phone number will be marked as verified.
     */
    @JsonIgnore
    public JsonNullable<Boolean> verified() {
        return verified;
    }

    /**
     * Set this phone number as the primary phone number for the user.
     */
    @JsonIgnore
    public JsonNullable<Boolean> primary() {
        return primary;
    }

    /**
     * Set this phone number as reserved for multi-factor authentication.
     * The phone number must also be verified.
     * If there are no other reserved second factors, the phone number will be set as the default second factor.
     */
    @JsonIgnore
    public JsonNullable<Boolean> reservedForSecondFactor() {
        return reservedForSecondFactor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The phone number will be marked as verified.
     */
    public UpdatePhoneNumberRequestBody withVerified(boolean verified) {
        Utils.checkNotNull(verified, "verified");
        this.verified = JsonNullable.of(verified);
        return this;
    }

    /**
     * The phone number will be marked as verified.
     */
    public UpdatePhoneNumberRequestBody withVerified(JsonNullable<Boolean> verified) {
        Utils.checkNotNull(verified, "verified");
        this.verified = verified;
        return this;
    }

    /**
     * Set this phone number as the primary phone number for the user.
     */
    public UpdatePhoneNumberRequestBody withPrimary(boolean primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = JsonNullable.of(primary);
        return this;
    }

    /**
     * Set this phone number as the primary phone number for the user.
     */
    public UpdatePhoneNumberRequestBody withPrimary(JsonNullable<Boolean> primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = primary;
        return this;
    }

    /**
     * Set this phone number as reserved for multi-factor authentication.
     * The phone number must also be verified.
     * If there are no other reserved second factors, the phone number will be set as the default second factor.
     */
    public UpdatePhoneNumberRequestBody withReservedForSecondFactor(boolean reservedForSecondFactor) {
        Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
        this.reservedForSecondFactor = JsonNullable.of(reservedForSecondFactor);
        return this;
    }

    /**
     * Set this phone number as reserved for multi-factor authentication.
     * The phone number must also be verified.
     * If there are no other reserved second factors, the phone number will be set as the default second factor.
     */
    public UpdatePhoneNumberRequestBody withReservedForSecondFactor(JsonNullable<Boolean> reservedForSecondFactor) {
        Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
        this.reservedForSecondFactor = reservedForSecondFactor;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePhoneNumberRequestBody other = (UpdatePhoneNumberRequestBody) o;
        return 
            Objects.deepEquals(this.verified, other.verified) &&
            Objects.deepEquals(this.primary, other.primary) &&
            Objects.deepEquals(this.reservedForSecondFactor, other.reservedForSecondFactor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            verified,
            primary,
            reservedForSecondFactor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdatePhoneNumberRequestBody.class,
                "verified", verified,
                "primary", primary,
                "reservedForSecondFactor", reservedForSecondFactor);
    }
    
    public final static class Builder {
 
        private JsonNullable<Boolean> verified = JsonNullable.undefined();
 
        private JsonNullable<Boolean> primary = JsonNullable.undefined();
 
        private JsonNullable<Boolean> reservedForSecondFactor = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The phone number will be marked as verified.
         */
        public Builder verified(boolean verified) {
            Utils.checkNotNull(verified, "verified");
            this.verified = JsonNullable.of(verified);
            return this;
        }

        /**
         * The phone number will be marked as verified.
         */
        public Builder verified(JsonNullable<Boolean> verified) {
            Utils.checkNotNull(verified, "verified");
            this.verified = verified;
            return this;
        }

        /**
         * Set this phone number as the primary phone number for the user.
         */
        public Builder primary(boolean primary) {
            Utils.checkNotNull(primary, "primary");
            this.primary = JsonNullable.of(primary);
            return this;
        }

        /**
         * Set this phone number as the primary phone number for the user.
         */
        public Builder primary(JsonNullable<Boolean> primary) {
            Utils.checkNotNull(primary, "primary");
            this.primary = primary;
            return this;
        }

        /**
         * Set this phone number as reserved for multi-factor authentication.
         * The phone number must also be verified.
         * If there are no other reserved second factors, the phone number will be set as the default second factor.
         */
        public Builder reservedForSecondFactor(boolean reservedForSecondFactor) {
            Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
            this.reservedForSecondFactor = JsonNullable.of(reservedForSecondFactor);
            return this;
        }

        /**
         * Set this phone number as reserved for multi-factor authentication.
         * The phone number must also be verified.
         * If there are no other reserved second factors, the phone number will be set as the default second factor.
         */
        public Builder reservedForSecondFactor(JsonNullable<Boolean> reservedForSecondFactor) {
            Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
            this.reservedForSecondFactor = reservedForSecondFactor;
            return this;
        }
        
        public UpdatePhoneNumberRequestBody build() {
            return new UpdatePhoneNumberRequestBody(
                verified,
                primary,
                reservedForSecondFactor);
        }
    }
}

