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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type containing a resource and its associated tags.
 * </p>
 */
public class ResourceTagSet implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID for the specified resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The tags associated with the specified resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.</p>
     *        <p>
     *        - The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        <p>
     *        - The resource type for hosted zones is <code>hostedzone</code>.
     * @see TagResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @return The type of the resource.</p>
     *         <p>
     *         - The resource type for health checks is <code>healthcheck</code>
     *         .
     *         </p>
     *         <p>
     *         - The resource type for hosted zones is <code>hostedzone</code>.
     * @see TagResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.</p>
     *        <p>
     *        - The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        <p>
     *        - The resource type for hosted zones is <code>hostedzone</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TagResourceType
     */

    public ResourceTagSet withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.</p>
     *        <p>
     *        - The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        <p>
     *        - The resource type for hosted zones is <code>hostedzone</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TagResourceType
     */

    public void setResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.</p>
     *        <p>
     *        - The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        <p>
     *        - The resource type for hosted zones is <code>hostedzone</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TagResourceType
     */

    public ResourceTagSet withResourceType(TagResourceType resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The ID for the specified resource.
     * </p>
     * 
     * @param resourceId
     *        The ID for the specified resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID for the specified resource.
     * </p>
     * 
     * @return The ID for the specified resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID for the specified resource.
     * </p>
     * 
     * @param resourceId
     *        The ID for the specified resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ResourceTagSet withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The tags associated with the specified resource.
     * </p>
     * 
     * @return The tags associated with the specified resource.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags associated with the specified resource.
     * </p>
     * 
     * @param tags
     *        The tags associated with the specified resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with the specified resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or
     * {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the specified resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ResourceTagSet withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with the specified resource.
     * </p>
     * 
     * @param tags
     *        The tags associated with the specified resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ResourceTagSet withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceTagSet == false)
            return false;
        ResourceTagSet other = (ResourceTagSet) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null
                && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ResourceTagSet clone() {
        try {
            return (ResourceTagSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
