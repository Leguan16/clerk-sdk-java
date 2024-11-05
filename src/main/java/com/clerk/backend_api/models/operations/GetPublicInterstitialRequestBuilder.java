/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetPublicInterstitialRequestBuilder {

    private Optional<String> frontendApi = Optional.empty();
    private Optional<String> publishableKey = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetPublicInterstitial sdk;

    public GetPublicInterstitialRequestBuilder(SDKMethodInterfaces.MethodCallGetPublicInterstitial sdk) {
        this.sdk = sdk;
    }
                
    public GetPublicInterstitialRequestBuilder frontendApi(java.lang.String frontendApi) {
        Utils.checkNotNull(frontendApi, "frontendApi");
        this.frontendApi = Optional.of(frontendApi);
        return this;
    }

    public GetPublicInterstitialRequestBuilder frontendApi(java.util.Optional<java.lang.String> frontendApi) {
        Utils.checkNotNull(frontendApi, "frontendApi");
        this.frontendApi = frontendApi;
        return this;
    }
                
    public GetPublicInterstitialRequestBuilder publishableKey(java.lang.String publishableKey) {
        Utils.checkNotNull(publishableKey, "publishableKey");
        this.publishableKey = Optional.of(publishableKey);
        return this;
    }

    public GetPublicInterstitialRequestBuilder publishableKey(java.util.Optional<java.lang.String> publishableKey) {
        Utils.checkNotNull(publishableKey, "publishableKey");
        this.publishableKey = publishableKey;
        return this;
    }

    public GetPublicInterstitialResponse call() throws Exception {

        return sdk.getInterstitial(
            frontendApi,
            publishableKey);
    }
}
