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

package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a command.
 * </p>
 */
public class Command implements Serializable, Cloneable {

    /**
     * <p>
     * The command ID.
     * </p>
     */
    private String commandId;
    /**
     * <p>
     * The ID of the instance where the command was executed.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The command deployment ID.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * Date and time when the command was run.
     * </p>
     */
    private String createdAt;
    /**
     * <p>
     * Date and time when the command was acknowledged.
     * </p>
     */
    private String acknowledgedAt;
    /**
     * <p>
     * Date when the command completed.
     * </p>
     */
    private String completedAt;
    /**
     * <p>
     * The command status:
     * </p>
     * <ul>
     * <li>failed</li>
     * <li>successful</li>
     * <li>skipped</li>
     * <li>pending</li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The command exit code.
     * </p>
     */
    private Integer exitCode;
    /**
     * <p>
     * The URL of the command log.
     * </p>
     */
    private String logUrl;
    /**
     * <p>
     * The command type:
     * </p>
     * <ul>
     * <li> <code>deploy</code></li>
     * <li> <code>rollback</code></li>
     * <li> <code>start</code></li>
     * <li> <code>stop</code></li>
     * <li> <code>restart</code></li>
     * <li> <code>undeploy</code></li>
     * <li> <code>update_dependencies</code></li>
     * <li> <code>install_dependencies</code></li>
     * <li> <code>update_custom_cookbooks</code></li>
     * <li> <code>execute_recipes</code></li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The command ID.
     * </p>
     * 
     * @param commandId
     *        The command ID.
     */

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>
     * The command ID.
     * </p>
     * 
     * @return The command ID.
     */

    public String getCommandId() {
        return this.commandId;
    }

    /**
     * <p>
     * The command ID.
     * </p>
     * 
     * @param commandId
     *        The command ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Command withCommandId(String commandId) {
        setCommandId(commandId);
        return this;
    }

    /**
     * <p>
     * The ID of the instance where the command was executed.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance where the command was executed.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance where the command was executed.
     * </p>
     * 
     * @return The ID of the instance where the command was executed.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance where the command was executed.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance where the command was executed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Command withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The command deployment ID.
     * </p>
     * 
     * @param deploymentId
     *        The command deployment ID.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The command deployment ID.
     * </p>
     * 
     * @return The command deployment ID.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The command deployment ID.
     * </p>
     * 
     * @param deploymentId
     *        The command deployment ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Command withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * Date and time when the command was run.
     * </p>
     * 
     * @param createdAt
     *        Date and time when the command was run.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Date and time when the command was run.
     * </p>
     * 
     * @return Date and time when the command was run.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Date and time when the command was run.
     * </p>
     * 
     * @param createdAt
     *        Date and time when the command was run.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Command withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Date and time when the command was acknowledged.
     * </p>
     * 
     * @param acknowledgedAt
     *        Date and time when the command was acknowledged.
     */

    public void setAcknowledgedAt(String acknowledgedAt) {
        this.acknowledgedAt = acknowledgedAt;
    }

    /**
     * <p>
     * Date and time when the command was acknowledged.
     * </p>
     * 
     * @return Date and time when the command was acknowledged.
     */

    public String getAcknowledgedAt() {
        return this.acknowledgedAt;
    }

    /**
     * <p>
     * Date and time when the command was acknowledged.
     * </p>
     * 
     * @param acknowledgedAt
     *        Date and time when the command was acknowledged.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Command withAcknowledgedAt(String acknowledgedAt) {
        setAcknowledgedAt(acknowledgedAt);
        return this;
    }

    /**
     * <p>
     * Date when the command completed.
     * </p>
     * 
     * @param completedAt
     *        Date when the command completed.
     */

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * Date when the command completed.
     * </p>
     * 
     * @return Date when the command completed.
     */

    public String getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * Date when the command completed.
     * </p>
     * 
     * @param completedAt
     *        Date when the command completed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Command withCompletedAt(String completedAt) {
        setCompletedAt(completedAt);
        return this;
    }

    /**
     * <p>
     * The command status:
     * </p>
     * <ul>
     * <li>failed</li>
     * <li>successful</li>
     * <li>skipped</li>
     * <li>pending</li>
     * </ul>
     * 
     * @param status
     *        The command status:</p>
     *        <ul>
     *        <li>failed</li>
     *        <li>successful</li>
     *        <li>skipped</li>
     *        <li>pending</li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The command status:
     * </p>
     * <ul>
     * <li>failed</li>
     * <li>successful</li>
     * <li>skipped</li>
     * <li>pending</li>
     * </ul>
     * 
     * @return The command status:</p>
     *         <ul>
     *         <li>failed</li>
     *         <li>successful</li>
     *         <li>skipped</li>
     *         <li>pending</li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The command status:
     * </p>
     * <ul>
     * <li>failed</li>
     * <li>successful</li>
     * <li>skipped</li>
     * <li>pending</li>
     * </ul>
     * 
     * @param status
     *        The command status:</p>
     *        <ul>
     *        <li>failed</li>
     *        <li>successful</li>
     *        <li>skipped</li>
     *        <li>pending</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Command withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The command exit code.
     * </p>
     * 
     * @param exitCode
     *        The command exit code.
     */

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * <p>
     * The command exit code.
     * </p>
     * 
     * @return The command exit code.
     */

    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * <p>
     * The command exit code.
     * </p>
     * 
     * @param exitCode
     *        The command exit code.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Command withExitCode(Integer exitCode) {
        setExitCode(exitCode);
        return this;
    }

