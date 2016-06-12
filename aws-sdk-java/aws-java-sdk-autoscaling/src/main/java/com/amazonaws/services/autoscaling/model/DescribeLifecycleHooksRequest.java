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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeLifecycleHooksRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The names of one or more lifecycle hooks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> lifecycleHookNames;

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeLifecycleHooksRequest withAutoScalingGroupName(
            String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The names of one or more lifecycle hooks.
     * </p>
     * 
     * @return The names of one or more lifecycle hooks.
     */

    public java.util.List<String> getLifecycleHookNames() {
        if (lifecycleHookNames == null) {
            lifecycleHookNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return lifecycleHookNames;
    }

    /**
     * <p>
     * The names of one or more lifecycle hooks.
     * </p>
     * 
     * @param lifecycleHookNames
     *        The names of one or more lifecycle hooks.
     */

    public void setLifecycleHookNames(
            java.util.Collection<String> lifecycleHookNames) {
        if (lifecycleHookNames == null) {
            this.lifecycleHookNames = null;
            return;
        }

        this.lifecycleHookNames = new com.amazonaws.internal.SdkInternalList<String>(
                lifecycleHookNames);
    }

    /**
     * <p>
     * The names of one or more lifecycle hooks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLifecycleHookNames(java.util.Collection)} or
     * {@link #withLifecycleHookNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lifecycleHookNames
     *        The names of one or more lifecycle hooks.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeLifecycleHooksRequest withLifecycleHookNames(
            String... lifecycleHookNames) {
        if (this.lifecycleHookNames == null) {
            setLifecycleHookNames(new com.amazonaws.internal.SdkInternalList<String>(
                    lifecycleHookNames.length));
        }
        for (String ele : lifecycleHookNames) {
            this.lifecycleHookNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more lifecycle hooks.
     * </p>
     * 
     * @param lifecycleHookNames
     *        The names of one or more lifecycle hooks.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeLifecycleHooksRequest withLifecycleHookNames(
            java.util.Collection<String> lifecycleHookNames) {
        setLifecycleHookNames(lifecycleHookNames);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName()
                    + ",");
        if (getLifecycleHookNames() != null)
            sb.append("LifecycleHookNames: " + getLifecycleHookNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLifecycleHooksRequest == false)
            return false;
        DescribeLifecycleHooksRequest other = (DescribeLifecycleHooksRequest) obj;
        if (other.getAutoScalingGroupName() == null
                ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(
                        this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getLifecycleHookNames() == null
                ^ this.getLifecycleHookNames() == null)
            return false;
        if (other.getLifecycleHookNames() != null
                && other.getLifecycleHookNames().equals(
                        this.getLifecycleHookNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAutoScalingGroupName() == null) ? 0
                        : getAutoScalingGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getLifecycleHookNames() == null) ? 0
                        : getLifecycleHookNames().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLifecycleHooksRequest clone() {
        return (DescribeLifecycleHooksRequest) super.clone();
    }
}