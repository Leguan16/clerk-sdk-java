/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

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

public class UpsertTemplateRequestBody {

    /**
     * The user-friendly name of the template
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    /**
     * The email subject.
     * Applicable only to email templates.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subject")
    private JsonNullable<? extends String> subject;

    /**
     * The editor markup used to generate the body of the template
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("markup")
    private JsonNullable<? extends String> markup;

    /**
     * The template body before variable interpolation
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("body")
    private Optional<? extends String> body;

    /**
     * Whether Clerk should deliver emails or SMS messages based on the current template
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("delivered_by_clerk")
    private JsonNullable<? extends Boolean> deliveredByClerk;

    /**
     * The local part of the From email address that will be used for emails.
     * For example, in the address 'hello@example.com', the local part is 'hello'.
     * Applicable only to email templates.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from_email_name")
    private Optional<? extends String> fromEmailName;

    /**
     * The local part of the Reply To email address that will be used for emails.
     * For example, in the address 'hello@example.com', the local part is 'hello'.
     * Applicable only to email templates.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reply_to_email_name")
    private Optional<? extends String> replyToEmailName;

    @JsonCreator
    public UpsertTemplateRequestBody(
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("subject") JsonNullable<? extends String> subject,
            @JsonProperty("markup") JsonNullable<? extends String> markup,
            @JsonProperty("body") Optional<? extends String> body,
            @JsonProperty("delivered_by_clerk") JsonNullable<? extends Boolean> deliveredByClerk,
            @JsonProperty("from_email_name") Optional<? extends String> fromEmailName,
            @JsonProperty("reply_to_email_name") Optional<? extends String> replyToEmailName) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(subject, "subject");
        Utils.checkNotNull(markup, "markup");
        Utils.checkNotNull(body, "body");
        Utils.checkNotNull(deliveredByClerk, "deliveredByClerk");
        Utils.checkNotNull(fromEmailName, "fromEmailName");
        Utils.checkNotNull(replyToEmailName, "replyToEmailName");
        this.name = name;
        this.subject = subject;
        this.markup = markup;
        this.body = body;
        this.deliveredByClerk = deliveredByClerk;
        this.fromEmailName = fromEmailName;
        this.replyToEmailName = replyToEmailName;
    }
    
    public UpsertTemplateRequestBody() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty());
    }

    /**
     * The user-friendly name of the template
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> name() {
        return (Optional<String>) name;
    }

    /**
     * The email subject.
     * Applicable only to email templates.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<String> subject() {
        return (JsonNullable<String>) subject;
    }

    /**
     * The editor markup used to generate the body of the template
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<String> markup() {
        return (JsonNullable<String>) markup;
    }

    /**
     * The template body before variable interpolation
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> body() {
        return (Optional<String>) body;
    }

    /**
     * Whether Clerk should deliver emails or SMS messages based on the current template
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Boolean> deliveredByClerk() {
        return (JsonNullable<Boolean>) deliveredByClerk;
    }

    /**
     * The local part of the From email address that will be used for emails.
     * For example, in the address 'hello@example.com', the local part is 'hello'.
     * Applicable only to email templates.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> fromEmailName() {
        return (Optional<String>) fromEmailName;
    }

    /**
     * The local part of the Reply To email address that will be used for emails.
     * For example, in the address 'hello@example.com', the local part is 'hello'.
     * Applicable only to email templates.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> replyToEmailName() {
        return (Optional<String>) replyToEmailName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The user-friendly name of the template
     */
    public UpsertTemplateRequestBody withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The user-friendly name of the template
     */
    public UpsertTemplateRequestBody withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The email subject.
     * Applicable only to email templates.
     */
    public UpsertTemplateRequestBody withSubject(String subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = JsonNullable.of(subject);
        return this;
    }

    /**
     * The email subject.
     * Applicable only to email templates.
     */
    public UpsertTemplateRequestBody withSubject(JsonNullable<? extends String> subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = subject;
        return this;
    }

    /**
     * The editor markup used to generate the body of the template
     */
    public UpsertTemplateRequestBody withMarkup(String markup) {
        Utils.checkNotNull(markup, "markup");
        this.markup = JsonNullable.of(markup);
        return this;
    }

