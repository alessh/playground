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

package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * An invocation is copy of a command sent to a specific instance. A command can
 * apply to one or more instances. A command invocation applies to one instance.
 * For example, if a user executes SendCommand against three instances, then a
 * command invocation is created for each requested instance ID. A command
 * invocation returns status and detail information about a command you
 * executed.
 */
public class CommandInvocation implements Serializable, Cloneable {

    /** The command against which this invocation was requested. */
    private String commandId;
    /** The instance ID in which this invocation was requested. */
    private String instanceId;
    /**
     * User-specified information about the command, such as a brief description
     * of what the command should do.
     */
    private String comment;
    /** The document name that was requested for execution. */
    private String documentName;
    /** The time and date the request was sent to this instance. */
    private java.util.Date requestedDateTime;
    /** Whether or not the invocation succeeded, failed, or is pending. */
    private String status;
    /** Gets the trace output sent by the agent. */
    private String traceOutput;

    private com.amazonaws.internal.SdkInternalList<CommandPlugin> commandPlugins;

    /**
     * The command against which this invocation was requested.
     * 
     * @param commandId
     *        The command against which this invocation was requested.
     */

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * The command against which this invocation was requested.
     * 
     * @return The command against which this invocation was requested.
     */

    public String getCommandId() {
        return this.commandId;
    }

    /**
     * The command against which this invocation was requested.
     * 
     * @param commandId
     *        The command against which this invocation was requested.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CommandInvocation withCommandId(String commandId) {
        setCommandId(commandId);
        return this;
    }

    /**
     * The instance ID in which this invocation was requested.
     * 
     * @param instanceId
     *        The instance ID in which this invocation was requested.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * The instance ID in which this invocation was requested.
     * 
     * @return The instance ID in which this invocation was requested.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * The instance ID in which this invocation was requested.
     * 
     * @param instanceId
     *        The instance ID in which this invocation was requested.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CommandInvocation withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * User-specified information about the command, such as a brief description
     * of what the command should do.
     * 
     * @param comment
     *        User-specified information about the command, such as a brief
     *        description of what the command should do.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * User-specified information about the command, such as a brief description
     * of what the command should do.
     * 
     * @return User-specified information about the command, such as a brief
     *         description of what the command should do.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * User-specified information about the command, such as a brief description
     * of what the command should do.
     * 
     * @param comment
     *        User-specified information about the command, such as a brief
     *        description of what the command should do.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CommandInvocation withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * The document name that was requested for execution.
     * 
     * @param documentName
     *        The document name that was requested for execution.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * The document name that was requested for execution.
     * 
     * @return The document name that was requested for execution.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * The document name that was requested for execution.
     * 
     * @param documentName
     *        The document name that was requested for execution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CommandInvocation withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * The time and date the request was sent to this instance.
     * 
     * @param requestedDateTime
     *        The time and date the request was sent to this instance.
     */

    public void setRequestedDateTime(java.util.Date requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }

    /**
     * The time and date the request was sent to this instance.
     * 
     * @return The time and date the request was sent to this instance.
     */

    public java.util.Date getRequestedDateTime() {
        return this.requestedDateTime;
    }

    /**
     * The time and date the request was sent to this instance.
     * 
     * @param requestedDateTime
     *        The time and date the request was sent to this instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CommandInvocation withRequestedDateTime(
            java.util.Date requestedDateTime) {
        setRequestedDateTime(requestedDateTime);
        return this;
    }

    /**
     * Whether or not the invocation succeeded, failed, or is pending.
     * 
     * @param status
     *        Whether or not the invocation succeeded, failed, or is pending.
     * @see CommandInvocationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Whether or not the invocation succeeded, failed, or is pending.
     * 
     * @return Whether or not the invocation succeeded, failed, or is pending.
     * @see CommandInvocationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * Whether or not the invocation succeeded, failed, or is pending.
     * 
     * @param status
     *        Whether or not the invocation succeeded, failed, or is pending.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CommandInvocationStatus
     */

