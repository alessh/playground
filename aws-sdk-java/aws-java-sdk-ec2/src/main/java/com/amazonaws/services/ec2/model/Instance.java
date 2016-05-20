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
 * Describes an instance.
 * </p>
 */
public class Instance implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The ID of the AMI used to launch the instance.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The current state of the instance.
     * </p>
     */
    private InstanceState state;
    /**
     * <p>
     * The private DNS name assigned to the instance. This DNS name can only be
     * used inside the Amazon EC2 network. This name is not available until the
     * instance enters the <code>running</code> state. For EC2-VPC, this name is
     * only available if you've enabled DNS hostnames for your VPC.
     * </p>
     */
    private String privateDnsName;
    /**
     * <p>
     * The public DNS name assigned to the instance. This name is not available
     * until the instance enters the <code>running</code> state. For EC2-VPC,
     * this name is only available if you've enabled DNS hostnames for your VPC.
     * </p>
     */
    private String publicDnsName;
    /**
     * <p>
     * The reason for the most recent state transition. This might be an empty
     * string.
     * </p>
     */
    private String stateTransitionReason;
    /**
     * <p>
     * The name of the key pair, if this instance was launched with an
     * associated key pair.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * The AMI launch index, which can be used to find this instance in the
     * launch group.
     * </p>
     */
    private Integer amiLaunchIndex;
    /**
     * <p>
     * The product codes attached to this instance, if applicable.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProductCode> productCodes;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The time the instance was launched.
     * </p>
     */
    private java.util.Date launchTime;
    /**
     * <p>
     * The location where the instance launched, if applicable.
     * </p>
     */
    private Placement placement;
    /**
     * <p>
     * The kernel associated with this instance, if applicable.
     * </p>
     */
    private String kernelId;
    /**
     * <p>
     * The RAM disk associated with this instance, if applicable.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The monitoring information for the instance.
     * </p>
     */
    private Monitoring monitoring;
    /**
     * <p>
     * [EC2-VPC] The ID of the subnet in which the instance is running.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * [EC2-VPC] The ID of the VPC in which the instance is running.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The private IP address assigned to the instance.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * The public IP address assigned to the instance, if applicable.
     * </p>
     */
    private String publicIpAddress;
    /**
     * <p>
     * The reason for the most recent state transition.
     * </p>
     */
    private StateReason stateReason;
    /**
     * <p>
     * The architecture of the image.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The root device type used by the AMI. The AMI can use an EBS volume or an
     * instance store volume.
     * </p>
     */
    private String rootDeviceType;
    /**
     * <p>
     * The root device name (for example, <code>/dev/sda1</code> or
     * <code>/dev/xvda</code>).
     * </p>
     */
    private String rootDeviceName;
    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceBlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * The virtualization type of the instance.
     * </p>
     */
    private String virtualizationType;
    /**
     * <p>
     * Indicates whether this is a Spot instance or a Scheduled Instance.
     * </p>
     */
    private String instanceLifecycle;
    /**
     * <p>
     * If the request is a Spot instance request, the ID of the request.
     * </p>
     */
    private String spotInstanceRequestId;
    /**
     * <p>
     * The idempotency token you provided when you launched the instance, if
     * applicable.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Any tags assigned to the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * One or more security groups for the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GroupIdentifier> securityGroups;
    /**
     * <p>
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     * This controls whether source/destination checking is enabled on the
     * instance. A value of <code>true</code> means checking is enabled, and
     * <code>false</code> means checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     */
    private Boolean sourceDestCheck;
    /**
     * <p>
     * The hypervisor type of the instance.
     * </p>
     */
    private String hypervisor;
    /**
     * <p>
     * [EC2-VPC] One or more network interfaces for the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceNetworkInterface> networkInterfaces;
    /**
     * <p>
     * The IAM instance profile associated with the instance, if applicable.
     * </p>
     */
    private IamInstanceProfile iamInstanceProfile;
    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * isn't available with all instance types. Additional usage charges apply
     * when using an EBS Optimized instance.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * Specifies whether enhanced networking is enabled.
     * </p>
     */
    private String sriovNetSupport;

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

    public Instance withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI used to launch the instance.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI used to launch the instance.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI used to launch the instance.
     * </p>
     * 
     * @return The ID of the AMI used to launch the instance.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI used to launch the instance.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI used to launch the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * 
     * @param state
     *        The current state of the instance.
     */

    public void setState(InstanceState state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * 
     * @return The current state of the instance.
     */

    public InstanceState getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * 
     * @param state
     *        The current state of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withState(InstanceState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The private DNS name assigned to the instance. This DNS name can only be
     * used inside the Amazon EC2 network. This name is not available until the
     * instance enters the <code>running</code> state. For EC2-VPC, this name is
     * only available if you've enabled DNS hostnames for your VPC.
     * </p>
     * 
     * @param privateDnsName
     *        The private DNS name assigned to the instance. This DNS name can
     *        only be used inside the Amazon EC2 network. This name is not
     *        available until the instance enters the <code>running</code>
     *        state. For EC2-VPC, this name is only available if you've enabled
     *        DNS hostnames for your VPC.
     */

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name assigned to the instance. This DNS name can only be
     * used inside the Amazon EC2 network. This name is not available until the
     * instance enters the <code>running</code> state. For EC2-VPC, this name is
     * only available if you've enabled DNS hostnames for your VPC.
     * </p>
     * 
     * @return The private DNS name assigned to the instance. This DNS name can
     *         only be used inside the Amazon EC2 network. This name is not
     *         available until the instance enters the <code>running</code>
     *         state. For EC2-VPC, this name is only available if you've enabled
     *         DNS hostnames for your VPC.
     */

    public String getPrivateDnsName() {
        return this.privateDnsName;
    }

    /**
     * <p>
     * The private DNS name assigned to the instance. This DNS name can only be
     * used inside the Amazon EC2 network. This name is not available until the
     * instance enters the <code>running</code> state. For EC2-VPC, this name is
     * only available if you've enabled DNS hostnames for your VPC.
     * </p>
     * 
     * @param privateDnsName
     *        The private DNS name assigned to the instance. This DNS name can
     *        only be used inside the Amazon EC2 network. This name is not
     *        available until the instance enters the <code>running</code>
     *        state. For EC2-VPC, this name is only available if you've enabled
     *        DNS hostnames for your VPC.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withPrivateDnsName(String privateDnsName) {
        setPrivateDnsName(privateDnsName);
        return this;
    }

    /**
     * <p>
     * The public DNS name assigned to the instance. This name is not available
     * until the instance enters the <code>running</code> state. For EC2-VPC,
     * this name is only available if you've enabled DNS hostnames for your VPC.
     * </p>
     * 
     * @param publicDnsName
     *        The public DNS name assigned to the instance. This name is not
     *        available until the instance enters the <code>running</code>
     *        state. For EC2-VPC, this name is only available if you've enabled
     *        DNS hostnames for your VPC.
     */

    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }

    /**
     * <p>
     * The public DNS name assigned to the instance. This name is not available
     * until the instance enters the <code>running</code> state. For EC2-VPC,
     * this name is only available if you've enabled DNS hostnames for your VPC.
     * </p>
     * 
     * @return The public DNS name assigned to the instance. This name is not
     *         available until the instance enters the <code>running</code>
     *         state. For EC2-VPC, this name is only available if you've enabled
     *         DNS hostnames for your VPC.
     */

    public String getPublicDnsName() {
        return this.publicDnsName;
    }

    /**
     * <p>
     * The public DNS name assigned to the instance. This name is not available
     * until the instance enters the <code>running</code> state. For EC2-VPC,
     * this name is only available if you've enabled DNS hostnames for your VPC.
     * </p>
     * 
     * @param publicDnsName
     *        The public DNS name assigned to the instance. This name is not
     *        available until the instance enters the <code>running</code>
     *        state. For EC2-VPC, this name is only available if you've enabled
     *        DNS hostnames for your VPC.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withPublicDnsName(String publicDnsName) {
        setPublicDnsName(publicDnsName);
        return this;
    }

    /**
     * <p>
     * The reason for the most recent state transition. This might be an empty
     * string.
     * </p>
     * 
     * @param stateTransitionReason
     *        The reason for the most recent state transition. This might be an
     *        empty string.
     */

    public void setStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
    }

    /**
     * <p>
     * The reason for the most recent state transition. This might be an empty
     * string.
     * </p>
     * 
     * @return The reason for the most recent state transition. This might be an
     *         empty string.
     */

    public String getStateTransitionReason() {
        return this.stateTransitionReason;
    }

    /**
     * <p>
     * The reason for the most recent state transition. This might be an empty
     * string.
     * </p>
     * 
     * @param stateTransitionReason
     *        The reason for the most recent state transition. This might be an
     *        empty string.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withStateTransitionReason(String stateTransitionReason) {
        setStateTransitionReason(stateTransitionReason);
        return this;
    }

    /**
     * <p>
     * The name of the key pair, if this instance was launched with an
     * associated key pair.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair, if this instance was launched with an
     *        associated key pair.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair, if this instance was launched with an
     * associated key pair.
     * </p>
     * 
     * @return The name of the key pair, if this instance was launched with an
     *         associated key pair.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair, if this instance was launched with an
     * associated key pair.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair, if this instance was launched with an
     *        associated key pair.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * The AMI launch index, which can be used to find this instance in the
     * launch group.
     * </p>
     * 
     * @param amiLaunchIndex
     *        The AMI launch index, which can be used to find this instance in
     *        the launch group.
     */

    public void setAmiLaunchIndex(Integer amiLaunchIndex) {
        this.amiLaunchIndex = amiLaunchIndex;
    }

    /**
     * <p>
     * The AMI launch index, which can be used to find this instance in the
     * launch group.
     * </p>
     * 
     * @return The AMI launch index, which can be used to find this instance in
     *         the launch group.
     */

    public Integer getAmiLaunchIndex() {
        return this.amiLaunchIndex;
    }

    /**
     * <p>
     * The AMI launch index, which can be used to find this instance in the
     * launch group.
     * </p>
     * 
     * @param amiLaunchIndex
     *        The AMI launch index, which can be used to find this instance in
     *        the launch group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withAmiLaunchIndex(Integer amiLaunchIndex) {
        setAmiLaunchIndex(amiLaunchIndex);
        return this;
    }

    /**
     * <p>
     * The product codes attached to this instance, if applicable.
     * </p>
     * 
     * @return The product codes attached to this instance, if applicable.
     */

    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>();
        }
        return productCodes;
    }

    /**
     * <p>
     * The product codes attached to this instance, if applicable.
     * </p>
     * 
     * @param productCodes
     *        The product codes attached to this instance, if applicable.
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
     * The product codes attached to this instance, if applicable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setProductCodes(java.util.Collection)} or
     * {@link #withProductCodes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param productCodes
     *        The product codes attached to this instance, if applicable.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withProductCodes(ProductCode... productCodes) {
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
     * The product codes attached to this instance, if applicable.
     * </p>
     * 
     * @param productCodes
     *        The product codes attached to this instance, if applicable.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withProductCodes(
            java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @see InstanceType
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
     * @see InstanceType
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
     * @see InstanceType
     */

    public Instance withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
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
     * @see InstanceType
     */

    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
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
     * @see InstanceType
     */

    public Instance withInstanceType(InstanceType instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The time the instance was launched.
     * </p>
     * 
     * @param launchTime
     *        The time the instance was launched.
     */

    public void setLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * <p>
     * The time the instance was launched.
     * </p>
     * 
     * @return The time the instance was launched.
     */

    public java.util.Date getLaunchTime() {
        return this.launchTime;
    }

    /**
     * <p>
     * The time the instance was launched.
     * </p>
     * 
     * @param launchTime
     *        The time the instance was launched.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withLaunchTime(java.util.Date launchTime) {
        setLaunchTime(launchTime);
        return this;
    }

    /**
     * <p>
     * The location where the instance launched, if applicable.
     * </p>
     * 
     * @param placement
     *        The location where the instance launched, if applicable.
     */

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The location where the instance launched, if applicable.
     * </p>
     * 
     * @return The location where the instance launched, if applicable.
     */

    public Placement getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * The location where the instance launched, if applicable.
     * </p>
     * 
     * @param placement
     *        The location where the instance launched, if applicable.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withPlacement(Placement placement) {
        setPlacement(placement);
        return this;
    }

    /**
     * <p>
     * The kernel associated with this instance, if applicable.
     * </p>
     * 
     * @param kernelId
     *        The kernel associated with this instance, if applicable.
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The kernel associated with this instance, if applicable.
     * </p>
     * 
     * @return The kernel associated with this instance, if applicable.
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The kernel associated with this instance, if applicable.
     * </p>
     * 
     * @param kernelId
     *        The kernel associated with this instance, if applicable.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * The RAM disk associated with this instance, if applicable.
     * </p>
     * 
     * @param ramdiskId
     *        The RAM disk associated with this instance, if applicable.
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The RAM disk associated with this instance, if applicable.
     * </p>
     * 
     * @return The RAM disk associated with this instance, if applicable.
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The RAM disk associated with this instance, if applicable.
     * </p>
     * 
     * @param ramdiskId
     *        The RAM disk associated with this instance, if applicable.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * 
     * @param platform
     *        The value is <code>Windows</code> for Windows instances; otherwise
     *        blank.
     * @see PlatformValues
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * 
     * @return The value is <code>Windows</code> for Windows instances;
     *         otherwise blank.
     * @see PlatformValues
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * 
     * @param platform
     *        The value is <code>Windows</code> for Windows instances; otherwise
     *        blank.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PlatformValues
     */

    public Instance withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * 
     * @param platform
     *        The value is <code>Windows</code> for Windows instances; otherwise
     *        blank.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PlatformValues
     */

    public void setPlatform(PlatformValues platform) {
        this.platform = platform.toString();
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows instances; otherwise blank.
     * </p>
     * 
     * @param platform
     *        The value is <code>Windows</code> for Windows instances; otherwise
     *        blank.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PlatformValues
     */

    public Instance withPlatform(PlatformValues platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The monitoring information for the instance.
     * </p>
     * 
     * @param monitoring
     *        The monitoring information for the instance.
     */

    public void setMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * The monitoring information for the instance.
     * </p>
     * 
     * @return The monitoring information for the instance.
     */

    public Monitoring getMonitoring() {
        return this.monitoring;
    }

    /**
     * <p>
     * The monitoring information for the instance.
     * </p>
     * 
     * @param monitoring
     *        The monitoring information for the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withMonitoring(Monitoring monitoring) {
        setMonitoring(monitoring);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet in which the instance is running.
     * </p>
     * 
     * @param subnetId
     *        [EC2-VPC] The ID of the subnet in which the instance is running.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet in which the instance is running.
     * </p>
     * 
     * @return [EC2-VPC] The ID of the subnet in which the instance is running.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet in which the instance is running.
     * </p>
     * 
     * @param subnetId
     *        [EC2-VPC] The ID of the subnet in which the instance is running.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC in which the instance is running.
     * </p>
     * 
     * @param vpcId
     *        [EC2-VPC] The ID of the VPC in which the instance is running.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC in which the instance is running.
     * </p>
     * 
     * @return [EC2-VPC] The ID of the VPC in which the instance is running.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC in which the instance is running.
     * </p>
     * 
     * @param vpcId
     *        [EC2-VPC] The ID of the VPC in which the instance is running.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The private IP address assigned to the instance.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address assigned to the instance.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address assigned to the instance.
     * </p>
     * 
     * @return The private IP address assigned to the instance.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The private IP address assigned to the instance.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address assigned to the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * The public IP address assigned to the instance, if applicable.
     * </p>
     * 
     * @param publicIpAddress
     *        The public IP address assigned to the instance, if applicable.
     */

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    /**
     * <p>
     * The public IP address assigned to the instance, if applicable.
     * </p>
     * 
     * @return The public IP address assigned to the instance, if applicable.
     */

    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * <p>
     * The public IP address assigned to the instance, if applicable.
     * </p>
     * 
     * @param publicIpAddress
     *        The public IP address assigned to the instance, if applicable.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withPublicIpAddress(String publicIpAddress) {
        setPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * <p>
     * The reason for the most recent state transition.
     * </p>
     * 
     * @param stateReason
     *        The reason for the most recent state transition.
     */

    public void setStateReason(StateReason stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason for the most recent state transition.
     * </p>
     * 
     * @return The reason for the most recent state transition.
     */

    public StateReason getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason for the most recent state transition.
     * </p>
     * 
     * @param stateReason
     *        The reason for the most recent state transition.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withStateReason(StateReason stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * 
     * @param architecture
     *        The architecture of the image.
     * @see ArchitectureValues
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * 
     * @return The architecture of the image.
     * @see ArchitectureValues
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * 
     * @param architecture
     *        The architecture of the image.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ArchitectureValues
     */

    public Instance withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * 
     * @param architecture
     *        The architecture of the image.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ArchitectureValues
     */

    public void setArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * 
     * @param architecture
     *        The architecture of the image.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ArchitectureValues
     */

    public Instance withArchitecture(ArchitectureValues architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The root device type used by the AMI. The AMI can use an EBS volume or an
     * instance store volume.
     * </p>
     * 
     * @param rootDeviceType
     *        The root device type used by the AMI. The AMI can use an EBS
     *        volume or an instance store volume.
     * @see DeviceType
     */

    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    /**
     * <p>
     * The root device type used by the AMI. The AMI can use an EBS volume or an
     * instance store volume.
     * </p>
     * 
     * @return The root device type used by the AMI. The AMI can use an EBS
     *         volume or an instance store volume.
     * @see DeviceType
     */

    public String getRootDeviceType() {
        return this.rootDeviceType;
    }

    /**
     * <p>
     * The root device type used by the AMI. The AMI can use an EBS volume or an
     * instance store volume.
     * </p>
     * 
     * @param rootDeviceType
     *        The root device type used by the AMI. The AMI can use an EBS
     *        volume or an instance store volume.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DeviceType
     */

    public Instance withRootDeviceType(String rootDeviceType) {
        setRootDeviceType(rootDeviceType);
        return this;
    }

    /**
     * <p>
     * The root device type used by the AMI. The AMI can use an EBS volume or an
     * instance store volume.
     * </p>
     * 
     * @param rootDeviceType
     *        The root device type used by the AMI. The AMI can use an EBS
     *        volume or an instance store volume.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DeviceType
     */

    public void setRootDeviceType(DeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
    }

    /**
     * <p>
     * The root device type used by the AMI. The AMI can use an EBS volume or an
     * instance store volume.
     * </p>
     * 
     * @param rootDeviceType
     *        The root device type used by the AMI. The AMI can use an EBS
     *        volume or an instance store volume.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DeviceType
     */

    public Instance withRootDeviceType(DeviceType rootDeviceType) {
        setRootDeviceType(rootDeviceType);
        return this;
    }

    /**
     * <p>
     * The root device name (for example, <code>/dev/sda1</code> or
     * <code>/dev/xvda</code>).
     * </p>
     * 
     * @param rootDeviceName
     *        The root device name (for example, <code>/dev/sda1</code> or
     *        <code>/dev/xvda</code>).
     */

    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }

    /**
     * <p>
     * The root device name (for example, <code>/dev/sda1</code> or
     * <code>/dev/xvda</code>).
     * </p>
     * 
     * @return The root device name (for example, <code>/dev/sda1</code> or
     *         <code>/dev/xvda</code>).
     */

    public String getRootDeviceName() {
        return this.rootDeviceName;
    }

    /**
     * <p>
     * The root device name (for example, <code>/dev/sda1</code> or
     * <code>/dev/xvda</code>).
     * </p>
     * 
     * @param rootDeviceName
     *        The root device name (for example, <code>/dev/sda1</code> or
     *        <code>/dev/xvda</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withRootDeviceName(String rootDeviceName) {
        setRootDeviceName(rootDeviceName);
        return this;
    }

    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     * 
     * @return Any block device mapping entries for the instance.
     */

    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<InstanceBlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Any block device mapping entries for the instance.
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
     * Any block device mapping entries for the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBlockDeviceMappings(java.util.Collection)} or
     * {@link #withBlockDeviceMappings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Any block device mapping entries for the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withBlockDeviceMappings(
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
     * Any block device mapping entries for the instance.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Any block device mapping entries for the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The virtualization type of the instance.
     * </p>
     * 
     * @param virtualizationType
     *        The virtualization type of the instance.
     * @see VirtualizationType
     */

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    /**
     * <p>
     * The virtualization type of the instance.
     * </p>
     * 
     * @return The virtualization type of the instance.
     * @see VirtualizationType
     */

    public String getVirtualizationType() {
        return this.virtualizationType;
    }

    /**
     * <p>
     * The virtualization type of the instance.
     * </p>
     * 
     * @param virtualizationType
     *        The virtualization type of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see VirtualizationType
     */

    public Instance withVirtualizationType(String virtualizationType) {
        setVirtualizationType(virtualizationType);
        return this;
    }

    /**
     * <p>
     * The virtualization type of the instance.
     * </p>
     * 
     * @param virtualizationType
     *        The virtualization type of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see VirtualizationType
     */

    public void setVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
    }

    /**
     * <p>
     * The virtualization type of the instance.
     * </p>
     * 
     * @param virtualizationType
     *        The virtualization type of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see VirtualizationType
     */

    public Instance withVirtualizationType(VirtualizationType virtualizationType) {
        setVirtualizationType(virtualizationType);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is a Spot instance or a Scheduled Instance.
     * </p>
     * 
     * @param instanceLifecycle
     *        Indicates whether this is a Spot instance or a Scheduled Instance.
     * @see InstanceLifecycleType
     */

    public void setInstanceLifecycle(String instanceLifecycle) {
        this.instanceLifecycle = instanceLifecycle;
    }

    /**
     * <p>
     * Indicates whether this is a Spot instance or a Scheduled Instance.
     * </p>
     * 
     * @return Indicates whether this is a Spot instance or a Scheduled
     *         Instance.
     * @see InstanceLifecycleType
     */

    public String getInstanceLifecycle() {
        return this.instanceLifecycle;
    }

    /**
     * <p>
     * Indicates whether this is a Spot instance or a Scheduled Instance.
     * </p>
     * 
     * @param instanceLifecycle
     *        Indicates whether this is a Spot instance or a Scheduled Instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceLifecycleType
     */

    public Instance withInstanceLifecycle(String instanceLifecycle) {
        setInstanceLifecycle(instanceLifecycle);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is a Spot instance or a Scheduled Instance.
     * </p>
     * 
     * @param instanceLifecycle
     *        Indicates whether this is a Spot instance or a Scheduled Instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceLifecycleType
     */

    public void setInstanceLifecycle(InstanceLifecycleType instanceLifecycle) {
        this.instanceLifecycle = instanceLifecycle.toString();
    }

    /**
     * <p>
     * Indicates whether this is a Spot instance or a Scheduled Instance.
     * </p>
     * 
     * @param instanceLifecycle
     *        Indicates whether this is a Spot instance or a Scheduled Instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceLifecycleType
     */

    public Instance withInstanceLifecycle(
            InstanceLifecycleType instanceLifecycle) {
        setInstanceLifecycle(instanceLifecycle);
        return this;
    }

    /**
     * <p>
     * If the request is a Spot instance request, the ID of the request.
     * </p>
     * 
     * @param spotInstanceRequestId
     *        If the request is a Spot instance request, the ID of the request.
     */

    public void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }

    /**
     * <p>
     * If the request is a Spot instance request, the ID of the request.
     * </p>
     * 
     * @return If the request is a Spot instance request, the ID of the request.
     */

    public String getSpotInstanceRequestId() {
        return this.spotInstanceRequestId;
    }

    /**
     * <p>
     * If the request is a Spot instance request, the ID of the request.
     * </p>
     * 
     * @param spotInstanceRequestId
     *        If the request is a Spot instance request, the ID of the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withSpotInstanceRequestId(String spotInstanceRequestId) {
        setSpotInstanceRequestId(spotInstanceRequestId);
        return this;
    }

    /**
     * <p>
     * The idempotency token you provided when you launched the instance, if
     * applicable.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token you provided when you launched the instance,
     *        if applicable.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token you provided when you launched the instance, if
     * applicable.
     * </p>
     * 
     * @return The idempotency token you provided when you launched the
     *         instance, if applicable.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token you provided when you launched the instance, if
     * applicable.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token you provided when you launched the instance,
     *        if applicable.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the instance.
     * </p>
     * 
     * @return Any tags assigned to the instance.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the instance.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the instance.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or
     * {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the instance.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * One or more security groups for the instance.
     * </p>
     * 
     * @return One or more security groups for the instance.
     */

    public java.util.List<GroupIdentifier> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * One or more security groups for the instance.
     * </p>
     * 
     * @param securityGroups
     *        One or more security groups for the instance.
     */

    public void setSecurityGroups(
            java.util.Collection<GroupIdentifier> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(
                securityGroups);
    }

    /**
     * <p>
     * One or more security groups for the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroups(java.util.Collection)} or
     * {@link #withSecurityGroups(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param securityGroups
     *        One or more security groups for the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withSecurityGroups(GroupIdentifier... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<GroupIdentifier>(
                    securityGroups.length));
        }
        for (GroupIdentifier ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security groups for the instance.
     * </p>
     * 
     * @param securityGroups
     *        One or more security groups for the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withSecurityGroups(
            java.util.Collection<GroupIdentifier> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     * This controls whether source/destination checking is enabled on the
     * instance. A value of <code>true</code> means checking is enabled, and
     * <code>false</code> means checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param sourceDestCheck
     *        Specifies whether to enable an instance launched in a VPC to
     *        perform NAT. This controls whether source/destination checking is
     *        enabled on the instance. A value of <code>true</code> means
     *        checking is enabled, and <code>false</code> means checking is
     *        disabled. The value must be <code>false</code> for the instance to
     *        perform NAT. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     *        >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User
     *        Guide</i>.
     */

    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     * This controls whether source/destination checking is enabled on the
     * instance. A value of <code>true</code> means checking is enabled, and
     * <code>false</code> means checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether to enable an instance launched in a VPC to
     *         perform NAT. This controls whether source/destination checking is
     *         enabled on the instance. A value of <code>true</code> means
     *         checking is enabled, and <code>false</code> means checking is
     *         disabled. The value must be <code>false</code> for the instance
     *         to perform NAT. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     *         >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User
     *         Guide</i>.
     */

    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     * This controls whether source/destination checking is enabled on the
     * instance. A value of <code>true</code> means checking is enabled, and
     * <code>false</code> means checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @param sourceDestCheck
     *        Specifies whether to enable an instance launched in a VPC to
     *        perform NAT. This controls whether source/destination checking is
     *        enabled on the instance. A value of <code>true</code> means
     *        checking is enabled, and <code>false</code> means checking is
     *        disabled. The value must be <code>false</code> for the instance to
     *        perform NAT. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     *        >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withSourceDestCheck(Boolean sourceDestCheck) {
        setSourceDestCheck(sourceDestCheck);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable an instance launched in a VPC to perform NAT.
     * This controls whether source/destination checking is enabled on the
     * instance. A value of <code>true</code> means checking is enabled, and
     * <code>false</code> means checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     * >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies whether to enable an instance launched in a VPC to
     *         perform NAT. This controls whether source/destination checking is
     *         enabled on the instance. A value of <code>true</code> means
     *         checking is enabled, and <code>false</code> means checking is
     *         disabled. The value must be <code>false</code> for the instance
     *         to perform NAT. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"
     *         >NAT Instances</a> in the <i>Amazon Virtual Private Cloud User
     *         Guide</i>.
     */

    public Boolean isSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * The hypervisor type of the instance.
     * </p>
     * 
     * @param hypervisor
     *        The hypervisor type of the instance.
     * @see HypervisorType
     */

    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * The hypervisor type of the instance.
     * </p>
     * 
     * @return The hypervisor type of the instance.
     * @see HypervisorType
     */

    public String getHypervisor() {
        return this.hypervisor;
    }

    /**
     * <p>
     * The hypervisor type of the instance.
     * </p>
     * 
     * @param hypervisor
     *        The hypervisor type of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see HypervisorType
     */

    public Instance withHypervisor(String hypervisor) {
        setHypervisor(hypervisor);
        return this;
    }

    /**
     * <p>
     * The hypervisor type of the instance.
     * </p>
     * 
     * @param hypervisor
     *        The hypervisor type of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see HypervisorType
     */

    public void setHypervisor(HypervisorType hypervisor) {
        this.hypervisor = hypervisor.toString();
    }

    /**
     * <p>
     * The hypervisor type of the instance.
     * </p>
     * 
     * @param hypervisor
     *        The hypervisor type of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see HypervisorType
     */

    public Instance withHypervisor(HypervisorType hypervisor) {
        setHypervisor(hypervisor);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] One or more network interfaces for the instance.
     * </p>
     * 
     * @return [EC2-VPC] One or more network interfaces for the instance.
     */

    public java.util.List<InstanceNetworkInterface> getNetworkInterfaces() {
        if (networkInterfaces == null) {
            networkInterfaces = new com.amazonaws.internal.SdkInternalList<InstanceNetworkInterface>();
        }
        return networkInterfaces;
    }

    /**
     * <p>
     * [EC2-VPC] One or more network interfaces for the instance.
     * </p>
     * 
     * @param networkInterfaces
     *        [EC2-VPC] One or more network interfaces for the instance.
     */

    public void setNetworkInterfaces(
            java.util.Collection<InstanceNetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new com.amazonaws.internal.SdkInternalList<InstanceNetworkInterface>(
                networkInterfaces);
    }

    /**
     * <p>
     * [EC2-VPC] One or more network interfaces for the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNetworkInterfaces(java.util.Collection)} or
     * {@link #withNetworkInterfaces(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        [EC2-VPC] One or more network interfaces for the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withNetworkInterfaces(
            InstanceNetworkInterface... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new com.amazonaws.internal.SdkInternalList<InstanceNetworkInterface>(
                    networkInterfaces.length));
        }
        for (InstanceNetworkInterface ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] One or more network interfaces for the instance.
     * </p>
     * 
     * @param networkInterfaces
     *        [EC2-VPC] One or more network interfaces for the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withNetworkInterfaces(
            java.util.Collection<InstanceNetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The IAM instance profile associated with the instance, if applicable.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The IAM instance profile associated with the instance, if
     *        applicable.
     */

    public void setIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile associated with the instance, if applicable.
     * </p>
     * 
     * @return The IAM instance profile associated with the instance, if
     *         applicable.
     */

    public IamInstanceProfile getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile associated with the instance, if applicable.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The IAM instance profile associated with the instance, if
     *        applicable.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * isn't available with all instance types. Additional usage charges apply
     * when using an EBS Optimized instance.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for EBS I/O. This
     *        optimization provides dedicated throughput to Amazon EBS and an
     *        optimized configuration stack to provide optimal I/O performance.
     *        This optimization isn't available with all instance types.
     *        Additional usage charges apply when using an EBS Optimized
     *        instance.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * isn't available with all instance types. Additional usage charges apply
     * when using an EBS Optimized instance.
     * </p>
     * 
     * @return Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal I/O performance.
     *         This optimization isn't available with all instance types.
     *         Additional usage charges apply when using an EBS Optimized
     *         instance.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * isn't available with all instance types. Additional usage charges apply
     * when using an EBS Optimized instance.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for EBS I/O. This
     *        optimization provides dedicated throughput to Amazon EBS and an
     *        optimized configuration stack to provide optimal I/O performance.
     *        This optimization isn't available with all instance types.
     *        Additional usage charges apply when using an EBS Optimized
     *        instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * isn't available with all instance types. Additional usage charges apply
     * when using an EBS Optimized instance.
     * </p>
     * 
     * @return Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal I/O performance.
     *         This optimization isn't available with all instance types.
     *         Additional usage charges apply when using an EBS Optimized
     *         instance.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Specifies whether enhanced networking is enabled.
     * </p>
     * 
     * @param sriovNetSupport
     *        Specifies whether enhanced networking is enabled.
     */

    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    /**
     * <p>
     * Specifies whether enhanced networking is enabled.
     * </p>
     * 
     * @return Specifies whether enhanced networking is enabled.
     */

    public String getSriovNetSupport() {
        return this.sriovNetSupport;
    }

    /**
     * <p>
     * Specifies whether enhanced networking is enabled.
     * </p>
     * 
     * @param sriovNetSupport
     *        Specifies whether enhanced networking is enabled.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Instance withSriovNetSupport(String sriovNetSupport) {
        setSriovNetSupport(sriovNetSupport);
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
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getPublicDnsName() != null)
            sb.append("PublicDnsName: " + getPublicDnsName() + ",");
        if (getStateTransitionReason() != null)
            sb.append("StateTransitionReason: " + getStateTransitionReason()
                    + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getAmiLaunchIndex() != null)
            sb.append("AmiLaunchIndex: " + getAmiLaunchIndex() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getLaunchTime() != null)
            sb.append("LaunchTime: " + getLaunchTime() + ",");
        if (getPlacement() != null)
            sb.append("Placement: " + getPlacement() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getMonitoring() != null)
            sb.append("Monitoring: " + getMonitoring() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getPublicIpAddress() != null)
            sb.append("PublicIpAddress: " + getPublicIpAddress() + ",");
        if (getStateReason() != null)
            sb.append("StateReason: " + getStateReason() + ",");
        if (getArchitecture() != null)
            sb.append("Architecture: " + getArchitecture() + ",");
        if (getRootDeviceType() != null)
            sb.append("RootDeviceType: " + getRootDeviceType() + ",");
        if (getRootDeviceName() != null)
            sb.append("RootDeviceName: " + getRootDeviceName() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getVirtualizationType() != null)
            sb.append("VirtualizationType: " + getVirtualizationType() + ",");
        if (getInstanceLifecycle() != null)
            sb.append("InstanceLifecycle: " + getInstanceLifecycle() + ",");
        if (getSpotInstanceRequestId() != null)
            sb.append("SpotInstanceRequestId: " + getSpotInstanceRequestId()
                    + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: " + getSourceDestCheck() + ",");
        if (getHypervisor() != null)
            sb.append("Hypervisor: " + getHypervisor() + ",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getSriovNetSupport() != null)
            sb.append("SriovNetSupport: " + getSriovNetSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null
                && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null
                && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPrivateDnsName() == null
                ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null
                && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getPublicDnsName() == null ^ this.getPublicDnsName() == null)
            return false;
        if (other.getPublicDnsName() != null
                && other.getPublicDnsName().equals(this.getPublicDnsName()) == false)
            return false;
        if (other.getStateTransitionReason() == null
                ^ this.getStateTransitionReason() == null)
            return false;
        if (other.getStateTransitionReason() != null
                && other.getStateTransitionReason().equals(
                        this.getStateTransitionReason()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null
                && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getAmiLaunchIndex() == null
                ^ this.getAmiLaunchIndex() == null)
            return false;
        if (other.getAmiLaunchIndex() != null
                && other.getAmiLaunchIndex().equals(this.getAmiLaunchIndex()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null
                && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getLaunchTime() == null ^ this.getLaunchTime() == null)
            return false;
        if (other.getLaunchTime() != null
                && other.getLaunchTime().equals(this.getLaunchTime()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null
                && other.getPlacement().equals(this.getPlacement()) == false)
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
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null
                && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getMonitoring() == null ^ this.getMonitoring() == null)
            return false;
        if (other.getMonitoring() != null
                && other.getMonitoring().equals(this.getMonitoring()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null
                && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null
                && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getPrivateIpAddress() == null
                ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(
                        this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPublicIpAddress() == null
                ^ this.getPublicIpAddress() == null)
            return false;
        if (other.getPublicIpAddress() != null
                && other.getPublicIpAddress().equals(this.getPublicIpAddress()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null
                && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null
                && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getRootDeviceType() == null
                ^ this.getRootDeviceType() == null)
            return false;
        if (other.getRootDeviceType() != null
                && other.getRootDeviceType().equals(this.getRootDeviceType()) == false)
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
        if (other.getVirtualizationType() == null
                ^ this.getVirtualizationType() == null)
            return false;
        if (other.getVirtualizationType() != null
                && other.getVirtualizationType().equals(
                        this.getVirtualizationType()) == false)
            return false;
        if (other.getInstanceLifecycle() == null
                ^ this.getInstanceLifecycle() == null)
            return false;
        if (other.getInstanceLifecycle() != null
                && other.getInstanceLifecycle().equals(
                        this.getInstanceLifecycle()) == false)
            return false;
        if (other.getSpotInstanceRequestId() == null
                ^ this.getSpotInstanceRequestId() == null)
            return false;
        if (other.getSpotInstanceRequestId() != null
                && other.getSpotInstanceRequestId().equals(
                        this.getSpotInstanceRequestId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null
                && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSecurityGroups() == null
                ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSourceDestCheck() == null
                ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null
                && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        if (other.getHypervisor() == null ^ this.getHypervisor() == null)
            return false;
        if (other.getHypervisor() != null
                && other.getHypervisor().equals(this.getHypervisor()) == false)
            return false;
        if (other.getNetworkInterfaces() == null
                ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null
                && other.getNetworkInterfaces().equals(
                        this.getNetworkInterfaces()) == false)
            return false;
        if (other.getIamInstanceProfile() == null
                ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null
                && other.getIamInstanceProfile().equals(
                        this.getIamInstanceProfile()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPublicDnsName() == null) ? 0 : getPublicDnsName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getStateTransitionReason() == null) ? 0
                        : getStateTransitionReason().hashCode());
        hashCode = prime * hashCode
                + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAmiLaunchIndex() == null) ? 0 : getAmiLaunchIndex()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTime() == null) ? 0 : getLaunchTime().hashCode());
        hashCode = prime * hashCode
                + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode
                + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode
                + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode
                + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode
                + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode
                + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode
                + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPublicIpAddress() == null) ? 0 : getPublicIpAddress()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime
                * hashCode
                + ((getArchitecture() == null) ? 0 : getArchitecture()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRootDeviceType() == null) ? 0 : getRootDeviceType()
                        .hashCode());
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
                + ((getVirtualizationType() == null) ? 0
                        : getVirtualizationType().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceLifecycle() == null) ? 0
                        : getInstanceLifecycle().hashCode());
        hashCode = prime
                * hashCode
                + ((getSpotInstanceRequestId() == null) ? 0
                        : getSpotInstanceRequestId().hashCode());
        hashCode = prime
                * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        hashCode = prime
                * hashCode
                + ((getNetworkInterfaces() == null) ? 0
                        : getNetworkInterfaces().hashCode());
        hashCode = prime
                * hashCode
                + ((getIamInstanceProfile() == null) ? 0
                        : getIamInstanceProfile().hashCode());
        hashCode = prime
                * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport()
                        .hashCode());
        return hashCode;
    }

    @Override
    public Instance clone() {
        try {
            return (Instance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
