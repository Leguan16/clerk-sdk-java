# PreviewTemplateRequest


## Fields

| Field                                                                                                                                           | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `templateType`                                                                                                                                  | *String*                                                                                                                                        | :heavy_check_mark:                                                                                                                              | The type of template to preview                                                                                                                 |
| `slug`                                                                                                                                          | *String*                                                                                                                                        | :heavy_check_mark:                                                                                                                              | The slug of the template to preview                                                                                                             |
| `requestBody`                                                                                                                                   | [Optional<? extends com.clerk.backend_api.models.operations.PreviewTemplateRequestBody>](../../models/operations/PreviewTemplateRequestBody.md) | :heavy_minus_sign:                                                                                                                              | Required parameters                                                                                                                             |