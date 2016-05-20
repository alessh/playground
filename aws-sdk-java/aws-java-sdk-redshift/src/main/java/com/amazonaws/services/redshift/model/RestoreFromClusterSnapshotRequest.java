/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest) RestoreFromClusterSnapshot operation}.
 * <p>
 * Creates a new cluster from a snapshot. By default, Amazon Redshift
 * creates the resulting cluster with the same configuration as the
 * original cluster from which the snapshot was created, except that the
 * new cluster is created with the default cluster security and parameter
 * groups. After Amazon Redshift creates the cluster, you can use the
 * ModifyCluster API to associate a different security group and
 * different parameter group with the restored cluster. If you are using
 * a DS node type, you can also choose to change to another DS node type
 * of the same size during restore.
 * </p>
 * <p>
 * If you restore a cluster into a VPC, you must provide a cluster
 * subnet group where you want the cluster restored.
 * </p>
 * <p>
 * For more information about working with snapshots, go to
 * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html"> Amazon Redshift Snapshots </a>
 * in the <i>Amazon Redshift Cluster Management Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest)
 */
public class RestoreFromClusterSnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the cluster that will be created from restoring the
     * snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     * must be lowercase.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li> </ul>
     */
    private String clusterIdentifier;

    /**
     * The name of the snapshot from which to create the new cluster. This
     * parameter isn't case sensitive. <p>Example:
     * <code>my-snapshot-id</code>
     */
    private String snapshotIdentifier;

    /**
     * The name of the cluster the source snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name.
     */
    private String snapshotClusterIdentifier;

    /**
     * The port number on which the cluster accepts connections. <p>Default:
     * The same port as the original cluster. <p>Constraints: Must be between
     * <code>1115</code> and <code>65535</code>.
     */
    private Integer port;

    /**
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * <p>Default: A random, system-chosen Availability Zone. <p>Example:
     * <code>us-east-1a</code>
     */
    private String availabilityZone;

    /**
     * If <code>true</code>, major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on
     * the cluster. <p>Default: <code>true</code>
     */
    private Boolean allowVersionUpgrade;

    /**
     * The name of the subnet group where you want to cluster restored. <p> A
     * snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     * must provide subnet group name where you want the cluster restored.
     */
    private String clusterSubnetGroupName;

    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     */
    private Boolean publiclyAccessible;

    /**
     * The AWS customer account used to create or copy the snapshot. Required
     * if you are restoring a snapshot you do not own, optional if you own
     * the snapshot.
     */
    private String ownerAccount;

    /**
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     */
    private String hsmClientCertificateIdentifier;

    /**
     * Specifies the name of the HSM configuration that contains the
     * information the Amazon Redshift cluster can use to retrieve and store
     * keys in an HSM.
     */
    private String hsmConfigurationIdentifier;

    /**
     * The elastic IP (EIP) address for the cluster.
     */
    private String elasticIp;

    /**
     * The name of the parameter group to be associated with this cluster.
     * <p>Default: The default Amazon Redshift cluster parameter group. For
     * information about the default parameter group, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     * with Amazon Redshift Parameter Groups</a>. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul>
     */
    private String clusterParameterGroupName;

    /**
     * A list of security groups to be associated with this cluster. <p>
     * Default: The default cluster security group for Amazon Redshift.
     * <p>Cluster security groups only apply to clusters outside of VPCs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> clusterSecurityGroups;

    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster. <p> Default: The default VPC security group is
     * associated with the cluster. <p> VPC security groups only apply to
     * clusters in VPCs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIds;

    /**
     * The weekly time range (in UTC) during which automated cluster
     * maintenance can occur. <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: The value selected
     * for the cluster from which the snapshot was taken. For more
     * information about the time blocks for each region, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows">Maintenance
     * Windows</a> in Amazon Redshift Cluster Management Guide. <p>Valid
     * Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints: Minimum
     * 30-minute window.
     */
    private String preferredMaintenanceWindow;

    /**
     * The number of days that automated snapshots are retained. If the value
     * is 0, automated snapshots are disabled. Even if automated snapshots
     * are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>. <p> Default: The value selected for the
     * cluster from which the snapshot was taken. <p>Constraints: Must be a
     * value from 0 to 35.
     */
    private Integer automatedSnapshotRetentionPeriod;

    /**
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * you want to use to encrypt data in the cluster that you restore from a
     * shared snapshot.
     */
    private String kmsKeyId;

    /**
     * The node type that the restored cluster will be provisioned with. <p>
     * Default: The node type of the cluster from which the snapshot was
     * taken. You can modify this if you are using any DS node type. In that
     * case, you can choose to restore into another DS node type of the same
     * size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or
     * ds2.xlarge into ds1.xlarge. If you have a DC instance type, you must
     * restore into that same instance type and size. In other words, you can
     * only restore a dc1.large instance type into another dc1.large instance
     * type. For more information about node types, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     * About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>
     */
    private String nodeType;

    /**
     * Reserved.
     */
    private String additionalInfo;

    /**
     * A list of AWS Identity and Access Management (IAM) roles that can be
     * used by the cluster to access other AWS services. You must supply the
     * IAM roles in their Amazon Resource Name (ARN) format. You can supply
     * up to 10 IAM roles in a single request. <p>A cluster can have up to 10
     * IAM roles associated at any time.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> iamRoles;

    /**
     * The identifier of the cluster that will be created from restoring the
     * snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     * must be lowercase.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li> </ul>
     *
     * @return The identifier of the cluster that will be created from restoring the
     *         snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     *         must be lowercase.</li> <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         <li>Must be unique for all clusters within an AWS account.</li> </ul>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster that will be created from restoring the
     * snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     * must be lowercase.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li> </ul>
     *
     * @param clusterIdentifier The identifier of the cluster that will be created from restoring the
     *         snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     *         must be lowercase.</li> <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         <li>Must be unique for all clusters within an AWS account.</li> </ul>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster that will be created from restoring the
     * snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     * must be lowercase.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The identifier of the cluster that will be created from restoring the
     *         snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     *         must be lowercase.</li> <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         <li>Must be unique for all clusters within an AWS account.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The name of the snapshot from which to create the new cluster. This
     * parameter isn't case sensitive. <p>Example:
     * <code>my-snapshot-id</code>
     *
     * @return The name of the snapshot from which to create the new cluster. This
     *         parameter isn't case sensitive. <p>Example:
     *         <code>my-snapshot-id</code>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }
    
    /**
     * The name of the snapshot from which to create the new cluster. This
     * parameter isn't case sensitive. <p>Example:
     * <code>my-snapshot-id</code>
     *
     * @param snapshotIdentifier The name of the snapshot from which to create the new cluster. This
     *         parameter isn't case sensitive. <p>Example:
     *         <code>my-snapshot-id</code>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }
    
    /**
     * The name of the snapshot from which to create the new cluster. This
     * parameter isn't case sensitive. <p>Example:
     * <code>my-snapshot-id</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIdentifier The name of the snapshot from which to create the new cluster. This
     *         parameter isn't case sensitive. <p>Example:
     *         <code>my-snapshot-id</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * The name of the cluster the source snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name.
     *
     * @return The name of the cluster the source snapshot was created from. This
     *         parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than * for the
     *         cluster name.
     */
    public String getSnapshotClusterIdentifier() {
        return snapshotClusterIdentifier;
    }
    
    /**
     * The name of the cluster the source snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name.
     *
     * @param snapshotClusterIdentifier The name of the cluster the source snapshot was created from. This
     *         parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than * for the
     *         cluster name.
     */
    public void setSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }
    
    /**
     * The name of the cluster the source snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotClusterIdentifier The name of the cluster the source snapshot was created from. This
     *         parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than * for the
     *         cluster name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
        return this;
    }

    /**
     * The port number on which the cluster accepts connections. <p>Default:
     * The same port as the original cluster. <p>Constraints: Must be between
     * <code>1115</code> and <code>65535</code>.
     *
     * @return The port number on which the cluster accepts connections. <p>Default:
     *         The same port as the original cluster. <p>Constraints: Must be between
     *         <code>1115</code> and <code>65535</code>.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the cluster accepts connections. <p>Default:
     * The same port as the original cluster. <p>Constraints: Must be between
     * <code>1115</code> and <code>65535</code>.
     *
     * @param port The port number on which the cluster accepts connections. <p>Default:
     *         The same port as the original cluster. <p>Constraints: Must be between
     *         <code>1115</code> and <code>65535</code>.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the cluster accepts connections. <p>Default:
     * The same port as the original cluster. <p>Constraints: Must be between
     * <code>1115</code> and <code>65535</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the cluster accepts connections. <p>Default:
     *         The same port as the original cluster. <p>Constraints: Must be between
     *         <code>1115</code> and <code>65535</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * <p>Default: A random, system-chosen Availability Zone. <p>Example:
     * <code>us-east-1a</code>
     *
     * @return The Amazon EC2 Availability Zone in which to restore the cluster.
     *         <p>Default: A random, system-chosen Availability Zone. <p>Example:
     *         <code>us-east-1a</code>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * <p>Default: A random, system-chosen Availability Zone. <p>Example:
     * <code>us-east-1a</code>
     *
     * @param availabilityZone The Amazon EC2 Availability Zone in which to restore the cluster.
     *         <p>Default: A random, system-chosen Availability Zone. <p>Example:
     *         <code>us-east-1a</code>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * <p>Default: A random, system-chosen Availability Zone. <p>Example:
     * <code>us-east-1a</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Amazon EC2 Availability Zone in which to restore the cluster.
     *         <p>Default: A random, system-chosen Availability Zone. <p>Example:
     *         <code>us-east-1a</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * If <code>true</code>, major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on
     * the cluster. <p>Default: <code>true</code>
     *
     * @return If <code>true</code>, major version upgrades can be applied during the
     *         maintenance window to the Amazon Redshift engine that is running on
     *         the cluster. <p>Default: <code>true</code>
     */
    public Boolean isAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on
     * the cluster. <p>Default: <code>true</code>
     *
     * @param allowVersionUpgrade If <code>true</code>, major version upgrades can be applied during the
     *         maintenance window to the Amazon Redshift engine that is running on
     *         the cluster. <p>Default: <code>true</code>
     */
    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on
     * the cluster. <p>Default: <code>true</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowVersionUpgrade If <code>true</code>, major version upgrades can be applied during the
     *         maintenance window to the Amazon Redshift engine that is running on
     *         the cluster. <p>Default: <code>true</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
        return this;
    }

    /**
     * If <code>true</code>, major version upgrades can be applied during the
     * maintenance window to the Amazon Redshift engine that is running on
     * the cluster. <p>Default: <code>true</code>
     *
     * @return If <code>true</code>, major version upgrades can be applied during the
     *         maintenance window to the Amazon Redshift engine that is running on
     *         the cluster. <p>Default: <code>true</code>
     */
    public Boolean getAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }

    /**
     * The name of the subnet group where you want to cluster restored. <p> A
     * snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     * must provide subnet group name where you want the cluster restored.
     *
     * @return The name of the subnet group where you want to cluster restored. <p> A
     *         snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     *         must provide subnet group name where you want the cluster restored.
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }
    
    /**
     * The name of the subnet group where you want to cluster restored. <p> A
     * snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     * must provide subnet group name where you want the cluster restored.
     *
     * @param clusterSubnetGroupName The name of the subnet group where you want to cluster restored. <p> A
     *         snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     *         must provide subnet group name where you want the cluster restored.
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }
    
    /**
     * The name of the subnet group where you want to cluster restored. <p> A
     * snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     * must provide subnet group name where you want the cluster restored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSubnetGroupName The name of the subnet group where you want to cluster restored. <p> A
     *         snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     *         must provide subnet group name where you want the cluster restored.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     *
     * @return If <code>true</code>, the cluster can be accessed from a public
     *         network.
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }
    
    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     *
     * @param publiclyAccessible If <code>true</code>, the cluster can be accessed from a public
     *         network.
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }
    
    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publiclyAccessible If <code>true</code>, the cluster can be accessed from a public
     *         network.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     *
     * @return If <code>true</code>, the cluster can be accessed from a public
     *         network.
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * The AWS customer account used to create or copy the snapshot. Required
     * if you are restoring a snapshot you do not own, optional if you own
     * the snapshot.
     *
     * @return The AWS customer account used to create or copy the snapshot. Required
     *         if you are restoring a snapshot you do not own, optional if you own
     *         the snapshot.
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }
    
    /**
     * The AWS customer account used to create or copy the snapshot. Required
     * if you are restoring a snapshot you do not own, optional if you own
     * the snapshot.
     *
     * @param ownerAccount The AWS customer account used to create or copy the snapshot. Required
     *         if you are restoring a snapshot you do not own, optional if you own
     *         the snapshot.
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }
    
    /**
     * The AWS customer account used to create or copy the snapshot. Required
     * if you are restoring a snapshot you do not own, optional if you own
     * the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerAccount The AWS customer account used to create or copy the snapshot. Required
     *         if you are restoring a snapshot you do not own, optional if you own
     *         the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     *
     * @return Specifies the name of the HSM client certificate the Amazon Redshift
     *         cluster uses to retrieve the data encryption keys stored in an HSM.
     */
    public String getHsmClientCertificateIdentifier() {
        return hsmClientCertificateIdentifier;
    }
    
    /**
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     *
     * @param hsmClientCertificateIdentifier Specifies the name of the HSM client certificate the Amazon Redshift
     *         cluster uses to retrieve the data encryption keys stored in an HSM.
     */
    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }
    
    /**
     * Specifies the name of the HSM client certificate the Amazon Redshift
     * cluster uses to retrieve the data encryption keys stored in an HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmClientCertificateIdentifier Specifies the name of the HSM client certificate the Amazon Redshift
     *         cluster uses to retrieve the data encryption keys stored in an HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
        return this;
    }

    /**
     * Specifies the name of the HSM configuration that contains the
     * information the Amazon Redshift cluster can use to retrieve and store
     * keys in an HSM.
     *
     * @return Specifies the name of the HSM configuration that contains the
     *         information the Amazon Redshift cluster can use to retrieve and store
     *         keys in an HSM.
     */
    public String getHsmConfigurationIdentifier() {
        return hsmConfigurationIdentifier;
    }
    
    /**
     * Specifies the name of the HSM configuration that contains the
     * information the Amazon Redshift cluster can use to retrieve and store
     * keys in an HSM.
     *
     * @param hsmConfigurationIdentifier Specifies the name of the HSM configuration that contains the
     *         information the Amazon Redshift cluster can use to retrieve and store
     *         keys in an HSM.
     */
    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }
    
    /**
     * Specifies the name of the HSM configuration that contains the
     * information the Amazon Redshift cluster can use to retrieve and store
     * keys in an HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmConfigurationIdentifier Specifies the name of the HSM configuration that contains the
     *         information the Amazon Redshift cluster can use to retrieve and store
     *         keys in an HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
        return this;
    }

    /**
     * The elastic IP (EIP) address for the cluster.
     *
     * @return The elastic IP (EIP) address for the cluster.
     */
    public String getElasticIp() {
        return elasticIp;
    }
    
    /**
     * The elastic IP (EIP) address for the cluster.
     *
     * @param elasticIp The elastic IP (EIP) address for the cluster.
     */
    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }
    
    /**
     * The elastic IP (EIP) address for the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticIp The elastic IP (EIP) address for the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * The name of the parameter group to be associated with this cluster.
     * <p>Default: The default Amazon Redshift cluster parameter group. For
     * information about the default parameter group, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     * with Amazon Redshift Parameter Groups</a>. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul>
     *
     * @return The name of the parameter group to be associated with this cluster.
     *         <p>Default: The default Amazon Redshift cluster parameter group. For
     *         information about the default parameter group, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     *         with Amazon Redshift Parameter Groups</a>. <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     *         <li>First character must be a letter.</li> <li>Cannot end with a
     *         hyphen or contain two consecutive hyphens.</li> </ul>
     */
    public String getClusterParameterGroupName() {
        return clusterParameterGroupName;
    }
    
    /**
     * The name of the parameter group to be associated with this cluster.
     * <p>Default: The default Amazon Redshift cluster parameter group. For
     * information about the default parameter group, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     * with Amazon Redshift Parameter Groups</a>. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul>
     *
     * @param clusterParameterGroupName The name of the parameter group to be associated with this cluster.
     *         <p>Default: The default Amazon Redshift cluster parameter group. For
     *         information about the default parameter group, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     *         with Amazon Redshift Parameter Groups</a>. <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     *         <li>First character must be a letter.</li> <li>Cannot end with a
     *         hyphen or contain two consecutive hyphens.</li> </ul>
     */
    public void setClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
    }
    
    /**
     * The name of the parameter group to be associated with this cluster.
     * <p>Default: The default Amazon Redshift cluster parameter group. For
     * information about the default parameter group, go to <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     * with Amazon Redshift Parameter Groups</a>. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterParameterGroupName The name of the parameter group to be associated with this cluster.
     *         <p>Default: The default Amazon Redshift cluster parameter group. For
     *         information about the default parameter group, go to <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Working
     *         with Amazon Redshift Parameter Groups</a>. <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters or hyphens.</li>
     *         <li>First character must be a letter.</li> <li>Cannot end with a
     *         hyphen or contain two consecutive hyphens.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withClusterParameterGroupName(String clusterParameterGroupName) {
        this.clusterParameterGroupName = clusterParameterGroupName;
        return this;
    }

    /**
     * A list of security groups to be associated with this cluster. <p>
     * Default: The default cluster security group for Amazon Redshift.
     * <p>Cluster security groups only apply to clusters outside of VPCs.
     *
     * @return A list of security groups to be associated with this cluster. <p>
     *         Default: The default cluster security group for Amazon Redshift.
     *         <p>Cluster security groups only apply to clusters outside of VPCs.
     */
    public java.util.List<String> getClusterSecurityGroups() {
        if (clusterSecurityGroups == null) {
              clusterSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              clusterSecurityGroups.setAutoConstruct(true);
        }
        return clusterSecurityGroups;
    }
    
    /**
     * A list of security groups to be associated with this cluster. <p>
     * Default: The default cluster security group for Amazon Redshift.
     * <p>Cluster security groups only apply to clusters outside of VPCs.
     *
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster. <p>
     *         Default: The default cluster security group for Amazon Redshift.
     *         <p>Cluster security groups only apply to clusters outside of VPCs.
     */
    public void setClusterSecurityGroups(java.util.Collection<String> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> clusterSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clusterSecurityGroups.size());
        clusterSecurityGroupsCopy.addAll(clusterSecurityGroups);
        this.clusterSecurityGroups = clusterSecurityGroupsCopy;
    }
    
    /**
     * A list of security groups to be associated with this cluster. <p>
     * Default: The default cluster security group for Amazon Redshift.
     * <p>Cluster security groups only apply to clusters outside of VPCs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setClusterSecurityGroups(java.util.Collection)} or
     * {@link #withClusterSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster. <p>
     *         Default: The default cluster security group for Amazon Redshift.
     *         <p>Cluster security groups only apply to clusters outside of VPCs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withClusterSecurityGroups(String... clusterSecurityGroups) {
        if (getClusterSecurityGroups() == null) setClusterSecurityGroups(new java.util.ArrayList<String>(clusterSecurityGroups.length));
        for (String value : clusterSecurityGroups) {
            getClusterSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of security groups to be associated with this cluster. <p>
     * Default: The default cluster security group for Amazon Redshift.
     * <p>Cluster security groups only apply to clusters outside of VPCs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSecurityGroups A list of security groups to be associated with this cluster. <p>
     *         Default: The default cluster security group for Amazon Redshift.
     *         <p>Cluster security groups only apply to clusters outside of VPCs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withClusterSecurityGroups(java.util.Collection<String> clusterSecurityGroups) {
        if (clusterSecurityGroups == null) {
            this.clusterSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> clusterSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clusterSecurityGroups.size());
            clusterSecurityGroupsCopy.addAll(clusterSecurityGroups);
            this.clusterSecurityGroups = clusterSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster. <p> Default: The default VPC security group is
     * associated with the cluster. <p> VPC security groups only apply to
     * clusters in VPCs.
     *
     * @return A list of Virtual Private Cloud (VPC) security groups to be associated
     *         with the cluster. <p> Default: The default VPC security group is
     *         associated with the cluster. <p> VPC security groups only apply to
     *         clusters in VPCs.
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
              vpcSecurityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcSecurityGroupIds.setAutoConstruct(true);
        }
        return vpcSecurityGroupIds;
    }
    
    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster. <p> Default: The default VPC security group is
     * associated with the cluster. <p> VPC security groups only apply to
     * clusters in VPCs.
     *
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be associated
     *         with the cluster. <p> Default: The default VPC security group is
     *         associated with the cluster. <p> VPC security groups only apply to
     *         clusters in VPCs.
     */
    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcSecurityGroupIds.size());
        vpcSecurityGroupIdsCopy.addAll(vpcSecurityGroupIds);
        this.vpcSecurityGroupIds = vpcSecurityGroupIdsCopy;
    }
    
    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster. <p> Default: The default VPC security group is
     * associated with the cluster. <p> VPC security groups only apply to
     * clusters in VPCs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcSecurityGroupIds(java.util.Collection)} or
     * {@link #withVpcSecurityGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be associated
     *         with the cluster. <p> Default: The default VPC security group is
     *         associated with the cluster. <p> VPC security groups only apply to
     *         clusters in VPCs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        for (String value : vpcSecurityGroupIds) {
            getVpcSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of Virtual Private Cloud (VPC) security groups to be associated
     * with the cluster. <p> Default: The default VPC security group is
     * associated with the cluster. <p> VPC security groups only apply to
     * clusters in VPCs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of Virtual Private Cloud (VPC) security groups to be associated
     *         with the cluster. <p> Default: The default VPC security group is
     *         associated with the cluster. <p> VPC security groups only apply to
     *         clusters in VPCs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcSecurityGroupIds.size());
            vpcSecurityGroupIdsCopy.addAll(vpcSecurityGroupIds);
            this.vpcSecurityGroupIds = vpcSecurityGroupIdsCopy;
        }

        return this;
    }

    /**
     * The weekly time range (in UTC) during which automated cluster
     * maintenance can occur. <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: The value selected
     * for the cluster from which the snapshot was taken. For more
     * information about the time blocks for each region, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows">Maintenance
     * Windows</a> in Amazon Redshift Cluster Management Guide. <p>Valid
     * Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints: Minimum
     * 30-minute window.
     *
     * @return The weekly time range (in UTC) during which automated cluster
     *         maintenance can occur. <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: The value selected
     *         for the cluster from which the snapshot was taken. For more
     *         information about the time blocks for each region, see <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows">Maintenance
     *         Windows</a> in Amazon Redshift Cluster Management Guide. <p>Valid
     *         Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints: Minimum
     *         30-minute window.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which automated cluster
     * maintenance can occur. <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: The value selected
     * for the cluster from which the snapshot was taken. For more
     * information about the time blocks for each region, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows">Maintenance
     * Windows</a> in Amazon Redshift Cluster Management Guide. <p>Valid
     * Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints: Minimum
     * 30-minute window.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which automated cluster
     *         maintenance can occur. <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: The value selected
     *         for the cluster from which the snapshot was taken. For more
     *         information about the time blocks for each region, see <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows">Maintenance
     *         Windows</a> in Amazon Redshift Cluster Management Guide. <p>Valid
     *         Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints: Minimum
     *         30-minute window.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which automated cluster
     * maintenance can occur. <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: The value selected
     * for the cluster from which the snapshot was taken. For more
     * information about the time blocks for each region, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows">Maintenance
     * Windows</a> in Amazon Redshift Cluster Management Guide. <p>Valid
     * Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints: Minimum
     * 30-minute window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which automated cluster
     *         maintenance can occur. <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: The value selected
     *         for the cluster from which the snapshot was taken. For more
     *         information about the time blocks for each region, see <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-maintenance-windows">Maintenance
     *         Windows</a> in Amazon Redshift Cluster Management Guide. <p>Valid
     *         Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints: Minimum
     *         30-minute window.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * The number of days that automated snapshots are retained. If the value
     * is 0, automated snapshots are disabled. Even if automated snapshots
     * are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>. <p> Default: The value selected for the
     * cluster from which the snapshot was taken. <p>Constraints: Must be a
     * value from 0 to 35.
     *
     * @return The number of days that automated snapshots are retained. If the value
     *         is 0, automated snapshots are disabled. Even if automated snapshots
     *         are disabled, you can still create manual snapshots when you want with
     *         <a>CreateClusterSnapshot</a>. <p> Default: The value selected for the
     *         cluster from which the snapshot was taken. <p>Constraints: Must be a
     *         value from 0 to 35.
     */
    public Integer getAutomatedSnapshotRetentionPeriod() {
        return automatedSnapshotRetentionPeriod;
    }
    
    /**
     * The number of days that automated snapshots are retained. If the value
     * is 0, automated snapshots are disabled. Even if automated snapshots
     * are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>. <p> Default: The value selected for the
     * cluster from which the snapshot was taken. <p>Constraints: Must be a
     * value from 0 to 35.
     *
     * @param automatedSnapshotRetentionPeriod The number of days that automated snapshots are retained. If the value
     *         is 0, automated snapshots are disabled. Even if automated snapshots
     *         are disabled, you can still create manual snapshots when you want with
     *         <a>CreateClusterSnapshot</a>. <p> Default: The value selected for the
     *         cluster from which the snapshot was taken. <p>Constraints: Must be a
     *         value from 0 to 35.
     */
    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }
    
    /**
     * The number of days that automated snapshots are retained. If the value
     * is 0, automated snapshots are disabled. Even if automated snapshots
     * are disabled, you can still create manual snapshots when you want with
     * <a>CreateClusterSnapshot</a>. <p> Default: The value selected for the
     * cluster from which the snapshot was taken. <p>Constraints: Must be a
     * value from 0 to 35.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param automatedSnapshotRetentionPeriod The number of days that automated snapshots are retained. If the value
     *         is 0, automated snapshots are disabled. Even if automated snapshots
     *         are disabled, you can still create manual snapshots when you want with
     *         <a>CreateClusterSnapshot</a>. <p> Default: The value selected for the
     *         cluster from which the snapshot was taken. <p>Constraints: Must be a
     *         value from 0 to 35.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
        return this;
    }

    /**
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * you want to use to encrypt data in the cluster that you restore from a
     * shared snapshot.
     *
     * @return The AWS Key Management Service (KMS) key ID of the encryption key that
     *         you want to use to encrypt data in the cluster that you restore from a
     *         shared snapshot.
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    
    /**
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * you want to use to encrypt data in the cluster that you restore from a
     * shared snapshot.
     *
     * @param kmsKeyId The AWS Key Management Service (KMS) key ID of the encryption key that
     *         you want to use to encrypt data in the cluster that you restore from a
     *         shared snapshot.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }
    
    /**
     * The AWS Key Management Service (KMS) key ID of the encryption key that
     * you want to use to encrypt data in the cluster that you restore from a
     * shared snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyId The AWS Key Management Service (KMS) key ID of the encryption key that
     *         you want to use to encrypt data in the cluster that you restore from a
     *         shared snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * The node type that the restored cluster will be provisioned with. <p>
     * Default: The node type of the cluster from which the snapshot was
     * taken. You can modify this if you are using any DS node type. In that
     * case, you can choose to restore into another DS node type of the same
     * size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or
     * ds2.xlarge into ds1.xlarge. If you have a DC instance type, you must
     * restore into that same instance type and size. In other words, you can
     * only restore a dc1.large instance type into another dc1.large instance
     * type. For more information about node types, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     * About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>
     *
     * @return The node type that the restored cluster will be provisioned with. <p>
     *         Default: The node type of the cluster from which the snapshot was
     *         taken. You can modify this if you are using any DS node type. In that
     *         case, you can choose to restore into another DS node type of the same
     *         size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or
     *         ds2.xlarge into ds1.xlarge. If you have a DC instance type, you must
     *         restore into that same instance type and size. In other words, you can
     *         only restore a dc1.large instance type into another dc1.large instance
     *         type. For more information about node types, see <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     *         About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster
     *         Management Guide</i>
     */
    public String getNodeType() {
        return nodeType;
    }
    
    /**
     * The node type that the restored cluster will be provisioned with. <p>
     * Default: The node type of the cluster from which the snapshot was
     * taken. You can modify this if you are using any DS node type. In that
     * case, you can choose to restore into another DS node type of the same
     * size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or
     * ds2.xlarge into ds1.xlarge. If you have a DC instance type, you must
     * restore into that same instance type and size. In other words, you can
     * only restore a dc1.large instance type into another dc1.large instance
     * type. For more information about node types, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     * About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>
     *
     * @param nodeType The node type that the restored cluster will be provisioned with. <p>
     *         Default: The node type of the cluster from which the snapshot was
     *         taken. You can modify this if you are using any DS node type. In that
     *         case, you can choose to restore into another DS node type of the same
     *         size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or
     *         ds2.xlarge into ds1.xlarge. If you have a DC instance type, you must
     *         restore into that same instance type and size. In other words, you can
     *         only restore a dc1.large instance type into another dc1.large instance
     *         type. For more information about node types, see <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     *         About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster
     *         Management Guide</i>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }
    
    /**
     * The node type that the restored cluster will be provisioned with. <p>
     * Default: The node type of the cluster from which the snapshot was
     * taken. You can modify this if you are using any DS node type. In that
     * case, you can choose to restore into another DS node type of the same
     * size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or
     * ds2.xlarge into ds1.xlarge. If you have a DC instance type, you must
     * restore into that same instance type and size. In other words, you can
     * only restore a dc1.large instance type into another dc1.large instance
     * type. For more information about node types, see <a
     * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     * About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeType The node type that the restored cluster will be provisioned with. <p>
     *         Default: The node type of the cluster from which the snapshot was
     *         taken. You can modify this if you are using any DS node type. In that
     *         case, you can choose to restore into another DS node type of the same
     *         size. For example, you can restore ds1.8xlarge into ds2.8xlarge, or
     *         ds2.xlarge into ds1.xlarge. If you have a DC instance type, you must
     *         restore into that same instance type and size. In other words, you can
     *         only restore a dc1.large instance type into another dc1.large instance
     *         type. For more information about node types, see <a
     *         href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html#rs-about-clusters-and-nodes">
     *         About Clusters and Nodes</a> in the <i>Amazon Redshift Cluster
     *         Management Guide</i>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * Reserved.
     *
     * @return Reserved.
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    
    /**
     * Reserved.
     *
     * @param additionalInfo Reserved.
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    /**
     * Reserved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalInfo Reserved.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * A list of AWS Identity and Access Management (IAM) roles that can be
     * used by the cluster to access other AWS services. You must supply the
     * IAM roles in their Amazon Resource Name (ARN) format. You can supply
     * up to 10 IAM roles in a single request. <p>A cluster can have up to 10
     * IAM roles associated at any time.
     *
     * @return A list of AWS Identity and Access Management (IAM) roles that can be
     *         used by the cluster to access other AWS services. You must supply the
     *         IAM roles in their Amazon Resource Name (ARN) format. You can supply
     *         up to 10 IAM roles in a single request. <p>A cluster can have up to 10
     *         IAM roles associated at any time.
     */
    public java.util.List<String> getIamRoles() {
        if (iamRoles == null) {
              iamRoles = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              iamRoles.setAutoConstruct(true);
        }
        return iamRoles;
    }
    
    /**
     * A list of AWS Identity and Access Management (IAM) roles that can be
     * used by the cluster to access other AWS services. You must supply the
     * IAM roles in their Amazon Resource Name (ARN) format. You can supply
     * up to 10 IAM roles in a single request. <p>A cluster can have up to 10
     * IAM roles associated at any time.
     *
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be
     *         used by the cluster to access other AWS services. You must supply the
     *         IAM roles in their Amazon Resource Name (ARN) format. You can supply
     *         up to 10 IAM roles in a single request. <p>A cluster can have up to 10
     *         IAM roles associated at any time.
     */
    public void setIamRoles(java.util.Collection<String> iamRoles) {
        if (iamRoles == null) {
            this.iamRoles = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> iamRolesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(iamRoles.size());
        iamRolesCopy.addAll(iamRoles);
        this.iamRoles = iamRolesCopy;
    }
    
    /**
     * A list of AWS Identity and Access Management (IAM) roles that can be
     * used by the cluster to access other AWS services. You must supply the
     * IAM roles in their Amazon Resource Name (ARN) format. You can supply
     * up to 10 IAM roles in a single request. <p>A cluster can have up to 10
     * IAM roles associated at any time.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setIamRoles(java.util.Collection)} or {@link
     * #withIamRoles(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be
     *         used by the cluster to access other AWS services. You must supply the
     *         IAM roles in their Amazon Resource Name (ARN) format. You can supply
     *         up to 10 IAM roles in a single request. <p>A cluster can have up to 10
     *         IAM roles associated at any time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withIamRoles(String... iamRoles) {
        if (getIamRoles() == null) setIamRoles(new java.util.ArrayList<String>(iamRoles.length));
        for (String value : iamRoles) {
            getIamRoles().add(value);
        }
        return this;
    }
    
    /**
     * A list of AWS Identity and Access Management (IAM) roles that can be
     * used by the cluster to access other AWS services. You must supply the
     * IAM roles in their Amazon Resource Name (ARN) format. You can supply
     * up to 10 IAM roles in a single request. <p>A cluster can have up to 10
     * IAM roles associated at any time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamRoles A list of AWS Identity and Access Management (IAM) roles that can be
     *         used by the cluster to access other AWS services. You must supply the
     *         IAM roles in their Amazon Resource Name (ARN) format. You can supply
     *         up to 10 IAM roles in a single request. <p>A cluster can have up to 10
     *         IAM roles associated at any time.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withIamRoles(java.util.Collection<String> iamRoles) {
        if (iamRoles == null) {
            this.iamRoles = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> iamRolesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(iamRoles.size());
            iamRolesCopy.addAll(iamRoles);
            this.iamRoles = iamRolesCopy;
        }

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
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getSnapshotIdentifier() != null) sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSnapshotClusterIdentifier() != null) sb.append("SnapshotClusterIdentifier: " + getSnapshotClusterIdentifier() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (isAllowVersionUpgrade() != null) sb.append("AllowVersionUpgrade: " + isAllowVersionUpgrade() + ",");
        if (getClusterSubnetGroupName() != null) sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() + ",");
        if (isPubliclyAccessible() != null) sb.append("PubliclyAccessible: " + isPubliclyAccessible() + ",");
        if (getOwnerAccount() != null) sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getHsmClientCertificateIdentifier() != null) sb.append("HsmClientCertificateIdentifier: " + getHsmClientCertificateIdentifier() + ",");
        if (getHsmConfigurationIdentifier() != null) sb.append("HsmConfigurationIdentifier: " + getHsmConfigurationIdentifier() + ",");
        if (getElasticIp() != null) sb.append("ElasticIp: " + getElasticIp() + ",");
        if (getClusterParameterGroupName() != null) sb.append("ClusterParameterGroupName: " + getClusterParameterGroupName() + ",");
        if (getClusterSecurityGroups() != null) sb.append("ClusterSecurityGroups: " + getClusterSecurityGroups() + ",");
        if (getVpcSecurityGroupIds() != null) sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getAutomatedSnapshotRetentionPeriod() != null) sb.append("AutomatedSnapshotRetentionPeriod: " + getAutomatedSnapshotRetentionPeriod() + ",");
        if (getKmsKeyId() != null) sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getNodeType() != null) sb.append("NodeType: " + getNodeType() + ",");
        if (getAdditionalInfo() != null) sb.append("AdditionalInfo: " + getAdditionalInfo() + ",");
        if (getIamRoles() != null) sb.append("IamRoles: " + getIamRoles() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotClusterIdentifier() == null) ? 0 : getSnapshotClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((isAllowVersionUpgrade() == null) ? 0 : isAllowVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isPubliclyAccessible() == null) ? 0 : isPubliclyAccessible().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode()); 
        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode()); 
        hashCode = prime * hashCode + ((getClusterParameterGroupName() == null) ? 0 : getClusterParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getClusterSecurityGroups() == null) ? 0 : getClusterSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getAutomatedSnapshotRetentionPeriod() == null) ? 0 : getAutomatedSnapshotRetentionPeriod().hashCode()); 
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode()); 
        hashCode = prime * hashCode + ((getIamRoles() == null) ? 0 : getIamRoles().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RestoreFromClusterSnapshotRequest == false) return false;
        RestoreFromClusterSnapshotRequest other = (RestoreFromClusterSnapshotRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null) return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false) return false; 
        if (other.getSnapshotClusterIdentifier() == null ^ this.getSnapshotClusterIdentifier() == null) return false;
        if (other.getSnapshotClusterIdentifier() != null && other.getSnapshotClusterIdentifier().equals(this.getSnapshotClusterIdentifier()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.isAllowVersionUpgrade() == null ^ this.isAllowVersionUpgrade() == null) return false;
        if (other.isAllowVersionUpgrade() != null && other.isAllowVersionUpgrade().equals(this.isAllowVersionUpgrade()) == false) return false; 
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null) return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false) return false; 
        if (other.isPubliclyAccessible() == null ^ this.isPubliclyAccessible() == null) return false;
        if (other.isPubliclyAccessible() != null && other.isPubliclyAccessible().equals(this.isPubliclyAccessible()) == false) return false; 
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null) return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false) return false; 
        if (other.getHsmClientCertificateIdentifier() == null ^ this.getHsmClientCertificateIdentifier() == null) return false;
        if (other.getHsmClientCertificateIdentifier() != null && other.getHsmClientCertificateIdentifier().equals(this.getHsmClientCertificateIdentifier()) == false) return false; 
        if (other.getHsmConfigurationIdentifier() == null ^ this.getHsmConfigurationIdentifier() == null) return false;
        if (other.getHsmConfigurationIdentifier() != null && other.getHsmConfigurationIdentifier().equals(this.getHsmConfigurationIdentifier()) == false) return false; 
        if (other.getElasticIp() == null ^ this.getElasticIp() == null) return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false) return false; 
        if (other.getClusterParameterGroupName() == null ^ this.getClusterParameterGroupName() == null) return false;
        if (other.getClusterParameterGroupName() != null && other.getClusterParameterGroupName().equals(this.getClusterParameterGroupName()) == false) return false; 
        if (other.getClusterSecurityGroups() == null ^ this.getClusterSecurityGroups() == null) return false;
        if (other.getClusterSecurityGroups() != null && other.getClusterSecurityGroups().equals(this.getClusterSecurityGroups()) == false) return false; 
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null) return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getAutomatedSnapshotRetentionPeriod() == null ^ this.getAutomatedSnapshotRetentionPeriod() == null) return false;
        if (other.getAutomatedSnapshotRetentionPeriod() != null && other.getAutomatedSnapshotRetentionPeriod().equals(this.getAutomatedSnapshotRetentionPeriod()) == false) return false; 
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null) return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false) return false; 
        if (other.getNodeType() == null ^ this.getNodeType() == null) return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false) return false; 
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null) return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false) return false; 
        if (other.getIamRoles() == null ^ this.getIamRoles() == null) return false;
        if (other.getIamRoles() != null && other.getIamRoles().equals(this.getIamRoles()) == false) return false; 
        return true;
    }
    
    @Override
    public RestoreFromClusterSnapshotRequest clone() {
        
            return (RestoreFromClusterSnapshotRequest) super.clone();
    }

}
    