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


public class ListOrganizationsRequestBuilder {

    private ListOrganizationsRequest request;
    private final SDKMethodInterfaces.MethodCallListOrganizations sdk;

    public ListOrganizationsRequestBuilder(SDKMethodInterfaces.MethodCallListOrganizations sdk) {
        this.sdk = sdk;
    }

    public ListOrganizationsRequestBuilder request(ListOrganizationsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListOrganizationsResponse call() throws Exception {

        return sdk.list(
            request);
    }
}
