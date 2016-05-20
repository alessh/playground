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
public class DeleteAutoScalingGroupRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the group to delete.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * Specifies that the group will be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions associated
     * with the group.
     * </p>
     */
    private Boolean forceDelete;

    /**
     * <p>
     * The name of the group to delete.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the group to delete.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group to delete.
     * </p>
     * 
     * @return The name of the group to delete.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group to delete.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the group to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteAutoScalingGroupRequest withAutoScalingGroupName(
            String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies that the group will be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions associated
     * with the group.
     * </p>
     * 
     * @param forceDelete
     *        Specifies that the group will be deleted along with all instances
     *        associated with the group, without waiting for all instances to be
     *        terminated. This parameter also deletes any lifecycle actions
     *        associated with the group.
     */

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * Specifies that the group will be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions associated
     * with the group.
     * </p>
     * 
     * @return Specifies that the group will be deleted along with all instances
     *         associated with the group, without waiting for all instances to
     *         be terminated. This parameter also deletes any lifecycle actions
     *         associated with the group.
     */

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * Specifies that the group will be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions associated
     * with the group.
     * </p>
     * 
     * @param forceDelete
     *        Specifies that the group will be deleted along with all instances
     *        associated with the group, without waiting for all instances to be
     *        terminated. This parameter also deletes any lifecycle actions
     *        associated with the group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteAutoScalingGroupRequest withForceDelete(Boolean forceDelete) {
        setForceDelete(forceDelete);
        return this;
    }

    /**
     * <p>
     * Specifies that the group will be deleted along with all instances
     * associated with the group, without waiting for all instances to be
     * terminated. This parameter also deletes any lifecycle actions associated
     * with the group.
     * </p>
     * 
     * @return Specifies that the group will be deleted along with all instances
     *         associated with the group, without waiting for all instances to
     *         be terminated. This parameter also deletes any lifecycle actions
     *         associated with the group.
     */

    public Boolean isForceDelete() {
        return this.forceDelete;
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
        if (getForceDelete() != null)
            sb.append("ForceDelete: " + getForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAutoScalingGroupRequest == false)
            return false;
        DeleteAutoScalingGroupRequest other = (DeleteAutoScalingGroupRequest) obj;
        if (other.getAutoScalingGroupName() == null
                ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(
                        this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null
                && other.getForceDelete().equals(this.getForceDelete()) == false)
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
                + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAutoScalingGroupRequest clone() {
        return (DeleteAutoScalingGroupRequest) super.clone();
    }
}