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

public class LockUserRequest {

    /**
     * The ID of the user to lock
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    private String userId;

    @JsonCreator
    public LockUserRequest(
            String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
    }

    /**
     * The ID of the user to lock
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the user to lock
     */
    public LockUserRequest withUserId(String userId) {
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
        LockUserRequest other = (LockUserRequest) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LockUserRequest.class,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private String userId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the user to lock
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public LockUserRequest build() {
            return new LockUserRequest(
                userId);
        }
    }
}

