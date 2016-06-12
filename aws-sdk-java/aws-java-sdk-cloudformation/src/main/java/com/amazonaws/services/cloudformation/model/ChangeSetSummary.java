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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>ChangeSetSummary</code> structure describes a change set, its
 * status, and the stack with which it's associated.
 * </p>
 */
public class ChangeSetSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the stack with which the change set is associated.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The name of the stack with which the change set is associated.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The ID of the change set.
     * </p>
     */
    private String changeSetId;
    /**
     * <p>
     * The name of the change set.
     * </p>
     */
    private String changeSetName;
    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>,
     * <code>CREATE_COMPLETE</code>, or <code>FAILED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A description of the change set's status. For example, if your change set
     * is in the <code>FAILED</code> state, AWS CloudFormation shows the error
     * message.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Descriptive information about the change set.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the stack with which the change set is associated.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack with which the change set is associated.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the stack with which the change set is associated.
     * </p>
     * 
     * @return The ID of the stack with which the change set is associated.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The ID of the stack with which the change set is associated.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack with which the change set is associated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ChangeSetSummary withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The name of the stack with which the change set is associated.
     * </p>
     * 
     * @param stackName
     *        The name of the stack with which the change set is associated.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack with which the change set is associated.
     * </p>
     * 
     * @return The name of the stack with which the change set is associated.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name of the stack with which the change set is associated.
     * </p>
     * 
     * @param stackName
     *        The name of the stack with which the change set is associated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ChangeSetSummary withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The ID of the change set.
     * </p>
     * 
     * @param changeSetId
     *        The ID of the change set.
     */

    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * The ID of the change set.
     * </p>
     * 
     * @return The ID of the change set.
     */

    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * <p>
     * The ID of the change set.
     * </p>
     * 
     * @param changeSetId
     *        The ID of the change set.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ChangeSetSummary withChangeSetId(String changeSetId) {
        setChangeSetId(changeSetId);
        return this;
    }

    /**
     * <p>
     * The name of the change set.
     * </p>
     * 
     * @param changeSetName
     *        The name of the change set.
     */

    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The name of the change set.
     * </p>
     * 
     * @return The name of the change set.
     */

    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * <p>
     * The name of the change set.
     * </p>
     * 
     * @param changeSetName
     *        The name of the change set.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ChangeSetSummary withChangeSetName(String changeSetName) {
        setChangeSetName(changeSetName);
        return this;
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>,
     * <code>CREATE_COMPLETE</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The state of the change set, such as
     *        <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     *        <code>FAILED</code>.
     * @see ChangeSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>,
     * <code>CREATE_COMPLETE</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @return The state of the change set, such as
     *         <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     *         <code>FAILED</code>.
     * @see ChangeSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>,
     * <code>CREATE_COMPLETE</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The state of the change set, such as
     *        <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChangeSetStatus
     */

    public ChangeSetSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>,
     * <code>CREATE_COMPLETE</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The state of the change set, such as
     *        <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChangeSetStatus
     */

    public void setStatus(ChangeSetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The state of the change set, such as <code>CREATE_IN_PROGRESS</code>,
     * <code>CREATE_COMPLETE</code>, or <code>FAILED</code>.
     * </p>
     * 
     * @param status
     *        The state of the change set, such as
     *        <code>CREATE_IN_PROGRESS</code>, <code>CREATE_COMPLETE</code>, or
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChangeSetStatus
     */

    public ChangeSetSummary withStatus(ChangeSetStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A description of the change set's status. For example, if your change set
     * is in the <code>FAILED</code> state, AWS CloudFormation shows the error
     * message.
     * </p>
     * 
     * @param statusReason
     *        A description of the change set's status. For example, if your
     *        change set is in the <code>FAILED</code> state, AWS CloudFormation
     *        shows the error message.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * A description of the change set's status. For example, if your change set
     * is in the <code>FAILED</code> state, AWS CloudFormation shows the error
     * message.
     * </p>
     * 
     * @return A description of the change set's status. For example, if your
     *         change set is in the <code>FAILED</code> state, AWS
     *         CloudFormation shows the error message.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * A description of the change set's status. For example, if your change set
     * is in the <code>FAILED</code> state, AWS CloudFormation shows the error
     * message.
     * </p>
     * 
     * @param statusReason
     *        A description of the change set's status. For example, if your
     *        change set is in the <code>FAILED</code> state, AWS CloudFormation
     *        shows the error message.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ChangeSetSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     * 
     * @param creationTime
     *        The start time when the change set was created, in UTC.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     * 
     * @return The start time when the change set was created, in UTC.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The start time when the change set was created, in UTC.
     * </p>
     * 
     * @param creationTime
     *        The start time when the change set was created, in UTC.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ChangeSetSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Descriptive information about the change set.
     * </p>
     * 
     * @param description
     *        Descriptive information about the change set.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Descriptive information about the change set.
     * </p>
     * 
     * @return Descriptive information about the change set.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Descriptive information about the change set.
     * </p>
     * 
     * @param description
     *        Descriptive information about the change set.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ChangeSetSummary withDescription(String description) {
        setDescription(description);
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
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: " + getChangeSetId() + ",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: " + getChangeSetName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusReason() != null)
            sb.append("StatusReason: " + getStatusReason() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeSetSummary == false)
            return false;
        ChangeSetSummary other = (ChangeSetSummary) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null
                && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null
                && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null
                && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode
                + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime
                * hashCode
                + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getChangeSetName() == null) ? 0 : getChangeSetName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ChangeSetSummary clone() {
        try {
            return (ChangeSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
