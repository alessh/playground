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
 * Request to delete the specified API from your collection.
 * </p>
 */
public class DeleteRestApiRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ID of the <a>RestApi</a> you want to delete.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * The ID of the <a>RestApi</a> you want to delete.
     * </p>
     * 
     * @param restApiId
     *        The ID of the <a>RestApi</a> you want to delete.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The ID of the <a>RestApi</a> you want to delete.
     * </p>
     * 
     * @return The ID of the <a>RestApi</a> you want to delete.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The ID of the <a>RestApi</a> you want to delete.
     * </p>
     * 
     * @param restApiId
     *        The ID of the <a>RestApi</a> you want to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteRestApiRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
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
            sb.append("RestApiId: " + getRestApiId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRestApiRequest == false)
            return false;
        DeleteRestApiRequest other = (DeleteRestApiRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRestApiRequest clone() {
        return (DeleteRestApiRequest) super.clone();
    }
}