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
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateEmailAddressRequestBody {

    /**
     * The ID representing the user
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<String> userId;

    /**
     * The new email address. Must adhere to the RFC 5322 specification for email address format.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email_address")
    private Optional<String> emailAddress;

    /**
     * When created, the email address will be marked as verified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verified")
    private JsonNullable<Boolean> verified;

    /**
     * Create this email address as the primary email address for the user.
     * Default: false, unless it is the first email address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primary")
    private JsonNullable<Boolean> primary;

    @JsonCreator
    public CreateEmailAddressRequestBody(
            @JsonProperty("user_id") Optional<String> userId,
            @JsonProperty("email_address") Optional<String> emailAddress,
            @JsonProperty("verified") JsonNullable<Boolean> verified,
            @JsonProperty("primary") JsonNullable<Boolean> primary) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(emailAddress, "emailAddress");
        Utils.checkNotNull(verified, "verified");
        Utils.checkNotNull(primary, "primary");
        this.userId = userId;
        this.emailAddress = emailAddress;
        this.verified = verified;
        this.primary = primary;
    }
    
    public CreateEmailAddressRequestBody() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The ID representing the user
     */
    @JsonIgnore
    public Optional<String> userId() {
        return userId;
    }

    /**
     * The new email address. Must adhere to the RFC 5322 specification for email address format.
     */
    @JsonIgnore
    public Optional<String> emailAddress() {
        return emailAddress;
    }

    /**
     * When created, the email address will be marked as verified.
     */
    @JsonIgnore
    public JsonNullable<Boolean> verified() {
        return verified;
    }

    /**
     * Create this email address as the primary email address for the user.
     * Default: false, unless it is the first email address.
     */
    @JsonIgnore
    public JsonNullable<Boolean> primary() {
        return primary;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID representing the user
     */
    public CreateEmailAddressRequestBody withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    /**
     * The ID representing the user
     */
    public CreateEmailAddressRequestBody withUserId(Optional<String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * The new email address. Must adhere to the RFC 5322 specification for email address format.
     */
    public CreateEmailAddressRequestBody withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = Optional.ofNullable(emailAddress);
        return this;
    }

    /**
     * The new email address. Must adhere to the RFC 5322 specification for email address format.
     */
    public CreateEmailAddressRequestBody withEmailAddress(Optional<String> emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * When created, the email address will be marked as verified.
     */
    public CreateEmailAddressRequestBody withVerified(boolean verified) {
        Utils.checkNotNull(verified, "verified");
        this.verified = JsonNullable.of(verified);
        return this;
    }

    /**
     * When created, the email address will be marked as verified.
     */
    public CreateEmailAddressRequestBody withVerified(JsonNullable<Boolean> verified) {
        Utils.checkNotNull(verified, "verified");
        this.verified = verified;
        return this;
    }

    /**
     * Create this email address as the primary email address for the user.
     * Default: false, unless it is the first email address.
     */
    public CreateEmailAddressRequestBody withPrimary(boolean primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = JsonNullable.of(primary);
        return this;
    }

    /**
     * Create this email address as the primary email address for the user.
     * Default: false, unless it is the first email address.
     */
    public CreateEmailAddressRequestBody withPrimary(JsonNullable<Boolean> primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = primary;
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
        CreateEmailAddressRequestBody other = (CreateEmailAddressRequestBody) o;
        return 
            Objects.deepEquals(this.userId, other.userId) &&
            Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            Objects.deepEquals(this.verified, other.verified) &&
            Objects.deepEquals(this.primary, other.primary);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            userId,
            emailAddress,
            verified,
            primary);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateEmailAddressRequestBody.class,
                "userId", userId,
                "emailAddress", emailAddress,
                "verified", verified,
                "primary", primary);
    }
    
    public final static class Builder {
 
        private Optional<String> userId = Optional.empty();
 
        private Optional<String> emailAddress = Optional.empty();
 
        private JsonNullable<Boolean> verified = JsonNullable.undefined();
 
        private JsonNullable<Boolean> primary = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID representing the user
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        /**
         * The ID representing the user
         */
        public Builder userId(Optional<String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * The new email address. Must adhere to the RFC 5322 specification for email address format.
         */
        public Builder emailAddress(String emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = Optional.ofNullable(emailAddress);
            return this;
        }

        /**
         * The new email address. Must adhere to the RFC 5322 specification for email address format.
         */
        public Builder emailAddress(Optional<String> emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * When created, the email address will be marked as verified.
         */
        public Builder verified(boolean verified) {
            Utils.checkNotNull(verified, "verified");
            this.verified = JsonNullable.of(verified);
            return this;
        }

        /**
         * When created, the email address will be marked as verified.
         */
        public Builder verified(JsonNullable<Boolean> verified) {
            Utils.checkNotNull(verified, "verified");
            this.verified = verified;
            return this;
        }

        /**
         * Create this email address as the primary email address for the user.
         * Default: false, unless it is the first email address.
         */
        public Builder primary(boolean primary) {
            Utils.checkNotNull(primary, "primary");
            this.primary = JsonNullable.of(primary);
            return this;
        }

        /**
         * Create this email address as the primary email address for the user.
         * Default: false, unless it is the first email address.
         */
        public Builder primary(JsonNullable<Boolean> primary) {
            Utils.checkNotNull(primary, "primary");
            this.primary = primary;
            return this;
        }
        
        public CreateEmailAddressRequestBody build() {
            return new CreateEmailAddressRequestBody(
                userId,
                emailAddress,
                verified,
                primary);
        }
    }
}

