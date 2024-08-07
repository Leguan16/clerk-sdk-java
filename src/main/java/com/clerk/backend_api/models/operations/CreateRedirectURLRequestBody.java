/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

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

public class CreateRedirectURLRequestBody {

    /**
     * The full url value prefixed with `https://` or a custom scheme e.g. `"https://my-app.com/oauth-callback"` or `"my-app://oauth-callback"`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private Optional<? extends String> url;

    @JsonCreator
    public CreateRedirectURLRequestBody(
            @JsonProperty("url") Optional<? extends String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
    }
    
    public CreateRedirectURLRequestBody() {
        this(Optional.empty());
    }

    /**
     * The full url value prefixed with `https://` or a custom scheme e.g. `"https://my-app.com/oauth-callback"` or `"my-app://oauth-callback"`
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> url() {
        return (Optional<String>) url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The full url value prefixed with `https://` or a custom scheme e.g. `"https://my-app.com/oauth-callback"` or `"my-app://oauth-callback"`
     */
    public CreateRedirectURLRequestBody withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * The full url value prefixed with `https://` or a custom scheme e.g. `"https://my-app.com/oauth-callback"` or `"my-app://oauth-callback"`
     */
    public CreateRedirectURLRequestBody withUrl(Optional<? extends String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        CreateRedirectURLRequestBody other = (CreateRedirectURLRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateRedirectURLRequestBody.class,
                "url", url);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> url = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The full url value prefixed with `https://` or a custom scheme e.g. `"https://my-app.com/oauth-callback"` or `"my-app://oauth-callback"`
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = Optional.ofNullable(url);
            return this;
        }

        /**
         * The full url value prefixed with `https://` or a custom scheme e.g. `"https://my-app.com/oauth-callback"` or `"my-app://oauth-callback"`
         */
        public Builder url(Optional<? extends String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public CreateRedirectURLRequestBody build() {
            return new CreateRedirectURLRequestBody(
                url);
        }
    }
}

