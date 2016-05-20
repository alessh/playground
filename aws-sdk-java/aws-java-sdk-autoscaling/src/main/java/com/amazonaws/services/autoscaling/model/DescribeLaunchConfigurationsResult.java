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
public class DescribeLaunchConfigurationsResult implements Serializable,
        Cloneable {

    /**
     * <p>
     * The launch configurations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchConfiguration> launchConfigurations;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The launch configurations.
     * </p>
     * 
     * @return The launch configurations.
     */

    public java.util.List<LaunchConfiguration> getLaunchConfigurations() {
        if (launchConfigurations == null) {
            launchConfigurations = new com.amazonaws.internal.SdkInternalList<LaunchConfiguration>();
        }
        return launchConfigurations;
    }

    /**
     * <p>
     * The launch configurations.
     * </p>
     * 
     * @param launchConfigurations
     *        The launch configurations.
     */

    public void setLaunchConfigurations(
            java.util.Collection<LaunchConfiguration> launchConfigurations) {
        if (launchConfigurations == null) {
            this.launchConfigurations = null;
            return;
        }

        this.launchConfigurations = new com.amazonaws.internal.SdkInternalList<LaunchConfiguration>(
                launchConfigurations);
    }

    /**
     * <p>
     * The launch configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLaunchConfigurations(java.util.Collection)} or
     * {@link #withLaunchConfigurations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param launchConfigurations
     *        The launch configurations.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeLaunchConfigurationsResult withLaunchConfigurations(
            LaunchConfiguration... launchConfigurations) {
        if (this.launchConfigurations == null) {
            setLaunchConfigurations(new com.amazonaws.internal.SdkInternalList<LaunchConfiguration>(
                    launchConfigurations.length));
        }
        for (LaunchConfiguration ele : launchConfigurations) {
            this.launchConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The launch configurations.
     * </p>
     * 
     * @param launchConfigurations
     *        The launch configurations.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeLaunchConfigurationsResult withLaunchConfigurations(
            java.util.Collection<LaunchConfiguration> launchConfigurations) {
        setLaunchConfigurations(launchConfigurations);
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

    public DescribeLaunchConfigurationsResult withNextToken(String nextToken) {
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
        if (getLaunchConfigurations() != null)
            sb.append("LaunchConfigurations: " + getLaunchConfigurations()
                    + ",");
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

        if (obj instanceof DescribeLaunchConfigurationsResult == false)
            return false;
        DescribeLaunchConfigurationsResult other = (DescribeLaunchConfigurationsResult) obj;
        if (other.getLaunchConfigurations() == null
                ^ this.getLaunchConfigurations() == null)
            return false;
        if (other.getLaunchConfigurations() != null
                && other.getLaunchConfigurations().equals(
                        this.getLaunchConfigurations()) == false)
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

        hashCode = prime
                * hashCode
                + ((getLaunchConfigurations() == null) ? 0
                        : getLaunchConfigurations().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLaunchConfigurationsResult clone() {
        try {
            return (DescribeLaunchConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