    public CommandInvocation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * Whether or not the invocation succeeded, failed, or is pending.
     * 
     * @param status
     *        Whether or not the invocation succeeded, failed, or is pending.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CommandInvocationStatus
     */

    public void setStatus(CommandInvocationStatus status) {
        this.status = status.toString();
    }

    /**
     * Whether or not the invocation succeeded, failed, or is pending.
     * 
     * @param status
     *        Whether or not the invocation succeeded, failed, or is pending.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CommandInvocationStatus
     */

    public CommandInvocation withStatus(CommandInvocationStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * Gets the trace output sent by the agent.
     * 
     * @param traceOutput
     *        Gets the trace output sent by the agent.
     */

    public void setTraceOutput(String traceOutput) {
        this.traceOutput = traceOutput;
    }

    /**
     * Gets the trace output sent by the agent.
     * 
     * @return Gets the trace output sent by the agent.
     */

    public String getTraceOutput() {
        return this.traceOutput;
    }

    /**
     * Gets the trace output sent by the agent.
     * 
     * @param traceOutput
     *        Gets the trace output sent by the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CommandInvocation withTraceOutput(String traceOutput) {
        setTraceOutput(traceOutput);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<CommandPlugin> getCommandPlugins() {
        if (commandPlugins == null) {
            commandPlugins = new com.amazonaws.internal.SdkInternalList<CommandPlugin>();
        }
        return commandPlugins;
    }

    /**
     * @param commandPlugins
     */

    public void setCommandPlugins(
            java.util.Collection<CommandPlugin> commandPlugins) {
        if (commandPlugins == null) {
            this.commandPlugins = null;
            return;
        }

        this.commandPlugins = new com.amazonaws.internal.SdkInternalList<CommandPlugin>(
                commandPlugins);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCommandPlugins(java.util.Collection)} or
     * {@link #withCommandPlugins(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param commandPlugins
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CommandInvocation withCommandPlugins(CommandPlugin... commandPlugins) {
        if (this.commandPlugins == null) {
            setCommandPlugins(new com.amazonaws.internal.SdkInternalList<CommandPlugin>(
                    commandPlugins.length));
        }
        for (CommandPlugin ele : commandPlugins) {
            this.commandPlugins.add(ele);
        }
        return this;
    }

    /**
     * @param commandPlugins
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CommandInvocation withCommandPlugins(
            java.util.Collection<CommandPlugin> commandPlugins) {
        setCommandPlugins(commandPlugins);
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
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getDocumentName() != null)
            sb.append("DocumentName: " + getDocumentName() + ",");
        if (getRequestedDateTime() != null)
            sb.append("RequestedDateTime: " + getRequestedDateTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTraceOutput() != null)
            sb.append("TraceOutput: " + getTraceOutput() + ",");
        if (getCommandPlugins() != null)
            sb.append("CommandPlugins: " + getCommandPlugins());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommandInvocation == false)
            return false;
        CommandInvocation other = (CommandInvocation) obj;
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
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null
                && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null
                && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getRequestedDateTime() == null
                ^ this.getRequestedDateTime() == null)
            return false;
        if (other.getRequestedDateTime() != null
                && other.getRequestedDateTime().equals(
                        this.getRequestedDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTraceOutput() == null ^ this.getTraceOutput() == null)
            return false;
        if (other.getTraceOutput() != null
                && other.getTraceOutput().equals(this.getTraceOutput()) == false)
            return false;
        if (other.getCommandPlugins() == null
                ^ this.getCommandPlugins() == null)
            return false;
        if (other.getCommandPlugins() != null
                && other.getCommandPlugins().equals(this.getCommandPlugins()) == false)
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
        hashCode = prime * hashCode
                + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentName() == null) ? 0 : getDocumentName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestedDateTime() == null) ? 0
                        : getRequestedDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getTraceOutput() == null) ? 0 : getTraceOutput().hashCode());
        hashCode = prime
                * hashCode
                + ((getCommandPlugins() == null) ? 0 : getCommandPlugins()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CommandInvocation clone() {
        try {
            return (CommandInvocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
