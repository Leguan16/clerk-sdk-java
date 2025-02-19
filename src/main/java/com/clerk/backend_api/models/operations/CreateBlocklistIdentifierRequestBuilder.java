/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;

public class CreateBlocklistIdentifierRequestBuilder {

    private CreateBlocklistIdentifierRequestBody request;
    private final SDKMethodInterfaces.MethodCallCreateBlocklistIdentifier sdk;

    public CreateBlocklistIdentifierRequestBuilder(SDKMethodInterfaces.MethodCallCreateBlocklistIdentifier sdk) {
        this.sdk = sdk;
    }

    public CreateBlocklistIdentifierRequestBuilder request(CreateBlocklistIdentifierRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateBlocklistIdentifierResponse call() throws Exception {

        return sdk.createBlocklistIdentifier(
            request);
    }
}
