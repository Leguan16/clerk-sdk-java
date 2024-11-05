/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class InstanceGetOrganizationMembershipsRequestBuilder {

    private Optional<Long> limit = Utils.readDefaultOrConstValue(
                            "limit",
                            "10",
                            new TypeReference<Optional<Long>>() {});
    private Optional<Long> offset = Utils.readDefaultOrConstValue(
                            "offset",
                            "0",
                            new TypeReference<Optional<Long>>() {});
    private Optional<String> orderBy = Optional.empty();
    private final SDKMethodInterfaces.MethodCallInstanceGetOrganizationMemberships sdk;

    public InstanceGetOrganizationMembershipsRequestBuilder(SDKMethodInterfaces.MethodCallInstanceGetOrganizationMemberships sdk) {
        this.sdk = sdk;
    }
                
    public InstanceGetOrganizationMembershipsRequestBuilder limit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.of(limit);
        return this;
    }

    public InstanceGetOrganizationMembershipsRequestBuilder limit(Optional<Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }
                
    public InstanceGetOrganizationMembershipsRequestBuilder offset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.of(offset);
        return this;
    }

    public InstanceGetOrganizationMembershipsRequestBuilder offset(Optional<Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }
                
    public InstanceGetOrganizationMembershipsRequestBuilder orderBy(String orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = Optional.of(orderBy);
        return this;
    }

    public InstanceGetOrganizationMembershipsRequestBuilder orderBy(Optional<String> orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = orderBy;
        return this;
    }

    public InstanceGetOrganizationMembershipsResponse call() throws Exception {
        if (limit == null) {
            limit = _SINGLETON_VALUE_Limit.value();
        }
        if (offset == null) {
            offset = _SINGLETON_VALUE_Offset.value();
        }
        return sdk.getAll(
            limit,
            offset,
            orderBy);
    }

    private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Limit =
            new LazySingletonValue<>(
                    "limit",
                    "10",
                    new TypeReference<Optional<Long>>() {});

    private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Offset =
            new LazySingletonValue<>(
                    "offset",
                    "0",
                    new TypeReference<Optional<Long>>() {});
}