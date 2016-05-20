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

package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;

/**
 * 
 */
public class CreateReplicationTaskResult implements Serializable, Cloneable {

    /**
     * <p>
     * The replication task that was created.
     * </p>
     */
    private ReplicationTask replicationTask;

    /**
     * <p>
     * The replication task that was created.
     * </p>
     * 
     * @param replicationTask
     *        The replication task that was created.
     */

    public void setReplicationTask(ReplicationTask replicationTask) {
        this.replicationTask = replicationTask;
    }

    /**
     * <p>
     * The replication task that was created.
     * </p>
     * 
     * @return The replication task that was created.
     */

    public ReplicationTask getReplicationTask() {
        return this.replicationTask;
    }

    /**
     * <p>
     * The replication task that was created.
     * </p>
     * 
     * @param replicationTask
     *        The replication task that was created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationTaskResult withReplicationTask(
            ReplicationTask replicationTask) {
        setReplicationTask(replicationTask);
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
        if (getReplicationTask() != null)
            sb.append("ReplicationTask: " + getReplicationTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplicationTaskResult == false)
            return false;
        CreateReplicationTaskResult other = (CreateReplicationTaskResult) obj;
        if (other.getReplicationTask() == null
                ^ this.getReplicationTask() == null)
            return false;
        if (other.getReplicationTask() != null
                && other.getReplicationTask().equals(this.getReplicationTask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationTask() == null) ? 0 : getReplicationTask()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicationTaskResult clone() {
        try {
            return (CreateReplicationTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
