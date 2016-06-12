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
 * Describes an instance attribute.
 * </p>
 */
public class InstanceAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The kernel ID.
     * </p>
     */
    private String kernelId;
    /**
     * <p>
     * The RAM disk ID.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * The Base64-encoded MIME user data.
     * </p>
     */
    private String userData;
    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     * </p>
     */
    private Boolean disableApiTermination;
    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     */
    private String instanceInitiatedShutdownBehavior;
    /**
     * <p>
     * The name of the root device (for example, <code>/dev/sda1</code> or
     * <code>/dev/xvda</code>).
     * </p>
     */
    private String rootDeviceName;
    /**
     * <p>
     * The block device mapping of the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceBlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * A list of product codes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProductCode> productCodes;
    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O.
     * </p>
     */
    private Boolean ebsOptimized;

    private String sriovNetSupport;
    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code> means
     * checking is disabled. This value must be <code>false</code> for a NAT
     * instance to perform NAT.
     * </p>
     */
    private Boolean sourceDestCheck;
    /**
     * <p>
     * The security groups associated with the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GroupIdentifier> groups;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @return The instance type.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     * 
     * @param kernelId
     *        The kernel ID.
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     * 
     * @return The kernel ID.
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     * 
     * @param kernelId
     *        The kernel ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     * 
     * @param ramdiskId
     *        The RAM disk ID.
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     * 
     * @return The RAM disk ID.
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     * 
     * @param ramdiskId
     *        The RAM disk ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * The Base64-encoded MIME user data.
     * </p>
     * 
     * @param userData
     *        The Base64-encoded MIME user data.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The Base64-encoded MIME user data.
     * </p>
     * 
     * @return The Base64-encoded MIME user data.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The Base64-encoded MIME user data.
     * </p>
     * 
     * @param userData
     *        The Base64-encoded MIME user data.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     * </p>
     * 
     * @param disableApiTermination
     *        If the value is <code>true</code>, you can't terminate the
     *        instance through the Amazon EC2 console, CLI, or API; otherwise,
     *        you can.
     */

    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     * </p>
     * 
     * @return If the value is <code>true</code>, you can't terminate the
     *         instance through the Amazon EC2 console, CLI, or API; otherwise,
     *         you can.
     */

    public Boolean getDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     * </p>
     * 
     * @param disableApiTermination
     *        If the value is <code>true</code>, you can't terminate the
     *        instance through the Amazon EC2 console, CLI, or API; otherwise,
     *        you can.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withDisableApiTermination(
            Boolean disableApiTermination) {
        setDisableApiTermination(disableApiTermination);
        return this;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     * </p>
     * 
     * @return If the value is <code>true</code>, you can't terminate the
     *         instance through the Amazon EC2 console, CLI, or API; otherwise,
     *         you can.
     */

    public Boolean isDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you
     *        initiate shutdown from the instance (using the operating system
     *        command for system shutdown).
     */

    public void setInstanceInitiatedShutdownBehavior(
            String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * 
     * @return Indicates whether an instance stops or terminates when you
     *         initiate shutdown from the instance (using the operating system
     *         command for system shutdown).
     */

    public String getInstanceInitiatedShutdownBehavior() {
        return this.instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you
     *        initiate shutdown from the instance (using the operating system
     *        command for system shutdown).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withInstanceInitiatedShutdownBehavior(
            String instanceInitiatedShutdownBehavior) {
        setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
        return this;
    }

    /**
     * <p>
     * The name of the root device (for example, <code>/dev/sda1</code> or
     * <code>/dev/xvda</code>).
     * </p>
     * 
     * @param rootDeviceName
     *        The name of the root device (for example, <code>/dev/sda1</code>
     *        or <code>/dev/xvda</code>).
     */

    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }

    /**
     * <p>
     * The name of the root device (for example, <code>/dev/sda1</code> or
     * <code>/dev/xvda</code>).
     * </p>
     * 
     * @return The name of the root device (for example, <code>/dev/sda1</code>
     *         or <code>/dev/xvda</code>).
     */

    public String getRootDeviceName() {
        return this.rootDeviceName;
    }

    /**
     * <p>
     * The name of the root device (for example, <code>/dev/sda1</code> or
     * <code>/dev/xvda</code>).
     * </p>
     * 
     * @param rootDeviceName
     *        The name of the root device (for example, <code>/dev/sda1</code>
     *        or <code>/dev/xvda</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withRootDeviceName(String rootDeviceName) {
        setRootDeviceName(rootDeviceName);
        return this;
    }

    /**
     * <p>
     * The block device mapping of the instance.
     * </p>
     * 
     * @return The block device mapping of the instance.
     */

    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<InstanceBlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mapping of the instance.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mapping of the instance.
     */

    public void setBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<InstanceBlockDeviceMapping>(
                blockDeviceMappings);
    }

    /**
     * <p>
     * The block device mapping of the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBlockDeviceMappings(java.util.Collection)} or
     * {@link #withBlockDeviceMappings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mapping of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withBlockDeviceMappings(
            InstanceBlockDeviceMapping... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new com.amazonaws.internal.SdkInternalList<InstanceBlockDeviceMapping>(
                    blockDeviceMappings.length));
        }
        for (InstanceBlockDeviceMapping ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The block device mapping of the instance.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mapping of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     * 
     * @return A list of product codes.
     */

    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>();
        }
        return productCodes;
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     * 
     * @param productCodes
     *        A list of product codes.
     */

    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }

        this.productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>(
                productCodes);
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setProductCodes(java.util.Collection)} or
     * {@link #withProductCodes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param productCodes
     *        A list of product codes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withProductCodes(ProductCode... productCodes) {
        if (this.productCodes == null) {
            setProductCodes(new com.amazonaws.internal.SdkInternalList<ProductCode>(
                    productCodes.length));
        }
        for (ProductCode ele : productCodes) {
            this.productCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     * 
     * @param productCodes
     *        A list of product codes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withProductCodes(
            java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for EBS I/O.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O.
     * </p>
     * 
     * @return Indicates whether the instance is optimized for EBS I/O.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for EBS I/O.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O.
     * </p>
     * 
     * @return Indicates whether the instance is optimized for EBS I/O.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * @param sriovNetSupport
     */

    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    /**
     * @return
     */

    public String getSriovNetSupport() {
        return this.sriovNetSupport;
    }

    /**
     * @param sriovNetSupport
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withSriovNetSupport(String sriovNetSupport) {
        setSriovNetSupport(sriovNetSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code> means
     * checking is disabled. This value must be <code>false</code> for a NAT
     * instance to perform NAT.
     * </p>
     * 
     * @param sourceDestCheck
     *        Indicates whether source/destination checking is enabled. A value
     *        of <code>true</code> means checking is enabled, and
     *        <code>false</code> means checking is disabled. This value must be
     *        <code>false</code> for a NAT instance to perform NAT.
     */

    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code> means
     * checking is disabled. This value must be <code>false</code> for a NAT
     * instance to perform NAT.
     * </p>
     * 
     * @return Indicates whether source/destination checking is enabled. A value
     *         of <code>true</code> means checking is enabled, and
     *         <code>false</code> means checking is disabled. This value must be
     *         <code>false</code> for a NAT instance to perform NAT.
     */

    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code> means
     * checking is disabled. This value must be <code>false</code> for a NAT
     * instance to perform NAT.
     * </p>
     * 
     * @param sourceDestCheck
     *        Indicates whether source/destination checking is enabled. A value
     *        of <code>true</code> means checking is enabled, and
     *        <code>false</code> means checking is disabled. This value must be
     *        <code>false</code> for a NAT instance to perform NAT.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withSourceDestCheck(Boolean sourceDestCheck) {
        setSourceDestCheck(sourceDestCheck);
        return this;
    }

    /**
     * <p>
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code> means
     * checking is disabled. This value must be <code>false</code> for a NAT
     * instance to perform NAT.
     * </p>
     * 
     * @return Indicates whether source/destination checking is enabled. A value
     *         of <code>true</code> means checking is enabled, and
     *         <code>false</code> means checking is disabled. This value must be
     *         <code>false</code> for a NAT instance to perform NAT.
     */

    public Boolean isSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * The security groups associated with the instance.
     * </p>
     * 
     * @return The security groups associated with the instance.
     */

    public java.util.List<GroupIdentifier> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>();
        }
        return groups;
    }

    /**
     * <p>
     * The security groups associated with the instance.
     * </p>
     * 
     * @param groups
     *        The security groups associated with the instance.
     */

    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(
                groups);
    }

    /**
     * <p>
     * The security groups associated with the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGroups(java.util.Collection)} or
     * {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The security groups associated with the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withGroups(GroupIdentifier... groups) {
        if (this.groups == null) {
            setGroups(new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(
                    groups.length));
        }
        for (GroupIdentifier ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups associated with the instance.
     * </p>
     * 
     * @param groups
     *        The security groups associated with the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceAttribute withGroups(
            java.util.Collection<GroupIdentifier> groups) {
        setGroups(groups);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getUserData() != null)
            sb.append("UserData: " + getUserData() + ",");
        if (getDisableApiTermination() != null)
            sb.append("DisableApiTermination: " + getDisableApiTermination()
                    + ",");
        if (getInstanceInitiatedShutdownBehavior() != null)
            sb.append("InstanceInitiatedShutdownBehavior: "
                    + getInstanceInitiatedShutdownBehavior() + ",");
        if (getRootDeviceName() != null)
            sb.append("RootDeviceName: " + getRootDeviceName() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getSriovNetSupport() != null)
            sb.append("SriovNetSupport: " + getSriovNetSupport() + ",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: " + getSourceDestCheck() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceAttribute == false)
            return false;
        InstanceAttribute other = (InstanceAttribute) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null
                && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null
                && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null
                && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getDisableApiTermination() == null
                ^ this.getDisableApiTermination() == null)
            return false;
        if (other.getDisableApiTermination() != null
                && other.getDisableApiTermination().equals(
                        this.getDisableApiTermination()) == false)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() == null
                ^ this.getInstanceInitiatedShutdownBehavior() == null)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null
                && other.getInstanceInitiatedShutdownBehavior().equals(
                        this.getInstanceInitiatedShutdownBehavior()) == false)
            return false;
        if (other.getRootDeviceName() == null
                ^ this.getRootDeviceName() == null)
            return false;
        if (other.getRootDeviceName() != null
                && other.getRootDeviceName().equals(this.getRootDeviceName()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null
                ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null
                && other.getBlockDeviceMappings().equals(
                        this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null
                && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null
                && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getSriovNetSupport() == null
                ^ this.getSriovNetSupport() == null)
            return false;
        if (other.getSriovNetSupport() != null
                && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false)
            return false;
        if (other.getSourceDestCheck() == null
                ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null
                && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null
                && other.getGroups().equals(this.getGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode
                + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode
                + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisableApiTermination() == null) ? 0
                        : getDisableApiTermination().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceInitiatedShutdownBehavior() == null) ? 0
                        : getInstanceInitiatedShutdownBehavior().hashCode());
        hashCode = prime
                * hashCode
                + ((getRootDeviceName() == null) ? 0 : getRootDeviceName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getBlockDeviceMappings() == null) ? 0
                        : getBlockDeviceMappings().hashCode());
        hashCode = prime
                * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getGroups() == null) ? 0 : getGroups().hashCode());
        return hashCode;
    }

    @Override
    public InstanceAttribute clone() {
        try {
            return (InstanceAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
