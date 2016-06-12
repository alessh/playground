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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class CreateReplicationInstanceRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * <p>
     * Example: <code>myrepinstance</code>
     * </p>
     */
    private String replicationInstanceIdentifier;
    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the
     * replication instance.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The compute and memory capacity of the replication instance as specified
     * by the replication instance class.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     */
    private String replicationInstanceClass;
    /**
     * <p>
     * The EC2 Availability Zone that the replication instance will be created
     * in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's
     * region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * A subnet group to associate with the replication instance.
     * </p>
     */
    private String replicationSubnetGroupIdentifier;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Indicates that minor engine upgrades will be applied automatically to the
     * replication instance during the maintenance window.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * Tags to be associated with the replication instance.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The KMS key identifier that will be used to encrypt the content on the
     * replication instance. If you do not specify a value for the KmsKeyId
     * parameter, then AWS DMS will use your default encryption key. AWS KMS
     * creates the default encryption key for your AWS account. Your AWS account
     * has a different default encryption key for each AWS region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * <p>
     * Example: <code>myrepinstance</code>
     * </p>
     * 
     * @param replicationInstanceIdentifier
     *        The replication instance identifier. This parameter is stored as a
     *        lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     *        <li>First character must be a letter.</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *        </ul>
     *        <p>
     *        Example: <code>myrepinstance</code>
     */

    public void setReplicationInstanceIdentifier(
            String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * <p>
     * Example: <code>myrepinstance</code>
     * </p>
     * 
     * @return The replication instance identifier. This parameter is stored as
     *         a lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </li>
     *         <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         </ul>
     *         <p>
     *         Example: <code>myrepinstance</code>
     */

    public String getReplicationInstanceIdentifier() {
        return this.replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * <p>
     * Example: <code>myrepinstance</code>
     * </p>
     * 
     * @param replicationInstanceIdentifier
     *        The replication instance identifier. This parameter is stored as a
     *        lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     *        <li>First character must be a letter.</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *        </ul>
     *        <p>
     *        Example: <code>myrepinstance</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationInstanceRequest withReplicationInstanceIdentifier(
            String replicationInstanceIdentifier) {
        setReplicationInstanceIdentifier(replicationInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the
     * replication instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to be initially allocated for
     *        the replication instance.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the
     * replication instance.
     * </p>
     * 
     * @return The amount of storage (in gigabytes) to be initially allocated
     *         for the replication instance.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the
     * replication instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to be initially allocated for
     *        the replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationInstanceRequest withAllocatedStorage(
            Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as specified
     * by the replication instance class.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance as
     *        specified by the replication instance class. </p>
     *        <p>
     *        Valid Values:
     *        <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     */

    public void setReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as specified
     * by the replication instance class.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @return The compute and memory capacity of the replication instance as
     *         specified by the replication instance class. </p>
     *         <p>
     *         Valid Values:
     *         <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     */

    public String getReplicationInstanceClass() {
        return this.replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as specified
     * by the replication instance class.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance as
     *        specified by the replication instance class. </p>
     *        <p>
     *        Valid Values:
     *        <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationInstanceRequest withReplicationInstanceClass(
            String replicationInstanceClass) {
        setReplicationInstanceClass(replicationInstanceClass);
        return this;
    }

    /**
     * <p>
     * The EC2 Availability Zone that the replication instance will be created
     * in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's
     * region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * 
     * @param availabilityZone
     *        The EC2 Availability Zone that the replication instance will be
     *        created in. </p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the
     *        endpoint's region.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1d</code>
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The EC2 Availability Zone that the replication instance will be created
     * in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's
     * region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * 
     * @return The EC2 Availability Zone that the replication instance will be
     *         created in. </p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone in the
     *         endpoint's region.
     *         </p>
     *         <p>
     *         Example: <code>us-east-1d</code>
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The EC2 Availability Zone that the replication instance will be created
     * in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's
     * region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * 
     * @param availabilityZone
     *        The EC2 Availability Zone that the replication instance will be
     *        created in. </p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the
     *        endpoint's region.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1d</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationInstanceRequest withAvailabilityZone(
            String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * A subnet group to associate with the replication instance.
     * </p>
     * 
     * @param replicationSubnetGroupIdentifier
     *        A subnet group to associate with the replication instance.
     */

    public void setReplicationSubnetGroupIdentifier(
            String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * A subnet group to associate with the replication instance.
     * </p>
     * 
     * @return A subnet group to associate with the replication instance.
     */

    public String getReplicationSubnetGroupIdentifier() {
        return this.replicationSubnetGroupIdentifier;
    }

    /**
     * <p>
     * A subnet group to associate with the replication instance.
     * </p>
     * 
     * @param replicationSubnetGroupIdentifier
     *        A subnet group to associate with the replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationInstanceRequest withReplicationSubnetGroupIdentifier(
            String replicationSubnetGroupIdentifier) {
        setReplicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur,
     *        in Universal Coordinated Time (UTC). </p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        Default: A 30-minute window selected at random from an 8-hour
     *        block of time per region, occurring on a random day of the week.
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur,
     *         in Universal Coordinated Time (UTC). </p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         Default: A 30-minute window selected at random from an 8-hour
     *         block of time per region, occurring on a random day of the week.
     *         </p>
     *         <p>
     *         Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         </p>
     *         <p>
     *         Constraints: Minimum 30-minute window.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of
     * time per region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur,
     *        in Universal Coordinated Time (UTC). </p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        Default: A 30-minute window selected at random from an 8-hour
     *        block of time per region, occurring on a random day of the week.
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationInstanceRequest withPreferredMaintenanceWindow(
            String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
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

    public CreateReplicationInstanceRequest withEngineVersion(
            String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades will be applied automatically to the
     * replication instance during the maintenance window.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor engine upgrades will be applied automatically
     *        to the replication instance during the maintenance window. </p>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades will be applied automatically to the
     * replication instance during the maintenance window.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Indicates that minor engine upgrades will be applied
     *         automatically to the replication instance during the maintenance
     *         window. </p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades will be applied automatically to the
     * replication instance during the maintenance window.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor engine upgrades will be applied automatically
     *        to the replication instance during the maintenance window. </p>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationInstanceRequest withAutoMinorVersionUpgrade(
            Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades will be applied automatically to the
     * replication instance during the maintenance window.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Indicates that minor engine upgrades will be applied
     *         automatically to the replication instance during the maintenance
     *         window. </p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Tags to be associated with the replication instance.
     * </p>
     * 
     * @return Tags to be associated with the replication instance.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to be associated with the replication instance.
     * </p>
     * 
     * @param tags
     *        Tags to be associated with the replication instance.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags to be associated with the replication instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or
     * {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to be associated with the replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationInstanceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to be associated with the replication instance.
     * </p>
     * 
     * @param tags
     *        Tags to be associated with the replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationInstanceRequest withTags(
            java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The KMS key identifier that will be used to encrypt the content on the
     * replication instance. If you do not specify a value for the KmsKeyId
     * parameter, then AWS DMS will use your default encryption key. AWS KMS
     * creates the default encryption key for your AWS account. Your AWS account
     * has a different default encryption key for each AWS region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier that will be used to encrypt the content on
     *        the replication instance. If you do not specify a value for the
     *        KmsKeyId parameter, then AWS DMS will use your default encryption
     *        key. AWS KMS creates the default encryption key for your AWS
     *        account. Your AWS account has a different default encryption key
     *        for each AWS region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier that will be used to encrypt the content on the
     * replication instance. If you do not specify a value for the KmsKeyId
     * parameter, then AWS DMS will use your default encryption key. AWS KMS
     * creates the default encryption key for your AWS account. Your AWS account
     * has a different default encryption key for each AWS region.
     * </p>
     * 
     * @return The KMS key identifier that will be used to encrypt the content
     *         on the replication instance. If you do not specify a value for
     *         the KmsKeyId parameter, then AWS DMS will use your default
     *         encryption key. AWS KMS creates the default encryption key for
     *         your AWS account. Your AWS account has a different default
     *         encryption key for each AWS region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier that will be used to encrypt the content on the
     * replication instance. If you do not specify a value for the KmsKeyId
     * parameter, then AWS DMS will use your default encryption key. AWS KMS
     * creates the default encryption key for your AWS account. Your AWS account
     * has a different default encryption key for each AWS region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier that will be used to encrypt the content on
     *        the replication instance. If you do not specify a value for the
     *        KmsKeyId parameter, then AWS DMS will use your default encryption
     *        key. AWS KMS creates the default encryption key for your AWS
     *        account. Your AWS account has a different default encryption key
     *        for each AWS region.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationInstanceRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the replication instance.
     *        A value of <code>true</code> represents an instance with a public
     *        IP address. A value of <code>false</code> represents an instance
     *        with a private IP address. The default value is <code>true</code>.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies the accessibility options for the replication instance.
     *         A value of <code>true</code> represents an instance with a public
     *         IP address. A value of <code>false</code> represents an instance
     *         with a private IP address. The default value is <code>true</code>
     *         .
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the replication instance.
     *        A value of <code>true</code> represents an instance with a public
     *        IP address. A value of <code>false</code> represents an instance
     *        with a private IP address. The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateReplicationInstanceRequest withPubliclyAccessible(
            Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies the accessibility options for the replication instance.
     *         A value of <code>true</code> represents an instance with a public
     *         IP address. A value of <code>false</code> represents an instance
     *         with a private IP address. The default value is <code>true</code>
     *         .
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
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
        if (getReplicationInstanceIdentifier() != null)
            sb.append("ReplicationInstanceIdentifier: "
                    + getReplicationInstanceIdentifier() + ",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getReplicationInstanceClass() != null)
            sb.append("ReplicationInstanceClass: "
                    + getReplicationInstanceClass() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getReplicationSubnetGroupIdentifier() != null)
            sb.append("ReplicationSubnetGroupIdentifier: "
                    + getReplicationSubnetGroupIdentifier() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: "
                    + getPreferredMaintenanceWindow() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: "
                    + getAutoMinorVersionUpgrade() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplicationInstanceRequest == false)
            return false;
        CreateReplicationInstanceRequest other = (CreateReplicationInstanceRequest) obj;
        if (other.getReplicationInstanceIdentifier() == null
                ^ this.getReplicationInstanceIdentifier() == null)
            return false;
        if (other.getReplicationInstanceIdentifier() != null
                && other.getReplicationInstanceIdentifier().equals(
                        this.getReplicationInstanceIdentifier()) == false)
            return false;
        if (other.getAllocatedStorage() == null
                ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(
                        this.getAllocatedStorage()) == false)
            return false;
        if (other.getReplicationInstanceClass() == null
                ^ this.getReplicationInstanceClass() == null)
            return false;
        if (other.getReplicationInstanceClass() != null
                && other.getReplicationInstanceClass().equals(
                        this.getReplicationInstanceClass()) == false)
            return false;
        if (other.getAvailabilityZone() == null
                ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(
                        this.getAvailabilityZone()) == false)
            return false;
        if (other.getReplicationSubnetGroupIdentifier() == null
                ^ this.getReplicationSubnetGroupIdentifier() == null)
            return false;
        if (other.getReplicationSubnetGroupIdentifier() != null
                && other.getReplicationSubnetGroupIdentifier().equals(
                        this.getReplicationSubnetGroupIdentifier()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null
                ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null
                && other.getAutoMinorVersionUpgrade().equals(
                        this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null
                && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null
                && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPubliclyAccessible() == null
                ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(
                        this.getPubliclyAccessible()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationInstanceIdentifier() == null) ? 0
                        : getReplicationInstanceIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceClass() == null) ? 0
                        : getReplicationInstanceClass().hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationSubnetGroupIdentifier() == null) ? 0
                        : getReplicationSubnetGroupIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0
                        : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMinorVersionUpgrade() == null) ? 0
                        : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode
                + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getPubliclyAccessible() == null) ? 0
                        : getPubliclyAccessible().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicationInstanceRequest clone() {
        return (CreateReplicationInstanceRequest) super.clone();
    }
}