    /**
     * The editor markup used to generate the body of the template
     */
    public UpsertTemplateRequestBody withMarkup(JsonNullable<? extends String> markup) {
        Utils.checkNotNull(markup, "markup");
        this.markup = markup;
        return this;
    }

    /**
     * The template body before variable interpolation
     */
    public UpsertTemplateRequestBody withBody(String body) {
        Utils.checkNotNull(body, "body");
        this.body = Optional.ofNullable(body);
        return this;
    }

    /**
     * The template body before variable interpolation
     */
    public UpsertTemplateRequestBody withBody(Optional<? extends String> body) {
        Utils.checkNotNull(body, "body");
        this.body = body;
        return this;
    }

    /**
     * Whether Clerk should deliver emails or SMS messages based on the current template
     */
    public UpsertTemplateRequestBody withDeliveredByClerk(boolean deliveredByClerk) {
        Utils.checkNotNull(deliveredByClerk, "deliveredByClerk");
        this.deliveredByClerk = JsonNullable.of(deliveredByClerk);
        return this;
    }

    /**
     * Whether Clerk should deliver emails or SMS messages based on the current template
     */
    public UpsertTemplateRequestBody withDeliveredByClerk(JsonNullable<? extends Boolean> deliveredByClerk) {
        Utils.checkNotNull(deliveredByClerk, "deliveredByClerk");
        this.deliveredByClerk = deliveredByClerk;
        return this;
    }

    /**
     * The local part of the From email address that will be used for emails.
     * For example, in the address 'hello@example.com', the local part is 'hello'.
     * Applicable only to email templates.
     */
    public UpsertTemplateRequestBody withFromEmailName(String fromEmailName) {
        Utils.checkNotNull(fromEmailName, "fromEmailName");
        this.fromEmailName = Optional.ofNullable(fromEmailName);
        return this;
    }

    /**
     * The local part of the From email address that will be used for emails.
     * For example, in the address 'hello@example.com', the local part is 'hello'.
     * Applicable only to email templates.
     */
    public UpsertTemplateRequestBody withFromEmailName(Optional<? extends String> fromEmailName) {
        Utils.checkNotNull(fromEmailName, "fromEmailName");
        this.fromEmailName = fromEmailName;
        return this;
    }

    /**
     * The local part of the Reply To email address that will be used for emails.
     * For example, in the address 'hello@example.com', the local part is 'hello'.
     * Applicable only to email templates.
     */
    public UpsertTemplateRequestBody withReplyToEmailName(String replyToEmailName) {
        Utils.checkNotNull(replyToEmailName, "replyToEmailName");
        this.replyToEmailName = Optional.ofNullable(replyToEmailName);
        return this;
    }

