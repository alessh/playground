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
 * The POST Request to add a new <a>RestApi</a> resource to your collection.
 * </p>
 */
public class CreateRestApiRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the <a>RestApi</a>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the <a>RestApi</a>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Id of the <a>RestApi</a> that you want to clone from.
     * </p>
     */
    private String cloneFrom;

    /**
     * <p>
     * The name of the <a>RestApi</a>.
     * </p>
     * 
     * @param name
     *        The name of the <a>RestApi</a>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <a>RestApi</a>.
     * </p>
     * 
     * @return The name of the <a>RestApi</a>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <a>RestApi</a>.
     * </p>
     * 
     * @param name
     *        The name of the <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateRestApiRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the <a>RestApi</a>.
     * </p>
     * 
     * @param description
     *        The description of the <a>RestApi</a>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the <a>RestApi</a>.
     * </p>
     * 
     * @return The description of the <a>RestApi</a>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the <a>RestApi</a>.
     * </p>
     * 
     * @param description
     *        The description of the <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateRestApiRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Id of the <a>RestApi</a> that you want to clone from.
     * </p>
     * 
     * @param cloneFrom
     *        The Id of the <a>RestApi</a> that you want to clone from.
     */

    public void setCloneFrom(String cloneFrom) {
        this.cloneFrom = cloneFrom;
    }

    /**
     * <p>
     * The Id of the <a>RestApi</a> that you want to clone from.
     * </p>
     * 
     * @return The Id of the <a>RestApi</a> that you want to clone from.
     */

    public String getCloneFrom() {
        return this.cloneFrom;
    }

    /**
     * <p>
     * The Id of the <a>RestApi</a> that you want to clone from.
     * </p>
     * 
     * @param cloneFrom
     *        The Id of the <a>RestApi</a> that you want to clone from.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateRestApiRequest withCloneFrom(String cloneFrom) {
        setCloneFrom(cloneFrom);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCloneFrom() != null)
            sb.append("CloneFrom: " + getCloneFrom());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRestApiRequest == false)
            return false;
        CreateRestApiRequest other = (CreateRestApiRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCloneFrom() == null ^ this.getCloneFrom() == null)
            return false;
        if (other.getCloneFrom() != null
                && other.getCloneFrom().equals(this.getCloneFrom()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCloneFrom() == null) ? 0 : getCloneFrom().hashCode());
        return hashCode;
    }

    @Override
    public CreateRestApiRequest clone() {
        return (CreateRestApiRequest) super.clone();
    }
}