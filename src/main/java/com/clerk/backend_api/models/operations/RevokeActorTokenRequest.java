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

public class RevokeActorTokenRequest {

    /**
     * The ID of the actor token to be revoked.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=actor_token_id")
    private String actorTokenId;

    @JsonCreator
    public RevokeActorTokenRequest(
            String actorTokenId) {
        Utils.checkNotNull(actorTokenId, "actorTokenId");
        this.actorTokenId = actorTokenId;
    }

    /**
     * The ID of the actor token to be revoked.
     */
    @JsonIgnore
    public String actorTokenId() {
        return actorTokenId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the actor token to be revoked.
     */
    public RevokeActorTokenRequest withActorTokenId(String actorTokenId) {
        Utils.checkNotNull(actorTokenId, "actorTokenId");
        this.actorTokenId = actorTokenId;
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
        RevokeActorTokenRequest other = (RevokeActorTokenRequest) o;
        return 
            java.util.Objects.deepEquals(this.actorTokenId, other.actorTokenId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            actorTokenId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RevokeActorTokenRequest.class,
                "actorTokenId", actorTokenId);
    }
    
    public final static class Builder {
 
        private String actorTokenId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the actor token to be revoked.
         */
        public Builder actorTokenId(String actorTokenId) {
            Utils.checkNotNull(actorTokenId, "actorTokenId");
            this.actorTokenId = actorTokenId;
            return this;
        }
        
        public RevokeActorTokenRequest build() {
            return new RevokeActorTokenRequest(
                actorTokenId);
        }
    }
}

