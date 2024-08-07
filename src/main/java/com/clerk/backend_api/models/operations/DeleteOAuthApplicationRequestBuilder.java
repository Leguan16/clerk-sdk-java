/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.models.errors.SDKError;
import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class DeleteOAuthApplicationRequestBuilder {

    private String oauthApplicationId;
    private final SDKMethodInterfaces.MethodCallDeleteOAuthApplication sdk;

    public DeleteOAuthApplicationRequestBuilder(SDKMethodInterfaces.MethodCallDeleteOAuthApplication sdk) {
        this.sdk = sdk;
    }

    public DeleteOAuthApplicationRequestBuilder oauthApplicationId(String oauthApplicationId) {
        Utils.checkNotNull(oauthApplicationId, "oauthApplicationId");
        this.oauthApplicationId = oauthApplicationId;
        return this;
    }

    public DeleteOAuthApplicationResponse call() throws Exception {

        return sdk.delete(
            oauthApplicationId);
    }
}
