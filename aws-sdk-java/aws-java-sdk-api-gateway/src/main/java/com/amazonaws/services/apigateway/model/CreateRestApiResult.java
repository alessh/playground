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
 * Represents a REST API.
 * </p>
 */
public class CreateRestApiResult implements Serializable, Cloneable {

    /**
     * <p>
     * The API's identifier. This identifier is unique across all of your APIs
     * in Amazon API Gateway.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The API's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The API's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date when the API was created, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     */
    private java.util.Date createdDate;

    private java.util.List<String> warnings;

    /**
     * <p>
     * The API's identifier. This identifier is unique across all of your APIs
     * in Amazon API Gateway.
     * </p>
     * 
     * @param id
     *        The API's identifier. This identifier is unique across all of your
     *        APIs in Amazon API Gateway.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The API's identifier. This identifier is unique across all of your APIs
     * in Amazon API Gateway.
     * </p>
     * 
     * @return The API's identifier. This identifier is unique across all of
     *         your APIs in Amazon API Gateway.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The API's identifier. This identifier is unique across all of your APIs
     * in Amazon API Gateway.
     * </p>
     * 
     * @param id
     *        The API's identifier. This identifier is unique across all of your
     *        APIs in Amazon API Gateway.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateRestApiResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The API's name.
     * </p>
     * 
     * @param name
     *        The API's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The API's name.
     * </p>
     * 
     * @return The API's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The API's name.
     * </p>
     * 
     * @param name
     *        The API's name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateRestApiResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The API's description.
     * </p>
     * 
     * @param description
     *        The API's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The API's description.
     * </p>
     * 
     * @return The API's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The API's description.
     * </p>
     * 
     * @param description
     *        The API's description.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateRestApiResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date when the API was created, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @param createdDate
     *        The date when the API was created, in <a
     *        href="http://www.iso.org/iso/home/standards/iso8601.htm"
     *        target="_blank">ISO 8601 format</a>.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when the API was created, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @return The date when the API was created, in <a
     *         href="http://www.iso.org/iso/home/standards/iso8601.htm"
     *         target="_blank">ISO 8601 format</a>.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date when the API was created, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @param createdDate
     *        The date when the API was created, in <a
     *        href="http://www.iso.org/iso/home/standards/iso8601.htm"
     *        target="_blank">ISO 8601 format</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateRestApiResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getWarnings() {
        return warnings;
    }

    /**
     * @param warnings
     */

    public void setWarnings(java.util.Collection<String> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<String>(warnings);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setWarnings(java.util.Collection)} or
     * {@link #withWarnings(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param warnings
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateRestApiResult withWarnings(String... warnings) {
        if (this.warnings == null) {
            setWarnings(new java.util.ArrayList<String>(warnings.length));
        }
        for (String ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * @param warnings
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateRestApiResult withWarnings(
            java.util.Collection<String> warnings) {
        setWarnings(warnings);
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getWarnings() != null)
            sb.append("Warnings: " + getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRestApiResult == false)
            return false;
        CreateRestApiResult other = (CreateRestApiResult) obj;
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null
                && other.getWarnings().equals(this.getWarnings()) == false)
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
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public CreateRestApiResult clone() {
        try {
            return (CreateRestApiResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
