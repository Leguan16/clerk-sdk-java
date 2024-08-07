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


public class GetPhoneNumberRequestBuilder {

    private String phoneNumberId;
    private final SDKMethodInterfaces.MethodCallGetPhoneNumber sdk;

    public GetPhoneNumberRequestBuilder(SDKMethodInterfaces.MethodCallGetPhoneNumber sdk) {
        this.sdk = sdk;
    }

    public GetPhoneNumberRequestBuilder phoneNumberId(String phoneNumberId) {
        Utils.checkNotNull(phoneNumberId, "phoneNumberId");
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public GetPhoneNumberResponse call() throws Exception {

        return sdk.get(
            phoneNumberId);
    }
}
