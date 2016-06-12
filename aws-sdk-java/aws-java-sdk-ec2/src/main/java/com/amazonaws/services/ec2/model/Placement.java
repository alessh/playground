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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the placement for the instance.
 * </p>
 */
public class Placement implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The name of the placement group the instance is in (for cluster compute
     * instances).
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on single-tenant
     * hardware. The <code>host</code> tenancy is not supported for the
     * <a>ImportInstance</a> command.
     * </p>
     */
    private String tenancy;
    /**
     * <p>
     * The ID of the Dedicted host on which the instance resides. This parameter
     * is not support for the <a>ImportInstance</a> command.
     * </p>
     */
    private String hostId;
    /**
     * <p>
     * The affinity setting for the instance on the Dedicated host. This
     * parameter is not supported for the <a>ImportInstance</a> command.
     * </p>
     */
    private String affinity;

    /**
     * Default constructor for Placement object. Callers should use the setter
     * or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public Placement() {
    }

    /**
     * Constructs a new Placement object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param availabilityZone
     *        The Availability Zone of the instance.
     */
    public Placement(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
    }

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the instance.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * 
     * @return The Availability Zone of the instance.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Placement withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The name of the placement group the instance is in (for cluster compute
     * instances).
     * </p>
     * 
     * @param groupName
     *        The name of the placement group the instance is in (for cluster
     *        compute instances).
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group the instance is in (for cluster compute
     * instances).
     * </p>
     * 
     * @return The name of the placement group the instance is in (for cluster
     *         compute instances).
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the placement group the instance is in (for cluster compute
     * instances).
     * </p>
     * 
     * @param groupName
     *        The name of the placement group the instance is in (for cluster
     *        compute instances).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Placement withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on single-tenant
     * hardware. The <code>host</code> tenancy is not supported for the
     * <a>ImportInstance</a> command.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC).
     *        An instance with a tenancy of <code>dedicated</code> runs on
     *        single-tenant hardware. The <code>host</code> tenancy is not
     *        supported for the <a>ImportInstance</a> command.
     * @see Tenancy
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on single-tenant
     * hardware. The <code>host</code> tenancy is not supported for the
     * <a>ImportInstance</a> command.
     * </p>
     * 
     * @return The tenancy of the instance (if the instance is running in a
     *         VPC). An instance with a tenancy of <code>dedicated</code> runs
     *         on single-tenant hardware. The <code>host</code> tenancy is not
     *         supported for the <a>ImportInstance</a> command.
     * @see Tenancy
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on single-tenant
     * hardware. The <code>host</code> tenancy is not supported for the
     * <a>ImportInstance</a> command.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC).
     *        An instance with a tenancy of <code>dedicated</code> runs on
     *        single-tenant hardware. The <code>host</code> tenancy is not
     *        supported for the <a>ImportInstance</a> command.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Tenancy
     */

    public Placement withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on single-tenant
     * hardware. The <code>host</code> tenancy is not supported for the
     * <a>ImportInstance</a> command.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC).
     *        An instance with a tenancy of <code>dedicated</code> runs on
     *        single-tenant hardware. The <code>host</code> tenancy is not
     *        supported for the <a>ImportInstance</a> command.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Tenancy
     */

    public void setTenancy(Tenancy tenancy) {
        this.tenancy = tenancy.toString();
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on single-tenant
     * hardware. The <code>host</code> tenancy is not supported for the
     * <a>ImportInstance</a> command.
     * </p>
     * 
     * @param tenancy
     *        The tenancy of the instance (if the instance is running in a VPC).
     *        An instance with a tenancy of <code>dedicated</code> runs on
     *        single-tenant hardware. The <code>host</code> tenancy is not
     *        supported for the <a>ImportInstance</a> command.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Tenancy
     */

    public Placement withTenancy(Tenancy tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * The ID of the Dedicted host on which the instance resides. This parameter
     * is not support for the <a>ImportInstance</a> command.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicted host on which the instance resides. This
     *        parameter is not support for the <a>ImportInstance</a> command.
     */

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The ID of the Dedicted host on which the instance resides. This parameter
     * is not support for the <a>ImportInstance</a> command.
     * </p>
     * 
     * @return The ID of the Dedicted host on which the instance resides. This
     *         parameter is not support for the <a>ImportInstance</a> command.
     */

    public String getHostId() {
        return this.hostId;
    }

    /**
     * <p>
     * The ID of the Dedicted host on which the instance resides. This parameter
     * is not support for the <a>ImportInstance</a> command.
     * </p>
     * 
     * @param hostId
     *        The ID of the Dedicted host on which the instance resides. This
     *        parameter is not support for the <a>ImportInstance</a> command.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Placement withHostId(String hostId) {
        setHostId(hostId);
        return this;
    }

    /**
     * <p>
     * The affinity setting for the instance on the Dedicated host. This
     * parameter is not supported for the <a>ImportInstance</a> command.
     * </p>
     * 
     * @param affinity
     *        The affinity setting for the instance on the Dedicated host. This
     *        parameter is not supported for the <a>ImportInstance</a> command.
     */

    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    /**
     * <p>
     * The affinity setting for the instance on the Dedicated host. This
     * parameter is not supported for the <a>ImportInstance</a> command.
     * </p>
     * 
     * @return The affinity setting for the instance on the Dedicated host. This
     *         parameter is not supported for the <a>ImportInstance</a> command.
     */

    public String getAffinity() {
        return this.affinity;
    }

    /**
     * <p>
     * The affinity setting for the instance on the Dedicated host. This
     * parameter is not supported for the <a>ImportInstance</a> command.
     * </p>
     * 
     * @param affinity
     *        The affinity setting for the instance on the Dedicated host. This
     *        parameter is not supported for the <a>ImportInstance</a> command.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Placement withAffinity(String affinity) {
        setAffinity(affinity);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getTenancy() != null)
            sb.append("Tenancy: " + getTenancy() + ",");
        if (getHostId() != null)
            sb.append("HostId: " + getHostId() + ",");
        if (getAffinity() != null)
            sb.append("Affinity: " + getAffinity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Placement == false)
            return false;
        Placement other = (Placement) obj;
        if (other.getAvailabilityZone() == null
                ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(
                        this.getAvailabilityZone()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null
                && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null
                && other.getHostId().equals(this.getHostId()) == false)
            return false;
        if (other.getAffinity() == null ^ this.getAffinity() == null)
            return false;
        if (other.getAffinity() != null
                && other.getAffinity().equals(this.getAffinity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode
                + ((getHostId() == null) ? 0 : getHostId().hashCode());
        hashCode = prime * hashCode
                + ((getAffinity() == null) ? 0 : getAffinity().hashCode());
        return hashCode;
    }

    @Override
    public Placement clone() {
        try {
            return (Placement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
