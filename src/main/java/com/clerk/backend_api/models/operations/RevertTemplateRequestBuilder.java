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


public class RevertTemplateRequestBuilder {

    private RevertTemplatePathParamTemplateType templateType;
    private String slug;
    private final SDKMethodInterfaces.MethodCallRevertTemplate sdk;

    public RevertTemplateRequestBuilder(SDKMethodInterfaces.MethodCallRevertTemplate sdk) {
        this.sdk = sdk;
    }

    public RevertTemplateRequestBuilder templateType(RevertTemplatePathParamTemplateType templateType) {
        Utils.checkNotNull(templateType, "templateType");
        this.templateType = templateType;
        return this;
    }

    public RevertTemplateRequestBuilder slug(String slug) {
        Utils.checkNotNull(slug, "slug");
        this.slug = slug;
        return this;
    }

    public RevertTemplateResponse call() throws Exception {

        return sdk.revert(
            templateType,
            slug);
    }
}
