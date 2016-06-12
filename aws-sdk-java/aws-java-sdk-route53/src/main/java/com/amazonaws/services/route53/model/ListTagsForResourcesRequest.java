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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type containing information about a request for a list of the tags
 * that are associated with up to 10 specified resources.
 * </p>
 */
public class ListTagsForResourcesRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the resources.
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
     * A complex type that contains the ResourceId element for each resource for
     * which you want to get a list of tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceIds;

    /**
     * <p>
     * The type of the resources.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of the resources.</p>
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
     * The type of the resources.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @return The type of the resources.</p>
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
     * The type of the resources.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of the resources.</p>
     *        <p>
     *        - The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        <p>
     *        - The resource type for hosted zones is <code>hostedzone</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TagResourceType
     */

    public ListTagsForResourcesRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the resources.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of the resources.</p>
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
     * The type of the resources.
     * </p>
     * <p>
     * - The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * <p>
     * - The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of the resources.</p>
     *        <p>
     *        - The resource type for health checks is <code>healthcheck</code>.
     *        </p>
     *        <p>
     *        - The resource type for hosted zones is <code>hostedzone</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TagResourceType
     */

    public ListTagsForResourcesRequest withResourceType(
            TagResourceType resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the ResourceId element for each resource for
     * which you want to get a list of tags.
     * </p>
     * 
     * @return A complex type that contains the ResourceId element for each
     *         resource for which you want to get a list of tags.
     */

    public java.util.List<String> getResourceIds() {
        if (resourceIds == null) {
            resourceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceIds;
    }

    /**
     * <p>
     * A complex type that contains the ResourceId element for each resource for
     * which you want to get a list of tags.
     * </p>
     * 
     * @param resourceIds
     *        A complex type that contains the ResourceId element for each
     *        resource for which you want to get a list of tags.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new com.amazonaws.internal.SdkInternalList<String>(
                resourceIds);
    }

    /**
     * <p>
     * A complex type that contains the ResourceId element for each resource for
     * which you want to get a list of tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceIds(java.util.Collection)} or
     * {@link #withResourceIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param resourceIds
     *        A complex type that contains the ResourceId element for each
     *        resource for which you want to get a list of tags.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListTagsForResourcesRequest withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new com.amazonaws.internal.SdkInternalList<String>(
                    resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains the ResourceId element for each resource for
     * which you want to get a list of tags.
     * </p>
     * 
     * @param resourceIds
     *        A complex type that contains the ResourceId element for each
     *        resource for which you want to get a list of tags.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListTagsForResourcesRequest withResourceIds(
            java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
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
        if (getResourceIds() != null)
            sb.append("ResourceIds: " + getResourceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourcesRequest == false)
            return false;
        ListTagsForResourcesRequest other = (ListTagsForResourcesRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null
                && other.getResourceIds().equals(this.getResourceIds()) == false)
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
        hashCode = prime
                * hashCode
                + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourcesRequest clone() {
        return (ListTagsForResourcesRequest) super.clone();
    }
}