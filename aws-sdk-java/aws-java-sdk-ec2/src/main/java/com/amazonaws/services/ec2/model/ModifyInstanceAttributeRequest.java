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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyInstanceAttributeRequestMarshaller;

/**
 * 
 */
public class ModifyInstanceAttributeRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyInstanceAttributeRequest> {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name of the attribute.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * A new value for the attribute. Use only with the <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>, or
     * <code>instanceInitiatedShutdownBehavior</code> attribute.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes that
     * are currently attached. The volume must be owned by the caller. If no
     * value is specified for <code>DeleteOnTermination</code>, the default is
     * <code>true</code> and the volume is deleted when the instance is
     * terminated.
     * </p>
     * <p>
     * To add instance store volumes to an Amazon EBS-backed instance, you must
     * add them when you launch the instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     * >Updating the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceBlockDeviceMappingSpecification> blockDeviceMappings;
    /**
     * <p>
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for a
     * NAT instance to perform NAT.
     * </p>
     */
    private Boolean sourceDestCheck;
    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance using
     * the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use
     * this paramater for Spot Instances.
     * </p>
     */
    private Boolean disableApiTermination;
    /**
     * <p>
     * Changes the instance type to the specified value. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a>. If the instance type is not valid, the error
     * returned is <code>InvalidInstanceAttributeValue</code>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Changes the instance's kernel to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     */
    private String kernel;
    /**
     * <p>
     * Changes the instance's RAM disk to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     */
    private String ramdisk;
    /**
     * <p>
     * Changes the instance's user data to the specified value.
     * </p>
     */
    private String userData;
    /**
     * <p>
     * Specifies whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     */
    private String instanceInitiatedShutdownBehavior;
    /**
     * <p>
     * [EC2-VPC] Changes the security groups of the instance. You must specify
     * at least one security group, even if it's just the default security group
     * for the VPC. You must specify the security group ID, not the security
     * group name.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groups;
    /**
     * <p>
     * Specifies whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking for the
     * instance.
     * </p>
     * <p>
     * There is no way to disable enhanced networking at this time.
     * </p>
     * <p>
     * This option is supported only for HVM instances. Specifying this option
     * with a PV instance can make it unreachable.
     * </p>
     */
    private String sriovNetSupport;

    /**
     * Default constructor for ModifyInstanceAttributeRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * the object after creating it.
     */
    public ModifyInstanceAttributeRequest() {
    }

    /**
     * Constructs a new ModifyInstanceAttributeRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param instanceId
     *        The ID of the instance.
     * @param attribute
     *        The name of the attribute.
     */
    public ModifyInstanceAttributeRequest(String instanceId, String attribute) {
        setInstanceId(instanceId);
        setAttribute(attribute);
    }

    /**
     * Constructs a new ModifyInstanceAttributeRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param instanceId
     *        The ID of the instance.
     * @param attribute
     *        The name of the attribute.
     */
    public ModifyInstanceAttributeRequest(String instanceId,
            InstanceAttributeName attribute) {
        setInstanceId(instanceId);
        setAttribute(attribute.toString());
    }

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

    public ModifyInstanceAttributeRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute.
     * @see InstanceAttributeName
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @return The name of the attribute.
     * @see InstanceAttributeName
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceAttributeName
     */

    public ModifyInstanceAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceAttributeName
     */

    public void setAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceAttributeName
     */

