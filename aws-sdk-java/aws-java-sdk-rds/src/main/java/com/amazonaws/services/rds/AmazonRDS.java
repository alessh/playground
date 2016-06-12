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
package com.amazonaws.services.rds;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.rds.model.*;

/**
 * Interface for accessing AmazonRDS.
 * Amazon Relational Database Service <p>
 * Amazon Relational Database Service (Amazon RDS) is a web service that
 * makes it easier to set up, operate, and scale a relational database in
 * the cloud. It provides cost-efficient, resizeable capacity for an
 * industry-standard relational database and manages common database
 * administration tasks, freeing up developers to focus on what makes
 * their applications and businesses unique.
 * </p>
 * <p>
 * Amazon RDS gives you access to the capabilities of a MySQL, MariaDB,
 * PostgreSQL, Microsoft SQL Server, Oracle, or Amazon Aurora database
 * server. These capabilities mean that the code, applications, and tools
 * you already use today with your existing databases work with Amazon
 * RDS without modification. Amazon RDS automatically backs up your
 * database and maintains the database software that powers your DB
 * instance. Amazon RDS is flexible: you can scale your database
 * instance's compute resources and storage capacity to meet your
 * application's demand. As with all Amazon Web Services, there are no
 * up-front investments, and you pay only for the resources you use.
 * </p>
 * <p>
 * This interface reference for Amazon RDS contains documentation for a
 * programming or command line interface you can use to manage Amazon
 * RDS. Note that Amazon RDS is asynchronous, which means that some
 * interfaces might require techniques such as polling or callback
 * functions to determine when a command has been applied. In this
 * reference, the parameter descriptions indicate whether a command is
 * applied immediately, on the next instance reboot, or during the
 * maintenance window. The reference structure is as follows, and we list
 * following some related topics from the user guide.
 * </p>
 * <p>
 * <b>Amazon RDS API Reference</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * For the alphabetical list of API actions, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Operations.html"> API Actions </a>
 * .
 * </p>
 * </li>
 * <li> <p>
 * For the alphabetical list of data types, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Types.html"> Data Types </a>
 * .
 * </p>
 * </li>
 * <li> <p>
 * For a list of common query parameters, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonParameters.html"> Common Parameters </a>
 * .
 * </p>
 * </li>
 * <li> <p>
 * For descriptions of the error codes, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonErrors.html"> Common Errors </a>
 * .
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Amazon RDS User Guide</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * For a summary of the Amazon RDS interfaces, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html#Welcome.Interfaces"> Available RDS Interfaces </a>
 * .
 * </p>
 * </li>
 * <li> <p>
 * For more information about how to use the Query API, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Using_the_Query_API.html"> Using the Query API </a>
 * .
 * </p>
 * </li>
 * 
 * </ul>
 */
public interface AmazonRDS {

