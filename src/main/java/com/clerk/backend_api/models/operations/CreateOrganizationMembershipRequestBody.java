/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class CreateOrganizationMembershipRequestBody {

    /**
     * The ID of the user that will be added as a member in the organization.
     * The user needs to exist in the same instance as the organization and must not be a member of the given organization already.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * The role that the new member will have in the organization.
     */
    @JsonProperty("role")
    private String role;

    @JsonCreator
    public CreateOrganizationMembershipRequestBody(
            @JsonProperty("user_id") String userId,
            @JsonProperty("role") String role) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(role, "role");
        this.userId = userId;
        this.role = role;
    }

    /**
     * The ID of the user that will be added as a member in the organization.
     * The user needs to exist in the same instance as the organization and must not be a member of the given organization already.
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    /**
     * The role that the new member will have in the organization.
     */
    @JsonIgnore
    public String role() {
        return role;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the user that will be added as a member in the organization.
     * The user needs to exist in the same instance as the organization and must not be a member of the given organization already.
     */
    public CreateOrganizationMembershipRequestBody withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * The role that the new member will have in the organization.
     */
    public CreateOrganizationMembershipRequestBody withRole(String role) {
        Utils.checkNotNull(role, "role");
        this.role = role;
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
        CreateOrganizationMembershipRequestBody other = (CreateOrganizationMembershipRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.role, other.role);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId,
            role);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateOrganizationMembershipRequestBody.class,
                "userId", userId,
                "role", role);
    }
    
    public final static class Builder {
 
        private String userId;
 
        private String role;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the user that will be added as a member in the organization.
         * The user needs to exist in the same instance as the organization and must not be a member of the given organization already.
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * The role that the new member will have in the organization.
         */
        public Builder role(String role) {
            Utils.checkNotNull(role, "role");
            this.role = role;
            return this;
        }
        
        public CreateOrganizationMembershipRequestBody build() {
            return new CreateOrganizationMembershipRequestBody(
                userId,
                role);
        }
    }
}
