/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class UpdateDomainRequestBuilder {

    private String domainId;
    private UpdateDomainRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallUpdateDomain sdk;

    public UpdateDomainRequestBuilder(SDKMethodInterfaces.MethodCallUpdateDomain sdk) {
        this.sdk = sdk;
    }

    public UpdateDomainRequestBuilder domainId(java.lang.String domainId) {
        Utils.checkNotNull(domainId, "domainId");
        this.domainId = domainId;
        return this;
    }

    public UpdateDomainRequestBuilder requestBody(com.clerk.backend_api.models.operations.UpdateDomainRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public UpdateDomainResponse call() throws Exception {

        return sdk.update(
            domainId,
            requestBody);
    }
}
