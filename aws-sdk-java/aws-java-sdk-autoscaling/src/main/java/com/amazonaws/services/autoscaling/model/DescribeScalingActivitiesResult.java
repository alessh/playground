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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeScalingActivitiesResult implements Serializable, Cloneable {

    /**
     * <p>
     * The scaling activities.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Activity> activities;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The scaling activities.
     * </p>
     * 
     * @return The scaling activities.
     */

    public java.util.List<Activity> getActivities() {
        if (activities == null) {
            activities = new com.amazonaws.internal.SdkInternalList<Activity>();
        }
        return activities;
    }

    /**
     * <p>
     * The scaling activities.
     * </p>
     * 
     * @param activities
     *        The scaling activities.
     */

    public void setActivities(java.util.Collection<Activity> activities) {
        if (activities == null) {
            this.activities = null;
            return;
        }

        this.activities = new com.amazonaws.internal.SdkInternalList<Activity>(
                activities);
    }

    /**
     * <p>
     * The scaling activities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setActivities(java.util.Collection)} or
     * {@link #withActivities(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param activities
     *        The scaling activities.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeScalingActivitiesResult withActivities(
            Activity... activities) {
        if (this.activities == null) {
            setActivities(new com.amazonaws.internal.SdkInternalList<Activity>(
                    activities.length));
        }
        for (Activity ele : activities) {
            this.activities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scaling activities.
     * </p>
     * 
     * @param activities
     *        The scaling activities.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeScalingActivitiesResult withActivities(
            java.util.Collection<Activity> activities) {
        setActivities(activities);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there
     *        are no additional items to return, the string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there
     *         are no additional items to return, the string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there
     *        are no additional items to return, the string is empty.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeScalingActivitiesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getActivities() != null)
            sb.append("Activities: " + getActivities() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScalingActivitiesResult == false)
            return false;
        DescribeScalingActivitiesResult other = (DescribeScalingActivitiesResult) obj;
        if (other.getActivities() == null ^ this.getActivities() == null)
            return false;
        if (other.getActivities() != null
                && other.getActivities().equals(this.getActivities()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActivities() == null) ? 0 : getActivities().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScalingActivitiesResult clone() {
        try {
            return (DescribeScalingActivitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