    public ModifyInstanceAttributeRequest withAttribute(
            InstanceAttributeName attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * A new value for the attribute. Use only with the <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>, or
     * <code>instanceInitiatedShutdownBehavior</code> attribute.
     * </p>
     * 
     * @param value
     *        A new value for the attribute. Use only with the
     *        <code>kernel</code>, <code>ramdisk</code>, <code>userData</code>,
     *        <code>disableApiTermination</code>, or
     *        <code>instanceInitiatedShutdownBehavior</code> attribute.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A new value for the attribute. Use only with the <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>, or
     * <code>instanceInitiatedShutdownBehavior</code> attribute.
     * </p>
     * 
     * @return A new value for the attribute. Use only with the
     *         <code>kernel</code>, <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code>, or
     *         <code>instanceInitiatedShutdownBehavior</code> attribute.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A new value for the attribute. Use only with the <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>, or
     * <code>instanceInitiatedShutdownBehavior</code> attribute.
     * </p>
     * 
     * @param value
     *        A new value for the attribute. Use only with the
     *        <code>kernel</code>, <code>ramdisk</code>, <code>userData</code>,
     *        <code>disableApiTermination</code>, or
     *        <code>instanceInitiatedShutdownBehavior</code> attribute.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes that
     * are currently attached. The volume must be owned by the caller. If no
     * value is specified for <code>DeleteOnTermination</code>, the default is
     * <code>true</code> and the volume is deleted when the instance is
     * terminated.
     * </p>
     * <p>
     * To add instance store volumes to an Amazon EBS-backed instance, you must
     * add them when you launch the instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     * >Updating the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Modifies the <code>DeleteOnTermination</code> attribute for
     *         volumes that are currently attached. The volume must be owned by
     *         the caller. If no value is specified for
     *         <code>DeleteOnTermination</code>, the default is
     *         <code>true</code> and the volume is deleted when the instance is
     *         terminated.</p>
     *         <p>
     *         To add instance store volumes to an Amazon EBS-backed instance,
     *         you must add them when you launch the instance. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     *         >Updating the Block Device Mapping when Launching an Instance</a>
     *         in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public java.util.List<InstanceBlockDeviceMappingSpecification> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<InstanceBlockDeviceMappingSpecification>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes that
     * are currently attached. The volume must be owned by the caller. If no
     * value is specified for <code>DeleteOnTermination</code>, the default is
     * <code>true</code> and the volume is deleted when the instance is
     * terminated.
     * </p>
     * <p>
     * To add instance store volumes to an Amazon EBS-backed instance, you must
     * add them when you launch the instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     * >Updating the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Modifies the <code>DeleteOnTermination</code> attribute for
     *        volumes that are currently attached. The volume must be owned by
     *        the caller. If no value is specified for
     *        <code>DeleteOnTermination</code>, the default is <code>true</code>
     *        and the volume is deleted when the instance is terminated.</p>
     *        <p>
     *        To add instance store volumes to an Amazon EBS-backed instance,
     *        you must add them when you launch the instance. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     *        >Updating the Block Device Mapping when Launching an Instance</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMappingSpecification> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<InstanceBlockDeviceMappingSpecification>(
                blockDeviceMappings);
    }

