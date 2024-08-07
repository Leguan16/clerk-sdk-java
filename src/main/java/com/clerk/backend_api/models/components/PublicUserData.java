/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;

import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class PublicUserData {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_id")
    private Optional<? extends String> userId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private JsonNullable<? extends String> firstName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private JsonNullable<? extends String> lastName;

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile_image_url")
    @Deprecated
    private JsonNullable<? extends String> profileImageUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_url")
    private Optional<? extends String> imageUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_image")
    private Optional<? extends Boolean> hasImage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    private JsonNullable<? extends String> identifier;

    @JsonCreator
    public PublicUserData(
            @JsonProperty("user_id") Optional<? extends String> userId,
            @JsonProperty("first_name") JsonNullable<? extends String> firstName,
            @JsonProperty("last_name") JsonNullable<? extends String> lastName,
            @JsonProperty("profile_image_url") JsonNullable<? extends String> profileImageUrl,
            @JsonProperty("image_url") Optional<? extends String> imageUrl,
            @JsonProperty("has_image") Optional<? extends Boolean> hasImage,
            @JsonProperty("identifier") JsonNullable<? extends String> identifier) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(profileImageUrl, "profileImageUrl");
        Utils.checkNotNull(imageUrl, "imageUrl");
        Utils.checkNotNull(hasImage, "hasImage");
        Utils.checkNotNull(identifier, "identifier");
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profileImageUrl = profileImageUrl;
        this.imageUrl = imageUrl;
        this.hasImage = hasImage;
        this.identifier = identifier;
    }
    
    public PublicUserData() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> userId() {
        return (Optional<String>) userId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<String> firstName() {
        return (JsonNullable<String>) firstName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<String> lastName() {
        return (JsonNullable<String>) lastName;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<String> profileImageUrl() {
        return (JsonNullable<String>) profileImageUrl;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> imageUrl() {
        return (Optional<String>) imageUrl;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> hasImage() {
        return (Optional<Boolean>) hasImage;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<String> identifier() {
        return (JsonNullable<String>) identifier;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PublicUserData withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public PublicUserData withUserId(Optional<? extends String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public PublicUserData withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = JsonNullable.of(firstName);
        return this;
    }

    public PublicUserData withFirstName(JsonNullable<? extends String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public PublicUserData withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = JsonNullable.of(lastName);
        return this;
    }

    public PublicUserData withLastName(JsonNullable<? extends String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public PublicUserData withProfileImageUrl(String profileImageUrl) {
        Utils.checkNotNull(profileImageUrl, "profileImageUrl");
        this.profileImageUrl = JsonNullable.of(profileImageUrl);
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public PublicUserData withProfileImageUrl(JsonNullable<? extends String> profileImageUrl) {
        Utils.checkNotNull(profileImageUrl, "profileImageUrl");
        this.profileImageUrl = profileImageUrl;
        return this;
    }

    public PublicUserData withImageUrl(String imageUrl) {
        Utils.checkNotNull(imageUrl, "imageUrl");
        this.imageUrl = Optional.ofNullable(imageUrl);
        return this;
    }

    public PublicUserData withImageUrl(Optional<? extends String> imageUrl) {
        Utils.checkNotNull(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        return this;
    }

    public PublicUserData withHasImage(boolean hasImage) {
        Utils.checkNotNull(hasImage, "hasImage");
        this.hasImage = Optional.ofNullable(hasImage);
        return this;
    }

    public PublicUserData withHasImage(Optional<? extends Boolean> hasImage) {
        Utils.checkNotNull(hasImage, "hasImage");
        this.hasImage = hasImage;
        return this;
    }

    public PublicUserData withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = JsonNullable.of(identifier);
        return this;
    }

    public PublicUserData withIdentifier(JsonNullable<? extends String> identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
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
        PublicUserData other = (PublicUserData) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.firstName, other.firstName) &&
            java.util.Objects.deepEquals(this.lastName, other.lastName) &&
            java.util.Objects.deepEquals(this.profileImageUrl, other.profileImageUrl) &&
            java.util.Objects.deepEquals(this.imageUrl, other.imageUrl) &&
            java.util.Objects.deepEquals(this.hasImage, other.hasImage) &&
            java.util.Objects.deepEquals(this.identifier, other.identifier);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId,
            firstName,
            lastName,
            profileImageUrl,
            imageUrl,
            hasImage,
            identifier);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PublicUserData.class,
                "userId", userId,
                "firstName", firstName,
                "lastName", lastName,
                "profileImageUrl", profileImageUrl,
                "imageUrl", imageUrl,
                "hasImage", hasImage,
                "identifier", identifier);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> userId = Optional.empty();
 
        private JsonNullable<? extends String> firstName = JsonNullable.undefined();
 
        private JsonNullable<? extends String> lastName = JsonNullable.undefined();
 
        @Deprecated
        private JsonNullable<? extends String> profileImageUrl = JsonNullable.undefined();
 
        private Optional<? extends String> imageUrl = Optional.empty();
 
        private Optional<? extends Boolean> hasImage = Optional.empty();
 
        private JsonNullable<? extends String> identifier = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        public Builder userId(Optional<? extends String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = JsonNullable.of(firstName);
            return this;
        }

        public Builder firstName(JsonNullable<? extends String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = JsonNullable.of(lastName);
            return this;
        }

        public Builder lastName(JsonNullable<? extends String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        /**
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder profileImageUrl(String profileImageUrl) {
            Utils.checkNotNull(profileImageUrl, "profileImageUrl");
            this.profileImageUrl = JsonNullable.of(profileImageUrl);
            return this;
        }

        /**
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder profileImageUrl(JsonNullable<? extends String> profileImageUrl) {
            Utils.checkNotNull(profileImageUrl, "profileImageUrl");
            this.profileImageUrl = profileImageUrl;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            Utils.checkNotNull(imageUrl, "imageUrl");
            this.imageUrl = Optional.ofNullable(imageUrl);
            return this;
        }

        public Builder imageUrl(Optional<? extends String> imageUrl) {
            Utils.checkNotNull(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder hasImage(boolean hasImage) {
            Utils.checkNotNull(hasImage, "hasImage");
            this.hasImage = Optional.ofNullable(hasImage);
            return this;
        }

        public Builder hasImage(Optional<? extends Boolean> hasImage) {
            Utils.checkNotNull(hasImage, "hasImage");
            this.hasImage = hasImage;
            return this;
        }

        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = JsonNullable.of(identifier);
            return this;
        }

        public Builder identifier(JsonNullable<? extends String> identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }
        
        public PublicUserData build() {
            return new PublicUserData(
                userId,
                firstName,
                lastName,
                profileImageUrl,
                imageUrl,
                hasImage,
                identifier);
        }
    }
}

