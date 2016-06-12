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
 * <p>
 * Input for Publish action.
 * </p>
 */
public class PublishRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The topic you want to publish to.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * Either TopicArn or EndpointArn, but not both.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The message you want to send to the topic.
     * </p>
     * <p>
     * If you want to send the same message to all transport protocols, include
     * the text of the message as a String value.
     * </p>
     * <p>
     * If you want to send different messages for each transport protocol, set
     * the value of the <code>MessageStructure</code> parameter to
     * <code>json</code> and use a JSON object for the <code>Message</code>
     * parameter. See the Examples section for the format of the JSON object.
     * </p>
     * <p>
     * Constraints: Messages must be UTF-8 encoded strings at most 256 KB in
     * size (262144 bytes, not 262144 characters).
     * </p>
     * <p>
     * JSON-specific constraints:
     * <ul>
     * <li>Keys in the JSON object that correspond to supported transport
     * protocols must have simple JSON string values.</li>
     * <li>The values will be parsed (unescaped) before they are used in
     * outgoing messages.</li>
     * <li>Outbound notifications are JSON encoded (meaning that the characters
     * will be reescaped for sending).</li>
     * <li>Values have a minimum length of 0 (the empty string, "", is allowed).
     * </li>
     * <li>Values have a maximum length bounded by the overall message size (so,
     * including multiple protocols may limit message sizes).</li>
     * <li>Non-string values will cause the key to be ignored.</li>
     * <li>Keys that do not correspond to supported transport protocols are
     * ignored.</li>
     * <li>Duplicate keys are not allowed.</li>
     * <li>Failure to parse or validate any key or value in the message will
     * cause the <code>Publish</code> call to return an error (no partial
     * delivery).</li>
     * </ul>
     * </p>
     */
    private String message;
    /**
     * <p>
     * Optional parameter to be used as the "Subject" line when the message is
     * delivered to email endpoints. This field will also be included, if
     * present, in the standard JSON messages delivered to other endpoints.
     * </p>
     * <p>
     * Constraints: Subjects must be ASCII text that begins with a letter,
     * number, or punctuation mark; must not include line breaks or control
     * characters; and must be less than 100 characters long.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers and
     * a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>be a syntactically valid JSON object; and</li>
     * <li>contain at least a top-level JSON key of "default" with a value that
     * is a string.</li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (e.g., "http").
     * </p>
     * <p>
     * For information about sending different messages for each protocol using
     * the AWS Management Console, go to <a href=
     * "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     * >Create Different Messages for Each Protocol</a> in the <i>Amazon Simple
     * Notification Service Getting Started Guide</i>.
     * </p>
     * <p>
     * Valid value: <code>json</code>
     * </p>
     */
    private String messageStructure;
    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue> messageAttributes;

    /**
     * Default constructor for PublishRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public PublishRequest() {
    }

    /**
     * Constructs a new PublishRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param topicArn
     *        The topic you want to publish to.
     * @param message
     *        The message you want to send to the topic.</p>
     *        <p>
     *        If you want to send the same message to all transport protocols,
     *        include the text of the message as a String value.
     *        </p>
     *        <p>
     *        If you want to send different messages for each transport
     *        protocol, set the value of the <code>MessageStructure</code>
     *        parameter to <code>json</code> and use a JSON object for the
     *        <code>Message</code> parameter. See the Examples section for the
     *        format of the JSON object.
     *        </p>
     *        <p>
     *        Constraints: Messages must be UTF-8 encoded strings at most 256 KB
     *        in size (262144 bytes, not 262144 characters).
     *        </p>
     *        <p>
     *        JSON-specific constraints:
     *        <ul>
     *        <li>Keys in the JSON object that correspond to supported transport
     *        protocols must have simple JSON string values.</li>
     *        <li>The values will be parsed (unescaped) before they are used in
     *        outgoing messages.</li>
     *        <li>Outbound notifications are JSON encoded (meaning that the
     *        characters will be reescaped for sending).</li>
     *        <li>Values have a minimum length of 0 (the empty string, "", is
     *        allowed).</li>
     *        <li>Values have a maximum length bounded by the overall message
     *        size (so, including multiple protocols may limit message sizes).</li>
     *        <li>Non-string values will cause the key to be ignored.</li>
     *        <li>Keys that do not correspond to supported transport protocols
     *        are ignored.</li>
     *        <li>Duplicate keys are not allowed.</li>
     *        <li>Failure to parse or validate any key or value in the message
     *        will cause the <code>Publish</code> call to return an error (no
     *        partial delivery).</li>
     *        </ul>
     */
    public PublishRequest(String topicArn, String message) {
        setTopicArn(topicArn);
        setMessage(message);
    }

    /**
     * Constructs a new PublishRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param topicArn
     *        The topic you want to publish to.
     * @param message
     *        The message you want to send to the topic.</p>
     *        <p>
     *        If you want to send the same message to all transport protocols,
     *        include the text of the message as a String value.
     *        </p>
     *        <p>
     *        If you want to send different messages for each transport
     *        protocol, set the value of the <code>MessageStructure</code>
     *        parameter to <code>json</code> and use a JSON object for the
     *        <code>Message</code> parameter. See the Examples section for the
     *        format of the JSON object.
     *        </p>
     *        <p>
     *        Constraints: Messages must be UTF-8 encoded strings at most 256 KB
     *        in size (262144 bytes, not 262144 characters).
     *        </p>
     *        <p>
     *        JSON-specific constraints:
     *        <ul>
     *        <li>Keys in the JSON object that correspond to supported transport
     *        protocols must have simple JSON string values.</li>
     *        <li>The values will be parsed (unescaped) before they are used in
     *        outgoing messages.</li>
     *        <li>Outbound notifications are JSON encoded (meaning that the
     *        characters will be reescaped for sending).</li>
     *        <li>Values have a minimum length of 0 (the empty string, "", is
     *        allowed).</li>
     *        <li>Values have a maximum length bounded by the overall message
     *        size (so, including multiple protocols may limit message sizes).</li>
     *        <li>Non-string values will cause the key to be ignored.</li>
     *        <li>Keys that do not correspond to supported transport protocols
     *        are ignored.</li>
     *        <li>Duplicate keys are not allowed.</li>
     *        <li>Failure to parse or validate any key or value in the message
     *        will cause the <code>Publish</code> call to return an error (no
     *        partial delivery).</li>
     *        </ul>
     * @param subject
     *        Optional parameter to be used as the "Subject" line when the
     *        message is delivered to email endpoints. This field will also be
     *        included, if present, in the standard JSON messages delivered to
     *        other endpoints.
     *        </p>
     *        <p>
     *        Constraints: Subjects must be ASCII text that begins with a
     *        letter, number, or punctuation mark; must not include line breaks
     *        or control characters; and must be less than 100 characters long.
     */
    public PublishRequest(String topicArn, String message, String subject) {
        setTopicArn(topicArn);
        setMessage(message);
        setSubject(subject);
    }

    /**
     * <p>
     * The topic you want to publish to.
     * </p>
     * 
     * @param topicArn
     *        The topic you want to publish to.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The topic you want to publish to.
     * </p>
     * 
     * @return The topic you want to publish to.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The topic you want to publish to.
     * </p>
     * 
     * @param topicArn
     *        The topic you want to publish to.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishRequest withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * Either TopicArn or EndpointArn, but not both.
     * </p>
     * 
     * @param targetArn
     *        Either TopicArn or EndpointArn, but not both.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * Either TopicArn or EndpointArn, but not both.
     * </p>
     * 
     * @return Either TopicArn or EndpointArn, but not both.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * Either TopicArn or EndpointArn, but not both.
     * </p>
     * 
     * @param targetArn
     *        Either TopicArn or EndpointArn, but not both.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishRequest withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The message you want to send to the topic.
     * </p>
     * <p>
     * If you want to send the same message to all transport protocols, include
     * the text of the message as a String value.
     * </p>
     * <p>
     * If you want to send different messages for each transport protocol, set
     * the value of the <code>MessageStructure</code> parameter to
     * <code>json</code> and use a JSON object for the <code>Message</code>
     * parameter. See the Examples section for the format of the JSON object.
     * </p>
     * <p>
     * Constraints: Messages must be UTF-8 encoded strings at most 256 KB in
     * size (262144 bytes, not 262144 characters).
     * </p>
     * <p>
     * JSON-specific constraints:
     * <ul>
     * <li>Keys in the JSON object that correspond to supported transport
     * protocols must have simple JSON string values.</li>
     * <li>The values will be parsed (unescaped) before they are used in
     * outgoing messages.</li>
     * <li>Outbound notifications are JSON encoded (meaning that the characters
     * will be reescaped for sending).</li>
     * <li>Values have a minimum length of 0 (the empty string, "", is allowed).
     * </li>
     * <li>Values have a maximum length bounded by the overall message size (so,
     * including multiple protocols may limit message sizes).</li>
     * <li>Non-string values will cause the key to be ignored.</li>
     * <li>Keys that do not correspond to supported transport protocols are
     * ignored.</li>
     * <li>Duplicate keys are not allowed.</li>
     * <li>Failure to parse or validate any key or value in the message will
     * cause the <code>Publish</code> call to return an error (no partial
     * delivery).</li>
     * </ul>
     * </p>
     * 
     * @param message
     *        The message you want to send to the topic.</p>
     *        <p>
     *        If you want to send the same message to all transport protocols,
     *        include the text of the message as a String value.
     *        </p>
     *        <p>
     *        If you want to send different messages for each transport
     *        protocol, set the value of the <code>MessageStructure</code>
     *        parameter to <code>json</code> and use a JSON object for the
     *        <code>Message</code> parameter. See the Examples section for the
     *        format of the JSON object.
     *        </p>
     *        <p>
     *        Constraints: Messages must be UTF-8 encoded strings at most 256 KB
     *        in size (262144 bytes, not 262144 characters).
     *        </p>
     *        <p>
     *        JSON-specific constraints:
     *        <ul>
     *        <li>Keys in the JSON object that correspond to supported transport
     *        protocols must have simple JSON string values.</li>
     *        <li>The values will be parsed (unescaped) before they are used in
     *        outgoing messages.</li>
     *        <li>Outbound notifications are JSON encoded (meaning that the
     *        characters will be reescaped for sending).</li>
     *        <li>Values have a minimum length of 0 (the empty string, "", is
     *        allowed).</li>
     *        <li>Values have a maximum length bounded by the overall message
     *        size (so, including multiple protocols may limit message sizes).</li>
     *        <li>Non-string values will cause the key to be ignored.</li>
     *        <li>Keys that do not correspond to supported transport protocols
     *        are ignored.</li>
     *        <li>Duplicate keys are not allowed.</li>
     *        <li>Failure to parse or validate any key or value in the message
     *        will cause the <code>Publish</code> call to return an error (no
     *        partial delivery).</li>
     *        </ul>
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message you want to send to the topic.
     * </p>
     * <p>
     * If you want to send the same message to all transport protocols, include
     * the text of the message as a String value.
     * </p>
     * <p>
     * If you want to send different messages for each transport protocol, set
     * the value of the <code>MessageStructure</code> parameter to
     * <code>json</code> and use a JSON object for the <code>Message</code>
     * parameter. See the Examples section for the format of the JSON object.
     * </p>
     * <p>
     * Constraints: Messages must be UTF-8 encoded strings at most 256 KB in
     * size (262144 bytes, not 262144 characters).
     * </p>
     * <p>
     * JSON-specific constraints:
     * <ul>
     * <li>Keys in the JSON object that correspond to supported transport
     * protocols must have simple JSON string values.</li>
     * <li>The values will be parsed (unescaped) before they are used in
     * outgoing messages.</li>
     * <li>Outbound notifications are JSON encoded (meaning that the characters
     * will be reescaped for sending).</li>
     * <li>Values have a minimum length of 0 (the empty string, "", is allowed).
     * </li>
     * <li>Values have a maximum length bounded by the overall message size (so,
     * including multiple protocols may limit message sizes).</li>
     * <li>Non-string values will cause the key to be ignored.</li>
     * <li>Keys that do not correspond to supported transport protocols are
     * ignored.</li>
     * <li>Duplicate keys are not allowed.</li>
     * <li>Failure to parse or validate any key or value in the message will
     * cause the <code>Publish</code> call to return an error (no partial
     * delivery).</li>
     * </ul>
     * </p>
     * 
     * @return The message you want to send to the topic.</p>
     *         <p>
     *         If you want to send the same message to all transport protocols,
     *         include the text of the message as a String value.
     *         </p>
     *         <p>
     *         If you want to send different messages for each transport
     *         protocol, set the value of the <code>MessageStructure</code>
     *         parameter to <code>json</code> and use a JSON object for the
     *         <code>Message</code> parameter. See the Examples section for the
     *         format of the JSON object.
     *         </p>
     *         <p>
     *         Constraints: Messages must be UTF-8 encoded strings at most 256
     *         KB in size (262144 bytes, not 262144 characters).
     *         </p>
     *         <p>
     *         JSON-specific constraints:
     *         <ul>
     *         <li>Keys in the JSON object that correspond to supported
     *         transport protocols must have simple JSON string values.</li>
     *         <li>The values will be parsed (unescaped) before they are used in
     *         outgoing messages.</li>
     *         <li>Outbound notifications are JSON encoded (meaning that the
     *         characters will be reescaped for sending).</li>
     *         <li>Values have a minimum length of 0 (the empty string, "", is
     *         allowed).</li>
     *         <li>Values have a maximum length bounded by the overall message
     *         size (so, including multiple protocols may limit message sizes).</li>
     *         <li>Non-string values will cause the key to be ignored.</li>
     *         <li>Keys that do not correspond to supported transport protocols
     *         are ignored.</li>
     *         <li>Duplicate keys are not allowed.</li>
     *         <li>Failure to parse or validate any key or value in the message
     *         will cause the <code>Publish</code> call to return an error (no
     *         partial delivery).</li>
     *         </ul>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message you want to send to the topic.
     * </p>
     * <p>
     * If you want to send the same message to all transport protocols, include
     * the text of the message as a String value.
     * </p>
     * <p>
     * If you want to send different messages for each transport protocol, set
     * the value of the <code>MessageStructure</code> parameter to
     * <code>json</code> and use a JSON object for the <code>Message</code>
     * parameter. See the Examples section for the format of the JSON object.
     * </p>
     * <p>
     * Constraints: Messages must be UTF-8 encoded strings at most 256 KB in
     * size (262144 bytes, not 262144 characters).
     * </p>
     * <p>
     * JSON-specific constraints:
     * <ul>
     * <li>Keys in the JSON object that correspond to supported transport
     * protocols must have simple JSON string values.</li>
     * <li>The values will be parsed (unescaped) before they are used in
     * outgoing messages.</li>
     * <li>Outbound notifications are JSON encoded (meaning that the characters
     * will be reescaped for sending).</li>
     * <li>Values have a minimum length of 0 (the empty string, "", is allowed).
     * </li>
     * <li>Values have a maximum length bounded by the overall message size (so,
     * including multiple protocols may limit message sizes).</li>
     * <li>Non-string values will cause the key to be ignored.</li>
     * <li>Keys that do not correspond to supported transport protocols are
     * ignored.</li>
     * <li>Duplicate keys are not allowed.</li>
     * <li>Failure to parse or validate any key or value in the message will
     * cause the <code>Publish</code> call to return an error (no partial
     * delivery).</li>
     * </ul>
     * </p>
     * 
     * @param message
     *        The message you want to send to the topic.</p>
     *        <p>
     *        If you want to send the same message to all transport protocols,
     *        include the text of the message as a String value.
     *        </p>
     *        <p>
     *        If you want to send different messages for each transport
     *        protocol, set the value of the <code>MessageStructure</code>
     *        parameter to <code>json</code> and use a JSON object for the
     *        <code>Message</code> parameter. See the Examples section for the
     *        format of the JSON object.
     *        </p>
     *        <p>
     *        Constraints: Messages must be UTF-8 encoded strings at most 256 KB
     *        in size (262144 bytes, not 262144 characters).
     *        </p>
     *        <p>
     *        JSON-specific constraints:
     *        <ul>
     *        <li>Keys in the JSON object that correspond to supported transport
     *        protocols must have simple JSON string values.</li>
     *        <li>The values will be parsed (unescaped) before they are used in
     *        outgoing messages.</li>
     *        <li>Outbound notifications are JSON encoded (meaning that the
     *        characters will be reescaped for sending).</li>
     *        <li>Values have a minimum length of 0 (the empty string, "", is
     *        allowed).</li>
     *        <li>Values have a maximum length bounded by the overall message
     *        size (so, including multiple protocols may limit message sizes).</li>
     *        <li>Non-string values will cause the key to be ignored.</li>
     *        <li>Keys that do not correspond to supported transport protocols
     *        are ignored.</li>
     *        <li>Duplicate keys are not allowed.</li>
     *        <li>Failure to parse or validate any key or value in the message
     *        will cause the <code>Publish</code> call to return an error (no
     *        partial delivery).</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishRequest withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Optional parameter to be used as the "Subject" line when the message is
     * delivered to email endpoints. This field will also be included, if
     * present, in the standard JSON messages delivered to other endpoints.
     * </p>
     * <p>
     * Constraints: Subjects must be ASCII text that begins with a letter,
     * number, or punctuation mark; must not include line breaks or control
     * characters; and must be less than 100 characters long.
     * </p>
     * 
     * @param subject
     *        Optional parameter to be used as the "Subject" line when the
     *        message is delivered to email endpoints. This field will also be
     *        included, if present, in the standard JSON messages delivered to
     *        other endpoints.</p>
     *        <p>
     *        Constraints: Subjects must be ASCII text that begins with a
     *        letter, number, or punctuation mark; must not include line breaks
     *        or control characters; and must be less than 100 characters long.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * Optional parameter to be used as the "Subject" line when the message is
     * delivered to email endpoints. This field will also be included, if
     * present, in the standard JSON messages delivered to other endpoints.
     * </p>
     * <p>
     * Constraints: Subjects must be ASCII text that begins with a letter,
     * number, or punctuation mark; must not include line breaks or control
     * characters; and must be less than 100 characters long.
     * </p>
     * 
     * @return Optional parameter to be used as the "Subject" line when the
     *         message is delivered to email endpoints. This field will also be
     *         included, if present, in the standard JSON messages delivered to
     *         other endpoints.</p>
     *         <p>
     *         Constraints: Subjects must be ASCII text that begins with a
     *         letter, number, or punctuation mark; must not include line breaks
     *         or control characters; and must be less than 100 characters long.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * Optional parameter to be used as the "Subject" line when the message is
     * delivered to email endpoints. This field will also be included, if
     * present, in the standard JSON messages delivered to other endpoints.
     * </p>
     * <p>
     * Constraints: Subjects must be ASCII text that begins with a letter,
     * number, or punctuation mark; must not include line breaks or control
     * characters; and must be less than 100 characters long.
     * </p>
     * 
     * @param subject
     *        Optional parameter to be used as the "Subject" line when the
     *        message is delivered to email endpoints. This field will also be
     *        included, if present, in the standard JSON messages delivered to
     *        other endpoints.</p>
     *        <p>
     *        Constraints: Subjects must be ASCII text that begins with a
     *        letter, number, or punctuation mark; must not include line breaks
     *        or control characters; and must be less than 100 characters long.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishRequest withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers and
     * a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>be a syntactically valid JSON object; and</li>
     * <li>contain at least a top-level JSON key of "default" with a value that
     * is a string.</li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (e.g., "http").
     * </p>
     * <p>
     * For information about sending different messages for each protocol using
     * the AWS Management Console, go to <a href=
     * "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     * >Create Different Messages for Each Protocol</a> in the <i>Amazon Simple
     * Notification Service Getting Started Guide</i>.
     * </p>
     * <p>
     * Valid value: <code>json</code>
     * </p>
     * 
     * @param messageStructure
     *        Set <code>MessageStructure</code> to <code>json</code> if you want
     *        to send a different message for each protocol. For example, using
     *        one publish action, you can send a short message to your SMS
     *        subscribers and a longer message to your email subscribers. If you
     *        set <code>MessageStructure</code> to <code>json</code>, the value
     *        of the <code>Message</code> parameter must: </p>
     *        <ul>
     *        <li>be a syntactically valid JSON object; and</li>
     *        <li>contain at least a top-level JSON key of "default" with a
     *        value that is a string.</li>
     *        </ul>
     *        <p>
     *        You can define other top-level keys that define the message you
     *        want to send to a specific transport protocol (e.g., "http").
     *        </p>
     *        <p>
     *        For information about sending different messages for each protocol
     *        using the AWS Management Console, go to <a href=
     *        "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     *        >Create Different Messages for Each Protocol</a> in the <i>Amazon
     *        Simple Notification Service Getting Started Guide</i>.
     *        </p>
     *        <p>
     *        Valid value: <code>json</code>
     */

    public void setMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
    }

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers and
     * a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>be a syntactically valid JSON object; and</li>
     * <li>contain at least a top-level JSON key of "default" with a value that
     * is a string.</li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (e.g., "http").
     * </p>
     * <p>
     * For information about sending different messages for each protocol using
     * the AWS Management Console, go to <a href=
     * "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     * >Create Different Messages for Each Protocol</a> in the <i>Amazon Simple
     * Notification Service Getting Started Guide</i>.
     * </p>
     * <p>
     * Valid value: <code>json</code>
     * </p>
     * 
     * @return Set <code>MessageStructure</code> to <code>json</code> if you
     *         want to send a different message for each protocol. For example,
     *         using one publish action, you can send a short message to your
     *         SMS subscribers and a longer message to your email subscribers.
     *         If you set <code>MessageStructure</code> to <code>json</code>,
     *         the value of the <code>Message</code> parameter must: </p>
     *         <ul>
     *         <li>be a syntactically valid JSON object; and</li>
     *         <li>contain at least a top-level JSON key of "default" with a
     *         value that is a string.</li>
     *         </ul>
     *         <p>
     *         You can define other top-level keys that define the message you
     *         want to send to a specific transport protocol (e.g., "http").
     *         </p>
     *         <p>
     *         For information about sending different messages for each
     *         protocol using the AWS Management Console, go to <a href=
     *         "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     *         >Create Different Messages for Each Protocol</a> in the <i>Amazon
     *         Simple Notification Service Getting Started Guide</i>.
     *         </p>
     *         <p>
     *         Valid value: <code>json</code>
     */

    public String getMessageStructure() {
        return this.messageStructure;
    }

    /**
     * <p>
     * Set <code>MessageStructure</code> to <code>json</code> if you want to
     * send a different message for each protocol. For example, using one
     * publish action, you can send a short message to your SMS subscribers and
     * a longer message to your email subscribers. If you set
     * <code>MessageStructure</code> to <code>json</code>, the value of the
     * <code>Message</code> parameter must:
     * </p>
     * <ul>
     * <li>be a syntactically valid JSON object; and</li>
     * <li>contain at least a top-level JSON key of "default" with a value that
     * is a string.</li>
     * </ul>
     * <p>
     * You can define other top-level keys that define the message you want to
     * send to a specific transport protocol (e.g., "http").
     * </p>
     * <p>
     * For information about sending different messages for each protocol using
     * the AWS Management Console, go to <a href=
     * "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     * >Create Different Messages for Each Protocol</a> in the <i>Amazon Simple
     * Notification Service Getting Started Guide</i>.
     * </p>
     * <p>
     * Valid value: <code>json</code>
     * </p>
     * 
     * @param messageStructure
     *        Set <code>MessageStructure</code> to <code>json</code> if you want
     *        to send a different message for each protocol. For example, using
     *        one publish action, you can send a short message to your SMS
     *        subscribers and a longer message to your email subscribers. If you
     *        set <code>MessageStructure</code> to <code>json</code>, the value
     *        of the <code>Message</code> parameter must: </p>
     *        <ul>
     *        <li>be a syntactically valid JSON object; and</li>
     *        <li>contain at least a top-level JSON key of "default" with a
     *        value that is a string.</li>
     *        </ul>
     *        <p>
     *        You can define other top-level keys that define the message you
     *        want to send to a specific transport protocol (e.g., "http").
     *        </p>
     *        <p>
     *        For information about sending different messages for each protocol
     *        using the AWS Management Console, go to <a href=
     *        "http://docs.aws.amazon.com/sns/latest/gsg/Publish.html#sns-message-formatting-by-protocol"
     *        >Create Different Messages for Each Protocol</a> in the <i>Amazon
     *        Simple Notification Service Getting Started Guide</i>.
     *        </p>
     *        <p>
     *        Valid value: <code>json</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishRequest withMessageStructure(String messageStructure) {
        setMessageStructure(messageStructure);
        return this;
    }

    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     * 
     * @return Message attributes for Publish action.
     */

    public java.util.Map<String, MessageAttributeValue> getMessageAttributes() {
        if (messageAttributes == null) {
            messageAttributes = new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>();
        }
        return messageAttributes;
    }

    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     * 
     * @param messageAttributes
     *        Message attributes for Publish action.
     */

    public void setMessageAttributes(
            java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes == null ? null
                : new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>(
                        messageAttributes);
    }

    /**
     * <p>
     * Message attributes for Publish action.
     * </p>
     * 
     * @param messageAttributes
     *        Message attributes for Publish action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublishRequest withMessageAttributes(
            java.util.Map<String, MessageAttributeValue> messageAttributes) {
        setMessageAttributes(messageAttributes);
        return this;
    }

    public PublishRequest addMessageAttributesEntry(String key,
            MessageAttributeValue value) {
        if (null == this.messageAttributes) {
            this.messageAttributes = new com.amazonaws.internal.SdkInternalMap<String, MessageAttributeValue>();
        }
        if (this.messageAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.messageAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MessageAttributes. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */

    public PublishRequest clearMessageAttributesEntries() {
        this.messageAttributes = null;
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
        if (getTargetArn() != null)
            sb.append("TargetArn: " + getTargetArn() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getSubject() != null)
            sb.append("Subject: " + getSubject() + ",");
        if (getMessageStructure() != null)
            sb.append("MessageStructure: " + getMessageStructure() + ",");
        if (getMessageAttributes() != null)
            sb.append("MessageAttributes: " + getMessageAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishRequest == false)
            return false;
        PublishRequest other = (PublishRequest) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null
                && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null
                && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null
                && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null
                && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getMessageStructure() == null
                ^ this.getMessageStructure() == null)
            return false;
        if (other.getMessageStructure() != null
                && other.getMessageStructure().equals(
                        this.getMessageStructure()) == false)
            return false;
        if (other.getMessageAttributes() == null
                ^ this.getMessageAttributes() == null)
            return false;
        if (other.getMessageAttributes() != null
                && other.getMessageAttributes().equals(
                        this.getMessageAttributes()) == false)
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
                + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode
                + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime
                * hashCode
                + ((getMessageStructure() == null) ? 0 : getMessageStructure()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMessageAttributes() == null) ? 0
                        : getMessageAttributes().hashCode());
        return hashCode;
    }

    @Override
    public PublishRequest clone() {
        return (PublishRequest) super.clone();
    }
}