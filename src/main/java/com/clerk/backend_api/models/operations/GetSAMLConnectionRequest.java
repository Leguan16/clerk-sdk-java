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

public class GetSAMLConnectionRequest {

    /**
     * The ID of the SAML Connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=saml_connection_id")
    private String samlConnectionId;

    @JsonCreator
    public GetSAMLConnectionRequest(
            String samlConnectionId) {
        Utils.checkNotNull(samlConnectionId, "samlConnectionId");
        this.samlConnectionId = samlConnectionId;
    }

    /**
     * The ID of the SAML Connection
     */
    @JsonIgnore
    public String samlConnectionId() {
        return samlConnectionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the SAML Connection
     */
    public GetSAMLConnectionRequest withSamlConnectionId(String samlConnectionId) {
        Utils.checkNotNull(samlConnectionId, "samlConnectionId");
        this.samlConnectionId = samlConnectionId;
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
        GetSAMLConnectionRequest other = (GetSAMLConnectionRequest) o;
        return 
            java.util.Objects.deepEquals(this.samlConnectionId, other.samlConnectionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            samlConnectionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSAMLConnectionRequest.class,
                "samlConnectionId", samlConnectionId);
    }
    
    public final static class Builder {
 
        private String samlConnectionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the SAML Connection
         */
        public Builder samlConnectionId(String samlConnectionId) {
            Utils.checkNotNull(samlConnectionId, "samlConnectionId");
            this.samlConnectionId = samlConnectionId;
            return this;
        }
        
        public GetSAMLConnectionRequest build() {
            return new GetSAMLConnectionRequest(
                samlConnectionId);
        }
    }
}

