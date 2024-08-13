/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.util.Optional;

public class CreateOrganizationRequestBuilder {

    private Optional<? extends CreateOrganizationRequestBody> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateOrganization sdk;

    public CreateOrganizationRequestBuilder(SDKMethodInterfaces.MethodCallCreateOrganization sdk) {
        this.sdk = sdk;
    }
                
    public CreateOrganizationRequestBuilder request(com.clerk.backend_api.models.operations.CreateOrganizationRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreateOrganizationRequestBuilder request(java.util.Optional<? extends com.clerk.backend_api.models.operations.CreateOrganizationRequestBody> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateOrganizationResponse call() throws Exception {

        return sdk.create(
            request);
    }
}
