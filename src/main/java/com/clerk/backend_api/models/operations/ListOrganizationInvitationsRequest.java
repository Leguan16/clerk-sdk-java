/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.SpeakeasyMetadata;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class ListOrganizationInvitationsRequest {

    /**
     * The organization ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organization_id")
    private String organizationId;

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<? extends Long> limit;

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<? extends Long> offset;

    /**
     * Filter organization invitations based on their status
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=status")
    private Optional<? extends ListOrganizationInvitationsQueryParamStatus> status;

    @JsonCreator
    public ListOrganizationInvitationsRequest(
            String organizationId,
            Optional<? extends Long> limit,
            Optional<? extends Long> offset,
            Optional<? extends ListOrganizationInvitationsQueryParamStatus> status) {
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(status, "status");
        this.organizationId = organizationId;
        this.limit = limit;
        this.offset = offset;
        this.status = status;
    }
    
    public ListOrganizationInvitationsRequest(
            String organizationId) {
        this(organizationId, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The organization ID.
     */
    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> limit() {
        return (Optional<Long>) limit;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> offset() {
        return (Optional<Long>) offset;
    }

    /**
     * Filter organization invitations based on their status
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ListOrganizationInvitationsQueryParamStatus> status() {
        return (Optional<ListOrganizationInvitationsQueryParamStatus>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The organization ID.
     */
    public ListOrganizationInvitationsRequest withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    public ListOrganizationInvitationsRequest withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    public ListOrganizationInvitationsRequest withLimit(Optional<? extends Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    public ListOrganizationInvitationsRequest withOffset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    public ListOrganizationInvitationsRequest withOffset(Optional<? extends Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    /**
     * Filter organization invitations based on their status
     */
    public ListOrganizationInvitationsRequest withStatus(ListOrganizationInvitationsQueryParamStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Filter organization invitations based on their status
     */
    public ListOrganizationInvitationsRequest withStatus(Optional<? extends ListOrganizationInvitationsQueryParamStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOrganizationInvitationsRequest other = (ListOrganizationInvitationsRequest) o;
        return 
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.offset, other.offset) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            organizationId,
            limit,
            offset,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListOrganizationInvitationsRequest.class,
                "organizationId", organizationId,
                "limit", limit,
                "offset", offset,
                "status", status);
    }
    
    public final static class Builder {
 
        private String organizationId;
 
        private Optional<? extends Long> limit;
 
        private Optional<? extends Long> offset;
 
        private Optional<? extends ListOrganizationInvitationsQueryParamStatus> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The organization ID.
         */
        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        /**
         * Applies a limit to the number of results returned.
         * Can be used for paginating the results together with `offset`.
         */
        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Applies a limit to the number of results returned.
         * Can be used for paginating the results together with `offset`.
         */
        public Builder limit(Optional<? extends Long> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * Skip the first `offset` results when paginating.
         * Needs to be an integer greater or equal to zero.
         * To be used in conjunction with `limit`.
         */
        public Builder offset(long offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = Optional.ofNullable(offset);
            return this;
        }

        /**
         * Skip the first `offset` results when paginating.
         * Needs to be an integer greater or equal to zero.
         * To be used in conjunction with `limit`.
         */
        public Builder offset(Optional<? extends Long> offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }

        /**
         * Filter organization invitations based on their status
         */
        public Builder status(ListOrganizationInvitationsQueryParamStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Filter organization invitations based on their status
         */
        public Builder status(Optional<? extends ListOrganizationInvitationsQueryParamStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public ListOrganizationInvitationsRequest build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }
            if (offset == null) {
                offset = _SINGLETON_VALUE_Offset.value();
            }
            return new ListOrganizationInvitationsRequest(
                organizationId,
                limit,
                offset,
                status);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "10",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Offset =
                new LazySingletonValue<>(
                        "offset",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

