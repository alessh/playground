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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListCommandInvocationsRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /** (Optional) The invocations for a specific command ID. */
    private String commandId;
    /** (Optional) The command execution details for a specific instance ID. */
    private String instanceId;
    /**
     * (Optional) The maximum number of items to return for this call. The call
     * also returns a token that you can specify in a subsequent call to get the
     * next set of results.
     */
    private Integer maxResults;
    /**
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     */
    private String nextToken;
    /**
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     */
    private com.amazonaws.internal.SdkInternalList<CommandFilter> filters;
    /**
     * (Optional) If set this returns the response of the command executions and
     * any command output. By default this is set to False.
     */
    private Boolean details;

    /**
     * (Optional) The invocations for a specific command ID.
     * 
     * @param commandId
     *        (Optional) The invocations for a specific command ID.
     */

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * (Optional) The invocations for a specific command ID.
     * 
     * @return (Optional) The invocations for a specific command ID.
     */

    public String getCommandId() {
        return this.commandId;
    }

    /**
     * (Optional) The invocations for a specific command ID.
     * 
     * @param commandId
     *        (Optional) The invocations for a specific command ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCommandInvocationsRequest withCommandId(String commandId) {
        setCommandId(commandId);
        return this;
    }

    /**
     * (Optional) The command execution details for a specific instance ID.
     * 
     * @param instanceId
     *        (Optional) The command execution details for a specific instance
     *        ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * (Optional) The command execution details for a specific instance ID.
     * 
     * @return (Optional) The command execution details for a specific instance
     *         ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * (Optional) The command execution details for a specific instance ID.
     * 
     * @param instanceId
     *        (Optional) The command execution details for a specific instance
     *        ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCommandInvocationsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * (Optional) The maximum number of items to return for this call. The call
     * also returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * 
     * @param maxResults
     *        (Optional) The maximum number of items to return for this call.
     *        The call also returns a token that you can specify in a subsequent
     *        call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * (Optional) The maximum number of items to return for this call. The call
     * also returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * 
     * @return (Optional) The maximum number of items to return for this call.
     *         The call also returns a token that you can specify in a
     *         subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * (Optional) The maximum number of items to return for this call. The call
     * also returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * 
     * @param maxResults
     *        (Optional) The maximum number of items to return for this call.
     *        The call also returns a token that you can specify in a subsequent
     *        call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCommandInvocationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     * 
     * @param nextToken
     *        (Optional) The token for the next set of items to return. (You
     *        received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     * 
     * @return (Optional) The token for the next set of items to return. (You
     *         received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     * 
     * @param nextToken
     *        (Optional) The token for the next set of items to return. (You
     *        received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCommandInvocationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * 
     * @return (Optional) One or more filters. Use a filter to return a more
     *         specific list of results.
     */

    public java.util.List<CommandFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<CommandFilter>();
        }
        return filters;
    }

    /**
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * 
     * @param filters
     *        (Optional) One or more filters. Use a filter to return a more
     *        specific list of results.
     */

    public void setFilters(java.util.Collection<CommandFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<CommandFilter>(
                filters);
    }

    /**
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or
     * {@link #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param filters
     *        (Optional) One or more filters. Use a filter to return a more
     *        specific list of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCommandInvocationsRequest withFilters(CommandFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<CommandFilter>(
                    filters.length));
        }
        for (CommandFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * (Optional) One or more filters. Use a filter to return a more specific
     * list of results.
     * 
     * @param filters
     *        (Optional) One or more filters. Use a filter to return a more
     *        specific list of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCommandInvocationsRequest withFilters(
            java.util.Collection<CommandFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * (Optional) If set this returns the response of the command executions and
     * any command output. By default this is set to False.
     * 
     * @param details
     *        (Optional) If set this returns the response of the command
     *        executions and any command output. By default this is set to
     *        False.
     */

    public void setDetails(Boolean details) {
        this.details = details;
    }

    /**
     * (Optional) If set this returns the response of the command executions and
     * any command output. By default this is set to False.
     * 
     * @return (Optional) If set this returns the response of the command
     *         executions and any command output. By default this is set to
     *         False.
     */

    public Boolean getDetails() {
        return this.details;
    }

    /**
     * (Optional) If set this returns the response of the command executions and
     * any command output. By default this is set to False.
     * 
     * @param details
     *        (Optional) If set this returns the response of the command
     *        executions and any command output. By default this is set to
     *        False.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCommandInvocationsRequest withDetails(Boolean details) {
        setDetails(details);
        return this;
    }

    /**
     * (Optional) If set this returns the response of the command executions and
     * any command output. By default this is set to False.
     * 
     * @return (Optional) If set this returns the response of the command
     *         executions and any command output. By default this is set to
     *         False.
     */

    public Boolean isDetails() {
        return this.details;
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCommandInvocationsRequest == false)
            return false;
        ListCommandInvocationsRequest other = (ListCommandInvocationsRequest) obj;
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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null
                && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null
                && other.getDetails().equals(this.getDetails()) == false)
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
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public ListCommandInvocationsRequest clone() {
        return (ListCommandInvocationsRequest) super.clone();
    }
}