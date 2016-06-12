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

package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * IP addresses and port settings used to limit access by incoming traffic
 * (players) to a fleet. Permissions specify a range of IP addresses and port
 * settings that must be used to gain access to a game server on a fleet
 * machine.
 * </p>
 */
public class IpPermission implements Serializable, Cloneable {

    /**
     * <p>
     * Starting value for a range of allowed port numbers.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * Ending value for a range of allowed port numbers. Port numbers are
     * end-inclusive. This value must be higher than <i>FromPort</i>.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * Range of allowed IP addresses. This value must be expressed in <a
     * href="https://tools.ietf.org/id/cidr">CIDR notation</a>. Example: "
     * <code>000.000.000.000/[subnet mask]</code>
     * " or optionally the shortened version "<code>0.0.0.0/[subnet mask]</code>
     * ".
     * </p>
     */
    private String ipRange;
    /**
     * <p>
     * Network communication protocol used by the fleet.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * Starting value for a range of allowed port numbers.
     * </p>
     * 
     * @param fromPort
     *        Starting value for a range of allowed port numbers.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * Starting value for a range of allowed port numbers.
     * </p>
     * 
     * @return Starting value for a range of allowed port numbers.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * Starting value for a range of allowed port numbers.
     * </p>
     * 
     * @param fromPort
     *        Starting value for a range of allowed port numbers.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public IpPermission withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * Ending value for a range of allowed port numbers. Port numbers are
     * end-inclusive. This value must be higher than <i>FromPort</i>.
     * </p>
     * 
     * @param toPort
     *        Ending value for a range of allowed port numbers. Port numbers are
     *        end-inclusive. This value must be higher than <i>FromPort</i>.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * Ending value for a range of allowed port numbers. Port numbers are
     * end-inclusive. This value must be higher than <i>FromPort</i>.
     * </p>
     * 
     * @return Ending value for a range of allowed port numbers. Port numbers
     *         are end-inclusive. This value must be higher than
     *         <i>FromPort</i>.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * Ending value for a range of allowed port numbers. Port numbers are
     * end-inclusive. This value must be higher than <i>FromPort</i>.
     * </p>
     * 
     * @param toPort
     *        Ending value for a range of allowed port numbers. Port numbers are
     *        end-inclusive. This value must be higher than <i>FromPort</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public IpPermission withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * Range of allowed IP addresses. This value must be expressed in <a
     * href="https://tools.ietf.org/id/cidr">CIDR notation</a>. Example: "
     * <code>000.000.000.000/[subnet mask]</code>
     * " or optionally the shortened version "<code>0.0.0.0/[subnet mask]</code>
     * ".
     * </p>
     * 
     * @param ipRange
     *        Range of allowed IP addresses. This value must be expressed in <a
     *        href="https://tools.ietf.org/id/cidr">CIDR notation</a>. Example:
     *        "<code>000.000.000.000/[subnet mask]</code>
     *        " or optionally the shortened version "
     *        <code>0.0.0.0/[subnet mask]</code>".
     */

    public void setIpRange(String ipRange) {
        this.ipRange = ipRange;
    }

    /**
     * <p>
     * Range of allowed IP addresses. This value must be expressed in <a
     * href="https://tools.ietf.org/id/cidr">CIDR notation</a>. Example: "
     * <code>000.000.000.000/[subnet mask]</code>
     * " or optionally the shortened version "<code>0.0.0.0/[subnet mask]</code>
     * ".
     * </p>
     * 
     * @return Range of allowed IP addresses. This value must be expressed in <a
     *         href="https://tools.ietf.org/id/cidr">CIDR notation</a>. Example:
     *         "<code>000.000.000.000/[subnet mask]</code>
     *         " or optionally the shortened version "
     *         <code>0.0.0.0/[subnet mask]</code>".
     */

    public String getIpRange() {
        return this.ipRange;
    }

    /**
     * <p>
     * Range of allowed IP addresses. This value must be expressed in <a
     * href="https://tools.ietf.org/id/cidr">CIDR notation</a>. Example: "
     * <code>000.000.000.000/[subnet mask]</code>
     * " or optionally the shortened version "<code>0.0.0.0/[subnet mask]</code>
     * ".
     * </p>
     * 
     * @param ipRange
     *        Range of allowed IP addresses. This value must be expressed in <a
     *        href="https://tools.ietf.org/id/cidr">CIDR notation</a>. Example:
     *        "<code>000.000.000.000/[subnet mask]</code>
     *        " or optionally the shortened version "
     *        <code>0.0.0.0/[subnet mask]</code>".
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public IpPermission withIpRange(String ipRange) {
        setIpRange(ipRange);
        return this;
    }

    /**
     * <p>
     * Network communication protocol used by the fleet.
     * </p>
     * 
     * @param protocol
     *        Network communication protocol used by the fleet.
     * @see IpProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * Network communication protocol used by the fleet.
     * </p>
     * 
     * @return Network communication protocol used by the fleet.
     * @see IpProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * Network communication protocol used by the fleet.
     * </p>
     * 
     * @param protocol
     *        Network communication protocol used by the fleet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see IpProtocol
     */

    public IpPermission withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * Network communication protocol used by the fleet.
     * </p>
     * 
     * @param protocol
     *        Network communication protocol used by the fleet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see IpProtocol
     */

    public void setProtocol(IpProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * Network communication protocol used by the fleet.
     * </p>
     * 
     * @param protocol
     *        Network communication protocol used by the fleet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see IpProtocol
     */

    public IpPermission withProtocol(IpProtocol protocol) {
        setProtocol(protocol);
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
        if (getFromPort() != null)
            sb.append("FromPort: " + getFromPort() + ",");
        if (getToPort() != null)
            sb.append("ToPort: " + getToPort() + ",");
        if (getIpRange() != null)
            sb.append("IpRange: " + getIpRange() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpPermission == false)
            return false;
        IpPermission other = (IpPermission) obj;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null
                && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null
                && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getIpRange() == null ^ this.getIpRange() == null)
            return false;
        if (other.getIpRange() != null
                && other.getIpRange().equals(this.getIpRange()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null
                && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode
                + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode
                + ((getIpRange() == null) ? 0 : getIpRange().hashCode());
        hashCode = prime * hashCode
                + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public IpPermission clone() {
        try {
            return (IpPermission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
