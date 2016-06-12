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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Make a request to simulate the execution of a <a>Method</a>.
 * </p>
 */
public class TestInvokeMethodRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Specifies a test invoke method request's API identifier.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * Specifies a test invoke method request's resource ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Specifies a test invoke method request's HTTP method.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * The URI path, including query string, of the simulated invocation
     * request. Use this to specify path parameters and query string parameters.
     * </p>
     */
    private String pathWithQueryString;
    /**
     * <p>
     * The simulated request body of an incoming invocation request.
     * </p>
     */
    private String body;
    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request.
     * </p>
     */
    private java.util.Map<String, String> headers;
    /**
     * <p>
     * A <a>ClientCertificate</a> identifier to use in the test invocation. API
     * Gateway will use use the certificate when making the HTTPS request to the
     * defined backend endpoint.
     * </p>
     */
    private String clientCertificateId;
    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a
     * deployed <a>Stage</a>.
     * </p>
     */
    private java.util.Map<String, String> stageVariables;

    /**
     * <p>
     * Specifies a test invoke method request's API identifier.
     * </p>
     * 
     * @param restApiId
     *        Specifies a test invoke method request's API identifier.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * Specifies a test invoke method request's API identifier.
     * </p>
     * 
     * @return Specifies a test invoke method request's API identifier.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * Specifies a test invoke method request's API identifier.
     * </p>
     * 
     * @param restApiId
     *        Specifies a test invoke method request's API identifier.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestInvokeMethodRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * Specifies a test invoke method request's resource ID.
     * </p>
     * 
     * @param resourceId
     *        Specifies a test invoke method request's resource ID.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Specifies a test invoke method request's resource ID.
     * </p>
     * 
     * @return Specifies a test invoke method request's resource ID.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Specifies a test invoke method request's resource ID.
     * </p>
     * 
     * @param resourceId
     *        Specifies a test invoke method request's resource ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestInvokeMethodRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Specifies a test invoke method request's HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        Specifies a test invoke method request's HTTP method.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * Specifies a test invoke method request's HTTP method.
     * </p>
     * 
     * @return Specifies a test invoke method request's HTTP method.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * Specifies a test invoke method request's HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        Specifies a test invoke method request's HTTP method.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestInvokeMethodRequest withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * The URI path, including query string, of the simulated invocation
     * request. Use this to specify path parameters and query string parameters.
     * </p>
     * 
     * @param pathWithQueryString
     *        The URI path, including query string, of the simulated invocation
     *        request. Use this to specify path parameters and query string
     *        parameters.
     */

    public void setPathWithQueryString(String pathWithQueryString) {
        this.pathWithQueryString = pathWithQueryString;
    }

    /**
     * <p>
     * The URI path, including query string, of the simulated invocation
     * request. Use this to specify path parameters and query string parameters.
     * </p>
     * 
     * @return The URI path, including query string, of the simulated invocation
     *         request. Use this to specify path parameters and query string
     *         parameters.
     */

    public String getPathWithQueryString() {
        return this.pathWithQueryString;
    }

    /**
     * <p>
     * The URI path, including query string, of the simulated invocation
     * request. Use this to specify path parameters and query string parameters.
     * </p>
     * 
     * @param pathWithQueryString
     *        The URI path, including query string, of the simulated invocation
     *        request. Use this to specify path parameters and query string
     *        parameters.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestInvokeMethodRequest withPathWithQueryString(
            String pathWithQueryString) {
        setPathWithQueryString(pathWithQueryString);
        return this;
    }

    /**
     * <p>
     * The simulated request body of an incoming invocation request.
     * </p>
     * 
     * @param body
     *        The simulated request body of an incoming invocation request.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The simulated request body of an incoming invocation request.
     * </p>
     * 
     * @return The simulated request body of an incoming invocation request.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The simulated request body of an incoming invocation request.
     * </p>
     * 
     * @param body
     *        The simulated request body of an incoming invocation request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestInvokeMethodRequest withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request.
     * </p>
     * 
     * @return A key-value map of headers to simulate an incoming invocation
     *         request.
     */

    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request.
     * </p>
     * 
     * @param headers
     *        A key-value map of headers to simulate an incoming invocation
     *        request.
     */

    public void setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request.
     * </p>
     * 
     * @param headers
     *        A key-value map of headers to simulate an incoming invocation
     *        request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestInvokeMethodRequest withHeaders(
            java.util.Map<String, String> headers) {
        setHeaders(headers);
        return this;
    }

    public TestInvokeMethodRequest addHeadersEntry(String key, String value) {
        if (null == this.headers) {
            this.headers = new java.util.HashMap<String, String>();
        }
        if (this.headers.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.headers.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Headers. &lt;p> Returns a reference to
     * this object so that method calls can be chained together.
     */

    public TestInvokeMethodRequest clearHeadersEntries() {
        this.headers = null;
        return this;
    }

    /**
     * <p>
     * A <a>ClientCertificate</a> identifier to use in the test invocation. API
     * Gateway will use use the certificate when making the HTTPS request to the
     * defined backend endpoint.
     * </p>
     * 
     * @param clientCertificateId
     *        A <a>ClientCertificate</a> identifier to use in the test
     *        invocation. API Gateway will use use the certificate when making
     *        the HTTPS request to the defined backend endpoint.
     */

    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * A <a>ClientCertificate</a> identifier to use in the test invocation. API
     * Gateway will use use the certificate when making the HTTPS request to the
     * defined backend endpoint.
     * </p>
     * 
     * @return A <a>ClientCertificate</a> identifier to use in the test
     *         invocation. API Gateway will use use the certificate when making
     *         the HTTPS request to the defined backend endpoint.
     */

    public String getClientCertificateId() {
        return this.clientCertificateId;
    }

    /**
     * <p>
     * A <a>ClientCertificate</a> identifier to use in the test invocation. API
     * Gateway will use use the certificate when making the HTTPS request to the
     * defined backend endpoint.
     * </p>
     * 
     * @param clientCertificateId
     *        A <a>ClientCertificate</a> identifier to use in the test
     *        invocation. API Gateway will use use the certificate when making
     *        the HTTPS request to the defined backend endpoint.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestInvokeMethodRequest withClientCertificateId(
            String clientCertificateId) {
        setClientCertificateId(clientCertificateId);
        return this;
    }

    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a
     * deployed <a>Stage</a>.
     * </p>
     * 
     * @return A key-value map of stage variables to simulate an invocation on a
     *         deployed <a>Stage</a>.
     */

    public java.util.Map<String, String> getStageVariables() {
        return stageVariables;
    }

    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a
     * deployed <a>Stage</a>.
     * </p>
     * 
     * @param stageVariables
     *        A key-value map of stage variables to simulate an invocation on a
     *        deployed <a>Stage</a>.
     */

    public void setStageVariables(java.util.Map<String, String> stageVariables) {
        this.stageVariables = stageVariables;
    }

    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a
     * deployed <a>Stage</a>.
     * </p>
     * 
     * @param stageVariables
     *        A key-value map of stage variables to simulate an invocation on a
     *        deployed <a>Stage</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestInvokeMethodRequest withStageVariables(
            java.util.Map<String, String> stageVariables) {
        setStageVariables(stageVariables);
        return this;
    }

    public TestInvokeMethodRequest addStageVariablesEntry(String key,
            String value) {
        if (null == this.stageVariables) {
            this.stageVariables = new java.util.HashMap<String, String>();
        }
        if (this.stageVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.stageVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StageVariables. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */

    public TestInvokeMethodRequest clearStageVariablesEntries() {
        this.stageVariables = null;
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
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: " + getHttpMethod() + ",");
        if (getPathWithQueryString() != null)
            sb.append("PathWithQueryString: " + getPathWithQueryString() + ",");
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getHeaders() != null)
            sb.append("Headers: " + getHeaders() + ",");
        if (getClientCertificateId() != null)
            sb.append("ClientCertificateId: " + getClientCertificateId() + ",");
        if (getStageVariables() != null)
            sb.append("StageVariables: " + getStageVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestInvokeMethodRequest == false)
            return false;
        TestInvokeMethodRequest other = (TestInvokeMethodRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null
                && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getPathWithQueryString() == null
                ^ this.getPathWithQueryString() == null)
            return false;
        if (other.getPathWithQueryString() != null
                && other.getPathWithQueryString().equals(
                        this.getPathWithQueryString()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null
                && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null
                && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getClientCertificateId() == null
                ^ this.getClientCertificateId() == null)
            return false;
        if (other.getClientCertificateId() != null
                && other.getClientCertificateId().equals(
                        this.getClientCertificateId()) == false)
            return false;
        if (other.getStageVariables() == null
                ^ this.getStageVariables() == null)
            return false;
        if (other.getStageVariables() != null
                && other.getStageVariables().equals(this.getStageVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime
                * hashCode
                + ((getPathWithQueryString() == null) ? 0
                        : getPathWithQueryString().hashCode());
        hashCode = prime * hashCode
                + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime
                * hashCode
                + ((getClientCertificateId() == null) ? 0
                        : getClientCertificateId().hashCode());
        hashCode = prime
                * hashCode
                + ((getStageVariables() == null) ? 0 : getStageVariables()
                        .hashCode());
        return hashCode;
    }

    @Override
    public TestInvokeMethodRequest clone() {
        return (TestInvokeMethodRequest) super.clone();
    }
}