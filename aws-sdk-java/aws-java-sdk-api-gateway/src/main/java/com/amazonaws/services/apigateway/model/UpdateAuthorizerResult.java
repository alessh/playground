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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an authorization layer for methods. If enabled on a method, API
 * Gateway will activate the authorizer when a client calls the method.
 * </p>
 */
public class UpdateAuthorizerResult implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the authorizer resource.
     * </p>
     */
    private String id;
    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     */
    private String name;
    /**
     * <p>
     * [Required] The type of the authorizer. Currently, the only valid type is
     * TOKEN.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Optional customer-defined field, used in Swagger imports/exports. Has no
     * functional impact.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * [Required] Specifies the authorizer's Uniform Resource Identifier (URI).
     * For TOKEN authorizers, this must be a well-formed Lambda function URI.
     * The URI should be of the form
     * <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>.
     * <code>Region</code> is used to determine the right endpoint. In this
     * case, <code>path</code> is used to indicate that the remaining substring
     * in the URI should be treated as the path to the resource, including the
     * initial <code>/</code>. For Lambda functions, this is usually of the form
     * /2015-03-31/functions/[FunctionARN]/invocations
     * </p>
     */
    private String authorizerUri;
    /**
     * <p>
     * Specifies the credentials required for the authorizer, if any. Two
     * options are available. To specify an IAM Role for Amazon API Gateway to
     * assume, use the role's Amazon Resource Name (ARN). To use resource-based
     * permissions on the Lambda function, specify null.
     * </p>
     */
    private String authorizerCredentials;
    /**
     * <p>
     * [Required] The source of the identity in an incoming request. For TOKEN
     * authorizers, this value is a mapping expression with the same syntax as
     * integration parameter mappings. The only valid source for tokens is
     * 'header', so the expression should match
     * 'method.request.header.[headerName]'. The value of the header
     * '[headerName]' will be interpreted as the incoming token.
     * </p>
     */
    private String identitySource;
    /**
     * <p>
     * A validation expression for the incoming identity. For TOKEN authorizers,
     * this value should be a regular expression. The incoming token from the
     * client is matched against this expression, and will proceed if the token
     * matches. If the token doesn't match, the client receives a 401
     * Unauthorized response.
     * </p>
     */
    private String identityValidationExpression;
    /**
     * <p>
     * The TTL in seconds of cached authorizer results. If greater than 0, API
     * Gateway will cache authorizer responses. If this field is not set, the
     * default value is 300. The maximum value is 3600, or 1 hour.
     * </p>
     */
    private Integer authorizerResultTtlInSeconds;

    /**
     * <p>
     * The identifier for the authorizer resource.
     * </p>
     * 
     * @param id
     *        The identifier for the authorizer resource.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the authorizer resource.
     * </p>
     * 
     * @return The identifier for the authorizer resource.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the authorizer resource.
     * </p>
     * 
     * @param id
     *        The identifier for the authorizer resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateAuthorizerResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     * 
     * @param name
     *        [Required] The name of the authorizer.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     * 
     * @return [Required] The name of the authorizer.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * [Required] The name of the authorizer.
     * </p>
     * 
     * @param name
     *        [Required] The name of the authorizer.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateAuthorizerResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * [Required] The type of the authorizer. Currently, the only valid type is
     * TOKEN.
     * </p>
     * 
     * @param type
     *        [Required] The type of the authorizer. Currently, the only valid
     *        type is TOKEN.
     * @see AuthorizerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * [Required] The type of the authorizer. Currently, the only valid type is
     * TOKEN.
     * </p>
     * 
     * @return [Required] The type of the authorizer. Currently, the only valid
     *         type is TOKEN.
     * @see AuthorizerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * [Required] The type of the authorizer. Currently, the only valid type is
     * TOKEN.
     * </p>
     * 
     * @param type
     *        [Required] The type of the authorizer. Currently, the only valid
     *        type is TOKEN.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AuthorizerType
     */

    public UpdateAuthorizerResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * [Required] The type of the authorizer. Currently, the only valid type is
     * TOKEN.
     * </p>
     * 
     * @param type
     *        [Required] The type of the authorizer. Currently, the only valid
     *        type is TOKEN.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AuthorizerType
     */

    public void setType(AuthorizerType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * [Required] The type of the authorizer. Currently, the only valid type is
     * TOKEN.
     * </p>
     * 
     * @param type
     *        [Required] The type of the authorizer. Currently, the only valid
     *        type is TOKEN.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AuthorizerType
     */

    public UpdateAuthorizerResult withType(AuthorizerType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Optional customer-defined field, used in Swagger imports/exports. Has no
     * functional impact.
     * </p>
     * 
     * @param authType
     *        Optional customer-defined field, used in Swagger imports/exports.
     *        Has no functional impact.
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * Optional customer-defined field, used in Swagger imports/exports. Has no
     * functional impact.
     * </p>
     * 
     * @return Optional customer-defined field, used in Swagger imports/exports.
     *         Has no functional impact.
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * Optional customer-defined field, used in Swagger imports/exports. Has no
     * functional impact.
     * </p>
     * 
     * @param authType
     *        Optional customer-defined field, used in Swagger imports/exports.
     *        Has no functional impact.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateAuthorizerResult withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * [Required] Specifies the authorizer's Uniform Resource Identifier (URI).
     * For TOKEN authorizers, this must be a well-formed Lambda function URI.
     * The URI should be of the form
     * <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>.
     * <code>Region</code> is used to determine the right endpoint. In this
     * case, <code>path</code> is used to indicate that the remaining substring
     * in the URI should be treated as the path to the resource, including the
     * initial <code>/</code>. For Lambda functions, this is usually of the form
     * /2015-03-31/functions/[FunctionARN]/invocations
     * </p>
     * 
     * @param authorizerUri
     *        [Required] Specifies the authorizer's Uniform Resource Identifier
     *        (URI). For TOKEN authorizers, this must be a well-formed Lambda
     *        function URI. The URI should be of the form
     *        <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>
     *        . <code>Region</code> is used to determine the right endpoint. In
     *        this case, <code>path</code> is used to indicate that the
     *        remaining substring in the URI should be treated as the path to
     *        the resource, including the initial <code>/</code>. For Lambda
     *        functions, this is usually of the form
     *        /2015-03-31/functions/[FunctionARN]/invocations
     */

    public void setAuthorizerUri(String authorizerUri) {
        this.authorizerUri = authorizerUri;
    }

    /**
     * <p>
     * [Required] Specifies the authorizer's Uniform Resource Identifier (URI).
     * For TOKEN authorizers, this must be a well-formed Lambda function URI.
     * The URI should be of the form
     * <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>.
     * <code>Region</code> is used to determine the right endpoint. In this
     * case, <code>path</code> is used to indicate that the remaining substring
     * in the URI should be treated as the path to the resource, including the
     * initial <code>/</code>. For Lambda functions, this is usually of the form
     * /2015-03-31/functions/[FunctionARN]/invocations
     * </p>
     * 
     * @return [Required] Specifies the authorizer's Uniform Resource Identifier
     *         (URI). For TOKEN authorizers, this must be a well-formed Lambda
     *         function URI. The URI should be of the form
     *         <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>
     *         . <code>Region</code> is used to determine the right endpoint. In
     *         this case, <code>path</code> is used to indicate that the
     *         remaining substring in the URI should be treated as the path to
     *         the resource, including the initial <code>/</code>. For Lambda
     *         functions, this is usually of the form
     *         /2015-03-31/functions/[FunctionARN]/invocations
     */

    public String getAuthorizerUri() {
        return this.authorizerUri;
    }

    /**
     * <p>
     * [Required] Specifies the authorizer's Uniform Resource Identifier (URI).
     * For TOKEN authorizers, this must be a well-formed Lambda function URI.
     * The URI should be of the form
     * <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>.
     * <code>Region</code> is used to determine the right endpoint. In this
     * case, <code>path</code> is used to indicate that the remaining substring
     * in the URI should be treated as the path to the resource, including the
     * initial <code>/</code>. For Lambda functions, this is usually of the form
     * /2015-03-31/functions/[FunctionARN]/invocations
     * </p>
     * 
     * @param authorizerUri
     *        [Required] Specifies the authorizer's Uniform Resource Identifier
     *        (URI). For TOKEN authorizers, this must be a well-formed Lambda
     *        function URI. The URI should be of the form
     *        <code>arn:aws:apigateway:{region}:lambda:path/{service_api}</code>
     *        . <code>Region</code> is used to determine the right endpoint. In
     *        this case, <code>path</code> is used to indicate that the
     *        remaining substring in the URI should be treated as the path to
     *        the resource, including the initial <code>/</code>. For Lambda
     *        functions, this is usually of the form
     *        /2015-03-31/functions/[FunctionARN]/invocations
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateAuthorizerResult withAuthorizerUri(String authorizerUri) {
        setAuthorizerUri(authorizerUri);
        return this;
    }

    /**
     * <p>
     * Specifies the credentials required for the authorizer, if any. Two
     * options are available. To specify an IAM Role for Amazon API Gateway to
     * assume, use the role's Amazon Resource Name (ARN). To use resource-based
     * permissions on the Lambda function, specify null.
     * </p>
     * 
     * @param authorizerCredentials
     *        Specifies the credentials required for the authorizer, if any. Two
     *        options are available. To specify an IAM Role for Amazon API
     *        Gateway to assume, use the role's Amazon Resource Name (ARN). To
     *        use resource-based permissions on the Lambda function, specify
     *        null.
     */

    public void setAuthorizerCredentials(String authorizerCredentials) {
        this.authorizerCredentials = authorizerCredentials;
    }

    /**
     * <p>
     * Specifies the credentials required for the authorizer, if any. Two
     * options are available. To specify an IAM Role for Amazon API Gateway to
     * assume, use the role's Amazon Resource Name (ARN). To use resource-based
     * permissions on the Lambda function, specify null.
     * </p>
     * 
     * @return Specifies the credentials required for the authorizer, if any.
     *         Two options are available. To specify an IAM Role for Amazon API
     *         Gateway to assume, use the role's Amazon Resource Name (ARN). To
     *         use resource-based permissions on the Lambda function, specify
     *         null.
     */

    public String getAuthorizerCredentials() {
        return this.authorizerCredentials;
    }

    /**
     * <p>
     * Specifies the credentials required for the authorizer, if any. Two
     * options are available. To specify an IAM Role for Amazon API Gateway to
     * assume, use the role's Amazon Resource Name (ARN). To use resource-based
     * permissions on the Lambda function, specify null.
     * </p>
     * 
     * @param authorizerCredentials
     *        Specifies the credentials required for the authorizer, if any. Two
     *        options are available. To specify an IAM Role for Amazon API
     *        Gateway to assume, use the role's Amazon Resource Name (ARN). To
     *        use resource-based permissions on the Lambda function, specify
     *        null.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateAuthorizerResult withAuthorizerCredentials(
            String authorizerCredentials) {
        setAuthorizerCredentials(authorizerCredentials);
        return this;
    }

    /**
     * <p>
     * [Required] The source of the identity in an incoming request. For TOKEN
     * authorizers, this value is a mapping expression with the same syntax as
     * integration parameter mappings. The only valid source for tokens is
     * 'header', so the expression should match
     * 'method.request.header.[headerName]'. The value of the header
     * '[headerName]' will be interpreted as the incoming token.
     * </p>
     * 
     * @param identitySource
     *        [Required] The source of the identity in an incoming request. For
     *        TOKEN authorizers, this value is a mapping expression with the
     *        same syntax as integration parameter mappings. The only valid
     *        source for tokens is 'header', so the expression should match
     *        'method.request.header.[headerName]'. The value of the header
     *        '[headerName]' will be interpreted as the incoming token.
     */

    public void setIdentitySource(String identitySource) {
        this.identitySource = identitySource;
    }

    /**
     * <p>
     * [Required] The source of the identity in an incoming request. For TOKEN
     * authorizers, this value is a mapping expression with the same syntax as
     * integration parameter mappings. The only valid source for tokens is
     * 'header', so the expression should match
     * 'method.request.header.[headerName]'. The value of the header
     * '[headerName]' will be interpreted as the incoming token.
     * </p>
     * 
     * @return [Required] The source of the identity in an incoming request. For
     *         TOKEN authorizers, this value is a mapping expression with the
     *         same syntax as integration parameter mappings. The only valid
     *         source for tokens is 'header', so the expression should match
     *         'method.request.header.[headerName]'. The value of the header
     *         '[headerName]' will be interpreted as the incoming token.
     */

    public String getIdentitySource() {
        return this.identitySource;
    }

    /**
     * <p>
     * [Required] The source of the identity in an incoming request. For TOKEN
     * authorizers, this value is a mapping expression with the same syntax as
     * integration parameter mappings. The only valid source for tokens is
     * 'header', so the expression should match
     * 'method.request.header.[headerName]'. The value of the header
     * '[headerName]' will be interpreted as the incoming token.
     * </p>
     * 
     * @param identitySource
     *        [Required] The source of the identity in an incoming request. For
     *        TOKEN authorizers, this value is a mapping expression with the
     *        same syntax as integration parameter mappings. The only valid
     *        source for tokens is 'header', so the expression should match
     *        'method.request.header.[headerName]'. The value of the header
     *        '[headerName]' will be interpreted as the incoming token.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateAuthorizerResult withIdentitySource(String identitySource) {
        setIdentitySource(identitySource);
        return this;
    }

    /**
     * <p>
     * A validation expression for the incoming identity. For TOKEN authorizers,
     * this value should be a regular expression. The incoming token from the
     * client is matched against this expression, and will proceed if the token
     * matches. If the token doesn't match, the client receives a 401
     * Unauthorized response.
     * </p>
     * 
     * @param identityValidationExpression
     *        A validation expression for the incoming identity. For TOKEN
     *        authorizers, this value should be a regular expression. The
     *        incoming token from the client is matched against this expression,
     *        and will proceed if the token matches. If the token doesn't match,
     *        the client receives a 401 Unauthorized response.
     */

    public void setIdentityValidationExpression(
            String identityValidationExpression) {
        this.identityValidationExpression = identityValidationExpression;
    }

    /**
     * <p>
     * A validation expression for the incoming identity. For TOKEN authorizers,
     * this value should be a regular expression. The incoming token from the
     * client is matched against this expression, and will proceed if the token
     * matches. If the token doesn't match, the client receives a 401
     * Unauthorized response.
     * </p>
     * 
     * @return A validation expression for the incoming identity. For TOKEN
     *         authorizers, this value should be a regular expression. The
     *         incoming token from the client is matched against this
     *         expression, and will proceed if the token matches. If the token
     *         doesn't match, the client receives a 401 Unauthorized response.
     */

    public String getIdentityValidationExpression() {
        return this.identityValidationExpression;
    }

    /**
     * <p>
     * A validation expression for the incoming identity. For TOKEN authorizers,
     * this value should be a regular expression. The incoming token from the
     * client is matched against this expression, and will proceed if the token
     * matches. If the token doesn't match, the client receives a 401
     * Unauthorized response.
     * </p>
     * 
     * @param identityValidationExpression
     *        A validation expression for the incoming identity. For TOKEN
     *        authorizers, this value should be a regular expression. The
     *        incoming token from the client is matched against this expression,
     *        and will proceed if the token matches. If the token doesn't match,
     *        the client receives a 401 Unauthorized response.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateAuthorizerResult withIdentityValidationExpression(
            String identityValidationExpression) {
        setIdentityValidationExpression(identityValidationExpression);
        return this;
    }

    /**
     * <p>
     * The TTL in seconds of cached authorizer results. If greater than 0, API
     * Gateway will cache authorizer responses. If this field is not set, the
     * default value is 300. The maximum value is 3600, or 1 hour.
     * </p>
     * 
     * @param authorizerResultTtlInSeconds
     *        The TTL in seconds of cached authorizer results. If greater than
     *        0, API Gateway will cache authorizer responses. If this field is
     *        not set, the default value is 300. The maximum value is 3600, or 1
     *        hour.
     */

    public void setAuthorizerResultTtlInSeconds(
            Integer authorizerResultTtlInSeconds) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * The TTL in seconds of cached authorizer results. If greater than 0, API
     * Gateway will cache authorizer responses. If this field is not set, the
     * default value is 300. The maximum value is 3600, or 1 hour.
     * </p>
     * 
     * @return The TTL in seconds of cached authorizer results. If greater than
     *         0, API Gateway will cache authorizer responses. If this field is
     *         not set, the default value is 300. The maximum value is 3600, or
     *         1 hour.
     */

    public Integer getAuthorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds;
    }

    /**
     * <p>
     * The TTL in seconds of cached authorizer results. If greater than 0, API
     * Gateway will cache authorizer responses. If this field is not set, the
     * default value is 300. The maximum value is 3600, or 1 hour.
     * </p>
     * 
     * @param authorizerResultTtlInSeconds
     *        The TTL in seconds of cached authorizer results. If greater than
     *        0, API Gateway will cache authorizer responses. If this field is
     *        not set, the default value is 300. The maximum value is 3600, or 1
     *        hour.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateAuthorizerResult withAuthorizerResultTtlInSeconds(
            Integer authorizerResultTtlInSeconds) {
        setAuthorizerResultTtlInSeconds(authorizerResultTtlInSeconds);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getAuthType() != null)
            sb.append("AuthType: " + getAuthType() + ",");
        if (getAuthorizerUri() != null)
            sb.append("AuthorizerUri: " + getAuthorizerUri() + ",");
        if (getAuthorizerCredentials() != null)
            sb.append("AuthorizerCredentials: " + getAuthorizerCredentials()
                    + ",");
        if (getIdentitySource() != null)
            sb.append("IdentitySource: " + getIdentitySource() + ",");
        if (getIdentityValidationExpression() != null)
            sb.append("IdentityValidationExpression: "
                    + getIdentityValidationExpression() + ",");
        if (getAuthorizerResultTtlInSeconds() != null)
            sb.append("AuthorizerResultTtlInSeconds: "
                    + getAuthorizerResultTtlInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAuthorizerResult == false)
            return false;
        UpdateAuthorizerResult other = (UpdateAuthorizerResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null
                && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null
                && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getAuthorizerUri() == null ^ this.getAuthorizerUri() == null)
            return false;
        if (other.getAuthorizerUri() != null
                && other.getAuthorizerUri().equals(this.getAuthorizerUri()) == false)
            return false;
        if (other.getAuthorizerCredentials() == null
                ^ this.getAuthorizerCredentials() == null)
            return false;
        if (other.getAuthorizerCredentials() != null
                && other.getAuthorizerCredentials().equals(
                        this.getAuthorizerCredentials()) == false)
            return false;
        if (other.getIdentitySource() == null
                ^ this.getIdentitySource() == null)
            return false;
        if (other.getIdentitySource() != null
                && other.getIdentitySource().equals(this.getIdentitySource()) == false)
            return false;
        if (other.getIdentityValidationExpression() == null
                ^ this.getIdentityValidationExpression() == null)
            return false;
        if (other.getIdentityValidationExpression() != null
                && other.getIdentityValidationExpression().equals(
                        this.getIdentityValidationExpression()) == false)
            return false;
        if (other.getAuthorizerResultTtlInSeconds() == null
                ^ this.getAuthorizerResultTtlInSeconds() == null)
            return false;
        if (other.getAuthorizerResultTtlInSeconds() != null
                && other.getAuthorizerResultTtlInSeconds().equals(
                        this.getAuthorizerResultTtlInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorizerUri() == null) ? 0 : getAuthorizerUri()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorizerCredentials() == null) ? 0
                        : getAuthorizerCredentials().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentitySource() == null) ? 0 : getIdentitySource()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentityValidationExpression() == null) ? 0
                        : getIdentityValidationExpression().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorizerResultTtlInSeconds() == null) ? 0
                        : getAuthorizerResultTtlInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAuthorizerResult clone() {
        try {
            return (UpdateAuthorizerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
