/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;


import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * CreateOrganizationInvitationPublicMetadata - Metadata saved on the organization invitation, read-only from the Frontend API and fully accessible (read/write) from the Backend API.
 */

public class CreateOrganizationInvitationPublicMetadata {

    @JsonCreator
    public CreateOrganizationInvitationPublicMetadata() {
        
        
    }

    public final static Builder builder() {
        return new Builder();
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateOrganizationInvitationPublicMetadata.class);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public CreateOrganizationInvitationPublicMetadata build() {
            return new CreateOrganizationInvitationPublicMetadata(
                );
        }
    }
}

