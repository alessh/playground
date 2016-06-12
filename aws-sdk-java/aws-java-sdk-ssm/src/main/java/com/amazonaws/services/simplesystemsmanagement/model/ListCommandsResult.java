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
public class ListCommandsResult implements Serializable, Cloneable {

    /** (Optional) The list of commands requested by the user. */
    private com.amazonaws.internal.SdkInternalList<Command> commands;
    /**
     * (Optional) The token for the next set of items to return. (You received
     * this token from a previous call.)
     */
    private String nextToken;

    /**
     * (Optional) The list of commands requested by the user.
     * 
     * @return (Optional) The list of commands requested by the user.
     */

    public java.util.List<Command> getCommands() {
        if (commands == null) {
            commands = new com.amazonaws.internal.SdkInternalList<Command>();
        }
        return commands;
    }

    /**
     * (Optional) The list of commands requested by the user.
     * 
     * @param commands
     *        (Optional) The list of commands requested by the user.
     */

    public void setCommands(java.util.Collection<Command> commands) {
        if (commands == null) {
            this.commands = null;
            return;
        }

        this.commands = new com.amazonaws.internal.SdkInternalList<Command>(
                commands);
    }

    /**
     * (Optional) The list of commands requested by the user.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCommands(java.util.Collection)} or
     * {@link #withCommands(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param commands
     *        (Optional) The list of commands requested by the user.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCommandsResult withCommands(Command... commands) {
        if (this.commands == null) {
            setCommands(new com.amazonaws.internal.SdkInternalList<Command>(
                    commands.length));
        }
        for (Command ele : commands) {
            this.commands.add(ele);
        }
        return this;
    }

    /**
     * (Optional) The list of commands requested by the user.
     * 
     * @param commands
     *        (Optional) The list of commands requested by the user.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCommandsResult withCommands(
            java.util.Collection<Command> commands) {
        setCommands(commands);
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

    public ListCommandsResult withNextToken(String nextToken) {
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
        if (getCommands() != null)
            sb.append("Commands: " + getCommands() + ",");
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

        if (obj instanceof ListCommandsResult == false)
            return false;
        ListCommandsResult other = (ListCommandsResult) obj;
        if (other.getCommands() == null ^ this.getCommands() == null)
            return false;
        if (other.getCommands() != null
                && other.getCommands().equals(this.getCommands()) == false)
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

        hashCode = prime * hashCode
                + ((getCommands() == null) ? 0 : getCommands().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCommandsResult clone() {
        try {
            return (ListCommandsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
