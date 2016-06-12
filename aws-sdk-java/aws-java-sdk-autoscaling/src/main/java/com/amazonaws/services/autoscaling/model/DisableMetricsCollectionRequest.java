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
public class DisableMetricsCollectionRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all
     * metrics are disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> metrics;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name or Amazon Resource Name (ARN) of the group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the group.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name or Amazon Resource Name (ARN) of the group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DisableMetricsCollectionRequest withAutoScalingGroupName(
            String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all
     * metrics are disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more of the following metrics. If you omit this parameter,
     *         all metrics are disabled.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>GroupMinSize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupMaxSize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupDesiredCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupInServiceInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupPendingInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupStandbyInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTerminatingInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTotalInstances</code>
     *         </p>
     *         </li>
     */

    public java.util.List<String> getMetrics() {
        if (metrics == null) {
            metrics = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return metrics;
    }

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all
     * metrics are disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param metrics
     *        One or more of the following metrics. If you omit this parameter,
     *        all metrics are disabled.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GroupMinSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupMaxSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalInstances</code>
     *        </p>
     *        </li>
     */

    public void setMetrics(java.util.Collection<String> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new com.amazonaws.internal.SdkInternalList<String>(
                metrics);
    }

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all
     * metrics are disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMetrics(java.util.Collection)} or
     * {@link #withMetrics(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param metrics
     *        One or more of the following metrics. If you omit this parameter,
     *        all metrics are disabled.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GroupMinSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupMaxSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalInstances</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DisableMetricsCollectionRequest withMetrics(String... metrics) {
        if (this.metrics == null) {
            setMetrics(new com.amazonaws.internal.SdkInternalList<String>(
                    metrics.length));
        }
        for (String ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all
     * metrics are disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param metrics
     *        One or more of the following metrics. If you omit this parameter,
     *        all metrics are disabled.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GroupMinSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupMaxSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalInstances</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DisableMetricsCollectionRequest withMetrics(
            java.util.Collection<String> metrics) {
        setMetrics(metrics);
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
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableMetricsCollectionRequest == false)
            return false;
        DisableMetricsCollectionRequest other = (DisableMetricsCollectionRequest) obj;
        if (other.getAutoScalingGroupName() == null
                ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(
                        this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null
                && other.getMetrics().equals(this.getMetrics()) == false)
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
        hashCode = prime * hashCode
                + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public DisableMetricsCollectionRequest clone() {
        return (DisableMetricsCollectionRequest) super.clone();
    }
}