    /**
     * Overrides the default endpoint for this client ("https://rds.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "rds.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://rds.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "rds.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://rds.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonRDS#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Copies the specified option group.
     * </p>
     *
     * @param copyOptionGroupRequest Container for the necessary parameters
     *           to execute the CopyOptionGroup service method on AmazonRDS.
     * 
     * @return The response from the CopyOptionGroup service method, as
     *         returned by AmazonRDS.
     * 
     * @throws OptionGroupAlreadyExistsException
     * @throws OptionGroupNotFoundException
     * @throws OptionGroupQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public OptionGroup copyOptionGroup(CopyOptionGroupRequest copyOptionGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a DB subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b>The specified database subnet group must not be
     * associated with any DB instances.
     * </p>
     *
     * @param deleteDBSubnetGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBSubnetGroup service method on
     *           AmazonRDS.
     * 
     * 
     * @throws DBSubnetGroupNotFoundException
     * @throws InvalidDBSubnetGroupStateException
     * @throws InvalidDBSubnetStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDBSubnetGroup(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Restores a DB instance to an arbitrary point in time. You can restore
     * to any point in time before the time identified by the
     * LatestRestorableTime property. You can restore to a point up to the
     * number of days specified by the BackupRetentionPeriod property.
     * </p>
     * <p>
     * The target database is created with most of the original
     * configuration, but in a system-selected availability zone, with the
     * default security group, the default subnet group, and the default DB
     * parameter group. By default, the new DB instance is created as a
     * single-AZ deployment except when the instance is a SQL Server instance
     * that has an option group that is associated with mirroring; in this
     * case, the instance becomes a mirrored deployment and not a single-AZ
     * deployment.
     * </p>
     *
     * @param restoreDBInstanceToPointInTimeRequest Container for the
     *           necessary parameters to execute the RestoreDBInstanceToPointInTime
     *           service method on AmazonRDS.
     * 
     * @return The response from the RestoreDBInstanceToPointInTime service
     *         method, as returned by AmazonRDS.
     * 
     * @throws PointInTimeRestoreNotEnabledException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBInstanceAlreadyExistsException
     * @throws DBInstanceNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws StorageTypeNotSupportedException
     * @throws DBSecurityGroupNotFoundException
     * @throws DomainNotFoundException
     * @throws InvalidSubnetException
     * @throws AuthorizationNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws InvalidRestoreException
     * @throws InstanceQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws InvalidDBInstanceStateException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InsufficientDBInstanceCapacityException
     * @throws OptionGroupNotFoundException
     * @throws ProvisionedIopsNotAvailableInAZException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance restoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of resources (for example, DB instances) that have at
     * least one pending maintenance action.
     * </p>
     *
     * @param describePendingMaintenanceActionsRequest Container for the
     *           necessary parameters to execute the DescribePendingMaintenanceActions
     *           service method on AmazonRDS.
     * 
     * @return The response from the DescribePendingMaintenanceActions
     *         service method, as returned by AmazonRDS.
     * 
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Copies the specified DB snapshot. The source DB snapshot must be in
     * the "available" state.
     * </p>
     * <p>
     * If you are copying from a shared manual DB snapshot, the
     * <code>SourceDBSnapshotIdentifier</code> must be the ARN of the shared
     * DB snapshot.
     * </p>
     *
     * @param copyDBSnapshotRequest Container for the necessary parameters to
     *           execute the CopyDBSnapshot service method on AmazonRDS.
     * 
     * @return The response from the CopyDBSnapshot service method, as
     *         returned by AmazonRDS.
     * 
     * @throws KMSKeyNotAccessibleException
     * @throws InvalidDBSnapshotStateException
     * @throws SnapshotQuotaExceededException
     * @throws DBSnapshotAlreadyExistsException
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSnapshot copyDBSnapshot(CopyDBSnapshotRequest copyDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the available option groups.
     * </p>
     *
     * @param describeOptionGroupsRequest Container for the necessary
     *           parameters to execute the DescribeOptionGroups service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeOptionGroups service method, as
     *         returned by AmazonRDS.
     * 
     * @throws OptionGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeOptionGroupsResult describeOptionGroups(DescribeOptionGroupsRequest describeOptionGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new DB security group. DB security groups control access to
     * a DB instance.
     * </p>
     *
     * @param createDBSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateDBSecurityGroup service method on
     *           AmazonRDS.
     * 
     * @return The response from the CreateDBSecurityGroup service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBSecurityGroupQuotaExceededException
     * @throws DBSecurityGroupNotSupportedException
     * @throws DBSecurityGroupAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSecurityGroup createDBSecurityGroup(CreateDBSecurityGroupRequest createDBSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new DB instance.
     * </p>
     *
     * @param createDBInstanceRequest Container for the necessary parameters
     *           to execute the CreateDBInstance service method on AmazonRDS.
     * 
     * @return The response from the CreateDBInstance service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBInstanceAlreadyExistsException
     * @throws InvalidVPCNetworkStateException
     * @throws StorageTypeNotSupportedException
     * @throws DBSecurityGroupNotFoundException
     * @throws DomainNotFoundException
     * @throws InvalidSubnetException
     * @throws AuthorizationNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws InstanceQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InsufficientDBInstanceCapacityException
     * @throws OptionGroupNotFoundException
     * @throws ProvisionedIopsNotAvailableInAZException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance createDBInstance(CreateDBInstanceRequest createDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about provisioned RDS instances. This API
     * supports pagination.
     * </p>
     *
     * @param describeDBInstancesRequest Container for the necessary
     *           parameters to execute the DescribeDBInstances service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBInstances service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBInstancesResult describeDBInstances(DescribeDBInstancesRequest describeDBInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes a source identifier from an existing RDS event notification
     * subscription.
     * </p>
     *
     * @param removeSourceIdentifierFromSubscriptionRequest Container for the
     *           necessary parameters to execute the
     *           RemoveSourceIdentifierFromSubscription service method on AmazonRDS.
     * 
     * @return The response from the RemoveSourceIdentifierFromSubscription
     *         service method, as returned by AmazonRDS.
     * 
     * @throws SourceNotFoundException
     * @throws SubscriptionNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EventSubscription removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a DB security group.
     * </p>
     * <p>
     * <b>NOTE:</b>The specified DB security group must not be associated
     * with any DB instances.
     * </p>
     *
     * @param deleteDBSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBSecurityGroup service method on
     *           AmazonRDS.
     * 
     * 
     * @throws DBSecurityGroupNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDBSecurityGroup(DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions.
     * If a <code>DBClusterParameterGroupName</code> parameter is specified,
     * the list will contain only the description of the specified DB cluster
     * parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param describeDBClusterParameterGroupsRequest Container for the
     *           necessary parameters to execute the DescribeDBClusterParameterGroups
     *           service method on AmazonRDS.
     * 
     * @return The response from the DescribeDBClusterParameterGroups service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables ingress to a DBSecurityGroup using one of two forms of
     * authorization. First, EC2 or VPC security groups can be added to the
     * DBSecurityGroup if the application using the database is running on
     * EC2 or VPC instances. Second, IP ranges are available if the
     * application accessing your database is running on the Internet.
     * Required parameters for this API are one of CIDR range,
     * EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
     * EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).
     * </p>
     * <p>
     * <b>NOTE:</b> You cannot authorize ingress from an EC2 security group
     * in one region to an Amazon RDS DB instance in another. You cannot
     * authorize ingress from a VPC security group in one VPC to an Amazon
     * RDS DB instance in another.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the
     * <a href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"> Wikipedia Tutorial </a>
     * .
     * </p>
     *
     * @param authorizeDBSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the AuthorizeDBSecurityGroupIngress
     *           service method on AmazonRDS.
     * 
     * @return The response from the AuthorizeDBSecurityGroupIngress service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBSecurityGroupNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     * @throws AuthorizationAlreadyExistsException
     * @throws AuthorizationQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSecurityGroup authorizeDBSecurityGroupIngress(AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of DB snapshot attribute names and values for a manual
     * DB snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other AWS accounts,
     * <code>DescribeDBSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of the AWS account ids that
     * are authorized to copy or restore the manual DB snapshot. If
     * <code>all</code> is included in the list of values for the
     * <code>restore</code> attribute, then the manual DB snapshot is public
     * and can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a
     * manual DB snapshot, or to make the manual DB snapshot public or
     * private, use the ModifyDBSnapshotAttribute API.
     * </p>
     *
     * @param describeDBSnapshotAttributesRequest Container for the necessary
     *           parameters to execute the DescribeDBSnapshotAttributes service method
     *           on AmazonRDS.
     * 
     * @return The response from the DescribeDBSnapshotAttributes service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSnapshotAttributesResult describeDBSnapshotAttributes(DescribeDBSnapshotAttributesRequest describeDBSnapshotAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new DB cluster parameter group.
     * </p>
     * <p>
     * Parameters in a DB cluster parameter group apply to all of the
     * instances in a DB cluster.
     * </p>
     * <p>
     * A DB cluster parameter group is initially created with the default
     * parameters for the database engine used by instances in the DB
     * cluster. To provide custom values for any of the parameters, you must
     * modify the group after creating it using
     * ModifyDBClusterParameterGroup. Once you've created a DB cluster
     * parameter group, you need to associate it with your DB cluster using
     * ModifyDBCluster. When you associate a new DB cluster parameter group
     * with a running DB cluster, you need to reboot the DB instances in the
     * DB cluster without failover for the new DB cluster parameter group and
     * associated settings to take effect.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> After you create a DB cluster parameter group, you
     * should wait at least 5 minutes before creating your first DB cluster
     * that uses that DB cluster parameter group as the default parameter
     * group. This allows Amazon RDS to fully complete the create action
     * before the DB cluster parameter group is used as the default for a new
     * DB cluster. This is especially important for parameters that are
     * critical when creating the default database for a DB cluster, such as
     * the character set for the default database defined by the
     * character_set_database parameter. You can use the Parameter Groups
     * option of the Amazon RDS console or the DescribeDBClusterParameters
     * command to verify that your DB cluster parameter group has been
     * created or modified.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param createDBClusterParameterGroupRequest Container for the
     *           necessary parameters to execute the CreateDBClusterParameterGroup
     *           service method on AmazonRDS.
     * 
     * @return The response from the CreateDBClusterParameterGroup service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupQuotaExceededException
     * @throws DBParameterGroupAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a
     * DB instance).
     * </p>
     *
     * @param applyPendingMaintenanceActionRequest Container for the
     *           necessary parameters to execute the ApplyPendingMaintenanceAction
     *           service method on AmazonRDS.
     * 
     * @return The response from the ApplyPendingMaintenanceAction service
     *         method, as returned by AmazonRDS.
     * 
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResourcePendingMaintenanceActions applyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modify settings for a DB instance. You can change one or more
     * database configuration parameters by specifying these parameters and
     * the new values in the request.
     * </p>
     *
     * @param modifyDBInstanceRequest Container for the necessary parameters
     *           to execute the ModifyDBInstance service method on AmazonRDS.
     * 
     * @return The response from the ModifyDBInstance service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws CertificateNotFoundException
     * @throws DBInstanceAlreadyExistsException
     * @throws DBInstanceNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws StorageTypeNotSupportedException
     * @throws DBSecurityGroupNotFoundException
     * @throws DomainNotFoundException
     * @throws DBUpgradeDependencyFailureException
     * @throws AuthorizationNotFoundException
     * @throws StorageQuotaExceededException
     * @throws InvalidDBInstanceStateException
     * @throws InsufficientDBInstanceCapacityException
     * @throws InvalidDBSecurityGroupStateException
     * @throws OptionGroupNotFoundException
     * @throws ProvisionedIopsNotAvailableInAZException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance modifyDBInstance(ModifyDBInstanceRequest modifyDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an RDS event notification subscription.
     * </p>
     *
     * @param deleteEventSubscriptionRequest Container for the necessary
     *           parameters to execute the DeleteEventSubscription service method on
     *           AmazonRDS.
     * 
     * @return The response from the DeleteEventSubscription service method,
     *         as returned by AmazonRDS.
     * 
     * @throws SubscriptionNotFoundException
     * @throws InvalidEventSubscriptionStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EventSubscription deleteEventSubscription(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about DB cluster snapshots. This API supports
     * pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param describeDBClusterSnapshotsRequest Container for the necessary
     *           parameters to execute the DescribeDBClusterSnapshots service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBClusterSnapshots service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBClusterSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBClusterSnapshotsResult describeDBClusterSnapshots(DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB cluster
     * parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param describeDBClusterParametersRequest Container for the necessary
     *           parameters to execute the DescribeDBClusterParameters service method
     *           on AmazonRDS.
     * 
     * @return The response from the DescribeDBClusterParameters service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBClusterParametersResult describeDBClusterParameters(DescribeDBClusterParametersRequest describeDBClusterParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes metadata tags from an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"> Tagging Amazon RDS Resources </a>
     * .
     * </p>
     *
     * @param removeTagsFromResourceRequest Container for the necessary
     *           parameters to execute the RemoveTagsFromResource service method on
     *           AmazonRDS.
     * 
     * 
     * @throws DBInstanceNotFoundException
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values
     * from a manual DB snapshot.
     * </p>
     * <p>
     * To share a manual DB snapshot with other AWS accounts, specify
     * <code>restore</code> as the <code>AttributeName</code> and use the
     * <code>ValuesToAdd</code> parameter to add a list of the AWS account
     * ids that are authorized to restore the manual DB snapshot. Uses the
     * value <code>all</code> to make the manual DB snapshot public and can
     * by copied or restored by all AWS accounts. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain
     * private information that you do not want to be available to all AWS
     * accounts.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB
     * snapshot, or whether a manual DB snapshot public or private, use the
     * DescribeDBSnapshotAttributes API.
     * </p>
     * <p>
     * If the manual DB snapshot is encrypted, it cannot be shared.
     * </p>
     *
     * @param modifyDBSnapshotAttributeRequest Container for the necessary
     *           parameters to execute the ModifyDBSnapshotAttribute service method on
     *           AmazonRDS.
     * 
     * @return The response from the ModifyDBSnapshotAttribute service
     *         method, as returned by AmazonRDS.
     * 
     * @throws InvalidDBSnapshotStateException
     * @throws SharedSnapshotQuotaExceededException
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSnapshotAttributesResult modifyDBSnapshotAttribute(ModifyDBSnapshotAttributeRequest modifyDBSnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Displays a list of categories for all event source types, or, if
     * specified, for a specified source type. You can see a list of the
     * event categories and source types in the
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"> Events </a>
     * topic in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param describeEventCategoriesRequest Container for the necessary
     *           parameters to execute the DescribeEventCategories service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeEventCategories service method,
     *         as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest describeEventCategoriesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Copies the specified DB parameter group.
     * </p>
     *
     * @param copyDBParameterGroupRequest Container for the necessary
     *           parameters to execute the CopyDBParameterGroup service method on
     *           AmazonRDS.
     * 
     * @return The response from the CopyDBParameterGroup service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws DBParameterGroupQuotaExceededException
     * @throws DBParameterGroupAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBParameterGroup copyDBParameterGroup(CopyDBParameterGroupRequest copyDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new DB cluster from a DB cluster snapshot. The target DB
     * cluster is created from the source DB cluster restore point with the
     * same configuration as the original source DB cluster, except that the
     * new DB cluster is created with the default security group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param restoreDBClusterFromSnapshotRequest Container for the necessary
     *           parameters to execute the RestoreDBClusterFromSnapshot service method
     *           on AmazonRDS.
     * 
     * @return The response from the RestoreDBClusterFromSnapshot service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBClusterQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidDBSnapshotStateException
     * @throws InvalidSubnetException
     * @throws DBClusterAlreadyExistsException
     * @throws DBSnapshotNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws InsufficientDBClusterCapacityException
     * @throws InvalidRestoreException
     * @throws DBClusterSnapshotNotFoundException
     * @throws StorageQuotaExceededException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws InsufficientStorageClusterCapacityException
     * @throws OptionGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBCluster restoreDBClusterFromSnapshot(RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about provisioned Aurora DB clusters. This API
     * supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param describeDBClustersRequest Container for the necessary
     *           parameters to execute the DescribeDBClusters service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBClusters service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBClustersResult describeDBClusters(DescribeDBClustersRequest describeDBClustersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Rebooting a DB instance restarts the database engine service. A
     * reboot also applies to the DB instance any modifications to the
     * associated DB parameter group that were pending. Rebooting a DB
     * instance results in a momentary outage of the instance, during which
     * the DB instance status is set to rebooting. If the RDS instance is
     * configured for MultiAZ, it is possible that the reboot will be
     * conducted through a failover. An Amazon RDS event is created when the
     * reboot is completed.
     * </p>
     * <p>
     * If your DB instance is deployed in multiple Availability Zones, you
     * can force a failover from one AZ to the other during the reboot. You
     * might force a failover to test the availability of your DB instance
     * deployment or to restore operations to the original AZ after a
     * failover occurs.
     * </p>
     * <p>
     * The time required to reboot is a function of the specific database
     * engine's crash recovery process. To improve the reboot time, we
     * recommend that you reduce database activities as much as possible
     * during the reboot process to reduce rollback activity for in-transit
     * transactions.
     * </p>
     *
     * @param rebootDBInstanceRequest Container for the necessary parameters
     *           to execute the RebootDBInstance service method on AmazonRDS.
     * 
     * @return The response from the RebootDBInstance service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance rebootDBInstance(RebootDBInstanceRequest rebootDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a DB instance for a DB instance running MySQL, MariaDB, or
     * PostgreSQL that acts as a Read Replica of a source DB instance.
     * </p>
     * <p>
     * All Read Replica DB instances are created as Single-AZ deployments
     * with backups disabled. All other DB instance attributes (including DB
     * security groups and DB parameter groups) are inherited from the source
     * DB instance, except as specified below.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> The source DB instance must have backup retention
     * enabled.
     * </p>
     *
     * @param createDBInstanceReadReplicaRequest Container for the necessary
     *           parameters to execute the CreateDBInstanceReadReplica service method
     *           on AmazonRDS.
     * 
     * @return The response from the CreateDBInstanceReadReplica service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws DBSubnetGroupNotFoundException
     * @throws DBInstanceAlreadyExistsException
     * @throws DBInstanceNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws StorageTypeNotSupportedException
     * @throws InvalidDBSubnetGroupException
     * @throws DBSecurityGroupNotFoundException
     * @throws InvalidSubnetException
     * @throws KMSKeyNotAccessibleException
     * @throws InstanceQuotaExceededException
     * @throws DBSubnetGroupNotAllowedException
     * @throws StorageQuotaExceededException
     * @throws InvalidDBInstanceStateException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InsufficientDBInstanceCapacityException
     * @throws OptionGroupNotFoundException
     * @throws ProvisionedIopsNotAvailableInAZException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance createDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest createDBInstanceReadReplicaRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a DBSnapshot. If the snapshot is being copied, the copy
     * operation is terminated.
     * </p>
     * <p>
     * <b>NOTE:</b>The DBSnapshot must be in the available state to be
     * deleted.
     * </p>
     *
     * @param deleteDBSnapshotRequest Container for the necessary parameters
     *           to execute the DeleteDBSnapshot service method on AmazonRDS.
     * 
     * @return The response from the DeleteDBSnapshot service method, as
     *         returned by AmazonRDS.
     * 
     * @throws InvalidDBSnapshotStateException
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSnapshot deleteDBSnapshot(DeleteDBSnapshotRequest deleteDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns events related to DB instances, DB security groups, DB
     * snapshots, and DB parameter groups for the past 14 days. Events
     * specific to a particular DB instance, DB security group, database
     * snapshot, or DB parameter group can be obtained by providing the name
     * as a parameter. By default, the past hour of events are returned.
     * </p>
     *
     * @param describeEventsRequest Container for the necessary parameters to
     *           execute the DescribeEvents service method on AmazonRDS.
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DeleteDBCluster action deletes a previously provisioned DB
     * cluster. A successful response from the web service indicates the
     * request was received correctly. When you delete a DB cluster, all
     * automated backups for that DB cluster are deleted and cannot be
     * recovered. Manual DB cluster snapshots of the DB cluster to be deleted
     * are not deleted.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param deleteDBClusterRequest Container for the necessary parameters
     *           to execute the DeleteDBCluster service method on AmazonRDS.
     * 
     * @return The response from the DeleteDBCluster service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws InvalidDBClusterStateException
     * @throws DBClusterSnapshotAlreadyExistsException
     * @throws SnapshotQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBCluster deleteDBCluster(DeleteDBClusterRequest deleteDBClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all tags on an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"> Tagging Amazon RDS Resources </a>
     * .
     * </p>
     *
     * @param listTagsForResourceRequest Container for the necessary
     *           parameters to execute the ListTagsForResource service method on
     *           AmazonRDS.
     * 
     * @return The response from the ListTagsForResource service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes all available options.
     * </p>
     *
     * @param describeOptionGroupOptionsRequest Container for the necessary
     *           parameters to execute the DescribeOptionGroupOptions service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeOptionGroupOptions service
     *         method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeOptionGroupOptionsResult describeOptionGroupOptions(DescribeOptionGroupOptionsRequest describeOptionGroupOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB parameter
     * group.
     * </p>
     *
     * @param describeDBParametersRequest Container for the necessary
     *           parameters to execute the DescribeDBParameters service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBParameters service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBParametersResult describeDBParameters(DescribeDBParametersRequest describeDBParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group. To modify
     * more than one parameter, submit a list of the following:
     * <code>ParameterName</code> , <code>ParameterValue</code> , and
     * <code>ApplyMethod</code> . A maximum of 20 parameters can be modified
     * in a single request.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>NOTE:</b> Changes to dynamic parameters are applied immediately.
     * Changes to static parameters require a reboot without failover to the
     * DB cluster associated with the parameter group before the change can
     * take effect.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> After you create a DB cluster parameter group, you
     * should wait at least 5 minutes before creating your first DB cluster
     * that uses that DB cluster parameter group as the default parameter
     * group. This allows Amazon RDS to fully complete the create action
     * before the parameter group is used as the default for a new DB
     * cluster. This is especially important for parameters that are critical
     * when creating the default database for a DB cluster, such as the
     * character set for the default database defined by the
     * character_set_database parameter. You can use the Parameter Groups
     * option of the Amazon RDS console or the DescribeDBClusterParameters
     * command to verify that your DB cluster parameter group has been
     * created or modified.
     * </p>
     *
     * @param modifyDBClusterParameterGroupRequest Container for the
     *           necessary parameters to execute the ModifyDBClusterParameterGroup
     *           service method on AmazonRDS.
     * 
     * @return The response from the ModifyDBClusterParameterGroup service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyDBClusterParameterGroupResult modifyDBClusterParameterGroup(ModifyDBClusterParameterGroupRequest modifyDBClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Restores a DB cluster to an arbitrary point in time. Users can
     * restore to any point in time before <code>LatestRestorableTime</code>
     * for up to <code>BackupRetentionPeriod</code> days. The target DB
     * cluster is created from the source DB cluster with the same
     * configuration as the original DB cluster, except that the new DB
     * cluster is created with the default DB security group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param restoreDBClusterToPointInTimeRequest Container for the
     *           necessary parameters to execute the RestoreDBClusterToPointInTime
     *           service method on AmazonRDS.
     * 
     * @return The response from the RestoreDBClusterToPointInTime service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBClusterQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidDBSnapshotStateException
     * @throws InvalidSubnetException
     * @throws DBClusterAlreadyExistsException
     * @throws KMSKeyNotAccessibleException
     * @throws InsufficientDBClusterCapacityException
     * @throws InvalidRestoreException
     * @throws DBClusterSnapshotNotFoundException
     * @throws StorageQuotaExceededException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws DBClusterNotFoundException
     * @throws OptionGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Purchases a reserved DB instance offering.
     * </p>
     *
     * @param purchaseReservedDBInstancesOfferingRequest Container for the
     *           necessary parameters to execute the
     *           PurchaseReservedDBInstancesOffering service method on AmazonRDS.
     * 
     * @return The response from the PurchaseReservedDBInstancesOffering
     *         service method, as returned by AmazonRDS.
     * 
     * @throws ReservedDBInstancesOfferingNotFoundException
     * @throws ReservedDBInstanceQuotaExceededException
     * @throws ReservedDBInstanceAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReservedDBInstance purchaseReservedDBInstancesOffering(PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of <code>DBSecurityGroup</code> descriptions. If a
     * <code>DBSecurityGroupName</code> is specified, the list will contain
     * only the descriptions of the specified DB security group.
     * </p>
     *
     * @param describeDBSecurityGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBSecurityGroups service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBSecurityGroups service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBSecurityGroupsResult describeDBSecurityGroups(DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies an existing RDS event notification subscription. Note that
     * you cannot modify the source identifiers using this call; to change
     * source identifiers for a subscription, use the
     * AddSourceIdentifierToSubscription and
     * RemoveSourceIdentifierFromSubscription calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given SourceType in
     * the
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"> Events </a>
     * topic in the Amazon RDS User Guide or by using the
     * <b>DescribeEventCategories</b> action.
     * </p>
     *
     * @param modifyEventSubscriptionRequest Container for the necessary
     *           parameters to execute the ModifyEventSubscription service method on
     *           AmazonRDS.
     * 
     * @return The response from the ModifyEventSubscription service method,
     *         as returned by AmazonRDS.
     * 
     * @throws SNSTopicArnNotFoundException
     * @throws SNSInvalidTopicException
     * @throws SubscriptionCategoryNotFoundException
     * @throws SubscriptionNotFoundException
     * @throws SNSNoAuthorizationException
     * @throws EventSubscriptionQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EventSubscription modifyEventSubscription(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * The DeleteDBInstance action deletes a previously provisioned DB
     * instance. A successful response from the web service indicates the
     * request was received correctly. When you delete a DB instance, all
     * automated backups for that instance are deleted and cannot be
     * recovered. Manual DB snapshots of the DB instance to be deleted are
     * not deleted.
     * </p>
     * <p>
     * If a final DB snapshot is requested the status of the RDS instance
     * will be "deleting" until the DB snapshot is created. The API action
     * <code>DescribeDBInstance</code> is used to monitor the status of this
     * operation. The action cannot be canceled or reverted once submitted.
     * </p>
     * <p>
     * Note that when a DB instance is in a failure state and has a status
     * of 'failed', 'incompatible-restore', or 'incompatible-network', it can
     * only be deleted when the SkipFinalSnapshot parameter is set to "true".
     * </p>
     *
     * @param deleteDBInstanceRequest Container for the necessary parameters
     *           to execute the DeleteDBInstance service method on AmazonRDS.
     * 
     * @return The response from the DeleteDBInstance service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws InvalidDBClusterStateException
     * @throws SnapshotQuotaExceededException
     * @throws DBSnapshotAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance deleteDBInstance(DeleteDBInstanceRequest deleteDBInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new DB instance from a DB snapshot. The target database is
     * created from the source database restore point with the most of
     * original configuration with the default security group and the default
     * DB parameter group. By default, the new DB instance is created as a
     * single-AZ deployment except when the instance is a SQL Server instance
     * that has an option group that is associated with mirroring; in this
     * case, the instance becomes a mirrored AZ deployment and not a
     * single-AZ deployment.
     * </p>
     * <p>
     * If your intent is to replace your original DB instance with the new,
     * restored DB instance, then rename your original DB instance before you
     * call the RestoreDBInstanceFromDBSnapshot action. RDS does not allow
     * two DB instances with the same name. Once you have renamed your
     * original DB instance with a different identifier, then you can pass
     * the original name of the DB instance as the DBInstanceIdentifier in
     * the call to the RestoreDBInstanceFromDBSnapshot action. The result is
     * that you will replace the original DB instance with the DB instance
     * created from the snapshot.
     * </p>
     * <p>
     * If you are restoring from a shared manual DB snapshot, the
     * <code>DBSnapshotIdentifier</code> must be the ARN of the shared DB
     * snapshot.
     * </p>
     *
     * @param restoreDBInstanceFromDBSnapshotRequest Container for the
     *           necessary parameters to execute the RestoreDBInstanceFromDBSnapshot
     *           service method on AmazonRDS.
     * 
     * @return The response from the RestoreDBInstanceFromDBSnapshot service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBSubnetGroupNotFoundException
     * @throws DBInstanceAlreadyExistsException
     * @throws InvalidVPCNetworkStateException
     * @throws InvalidDBSnapshotStateException
     * @throws StorageTypeNotSupportedException
     * @throws DBSecurityGroupNotFoundException
     * @throws DomainNotFoundException
     * @throws InvalidSubnetException
     * @throws AuthorizationNotFoundException
     * @throws DBSnapshotNotFoundException
     * @throws KMSKeyNotAccessibleException
     * @throws InvalidRestoreException
     * @throws InstanceQuotaExceededException
     * @throws StorageQuotaExceededException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InsufficientDBInstanceCapacityException
     * @throws OptionGroupNotFoundException
     * @throws ProvisionedIopsNotAvailableInAZException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance restoreDBInstanceFromDBSnapshot(RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new option group. You can create up to 20 option groups.
     * </p>
     *
     * @param createOptionGroupRequest Container for the necessary parameters
     *           to execute the CreateOptionGroup service method on AmazonRDS.
     * 
     * @return The response from the CreateOptionGroup service method, as
     *         returned by AmazonRDS.
     * 
     * @throws OptionGroupAlreadyExistsException
     * @throws OptionGroupQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public OptionGroup createOptionGroup(CreateOptionGroupRequest createOptionGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies an existing option group.
     * </p>
     *
     * @param modifyOptionGroupRequest Container for the necessary parameters
     *           to execute the ModifyOptionGroup service method on AmazonRDS.
     * 
     * @return The response from the ModifyOptionGroup service method, as
     *         returned by AmazonRDS.
     * 
     * @throws InvalidOptionGroupStateException
     * @throws OptionGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public OptionGroup modifyOptionGroup(ModifyOptionGroupRequest modifyOptionGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName
     * is specified, the list will contain only the descriptions of the
     * specified DBSubnetGroup.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the
     * <a href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"> Wikipedia Tutorial </a>
     * .
     * </p>
     *
     * @param describeDBSubnetGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBSubnetGroups service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBSubnetGroups service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBSubnetGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBSubnetGroupsResult describeDBSubnetGroups(DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of <code>DBParameterGroup</code> descriptions. If a
     * <code>DBParameterGroupName</code> is specified, the list will contain
     * only the description of the specified DB parameter group.
     * </p>
     *
     * @param describeDBParameterGroupsRequest Container for the necessary
     *           parameters to execute the DescribeDBParameterGroups service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBParameterGroups service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBParameterGroupsResult describeDBParameterGroups(DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all the subscription descriptions for a customer account. The
     * description for a subscription includes SubscriptionName, SNSTopicARN,
     * CustomerID, SourceType, SourceID, CreationTime, and Status.
     * </p>
     * <p>
     * If you specify a SubscriptionName, lists the description for that
     * subscription.
     * </p>
     *
     * @param describeEventSubscriptionsRequest Container for the necessary
     *           parameters to execute the DescribeEventSubscriptions service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeEventSubscriptions service
     *         method, as returned by AmazonRDS.
     * 
     * @throws SubscriptionNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventSubscriptionsResult describeEventSubscriptions(DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies an existing DB subnet group. DB subnet groups must contain
     * at least one subnet in at least two AZs in the region.
     * </p>
     *
     * @param modifyDBSubnetGroupRequest Container for the necessary
     *           parameters to execute the ModifyDBSubnetGroup service method on
     *           AmazonRDS.
     * 
     * @return The response from the ModifyDBSubnetGroup service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBSubnetGroupNotFoundException
     * @throws DBSubnetQuotaExceededException
     * @throws SubnetAlreadyInUseException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSubnetGroup modifyDBSubnetGroup(ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the default engine and system parameter information for the
     * cluster database engine.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param describeEngineDefaultClusterParametersRequest Container for the
     *           necessary parameters to execute the
     *           DescribeEngineDefaultClusterParameters service method on AmazonRDS.
     * 
     * @return The response from the DescribeEngineDefaultClusterParameters
     *         service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EngineDefaults describeEngineDefaultClusterParameters(DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Amazon Aurora DB cluster. For more information on
     * Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param createDBClusterRequest Container for the necessary parameters
     *           to execute the CreateDBCluster service method on AmazonRDS.
     * 
     * @return The response from the CreateDBCluster service method, as
     *         returned by AmazonRDS.
     * 
     * @throws KMSKeyNotAccessibleException
     * @throws DBClusterQuotaExceededException
     * @throws DBSubnetGroupNotFoundException
     * @throws StorageQuotaExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws DBClusterParameterGroupNotFoundException
     * @throws InvalidDBSubnetGroupStateException
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws InvalidSubnetException
     * @throws DBClusterAlreadyExistsException
     * @throws InsufficientStorageClusterCapacityException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBCluster createDBCluster(CreateDBClusterRequest createDBClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group to the
     * default value. To reset specific parameters submit a list of the
     * following: <code>ParameterName</code> and <code>ApplyMethod</code> .
     * To reset the entire DB cluster parameter group, specify the
     * <code>DBClusterParameterGroupName</code> and
     * <code>ResetAllParameters</code> parameters.
     * </p>
     * <p>
     * When resetting the entire group, dynamic parameters are updated
     * immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance
     * restart or RebootDBInstance request. You must call RebootDBInstance
     * for every DB instance in your DB cluster that you want the updated
     * static parameter to apply to.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param resetDBClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the ResetDBClusterParameterGroup service method
     *           on AmazonRDS.
     * 
     * @return The response from the ResetDBClusterParameterGroup service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResetDBClusterParameterGroupResult resetDBClusterParameterGroup(ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about DB snapshots. This API supports pagination.
     * </p>
     *
     * @param describeDBSnapshotsRequest Container for the necessary
     *           parameters to execute the DescribeDBSnapshots service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBSnapshots service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBSnapshotsResult describeDBSnapshots(DescribeDBSnapshotsRequest describeDBSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a DB cluster snapshot. If the snapshot is being copied, the
     * copy operation is terminated.
     * </p>
     * <p>
     * <b>NOTE:</b>The DB cluster snapshot must be in the available state to
     * be deleted.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param deleteDBClusterSnapshotRequest Container for the necessary
     *           parameters to execute the DeleteDBClusterSnapshot service method on
     *           AmazonRDS.
     * 
     * @return The response from the DeleteDBClusterSnapshot service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBClusterSnapshotNotFoundException
     * @throws InvalidDBClusterSnapshotStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBClusterSnapshot deleteDBClusterSnapshot(DeleteDBClusterSnapshotRequest deleteDBClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified DB cluster parameter group. The DB cluster
     * parameter group to be deleted cannot be associated with any DB
     * clusters.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param deleteDBClusterParameterGroupRequest Container for the
     *           necessary parameters to execute the DeleteDBClusterParameterGroup
     *           service method on AmazonRDS.
     * 
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDBClusterParameterGroup(DeleteDBClusterParameterGroupRequest deleteDBClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new DB subnet group. DB subnet groups must contain at least
     * one subnet in at least two AZs in the region.
     * </p>
     *
     * @param createDBSubnetGroupRequest Container for the necessary
     *           parameters to execute the CreateDBSubnetGroup service method on
     *           AmazonRDS.
     * 
     * @return The response from the CreateDBSubnetGroup service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBSubnetQuotaExceededException
     * @throws DBSubnetGroupAlreadyExistsException
     * @throws DBSubnetGroupQuotaExceededException
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     * @throws InvalidSubnetException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSubnetGroup createDBSubnetGroup(CreateDBSubnetGroupRequest createDBSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all of the attributes for a customer account. The attributes
     * include Amazon RDS quotas for the account, such as the number of DB
     * instances allowed. The description for a quota includes the quota
     * name, current usage toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * This command does not take any parameters.
     * </p>
     *
     * @param describeAccountAttributesRequest Container for the necessary
     *           parameters to execute the DescribeAccountAttributes service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeAccountAttributes service
     *         method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of the available DB engines.
     * </p>
     *
     * @param describeDBEngineVersionsRequest Container for the necessary
     *           parameters to execute the DescribeDBEngineVersions service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBEngineVersions service method,
     *         as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBEngineVersionsResult describeDBEngineVersions(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the parameters of a DB parameter group. To modify more than
     * one parameter, submit a list of the following:
     * <code>ParameterName</code> , <code>ParameterValue</code> , and
     * <code>ApplyMethod</code> . A maximum of 20 parameters can be modified
     * in a single request.
     * </p>
     * <p>
     * <b>NOTE:</b> Changes to dynamic parameters are applied immediately.
     * Changes to static parameters require a reboot without failover to the
     * DB instance associated with the parameter group before the change can
     * take effect.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> After you modify a DB parameter group, you should
     * wait at least 5 minutes before creating your first DB instance that
     * uses that DB parameter group as the default parameter group. This
     * allows Amazon RDS to fully complete the modify action before the
     * parameter group is used as the default for a new DB instance. This is
     * especially important for parameters that are critical when creating
     * the default database for a DB instance, such as the character set for
     * the default database defined by the character_set_database parameter.
     * You can use the Parameter Groups option of the Amazon RDS console or
     * the DescribeDBParameters command to verify that your DB parameter
     * group has been created or modified.
     * </p>
     *
     * @param modifyDBParameterGroupRequest Container for the necessary
     *           parameters to execute the ModifyDBParameterGroup service method on
     *           AmazonRDS.
     * 
     * @return The response from the ModifyDBParameterGroup service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyDBParameterGroupResult modifyDBParameterGroup(ModifyDBParameterGroupRequest modifyDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the default engine and system parameter information for the
     * specified database engine.
     * </p>
     *
     * @param describeEngineDefaultParametersRequest Container for the
     *           necessary parameters to execute the DescribeEngineDefaultParameters
     *           service method on AmazonRDS.
     * 
     * @return The response from the DescribeEngineDefaultParameters service
     *         method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a snapshot of a DB cluster. For more information on Amazon
     * Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param createDBClusterSnapshotRequest Container for the necessary
     *           parameters to execute the CreateDBClusterSnapshot service method on
     *           AmazonRDS.
     * 
     * @return The response from the CreateDBClusterSnapshot service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterSnapshotStateException
     * @throws InvalidDBClusterStateException
     * @throws DBClusterSnapshotAlreadyExistsException
     * @throws SnapshotQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBClusterSnapshot createDBClusterSnapshot(CreateDBClusterSnapshotRequest createDBClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a DBSnapshot. The source DBInstance must be in "available"
     * state.
     * </p>
     *
     * @param createDBSnapshotRequest Container for the necessary parameters
     *           to execute the CreateDBSnapshot service method on AmazonRDS.
     * 
     * @return The response from the CreateDBSnapshot service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws SnapshotQuotaExceededException
     * @throws DBSnapshotAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSnapshot createDBSnapshot(CreateDBSnapshotRequest createDBSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a source identifier to an existing RDS event notification
     * subscription.
     * </p>
     *
     * @param addSourceIdentifierToSubscriptionRequest Container for the
     *           necessary parameters to execute the AddSourceIdentifierToSubscription
     *           service method on AmazonRDS.
     * 
     * @return The response from the AddSourceIdentifierToSubscription
     *         service method, as returned by AmazonRDS.
     * 
     * @throws SourceNotFoundException
     * @throws SubscriptionNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EventSubscription addSourceIdentifierToSubscription(AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the parameters of a DB parameter group to the engine/system
     * default value. To reset specific parameters submit a list of the
     * following: <code>ParameterName</code> and <code>ApplyMethod</code> .
     * To reset the entire DB parameter group, specify the
     * <code>DBParameterGroup</code> name and <code>ResetAllParameters</code>
     * parameters. When resetting the entire group, dynamic parameters are
     * updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance
     * restart or <code>RebootDBInstance</code> request.
     * </p>
     *
     * @param resetDBParameterGroupRequest Container for the necessary
     *           parameters to execute the ResetDBParameterGroup service method on
     *           AmazonRDS.
     * 
     * @return The response from the ResetDBParameterGroup service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResetDBParameterGroupResult resetDBParameterGroup(ResetDBParameterGroupRequest resetDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified DBParameterGroup. The DBParameterGroup to be
     * deleted cannot be associated with any DB instances.
     * </p>
     *
     * @param deleteDBParameterGroupRequest Container for the necessary
     *           parameters to execute the DeleteDBParameterGroup service method on
     *           AmazonRDS.
     * 
     * 
     * @throws DBParameterGroupNotFoundException
     * @throws InvalidDBParameterGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDBParameterGroup(DeleteDBParameterGroupRequest deleteDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of DB log files for the DB instance.
     * </p>
     *
     * @param describeDBLogFilesRequest Container for the necessary
     *           parameters to execute the DescribeDBLogFiles service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeDBLogFiles service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBLogFilesResult describeDBLogFiles(DescribeDBLogFilesRequest describeDBLogFilesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about reserved DB instances for this account, or
     * about a specified reserved DB instance.
     * </p>
     *
     * @param describeReservedDBInstancesRequest Container for the necessary
     *           parameters to execute the DescribeReservedDBInstances service method
     *           on AmazonRDS.
     * 
     * @return The response from the DescribeReservedDBInstances service
     *         method, as returned by AmazonRDS.
     * 
     * @throws ReservedDBInstanceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedDBInstancesResult describeReservedDBInstances(DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Forces a failover for a DB cluster.
     * </p>
     * <p>
     * A failover for a DB cluster promotes one of the read-only instances
     * in the DB cluster to the master DB instance (the cluster writer) and
     * deletes the current primary instance.
     * </p>
     * <p>
     * Amazon Aurora will automatically fail over to a read-only instance,
     * if one exists, when the primary instance fails. You can force a
     * failover when you want to simulate a failure of a DB instance for
     * testing. Because each instance in a DB cluster has its own endpoint
     * address, you will need to clean up and re-establish any existing
     * connections that use those endpoint addresses when the failover is
     * complete.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param failoverDBClusterRequest Container for the necessary parameters
     *           to execute the FailoverDBCluster service method on AmazonRDS.
     * 
     * @return The response from the FailoverDBCluster service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBCluster failoverDBCluster(FailoverDBClusterRequest failoverDBClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Promotes a Read Replica DB instance to a standalone DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> We recommend that you enable automated backups on your
     * Read Replica before promoting the Read Replica. This ensures that no
     * backup is taken during the promotion process. Once the instance is
     * promoted to a primary instance, backups are taken based on your backup
     * settings.
     * </p>
     *
     * @param promoteReadReplicaRequest Container for the necessary
     *           parameters to execute the PromoteReadReplica service method on
     *           AmazonRDS.
     * 
     * @return The response from the PromoteReadReplica service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     * @throws InvalidDBInstanceStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBInstance promoteReadReplica(PromoteReadReplicaRequest promoteReadReplicaRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds metadata tags to an Amazon RDS resource. These tags can also be
     * used with cost allocation reporting to track cost associated with
     * Amazon RDS resources, or used in a Condition statement in an IAM
     * policy for Amazon RDS.
     * </p>
     * <p>
     * For an overview on tagging Amazon RDS resources, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"> Tagging Amazon RDS Resources </a>
     * .
     * </p>
     *
     * @param addTagsToResourceRequest Container for the necessary parameters
     *           to execute the AddTagsToResource service method on AmazonRDS.
     * 
     * 
     * @throws DBInstanceNotFoundException
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modify a setting for an Amazon Aurora DB cluster. You can change one
     * or more database configuration parameters by specifying these
     * parameters and the new values in the request. For more information on
     * Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param modifyDBClusterRequest Container for the necessary parameters
     *           to execute the ModifyDBCluster service method on AmazonRDS.
     * 
     * @return The response from the ModifyDBCluster service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBSubnetGroupNotFoundException
     * @throws StorageQuotaExceededException
     * @throws InvalidVPCNetworkStateException
     * @throws DBClusterParameterGroupNotFoundException
     * @throws InvalidDBSubnetGroupStateException
     * @throws DBClusterNotFoundException
     * @throws InvalidDBInstanceStateException
     * @throws InvalidDBClusterStateException
     * @throws InvalidDBSecurityGroupStateException
     * @throws InvalidSubnetException
     * @throws DBClusterAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBCluster modifyDBCluster(ModifyDBClusterRequest modifyDBClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a snapshot of a DB cluster. For more information on Amazon
     * Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param copyDBClusterSnapshotRequest Container for the necessary
     *           parameters to execute the CopyDBClusterSnapshot service method on
     *           AmazonRDS.
     * 
     * @return The response from the CopyDBClusterSnapshot service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBClusterSnapshotNotFoundException
     * @throws InvalidDBClusterStateException
     * @throws DBClusterSnapshotAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBClusterSnapshot copyDBClusterSnapshot(CopyDBClusterSnapshotRequest copyDBClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Downloads all or a portion of the specified log file, up to 1 MB in
     * size.
     * </p>
     *
     * @param downloadDBLogFilePortionRequest Container for the necessary
     *           parameters to execute the DownloadDBLogFilePortion service method on
     *           AmazonRDS.
     * 
     * @return The response from the DownloadDBLogFilePortion service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBLogFileNotFoundException
     * @throws DBInstanceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DownloadDBLogFilePortionResult downloadDBLogFilePortion(DownloadDBLogFilePortionRequest downloadDBLogFilePortionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an RDS event notification subscription. This action requires
     * a topic ARN (Amazon Resource Name) created by either the RDS console,
     * the SNS console, or the SNS API. To obtain an ARN with SNS, you must
     * create a topic in Amazon SNS and subscribe to the topic. The ARN is
     * displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the type of source (SourceType) you want to be
     * notified of, provide a list of RDS sources (SourceIds) that triggers
     * the events, and provide a list of event categories (EventCategories)
     * for events you want to be notified of. For example, you can specify
     * SourceType = db-instance, SourceIds = mydbinstance1, mydbinstance2 and
     * EventCategories = Availability, Backup.
     * </p>
     * <p>
     * If you specify both the SourceType and SourceIds, such as SourceType
     * = db-instance and SourceIdentifier = myDBInstance1, you will be
     * notified of all the db-instance events for the specified source. If
     * you specify a SourceType but do not specify a SourceIdentifier, you
     * will receive notice of the events for that source type for all your
     * RDS sources. If you do not specify either the SourceType nor the
     * SourceIdentifier, you will be notified of events generated from all
     * RDS sources belonging to your customer account.
     * </p>
     *
     * @param createEventSubscriptionRequest Container for the necessary
     *           parameters to execute the CreateEventSubscription service method on
     *           AmazonRDS.
     * 
     * @return The response from the CreateEventSubscription service method,
     *         as returned by AmazonRDS.
     * 
     * @throws SourceNotFoundException
     * @throws SNSTopicArnNotFoundException
     * @throws SNSInvalidTopicException
     * @throws SubscriptionCategoryNotFoundException
     * @throws SNSNoAuthorizationException
     * @throws EventSubscriptionQuotaExceededException
     * @throws SubscriptionAlreadyExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EventSubscription createEventSubscription(CreateEventSubscriptionRequest createEventSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Revokes ingress from a DBSecurityGroup for previously authorized IP
     * ranges or EC2 or VPC Security Groups. Required parameters for this API
     * are one of CIDRIP, EC2SecurityGroupId for VPC, or
     * (EC2SecurityGroupOwnerId and either EC2SecurityGroupName or
     * EC2SecurityGroupId).
     * </p>
     *
     * @param revokeDBSecurityGroupIngressRequest Container for the necessary
     *           parameters to execute the RevokeDBSecurityGroupIngress service method
     *           on AmazonRDS.
     * 
     * @return The response from the RevokeDBSecurityGroupIngress service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBSecurityGroupNotFoundException
     * @throws InvalidDBSecurityGroupStateException
     * @throws AuthorizationNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSecurityGroup revokeDBSecurityGroupIngress(RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the set of CA certificates provided by Amazon RDS for this AWS
     * account.
     * </p>
     *
     * @param describeCertificatesRequest Container for the necessary
     *           parameters to execute the DescribeCertificates service method on
     *           AmazonRDS.
     * 
     * @return The response from the DescribeCertificates service method, as
     *         returned by AmazonRDS.
     * 
     * @throws CertificateNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCertificatesResult describeCertificates(DescribeCertificatesRequest describeCertificatesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new DB parameter group.
     * </p>
     * <p>
     * A DB parameter group is initially created with the default parameters
     * for the database engine used by the DB instance. To provide custom
     * values for any of the parameters, you must modify the group after
     * creating it using <i>ModifyDBParameterGroup</i> . Once you've created
     * a DB parameter group, you need to associate it with your DB instance
     * using <i>ModifyDBInstance</i> . When you associate a new DB parameter
     * group with a running DB instance, you need to reboot the DB instance
     * without failover for the new DB parameter group and associated
     * settings to take effect.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> After you create a DB parameter group, you should
     * wait at least 5 minutes before creating your first DB instance that
     * uses that DB parameter group as the default parameter group. This
     * allows Amazon RDS to fully complete the create action before the
     * parameter group is used as the default for a new DB instance. This is
     * especially important for parameters that are critical when creating
     * the default database for a DB instance, such as the character set for
     * the default database defined by the character_set_database parameter.
     * You can use the Parameter Groups option of the Amazon RDS console or
     * the DescribeDBParameters command to verify that your DB parameter
     * group has been created or modified.
     * </p>
     *
     * @param createDBParameterGroupRequest Container for the necessary
     *           parameters to execute the CreateDBParameterGroup service method on
     *           AmazonRDS.
     * 
     * @return The response from the CreateDBParameterGroup service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupQuotaExceededException
     * @throws DBParameterGroupAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBParameterGroup createDBParameterGroup(CreateDBParameterGroupRequest createDBParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of orderable DB instance options for the specified
     * engine.
     * </p>
     *
     * @param describeOrderableDBInstanceOptionsRequest Container for the
     *           necessary parameters to execute the DescribeOrderableDBInstanceOptions
     *           service method on AmazonRDS.
     * 
     * @return The response from the DescribeOrderableDBInstanceOptions
     *         service method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeOrderableDBInstanceOptionsResult describeOrderableDBInstanceOptions(DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an existing option group.
     * </p>
     *
     * @param deleteOptionGroupRequest Container for the necessary parameters
     *           to execute the DeleteOptionGroup service method on AmazonRDS.
     * 
     * 
     * @throws InvalidOptionGroupStateException
     * @throws OptionGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteOptionGroup(DeleteOptionGroupRequest deleteOptionGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists available reserved DB instance offerings.
     * </p>
     *
     * @param describeReservedDBInstancesOfferingsRequest Container for the
     *           necessary parameters to execute the
     *           DescribeReservedDBInstancesOfferings service method on AmazonRDS.
     * 
     * @return The response from the DescribeReservedDBInstancesOfferings
     *         service method, as returned by AmazonRDS.
     * 
     * @throws ReservedDBInstancesOfferingNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedDBInstancesOfferingsResult describeReservedDBInstancesOfferings(DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of resources (for example, DB instances) that have at
     * least one pending maintenance action.
     * </p>
     * 
     * @return The response from the DescribePendingMaintenanceActions
     *         service method, as returned by AmazonRDS.
     * 
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePendingMaintenanceActionsResult describePendingMaintenanceActions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the available option groups.
     * </p>
     * 
     * @return The response from the DescribeOptionGroups service method, as
     *         returned by AmazonRDS.
     * 
     * @throws OptionGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeOptionGroupsResult describeOptionGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns information about provisioned RDS instances. This API
     * supports pagination.
     * </p>
     * 
     * @return The response from the DescribeDBInstances service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBInstanceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBInstancesResult describeDBInstances() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions.
     * If a <code>DBClusterParameterGroupName</code> parameter is specified,
     * the list will contain only the description of the specified DB cluster
     * parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return The response from the DescribeDBClusterParameterGroups service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of DB snapshot attribute names and values for a manual
     * DB snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other AWS accounts,
     * <code>DescribeDBSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of the AWS account ids that
     * are authorized to copy or restore the manual DB snapshot. If
     * <code>all</code> is included in the list of values for the
     * <code>restore</code> attribute, then the manual DB snapshot is public
     * and can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a
     * manual DB snapshot, or to make the manual DB snapshot public or
     * private, use the ModifyDBSnapshotAttribute API.
     * </p>
     * 
     * @return The response from the DescribeDBSnapshotAttributes service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBSnapshotAttributesResult describeDBSnapshotAttributes() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns information about DB cluster snapshots. This API supports
     * pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return The response from the DescribeDBClusterSnapshots service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBClusterSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBClusterSnapshotsResult describeDBClusterSnapshots() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Displays a list of categories for all event source types, or, if
     * specified, for a specified source type. You can see a list of the
     * event categories and source types in the
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"> Events </a>
     * topic in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return The response from the DescribeEventCategories service method,
     *         as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventCategoriesResult describeEventCategories() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns information about provisioned Aurora DB clusters. This API
     * supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return The response from the DescribeDBClusters service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBClustersResult describeDBClusters() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns events related to DB instances, DB security groups, DB
     * snapshots, and DB parameter groups for the past 14 days. Events
     * specific to a particular DB instance, DB security group, database
     * snapshot, or DB parameter group can be obtained by providing the name
     * as a parameter. By default, the past hour of events are returned.
     * </p>
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of <code>DBSecurityGroup</code> descriptions. If a
     * <code>DBSecurityGroupName</code> is specified, the list will contain
     * only the descriptions of the specified DB security group.
     * </p>
     * 
     * @return The response from the DescribeDBSecurityGroups service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBSecurityGroupsResult describeDBSecurityGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName
     * is specified, the list will contain only the descriptions of the
     * specified DBSubnetGroup.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the
     * <a href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"> Wikipedia Tutorial </a>
     * .
     * </p>
     * 
     * @return The response from the DescribeDBSubnetGroups service method,
     *         as returned by AmazonRDS.
     * 
     * @throws DBSubnetGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBSubnetGroupsResult describeDBSubnetGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of <code>DBParameterGroup</code> descriptions. If a
     * <code>DBParameterGroupName</code> is specified, the list will contain
     * only the description of the specified DB parameter group.
     * </p>
     * 
     * @return The response from the DescribeDBParameterGroups service
     *         method, as returned by AmazonRDS.
     * 
     * @throws DBParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBParameterGroupsResult describeDBParameterGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists all the subscription descriptions for a customer account. The
     * description for a subscription includes SubscriptionName, SNSTopicARN,
     * CustomerID, SourceType, SourceID, CreationTime, and Status.
     * </p>
     * <p>
     * If you specify a SubscriptionName, lists the description for that
     * subscription.
     * </p>
     * 
     * @return The response from the DescribeEventSubscriptions service
     *         method, as returned by AmazonRDS.
     * 
     * @throws SubscriptionNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventSubscriptionsResult describeEventSubscriptions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns information about DB snapshots. This API supports pagination.
     * </p>
     * 
     * @return The response from the DescribeDBSnapshots service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBSnapshotsResult describeDBSnapshots() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists all of the attributes for a customer account. The attributes
     * include Amazon RDS quotas for the account, such as the number of DB
     * instances allowed. The description for a quota includes the quota
     * name, current usage toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * This command does not take any parameters.
     * </p>
     * 
     * @return The response from the DescribeAccountAttributes service
     *         method, as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAccountAttributesResult describeAccountAttributes() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of the available DB engines.
     * </p>
     * 
     * @return The response from the DescribeDBEngineVersions service method,
     *         as returned by AmazonRDS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDBEngineVersionsResult describeDBEngineVersions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns information about reserved DB instances for this account, or
     * about a specified reserved DB instance.
     * </p>
     * 
     * @return The response from the DescribeReservedDBInstances service
     *         method, as returned by AmazonRDS.
     * 
     * @throws ReservedDBInstanceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedDBInstancesResult describeReservedDBInstances() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Forces a failover for a DB cluster.
     * </p>
     * <p>
     * A failover for a DB cluster promotes one of the read-only instances
     * in the DB cluster to the master DB instance (the cluster writer) and
     * deletes the current primary instance.
     * </p>
     * <p>
     * Amazon Aurora will automatically fail over to a read-only instance,
     * if one exists, when the primary instance fails. You can force a
     * failover when you want to simulate a failure of a DB instance for
     * testing. Because each instance in a DB cluster has its own endpoint
     * address, you will need to clean up and re-establish any existing
     * connections that use those endpoint addresses when the failover is
     * complete.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see
     * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return The response from the FailoverDBCluster service method, as
     *         returned by AmazonRDS.
     * 
     * @throws DBClusterNotFoundException
     * @throws InvalidDBClusterStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DBCluster failoverDBCluster() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists the set of CA certificates provided by Amazon RDS for this AWS
     * account.
     * </p>
     * 
     * @return The response from the DescribeCertificates service method, as
     *         returned by AmazonRDS.
     * 
     * @throws CertificateNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCertificatesResult describeCertificates() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists available reserved DB instance offerings.
     * </p>
     * 
     * @return The response from the DescribeReservedDBInstancesOfferings
     *         service method, as returned by AmazonRDS.
     * 
     * @throws ReservedDBInstancesOfferingNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRDS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedDBInstancesOfferingsResult describeReservedDBInstancesOfferings() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        