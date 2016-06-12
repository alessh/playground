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
 * <p>
 * Describes a scaling policy.
 * </p>
 */
public class ScalingPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group associated with this scaling policy.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     */
    private String policyARN;
    /**
     * <p>
     * The policy type. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * The adjustment type, which specifies how <code>ScalingAdjustment</code>
     * is interpreted. Valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     */
    private String adjustmentType;
    /**
     * <p>
     * Available for backward compatibility. Use
     * <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     */
    private Integer minAdjustmentStep;
    /**
     * <p>
     * The minimum number of instances to scale. If the value of
     * <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>, the
     * scaling policy changes the <code>DesiredCapacity</code> of the Auto
     * Scaling group by at least this many instances. Otherwise, the error is
     * <code>ValidationError</code>.
     * </p>
     */
    private Integer minAdjustmentMagnitude;
    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity.
     * </p>
     */
    private Integer scalingAdjustment;
    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * any further trigger-related scaling activities can start.
     * </p>
     */
    private Integer cooldown;
    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StepAdjustment> stepAdjustments;
    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     * </p>
     */
    private String metricAggregationType;
    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics.
     * </p>
     */
    private Integer estimatedInstanceWarmup;
    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Alarm> alarms;

    /**
     * <p>
     * The name of the Auto Scaling group associated with this scaling policy.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group associated with this scaling
     *        policy.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group associated with this scaling policy.
     * </p>
     * 
     * @return The name of the Auto Scaling group associated with this scaling
     *         policy.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group associated with this scaling policy.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group associated with this scaling
     *        policy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * 
     * @param policyName
     *        The name of the scaling policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * 
     * @return The name of the scaling policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * 
     * @param policyName
     *        The name of the scaling policy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * 
     * @param policyARN
     *        The Amazon Resource Name (ARN) of the policy.
     */

    public void setPolicyARN(String policyARN) {
        this.policyARN = policyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the policy.
     */

    public String getPolicyARN() {
        return this.policyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * 
     * @param policyARN
     *        The Amazon Resource Name (ARN) of the policy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withPolicyARN(String policyARN) {
        setPolicyARN(policyARN);
        return this;
    }

    /**
     * <p>
     * The policy type. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * 
     * @param policyType
     *        The policy type. Valid values are <code>SimpleScaling</code> and
     *        <code>StepScaling</code>.
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The policy type. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * 
     * @return The policy type. Valid values are <code>SimpleScaling</code> and
     *         <code>StepScaling</code>.
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The policy type. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * 
     * @param policyType
     *        The policy type. Valid values are <code>SimpleScaling</code> and
     *        <code>StepScaling</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The adjustment type, which specifies how <code>ScalingAdjustment</code>
     * is interpreted. Valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * 
     * @param adjustmentType
     *        The adjustment type, which specifies how
     *        <code>ScalingAdjustment</code> is interpreted. Valid values are
     *        <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *        <code>PercentChangeInCapacity</code>.
     */

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * <p>
     * The adjustment type, which specifies how <code>ScalingAdjustment</code>
     * is interpreted. Valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * 
     * @return The adjustment type, which specifies how
     *         <code>ScalingAdjustment</code> is interpreted. Valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentChangeInCapacity</code>.
     */

    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    /**
     * <p>
     * The adjustment type, which specifies how <code>ScalingAdjustment</code>
     * is interpreted. Valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * 
     * @param adjustmentType
     *        The adjustment type, which specifies how
     *        <code>ScalingAdjustment</code> is interpreted. Valid values are
     *        <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *        <code>PercentChangeInCapacity</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withAdjustmentType(String adjustmentType) {
        setAdjustmentType(adjustmentType);
        return this;
    }

    /**
     * <p>
     * Available for backward compatibility. Use
     * <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     * 
     * @param minAdjustmentStep
     *        Available for backward compatibility. Use
     *        <code>MinAdjustmentMagnitude</code> instead.
     */

    public void setMinAdjustmentStep(Integer minAdjustmentStep) {
        this.minAdjustmentStep = minAdjustmentStep;
    }

    /**
     * <p>
     * Available for backward compatibility. Use
     * <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     * 
     * @return Available for backward compatibility. Use
     *         <code>MinAdjustmentMagnitude</code> instead.
     */

    public Integer getMinAdjustmentStep() {
        return this.minAdjustmentStep;
    }

    /**
     * <p>
     * Available for backward compatibility. Use
     * <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     * 
     * @param minAdjustmentStep
     *        Available for backward compatibility. Use
     *        <code>MinAdjustmentMagnitude</code> instead.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withMinAdjustmentStep(Integer minAdjustmentStep) {
        setMinAdjustmentStep(minAdjustmentStep);
        return this;
    }

    /**
     * <p>
     * The minimum number of instances to scale. If the value of
     * <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>, the
     * scaling policy changes the <code>DesiredCapacity</code> of the Auto
     * Scaling group by at least this many instances. Otherwise, the error is
     * <code>ValidationError</code>.
     * </p>
     * 
     * @param minAdjustmentMagnitude
     *        The minimum number of instances to scale. If the value of
     *        <code>AdjustmentType</code> is
     *        <code>PercentChangeInCapacity</code>, the scaling policy changes
     *        the <code>DesiredCapacity</code> of the Auto Scaling group by at
     *        least this many instances. Otherwise, the error is
     *        <code>ValidationError</code>.
     */

    public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
    }

    /**
     * <p>
     * The minimum number of instances to scale. If the value of
     * <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>, the
     * scaling policy changes the <code>DesiredCapacity</code> of the Auto
     * Scaling group by at least this many instances. Otherwise, the error is
     * <code>ValidationError</code>.
     * </p>
     * 
     * @return The minimum number of instances to scale. If the value of
     *         <code>AdjustmentType</code> is
     *         <code>PercentChangeInCapacity</code>, the scaling policy changes
     *         the <code>DesiredCapacity</code> of the Auto Scaling group by at
     *         least this many instances. Otherwise, the error is
     *         <code>ValidationError</code>.
     */

    public Integer getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude;
    }

    /**
     * <p>
     * The minimum number of instances to scale. If the value of
     * <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>, the
     * scaling policy changes the <code>DesiredCapacity</code> of the Auto
     * Scaling group by at least this many instances. Otherwise, the error is
     * <code>ValidationError</code>.
     * </p>
     * 
     * @param minAdjustmentMagnitude
     *        The minimum number of instances to scale. If the value of
     *        <code>AdjustmentType</code> is
     *        <code>PercentChangeInCapacity</code>, the scaling policy changes
     *        the <code>DesiredCapacity</code> of the Auto Scaling group by at
     *        least this many instances. Otherwise, the error is
     *        <code>ValidationError</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withMinAdjustmentMagnitude(
            Integer minAdjustmentMagnitude) {
        setMinAdjustmentMagnitude(minAdjustmentMagnitude);
        return this;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity.
     * </p>
     * 
     * @param scalingAdjustment
     *        The amount by which to scale, based on the specified adjustment
     *        type. A positive value adds to the current capacity while a
     *        negative number removes from the current capacity.
     */

    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity.
     * </p>
     * 
     * @return The amount by which to scale, based on the specified adjustment
     *         type. A positive value adds to the current capacity while a
     *         negative number removes from the current capacity.
     */

    public Integer getScalingAdjustment() {
        return this.scalingAdjustment;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity.
     * </p>
     * 
     * @param scalingAdjustment
     *        The amount by which to scale, based on the specified adjustment
     *        type. A positive value adds to the current capacity while a
     *        negative number removes from the current capacity.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withScalingAdjustment(Integer scalingAdjustment) {
        setScalingAdjustment(scalingAdjustment);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * any further trigger-related scaling activities can start.
     * </p>
     * 
     * @param cooldown
     *        The amount of time, in seconds, after a scaling activity completes
     *        before any further trigger-related scaling activities can start.
     */

    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * any further trigger-related scaling activities can start.
     * </p>
     * 
     * @return The amount of time, in seconds, after a scaling activity
     *         completes before any further trigger-related scaling activities
     *         can start.
     */

    public Integer getCooldown() {
        return this.cooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * any further trigger-related scaling activities can start.
     * </p>
     * 
     * @param cooldown
     *        The amount of time, in seconds, after a scaling activity completes
     *        before any further trigger-related scaling activities can start.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withCooldown(Integer cooldown) {
        setCooldown(cooldown);
        return this;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * </p>
     * 
     * @return A set of adjustments that enable you to scale based on the size
     *         of the alarm breach.
     */

    public java.util.List<StepAdjustment> getStepAdjustments() {
        if (stepAdjustments == null) {
            stepAdjustments = new com.amazonaws.internal.SdkInternalList<StepAdjustment>();
        }
        return stepAdjustments;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * </p>
     * 
     * @param stepAdjustments
     *        A set of adjustments that enable you to scale based on the size of
     *        the alarm breach.
     */

    public void setStepAdjustments(
            java.util.Collection<StepAdjustment> stepAdjustments) {
        if (stepAdjustments == null) {
            this.stepAdjustments = null;
            return;
        }

        this.stepAdjustments = new com.amazonaws.internal.SdkInternalList<StepAdjustment>(
                stepAdjustments);
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setStepAdjustments(java.util.Collection)} or
     * {@link #withStepAdjustments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stepAdjustments
     *        A set of adjustments that enable you to scale based on the size of
     *        the alarm breach.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withStepAdjustments(StepAdjustment... stepAdjustments) {
        if (this.stepAdjustments == null) {
            setStepAdjustments(new com.amazonaws.internal.SdkInternalList<StepAdjustment>(
                    stepAdjustments.length));
        }
        for (StepAdjustment ele : stepAdjustments) {
            this.stepAdjustments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * </p>
     * 
     * @param stepAdjustments
     *        A set of adjustments that enable you to scale based on the size of
     *        the alarm breach.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withStepAdjustments(
            java.util.Collection<StepAdjustment> stepAdjustments) {
        setStepAdjustments(stepAdjustments);
        return this;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     * </p>
     * 
     * @param metricAggregationType
     *        The aggregation type for the CloudWatch metrics. Valid values are
     *        <code>Minimum</code>, <code>Maximum</code>, and
     *        <code>Average</code>.
     */

    public void setMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     * </p>
     * 
     * @return The aggregation type for the CloudWatch metrics. Valid values are
     *         <code>Minimum</code>, <code>Maximum</code>, and
     *         <code>Average</code>.
     */

    public String getMetricAggregationType() {
        return this.metricAggregationType;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     * </p>
     * 
     * @param metricAggregationType
     *        The aggregation type for the CloudWatch metrics. Valid values are
     *        <code>Minimum</code>, <code>Maximum</code>, and
     *        <code>Average</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withMetricAggregationType(String metricAggregationType) {
        setMetricAggregationType(metricAggregationType);
        return this;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics.
     * </p>
     * 
     * @param estimatedInstanceWarmup
     *        The estimated time, in seconds, until a newly launched instance
     *        can contribute to the CloudWatch metrics.
     */

    public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics.
     * </p>
     * 
     * @return The estimated time, in seconds, until a newly launched instance
     *         can contribute to the CloudWatch metrics.
     */

    public Integer getEstimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics.
     * </p>
     * 
     * @param estimatedInstanceWarmup
     *        The estimated time, in seconds, until a newly launched instance
     *        can contribute to the CloudWatch metrics.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withEstimatedInstanceWarmup(
            Integer estimatedInstanceWarmup) {
        setEstimatedInstanceWarmup(estimatedInstanceWarmup);
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     * 
     * @return The CloudWatch alarms related to the policy.
     */

    public java.util.List<Alarm> getAlarms() {
        if (alarms == null) {
            alarms = new com.amazonaws.internal.SdkInternalList<Alarm>();
        }
        return alarms;
    }

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     * 
     * @param alarms
     *        The CloudWatch alarms related to the policy.
     */

    public void setAlarms(java.util.Collection<Alarm> alarms) {
        if (alarms == null) {
            this.alarms = null;
            return;
        }

        this.alarms = new com.amazonaws.internal.SdkInternalList<Alarm>(alarms);
    }

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAlarms(java.util.Collection)} or
     * {@link #withAlarms(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param alarms
     *        The CloudWatch alarms related to the policy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withAlarms(Alarm... alarms) {
        if (this.alarms == null) {
            setAlarms(new com.amazonaws.internal.SdkInternalList<Alarm>(
                    alarms.length));
        }
        for (Alarm ele : alarms) {
            this.alarms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     * 
     * @param alarms
     *        The CloudWatch alarms related to the policy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScalingPolicy withAlarms(java.util.Collection<Alarm> alarms) {
        setAlarms(alarms);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyARN() != null)
            sb.append("PolicyARN: " + getPolicyARN() + ",");
        if (getPolicyType() != null)
            sb.append("PolicyType: " + getPolicyType() + ",");
        if (getAdjustmentType() != null)
            sb.append("AdjustmentType: " + getAdjustmentType() + ",");
        if (getMinAdjustmentStep() != null)
            sb.append("MinAdjustmentStep: " + getMinAdjustmentStep() + ",");
        if (getMinAdjustmentMagnitude() != null)
            sb.append("MinAdjustmentMagnitude: " + getMinAdjustmentMagnitude()
                    + ",");
        if (getScalingAdjustment() != null)
            sb.append("ScalingAdjustment: " + getScalingAdjustment() + ",");
        if (getCooldown() != null)
            sb.append("Cooldown: " + getCooldown() + ",");
        if (getStepAdjustments() != null)
            sb.append("StepAdjustments: " + getStepAdjustments() + ",");
        if (getMetricAggregationType() != null)
            sb.append("MetricAggregationType: " + getMetricAggregationType()
                    + ",");
        if (getEstimatedInstanceWarmup() != null)
            sb.append("EstimatedInstanceWarmup: "
                    + getEstimatedInstanceWarmup() + ",");
        if (getAlarms() != null)
            sb.append("Alarms: " + getAlarms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPolicy == false)
            return false;
        ScalingPolicy other = (ScalingPolicy) obj;
        if (other.getAutoScalingGroupName() == null
                ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(
                        this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyARN() == null ^ this.getPolicyARN() == null)
            return false;
        if (other.getPolicyARN() != null
                && other.getPolicyARN().equals(this.getPolicyARN()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null
                && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getAdjustmentType() == null
                ^ this.getAdjustmentType() == null)
            return false;
        if (other.getAdjustmentType() != null
                && other.getAdjustmentType().equals(this.getAdjustmentType()) == false)
            return false;
        if (other.getMinAdjustmentStep() == null
                ^ this.getMinAdjustmentStep() == null)
            return false;
        if (other.getMinAdjustmentStep() != null
                && other.getMinAdjustmentStep().equals(
                        this.getMinAdjustmentStep()) == false)
            return false;
        if (other.getMinAdjustmentMagnitude() == null
                ^ this.getMinAdjustmentMagnitude() == null)
            return false;
        if (other.getMinAdjustmentMagnitude() != null
                && other.getMinAdjustmentMagnitude().equals(
                        this.getMinAdjustmentMagnitude()) == false)
            return false;
        if (other.getScalingAdjustment() == null
                ^ this.getScalingAdjustment() == null)
            return false;
        if (other.getScalingAdjustment() != null
                && other.getScalingAdjustment().equals(
                        this.getScalingAdjustment()) == false)
            return false;
        if (other.getCooldown() == null ^ this.getCooldown() == null)
            return false;
        if (other.getCooldown() != null
                && other.getCooldown().equals(this.getCooldown()) == false)
            return false;
        if (other.getStepAdjustments() == null
                ^ this.getStepAdjustments() == null)
            return false;
        if (other.getStepAdjustments() != null
                && other.getStepAdjustments().equals(this.getStepAdjustments()) == false)
            return false;
        if (other.getMetricAggregationType() == null
                ^ this.getMetricAggregationType() == null)
            return false;
        if (other.getMetricAggregationType() != null
                && other.getMetricAggregationType().equals(
                        this.getMetricAggregationType()) == false)
            return false;
        if (other.getEstimatedInstanceWarmup() == null
                ^ this.getEstimatedInstanceWarmup() == null)
            return false;
        if (other.getEstimatedInstanceWarmup() != null
                && other.getEstimatedInstanceWarmup().equals(
                        this.getEstimatedInstanceWarmup()) == false)
            return false;
        if (other.getAlarms() == null ^ this.getAlarms() == null)
            return false;
        if (other.getAlarms() != null
                && other.getAlarms().equals(this.getAlarms()) == false)
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
                + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyARN() == null) ? 0 : getPolicyARN().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdjustmentType() == null) ? 0 : getAdjustmentType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMinAdjustmentStep() == null) ? 0
                        : getMinAdjustmentStep().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinAdjustmentMagnitude() == null) ? 0
                        : getMinAdjustmentMagnitude().hashCode());
        hashCode = prime
                * hashCode
                + ((getScalingAdjustment() == null) ? 0
                        : getScalingAdjustment().hashCode());
        hashCode = prime * hashCode
                + ((getCooldown() == null) ? 0 : getCooldown().hashCode());
        hashCode = prime
                * hashCode
                + ((getStepAdjustments() == null) ? 0 : getStepAdjustments()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMetricAggregationType() == null) ? 0
                        : getMetricAggregationType().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedInstanceWarmup() == null) ? 0
                        : getEstimatedInstanceWarmup().hashCode());
        hashCode = prime * hashCode
                + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
        return hashCode;
    }

    @Override
    public ScalingPolicy clone() {
        try {
            return (ScalingPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
