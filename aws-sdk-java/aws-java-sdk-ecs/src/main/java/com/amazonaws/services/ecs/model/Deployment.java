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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * The details of an Amazon ECS service deployment.
 * </p>
 */
public class Deployment implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of the deployment. Valid values are <code>PRIMARY</code> (for
     * the most recent deployment), <code>ACTIVE</code> (for previous
     * deployments that still have tasks running, but are being replaced with
     * the <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     * deployments that have been completely replaced).
     * </p>
     */
    private String status;
    /**
     * <p>
     * The most recent task definition that was specified for the service to
     * use.
     * </p>
     */
    private String taskDefinition;
    /**
     * <p>
     * The most recent desired count of tasks that was specified for the service
     * to deploy or maintain.
     * </p>
     */
    private Integer desiredCount;
    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>PENDING</code> status.
     * </p>
     */
    private Integer pendingCount;
    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>RUNNING</code> status.
     * </p>
     */
    private Integer runningCount;
    /**
     * <p>
     * The Unix time in seconds and milliseconds when the service was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix time in seconds and milliseconds when the service was last
     * updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @param id
     *        The ID of the deployment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @return The ID of the deployment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the deployment.
     * </p>
     * 
     * @param id
     *        The ID of the deployment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Deployment withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status of the deployment. Valid values are <code>PRIMARY</code> (for
     * the most recent deployment), <code>ACTIVE</code> (for previous
     * deployments that still have tasks running, but are being replaced with
     * the <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     * deployments that have been completely replaced).
     * </p>
     * 
     * @param status
     *        The status of the deployment. Valid values are
     *        <code>PRIMARY</code> (for the most recent deployment),
     *        <code>ACTIVE</code> (for previous deployments that still have
     *        tasks running, but are being replaced with the
     *        <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     *        deployments that have been completely replaced).
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deployment. Valid values are <code>PRIMARY</code> (for
     * the most recent deployment), <code>ACTIVE</code> (for previous
     * deployments that still have tasks running, but are being replaced with
     * the <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     * deployments that have been completely replaced).
     * </p>
     * 
     * @return The status of the deployment. Valid values are
     *         <code>PRIMARY</code> (for the most recent deployment),
     *         <code>ACTIVE</code> (for previous deployments that still have
     *         tasks running, but are being replaced with the
     *         <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     *         deployments that have been completely replaced).
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the deployment. Valid values are <code>PRIMARY</code> (for
     * the most recent deployment), <code>ACTIVE</code> (for previous
     * deployments that still have tasks running, but are being replaced with
     * the <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     * deployments that have been completely replaced).
     * </p>
     * 
     * @param status
     *        The status of the deployment. Valid values are
     *        <code>PRIMARY</code> (for the most recent deployment),
     *        <code>ACTIVE</code> (for previous deployments that still have
     *        tasks running, but are being replaced with the
     *        <code>PRIMARY</code> deployment), and <code>INACTIVE</code> (for
     *        deployments that have been completely replaced).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Deployment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The most recent task definition that was specified for the service to
     * use.
     * </p>
     * 
     * @param taskDefinition
     *        The most recent task definition that was specified for the service
     *        to use.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The most recent task definition that was specified for the service to
     * use.
     * </p>
     * 
     * @return The most recent task definition that was specified for the
     *         service to use.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The most recent task definition that was specified for the service to
     * use.
     * </p>
     * 
     * @param taskDefinition
     *        The most recent task definition that was specified for the service
     *        to use.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Deployment withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * <p>
     * The most recent desired count of tasks that was specified for the service
     * to deploy or maintain.
     * </p>
     * 
     * @param desiredCount
     *        The most recent desired count of tasks that was specified for the
     *        service to deploy or maintain.
     */

    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The most recent desired count of tasks that was specified for the service
     * to deploy or maintain.
     * </p>
     * 
     * @return The most recent desired count of tasks that was specified for the
     *         service to deploy or maintain.
     */

    public Integer getDesiredCount() {
        return this.desiredCount;
    }

    /**
     * <p>
     * The most recent desired count of tasks that was specified for the service
     * to deploy or maintain.
     * </p>
     * 
     * @param desiredCount
     *        The most recent desired count of tasks that was specified for the
     *        service to deploy or maintain.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Deployment withDesiredCount(Integer desiredCount) {
        setDesiredCount(desiredCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>PENDING</code> status.
     * </p>
     * 
     * @param pendingCount
     *        The number of tasks in the deployment that are in the
     *        <code>PENDING</code> status.
     */

    public void setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>PENDING</code> status.
     * </p>
     * 
     * @return The number of tasks in the deployment that are in the
     *         <code>PENDING</code> status.
     */

    public Integer getPendingCount() {
        return this.pendingCount;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>PENDING</code> status.
     * </p>
     * 
     * @param pendingCount
     *        The number of tasks in the deployment that are in the
     *        <code>PENDING</code> status.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Deployment withPendingCount(Integer pendingCount) {
        setPendingCount(pendingCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>RUNNING</code> status.
     * </p>
     * 
     * @param runningCount
     *        The number of tasks in the deployment that are in the
     *        <code>RUNNING</code> status.
     */

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>RUNNING</code> status.
     * </p>
     * 
     * @return The number of tasks in the deployment that are in the
     *         <code>RUNNING</code> status.
     */

    public Integer getRunningCount() {
        return this.runningCount;
    }

    /**
     * <p>
     * The number of tasks in the deployment that are in the
     * <code>RUNNING</code> status.
     * </p>
     * 
     * @param runningCount
     *        The number of tasks in the deployment that are in the
     *        <code>RUNNING</code> status.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Deployment withRunningCount(Integer runningCount) {
        setRunningCount(runningCount);
        return this;
    }

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the service was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix time in seconds and milliseconds when the service was
     *        created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the service was created.
     * </p>
     * 
     * @return The Unix time in seconds and milliseconds when the service was
     *         created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the service was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix time in seconds and milliseconds when the service was
     *        created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Deployment withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the service was last
     * updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix time in seconds and milliseconds when the service was
     *        last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the service was last
     * updated.
     * </p>
     * 
     * @return The Unix time in seconds and milliseconds when the service was
     *         last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix time in seconds and milliseconds when the service was last
     * updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix time in seconds and milliseconds when the service was
     *        last updated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Deployment withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: " + getTaskDefinition() + ",");
        if (getDesiredCount() != null)
            sb.append("DesiredCount: " + getDesiredCount() + ",");
        if (getPendingCount() != null)
            sb.append("PendingCount: " + getPendingCount() + ",");
        if (getRunningCount() != null)
            sb.append("RunningCount: " + getRunningCount() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Deployment == false)
            return false;
        Deployment other = (Deployment) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTaskDefinition() == null
                ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null
                && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null
                && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getPendingCount() == null ^ this.getPendingCount() == null)
            return false;
        if (other.getPendingCount() != null
                && other.getPendingCount().equals(this.getPendingCount()) == false)
            return false;
        if (other.getRunningCount() == null ^ this.getRunningCount() == null)
            return false;
        if (other.getRunningCount() != null
                && other.getRunningCount().equals(this.getRunningCount()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getTaskDefinition() == null) ? 0 : getTaskDefinition()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDesiredCount() == null) ? 0 : getDesiredCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPendingCount() == null) ? 0 : getPendingCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRunningCount() == null) ? 0 : getRunningCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Deployment clone() {
        try {
            return (Deployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
