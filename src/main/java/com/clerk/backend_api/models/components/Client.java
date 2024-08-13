/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;


import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class Client {

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    @JsonProperty("object")
    private Object object;

    /**
     * String representing the identifier of the session.
     * 
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("session_ids")
    private List<String> sessionIds;

    @JsonProperty("sessions")
    private List<Session> sessions;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("sign_in_id")
    private Optional<String> signInId;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("sign_up_id")
    private Optional<String> signUpId;

    /**
     * Last active session_id.
     * 
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("last_active_session_id")
    private Optional<String> lastActiveSessionId;

    /**
     * Unix timestamp of last update.
     * 
     */
    @JsonProperty("updated_at")
    private long updatedAt;

    /**
     * Unix timestamp of creation.
     * 
     */
    @JsonProperty("created_at")
    private long createdAt;

    @JsonCreator
    public Client(
            @JsonProperty("object") Object object,
            @JsonProperty("id") String id,
            @JsonProperty("session_ids") List<String> sessionIds,
            @JsonProperty("sessions") List<Session> sessions,
            @JsonProperty("sign_in_id") Optional<String> signInId,
            @JsonProperty("sign_up_id") Optional<String> signUpId,
            @JsonProperty("last_active_session_id") Optional<String> lastActiveSessionId,
            @JsonProperty("updated_at") long updatedAt,
            @JsonProperty("created_at") long createdAt) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(sessionIds, "sessionIds");
        Utils.checkNotNull(sessions, "sessions");
        Utils.checkNotNull(signInId, "signInId");
        Utils.checkNotNull(signUpId, "signUpId");
        Utils.checkNotNull(lastActiveSessionId, "lastActiveSessionId");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(createdAt, "createdAt");
        this.object = object;
        this.id = id;
        this.sessionIds = sessionIds;
        this.sessions = sessions;
        this.signInId = signInId;
        this.signUpId = signUpId;
        this.lastActiveSessionId = lastActiveSessionId;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }
    
    public Client(
            Object object,
            String id,
            List<String> sessionIds,
            List<Session> sessions,
            long updatedAt,
            long createdAt) {
        this(object, id, sessionIds, sessions, Optional.empty(), Optional.empty(), Optional.empty(), updatedAt, createdAt);
    }

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    @JsonIgnore
    public Object object() {
        return object;
    }

    /**
     * String representing the identifier of the session.
     * 
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public List<String> sessionIds() {
        return sessionIds;
    }

    @JsonIgnore
    public List<Session> sessions() {
        return sessions;
    }

    @JsonIgnore
    public Optional<String> signInId() {
        return signInId;
    }

    @JsonIgnore
    public Optional<String> signUpId() {
        return signUpId;
    }

    /**
     * Last active session_id.
     * 
     */
    @JsonIgnore
    public Optional<String> lastActiveSessionId() {
        return lastActiveSessionId;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    @JsonIgnore
    public long updatedAt() {
        return updatedAt;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    @JsonIgnore
    public long createdAt() {
        return createdAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    public Client withObject(Object object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    /**
     * String representing the identifier of the session.
     * 
     */
    public Client withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Client withSessionIds(List<String> sessionIds) {
        Utils.checkNotNull(sessionIds, "sessionIds");
        this.sessionIds = sessionIds;
        return this;
    }

    public Client withSessions(List<Session> sessions) {
        Utils.checkNotNull(sessions, "sessions");
        this.sessions = sessions;
        return this;
    }

    public Client withSignInId(String signInId) {
        Utils.checkNotNull(signInId, "signInId");
        this.signInId = Optional.ofNullable(signInId);
        return this;
    }

    public Client withSignInId(Optional<String> signInId) {
        Utils.checkNotNull(signInId, "signInId");
        this.signInId = signInId;
        return this;
    }

    public Client withSignUpId(String signUpId) {
        Utils.checkNotNull(signUpId, "signUpId");
        this.signUpId = Optional.ofNullable(signUpId);
        return this;
    }

    public Client withSignUpId(Optional<String> signUpId) {
        Utils.checkNotNull(signUpId, "signUpId");
        this.signUpId = signUpId;
        return this;
    }

    /**
     * Last active session_id.
     * 
     */
    public Client withLastActiveSessionId(String lastActiveSessionId) {
        Utils.checkNotNull(lastActiveSessionId, "lastActiveSessionId");
        this.lastActiveSessionId = Optional.ofNullable(lastActiveSessionId);
        return this;
    }

    /**
     * Last active session_id.
     * 
     */
    public Client withLastActiveSessionId(Optional<String> lastActiveSessionId) {
        Utils.checkNotNull(lastActiveSessionId, "lastActiveSessionId");
        this.lastActiveSessionId = lastActiveSessionId;
        return this;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    public Client withUpdatedAt(long updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    public Client withCreatedAt(long createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
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
        Client other = (Client) o;
        return 
            Objects.deepEquals(this.object, other.object) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.sessionIds, other.sessionIds) &&
            Objects.deepEquals(this.sessions, other.sessions) &&
            Objects.deepEquals(this.signInId, other.signInId) &&
            Objects.deepEquals(this.signUpId, other.signUpId) &&
            Objects.deepEquals(this.lastActiveSessionId, other.lastActiveSessionId) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.createdAt, other.createdAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            object,
            id,
            sessionIds,
            sessions,
            signInId,
            signUpId,
            lastActiveSessionId,
            updatedAt,
            createdAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Client.class,
                "object", object,
                "id", id,
                "sessionIds", sessionIds,
                "sessions", sessions,
                "signInId", signInId,
                "signUpId", signUpId,
                "lastActiveSessionId", lastActiveSessionId,
                "updatedAt", updatedAt,
                "createdAt", createdAt);
    }
    
    public final static class Builder {
 
        private Object object;
 
        private String id;
 
        private List<String> sessionIds;
 
        private List<Session> sessions;
 
        private Optional<String> signInId = Optional.empty();
 
        private Optional<String> signUpId = Optional.empty();
 
        private Optional<String> lastActiveSessionId = Optional.empty();
 
        private Long updatedAt;
 
        private Long createdAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * String representing the object's type. Objects of the same type share the same value.
         * 
         */
        public Builder object(Object object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        /**
         * String representing the identifier of the session.
         * 
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder sessionIds(List<String> sessionIds) {
            Utils.checkNotNull(sessionIds, "sessionIds");
            this.sessionIds = sessionIds;
            return this;
        }

        public Builder sessions(List<Session> sessions) {
            Utils.checkNotNull(sessions, "sessions");
            this.sessions = sessions;
            return this;
        }

        public Builder signInId(String signInId) {
            Utils.checkNotNull(signInId, "signInId");
            this.signInId = Optional.ofNullable(signInId);
            return this;
        }

        public Builder signInId(Optional<String> signInId) {
            Utils.checkNotNull(signInId, "signInId");
            this.signInId = signInId;
            return this;
        }

        public Builder signUpId(String signUpId) {
            Utils.checkNotNull(signUpId, "signUpId");
            this.signUpId = Optional.ofNullable(signUpId);
            return this;
        }

        public Builder signUpId(Optional<String> signUpId) {
            Utils.checkNotNull(signUpId, "signUpId");
            this.signUpId = signUpId;
            return this;
        }

        /**
         * Last active session_id.
         * 
         */
        public Builder lastActiveSessionId(String lastActiveSessionId) {
            Utils.checkNotNull(lastActiveSessionId, "lastActiveSessionId");
            this.lastActiveSessionId = Optional.ofNullable(lastActiveSessionId);
            return this;
        }

        /**
         * Last active session_id.
         * 
         */
        public Builder lastActiveSessionId(Optional<String> lastActiveSessionId) {
            Utils.checkNotNull(lastActiveSessionId, "lastActiveSessionId");
            this.lastActiveSessionId = lastActiveSessionId;
            return this;
        }

        /**
         * Unix timestamp of last update.
         * 
         */
        public Builder updatedAt(long updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Unix timestamp of creation.
         * 
         */
        public Builder createdAt(long createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }
        
        public Client build() {
            return new Client(
                object,
                id,
                sessionIds,
                sessions,
                signInId,
                signUpId,
                lastActiveSessionId,
                updatedAt,
                createdAt);
        }
    }
}

