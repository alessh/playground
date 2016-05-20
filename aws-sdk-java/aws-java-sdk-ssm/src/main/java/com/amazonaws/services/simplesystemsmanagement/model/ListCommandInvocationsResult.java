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
 * 
 */
public class ListCommandInvocationsResult implements Serializable, Cloneable {

    /** (Optional) A list of all invocations. */
    private com.amazonaws.internal.SdkInternalList<CommandInvocation> commandInvocations;
    /**
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     */
    private String nextToken;

    /**
     * (Optional) A list of all invocations.
     * 
     * @return (Optional) A list of all invocations.
     */

    public java.util.List<CommandInvocation> getCommandInvocations() {
        if (commandInvocations == null) {
            commandInvocations = new com.amazonaws.internal.SdkInternalList<CommandInvocation>();
        }
        return commandInvocations;
    }

    /**
     * (Optional) A list of all invocations.
     * 
     * @param commandInvocations
     *        (Optional) A list of all invocations.
     */

    public void setCommandInvocations(
            java.util.Collection<CommandInvocation> commandInvocations) {
        if (commandInvocations == null) {
            this.commandInvocations = null;
            return;
        }

        this.commandInvocations = new com.amazonaws.internal.SdkInternalList<CommandInvocation>(
                commandInvocations);
    }

    /**
     * (Optional) A list of all invocations.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCommandInvocations(java.util.Collection)} or
     * {@link #withCommandInvocations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param commandInvocations
     *        (Optional) A list of all invocations.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCommandInvocationsResult withCommandInvocations(
            CommandInvocation... commandInvocations) {
        if (this.commandInvocations == null) {
            setCommandInvocations(new com.amazonaws.internal.SdkInternalList<CommandInvocation>(
                    commandInvocations.length));
        }
        for (CommandInvocation ele : commandInvocations) {
            this.commandInvocations.add(ele);
        }
        return this;
    }

    /**
     * (Optional) A list of all invocations.
     * 
     * @param commandInvocations
     *        (Optional) A list of all invocations.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCommandInvocationsResult withCommandInvocations(
            java.util.Collection<CommandInvocation> commandInvocations) {
        setCommandInvocations(commandInvocations);
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

    public ListCommandInvocationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCommandInvocations() != null)
            sb.append("CommandInvocations: " + getCommandInvocations() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCommandInvocationsResult == false)
            return false;
        ListCommandInvocationsResult other = (ListCommandInvocationsResult) obj;
        if (other.getCommandInvocations() == null
                ^ this.getCommandInvocations() == null)
            return false;
        if (other.getCommandInvocations() != null
                && other.getCommandInvocations().equals(
                        this.getCommandInvocations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCommandInvocations() == null) ? 0
                        : getCommandInvocations().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCommandInvocationsResult clone() {
        try {
            return (ListCommandInvocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
