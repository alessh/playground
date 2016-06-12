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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type containing the response information for the new hosted zone.
 * </p>
 */
public class CreateHostedZoneResult implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains identifying information about the hosted
     * zone.
     * </p>
     */
    private HostedZone hostedZone;
    /**
     * <p>
     * A complex type that contains information about the request to create a
     * hosted zone. This includes an ID that you use when you call the
     * <a>GetChange</a> action to get the current status of the change request.
     * </p>
     */
    private ChangeInfo changeInfo;
    /**
     * <p>
     * A complex type that contains name server information.
     * </p>
     */
    private DelegationSet delegationSet;

    private VPC vPC;
    /**
     * <p>
     * The unique URL representing the new hosted zone.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A complex type that contains identifying information about the hosted
     * zone.
     * </p>
     * 
     * @param hostedZone
     *        A complex type that contains identifying information about the
     *        hosted zone.
     */

    public void setHostedZone(HostedZone hostedZone) {
        this.hostedZone = hostedZone;
    }

    /**
     * <p>
     * A complex type that contains identifying information about the hosted
     * zone.
     * </p>
     * 
     * @return A complex type that contains identifying information about the
     *         hosted zone.
     */

    public HostedZone getHostedZone() {
        return this.hostedZone;
    }

    /**
     * <p>
     * A complex type that contains identifying information about the hosted
     * zone.
     * </p>
     * 
     * @param hostedZone
     *        A complex type that contains identifying information about the
     *        hosted zone.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateHostedZoneResult withHostedZone(HostedZone hostedZone) {
        setHostedZone(hostedZone);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the request to create a
     * hosted zone. This includes an ID that you use when you call the
     * <a>GetChange</a> action to get the current status of the change request.
     * </p>
     * 
     * @param changeInfo
     *        A complex type that contains information about the request to
     *        create a hosted zone. This includes an ID that you use when you
     *        call the <a>GetChange</a> action to get the current status of the
     *        change request.
     */

    public void setChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
    }

    /**
     * <p>
     * A complex type that contains information about the request to create a
     * hosted zone. This includes an ID that you use when you call the
     * <a>GetChange</a> action to get the current status of the change request.
     * </p>
     * 
     * @return A complex type that contains information about the request to
     *         create a hosted zone. This includes an ID that you use when you
     *         call the <a>GetChange</a> action to get the current status of the
     *         change request.
     */

    public ChangeInfo getChangeInfo() {
        return this.changeInfo;
    }

    /**
     * <p>
     * A complex type that contains information about the request to create a
     * hosted zone. This includes an ID that you use when you call the
     * <a>GetChange</a> action to get the current status of the change request.
     * </p>
     * 
     * @param changeInfo
     *        A complex type that contains information about the request to
     *        create a hosted zone. This includes an ID that you use when you
     *        call the <a>GetChange</a> action to get the current status of the
     *        change request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateHostedZoneResult withChangeInfo(ChangeInfo changeInfo) {
        setChangeInfo(changeInfo);
        return this;
    }

    /**
     * <p>
     * A complex type that contains name server information.
     * </p>
     * 
     * @param delegationSet
     *        A complex type that contains name server information.
     */

    public void setDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
    }

    /**
     * <p>
     * A complex type that contains name server information.
     * </p>
     * 
     * @return A complex type that contains name server information.
     */

    public DelegationSet getDelegationSet() {
        return this.delegationSet;
    }

    /**
     * <p>
     * A complex type that contains name server information.
     * </p>
     * 
     * @param delegationSet
     *        A complex type that contains name server information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateHostedZoneResult withDelegationSet(DelegationSet delegationSet) {
        setDelegationSet(delegationSet);
        return this;
    }

    /**
     * @param vPC
     */

    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * @return
     */

    public VPC getVPC() {
        return this.vPC;
    }

    /**
     * @param vPC
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateHostedZoneResult withVPC(VPC vPC) {
        setVPC(vPC);
        return this;
    }

    /**
     * <p>
     * The unique URL representing the new hosted zone.
     * </p>
     * 
     * @param location
     *        The unique URL representing the new hosted zone.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The unique URL representing the new hosted zone.
     * </p>
     * 
     * @return The unique URL representing the new hosted zone.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The unique URL representing the new hosted zone.
     * </p>
     * 
     * @param location
     *        The unique URL representing the new hosted zone.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateHostedZoneResult withLocation(String location) {
        setLocation(location);
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
        if (getHostedZone() != null)
            sb.append("HostedZone: " + getHostedZone() + ",");
        if (getChangeInfo() != null)
            sb.append("ChangeInfo: " + getChangeInfo() + ",");
        if (getDelegationSet() != null)
            sb.append("DelegationSet: " + getDelegationSet() + ",");
        if (getVPC() != null)
            sb.append("VPC: " + getVPC() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHostedZoneResult == false)
            return false;
        CreateHostedZoneResult other = (CreateHostedZoneResult) obj;
        if (other.getHostedZone() == null ^ this.getHostedZone() == null)
            return false;
        if (other.getHostedZone() != null
                && other.getHostedZone().equals(this.getHostedZone()) == false)
            return false;
        if (other.getChangeInfo() == null ^ this.getChangeInfo() == null)
            return false;
        if (other.getChangeInfo() != null
                && other.getChangeInfo().equals(this.getChangeInfo()) == false)
            return false;
        if (other.getDelegationSet() == null ^ this.getDelegationSet() == null)
            return false;
        if (other.getDelegationSet() != null
                && other.getDelegationSet().equals(this.getDelegationSet()) == false)
            return false;
        if (other.getVPC() == null ^ this.getVPC() == null)
            return false;
        if (other.getVPC() != null
                && other.getVPC().equals(this.getVPC()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null
                && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHostedZone() == null) ? 0 : getHostedZone().hashCode());
        hashCode = prime * hashCode
                + ((getChangeInfo() == null) ? 0 : getChangeInfo().hashCode());
        hashCode = prime
                * hashCode
                + ((getDelegationSet() == null) ? 0 : getDelegationSet()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getVPC() == null) ? 0 : getVPC().hashCode());
        hashCode = prime * hashCode
                + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public CreateHostedZoneResult clone() {
        try {
            return (CreateHostedZoneResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
