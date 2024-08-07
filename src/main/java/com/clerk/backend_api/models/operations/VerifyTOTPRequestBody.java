/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public class VerifyTOTPRequestBody {

    /**
     * The TOTP or backup code to verify
     */
    @JsonProperty("code")
    private String code;

    @JsonCreator
    public VerifyTOTPRequestBody(
            @JsonProperty("code") String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
    }

    /**
     * The TOTP or backup code to verify
     */
    @JsonIgnore
    public String code() {
        return code;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The TOTP or backup code to verify
     */
    public VerifyTOTPRequestBody withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
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
        VerifyTOTPRequestBody other = (VerifyTOTPRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.code, other.code);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            code);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VerifyTOTPRequestBody.class,
                "code", code);
    }
    
    public final static class Builder {
 
        private String code;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The TOTP or backup code to verify
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }
        
        public VerifyTOTPRequestBody build() {
            return new VerifyTOTPRequestBody(
                code);
        }
    }
}

