/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;

import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * InstanceSettingsObject - String representing the object's type. Objects of the same type share the same value.
 */
public enum InstanceSettingsObject {
    INSTANCE_SETTINGS("instance_settings");

    @JsonValue
    private final String value;

    private InstanceSettingsObject(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
