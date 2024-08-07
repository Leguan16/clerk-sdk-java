/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.SpeakeasyMetadata;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class DeleteOrganizationMembershipRequest {

    /**
     * The ID of the organization the membership belongs to
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organization_id")
    private String organizationId;

    /**
     * The ID of the user that this membership belongs to
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    private String userId;

    @JsonCreator
    public DeleteOrganizationMembershipRequest(
            String organizationId,
            String userId) {
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(userId, "userId");
        this.organizationId = organizationId;
        this.userId = userId;
    }

    /**
     * The ID of the organization the membership belongs to
     */
    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    /**
     * The ID of the user that this membership belongs to
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the organization the membership belongs to
     */
    public DeleteOrganizationMembershipRequest withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    /**
     * The ID of the user that this membership belongs to
     */
    public DeleteOrganizationMembershipRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
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
        DeleteOrganizationMembershipRequest other = (DeleteOrganizationMembershipRequest) o;
        return 
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            organizationId,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteOrganizationMembershipRequest.class,
                "organizationId", organizationId,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private String organizationId;
 
        private String userId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the organization the membership belongs to
         */
        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        /**
         * The ID of the user that this membership belongs to
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public DeleteOrganizationMembershipRequest build() {
            return new DeleteOrganizationMembershipRequest(
                organizationId,
                userId);
        }
    }
}

