/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;

public class GetUsersCountRequestBuilder {

    private GetUsersCountRequest request;
    private final SDKMethodInterfaces.MethodCallGetUsersCount sdk;

    public GetUsersCountRequestBuilder(SDKMethodInterfaces.MethodCallGetUsersCount sdk) {
        this.sdk = sdk;
    }

    public GetUsersCountRequestBuilder request(GetUsersCountRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetUsersCountResponse call() throws Exception {

        return sdk.count(
            request);
    }
}
