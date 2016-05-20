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
 * A complex type containing tags for the specified resource.
 * </p>
 */
public class ListTagsForResourceResult implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>ResourceTagSet</code> containing tags associated with the
     * specified resource.
     * </p>
     */
    private ResourceTagSet resourceTagSet;

    /**
     * <p>
     * A <code>ResourceTagSet</code> containing tags associated with the
     * specified resource.
     * </p>
     * 
     * @param resourceTagSet
     *        A <code>ResourceTagSet</code> containing tags associated with the
     *        specified resource.
     */

    public void setResourceTagSet(ResourceTagSet resourceTagSet) {
        this.resourceTagSet = resourceTagSet;
    }

    /**
     * <p>
     * A <code>ResourceTagSet</code> containing tags associated with the
     * specified resource.
     * </p>
     * 
     * @return A <code>ResourceTagSet</code> containing tags associated with the
     *         specified resource.
     */

    public ResourceTagSet getResourceTagSet() {
        return this.resourceTagSet;
    }

    /**
     * <p>
     * A <code>ResourceTagSet</code> containing tags associated with the
     * specified resource.
     * </p>
     * 
     * @param resourceTagSet
     *        A <code>ResourceTagSet</code> containing tags associated with the
     *        specified resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListTagsForResourceResult withResourceTagSet(
            ResourceTagSet resourceTagSet) {
        setResourceTagSet(resourceTagSet);
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
        if (getResourceTagSet() != null)
            sb.append("ResourceTagSet: " + getResourceTagSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceResult == false)
            return false;
        ListTagsForResourceResult other = (ListTagsForResourceResult) obj;
        if (other.getResourceTagSet() == null
                ^ this.getResourceTagSet() == null)
            return false;
        if (other.getResourceTagSet() != null
                && other.getResourceTagSet().equals(this.getResourceTagSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceTagSet() == null) ? 0 : getResourceTagSet()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceResult clone() {
        try {
            return (ListTagsForResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
