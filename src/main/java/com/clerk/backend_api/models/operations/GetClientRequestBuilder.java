/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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


public class GetClientRequestBuilder {

    private String clientId;
    private final SDKMethodInterfaces.MethodCallGetClient sdk;

    public GetClientRequestBuilder(SDKMethodInterfaces.MethodCallGetClient sdk) {
        this.sdk = sdk;
    }

    public GetClientRequestBuilder clientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    public GetClientResponse call() throws Exception {

        return sdk.get(
            clientId);
    }
}