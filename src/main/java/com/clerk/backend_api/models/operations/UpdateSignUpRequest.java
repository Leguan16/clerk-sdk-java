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


public class UpdateSignUpRequest {

    /**
     * The ID of the sign-up to update
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private UpdateSignUpRequestBody requestBody;

    @JsonCreator
    public UpdateSignUpRequest(
            String id,
            UpdateSignUpRequestBody requestBody) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(requestBody, "requestBody");
        this.id = id;
        this.requestBody = requestBody;
    }

    /**
     * The ID of the sign-up to update
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public UpdateSignUpRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the sign-up to update
     */
    public UpdateSignUpRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateSignUpRequest withRequestBody(UpdateSignUpRequestBody requestBody) {
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
        UpdateSignUpRequest other = (UpdateSignUpRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateSignUpRequest.class,
                "id", id,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String id;
 
        private UpdateSignUpRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the sign-up to update
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder requestBody(UpdateSignUpRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public UpdateSignUpRequest build() {
            return new UpdateSignUpRequest(
                id,
                requestBody);
        }
    }
}

