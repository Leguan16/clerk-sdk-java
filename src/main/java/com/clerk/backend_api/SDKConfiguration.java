/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.clerk.backend_api;

import com.clerk.backend_api.utils.Hook.SdkInitData;
import com.clerk.backend_api.utils.HTTPClient;
import com.clerk.backend_api.utils.RetryConfig;
import com.clerk.backend_api.models.components.Security;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
      public String serverUrl;
    public int serverIdx = 0;
    public String language = "java";
    public String openapiDocVersion = "v1";
    public String sdkVersion = "0.2.0";
    public String genVersion = "2.354.2";
    public String userAgent = "speakeasy-sdk/java 0.2.0 2.354.2 v1 com.clerk.backend_api";

    private com.clerk.backend_api.utils.Hooks _hooks = createHooks();

    private static com.clerk.backend_api.utils.Hooks createHooks() {
        com.clerk.backend_api.utils.Hooks hooks = new com.clerk.backend_api.utils.Hooks();
        return hooks;
    }
    
    public com.clerk.backend_api.utils.Hooks hooks() {
        return _hooks;
    }

    public void setHooks(com.clerk.backend_api.utils.Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        com.clerk.backend_api.hooks.SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(serverUrl, defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
