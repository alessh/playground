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
public class SetDesiredCapacityRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling
     * group.
     * </p>
     */
    private Integer desiredCapacity;
    /**
     * <p>
     * By default, <code>SetDesiredCapacity</code> overrides any cooldown period
     * associated with the Auto Scaling group. Specify <code>True</code> to make
     * Auto Scaling to wait for the cool-down period associated with the Auto
     * Scaling group to complete before initiating a scaling activity to set
     * your Auto Scaling group to its new capacity.
     * </p>
     */
    private Boolean honorCooldown;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetDesiredCapacityRequest withAutoScalingGroupName(
            String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling
     * group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of EC2 instances that should be running in the Auto
     *        Scaling group.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling
     * group.
     * </p>
     * 
     * @return The number of EC2 instances that should be running in the Auto
     *         Scaling group.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling
     * group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of EC2 instances that should be running in the Auto
     *        Scaling group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetDesiredCapacityRequest withDesiredCapacity(Integer desiredCapacity) {
        setDesiredCapacity(desiredCapacity);
        return this;
    }

    /**
     * <p>
     * By default, <code>SetDesiredCapacity</code> overrides any cooldown period
     * associated with the Auto Scaling group. Specify <code>True</code> to make
     * Auto Scaling to wait for the cool-down period associated with the Auto
     * Scaling group to complete before initiating a scaling activity to set
     * your Auto Scaling group to its new capacity.
     * </p>
     * 
     * @param honorCooldown
     *        By default, <code>SetDesiredCapacity</code> overrides any cooldown
     *        period associated with the Auto Scaling group. Specify
     *        <code>True</code> to make Auto Scaling to wait for the cool-down
     *        period associated with the Auto Scaling group to complete before
     *        initiating a scaling activity to set your Auto Scaling group to
     *        its new capacity.
     */

    public void setHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
    }

    /**
     * <p>
     * By default, <code>SetDesiredCapacity</code> overrides any cooldown period
     * associated with the Auto Scaling group. Specify <code>True</code> to make
     * Auto Scaling to wait for the cool-down period associated with the Auto
     * Scaling group to complete before initiating a scaling activity to set
     * your Auto Scaling group to its new capacity.
     * </p>
     * 
     * @return By default, <code>SetDesiredCapacity</code> overrides any
     *         cooldown period associated with the Auto Scaling group. Specify
     *         <code>True</code> to make Auto Scaling to wait for the cool-down
     *         period associated with the Auto Scaling group to complete before
     *         initiating a scaling activity to set your Auto Scaling group to
     *         its new capacity.
     */

    public Boolean getHonorCooldown() {
        return this.honorCooldown;
    }

    /**
     * <p>
     * By default, <code>SetDesiredCapacity</code> overrides any cooldown period
     * associated with the Auto Scaling group. Specify <code>True</code> to make
     * Auto Scaling to wait for the cool-down period associated with the Auto
     * Scaling group to complete before initiating a scaling activity to set
     * your Auto Scaling group to its new capacity.
     * </p>
     * 
     * @param honorCooldown
     *        By default, <code>SetDesiredCapacity</code> overrides any cooldown
     *        period associated with the Auto Scaling group. Specify
     *        <code>True</code> to make Auto Scaling to wait for the cool-down
     *        period associated with the Auto Scaling group to complete before
     *        initiating a scaling activity to set your Auto Scaling group to
     *        its new capacity.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetDesiredCapacityRequest withHonorCooldown(Boolean honorCooldown) {
        setHonorCooldown(honorCooldown);
        return this;
    }

    /**
     * <p>
     * By default, <code>SetDesiredCapacity</code> overrides any cooldown period
     * associated with the Auto Scaling group. Specify <code>True</code> to make
     * Auto Scaling to wait for the cool-down period associated with the Auto
     * Scaling group to complete before initiating a scaling activity to set
     * your Auto Scaling group to its new capacity.
     * </p>
     * 
     * @return By default, <code>SetDesiredCapacity</code> overrides any
     *         cooldown period associated with the Auto Scaling group. Specify
     *         <code>True</code> to make Auto Scaling to wait for the cool-down
     *         period associated with the Auto Scaling group to complete before
     *         initiating a scaling activity to set your Auto Scaling group to
     *         its new capacity.
     */

    public Boolean isHonorCooldown() {
        return this.honorCooldown;
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
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: " + getDesiredCapacity() + ",");
        if (getHonorCooldown() != null)
            sb.append("HonorCooldown: " + getHonorCooldown());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetDesiredCapacityRequest == false)
            return false;
        SetDesiredCapacityRequest other = (SetDesiredCapacityRequest) obj;
        if (other.getAutoScalingGroupName() == null
                ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(
                        this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getDesiredCapacity() == null
                ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null
                && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        if (other.getHonorCooldown() == null ^ this.getHonorCooldown() == null)
            return false;
        if (other.getHonorCooldown() != null
                && other.getHonorCooldown().equals(this.getHonorCooldown()) == false)
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
                + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHonorCooldown() == null) ? 0 : getHonorCooldown()
                        .hashCode());
        return hashCode;
    }

    @Override
    public SetDesiredCapacityRequest clone() {
        return (SetDesiredCapacityRequest) super.clone();
    }
}