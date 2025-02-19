/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;


import com.clerk.backend_api.utils.SpeakeasyMetadata;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CreateUserTOTPRequest {

    /**
     * The ID of the user for whom the TOTP is being created.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    private String userId;

    @JsonCreator
    public CreateUserTOTPRequest(
            String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
    }

    /**
     * The ID of the user for whom the TOTP is being created.
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the user for whom the TOTP is being created.
     */
    public CreateUserTOTPRequest withUserId(String userId) {
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
        CreateUserTOTPRequest other = (CreateUserTOTPRequest) o;
        return 
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateUserTOTPRequest.class,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private String userId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the user for whom the TOTP is being created.
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public CreateUserTOTPRequest build() {
            return new CreateUserTOTPRequest(
                userId);
        }
    }
}

