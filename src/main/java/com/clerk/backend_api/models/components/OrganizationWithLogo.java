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

public class OrganizationWithLogo {

    @JsonProperty("object")
    private OrganizationWithLogoObject object;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("slug")
    private String slug;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("members_count")
    private JsonNullable<? extends Long> membersCount;

    @JsonProperty("max_allowed_memberships")
    private long maxAllowedMemberships;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("admin_delete_enabled")
    private Optional<? extends Boolean> adminDeleteEnabled;

    @JsonProperty("public_metadata")
    private OrganizationWithLogoPublicMetadata publicMetadata;

    @JsonProperty("private_metadata")
    private OrganizationWithLogoPrivateMetadata privateMetadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    private Optional<? extends String> createdBy;

    /**
     * Unix timestamp of creation.
     * 
     */
    @JsonProperty("created_at")
    private long createdAt;

    /**
     * Unix timestamp of last update.
     * 
     */
    @JsonProperty("updated_at")
    private long updatedAt;

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logo_url")
    @Deprecated
    private Optional<? extends String> logoUrl;

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_image")
    private Optional<? extends Boolean> hasImage;

    @JsonCreator
    public OrganizationWithLogo(
            @JsonProperty("object") OrganizationWithLogoObject object,
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("slug") String slug,
            @JsonProperty("members_count") JsonNullable<? extends Long> membersCount,
            @JsonProperty("max_allowed_memberships") long maxAllowedMemberships,
            @JsonProperty("admin_delete_enabled") Optional<? extends Boolean> adminDeleteEnabled,
            @JsonProperty("public_metadata") OrganizationWithLogoPublicMetadata publicMetadata,
            @JsonProperty("private_metadata") OrganizationWithLogoPrivateMetadata privateMetadata,
            @JsonProperty("created_by") Optional<? extends String> createdBy,
            @JsonProperty("created_at") long createdAt,
            @JsonProperty("updated_at") long updatedAt,
            @JsonProperty("logo_url") Optional<? extends String> logoUrl,
            @JsonProperty("image_url") String imageUrl,
            @JsonProperty("has_image") Optional<? extends Boolean> hasImage) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(slug, "slug");
        Utils.checkNotNull(membersCount, "membersCount");
        Utils.checkNotNull(maxAllowedMemberships, "maxAllowedMemberships");
        Utils.checkNotNull(adminDeleteEnabled, "adminDeleteEnabled");
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        Utils.checkNotNull(privateMetadata, "privateMetadata");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(logoUrl, "logoUrl");
        Utils.checkNotNull(imageUrl, "imageUrl");
        Utils.checkNotNull(hasImage, "hasImage");
        this.object = object;
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.membersCount = membersCount;
        this.maxAllowedMemberships = maxAllowedMemberships;
        this.adminDeleteEnabled = adminDeleteEnabled;
        this.publicMetadata = publicMetadata;
        this.privateMetadata = privateMetadata;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.logoUrl = logoUrl;
        this.imageUrl = imageUrl;
        this.hasImage = hasImage;
    }
    
    public OrganizationWithLogo(
            OrganizationWithLogoObject object,
            String id,
            String name,
            String slug,
            long maxAllowedMemberships,
            OrganizationWithLogoPublicMetadata publicMetadata,
            OrganizationWithLogoPrivateMetadata privateMetadata,
            long createdAt,
            long updatedAt,
            String imageUrl) {
        this(object, id, name, slug, JsonNullable.undefined(), maxAllowedMemberships, Optional.empty(), publicMetadata, privateMetadata, Optional.empty(), createdAt, updatedAt, Optional.empty(), imageUrl, Optional.empty());
    }

    @JsonIgnore
    public OrganizationWithLogoObject object() {
        return object;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String slug() {
        return slug;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Long> membersCount() {
        return (JsonNullable<Long>) membersCount;
    }

    @JsonIgnore
    public long maxAllowedMemberships() {
        return maxAllowedMemberships;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> adminDeleteEnabled() {
        return (Optional<Boolean>) adminDeleteEnabled;
    }

    @JsonIgnore
    public OrganizationWithLogoPublicMetadata publicMetadata() {
        return publicMetadata;
    }

    @JsonIgnore
    public OrganizationWithLogoPrivateMetadata privateMetadata() {
        return privateMetadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> createdBy() {
        return (Optional<String>) createdBy;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    @JsonIgnore
    public long createdAt() {
        return createdAt;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    @JsonIgnore
    public long updatedAt() {
        return updatedAt;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> logoUrl() {
        return (Optional<String>) logoUrl;
    }

    @JsonIgnore
    public String imageUrl() {
        return imageUrl;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> hasImage() {
        return (Optional<Boolean>) hasImage;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrganizationWithLogo withObject(OrganizationWithLogoObject object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public OrganizationWithLogo withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public OrganizationWithLogo withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public OrganizationWithLogo withSlug(String slug) {
        Utils.checkNotNull(slug, "slug");
        this.slug = slug;
        return this;
    }

    public OrganizationWithLogo withMembersCount(long membersCount) {
        Utils.checkNotNull(membersCount, "membersCount");
        this.membersCount = JsonNullable.of(membersCount);
        return this;
    }

    public OrganizationWithLogo withMembersCount(JsonNullable<? extends Long> membersCount) {
        Utils.checkNotNull(membersCount, "membersCount");
        this.membersCount = membersCount;
        return this;
    }

    public OrganizationWithLogo withMaxAllowedMemberships(long maxAllowedMemberships) {
        Utils.checkNotNull(maxAllowedMemberships, "maxAllowedMemberships");
        this.maxAllowedMemberships = maxAllowedMemberships;
        return this;
    }

    public OrganizationWithLogo withAdminDeleteEnabled(boolean adminDeleteEnabled) {
        Utils.checkNotNull(adminDeleteEnabled, "adminDeleteEnabled");
        this.adminDeleteEnabled = Optional.ofNullable(adminDeleteEnabled);
        return this;
    }

    public OrganizationWithLogo withAdminDeleteEnabled(Optional<? extends Boolean> adminDeleteEnabled) {
        Utils.checkNotNull(adminDeleteEnabled, "adminDeleteEnabled");
        this.adminDeleteEnabled = adminDeleteEnabled;
        return this;
    }

    public OrganizationWithLogo withPublicMetadata(OrganizationWithLogoPublicMetadata publicMetadata) {
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        this.publicMetadata = publicMetadata;
        return this;
    }

    public OrganizationWithLogo withPrivateMetadata(OrganizationWithLogoPrivateMetadata privateMetadata) {
        Utils.checkNotNull(privateMetadata, "privateMetadata");
        this.privateMetadata = privateMetadata;
        return this;
    }

    public OrganizationWithLogo withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = Optional.ofNullable(createdBy);
        return this;
    }

    public OrganizationWithLogo withCreatedBy(Optional<? extends String> createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    public OrganizationWithLogo withCreatedAt(long createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    public OrganizationWithLogo withUpdatedAt(long updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public OrganizationWithLogo withLogoUrl(String logoUrl) {
        Utils.checkNotNull(logoUrl, "logoUrl");
        this.logoUrl = Optional.ofNullable(logoUrl);
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public OrganizationWithLogo withLogoUrl(Optional<? extends String> logoUrl) {
        Utils.checkNotNull(logoUrl, "logoUrl");
        this.logoUrl = logoUrl;
        return this;
    }

    public OrganizationWithLogo withImageUrl(String imageUrl) {
        Utils.checkNotNull(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        return this;
    }

    public OrganizationWithLogo withHasImage(boolean hasImage) {
        Utils.checkNotNull(hasImage, "hasImage");
        this.hasImage = Optional.ofNullable(hasImage);
        return this;
    }

    public OrganizationWithLogo withHasImage(Optional<? extends Boolean> hasImage) {
        Utils.checkNotNull(hasImage, "hasImage");
        this.hasImage = hasImage;
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
        OrganizationWithLogo other = (OrganizationWithLogo) o;
        return 
            java.util.Objects.deepEquals(this.object, other.object) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.slug, other.slug) &&
            java.util.Objects.deepEquals(this.membersCount, other.membersCount) &&
            java.util.Objects.deepEquals(this.maxAllowedMemberships, other.maxAllowedMemberships) &&
            java.util.Objects.deepEquals(this.adminDeleteEnabled, other.adminDeleteEnabled) &&
            java.util.Objects.deepEquals(this.publicMetadata, other.publicMetadata) &&
            java.util.Objects.deepEquals(this.privateMetadata, other.privateMetadata) &&
            java.util.Objects.deepEquals(this.createdBy, other.createdBy) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            java.util.Objects.deepEquals(this.logoUrl, other.logoUrl) &&
            java.util.Objects.deepEquals(this.imageUrl, other.imageUrl) &&
            java.util.Objects.deepEquals(this.hasImage, other.hasImage);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            object,
            id,
            name,
            slug,
            membersCount,
            maxAllowedMemberships,
            adminDeleteEnabled,
            publicMetadata,
            privateMetadata,
            createdBy,
            createdAt,
            updatedAt,
            logoUrl,
            imageUrl,
            hasImage);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrganizationWithLogo.class,
                "object", object,
                "id", id,
                "name", name,
                "slug", slug,
                "membersCount", membersCount,
                "maxAllowedMemberships", maxAllowedMemberships,
                "adminDeleteEnabled", adminDeleteEnabled,
                "publicMetadata", publicMetadata,
                "privateMetadata", privateMetadata,
                "createdBy", createdBy,
                "createdAt", createdAt,
                "updatedAt", updatedAt,
                "logoUrl", logoUrl,
                "imageUrl", imageUrl,
                "hasImage", hasImage);
    }
    
    public final static class Builder {
 
        private OrganizationWithLogoObject object;
 
        private String id;
 
        private String name;
 
        private String slug;
 
        private JsonNullable<? extends Long> membersCount = JsonNullable.undefined();
 
        private Long maxAllowedMemberships;
 
        private Optional<? extends Boolean> adminDeleteEnabled = Optional.empty();
 
        private OrganizationWithLogoPublicMetadata publicMetadata;
 
        private OrganizationWithLogoPrivateMetadata privateMetadata;
 
        private Optional<? extends String> createdBy = Optional.empty();
 
        private Long createdAt;
 
        private Long updatedAt;
 
        @Deprecated
        private Optional<? extends String> logoUrl = Optional.empty();
 
        private String imageUrl;
 
        private Optional<? extends Boolean> hasImage = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder object(OrganizationWithLogoObject object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder slug(String slug) {
            Utils.checkNotNull(slug, "slug");
            this.slug = slug;
            return this;
        }

        public Builder membersCount(long membersCount) {
            Utils.checkNotNull(membersCount, "membersCount");
            this.membersCount = JsonNullable.of(membersCount);
            return this;
        }

        public Builder membersCount(JsonNullable<? extends Long> membersCount) {
            Utils.checkNotNull(membersCount, "membersCount");
            this.membersCount = membersCount;
            return this;
        }

        public Builder maxAllowedMemberships(long maxAllowedMemberships) {
            Utils.checkNotNull(maxAllowedMemberships, "maxAllowedMemberships");
            this.maxAllowedMemberships = maxAllowedMemberships;
            return this;
        }

        public Builder adminDeleteEnabled(boolean adminDeleteEnabled) {
            Utils.checkNotNull(adminDeleteEnabled, "adminDeleteEnabled");
            this.adminDeleteEnabled = Optional.ofNullable(adminDeleteEnabled);
            return this;
        }

        public Builder adminDeleteEnabled(Optional<? extends Boolean> adminDeleteEnabled) {
            Utils.checkNotNull(adminDeleteEnabled, "adminDeleteEnabled");
            this.adminDeleteEnabled = adminDeleteEnabled;
            return this;
        }

        public Builder publicMetadata(OrganizationWithLogoPublicMetadata publicMetadata) {
            Utils.checkNotNull(publicMetadata, "publicMetadata");
            this.publicMetadata = publicMetadata;
            return this;
        }

        public Builder privateMetadata(OrganizationWithLogoPrivateMetadata privateMetadata) {
            Utils.checkNotNull(privateMetadata, "privateMetadata");
            this.privateMetadata = privateMetadata;
            return this;
        }

        public Builder createdBy(String createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = Optional.ofNullable(createdBy);
            return this;
        }

        public Builder createdBy(Optional<? extends String> createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = createdBy;
            return this;
        }

        /**
         * Unix timestamp of creation.
         * 
         */
        public Builder createdAt(long createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Unix timestamp of last update.
         * 
         */
        public Builder updatedAt(long updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder logoUrl(String logoUrl) {
            Utils.checkNotNull(logoUrl, "logoUrl");
            this.logoUrl = Optional.ofNullable(logoUrl);
            return this;
        }

        /**
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder logoUrl(Optional<? extends String> logoUrl) {
            Utils.checkNotNull(logoUrl, "logoUrl");
            this.logoUrl = logoUrl;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
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
        
        public OrganizationWithLogo build() {
            return new OrganizationWithLogo(
                object,
                id,
                name,
                slug,
                membersCount,
                maxAllowedMemberships,
                adminDeleteEnabled,
                publicMetadata,
                privateMetadata,
                createdBy,
                createdAt,
                updatedAt,
                logoUrl,
                imageUrl,
                hasImage);
        }
    }
}