    /**
     * <p>
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes that
     * are currently attached. The volume must be owned by the caller. If no
     * value is specified for <code>DeleteOnTermination</code>, the default is
     * <code>true</code> and the volume is deleted when the instance is
     * terminated.
     * </p>
     * <p>
     * To add instance store volumes to an Amazon EBS-backed instance, you must
     * add them when you launch the instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     * >Updating the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBlockDeviceMappings(java.util.Collection)} or
     * {@link #withBlockDeviceMappings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Modifies the <code>DeleteOnTermination</code> attribute for
     *        volumes that are currently attached. The volume must be owned by
     *        the caller. If no value is specified for
     *        <code>DeleteOnTermination</code>, the default is <code>true</code>
     *        and the volume is deleted when the instance is terminated.</p>
     *        <p>
     *        To add instance store volumes to an Amazon EBS-backed instance,
     *        you must add them when you launch the instance. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     *        >Updating the Block Device Mapping when Launching an Instance</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withBlockDeviceMappings(
            InstanceBlockDeviceMappingSpecification... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new com.amazonaws.internal.SdkInternalList<InstanceBlockDeviceMappingSpecification>(
                    blockDeviceMappings.length));
        }
        for (InstanceBlockDeviceMappingSpecification ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes that
     * are currently attached. The volume must be owned by the caller. If no
     * value is specified for <code>DeleteOnTermination</code>, the default is
     * <code>true</code> and the volume is deleted when the instance is
     * terminated.
     * </p>
     * <p>
     * To add instance store volumes to an Amazon EBS-backed instance, you must
     * add them when you launch the instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     * >Updating the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Modifies the <code>DeleteOnTermination</code> attribute for
     *        volumes that are currently attached. The volume must be owned by
     *        the caller. If no value is specified for
     *        <code>DeleteOnTermination</code>, the default is <code>true</code>
     *        and the volume is deleted when the instance is terminated.</p>
     *        <p>
     *        To add instance store volumes to an Amazon EBS-backed instance,
     *        you must add them when you launch the instance. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM"
     *        >Updating the Block Device Mapping when Launching an Instance</a>
     *        in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withBlockDeviceMappings(
            java.util.Collection<InstanceBlockDeviceMappingSpecification> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for a
     * NAT instance to perform NAT.
     * </p>
     * 
     * @param sourceDestCheck
     *        Specifies whether source/destination checking is enabled. A value
     *        of <code>true</code> means that checking is enabled, and
     *        <code>false</code> means checking is disabled. This value must be
     *        <code>false</code> for a NAT instance to perform NAT.
     */

    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for a
     * NAT instance to perform NAT.
     * </p>
     * 
     * @return Specifies whether source/destination checking is enabled. A value
     *         of <code>true</code> means that checking is enabled, and
     *         <code>false</code> means checking is disabled. This value must be
     *         <code>false</code> for a NAT instance to perform NAT.
     */

    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for a
     * NAT instance to perform NAT.
     * </p>
     * 
     * @param sourceDestCheck
     *        Specifies whether source/destination checking is enabled. A value
     *        of <code>true</code> means that checking is enabled, and
     *        <code>false</code> means checking is disabled. This value must be
     *        <code>false</code> for a NAT instance to perform NAT.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withSourceDestCheck(
            Boolean sourceDestCheck) {
        setSourceDestCheck(sourceDestCheck);
        return this;
    }

    /**
     * <p>
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for a
     * NAT instance to perform NAT.
     * </p>
     * 
     * @return Specifies whether source/destination checking is enabled. A value
     *         of <code>true</code> means that checking is enabled, and
     *         <code>false</code> means checking is disabled. This value must be
     *         <code>false</code> for a NAT instance to perform NAT.
     */

    public Boolean isSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance using
     * the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use
     * this paramater for Spot Instances.
     * </p>
     * 
     * @param disableApiTermination
     *        If the value is <code>true</code>, you can't terminate the
     *        instance using the Amazon EC2 console, CLI, or API; otherwise, you
     *        can. You cannot use this paramater for Spot Instances.
     */

    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance using
     * the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use
     * this paramater for Spot Instances.
     * </p>
     * 
     * @return If the value is <code>true</code>, you can't terminate the
     *         instance using the Amazon EC2 console, CLI, or API; otherwise,
     *         you can. You cannot use this paramater for Spot Instances.
     */

    public Boolean getDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance using
     * the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use
     * this paramater for Spot Instances.
     * </p>
     * 
     * @param disableApiTermination
     *        If the value is <code>true</code>, you can't terminate the
     *        instance using the Amazon EC2 console, CLI, or API; otherwise, you
     *        can. You cannot use this paramater for Spot Instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withDisableApiTermination(
            Boolean disableApiTermination) {
        setDisableApiTermination(disableApiTermination);
        return this;
    }

    /**
     * <p>
     * If the value is <code>true</code>, you can't terminate the instance using
     * the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use
     * this paramater for Spot Instances.
     * </p>
     * 
     * @return If the value is <code>true</code>, you can't terminate the
     *         instance using the Amazon EC2 console, CLI, or API; otherwise,
     *         you can. You cannot use this paramater for Spot Instances.
     */

