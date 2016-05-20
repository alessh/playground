/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.sns.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Input for Subscribe action.
 */
public class SubscribeRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the topic you want to subscribe to.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * The protocol you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li><code>http</code> -- delivery of JSON-encoded message via HTTP POST</li>
     * <li><code>https</code> -- delivery of JSON-encoded message via HTTPS POST
     * </li>
     * <li><code>email</code> -- delivery of message via SMTP</li>
     * <li><code>email-json</code> -- delivery of JSON-encoded message via SMTP</li>
     * <li><code>sms</code> -- delivery of message via SMS</li>
     * <li><code>sqs</code> -- delivery of JSON-encoded message to an Amazon SQS
     * queue</li>
     * <li><code>application</code> -- delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device.</li>
     * </ul>
     */
    private String protocol;
    /**
     * <p>
     * The endpoint that you want to receive notifications. Endpoints vary by
     * protocol:
     * </p>
     * <ul>
     * <li>For the <code>http</code> protocol, the endpoint is an URL beginning
     * with "http://"</li>
     * <li>For the <code>https</code> protocol, the endpoint is a URL beginning
     * with "https://"</li>
     * <li>For the <code>email</code> protocol, the endpoint is an email address
     * </li>
     * <li>For the <code>email-json</code> protocol, the endpoint is an email
     * address</li>
     * <li>For the <code>sms</code> protocol, the endpoint is a phone number of
     * an SMS-enabled device</li>
     * <li>For the <code>sqs</code> protocol, the endpoint is the ARN of an
     * Amazon SQS queue</li>
     * <li>For the <code>application</code> protocol, the endpoint is the
     * EndpointArn of a mobile app and device.</li>
     * </ul>
     */
    private String endpoint;

    /**
     * Default constructor for SubscribeRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public SubscribeRequest() {
    }

    /**
     * Constructs a new SubscribeRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param topicArn
     *        The ARN of the topic you want to subscribe to.
     * @param protocol
     *        The protocol you want to use. Supported protocols include:</p>
     *        <ul>
     *        <li><code>http</code> -- delivery of JSON-encoded message via HTTP
     *        POST</li>
     *        <li><code>https</code> -- delivery of JSON-encoded message via
     *        HTTPS POST</li>
     *        <li><code>email</code> -- delivery of message via SMTP</li>
     *        <li><code>email-json</code> -- delivery of JSON-encoded message
     *        via SMTP</li>
     *        <li><code>sms</code> -- delivery of message via SMS</li>
     *        <li><code>sqs</code> -- delivery of JSON-encoded message to an
     *        Amazon SQS queue</li>
     *        <li><code>application</code> -- delivery of JSON-encoded message
     *        to an EndpointArn for a mobile app and device.</li>
     * @param endpoint
     *        The endpoint that you want to receive notifications. Endpoints
     *        vary by protocol:</p>
     *        <ul>
     *        <li>For the <code>http</code> protocol, the endpoint is an URL
     *        beginning with "http://"</li>
     *        <li>For the <code>https</code> protocol, the endpoint is a URL
     *        beginning with "https://"</li>
     *        <li>For the <code>email</code> protocol, the endpoint is an email
     *        address</li>
     *        <li>For the <code>email-json</code> protocol, the endpoint is an
     *        email address</li>
     *        <li>For the <code>sms</code> protocol, the endpoint is a phone
     *        number of an SMS-enabled device</li>
     *        <li>For the <code>sqs</code> protocol, the endpoint is the ARN of
     *        an Amazon SQS queue</li>
     *        <li>For the <code>application</code> protocol, the endpoint is the
     *        EndpointArn of a mobile app and device.</li>
     */
    public SubscribeRequest(String topicArn, String protocol, String endpoint) {
        setTopicArn(topicArn);
        setProtocol(protocol);
        setEndpoint(endpoint);
    }

    /**
     * <p>
     * The ARN of the topic you want to subscribe to.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic you want to subscribe to.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic you want to subscribe to.
     * </p>
     * 
     * @return The ARN of the topic you want to subscribe to.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The ARN of the topic you want to subscribe to.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic you want to subscribe to.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SubscribeRequest withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * The protocol you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li><code>http</code> -- delivery of JSON-encoded message via HTTP POST</li>
     * <li><code>https</code> -- delivery of JSON-encoded message via HTTPS POST
     * </li>
     * <li><code>email</code> -- delivery of message via SMTP</li>
     * <li><code>email-json</code> -- delivery of JSON-encoded message via SMTP</li>
     * <li><code>sms</code> -- delivery of message via SMS</li>
     * <li><code>sqs</code> -- delivery of JSON-encoded message to an Amazon SQS
     * queue</li>
     * <li><code>application</code> -- delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device.</li>
     * </ul>
     * 
     * @param protocol
     *        The protocol you want to use. Supported protocols include:</p>
     *        <ul>
     *        <li><code>http</code> -- delivery of JSON-encoded message via HTTP
     *        POST</li>
     *        <li><code>https</code> -- delivery of JSON-encoded message via
     *        HTTPS POST</li>
     *        <li><code>email</code> -- delivery of message via SMTP</li>
     *        <li><code>email-json</code> -- delivery of JSON-encoded message
     *        via SMTP</li>
     *        <li><code>sms</code> -- delivery of message via SMS</li>
     *        <li><code>sqs</code> -- delivery of JSON-encoded message to an
     *        Amazon SQS queue</li>
     *        <li><code>application</code> -- delivery of JSON-encoded message
     *        to an EndpointArn for a mobile app and device.</li>
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li><code>http</code> -- delivery of JSON-encoded message via HTTP POST</li>
     * <li><code>https</code> -- delivery of JSON-encoded message via HTTPS POST
     * </li>
     * <li><code>email</code> -- delivery of message via SMTP</li>
     * <li><code>email-json</code> -- delivery of JSON-encoded message via SMTP</li>
     * <li><code>sms</code> -- delivery of message via SMS</li>
     * <li><code>sqs</code> -- delivery of JSON-encoded message to an Amazon SQS
     * queue</li>
     * <li><code>application</code> -- delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device.</li>
     * </ul>
     * 
     * @return The protocol you want to use. Supported protocols include:</p>
     *         <ul>
     *         <li><code>http</code> -- delivery of JSON-encoded message via
     *         HTTP POST</li>
     *         <li><code>https</code> -- delivery of JSON-encoded message via
     *         HTTPS POST</li>
     *         <li><code>email</code> -- delivery of message via SMTP</li>
     *         <li><code>email-json</code> -- delivery of JSON-encoded message
     *         via SMTP</li>
     *         <li><code>sms</code> -- delivery of message via SMS</li>
     *         <li><code>sqs</code> -- delivery of JSON-encoded message to an
     *         Amazon SQS queue</li>
     *         <li><code>application</code> -- delivery of JSON-encoded message
     *         to an EndpointArn for a mobile app and device.</li>
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol you want to use. Supported protocols include:
     * </p>
     * <ul>
     * <li><code>http</code> -- delivery of JSON-encoded message via HTTP POST</li>
     * <li><code>https</code> -- delivery of JSON-encoded message via HTTPS POST
     * </li>
     * <li><code>email</code> -- delivery of message via SMTP</li>
     * <li><code>email-json</code> -- delivery of JSON-encoded message via SMTP</li>
     * <li><code>sms</code> -- delivery of message via SMS</li>
     * <li><code>sqs</code> -- delivery of JSON-encoded message to an Amazon SQS
     * queue</li>
     * <li><code>application</code> -- delivery of JSON-encoded message to an
     * EndpointArn for a mobile app and device.</li>
     * </ul>
     * 
     * @param protocol
     *        The protocol you want to use. Supported protocols include:</p>
     *        <ul>
     *        <li><code>http</code> -- delivery of JSON-encoded message via HTTP
     *        POST</li>
     *        <li><code>https</code> -- delivery of JSON-encoded message via
     *        HTTPS POST</li>
     *        <li><code>email</code> -- delivery of message via SMTP</li>
     *        <li><code>email-json</code> -- delivery of JSON-encoded message
     *        via SMTP</li>
     *        <li><code>sms</code> -- delivery of message via SMS</li>
     *        <li><code>sqs</code> -- delivery of JSON-encoded message to an
     *        Amazon SQS queue</li>
     *        <li><code>application</code> -- delivery of JSON-encoded message
     *        to an EndpointArn for a mobile app and device.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SubscribeRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The endpoint that you want to receive notifications. Endpoints vary by
     * protocol:
     * </p>
     * <ul>
     * <li>For the <code>http</code> protocol, the endpoint is an URL beginning
     * with "http://"</li>
     * <li>For the <code>https</code> protocol, the endpoint is a URL beginning
     * with "https://"</li>
     * <li>For the <code>email</code> protocol, the endpoint is an email address
     * </li>
     * <li>For the <code>email-json</code> protocol, the endpoint is an email
     * address</li>
     * <li>For the <code>sms</code> protocol, the endpoint is a phone number of
     * an SMS-enabled device</li>
     * <li>For the <code>sqs</code> protocol, the endpoint is the ARN of an
     * Amazon SQS queue</li>
     * <li>For the <code>application</code> protocol, the endpoint is the
     * EndpointArn of a mobile app and device.</li>
     * </ul>
     * 
     * @param endpoint
     *        The endpoint that you want to receive notifications. Endpoints
     *        vary by protocol:</p>
     *        <ul>
     *        <li>For the <code>http</code> protocol, the endpoint is an URL
     *        beginning with "http://"</li>
     *        <li>For the <code>https</code> protocol, the endpoint is a URL
     *        beginning with "https://"</li>
     *        <li>For the <code>email</code> protocol, the endpoint is an email
     *        address</li>
     *        <li>For the <code>email-json</code> protocol, the endpoint is an
     *        email address</li>
     *        <li>For the <code>sms</code> protocol, the endpoint is a phone
     *        number of an SMS-enabled device</li>
     *        <li>For the <code>sqs</code> protocol, the endpoint is the ARN of
     *        an Amazon SQS queue</li>
     *        <li>For the <code>application</code> protocol, the endpoint is the
     *        EndpointArn of a mobile app and device.</li>
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint that you want to receive notifications. Endpoints vary by
     * protocol:
     * </p>
     * <ul>
     * <li>For the <code>http</code> protocol, the endpoint is an URL beginning
     * with "http://"</li>
     * <li>For the <code>https</code> protocol, the endpoint is a URL beginning
     * with "https://"</li>
     * <li>For the <code>email</code> protocol, the endpoint is an email address
     * </li>
     * <li>For the <code>email-json</code> protocol, the endpoint is an email
     * address</li>
     * <li>For the <code>sms</code> protocol, the endpoint is a phone number of
     * an SMS-enabled device</li>
     * <li>For the <code>sqs</code> protocol, the endpoint is the ARN of an
     * Amazon SQS queue</li>
     * <li>For the <code>application</code> protocol, the endpoint is the
     * EndpointArn of a mobile app and device.</li>
     * </ul>
     * 
     * @return The endpoint that you want to receive notifications. Endpoints
     *         vary by protocol:</p>
     *         <ul>
     *         <li>For the <code>http</code> protocol, the endpoint is an URL
     *         beginning with "http://"</li>
     *         <li>For the <code>https</code> protocol, the endpoint is a URL
     *         beginning with "https://"</li>
     *         <li>For the <code>email</code> protocol, the endpoint is an email
     *         address</li>
     *         <li>For the <code>email-json</code> protocol, the endpoint is an
     *         email address</li>
     *         <li>For the <code>sms</code> protocol, the endpoint is a phone
     *         number of an SMS-enabled device</li>
     *         <li>For the <code>sqs</code> protocol, the endpoint is the ARN of
     *         an Amazon SQS queue</li>
     *         <li>For the <code>application</code> protocol, the endpoint is
     *         the EndpointArn of a mobile app and device.</li>
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint that you want to receive notifications. Endpoints vary by
     * protocol:
     * </p>
     * <ul>
     * <li>For the <code>http</code> protocol, the endpoint is an URL beginning
     * with "http://"</li>
     * <li>For the <code>https</code> protocol, the endpoint is a URL beginning
     * with "https://"</li>
     * <li>For the <code>email</code> protocol, the endpoint is an email address
     * </li>
     * <li>For the <code>email-json</code> protocol, the endpoint is an email
     * address</li>
     * <li>For the <code>sms</code> protocol, the endpoint is a phone number of
     * an SMS-enabled device</li>
     * <li>For the <code>sqs</code> protocol, the endpoint is the ARN of an
     * Amazon SQS queue</li>
     * <li>For the <code>application</code> protocol, the endpoint is the
     * EndpointArn of a mobile app and device.</li>
     * </ul>
     * 
     * @param endpoint
     *        The endpoint that you want to receive notifications. Endpoints
     *        vary by protocol:</p>
     *        <ul>
     *        <li>For the <code>http</code> protocol, the endpoint is an URL
     *        beginning with "http://"</li>
     *        <li>For the <code>https</code> protocol, the endpoint is a URL
     *        beginning with "https://"</li>
     *        <li>For the <code>email</code> protocol, the endpoint is an email
     *        address</li>
     *        <li>For the <code>email-json</code> protocol, the endpoint is an
     *        email address</li>
     *        <li>For the <code>sms</code> protocol, the endpoint is a phone
     *        number of an SMS-enabled device</li>
     *        <li>For the <code>sqs</code> protocol, the endpoint is the ARN of
     *        an Amazon SQS queue</li>
     *        <li>For the <code>application</code> protocol, the endpoint is the
     *        EndpointArn of a mobile app and device.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SubscribeRequest withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTopicArn() != null)
            sb.append("TopicArn: " + getTopicArn() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribeRequest == false)
            return false;
        SubscribeRequest other = (SubscribeRequest) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null
                && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null
                && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null
                && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode
                + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode
                + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public SubscribeRequest clone() {
        return (SubscribeRequest) super.clone();
    }
}