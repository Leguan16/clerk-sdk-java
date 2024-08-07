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

public class UpdateOrganizationMembershipRequest {

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

    @SpeakeasyMetadata("request:mediaType=application/json")
    private UpdateOrganizationMembershipRequestBody requestBody;

    @JsonCreator
    public UpdateOrganizationMembershipRequest(
            String organizationId,
            String userId,
            UpdateOrganizationMembershipRequestBody requestBody) {
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(requestBody, "requestBody");
        this.organizationId = organizationId;
        this.userId = userId;
        this.requestBody = requestBody;
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

    @JsonIgnore
    public UpdateOrganizationMembershipRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the organization the membership belongs to
     */
    public UpdateOrganizationMembershipRequest withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    /**
     * The ID of the user that this membership belongs to
     */
    public UpdateOrganizationMembershipRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public UpdateOrganizationMembershipRequest withRequestBody(UpdateOrganizationMembershipRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
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
        UpdateOrganizationMembershipRequest other = (UpdateOrganizationMembershipRequest) o;
        return 
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            organizationId,
            userId,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateOrganizationMembershipRequest.class,
                "organizationId", organizationId,
                "userId", userId,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String organizationId;
 
        private String userId;
 
        private UpdateOrganizationMembershipRequestBody requestBody;  
        
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

        public Builder requestBody(UpdateOrganizationMembershipRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public UpdateOrganizationMembershipRequest build() {
            return new UpdateOrganizationMembershipRequest(
                organizationId,
                userId,
                requestBody);
        }
    }
}

