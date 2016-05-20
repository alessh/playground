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

package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

/**
 * <p>
 * Returns the objects or data listed below if successful. Otherwise, returns an
 * error.
 * </p>
 */
public class DescribeTrailsResult implements Serializable, Cloneable {

    /**
     * <p>
     * The list of trail objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Trail> trailList;

    /**
     * <p>
     * The list of trail objects.
     * </p>
     * 
     * @return The list of trail objects.
     */

    public java.util.List<Trail> getTrailList() {
        if (trailList == null) {
            trailList = new com.amazonaws.internal.SdkInternalList<Trail>();
        }
        return trailList;
    }

    /**
     * <p>
     * The list of trail objects.
     * </p>
     * 
     * @param trailList
     *        The list of trail objects.
     */

    public void setTrailList(java.util.Collection<Trail> trailList) {
        if (trailList == null) {
            this.trailList = null;
            return;
        }

        this.trailList = new com.amazonaws.internal.SdkInternalList<Trail>(
                trailList);
    }

    /**
     * <p>
     * The list of trail objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTrailList(java.util.Collection)} or
     * {@link #withTrailList(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param trailList
     *        The list of trail objects.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTrailsResult withTrailList(Trail... trailList) {
        if (this.trailList == null) {
            setTrailList(new com.amazonaws.internal.SdkInternalList<Trail>(
                    trailList.length));
        }
        for (Trail ele : trailList) {
            this.trailList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of trail objects.
     * </p>
     * 
     * @param trailList
     *        The list of trail objects.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTrailsResult withTrailList(
            java.util.Collection<Trail> trailList) {
        setTrailList(trailList);
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
        if (getTrailList() != null)
            sb.append("TrailList: " + getTrailList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrailsResult == false)
            return false;
        DescribeTrailsResult other = (DescribeTrailsResult) obj;
        if (other.getTrailList() == null ^ this.getTrailList() == null)
            return false;
        if (other.getTrailList() != null
                && other.getTrailList().equals(this.getTrailList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrailList() == null) ? 0 : getTrailList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrailsResult clone() {
        try {
            return (DescribeTrailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
