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
public class ReplicationPendingModifiedValues implements Serializable,
        Cloneable {

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     */
    private String replicationInstanceClass;
    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance. </p>
     *        <p>
     *        Valid Values:
     *        <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     */

    public void setReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @return The compute and memory capacity of the replication instance. </p>
     *         <p>
     *         Valid Values:
     *         <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     */

    public String getReplicationInstanceClass() {
        return this.replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance. </p>
     *        <p>
     *        Valid Values:
     *        <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationPendingModifiedValues withReplicationInstanceClass(
            String replicationInstanceClass) {
        setReplicationInstanceClass(replicationInstanceClass);
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) that is allocated for the
     *        replication instance.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     * 
     * @return The amount of storage (in gigabytes) that is allocated for the
     *         replication instance.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) that is allocated for the
     *        replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationPendingModifiedValues withAllocatedStorage(
            Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * 
     * @param engineVersion
     *        The engine version number of the replication instance.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * 
     * @return The engine version number of the replication instance.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * 
     * @param engineVersion
     *        The engine version number of the replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationPendingModifiedValues withEngineVersion(
            String engineVersion) {
        setEngineVersion(engineVersion);
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
        if (getReplicationInstanceClass() != null)
            sb.append("ReplicationInstanceClass: "
                    + getReplicationInstanceClass() + ",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationPendingModifiedValues == false)
            return false;
        ReplicationPendingModifiedValues other = (ReplicationPendingModifiedValues) obj;
        if (other.getReplicationInstanceClass() == null
                ^ this.getReplicationInstanceClass() == null)
            return false;
        if (other.getReplicationInstanceClass() != null
                && other.getReplicationInstanceClass().equals(
                        this.getReplicationInstanceClass()) == false)
            return false;
        if (other.getAllocatedStorage() == null
                ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(
                        this.getAllocatedStorage()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationInstanceClass() == null) ? 0
                        : getReplicationInstanceClass().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ReplicationPendingModifiedValues clone() {
        try {
            return (ReplicationPendingModifiedValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