    public Boolean isDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * Changes the instance type to the specified value. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a>. If the instance type is not valid, the error
     * returned is <code>InvalidInstanceAttributeValue</code>.
     * </p>
     * 
     * @param instanceType
     *        Changes the instance type to the specified value. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *        >Instance Types</a>. If the instance type is not valid, the error
     *        returned is <code>InvalidInstanceAttributeValue</code>.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Changes the instance type to the specified value. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a>. If the instance type is not valid, the error
     * returned is <code>InvalidInstanceAttributeValue</code>.
     * </p>
     * 
     * @return Changes the instance type to the specified value. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *         >Instance Types</a>. If the instance type is not valid, the error
     *         returned is <code>InvalidInstanceAttributeValue</code>.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * Changes the instance type to the specified value. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     * >Instance Types</a>. If the instance type is not valid, the error
     * returned is <code>InvalidInstanceAttributeValue</code>.
     * </p>
     * 
     * @param instanceType
     *        Changes the instance type to the specified value. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"
     *        >Instance Types</a>. If the instance type is not valid, the error
     *        returned is <code>InvalidInstanceAttributeValue</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Changes the instance's kernel to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     * 
     * @param kernel
     *        Changes the instance's kernel to the specified value. We recommend
     *        that you use PV-GRUB instead of kernels and RAM disks. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     *        >PV-GRUB</a>.
     */

    public void setKernel(String kernel) {
        this.kernel = kernel;
    }

    /**
     * <p>
     * Changes the instance's kernel to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     * 
     * @return Changes the instance's kernel to the specified value. We
     *         recommend that you use PV-GRUB instead of kernels and RAM disks.
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     *         >PV-GRUB</a>.
     */

    public String getKernel() {
        return this.kernel;
    }

    /**
     * <p>
     * Changes the instance's kernel to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     * 
     * @param kernel
     *        Changes the instance's kernel to the specified value. We recommend
     *        that you use PV-GRUB instead of kernels and RAM disks. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     *        >PV-GRUB</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withKernel(String kernel) {
        setKernel(kernel);
        return this;
    }

    /**
     * <p>
     * Changes the instance's RAM disk to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     * 
     * @param ramdisk
     *        Changes the instance's RAM disk to the specified value. We
     *        recommend that you use PV-GRUB instead of kernels and RAM disks.
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     *        >PV-GRUB</a>.
     */

    public void setRamdisk(String ramdisk) {
        this.ramdisk = ramdisk;
    }

    /**
     * <p>
     * Changes the instance's RAM disk to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     * 
     * @return Changes the instance's RAM disk to the specified value. We
     *         recommend that you use PV-GRUB instead of kernels and RAM disks.
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     *         >PV-GRUB</a>.
     */

    public String getRamdisk() {
        return this.ramdisk;
    }

    /**
     * <p>
     * Changes the instance's RAM disk to the specified value. We recommend that
     * you use PV-GRUB instead of kernels and RAM disks. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     * >PV-GRUB</a>.
     * </p>
     * 
     * @param ramdisk
     *        Changes the instance's RAM disk to the specified value. We
     *        recommend that you use PV-GRUB instead of kernels and RAM disks.
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html"
     *        >PV-GRUB</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withRamdisk(String ramdisk) {
        setRamdisk(ramdisk);
        return this;
    }

    /**
     * <p>
     * Changes the instance's user data to the specified value.
     * </p>
     * 
     * @param userData
     *        Changes the instance's user data to the specified value.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * Changes the instance's user data to the specified value.
     * </p>
     * 
     * @return Changes the instance's user data to the specified value.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * Changes the instance's user data to the specified value.
     * </p>
     * 
     * @param userData
     *        Changes the instance's user data to the specified value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * Specifies whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Specifies whether an instance stops or terminates when you
     *        initiate shutdown from the instance (using the operating system
     *        command for system shutdown).
     */

