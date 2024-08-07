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


public class RevokeOrganizationInvitationRequestBuilder {

    private String organizationId;
    private String invitationId;
    private RevokeOrganizationInvitationRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallRevokeOrganizationInvitation sdk;

    public RevokeOrganizationInvitationRequestBuilder(SDKMethodInterfaces.MethodCallRevokeOrganizationInvitation sdk) {
        this.sdk = sdk;
    }

    public RevokeOrganizationInvitationRequestBuilder organizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public RevokeOrganizationInvitationRequestBuilder invitationId(String invitationId) {
        Utils.checkNotNull(invitationId, "invitationId");
        this.invitationId = invitationId;
        return this;
    }

    public RevokeOrganizationInvitationRequestBuilder requestBody(RevokeOrganizationInvitationRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public RevokeOrganizationInvitationResponse call() throws Exception {

        return sdk.revoke(
            organizationId,
            invitationId,
            requestBody);
    }
}
