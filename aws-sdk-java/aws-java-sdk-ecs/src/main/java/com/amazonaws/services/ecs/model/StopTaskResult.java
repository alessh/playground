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
 * 
 */
public class StopTaskResult implements Serializable, Cloneable {

    private Task task;

    /**
     * @param task
     */

    public void setTask(Task task) {
        this.task = task;
    }

    /**
     * @return
     */

    public Task getTask() {
        return this.task;
    }

    /**
     * @param task
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StopTaskResult withTask(Task task) {
        setTask(task);
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
        if (getTask() != null)
            sb.append("Task: " + getTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopTaskResult == false)
            return false;
        StopTaskResult other = (StopTaskResult) obj;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null
                && other.getTask().equals(this.getTask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTask() == null) ? 0 : getTask().hashCode());
        return hashCode;
    }

    @Override
    public StopTaskResult clone() {
        try {
            return (StopTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
