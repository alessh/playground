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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateLaunchConfigurationRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the launch configuration. This name must be unique within the
     * scope of your AWS account.
     * </p>
     */
    private String launchConfigurationName;
    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     * instances. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     * >Finding an AMI</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The name of the key pair. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"
     * >Amazon EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * One or more security groups with which to associate the instances.
     * </p>
     * <p>
     * If your instances are launched in EC2-Classic, you can either specify
     * security group names or the security group IDs. For more information
     * about security groups for EC2-Classic, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     * >Amazon EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * <p>
     * If your instances are launched into a VPC, specify security group IDs.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"
     * >Security Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud
     * User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;
    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     * to. This parameter is supported only if you are launching EC2-Classic
     * instances. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String classicLinkVPCId;
    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if
     * <code>ClassicLinkVPCId</code> is specified, and is not supported
     * otherwise. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> classicLinkVPCSecurityGroups;
    /**
     * <p>
     * The user data to make available to the launched EC2 instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance Metadata and User Data</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * At this time, launch configurations don't support compressed (zipped)
     * user data files.
     * </p>
     */
    private String userData;
    /**
     * <p>
     * The ID of the EC2 instance to use to create the launch configuration.
     * </p>
     * <p>
     * The new launch configuration derives attributes from the instance, with
     * the exception of the block device mapping.
     * </p>
     * <p>
     * To create a launch configuration with a block device mapping or override
     * any other instance attributes, specify them as part of the same request.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html"
     * >Create a Launch Configuration Using an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The instance type of the EC2 instance. For information about available
     * instance types, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     * > Available Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide.</i>
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The ID of the kernel associated with the AMI.
     * </p>
     */
    private String kernelId;
    /**
     * <p>
     * The ID of the RAM disk associated with the AMI.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * One or more mappings that specify how block devices are exposed to the
     * instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html"
     * >Block Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * Enables detailed monitoring if it is disabled. Detailed monitoring is
     * enabled by default.
     * </p>
     * <p>
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics
     * every minute and your account is charged a fee. When you disable detailed
     * monitoring, by specifying <code>False</code>, CloudWatch generates
     * metrics every 5 minutes. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html"
     * >Monitor Your Auto Scaling Instances</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     */
    private InstanceMonitoring instanceMonitoring;
    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. Spot Instances are launched when the price you
     * specify exceeds the current Spot market price. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html"
     * >Launch Spot Instances in Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     */
    private String spotPrice;
    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance.
     * </p>
     * <p>
     * EC2 instances launched with an IAM role will automatically have AWS
     * security credentials available. You can use IAM roles with Auto Scaling
     * to automatically enable applications running on your EC2 instances to
     * securely access other AWS resources. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html"
     * >Launch Auto Scaling Instances with an IAM Role</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     */
    private String iamInstanceProfile;
    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. By
     * default, the instance is not optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * is not available with all instance types. Additional usage charges apply.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     * >Amazon EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * Used for groups that launch instances into a virtual private cloud (VPC).
     * Specifies whether to assign a public IP address to each instance. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * If you specify a value for this parameter, be sure to specify at least
     * one subnet using the <i>VPCZoneIdentifier</i> parameter when you create
     * your group.
     * </p>
     * <p>
     * Default: If the instance is launched into a default subnet, the default
     * is <code>true</code>. If the instance is launched into a nondefault
     * subnet, the default is <code>false</code>. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private Boolean associatePublicIpAddress;
    /**
     * <p>
     * The tenancy of the instance. An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware and can only be
     * launched into a VPC.
     * </p>
     * <p>
     * You must set the value of this parameter to <code>dedicated</code> if
     * want to launch Dedicated Instances into a shared tenancy VPC (VPC with
     * instance placement tenancy attribute set to <code>default</code>).
     * </p>
     * <p>
     * If you specify a value for this parameter, be sure to specify at least
     * one subnet using the <i>VPCZoneIdentifier</i> parameter when you create
     * your group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>default</code> | <code>dedicated</code>
     * </p>
     */
    private String placementTenancy;

    /**
     * <p>
     * The name of the launch configuration. This name must be unique within the
     * scope of your AWS account.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration. This name must be unique
     *        within the scope of your AWS account.
     */

    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. This name must be unique within the
     * scope of your AWS account.
     * </p>
     * 
     * @return The name of the launch configuration. This name must be unique
     *         within the scope of your AWS account.
     */

    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. This name must be unique within the
     * scope of your AWS account.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration. This name must be unique
     *        within the scope of your AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withLaunchConfigurationName(
            String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     * instances. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     * >Finding an AMI</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     *        instances. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     *        >Finding an AMI</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     * instances. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     * >Finding an AMI</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @return The ID of the Amazon Machine Image (AMI) to use to launch your
     *         EC2 instances. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     *         >Finding an AMI</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     * instances. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     * >Finding an AMI</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI) to use to launch your EC2
     *        instances. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html"
     *        >Finding an AMI</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The name of the key pair. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"
     * >Amazon EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"
     *        >Amazon EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud
     *        User Guide</i>.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"
     * >Amazon EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @return The name of the key pair. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"
     *         >Amazon EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"
     * >Amazon EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"
     *        >Amazon EC2 Key Pairs</a> in the <i>Amazon Elastic Compute Cloud
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * One or more security groups with which to associate the instances.
     * </p>
     * <p>
     * If your instances are launched in EC2-Classic, you can either specify
     * security group names or the security group IDs. For more information
     * about security groups for EC2-Classic, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     * >Amazon EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * <p>
     * If your instances are launched into a VPC, specify security group IDs.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"
     * >Security Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud
     * User Guide</i>.
     * </p>
     * 
     * @return One or more security groups with which to associate the
     *         instances.</p>
     *         <p>
     *         If your instances are launched in EC2-Classic, you can either
     *         specify security group names or the security group IDs. For more
     *         information about security groups for EC2-Classic, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     *         >Amazon EC2 Security Groups</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide</i>.
     *         </p>
     *         <p>
     *         If your instances are launched into a VPC, specify security group
     *         IDs. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"
     *         >Security Groups for Your VPC</a> in the <i>Amazon Virtual
     *         Private Cloud User Guide</i>.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * One or more security groups with which to associate the instances.
     * </p>
     * <p>
     * If your instances are launched in EC2-Classic, you can either specify
     * security group names or the security group IDs. For more information
     * about security groups for EC2-Classic, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     * >Amazon EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * <p>
     * If your instances are launched into a VPC, specify security group IDs.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"
     * >Security Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param securityGroups
     *        One or more security groups with which to associate the
     *        instances.</p>
     *        <p>
     *        If your instances are launched in EC2-Classic, you can either
     *        specify security group names or the security group IDs. For more
     *        information about security groups for EC2-Classic, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     *        >Amazon EC2 Security Groups</a> in the <i>Amazon Elastic Compute
     *        Cloud User Guide</i>.
     *        </p>
     *        <p>
     *        If your instances are launched into a VPC, specify security group
     *        IDs. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"
     *        >Security Groups for Your VPC</a> in the <i>Amazon Virtual Private
     *        Cloud User Guide</i>.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<String>(
                securityGroups);
    }

    /**
     * <p>
     * One or more security groups with which to associate the instances.
     * </p>
     * <p>
     * If your instances are launched in EC2-Classic, you can either specify
     * security group names or the security group IDs. For more information
     * about security groups for EC2-Classic, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     * >Amazon EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * <p>
     * If your instances are launched into a VPC, specify security group IDs.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"
     * >Security Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud
     * User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroups(java.util.Collection)} or
     * {@link #withSecurityGroups(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param securityGroups
     *        One or more security groups with which to associate the
     *        instances.</p>
     *        <p>
     *        If your instances are launched in EC2-Classic, you can either
     *        specify security group names or the security group IDs. For more
     *        information about security groups for EC2-Classic, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     *        >Amazon EC2 Security Groups</a> in the <i>Amazon Elastic Compute
     *        Cloud User Guide</i>.
     *        </p>
     *        <p>
     *        If your instances are launched into a VPC, specify security group
     *        IDs. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"
     *        >Security Groups for Your VPC</a> in the <i>Amazon Virtual Private
     *        Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withSecurityGroups(
            String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(
                    securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security groups with which to associate the instances.
     * </p>
     * <p>
     * If your instances are launched in EC2-Classic, you can either specify
     * security group names or the security group IDs. For more information
     * about security groups for EC2-Classic, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     * >Amazon EC2 Security Groups</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide</i>.
     * </p>
     * <p>
     * If your instances are launched into a VPC, specify security group IDs.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"
     * >Security Groups for Your VPC</a> in the <i>Amazon Virtual Private Cloud
     * User Guide</i>.
     * </p>
     * 
     * @param securityGroups
     *        One or more security groups with which to associate the
     *        instances.</p>
     *        <p>
     *        If your instances are launched in EC2-Classic, you can either
     *        specify security group names or the security group IDs. For more
     *        information about security groups for EC2-Classic, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     *        >Amazon EC2 Security Groups</a> in the <i>Amazon Elastic Compute
     *        Cloud User Guide</i>.
     *        </p>
     *        <p>
     *        If your instances are launched into a VPC, specify security group
     *        IDs. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"
     *        >Security Groups for Your VPC</a> in the <i>Amazon Virtual Private
     *        Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withSecurityGroups(
            java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     * to. This parameter is supported only if you are launching EC2-Classic
     * instances. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param classicLinkVPCId
     *        The ID of a ClassicLink-enabled VPC to link your EC2-Classic
     *        instances to. This parameter is supported only if you are
     *        launching EC2-Classic instances. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *        >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     */

    public void setClassicLinkVPCId(String classicLinkVPCId) {
        this.classicLinkVPCId = classicLinkVPCId;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     * to. This parameter is supported only if you are launching EC2-Classic
     * instances. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The ID of a ClassicLink-enabled VPC to link your EC2-Classic
     *         instances to. This parameter is supported only if you are
     *         launching EC2-Classic instances. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *         >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */

    public String getClassicLinkVPCId() {
        return this.classicLinkVPCId;
    }

    /**
     * <p>
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances
     * to. This parameter is supported only if you are launching EC2-Classic
     * instances. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param classicLinkVPCId
     *        The ID of a ClassicLink-enabled VPC to link your EC2-Classic
     *        instances to. This parameter is supported only if you are
     *        launching EC2-Classic instances. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *        >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withClassicLinkVPCId(
            String classicLinkVPCId) {
        setClassicLinkVPCId(classicLinkVPCId);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if
     * <code>ClassicLinkVPCId</code> is specified, and is not supported
     * otherwise. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The IDs of one or more security groups for the VPC specified in
     *         <code>ClassicLinkVPCId</code>. This parameter is required if
     *         <code>ClassicLinkVPCId</code> is specified, and is not supported
     *         otherwise. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *         >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */

    public java.util.List<String> getClassicLinkVPCSecurityGroups() {
        if (classicLinkVPCSecurityGroups == null) {
            classicLinkVPCSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return classicLinkVPCSecurityGroups;
    }

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if
     * <code>ClassicLinkVPCId</code> is specified, and is not supported
     * otherwise. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param classicLinkVPCSecurityGroups
     *        The IDs of one or more security groups for the VPC specified in
     *        <code>ClassicLinkVPCId</code>. This parameter is required if
     *        <code>ClassicLinkVPCId</code> is specified, and is not supported
     *        otherwise. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *        >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     */

    public void setClassicLinkVPCSecurityGroups(
            java.util.Collection<String> classicLinkVPCSecurityGroups) {
        if (classicLinkVPCSecurityGroups == null) {
            this.classicLinkVPCSecurityGroups = null;
            return;
        }

        this.classicLinkVPCSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>(
                classicLinkVPCSecurityGroups);
    }

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if
     * <code>ClassicLinkVPCId</code> is specified, and is not supported
     * otherwise. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setClassicLinkVPCSecurityGroups(java.util.Collection)}
     * or {@link #withClassicLinkVPCSecurityGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param classicLinkVPCSecurityGroups
     *        The IDs of one or more security groups for the VPC specified in
     *        <code>ClassicLinkVPCId</code>. This parameter is required if
     *        <code>ClassicLinkVPCId</code> is specified, and is not supported
     *        otherwise. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *        >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withClassicLinkVPCSecurityGroups(
            String... classicLinkVPCSecurityGroups) {
        if (this.classicLinkVPCSecurityGroups == null) {
            setClassicLinkVPCSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(
                    classicLinkVPCSecurityGroups.length));
        }
        for (String ele : classicLinkVPCSecurityGroups) {
            this.classicLinkVPCSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups for the VPC specified in
     * <code>ClassicLinkVPCId</code>. This parameter is required if
     * <code>ClassicLinkVPCId</code> is specified, and is not supported
     * otherwise. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     * >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param classicLinkVPCSecurityGroups
     *        The IDs of one or more security groups for the VPC specified in
     *        <code>ClassicLinkVPCId</code>. This parameter is required if
     *        <code>ClassicLinkVPCId</code> is specified, and is not supported
     *        otherwise. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"
     *        >ClassicLink</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withClassicLinkVPCSecurityGroups(
            java.util.Collection<String> classicLinkVPCSecurityGroups) {
        setClassicLinkVPCSecurityGroups(classicLinkVPCSecurityGroups);
        return this;
    }

    /**
     * <p>
     * The user data to make available to the launched EC2 instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance Metadata and User Data</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * At this time, launch configurations don't support compressed (zipped)
     * user data files.
     * </p>
     * 
     * @param userData
     *        The user data to make available to the launched EC2 instances. For
     *        more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *        >Instance Metadata and User Data</a> in the <i>Amazon Elastic
     *        Compute Cloud User Guide</i>.</p>
     *        <p>
     *        At this time, launch configurations don't support compressed
     *        (zipped) user data files.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The user data to make available to the launched EC2 instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance Metadata and User Data</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * At this time, launch configurations don't support compressed (zipped)
     * user data files.
     * </p>
     * 
     * @return The user data to make available to the launched EC2 instances.
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *         >Instance Metadata and User Data</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.</p>
     *         <p>
     *         At this time, launch configurations don't support compressed
     *         (zipped) user data files.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The user data to make available to the launched EC2 instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >Instance Metadata and User Data</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * <p>
     * At this time, launch configurations don't support compressed (zipped)
     * user data files.
     * </p>
     * 
     * @param userData
     *        The user data to make available to the launched EC2 instances. For
     *        more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *        >Instance Metadata and User Data</a> in the <i>Amazon Elastic
     *        Compute Cloud User Guide</i>.</p>
     *        <p>
     *        At this time, launch configurations don't support compressed
     *        (zipped) user data files.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 instance to use to create the launch configuration.
     * </p>
     * <p>
     * The new launch configuration derives attributes from the instance, with
     * the exception of the block device mapping.
     * </p>
     * <p>
     * To create a launch configuration with a block device mapping or override
     * any other instance attributes, specify them as part of the same request.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html"
     * >Create a Launch Configuration Using an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param instanceId
     *        The ID of the EC2 instance to use to create the launch
     *        configuration.</p>
     *        <p>
     *        The new launch configuration derives attributes from the instance,
     *        with the exception of the block device mapping.
     *        </p>
     *        <p>
     *        To create a launch configuration with a block device mapping or
     *        override any other instance attributes, specify them as part of
     *        the same request.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html"
     *        >Create a Launch Configuration Using an EC2 Instance</a> in the
     *        <i>Auto Scaling Developer Guide</i>.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance to use to create the launch configuration.
     * </p>
     * <p>
     * The new launch configuration derives attributes from the instance, with
     * the exception of the block device mapping.
     * </p>
     * <p>
     * To create a launch configuration with a block device mapping or override
     * any other instance attributes, specify them as part of the same request.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html"
     * >Create a Launch Configuration Using an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @return The ID of the EC2 instance to use to create the launch
     *         configuration.</p>
     *         <p>
     *         The new launch configuration derives attributes from the
     *         instance, with the exception of the block device mapping.
     *         </p>
     *         <p>
     *         To create a launch configuration with a block device mapping or
     *         override any other instance attributes, specify them as part of
     *         the same request.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html"
     *         >Create a Launch Configuration Using an EC2 Instance</a> in the
     *         <i>Auto Scaling Developer Guide</i>.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance to use to create the launch configuration.
     * </p>
     * <p>
     * The new launch configuration derives attributes from the instance, with
     * the exception of the block device mapping.
     * </p>
     * <p>
     * To create a launch configuration with a block device mapping or override
     * any other instance attributes, specify them as part of the same request.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html"
     * >Create a Launch Configuration Using an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param instanceId
     *        The ID of the EC2 instance to use to create the launch
     *        configuration.</p>
     *        <p>
     *        The new launch configuration derives attributes from the instance,
     *        with the exception of the block device mapping.
     *        </p>
     *        <p>
     *        To create a launch configuration with a block device mapping or
     *        override any other instance attributes, specify them as part of
     *        the same request.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-lc-with-instanceID.html"
     *        >Create a Launch Configuration Using an EC2 Instance</a> in the
     *        <i>Auto Scaling Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The instance type of the EC2 instance. For information about available
     * instance types, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     * > Available Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide.</i>
     * </p>
     * 
     * @param instanceType
     *        The instance type of the EC2 instance. For information about
     *        available instance types, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *        > Available Instance Types</a> in the <i>Amazon Elastic Compute
     *        Cloud User Guide.</i>
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the EC2 instance. For information about available
     * instance types, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     * > Available Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide.</i>
     * </p>
     * 
     * @return The instance type of the EC2 instance. For information about
     *         available instance types, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *         > Available Instance Types</a> in the <i>Amazon Elastic Compute
     *         Cloud User Guide.</i>
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the EC2 instance. For information about available
     * instance types, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     * > Available Instance Types</a> in the <i>Amazon Elastic Compute Cloud
     * User Guide.</i>
     * </p>
     * 
     * @param instanceType
     *        The instance type of the EC2 instance. For information about
     *        available instance types, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes"
     *        > Available Instance Types</a> in the <i>Amazon Elastic Compute
     *        Cloud User Guide.</i>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The ID of the kernel associated with the AMI.
     * </p>
     * 
     * @param kernelId
     *        The ID of the kernel associated with the AMI.
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The ID of the kernel associated with the AMI.
     * </p>
     * 
     * @return The ID of the kernel associated with the AMI.
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The ID of the kernel associated with the AMI.
     * </p>
     * 
     * @param kernelId
     *        The ID of the kernel associated with the AMI.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk associated with the AMI.
     * </p>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk associated with the AMI.
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk associated with the AMI.
     * </p>
     * 
     * @return The ID of the RAM disk associated with the AMI.
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk associated with the AMI.
     * </p>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk associated with the AMI.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * One or more mappings that specify how block devices are exposed to the
     * instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html"
     * >Block Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @return One or more mappings that specify how block devices are exposed
     *         to the instance. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html"
     *         >Block Device Mapping</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * One or more mappings that specify how block devices are exposed to the
     * instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html"
     * >Block Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more mappings that specify how block devices are exposed to
     *        the instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html"
     *        >Block Device Mapping</a> in the <i>Amazon Elastic Compute Cloud
     *        User Guide</i>.
     */

    public void setBlockDeviceMappings(
            java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>(
                blockDeviceMappings);
    }

    /**
     * <p>
     * One or more mappings that specify how block devices are exposed to the
     * instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html"
     * >Block Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBlockDeviceMappings(java.util.Collection)} or
     * {@link #withBlockDeviceMappings(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more mappings that specify how block devices are exposed to
     *        the instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html"
     *        >Block Device Mapping</a> in the <i>Amazon Elastic Compute Cloud
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withBlockDeviceMappings(
            BlockDeviceMapping... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>(
                    blockDeviceMappings.length));
        }
        for (BlockDeviceMapping ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more mappings that specify how block devices are exposed to the
     * instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html"
     * >Block Device Mapping</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more mappings that specify how block devices are exposed to
     *        the instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html"
     *        >Block Device Mapping</a> in the <i>Amazon Elastic Compute Cloud
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withBlockDeviceMappings(
            java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * Enables detailed monitoring if it is disabled. Detailed monitoring is
     * enabled by default.
     * </p>
     * <p>
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics
     * every minute and your account is charged a fee. When you disable detailed
     * monitoring, by specifying <code>False</code>, CloudWatch generates
     * metrics every 5 minutes. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html"
     * >Monitor Your Auto Scaling Instances</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * 
     * @param instanceMonitoring
     *        Enables detailed monitoring if it is disabled. Detailed monitoring
     *        is enabled by default.</p>
     *        <p>
     *        When detailed monitoring is enabled, Amazon CloudWatch generates
     *        metrics every minute and your account is charged a fee. When you
     *        disable detailed monitoring, by specifying <code>False</code>,
     *        CloudWatch generates metrics every 5 minutes. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html"
     *        >Monitor Your Auto Scaling Instances</a> in the <i>Auto Scaling
     *        Developer Guide</i>.
     */

    public void setInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
    }

    /**
     * <p>
     * Enables detailed monitoring if it is disabled. Detailed monitoring is
     * enabled by default.
     * </p>
     * <p>
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics
     * every minute and your account is charged a fee. When you disable detailed
     * monitoring, by specifying <code>False</code>, CloudWatch generates
     * metrics every 5 minutes. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html"
     * >Monitor Your Auto Scaling Instances</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * 
     * @return Enables detailed monitoring if it is disabled. Detailed
     *         monitoring is enabled by default.</p>
     *         <p>
     *         When detailed monitoring is enabled, Amazon CloudWatch generates
     *         metrics every minute and your account is charged a fee. When you
     *         disable detailed monitoring, by specifying <code>False</code>,
     *         CloudWatch generates metrics every 5 minutes. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html"
     *         >Monitor Your Auto Scaling Instances</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     */

    public InstanceMonitoring getInstanceMonitoring() {
        return this.instanceMonitoring;
    }

    /**
     * <p>
     * Enables detailed monitoring if it is disabled. Detailed monitoring is
     * enabled by default.
     * </p>
     * <p>
     * When detailed monitoring is enabled, Amazon CloudWatch generates metrics
     * every minute and your account is charged a fee. When you disable detailed
     * monitoring, by specifying <code>False</code>, CloudWatch generates
     * metrics every 5 minutes. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html"
     * >Monitor Your Auto Scaling Instances</a> in the <i>Auto Scaling Developer
     * Guide</i>.
     * </p>
     * 
     * @param instanceMonitoring
     *        Enables detailed monitoring if it is disabled. Detailed monitoring
     *        is enabled by default.</p>
     *        <p>
     *        When detailed monitoring is enabled, Amazon CloudWatch generates
     *        metrics every minute and your account is charged a fee. When you
     *        disable detailed monitoring, by specifying <code>False</code>,
     *        CloudWatch generates metrics every 5 minutes. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html"
     *        >Monitor Your Auto Scaling Instances</a> in the <i>Auto Scaling
     *        Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withInstanceMonitoring(
            InstanceMonitoring instanceMonitoring) {
        setInstanceMonitoring(instanceMonitoring);
        return this;
    }

    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. Spot Instances are launched when the price you
     * specify exceeds the current Spot market price. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html"
     * >Launch Spot Instances in Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param spotPrice
     *        The maximum hourly price to be paid for any Spot Instance launched
     *        to fulfill the request. Spot Instances are launched when the price
     *        you specify exceeds the current Spot market price. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html"
     *        >Launch Spot Instances in Your Auto Scaling Group</a> in the
     *        <i>Auto Scaling Developer Guide</i>.
     */

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. Spot Instances are launched when the price you
     * specify exceeds the current Spot market price. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html"
     * >Launch Spot Instances in Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @return The maximum hourly price to be paid for any Spot Instance
     *         launched to fulfill the request. Spot Instances are launched when
     *         the price you specify exceeds the current Spot market price. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html"
     *         >Launch Spot Instances in Your Auto Scaling Group</a> in the
     *         <i>Auto Scaling Developer Guide</i>.
     */

    public String getSpotPrice() {
        return this.spotPrice;
    }

    /**
     * <p>
     * The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. Spot Instances are launched when the price you
     * specify exceeds the current Spot market price. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html"
     * >Launch Spot Instances in Your Auto Scaling Group</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param spotPrice
     *        The maximum hourly price to be paid for any Spot Instance launched
     *        to fulfill the request. Spot Instances are launched when the price
     *        you specify exceeds the current Spot market price. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html"
     *        >Launch Spot Instances in Your Auto Scaling Group</a> in the
     *        <i>Auto Scaling Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withSpotPrice(String spotPrice) {
        setSpotPrice(spotPrice);
        return this;
    }

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance.
     * </p>
     * <p>
     * EC2 instances launched with an IAM role will automatically have AWS
     * security credentials available. You can use IAM roles with Auto Scaling
     * to automatically enable applications running on your EC2 instances to
     * securely access other AWS resources. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html"
     * >Launch Auto Scaling Instances with an IAM Role</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The name or the Amazon Resource Name (ARN) of the instance profile
     *        associated with the IAM role for the instance.</p>
     *        <p>
     *        EC2 instances launched with an IAM role will automatically have
     *        AWS security credentials available. You can use IAM roles with
     *        Auto Scaling to automatically enable applications running on your
     *        EC2 instances to securely access other AWS resources. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html"
     *        >Launch Auto Scaling Instances with an IAM Role</a> in the <i>Auto
     *        Scaling Developer Guide</i>.
     */

    public void setIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance.
     * </p>
     * <p>
     * EC2 instances launched with an IAM role will automatically have AWS
     * security credentials available. You can use IAM roles with Auto Scaling
     * to automatically enable applications running on your EC2 instances to
     * securely access other AWS resources. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html"
     * >Launch Auto Scaling Instances with an IAM Role</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @return The name or the Amazon Resource Name (ARN) of the instance
     *         profile associated with the IAM role for the instance.</p>
     *         <p>
     *         EC2 instances launched with an IAM role will automatically have
     *         AWS security credentials available. You can use IAM roles with
     *         Auto Scaling to automatically enable applications running on your
     *         EC2 instances to securely access other AWS resources. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html"
     *         >Launch Auto Scaling Instances with an IAM Role</a> in the
     *         <i>Auto Scaling Developer Guide</i>.
     */

    public String getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance.
     * </p>
     * <p>
     * EC2 instances launched with an IAM role will automatically have AWS
     * security credentials available. You can use IAM roles with Auto Scaling
     * to automatically enable applications running on your EC2 instances to
     * securely access other AWS resources. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html"
     * >Launch Auto Scaling Instances with an IAM Role</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The name or the Amazon Resource Name (ARN) of the instance profile
     *        associated with the IAM role for the instance.</p>
     *        <p>
     *        EC2 instances launched with an IAM role will automatically have
     *        AWS security credentials available. You can use IAM roles with
     *        Auto Scaling to automatically enable applications running on your
     *        EC2 instances to securely access other AWS resources. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html"
     *        >Launch Auto Scaling Instances with an IAM Role</a> in the <i>Auto
     *        Scaling Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withIamInstanceProfile(
            String iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. By
     * default, the instance is not optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * is not available with all instance types. Additional usage charges apply.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     * >Amazon EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for Amazon EBS I/O. By
     *        default, the instance is not optimized for EBS I/O. The
     *        optimization provides dedicated throughput to Amazon EBS and an
     *        optimized configuration stack to provide optimal I/O performance.
     *        This optimization is not available with all instance types.
     *        Additional usage charges apply. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     *        >Amazon EBS-Optimized Instances</a> in the <i>Amazon Elastic
     *        Compute Cloud User Guide</i>.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. By
     * default, the instance is not optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * is not available with all instance types. Additional usage charges apply.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     * >Amazon EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @return Indicates whether the instance is optimized for Amazon EBS I/O.
     *         By default, the instance is not optimized for EBS I/O. The
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal I/O performance.
     *         This optimization is not available with all instance types.
     *         Additional usage charges apply. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     *         >Amazon EBS-Optimized Instances</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. By
     * default, the instance is not optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * is not available with all instance types. Additional usage charges apply.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     * >Amazon EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for Amazon EBS I/O. By
     *        default, the instance is not optimized for EBS I/O. The
     *        optimization provides dedicated throughput to Amazon EBS and an
     *        optimized configuration stack to provide optimal I/O performance.
     *        This optimization is not available with all instance types.
     *        Additional usage charges apply. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     *        >Amazon EBS-Optimized Instances</a> in the <i>Amazon Elastic
     *        Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withEbsOptimized(
            Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O. By
     * default, the instance is not optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal I/O performance. This optimization
     * is not available with all instance types. Additional usage charges apply.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     * >Amazon EBS-Optimized Instances</a> in the <i>Amazon Elastic Compute
     * Cloud User Guide</i>.
     * </p>
     * 
     * @return Indicates whether the instance is optimized for Amazon EBS I/O.
     *         By default, the instance is not optimized for EBS I/O. The
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal I/O performance.
     *         This optimization is not available with all instance types.
     *         Additional usage charges apply. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSOptimized.html"
     *         >Amazon EBS-Optimized Instances</a> in the <i>Amazon Elastic
     *         Compute Cloud User Guide</i>.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Used for groups that launch instances into a virtual private cloud (VPC).
     * Specifies whether to assign a public IP address to each instance. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * If you specify a value for this parameter, be sure to specify at least
     * one subnet using the <i>VPCZoneIdentifier</i> parameter when you create
     * your group.
     * </p>
     * <p>
     * Default: If the instance is launched into a default subnet, the default
     * is <code>true</code>. If the instance is launched into a nondefault
     * subnet, the default is <code>false</code>. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Used for groups that launch instances into a virtual private cloud
     *        (VPC). Specifies whether to assign a public IP address to each
     *        instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     *        >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto
     *        Scaling Developer Guide</i>.</p>
     *        <p>
     *        If you specify a value for this parameter, be sure to specify at
     *        least one subnet using the <i>VPCZoneIdentifier</i> parameter when
     *        you create your group.
     *        </p>
     *        <p>
     *        Default: If the instance is launched into a default subnet, the
     *        default is <code>true</code>. If the instance is launched into a
     *        nondefault subnet, the default is <code>false</code>. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     *        >Supported Platforms</a> in the <i>Amazon Elastic Compute Cloud
     *        User Guide</i>.
     */

    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * Used for groups that launch instances into a virtual private cloud (VPC).
     * Specifies whether to assign a public IP address to each instance. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * If you specify a value for this parameter, be sure to specify at least
     * one subnet using the <i>VPCZoneIdentifier</i> parameter when you create
     * your group.
     * </p>
     * <p>
     * Default: If the instance is launched into a default subnet, the default
     * is <code>true</code>. If the instance is launched into a nondefault
     * subnet, the default is <code>false</code>. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @return Used for groups that launch instances into a virtual private
     *         cloud (VPC). Specifies whether to assign a public IP address to
     *         each instance. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     *         >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto
     *         Scaling Developer Guide</i>.</p>
     *         <p>
     *         If you specify a value for this parameter, be sure to specify at
     *         least one subnet using the <i>VPCZoneIdentifier</i> parameter
     *         when you create your group.
     *         </p>
     *         <p>
     *         Default: If the instance is launched into a default subnet, the
     *         default is <code>true</code>. If the instance is launched into a
     *         nondefault subnet, the default is <code>false</code>. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     *         >Supported Platforms</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     */

    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * Used for groups that launch instances into a virtual private cloud (VPC).
     * Specifies whether to assign a public IP address to each instance. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * If you specify a value for this parameter, be sure to specify at least
     * one subnet using the <i>VPCZoneIdentifier</i> parameter when you create
     * your group.
     * </p>
     * <p>
     * Default: If the instance is launched into a default subnet, the default
     * is <code>true</code>. If the instance is launched into a nondefault
     * subnet, the default is <code>false</code>. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Used for groups that launch instances into a virtual private cloud
     *        (VPC). Specifies whether to assign a public IP address to each
     *        instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     *        >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto
     *        Scaling Developer Guide</i>.</p>
     *        <p>
     *        If you specify a value for this parameter, be sure to specify at
     *        least one subnet using the <i>VPCZoneIdentifier</i> parameter when
     *        you create your group.
     *        </p>
     *        <p>
     *        Default: If the instance is launched into a default subnet, the
     *        default is <code>true</code>. If the instance is launched into a
     *        nondefault subnet, the default is <code>false</code>. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     *        >Supported Platforms</a> in the <i>Amazon Elastic Compute Cloud
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withAssociatePublicIpAddress(
            Boolean associatePublicIpAddress) {
        setAssociatePublicIpAddress(associatePublicIpAddress);
        return this;
    }

    /**
     * <p>
     * Used for groups that launch instances into a virtual private cloud (VPC).
     * Specifies whether to assign a public IP address to each instance. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * If you specify a value for this parameter, be sure to specify at least
     * one subnet using the <i>VPCZoneIdentifier</i> parameter when you create
     * your group.
     * </p>
     * <p>
     * Default: If the instance is launched into a default subnet, the default
     * is <code>true</code>. If the instance is launched into a nondefault
     * subnet, the default is <code>false</code>. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     * >Supported Platforms</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @return Used for groups that launch instances into a virtual private
     *         cloud (VPC). Specifies whether to assign a public IP address to
     *         each instance. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     *         >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto
     *         Scaling Developer Guide</i>.</p>
     *         <p>
     *         If you specify a value for this parameter, be sure to specify at
     *         least one subnet using the <i>VPCZoneIdentifier</i> parameter
     *         when you create your group.
     *         </p>
     *         <p>
     *         Default: If the instance is launched into a default subnet, the
     *         default is <code>true</code>. If the instance is launched into a
     *         nondefault subnet, the default is <code>false</code>. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-platforms.html"
     *         >Supported Platforms</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     */

    public Boolean isAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * The tenancy of the instance. An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware and can only be
     * launched into a VPC.
     * </p>
     * <p>
     * You must set the value of this parameter to <code>dedicated</code> if
     * want to launch Dedicated Instances into a shared tenancy VPC (VPC with
     * instance placement tenancy attribute set to <code>default</code>).
     * </p>
     * <p>
     * If you specify a value for this parameter, be sure to specify at least
     * one subnet using the <i>VPCZoneIdentifier</i> parameter when you create
     * your group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>default</code> | <code>dedicated</code>
     * </p>
     * 
     * @param placementTenancy
     *        The tenancy of the instance. An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware and can only
     *        be launched into a VPC.</p>
     *        <p>
     *        You must set the value of this parameter to <code>dedicated</code>
     *        if want to launch Dedicated Instances into a shared tenancy VPC
     *        (VPC with instance placement tenancy attribute set to
     *        <code>default</code>).
     *        </p>
     *        <p>
     *        If you specify a value for this parameter, be sure to specify at
     *        least one subnet using the <i>VPCZoneIdentifier</i> parameter when
     *        you create your group.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     *        >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto
     *        Scaling Developer Guide</i>.
     *        </p>
     *        <p>
     *        Valid values: <code>default</code> | <code>dedicated</code>
     */

    public void setPlacementTenancy(String placementTenancy) {
        this.placementTenancy = placementTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance. An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware and can only be
     * launched into a VPC.
     * </p>
     * <p>
     * You must set the value of this parameter to <code>dedicated</code> if
     * want to launch Dedicated Instances into a shared tenancy VPC (VPC with
     * instance placement tenancy attribute set to <code>default</code>).
     * </p>
     * <p>
     * If you specify a value for this parameter, be sure to specify at least
     * one subnet using the <i>VPCZoneIdentifier</i> parameter when you create
     * your group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>default</code> | <code>dedicated</code>
     * </p>
     * 
     * @return The tenancy of the instance. An instance with a tenancy of
     *         <code>dedicated</code> runs on single-tenant hardware and can
     *         only be launched into a VPC.</p>
     *         <p>
     *         You must set the value of this parameter to
     *         <code>dedicated</code> if want to launch Dedicated Instances into
     *         a shared tenancy VPC (VPC with instance placement tenancy
     *         attribute set to <code>default</code>).
     *         </p>
     *         <p>
     *         If you specify a value for this parameter, be sure to specify at
     *         least one subnet using the <i>VPCZoneIdentifier</i> parameter
     *         when you create your group.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     *         >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto
     *         Scaling Developer Guide</i>.
     *         </p>
     *         <p>
     *         Valid values: <code>default</code> | <code>dedicated</code>
     */

    public String getPlacementTenancy() {
        return this.placementTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance. An instance with a tenancy of
     * <code>dedicated</code> runs on single-tenant hardware and can only be
     * launched into a VPC.
     * </p>
     * <p>
     * You must set the value of this parameter to <code>dedicated</code> if
     * want to launch Dedicated Instances into a shared tenancy VPC (VPC with
     * instance placement tenancy attribute set to <code>default</code>).
     * </p>
     * <p>
     * If you specify a value for this parameter, be sure to specify at least
     * one subnet using the <i>VPCZoneIdentifier</i> parameter when you create
     * your group.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * Valid values: <code>default</code> | <code>dedicated</code>
     * </p>
     * 
     * @param placementTenancy
     *        The tenancy of the instance. An instance with a tenancy of
     *        <code>dedicated</code> runs on single-tenant hardware and can only
     *        be launched into a VPC.</p>
     *        <p>
     *        You must set the value of this parameter to <code>dedicated</code>
     *        if want to launch Dedicated Instances into a shared tenancy VPC
     *        (VPC with instance placement tenancy attribute set to
     *        <code>default</code>).
     *        </p>
     *        <p>
     *        If you specify a value for this parameter, be sure to specify at
     *        least one subnet using the <i>VPCZoneIdentifier</i> parameter when
     *        you create your group.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     *        >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto
     *        Scaling Developer Guide</i>.
     *        </p>
     *        <p>
     *        Valid values: <code>default</code> | <code>dedicated</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLaunchConfigurationRequest withPlacementTenancy(
            String placementTenancy) {
        setPlacementTenancy(placementTenancy);
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
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: "
                    + getLaunchConfigurationName() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getClassicLinkVPCId() != null)
            sb.append("ClassicLinkVPCId: " + getClassicLinkVPCId() + ",");
        if (getClassicLinkVPCSecurityGroups() != null)
            sb.append("ClassicLinkVPCSecurityGroups: "
                    + getClassicLinkVPCSecurityGroups() + ",");
        if (getUserData() != null)
            sb.append("UserData: " + getUserData() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getInstanceMonitoring() != null)
            sb.append("InstanceMonitoring: " + getInstanceMonitoring() + ",");
        if (getSpotPrice() != null)
            sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized() + ",");
        if (getAssociatePublicIpAddress() != null)
            sb.append("AssociatePublicIpAddress: "
                    + getAssociatePublicIpAddress() + ",");
        if (getPlacementTenancy() != null)
            sb.append("PlacementTenancy: " + getPlacementTenancy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLaunchConfigurationRequest == false)
            return false;
        CreateLaunchConfigurationRequest other = (CreateLaunchConfigurationRequest) obj;
        if (other.getLaunchConfigurationName() == null
                ^ this.getLaunchConfigurationName() == null)
            return false;
        if (other.getLaunchConfigurationName() != null
                && other.getLaunchConfigurationName().equals(
                        this.getLaunchConfigurationName()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null
                && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null
                && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getSecurityGroups() == null
                ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getClassicLinkVPCId() == null
                ^ this.getClassicLinkVPCId() == null)
            return false;
        if (other.getClassicLinkVPCId() != null
                && other.getClassicLinkVPCId().equals(
                        this.getClassicLinkVPCId()) == false)
            return false;
        if (other.getClassicLinkVPCSecurityGroups() == null
                ^ this.getClassicLinkVPCSecurityGroups() == null)
            return false;
        if (other.getClassicLinkVPCSecurityGroups() != null
                && other.getClassicLinkVPCSecurityGroups().equals(
                        this.getClassicLinkVPCSecurityGroups()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null
                && other.getUserData().equals(this.getUserData()) == false)
            return false;
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
        if (other.getBlockDeviceMappings() == null
                ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null
                && other.getBlockDeviceMappings().equals(
                        this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getInstanceMonitoring() == null
                ^ this.getInstanceMonitoring() == null)
            return false;
        if (other.getInstanceMonitoring() != null
                && other.getInstanceMonitoring().equals(
                        this.getInstanceMonitoring()) == false)
            return false;
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null)
            return false;
        if (other.getSpotPrice() != null
                && other.getSpotPrice().equals(this.getSpotPrice()) == false)
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
        if (other.getAssociatePublicIpAddress() == null
                ^ this.getAssociatePublicIpAddress() == null)
            return false;
        if (other.getAssociatePublicIpAddress() != null
                && other.getAssociatePublicIpAddress().equals(
                        this.getAssociatePublicIpAddress()) == false)
            return false;
        if (other.getPlacementTenancy() == null
                ^ this.getPlacementTenancy() == null)
            return false;
        if (other.getPlacementTenancy() != null
                && other.getPlacementTenancy().equals(
                        this.getPlacementTenancy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLaunchConfigurationName() == null) ? 0
                        : getLaunchConfigurationName().hashCode());
        hashCode = prime * hashCode
                + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getClassicLinkVPCId() == null) ? 0 : getClassicLinkVPCId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getClassicLinkVPCSecurityGroups() == null) ? 0
                        : getClassicLinkVPCSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getUserData() == null) ? 0 : getUserData().hashCode());
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
        hashCode = prime
                * hashCode
                + ((getBlockDeviceMappings() == null) ? 0
                        : getBlockDeviceMappings().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceMonitoring() == null) ? 0
                        : getInstanceMonitoring().hashCode());
        hashCode = prime * hashCode
                + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode());
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
                + ((getAssociatePublicIpAddress() == null) ? 0
                        : getAssociatePublicIpAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getPlacementTenancy() == null) ? 0 : getPlacementTenancy()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateLaunchConfigurationRequest clone() {
        return (CreateLaunchConfigurationRequest) super.clone();
    }
}