/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;


public class ListAllowlistIdentifiersRequestBuilder {

    private final SDKMethodInterfaces.MethodCallListAllowlistIdentifiers sdk;

    public ListAllowlistIdentifiersRequestBuilder(SDKMethodInterfaces.MethodCallListAllowlistIdentifiers sdk) {
        this.sdk = sdk;
    }

    public ListAllowlistIdentifiersResponse call() throws Exception {

        return sdk.listDirect();
    }
}
