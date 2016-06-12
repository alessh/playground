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
 * Describes a network interface.
 * </p>
 */
public class InstanceNetworkInterfaceSpecification implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The index of the device on the instance for the network interface
     * attachment. If you are specifying a network interface in a
     * <a>RunInstances</a> request, you must provide the device index.
     * </p>
     */
    private Integer deviceIndex;
    /**
     * <p>
     * The ID of the subnet associated with the network string. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The description of the network interface. Applies only if creating a
     * network interface when launching an instance.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The private IP address of the network interface. Applies only if creating
     * a network interface when launching an instance.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * The IDs of the security groups for the network interface. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groups;
    /**
     * <p>
     * If set to <code>true</code>, the interface is deleted when the instance
     * is terminated. You can specify <code>true</code> only if creating a new
     * network interface when launching an instance.
     * </p>
     */
    private Boolean deleteOnTermination;
    /**
     * <p>
     * One or more private IP addresses to assign to the network interface. Only
     * one private IP address can be designated as primary.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> privateIpAddresses;
    /**
     * <p>
     * The number of secondary private IP addresses. You can't specify this
     * option and specify more than one private IP address using the private IP
     * addresses option.
     * </p>
     */
    private Integer secondaryPrivateIpAddressCount;
    /**
     * <p>
     * Indicates whether to assign a public IP address to an instance you launch
     * in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     */
    private Boolean associatePublicIpAddress;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceNetworkInterfaceSpecification withNetworkInterfaceId(
            String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The index of the device on the instance for the network interface
     * attachment. If you are specifying a network interface in a
     * <a>RunInstances</a> request, you must provide the device index.
     * </p>
     * 
     * @param deviceIndex
     *        The index of the device on the instance for the network interface
     *        attachment. If you are specifying a network interface in a
     *        <a>RunInstances</a> request, you must provide the device index.
     */

    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    /**
     * <p>
     * The index of the device on the instance for the network interface
     * attachment. If you are specifying a network interface in a
     * <a>RunInstances</a> request, you must provide the device index.
     * </p>
     * 
     * @return The index of the device on the instance for the network interface
     *         attachment. If you are specifying a network interface in a
     *         <a>RunInstances</a> request, you must provide the device index.
     */

    public Integer getDeviceIndex() {
        return this.deviceIndex;
    }

    /**
     * <p>
     * The index of the device on the instance for the network interface
     * attachment. If you are specifying a network interface in a
     * <a>RunInstances</a> request, you must provide the device index.
     * </p>
     * 
     * @param deviceIndex
     *        The index of the device on the instance for the network interface
     *        attachment. If you are specifying a network interface in a
     *        <a>RunInstances</a> request, you must provide the device index.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceNetworkInterfaceSpecification withDeviceIndex(
            Integer deviceIndex) {
        setDeviceIndex(deviceIndex);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet associated with the network string. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet associated with the network string. Applies
     *        only if creating a network interface when launching an instance.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet associated with the network string. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     * 
     * @return The ID of the subnet associated with the network string. Applies
     *         only if creating a network interface when launching an instance.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet associated with the network string. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet associated with the network string. Applies
     *        only if creating a network interface when launching an instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceNetworkInterfaceSpecification withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The description of the network interface. Applies only if creating a
     * network interface when launching an instance.
     * </p>
     * 
     * @param description
     *        The description of the network interface. Applies only if creating
     *        a network interface when launching an instance.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the network interface. Applies only if creating a
     * network interface when launching an instance.
     * </p>
     * 
     * @return The description of the network interface. Applies only if
     *         creating a network interface when launching an instance.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the network interface. Applies only if creating a
     * network interface when launching an instance.
     * </p>
     * 
     * @param description
     *        The description of the network interface. Applies only if creating
     *        a network interface when launching an instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceNetworkInterfaceSpecification withDescription(
            String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The private IP address of the network interface. Applies only if creating
     * a network interface when launching an instance.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address of the network interface. Applies only if
     *        creating a network interface when launching an instance.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the network interface. Applies only if creating
     * a network interface when launching an instance.
     * </p>
     * 
     * @return The private IP address of the network interface. Applies only if
     *         creating a network interface when launching an instance.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the network interface. Applies only if creating
     * a network interface when launching an instance.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address of the network interface. Applies only if
     *        creating a network interface when launching an instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceNetworkInterfaceSpecification withPrivateIpAddress(
            String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups for the network interface. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     * 
     * @return The IDs of the security groups for the network interface. Applies
     *         only if creating a network interface when launching an instance.
     */

    public java.util.List<String> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groups;
    }

    /**
     * <p>
     * The IDs of the security groups for the network interface. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     * 
     * @param groups
     *        The IDs of the security groups for the network interface. Applies
     *        only if creating a network interface when launching an instance.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new com.amazonaws.internal.SdkInternalList<String>(groups);
    }

    /**
     * <p>
     * The IDs of the security groups for the network interface. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGroups(java.util.Collection)} or
     * {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The IDs of the security groups for the network interface. Applies
     *        only if creating a network interface when launching an instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceNetworkInterfaceSpecification withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new com.amazonaws.internal.SdkInternalList<String>(
                    groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups for the network interface. Applies only if
     * creating a network interface when launching an instance.
     * </p>
     * 
     * @param groups
     *        The IDs of the security groups for the network interface. Applies
     *        only if creating a network interface when launching an instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceNetworkInterfaceSpecification withGroups(
            java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, the interface is deleted when the instance
     * is terminated. You can specify <code>true</code> only if creating a new
     * network interface when launching an instance.
     * </p>
     * 
     * @param deleteOnTermination
     *        If set to <code>true</code>, the interface is deleted when the
     *        instance is terminated. You can specify <code>true</code> only if
     *        creating a new network interface when launching an instance.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * If set to <code>true</code>, the interface is deleted when the instance
     * is terminated. You can specify <code>true</code> only if creating a new
     * network interface when launching an instance.
     * </p>
     * 
     * @return If set to <code>true</code>, the interface is deleted when the
     *         instance is terminated. You can specify <code>true</code> only if
     *         creating a new network interface when launching an instance.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * If set to <code>true</code>, the interface is deleted when the instance
     * is terminated. You can specify <code>true</code> only if creating a new
     * network interface when launching an instance.
     * </p>
     * 
     * @param deleteOnTermination
     *        If set to <code>true</code>, the interface is deleted when the
     *        instance is terminated. You can specify <code>true</code> only if
     *        creating a new network interface when launching an instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceNetworkInterfaceSpecification withDeleteOnTermination(
            Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, the interface is deleted when the instance
     * is terminated. You can specify <code>true</code> only if creating a new
     * network interface when launching an instance.
     * </p>
     * 
     * @return If set to <code>true</code>, the interface is deleted when the
     *         instance is terminated. You can specify <code>true</code> only if
     *         creating a new network interface when launching an instance.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * One or more private IP addresses to assign to the network interface. Only
     * one private IP address can be designated as primary.
     * </p>
     * 
     * @return One or more private IP addresses to assign to the network
     *         interface. Only one private IP address can be designated as
     *         primary.
     */

    public java.util.List<PrivateIpAddressSpecification> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
            privateIpAddresses = new com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>();
        }
        return privateIpAddresses;
    }

    /**
     * <p>
     * One or more private IP addresses to assign to the network interface. Only
     * one private IP address can be designated as primary.
     * </p>
     * 
     * @param privateIpAddresses
     *        One or more private IP addresses to assign to the network
     *        interface. Only one private IP address can be designated as
     *        primary.
     */

    public void setPrivateIpAddresses(
            java.util.Collection<PrivateIpAddressSpecification> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>(
                privateIpAddresses);
    }

    /**
     * <p>
     * One or more private IP addresses to assign to the network interface. Only
     * one private IP address can be designated as primary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPrivateIpAddresses(java.util.Collection)} or
     * {@link #withPrivateIpAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param privateIpAddresses
     *        One or more private IP addresses to assign to the network
     *        interface. Only one private IP address can be designated as
     *        primary.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceNetworkInterfaceSpecification withPrivateIpAddresses(
            PrivateIpAddressSpecification... privateIpAddresses) {
        if (this.privateIpAddresses == null) {
            setPrivateIpAddresses(new com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>(
                    privateIpAddresses.length));
        }
        for (PrivateIpAddressSpecification ele : privateIpAddresses) {
            this.privateIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more private IP addresses to assign to the network interface. Only
     * one private IP address can be designated as primary.
     * </p>
     * 
     * @param privateIpAddresses
     *        One or more private IP addresses to assign to the network
     *        interface. Only one private IP address can be designated as
     *        primary.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceNetworkInterfaceSpecification withPrivateIpAddresses(
            java.util.Collection<PrivateIpAddressSpecification> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The number of secondary private IP addresses. You can't specify this
     * option and specify more than one private IP address using the private IP
     * addresses option.
     * </p>
     * 
     * @param secondaryPrivateIpAddressCount
     *        The number of secondary private IP addresses. You can't specify
     *        this option and specify more than one private IP address using the
     *        private IP addresses option.
     */

    public void setSecondaryPrivateIpAddressCount(
            Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IP addresses. You can't specify this
     * option and specify more than one private IP address using the private IP
     * addresses option.
     * </p>
     * 
     * @return The number of secondary private IP addresses. You can't specify
     *         this option and specify more than one private IP address using
     *         the private IP addresses option.
     */

    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    /**
     * <p>
     * The number of secondary private IP addresses. You can't specify this
     * option and specify more than one private IP address using the private IP
     * addresses option.
     * </p>
     * 
     * @param secondaryPrivateIpAddressCount
     *        The number of secondary private IP addresses. You can't specify
     *        this option and specify more than one private IP address using the
     *        private IP addresses option.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceNetworkInterfaceSpecification withSecondaryPrivateIpAddressCount(
            Integer secondaryPrivateIpAddressCount) {
        setSecondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount);
        return this;
    }

    /**
     * <p>
     * Indicates whether to assign a public IP address to an instance you launch
     * in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Indicates whether to assign a public IP address to an instance you
     *        launch in a VPC. The public IP address can only be assigned to a
     *        network interface for eth0, and can only be assigned to a new
     *        network interface, not an existing one. You cannot specify more
     *        than one network interface in the request. If launching into a
     *        default subnet, the default value is <code>true</code>.
     */

    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * Indicates whether to assign a public IP address to an instance you launch
     * in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     * 
     * @return Indicates whether to assign a public IP address to an instance
     *         you launch in a VPC. The public IP address can only be assigned
     *         to a network interface for eth0, and can only be assigned to a
     *         new network interface, not an existing one. You cannot specify
     *         more than one network interface in the request. If launching into
     *         a default subnet, the default value is <code>true</code>.
     */

    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * Indicates whether to assign a public IP address to an instance you launch
     * in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Indicates whether to assign a public IP address to an instance you
     *        launch in a VPC. The public IP address can only be assigned to a
     *        network interface for eth0, and can only be assigned to a new
     *        network interface, not an existing one. You cannot specify more
     *        than one network interface in the request. If launching into a
     *        default subnet, the default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceNetworkInterfaceSpecification withAssociatePublicIpAddress(
            Boolean associatePublicIpAddress) {
        setAssociatePublicIpAddress(associatePublicIpAddress);
        return this;
    }

    /**
     * <p>
     * Indicates whether to assign a public IP address to an instance you launch
     * in a VPC. The public IP address can only be assigned to a network
     * interface for eth0, and can only be assigned to a new network interface,
     * not an existing one. You cannot specify more than one network interface
     * in the request. If launching into a default subnet, the default value is
     * <code>true</code>.
     * </p>
     * 
     * @return Indicates whether to assign a public IP address to an instance
     *         you launch in a VPC. The public IP address can only be assigned
     *         to a network interface for eth0, and can only be assigned to a
     *         new network interface, not an existing one. You cannot specify
     *         more than one network interface in the request. If launching into
     *         a default subnet, the default value is <code>true</code>.
     */

    public Boolean isAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
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
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getDeviceIndex() != null)
            sb.append("DeviceIndex: " + getDeviceIndex() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination() + ",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: " + getPrivateIpAddresses() + ",");
        if (getSecondaryPrivateIpAddressCount() != null)
            sb.append("SecondaryPrivateIpAddressCount: "
                    + getSecondaryPrivateIpAddressCount() + ",");
        if (getAssociatePublicIpAddress() != null)
            sb.append("AssociatePublicIpAddress: "
                    + getAssociatePublicIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceNetworkInterfaceSpecification == false)
            return false;
        InstanceNetworkInterfaceSpecification other = (InstanceNetworkInterfaceSpecification) obj;
        if (other.getNetworkInterfaceId() == null
                ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(
                        this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getDeviceIndex() == null ^ this.getDeviceIndex() == null)
            return false;
        if (other.getDeviceIndex() != null
                && other.getDeviceIndex().equals(this.getDeviceIndex()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null
                && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPrivateIpAddress() == null
                ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(
                        this.getPrivateIpAddress()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null
                && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getDeleteOnTermination() == null
                ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null
                && other.getDeleteOnTermination().equals(
                        this.getDeleteOnTermination()) == false)
            return false;
        if (other.getPrivateIpAddresses() == null
                ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null
                && other.getPrivateIpAddresses().equals(
                        this.getPrivateIpAddresses()) == false)
            return false;
        if (other.getSecondaryPrivateIpAddressCount() == null
                ^ this.getSecondaryPrivateIpAddressCount() == null)
            return false;
        if (other.getSecondaryPrivateIpAddressCount() != null
                && other.getSecondaryPrivateIpAddressCount().equals(
                        this.getSecondaryPrivateIpAddressCount()) == false)
            return false;
        if (other.getAssociatePublicIpAddress() == null
                ^ this.getAssociatePublicIpAddress() == null)
            return false;
        if (other.getAssociatePublicIpAddress() != null
                && other.getAssociatePublicIpAddress().equals(
                        this.getAssociatePublicIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNetworkInterfaceId() == null) ? 0
                        : getNetworkInterfaceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeviceIndex() == null) ? 0 : getDeviceIndex().hashCode());
        hashCode = prime * hashCode
                + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeleteOnTermination() == null) ? 0
                        : getDeleteOnTermination().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivateIpAddresses() == null) ? 0
                        : getPrivateIpAddresses().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondaryPrivateIpAddressCount() == null) ? 0
                        : getSecondaryPrivateIpAddressCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssociatePublicIpAddress() == null) ? 0
                        : getAssociatePublicIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public InstanceNetworkInterfaceSpecification clone() {
        try {
            return (InstanceNetworkInterfaceSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