    public void setInstanceInitiatedShutdownBehavior(
            String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Specifies whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * 
     * @return Specifies whether an instance stops or terminates when you
     *         initiate shutdown from the instance (using the operating system
     *         command for system shutdown).
     */

    public String getInstanceInitiatedShutdownBehavior() {
        return this.instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Specifies whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for system
     * shutdown).
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Specifies whether an instance stops or terminates when you
     *        initiate shutdown from the instance (using the operating system
     *        command for system shutdown).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withInstanceInitiatedShutdownBehavior(
            String instanceInitiatedShutdownBehavior) {
        setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] Changes the security groups of the instance. You must specify
     * at least one security group, even if it's just the default security group
     * for the VPC. You must specify the security group ID, not the security
     * group name.
     * </p>
     * 
     * @return [EC2-VPC] Changes the security groups of the instance. You must
     *         specify at least one security group, even if it's just the
     *         default security group for the VPC. You must specify the security
     *         group ID, not the security group name.
     */

    public java.util.List<String> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groups;
    }

    /**
     * <p>
     * [EC2-VPC] Changes the security groups of the instance. You must specify
     * at least one security group, even if it's just the default security group
     * for the VPC. You must specify the security group ID, not the security
     * group name.
     * </p>
     * 
     * @param groups
     *        [EC2-VPC] Changes the security groups of the instance. You must
     *        specify at least one security group, even if it's just the default
     *        security group for the VPC. You must specify the security group
     *        ID, not the security group name.
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
     * [EC2-VPC] Changes the security groups of the instance. You must specify
     * at least one security group, even if it's just the default security group
     * for the VPC. You must specify the security group ID, not the security
     * group name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGroups(java.util.Collection)} or
     * {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        [EC2-VPC] Changes the security groups of the instance. You must
     *        specify at least one security group, even if it's just the default
     *        security group for the VPC. You must specify the security group
     *        ID, not the security group name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withGroups(String... groups) {
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
     * [EC2-VPC] Changes the security groups of the instance. You must specify
     * at least one security group, even if it's just the default security group
     * for the VPC. You must specify the security group ID, not the security
     * group name.
     * </p>
     * 
     * @param groups
     *        [EC2-VPC] Changes the security groups of the instance. You must
     *        specify at least one security group, even if it's just the default
     *        security group for the VPC. You must specify the security group
     *        ID, not the security group name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withGroups(
            java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * Specifies whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     * </p>
     * 
     * @param ebsOptimized
     *        Specifies whether the instance is optimized for EBS I/O. This
     *        optimization provides dedicated throughput to Amazon EBS and an
     *        optimized configuration stack to provide optimal EBS I/O
     *        performance. This optimization isn't available with all instance
     *        types. Additional usage charges apply when using an EBS Optimized
     *        instance.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Specifies whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     * </p>
     * 
     * @return Specifies whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O
     *         performance. This optimization isn't available with all instance
     *         types. Additional usage charges apply when using an EBS Optimized
     *         instance.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Specifies whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     * </p>
     * 
     * @param ebsOptimized
     *        Specifies whether the instance is optimized for EBS I/O. This
     *        optimization provides dedicated throughput to Amazon EBS and an
     *        optimized configuration stack to provide optimal EBS I/O
     *        performance. This optimization isn't available with all instance
     *        types. Additional usage charges apply when using an EBS Optimized
     *        instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Specifies whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     * </p>
     * 
     * @return Specifies whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O
     *         performance. This optimization isn't available with all instance
     *         types. Additional usage charges apply when using an EBS Optimized
     *         instance.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking for the
     * instance.
     * </p>
     * <p>
     * There is no way to disable enhanced networking at this time.
     * </p>
     * <p>
     * This option is supported only for HVM instances. Specifying this option
     * with a PV instance can make it unreachable.
     * </p>
     * 
     * @param sriovNetSupport
     *        Set to <code>simple</code> to enable enhanced networking for the
     *        instance.</p>
     *        <p>
     *        There is no way to disable enhanced networking at this time.
     *        </p>
     *        <p>
     *        This option is supported only for HVM instances. Specifying this
     *        option with a PV instance can make it unreachable.
     */

    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking for the
     * instance.
     * </p>
     * <p>
     * There is no way to disable enhanced networking at this time.
     * </p>
     * <p>
     * This option is supported only for HVM instances. Specifying this option
     * with a PV instance can make it unreachable.
     * </p>
     * 
     * @return Set to <code>simple</code> to enable enhanced networking for the
     *         instance.</p>
     *         <p>
     *         There is no way to disable enhanced networking at this time.
     *         </p>
     *         <p>
     *         This option is supported only for HVM instances. Specifying this
     *         option with a PV instance can make it unreachable.
     */

