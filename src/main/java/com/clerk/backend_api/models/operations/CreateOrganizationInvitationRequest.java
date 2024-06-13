/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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

public class CreateOrganizationInvitationRequest {

    /**
     * The ID of the organization for which to send the invitation
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organization_id")
    private String organizationId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateOrganizationInvitationRequestBody requestBody;

    @JsonCreator
    public CreateOrganizationInvitationRequest(
            String organizationId,
            CreateOrganizationInvitationRequestBody requestBody) {
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(requestBody, "requestBody");
        this.organizationId = organizationId;
        this.requestBody = requestBody;
    }

    /**
     * The ID of the organization for which to send the invitation
     */
    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    @JsonIgnore
    public CreateOrganizationInvitationRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the organization for which to send the invitation
     */
    public CreateOrganizationInvitationRequest withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public CreateOrganizationInvitationRequest withRequestBody(CreateOrganizationInvitationRequestBody requestBody) {
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
        CreateOrganizationInvitationRequest other = (CreateOrganizationInvitationRequest) o;
        return 
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            organizationId,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateOrganizationInvitationRequest.class,
                "organizationId", organizationId,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String organizationId;
 
        private CreateOrganizationInvitationRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the organization for which to send the invitation
         */
        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        public Builder requestBody(CreateOrganizationInvitationRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public CreateOrganizationInvitationRequest build() {
            return new CreateOrganizationInvitationRequest(
                organizationId,
                requestBody);
        }
    }
}
