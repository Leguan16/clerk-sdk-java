/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;

import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class Passkey {

    @JsonProperty("status")
    private PasskeyVerificationStatus status;

    @JsonProperty("strategy")
    private PasskeyVerificationStrategy strategy;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nonce")
    private Optional<? extends VerificationNonce> nonce;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attempts")
    private JsonNullable<? extends Long> attempts;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expire_at")
    private JsonNullable<? extends Long> expireAt;

    @JsonCreator
    public Passkey(
            @JsonProperty("status") PasskeyVerificationStatus status,
            @JsonProperty("strategy") PasskeyVerificationStrategy strategy,
            @JsonProperty("nonce") Optional<? extends VerificationNonce> nonce,
            @JsonProperty("attempts") JsonNullable<? extends Long> attempts,
            @JsonProperty("expire_at") JsonNullable<? extends Long> expireAt) {
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(strategy, "strategy");
        Utils.checkNotNull(nonce, "nonce");
        Utils.checkNotNull(attempts, "attempts");
        Utils.checkNotNull(expireAt, "expireAt");
        this.status = status;
        this.strategy = strategy;
        this.nonce = nonce;
        this.attempts = attempts;
        this.expireAt = expireAt;
    }
    
    public Passkey(
            PasskeyVerificationStatus status,
            PasskeyVerificationStrategy strategy) {
        this(status, strategy, Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    @JsonIgnore
    public PasskeyVerificationStatus status() {
        return status;
    }

    @JsonIgnore
    public PasskeyVerificationStrategy strategy() {
        return strategy;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VerificationNonce> nonce() {
        return (Optional<VerificationNonce>) nonce;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Long> attempts() {
        return (JsonNullable<Long>) attempts;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Long> expireAt() {
        return (JsonNullable<Long>) expireAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Passkey withStatus(PasskeyVerificationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public Passkey withStrategy(PasskeyVerificationStrategy strategy) {
        Utils.checkNotNull(strategy, "strategy");
        this.strategy = strategy;
        return this;
    }

    public Passkey withNonce(VerificationNonce nonce) {
        Utils.checkNotNull(nonce, "nonce");
        this.nonce = Optional.ofNullable(nonce);
        return this;
    }

    public Passkey withNonce(Optional<? extends VerificationNonce> nonce) {
        Utils.checkNotNull(nonce, "nonce");
        this.nonce = nonce;
        return this;
    }

    public Passkey withAttempts(long attempts) {
        Utils.checkNotNull(attempts, "attempts");
        this.attempts = JsonNullable.of(attempts);
        return this;
    }

    public Passkey withAttempts(JsonNullable<? extends Long> attempts) {
        Utils.checkNotNull(attempts, "attempts");
        this.attempts = attempts;
        return this;
    }

    public Passkey withExpireAt(long expireAt) {
        Utils.checkNotNull(expireAt, "expireAt");
        this.expireAt = JsonNullable.of(expireAt);
        return this;
    }

    public Passkey withExpireAt(JsonNullable<? extends Long> expireAt) {
        Utils.checkNotNull(expireAt, "expireAt");
        this.expireAt = expireAt;
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
        Passkey other = (Passkey) o;
        return 
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.strategy, other.strategy) &&
            java.util.Objects.deepEquals(this.nonce, other.nonce) &&
            java.util.Objects.deepEquals(this.attempts, other.attempts) &&
            java.util.Objects.deepEquals(this.expireAt, other.expireAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            status,
            strategy,
            nonce,
            attempts,
            expireAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Passkey.class,
                "status", status,
                "strategy", strategy,
                "nonce", nonce,
                "attempts", attempts,
                "expireAt", expireAt);
    }
    
    public final static class Builder {
 
        private PasskeyVerificationStatus status;
 
        private PasskeyVerificationStrategy strategy;
 
        private Optional<? extends VerificationNonce> nonce = Optional.empty();
 
        private JsonNullable<? extends Long> attempts = JsonNullable.undefined();
 
        private JsonNullable<? extends Long> expireAt = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder status(PasskeyVerificationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder strategy(PasskeyVerificationStrategy strategy) {
            Utils.checkNotNull(strategy, "strategy");
            this.strategy = strategy;
            return this;
        }

        public Builder nonce(VerificationNonce nonce) {
            Utils.checkNotNull(nonce, "nonce");
            this.nonce = Optional.ofNullable(nonce);
            return this;
        }

        public Builder nonce(Optional<? extends VerificationNonce> nonce) {
            Utils.checkNotNull(nonce, "nonce");
            this.nonce = nonce;
            return this;
        }

        public Builder attempts(long attempts) {
            Utils.checkNotNull(attempts, "attempts");
            this.attempts = JsonNullable.of(attempts);
            return this;
        }

        public Builder attempts(JsonNullable<? extends Long> attempts) {
            Utils.checkNotNull(attempts, "attempts");
            this.attempts = attempts;
            return this;
        }

        public Builder expireAt(long expireAt) {
            Utils.checkNotNull(expireAt, "expireAt");
            this.expireAt = JsonNullable.of(expireAt);
            return this;
        }

        public Builder expireAt(JsonNullable<? extends Long> expireAt) {
            Utils.checkNotNull(expireAt, "expireAt");
            this.expireAt = expireAt;
            return this;
        }
        
        public Passkey build() {
            return new Passkey(
                status,
                strategy,
                nonce,
                attempts,
                expireAt);
        }
    }
}