    public String getSriovNetSupport() {
        return this.sriovNetSupport;
    }

    /**
     * <p>
     * Set to <code>simple</code> to enable enhanced networking for the
     * instance.
     * </p>
     * <p>
     * There is no way to disable enhanced networking at this time.
     * </p>
     * <p>
     * This option is supported only for HVM instances. Specifying this option
     * with a PV instance can make it unreachable.
     * </p>
     * 
     * @param sriovNetSupport
     *        Set to <code>simple</code> to enable enhanced networking for the
     *        instance.</p>
     *        <p>
     *        There is no way to disable enhanced networking at this time.
     *        </p>
     *        <p>
     *        This option is supported only for HVM instances. Specifying this
     *        option with a PV instance can make it unreachable.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyInstanceAttributeRequest withSriovNetSupport(
            String sriovNetSupport) {
        setSriovNetSupport(sriovNetSupport);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<ModifyInstanceAttributeRequest> getDryRunRequest() {
        Request<ModifyInstanceAttributeRequest> request = new ModifyInstanceAttributeRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: " + getSourceDestCheck() + ",");
        if (getDisableApiTermination() != null)
            sb.append("DisableApiTermination: " + getDisableApiTermination()
                    + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKernel() != null)
            sb.append("Kernel: " + getKernel() + ",");
        if (getRamdisk() != null)
            sb.append("Ramdisk: " + getRamdisk() + ",");
        if (getUserData() != null)
            sb.append("UserData: " + getUserData() + ",");
        if (getInstanceInitiatedShutdownBehavior() != null)
            sb.append("InstanceInitiatedShutdownBehavior: "
                    + getInstanceInitiatedShutdownBehavior() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
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

        if (obj instanceof ModifyInstanceAttributeRequest == false)
            return false;
        ModifyInstanceAttributeRequest other = (ModifyInstanceAttributeRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null
                && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null
                && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null
                ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null
                && other.getBlockDeviceMappings().equals(
                        this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getSourceDestCheck() == null
                ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null
                && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        if (other.getDisableApiTermination() == null
                ^ this.getDisableApiTermination() == null)
            return false;
        if (other.getDisableApiTermination() != null
                && other.getDisableApiTermination().equals(
                        this.getDisableApiTermination()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKernel() == null ^ this.getKernel() == null)
            return false;
        if (other.getKernel() != null
                && other.getKernel().equals(this.getKernel()) == false)
            return false;
        if (other.getRamdisk() == null ^ this.getRamdisk() == null)
            return false;
        if (other.getRamdisk() != null
                && other.getRamdisk().equals(this.getRamdisk()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null
                && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() == null
                ^ this.getInstanceInitiatedShutdownBehavior() == null)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null
                && other.getInstanceInitiatedShutdownBehavior().equals(
                        this.getInstanceInitiatedShutdownBehavior()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null
                && other.getGroups().equals(this.getGroups()) == false)
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
                + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode
                + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime
                * hashCode
                + ((getBlockDeviceMappings() == null) ? 0
                        : getBlockDeviceMappings().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDisableApiTermination() == null) ? 0
                        : getDisableApiTermination().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKernel() == null) ? 0 : getKernel().hashCode());
        hashCode = prime * hashCode
                + ((getRamdisk() == null) ? 0 : getRamdisk().hashCode());
        hashCode = prime * hashCode
                + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceInitiatedShutdownBehavior() == null) ? 0
                        : getInstanceInitiatedShutdownBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getGroups() == null) ? 0 : getGroups().hashCode());
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
    public ModifyInstanceAttributeRequest clone() {
        return (ModifyInstanceAttributeRequest) super.clone();
    }
}