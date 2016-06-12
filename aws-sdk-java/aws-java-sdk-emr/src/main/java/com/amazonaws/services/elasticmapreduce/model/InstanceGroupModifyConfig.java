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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Modify an instance group size.
 * </p>
 */
public class InstanceGroupModifyConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Unique ID of the instance group to expand or shrink.
     * </p>
     */
    private String instanceGroupId;
    /**
     * <p>
     * Target size for the instance group.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The EC2 InstanceIds to terminate. For advanced users only. Once you
     * terminate the instances, the instance group will not return to its
     * original requested size.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> eC2InstanceIdsToTerminate;

    /**
     * Default constructor for InstanceGroupModifyConfig object. Callers should
     * use the setter or fluent setter (with...) methods to initialize the
     * object after creating it.
     */
    public InstanceGroupModifyConfig() {
    }

    /**
     * Constructs a new InstanceGroupModifyConfig object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param instanceGroupId
     *        Unique ID of the instance group to expand or shrink.
     * @param instanceCount
     *        Target size for the instance group.
     */
    public InstanceGroupModifyConfig(String instanceGroupId,
            Integer instanceCount) {
        setInstanceGroupId(instanceGroupId);
        setInstanceCount(instanceCount);
    }

    /**
     * <p>
     * Unique ID of the instance group to expand or shrink.
     * </p>
     * 
     * @param instanceGroupId
     *        Unique ID of the instance group to expand or shrink.
     */

    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }

    /**
     * <p>
     * Unique ID of the instance group to expand or shrink.
     * </p>
     * 
     * @return Unique ID of the instance group to expand or shrink.
     */

    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * <p>
     * Unique ID of the instance group to expand or shrink.
     * </p>
     * 
     * @param instanceGroupId
     *        Unique ID of the instance group to expand or shrink.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroupModifyConfig withInstanceGroupId(String instanceGroupId) {
        setInstanceGroupId(instanceGroupId);
        return this;
    }

    /**
     * <p>
     * Target size for the instance group.
     * </p>
     * 
     * @param instanceCount
     *        Target size for the instance group.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * Target size for the instance group.
     * </p>
     * 
     * @return Target size for the instance group.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * Target size for the instance group.
     * </p>
     * 
     * @param instanceCount
     *        Target size for the instance group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroupModifyConfig withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The EC2 InstanceIds to terminate. For advanced users only. Once you
     * terminate the instances, the instance group will not return to its
     * original requested size.
     * </p>
     * 
     * @return The EC2 InstanceIds to terminate. For advanced users only. Once
     *         you terminate the instances, the instance group will not return
     *         to its original requested size.
     */

    public java.util.List<String> getEC2InstanceIdsToTerminate() {
        if (eC2InstanceIdsToTerminate == null) {
            eC2InstanceIdsToTerminate = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return eC2InstanceIdsToTerminate;
    }

    /**
     * <p>
     * The EC2 InstanceIds to terminate. For advanced users only. Once you
     * terminate the instances, the instance group will not return to its
     * original requested size.
     * </p>
     * 
     * @param eC2InstanceIdsToTerminate
     *        The EC2 InstanceIds to terminate. For advanced users only. Once
     *        you terminate the instances, the instance group will not return to
     *        its original requested size.
     */

    public void setEC2InstanceIdsToTerminate(
            java.util.Collection<String> eC2InstanceIdsToTerminate) {
        if (eC2InstanceIdsToTerminate == null) {
            this.eC2InstanceIdsToTerminate = null;
            return;
        }

        this.eC2InstanceIdsToTerminate = new com.amazonaws.internal.SdkInternalList<String>(
                eC2InstanceIdsToTerminate);
    }

    /**
     * <p>
     * The EC2 InstanceIds to terminate. For advanced users only. Once you
     * terminate the instances, the instance group will not return to its
     * original requested size.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEC2InstanceIdsToTerminate(java.util.Collection)} or
     * {@link #withEC2InstanceIdsToTerminate(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eC2InstanceIdsToTerminate
     *        The EC2 InstanceIds to terminate. For advanced users only. Once
     *        you terminate the instances, the instance group will not return to
     *        its original requested size.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroupModifyConfig withEC2InstanceIdsToTerminate(
            String... eC2InstanceIdsToTerminate) {
        if (this.eC2InstanceIdsToTerminate == null) {
            setEC2InstanceIdsToTerminate(new com.amazonaws.internal.SdkInternalList<String>(
                    eC2InstanceIdsToTerminate.length));
        }
        for (String ele : eC2InstanceIdsToTerminate) {
            this.eC2InstanceIdsToTerminate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 InstanceIds to terminate. For advanced users only. Once you
     * terminate the instances, the instance group will not return to its
     * original requested size.
     * </p>
     * 
     * @param eC2InstanceIdsToTerminate
     *        The EC2 InstanceIds to terminate. For advanced users only. Once
     *        you terminate the instances, the instance group will not return to
     *        its original requested size.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroupModifyConfig withEC2InstanceIdsToTerminate(
            java.util.Collection<String> eC2InstanceIdsToTerminate) {
        setEC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate);
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
        if (getInstanceGroupId() != null)
            sb.append("InstanceGroupId: " + getInstanceGroupId() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getEC2InstanceIdsToTerminate() != null)
            sb.append("EC2InstanceIdsToTerminate: "
                    + getEC2InstanceIdsToTerminate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceGroupModifyConfig == false)
            return false;
        InstanceGroupModifyConfig other = (InstanceGroupModifyConfig) obj;
        if (other.getInstanceGroupId() == null
                ^ this.getInstanceGroupId() == null)
            return false;
        if (other.getInstanceGroupId() != null
                && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getEC2InstanceIdsToTerminate() == null
                ^ this.getEC2InstanceIdsToTerminate() == null)
            return false;
        if (other.getEC2InstanceIdsToTerminate() != null
                && other.getEC2InstanceIdsToTerminate().equals(
                        this.getEC2InstanceIdsToTerminate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEC2InstanceIdsToTerminate() == null) ? 0
                        : getEC2InstanceIdsToTerminate().hashCode());
        return hashCode;
    }

    @Override
    public InstanceGroupModifyConfig clone() {
        try {
            return (InstanceGroupModifyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
