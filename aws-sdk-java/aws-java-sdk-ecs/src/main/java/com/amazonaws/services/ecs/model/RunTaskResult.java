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
public class RunTaskResult implements Serializable, Cloneable {

    /**
     * <p>
     * A full description of the tasks that were run. Each task that was
     * successfully placed on your cluster are described here.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Task> tasks;
    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Failure> failures;

    /**
     * <p>
     * A full description of the tasks that were run. Each task that was
     * successfully placed on your cluster are described here.
     * </p>
     * 
     * @return A full description of the tasks that were run. Each task that was
     *         successfully placed on your cluster are described here.
     */

    public java.util.List<Task> getTasks() {
        if (tasks == null) {
            tasks = new com.amazonaws.internal.SdkInternalList<Task>();
        }
        return tasks;
    }

    /**
     * <p>
     * A full description of the tasks that were run. Each task that was
     * successfully placed on your cluster are described here.
     * </p>
     * 
     * @param tasks
     *        A full description of the tasks that were run. Each task that was
     *        successfully placed on your cluster are described here.
     */

    public void setTasks(java.util.Collection<Task> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new com.amazonaws.internal.SdkInternalList<Task>(tasks);
    }

    /**
     * <p>
     * A full description of the tasks that were run. Each task that was
     * successfully placed on your cluster are described here.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTasks(java.util.Collection)} or
     * {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        A full description of the tasks that were run. Each task that was
     *        successfully placed on your cluster are described here.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RunTaskResult withTasks(Task... tasks) {
        if (this.tasks == null) {
            setTasks(new com.amazonaws.internal.SdkInternalList<Task>(
                    tasks.length));
        }
        for (Task ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A full description of the tasks that were run. Each task that was
     * successfully placed on your cluster are described here.
     * </p>
     * 
     * @param tasks
     *        A full description of the tasks that were run. Each task that was
     *        successfully placed on your cluster are described here.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RunTaskResult withTasks(java.util.Collection<Task> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @return Any failures associated with the call.
     */

    public java.util.List<Failure> getFailures() {
        if (failures == null) {
            failures = new com.amazonaws.internal.SdkInternalList<Failure>();
        }
        return failures;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     */

    public void setFailures(java.util.Collection<Failure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new com.amazonaws.internal.SdkInternalList<Failure>(
                failures);
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFailures(java.util.Collection)} or
     * {@link #withFailures(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RunTaskResult withFailures(Failure... failures) {
        if (this.failures == null) {
            setFailures(new com.amazonaws.internal.SdkInternalList<Failure>(
                    failures.length));
        }
        for (Failure ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * 
     * @param failures
     *        Any failures associated with the call.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RunTaskResult withFailures(java.util.Collection<Failure> failures) {
        setFailures(failures);
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
        if (getTasks() != null)
            sb.append("Tasks: " + getTasks() + ",");
        if (getFailures() != null)
            sb.append("Failures: " + getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunTaskResult == false)
            return false;
        RunTaskResult other = (RunTaskResult) obj;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null
                && other.getTasks().equals(this.getTasks()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null
                && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode
                + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public RunTaskResult clone() {
        try {
            return (RunTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
