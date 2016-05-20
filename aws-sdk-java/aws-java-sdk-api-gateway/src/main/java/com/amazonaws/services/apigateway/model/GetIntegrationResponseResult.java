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
 * Represents an integration response. The status code must map to an existing
 * <a>MethodResponse</a>, and parameters and templates can be used to transform
 * the backend response.
 * </p>
 */
public class GetIntegrationResponseResult implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to
     * an existing <a>MethodResponse</a>.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * Specifies the regular expression (regex) pattern used to choose an
     * integration response based on the response from the backend. If the
     * backend is an AWS Lambda function, the AWS Lambda function error header
     * is matched. For all other HTTP and AWS backends, the HTTP status code is
     * matched.
     * </p>
     */
    private String selectionPattern;
    /**
     * <p>
     * Represents response parameters that can be read from the backend
     * response. Response parameters are represented as a key/value map, with a
     * destination as the key and a source as the value. A destination must
     * match an existing response parameter in the <a>MethodResponse</a>. The
     * source can be a header from the backend response, or a static value.
     * Static values are specified using enclosing single quotes, and backend
     * response headers can be read using the pattern
     * <code>integration.response.header.{name}</code>.
     * </p>
     */
    private java.util.Map<String, String> responseParameters;
    /**
     * <p>
     * Specifies the templates used to transform the integration response body.
     * Response templates are represented as a key/value map, with a
     * content-type as the key and a template as the value.
     * </p>
     */
    private java.util.Map<String, String> responseTemplates;

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to
     * an existing <a>MethodResponse</a>.
     * </p>
     * 
     * @param statusCode
     *        Specifies the status code that is used to map the integration
     *        response to an existing <a>MethodResponse</a>.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to
     * an existing <a>MethodResponse</a>.
     * </p>
     * 
     * @return Specifies the status code that is used to map the integration
     *         response to an existing <a>MethodResponse</a>.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to
     * an existing <a>MethodResponse</a>.
     * </p>
     * 
     * @param statusCode
     *        Specifies the status code that is used to map the integration
     *        response to an existing <a>MethodResponse</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetIntegrationResponseResult withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) pattern used to choose an
     * integration response based on the response from the backend. If the
     * backend is an AWS Lambda function, the AWS Lambda function error header
     * is matched. For all other HTTP and AWS backends, the HTTP status code is
     * matched.
     * </p>
     * 
     * @param selectionPattern
     *        Specifies the regular expression (regex) pattern used to choose an
     *        integration response based on the response from the backend. If
     *        the backend is an AWS Lambda function, the AWS Lambda function
     *        error header is matched. For all other HTTP and AWS backends, the
     *        HTTP status code is matched.
     */

    public void setSelectionPattern(String selectionPattern) {
        this.selectionPattern = selectionPattern;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) pattern used to choose an
     * integration response based on the response from the backend. If the
     * backend is an AWS Lambda function, the AWS Lambda function error header
     * is matched. For all other HTTP and AWS backends, the HTTP status code is
     * matched.
     * </p>
     * 
     * @return Specifies the regular expression (regex) pattern used to choose
     *         an integration response based on the response from the backend.
     *         If the backend is an AWS Lambda function, the AWS Lambda function
     *         error header is matched. For all other HTTP and AWS backends, the
     *         HTTP status code is matched.
     */

    public String getSelectionPattern() {
        return this.selectionPattern;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) pattern used to choose an
     * integration response based on the response from the backend. If the
     * backend is an AWS Lambda function, the AWS Lambda function error header
     * is matched. For all other HTTP and AWS backends, the HTTP status code is
     * matched.
     * </p>
     * 
     * @param selectionPattern
     *        Specifies the regular expression (regex) pattern used to choose an
     *        integration response based on the response from the backend. If
     *        the backend is an AWS Lambda function, the AWS Lambda function
     *        error header is matched. For all other HTTP and AWS backends, the
     *        HTTP status code is matched.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetIntegrationResponseResult withSelectionPattern(
            String selectionPattern) {
        setSelectionPattern(selectionPattern);
        return this;
    }

    /**
     * <p>
     * Represents response parameters that can be read from the backend
     * response. Response parameters are represented as a key/value map, with a
     * destination as the key and a source as the value. A destination must
     * match an existing response parameter in the <a>MethodResponse</a>. The
     * source can be a header from the backend response, or a static value.
     * Static values are specified using enclosing single quotes, and backend
     * response headers can be read using the pattern
     * <code>integration.response.header.{name}</code>.
     * </p>
     * 
     * @return Represents response parameters that can be read from the backend
     *         response. Response parameters are represented as a key/value map,
     *         with a destination as the key and a source as the value. A
     *         destination must match an existing response parameter in the
     *         <a>MethodResponse</a>. The source can be a header from the
     *         backend response, or a static value. Static values are specified
     *         using enclosing single quotes, and backend response headers can
     *         be read using the pattern
     *         <code>integration.response.header.{name}</code>.
     */

    public java.util.Map<String, String> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * Represents response parameters that can be read from the backend
     * response. Response parameters are represented as a key/value map, with a
     * destination as the key and a source as the value. A destination must
     * match an existing response parameter in the <a>MethodResponse</a>. The
     * source can be a header from the backend response, or a static value.
     * Static values are specified using enclosing single quotes, and backend
     * response headers can be read using the pattern
     * <code>integration.response.header.{name}</code>.
     * </p>
     * 
     * @param responseParameters
     *        Represents response parameters that can be read from the backend
     *        response. Response parameters are represented as a key/value map,
     *        with a destination as the key and a source as the value. A
     *        destination must match an existing response parameter in the
     *        <a>MethodResponse</a>. The source can be a header from the backend
     *        response, or a static value. Static values are specified using
     *        enclosing single quotes, and backend response headers can be read
     *        using the pattern <code>integration.response.header.{name}</code>.
     */

    public void setResponseParameters(
            java.util.Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * Represents response parameters that can be read from the backend
     * response. Response parameters are represented as a key/value map, with a
     * destination as the key and a source as the value. A destination must
     * match an existing response parameter in the <a>MethodResponse</a>. The
     * source can be a header from the backend response, or a static value.
     * Static values are specified using enclosing single quotes, and backend
     * response headers can be read using the pattern
     * <code>integration.response.header.{name}</code>.
     * </p>
     * 
     * @param responseParameters
     *        Represents response parameters that can be read from the backend
     *        response. Response parameters are represented as a key/value map,
     *        with a destination as the key and a source as the value. A
     *        destination must match an existing response parameter in the
     *        <a>MethodResponse</a>. The source can be a header from the backend
     *        response, or a static value. Static values are specified using
     *        enclosing single quotes, and backend response headers can be read
     *        using the pattern <code>integration.response.header.{name}</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetIntegrationResponseResult withResponseParameters(
            java.util.Map<String, String> responseParameters) {
        setResponseParameters(responseParameters);
        return this;
    }

    public GetIntegrationResponseResult addResponseParametersEntry(String key,
            String value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, String>();
        }
        if (this.responseParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.responseParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseParameters. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResponseResult clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the templates used to transform the integration response body.
     * Response templates are represented as a key/value map, with a
     * content-type as the key and a template as the value.
     * </p>
     * 
     * @return Specifies the templates used to transform the integration
     *         response body. Response templates are represented as a key/value
     *         map, with a content-type as the key and a template as the value.
     */

    public java.util.Map<String, String> getResponseTemplates() {
        return responseTemplates;
    }

    /**
     * <p>
     * Specifies the templates used to transform the integration response body.
     * Response templates are represented as a key/value map, with a
     * content-type as the key and a template as the value.
     * </p>
     * 
     * @param responseTemplates
     *        Specifies the templates used to transform the integration response
     *        body. Response templates are represented as a key/value map, with
     *        a content-type as the key and a template as the value.
     */

    public void setResponseTemplates(
            java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
    }

    /**
     * <p>
     * Specifies the templates used to transform the integration response body.
     * Response templates are represented as a key/value map, with a
     * content-type as the key and a template as the value.
     * </p>
     * 
     * @param responseTemplates
     *        Specifies the templates used to transform the integration response
     *        body. Response templates are represented as a key/value map, with
     *        a content-type as the key and a template as the value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetIntegrationResponseResult withResponseTemplates(
            java.util.Map<String, String> responseTemplates) {
        setResponseTemplates(responseTemplates);
        return this;
    }

    public GetIntegrationResponseResult addResponseTemplatesEntry(String key,
            String value) {
        if (null == this.responseTemplates) {
            this.responseTemplates = new java.util.HashMap<String, String>();
        }
        if (this.responseTemplates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.responseTemplates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseTemplates. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResponseResult clearResponseTemplatesEntries() {
        this.responseTemplates = null;
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
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getSelectionPattern() != null)
            sb.append("SelectionPattern: " + getSelectionPattern() + ",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: " + getResponseParameters() + ",");
        if (getResponseTemplates() != null)
            sb.append("ResponseTemplates: " + getResponseTemplates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIntegrationResponseResult == false)
            return false;
        GetIntegrationResponseResult other = (GetIntegrationResponseResult) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getSelectionPattern() == null
                ^ this.getSelectionPattern() == null)
            return false;
        if (other.getSelectionPattern() != null
                && other.getSelectionPattern().equals(
                        this.getSelectionPattern()) == false)
            return false;
        if (other.getResponseParameters() == null
                ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null
                && other.getResponseParameters().equals(
                        this.getResponseParameters()) == false)
            return false;
        if (other.getResponseTemplates() == null
                ^ this.getResponseTemplates() == null)
            return false;
        if (other.getResponseTemplates() != null
                && other.getResponseTemplates().equals(
                        this.getResponseTemplates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getSelectionPattern() == null) ? 0 : getSelectionPattern()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseParameters() == null) ? 0
                        : getResponseParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseTemplates() == null) ? 0
                        : getResponseTemplates().hashCode());
        return hashCode;
    }

    @Override
    public GetIntegrationResponseResult clone() {
        try {
            return (GetIntegrationResponseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
