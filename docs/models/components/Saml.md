# Saml


## Fields

| Field                                                                                                                             | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `status`                                                                                                                          | [com.clerk.backend_api.models.components.SAMLVerificationStatus](../../models/components/SAMLVerificationStatus.md)               | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |
| `strategy`                                                                                                                        | [com.clerk.backend_api.models.components.SAMLVerificationStrategy](../../models/components/SAMLVerificationStrategy.md)           | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |
| `externalVerificationRedirectUrl`                                                                                                 | *Optional<? extends String>*                                                                                                      | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |
| `error`                                                                                                                           | [JsonNullable<? extends com.clerk.backend_api.models.components.VerificationError>](../../models/components/VerificationError.md) | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               |
| `expireAt`                                                                                                                        | *long*                                                                                                                            | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |
| `attempts`                                                                                                                        | *JsonNullable<? extends Long>*                                                                                                    | :heavy_minus_sign:                                                                                                                | N/A                                                                                                                               |