    /**
     * The local part of the Reply To email address that will be used for emails.
     * For example, in the address 'hello@example.com', the local part is 'hello'.
     * Applicable only to email templates.
     */
    public UpsertTemplateRequestBody withReplyToEmailName(Optional<? extends String> replyToEmailName) {
        Utils.checkNotNull(replyToEmailName, "replyToEmailName");
        this.replyToEmailName = replyToEmailName;
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
        UpsertTemplateRequestBody other = (UpsertTemplateRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.subject, other.subject) &&
            java.util.Objects.deepEquals(this.markup, other.markup) &&
            java.util.Objects.deepEquals(this.body, other.body) &&
            java.util.Objects.deepEquals(this.deliveredByClerk, other.deliveredByClerk) &&
            java.util.Objects.deepEquals(this.fromEmailName, other.fromEmailName) &&
            java.util.Objects.deepEquals(this.replyToEmailName, other.replyToEmailName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            subject,
            markup,
            body,
            deliveredByClerk,
            fromEmailName,
            replyToEmailName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpsertTemplateRequestBody.class,
                "name", name,
                "subject", subject,
                "markup", markup,
                "body", body,
                "deliveredByClerk", deliveredByClerk,
                "fromEmailName", fromEmailName,
                "replyToEmailName", replyToEmailName);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> name = Optional.empty();
 
        private JsonNullable<? extends String> subject = JsonNullable.undefined();
 
        private JsonNullable<? extends String> markup = JsonNullable.undefined();
 
        private Optional<? extends String> body = Optional.empty();
 
        private JsonNullable<? extends Boolean> deliveredByClerk = JsonNullable.undefined();
 
        private Optional<? extends String> fromEmailName = Optional.empty();
 
        private Optional<? extends String> replyToEmailName = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The user-friendly name of the template
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The user-friendly name of the template
         */
        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The email subject.
         * Applicable only to email templates.
         */
        public Builder subject(String subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = JsonNullable.of(subject);
            return this;
        }

        /**
         * The email subject.
         * Applicable only to email templates.
         */
        public Builder subject(JsonNullable<? extends String> subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = subject;
            return this;
        }

        /**
         * The editor markup used to generate the body of the template
         */
        public Builder markup(String markup) {
            Utils.checkNotNull(markup, "markup");
            this.markup = JsonNullable.of(markup);
            return this;
        }

        /**
         * The editor markup used to generate the body of the template
         */
        public Builder markup(JsonNullable<? extends String> markup) {
            Utils.checkNotNull(markup, "markup");
            this.markup = markup;
            return this;
        }

        /**
         * The template body before variable interpolation
         */
        public Builder body(String body) {
            Utils.checkNotNull(body, "body");
            this.body = Optional.ofNullable(body);
            return this;
        }

        /**
         * The template body before variable interpolation
         */
        public Builder body(Optional<? extends String> body) {
            Utils.checkNotNull(body, "body");
            this.body = body;
            return this;
        }

        /**
         * Whether Clerk should deliver emails or SMS messages based on the current template
         */
        public Builder deliveredByClerk(boolean deliveredByClerk) {
            Utils.checkNotNull(deliveredByClerk, "deliveredByClerk");
            this.deliveredByClerk = JsonNullable.of(deliveredByClerk);
            return this;
        }

        /**
         * Whether Clerk should deliver emails or SMS messages based on the current template
         */
        public Builder deliveredByClerk(JsonNullable<? extends Boolean> deliveredByClerk) {
            Utils.checkNotNull(deliveredByClerk, "deliveredByClerk");
            this.deliveredByClerk = deliveredByClerk;
            return this;
        }

        /**
         * The local part of the From email address that will be used for emails.
         * For example, in the address 'hello@example.com', the local part is 'hello'.
         * Applicable only to email templates.
         */
        public Builder fromEmailName(String fromEmailName) {
            Utils.checkNotNull(fromEmailName, "fromEmailName");
            this.fromEmailName = Optional.ofNullable(fromEmailName);
            return this;
        }

        /**
         * The local part of the From email address that will be used for emails.
         * For example, in the address 'hello@example.com', the local part is 'hello'.
         * Applicable only to email templates.
         */
        public Builder fromEmailName(Optional<? extends String> fromEmailName) {
            Utils.checkNotNull(fromEmailName, "fromEmailName");
            this.fromEmailName = fromEmailName;
            return this;
        }

        /**
         * The local part of the Reply To email address that will be used for emails.
         * For example, in the address 'hello@example.com', the local part is 'hello'.
         * Applicable only to email templates.
         */
        public Builder replyToEmailName(String replyToEmailName) {
            Utils.checkNotNull(replyToEmailName, "replyToEmailName");
            this.replyToEmailName = Optional.ofNullable(replyToEmailName);
            return this;
        }

        /**
         * The local part of the Reply To email address that will be used for emails.
         * For example, in the address 'hello@example.com', the local part is 'hello'.
         * Applicable only to email templates.
         */
        public Builder replyToEmailName(Optional<? extends String> replyToEmailName) {
            Utils.checkNotNull(replyToEmailName, "replyToEmailName");
            this.replyToEmailName = replyToEmailName;
            return this;
        }
        
        public UpsertTemplateRequestBody build() {
            return new UpsertTemplateRequestBody(
                name,
                subject,
                markup,
                body,
                deliveredByClerk,
                fromEmailName,
                replyToEmailName);
        }
    }
}

