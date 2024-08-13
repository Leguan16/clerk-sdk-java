/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.util.Optional;

public class CreateRedirectURLRequestBuilder {

    private Optional<? extends CreateRedirectURLRequestBody> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateRedirectURL sdk;

    public CreateRedirectURLRequestBuilder(SDKMethodInterfaces.MethodCallCreateRedirectURL sdk) {
        this.sdk = sdk;
    }
                
    public CreateRedirectURLRequestBuilder request(com.clerk.backend_api.models.operations.CreateRedirectURLRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreateRedirectURLRequestBuilder request(java.util.Optional<? extends com.clerk.backend_api.models.operations.CreateRedirectURLRequestBody> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateRedirectURLResponse call() throws Exception {

        return sdk.create(
            request);
    }
}
