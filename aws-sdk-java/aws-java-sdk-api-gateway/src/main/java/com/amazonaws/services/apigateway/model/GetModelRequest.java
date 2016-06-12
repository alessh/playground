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
 * Request to list information about a model in an existing <a>RestApi</a>
 * resource.
 * </p>
 */
public class GetModelRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The name of the model as an identifier.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * Resolves all external model references and returns a flattened model
     * schema.
     * </p>
     */
    private Boolean flatten;

    /**
     * <p>
     * The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     * </p>
     * 
     * @return The <a>RestApi</a> identifier under which the <a>Model</a>
     *         exists.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetModelRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The name of the model as an identifier.
     * </p>
     * 
     * @param modelName
     *        The name of the model as an identifier.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model as an identifier.
     * </p>
     * 
     * @return The name of the model as an identifier.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model as an identifier.
     * </p>
     * 
     * @param modelName
     *        The name of the model as an identifier.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetModelRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * Resolves all external model references and returns a flattened model
     * schema.
     * </p>
     * 
     * @param flatten
     *        Resolves all external model references and returns a flattened
     *        model schema.
     */

    public void setFlatten(Boolean flatten) {
        this.flatten = flatten;
    }

    /**
     * <p>
     * Resolves all external model references and returns a flattened model
     * schema.
     * </p>
     * 
     * @return Resolves all external model references and returns a flattened
     *         model schema.
     */

    public Boolean getFlatten() {
        return this.flatten;
    }

    /**
     * <p>
     * Resolves all external model references and returns a flattened model
     * schema.
     * </p>
     * 
     * @param flatten
     *        Resolves all external model references and returns a flattened
     *        model schema.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetModelRequest withFlatten(Boolean flatten) {
        setFlatten(flatten);
        return this;
    }

    /**
     * <p>
     * Resolves all external model references and returns a flattened model
     * schema.
     * </p>
     * 
     * @return Resolves all external model references and returns a flattened
     *         model schema.
     */

    public Boolean isFlatten() {
        return this.flatten;
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
        if (getModelName() != null)
            sb.append("ModelName: " + getModelName() + ",");
        if (getFlatten() != null)
            sb.append("Flatten: " + getFlatten());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetModelRequest == false)
            return false;
        GetModelRequest other = (GetModelRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null
                && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getFlatten() == null ^ this.getFlatten() == null)
            return false;
        if (other.getFlatten() != null
                && other.getFlatten().equals(this.getFlatten()) == false)
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
                + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode
                + ((getFlatten() == null) ? 0 : getFlatten().hashCode());
        return hashCode;
    }

    @Override
    public GetModelRequest clone() {
        return (GetModelRequest) super.clone();
    }
}