    /**
     * <p>
     * The URL of the command log.
     * </p>
     * 
     * @param logUrl
     *        The URL of the command log.
     */

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    /**
     * <p>
     * The URL of the command log.
     * </p>
     * 
     * @return The URL of the command log.
     */

    public String getLogUrl() {
        return this.logUrl;
    }

    /**
     * <p>
     * The URL of the command log.
     * </p>
     * 
     * @param logUrl
     *        The URL of the command log.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Command withLogUrl(String logUrl) {
        setLogUrl(logUrl);
        return this;
    }

    /**
     * <p>
     * The command type:
     * </p>
     * <ul>
     * <li> <code>deploy</code></li>
     * <li> <code>rollback</code></li>
     * <li> <code>start</code></li>
     * <li> <code>stop</code></li>
     * <li> <code>restart</code></li>
     * <li> <code>undeploy</code></li>
     * <li> <code>update_dependencies</code></li>
     * <li> <code>install_dependencies</code></li>
     * <li> <code>update_custom_cookbooks</code></li>
     * <li> <code>execute_recipes</code></li>
     * </ul>
     * 
     * @param type
     *        The command type:</p>
     *        <ul>
     *        <li> <code>deploy</code></li>
     *        <li> <code>rollback</code></li>
     *        <li> <code>start</code></li>
     *        <li> <code>stop</code></li>
     *        <li> <code>restart</code></li>
     *        <li> <code>undeploy</code></li>
     *        <li> <code>update_dependencies</code></li>
     *        <li> <code>install_dependencies</code></li>
     *        <li> <code>update_custom_cookbooks</code></li>
     *        <li> <code>execute_recipes</code></li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The command type:
     * </p>
     * <ul>
     * <li> <code>deploy</code></li>
     * <li> <code>rollback</code></li>
     * <li> <code>start</code></li>
     * <li> <code>stop</code></li>
     * <li> <code>restart</code></li>
     * <li> <code>undeploy</code></li>
     * <li> <code>update_dependencies</code></li>
     * <li> <code>install_dependencies</code></li>
     * <li> <code>update_custom_cookbooks</code></li>
     * <li> <code>execute_recipes</code></li>
     * </ul>
     * 
     * @return The command type:</p>
     *         <ul>
     *         <li> <code>deploy</code></li>
     *         <li> <code>rollback</code></li>
     *         <li> <code>start</code></li>
     *         <li> <code>stop</code></li>
     *         <li> <code>restart</code></li>
     *         <li> <code>undeploy</code></li>
     *         <li> <code>update_dependencies</code></li>
     *         <li> <code>install_dependencies</code></li>
     *         <li> <code>update_custom_cookbooks</code></li>
     *         <li> <code>execute_recipes</code></li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The command type:
     * </p>
     * <ul>
     * <li> <code>deploy</code></li>
     * <li> <code>rollback</code></li>
     * <li> <code>start</code></li>
     * <li> <code>stop</code></li>
     * <li> <code>restart</code></li>
     * <li> <code>undeploy</code></li>
     * <li> <code>update_dependencies</code></li>
     * <li> <code>install_dependencies</code></li>
     * <li> <code>update_custom_cookbooks</code></li>
     * <li> <code>execute_recipes</code></li>
     * </ul>
     * 
     * @param type
     *        The command type:</p>
     *        <ul>
     *        <li> <code>deploy</code></li>
     *        <li> <code>rollback</code></li>
     *        <li> <code>start</code></li>
     *        <li> <code>stop</code></li>
     *        <li> <code>restart</code></li>
     *        <li> <code>undeploy</code></li>
     *        <li> <code>update_dependencies</code></li>
     *        <li> <code>install_dependencies</code></li>
     *        <li> <code>update_custom_cookbooks</code></li>
     *        <li> <code>execute_recipes</code></li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Command withType(String type) {
        setType(type);
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
        if (getCommandId() != null)
            sb.append("CommandId: " + getCommandId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getAcknowledgedAt() != null)
            sb.append("AcknowledgedAt: " + getAcknowledgedAt() + ",");
        if (getCompletedAt() != null)
            sb.append("CompletedAt: " + getCompletedAt() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getExitCode() != null)
            sb.append("ExitCode: " + getExitCode() + ",");
        if (getLogUrl() != null)
            sb.append("LogUrl: " + getLogUrl() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Command == false)
            return false;
        Command other = (Command) obj;
        if (other.getCommandId() == null ^ this.getCommandId() == null)
            return false;
        if (other.getCommandId() != null
                && other.getCommandId().equals(this.getCommandId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getAcknowledgedAt() == null
                ^ this.getAcknowledgedAt() == null)
            return false;
        if (other.getAcknowledgedAt() != null
                && other.getAcknowledgedAt().equals(this.getAcknowledgedAt()) == false)
            return false;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null
                && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getExitCode() == null ^ this.getExitCode() == null)
            return false;
        if (other.getExitCode() != null
                && other.getExitCode().equals(this.getExitCode()) == false)
            return false;
        if (other.getLogUrl() == null ^ this.getLogUrl() == null)
            return false;
        if (other.getLogUrl() != null
                && other.getLogUrl().equals(this.getLogUrl()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null
                && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCommandId() == null) ? 0 : getCommandId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getAcknowledgedAt() == null) ? 0 : getAcknowledgedAt()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getExitCode() == null) ? 0 : getExitCode().hashCode());
        hashCode = prime * hashCode
                + ((getLogUrl() == null) ? 0 : getLogUrl().hashCode());
        hashCode = prime * hashCode
                + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Command clone() {
        try {
            return (Command) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
