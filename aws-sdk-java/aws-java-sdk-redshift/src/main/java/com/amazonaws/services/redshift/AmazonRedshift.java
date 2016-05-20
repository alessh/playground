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
package com.amazonaws.services.redshift;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.redshift.model.*;

/**
 * Interface for accessing AmazonRedshift.
 * Amazon Redshift <b>Overview</b> <p>
 * This is an interface reference for Amazon Redshift. It contains
 * documentation for one of the programming or command line interfaces
 * you can use to manage Amazon Redshift clusters. Note that Amazon
 * Redshift is asynchronous, which means that some interfaces may require
 * techniques, such as polling or asynchronous callback handlers, to
 * determine when a command has been applied. In this reference, the
 * parameter descriptions indicate whether a change is applied
 * immediately, on the next instance reboot, or during the next
 * maintenance window. For a summary of the Amazon Redshift cluster
 * management interfaces, go to
 * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/using-aws-sdk.html"> Using the Amazon Redshift Management Interfaces </a>
 * .
 * </p>
 * <p>
 * Amazon Redshift manages all the work of setting up, operating, and
 * scaling a data warehouse: provisioning capacity, monitoring and
 * backing up the cluster, and applying patches and upgrades to the
 * Amazon Redshift engine. You can focus on using your data to acquire
 * new insights for your business and customers.
 * </p>
 * <p>
 * If you are a first-time user of Amazon Redshift, we recommend that you
 * begin by reading the The
 * <a href="http://docs.aws.amazon.com/redshift/latest/gsg/getting-started.html"> Amazon Redshift Getting Started Guide </a>
 * 
 * </p>
 * <p>
 * If you are a database developer, the
 * <a href="http://docs.aws.amazon.com/redshift/latest/dg/welcome.html"> Amazon Redshift Database Developer Guide </a>
 * explains how to design, build, query, and maintain the databases
 * that make up your data warehouse.
 * </p>
 */
public interface AmazonRedshift {

    /**
     * Overrides the default endpoint for this client ("https://redshift.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "redshift.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://redshift.us-east-1.amazonaws.com"). If the
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
     *            The endpoint (ex: "redshift.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://redshift.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonRedshift#setEndpoint(String)}, sets the
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
     * Removes the ability of the specified AWS customer account to restore
     * the specified snapshot. If the account is currently restoring the
     * snapshot, the restore will run to completion.
     * </p>
     * <p>
     * For more information about working with snapshots, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html"> Amazon Redshift Snapshots </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param revokeSnapshotAccessRequest Container for the necessary
     *           parameters to execute the RevokeSnapshotAccess service method on
     *           AmazonRedshift.
     * 
     * @return The response from the RevokeSnapshotAccess service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws AccessToSnapshotDeniedException
     * @throws ClusterSnapshotNotFoundException
     * @throws AuthorizationNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Snapshot revokeSnapshotAccess(RevokeSnapshotAccessRequest revokeSnapshotAccessRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the number of days to retain automated snapshots in the
     * destination region after they are copied from the source region.
     * </p>
     *
     * @param modifySnapshotCopyRetentionPeriodRequest Container for the
     *           necessary parameters to execute the ModifySnapshotCopyRetentionPeriod
     *           service method on AmazonRedshift.
     * 
     * @return The response from the ModifySnapshotCopyRetentionPeriod
     *         service method, as returned by AmazonRedshift.
     * 
     * @throws SnapshotCopyDisabledException
     * @throws UnauthorizedOperationException
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster modifySnapshotCopyRetentionPeriod(ModifySnapshotCopyRetentionPeriodRequest modifySnapshotCopyRetentionPeriodRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies a cluster subnet group to include the specified list of VPC
     * subnets. The operation replaces the existing list of subnets with the
     * new list of subnets.
     * </p>
     *
     * @param modifyClusterSubnetGroupRequest Container for the necessary
     *           parameters to execute the ModifyClusterSubnetGroup service method on
     *           AmazonRedshift.
     * 
     * @return The response from the ModifyClusterSubnetGroup service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws SubnetAlreadyInUseException
     * @throws InvalidSubnetException
     * @throws UnauthorizedOperationException
     * @throws DependentServiceRequestThrottlingException
     * @throws ClusterSubnetQuotaExceededException
     * @throws ClusterSubnetGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ClusterSubnetGroup modifyClusterSubnetGroup(ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allows you to purchase reserved nodes. Amazon Redshift offers a
     * predefined set of reserved node offerings. You can purchase one or
     * more of the offerings. You can call the DescribeReservedNodeOfferings
     * API to obtain the available reserved node offerings. You can call this
     * API by providing a specific reserved node offering and the number of
     * nodes you want to reserve.
     * </p>
     * <p>
     * For more information about reserved node offerings, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html"> Purchasing Reserved Nodes </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param purchaseReservedNodeOfferingRequest Container for the necessary
     *           parameters to execute the PurchaseReservedNodeOffering service method
     *           on AmazonRedshift.
     * 
     * @return The response from the PurchaseReservedNodeOffering service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws UnsupportedOperationException
     * @throws ReservedNodeAlreadyExistsException
     * @throws ReservedNodeOfferingNotFoundException
     * @throws ReservedNodeQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReservedNode purchaseReservedNodeOffering(PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Amazon Redshift HSM configuration.
     * </p>
     *
     * @param deleteHsmConfigurationRequest Container for the necessary
     *           parameters to execute the DeleteHsmConfiguration service method on
     *           AmazonRedshift.
     * 
     * 
     * @throws HsmConfigurationNotFoundException
     * @throws InvalidHsmConfigurationStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteHsmConfiguration(DeleteHsmConfigurationRequest deleteHsmConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops logging information, such as queries and connection attempts,
     * for the specified Amazon Redshift cluster.
     * </p>
     *
     * @param disableLoggingRequest Container for the necessary parameters to
     *           execute the DisableLogging service method on AmazonRedshift.
     * 
     * @return The response from the DisableLogging service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableLoggingResult disableLogging(DisableLoggingRequest disableLoggingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified snapshot copy grant.
     * </p>
     *
     * @param deleteSnapshotCopyGrantRequest Container for the necessary
     *           parameters to execute the DeleteSnapshotCopyGrant service method on
     *           AmazonRedshift.
     * 
     * 
     * @throws InvalidSnapshotCopyGrantStateException
     * @throws SnapshotCopyGrantNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSnapshotCopyGrant(DeleteSnapshotCopyGrantRequest deleteSnapshotCopyGrantRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the settings for a cluster. For example, you can add another
     * security or parameter group, update the preferred maintenance window,
     * or change the master user password. Resetting a cluster password or
     * modifying the security groups associated with a cluster do not need a
     * reboot. However, modifying a parameter group requires a reboot for
     * parameters to take effect. For more information about managing
     * clusters, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     * <p>
     * You can also change node type and the number of nodes to scale up or
     * down the cluster. When resizing a cluster, you must specify both the
     * number of nodes and the node type even if one of the parameters does
     * not change.
     * </p>
     *
     * @param modifyClusterRequest Container for the necessary parameters to
     *           execute the ModifyCluster service method on AmazonRedshift.
     * 
     * @return The response from the ModifyCluster service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws InvalidElasticIpException
     * @throws InvalidClusterSecurityGroupStateException
     * @throws HsmConfigurationNotFoundException
     * @throws DependentServiceRequestThrottlingException
     * @throws InvalidClusterStateException
     * @throws UnsupportedOptionException
     * @throws ClusterAlreadyExistsException
     * @throws ClusterParameterGroupNotFoundException
     * @throws InsufficientClusterCapacityException
     * @throws UnauthorizedOperationException
     * @throws NumberOfNodesQuotaExceededException
     * @throws ClusterNotFoundException
     * @throws LimitExceededException
     * @throws HsmClientCertificateNotFoundException
     * @throws ClusterSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster modifyCluster(ModifyClusterRequest modifyClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a tag or tags from a resource. You must provide the ARN of
     * the resource from which you want to delete the tag or tags.
     * </p>
     *
     * @param deleteTagsRequest Container for the necessary parameters to
     *           execute the DeleteTags service method on AmazonRedshift.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidTagException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteTags(DeleteTagsRequest deleteTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Copies the specified automated cluster snapshot to a new manual
     * cluster snapshot. The source must be an automated snapshot and it must
     * be in the available state.
     * </p>
     * <p>
     * When you delete a cluster, Amazon Redshift deletes any automated
     * snapshots of the cluster. Also, when the retention period of the
     * snapshot expires, Amazon Redshift automatically deletes it. If you
     * want to keep an automated snapshot for a longer period, you can make a
     * manual copy of the snapshot. Manual snapshots are retained until you
     * delete them.
     * </p>
     * <p>
     * For more information about working with snapshots, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html"> Amazon Redshift Snapshots </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param copyClusterSnapshotRequest Container for the necessary
     *           parameters to execute the CopyClusterSnapshot service method on
     *           AmazonRedshift.
     * 
     * @return The response from the CopyClusterSnapshot service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterSnapshotAlreadyExistsException
     * @throws ClusterSnapshotNotFoundException
     * @throws ClusterSnapshotQuotaExceededException
     * @throws InvalidClusterSnapshotStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Snapshot copyClusterSnapshot(CopyClusterSnapshotRequest copyClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of orderable cluster options. Before you create a new
     * cluster you can use this operation to find what options are available,
     * such as the EC2 Availability Zones (AZ) in the specific AWS region
     * that you can specify, and the node types you can request. The node
     * types differ by available storage, memory, CPU and price. With the
     * cost involved you might want to obtain a list of cluster options in
     * the specific region and specify values when creating a cluster. For
     * more information about managing clusters, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>
     * </p>
     *
     * @param describeOrderableClusterOptionsRequest Container for the
     *           necessary parameters to execute the DescribeOrderableClusterOptions
     *           service method on AmazonRedshift.
     * 
     * @return The response from the DescribeOrderableClusterOptions service
     *         method, as returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeOrderableClusterOptionsResult describeOrderableClusterOptions(DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts logging information, such as queries and connection attempts,
     * for the specified Amazon Redshift cluster.
     * </p>
     *
     * @param enableLoggingRequest Container for the necessary parameters to
     *           execute the EnableLogging service method on AmazonRedshift.
     * 
     * @return The response from the EnableLogging service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws InvalidS3KeyPrefixException
     * @throws InvalidS3BucketNameException
     * @throws BucketNotFoundException
     * @throws ClusterNotFoundException
     * @throws InsufficientS3BucketPolicyException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableLoggingResult enableLogging(EnableLoggingRequest enableLoggingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Amazon Redshift subnet group. You must provide a list
     * of one or more subnets in your existing Amazon Virtual Private Cloud
     * (Amazon VPC) when creating Amazon Redshift subnet group.
     * </p>
     * <p>
     * For information about subnet groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-cluster-subnet-groups.html"> Amazon Redshift Cluster Subnet Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param createClusterSubnetGroupRequest Container for the necessary
     *           parameters to execute the CreateClusterSubnetGroup service method on
     *           AmazonRedshift.
     * 
     * @return The response from the CreateClusterSubnetGroup service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws TagLimitExceededException
     * @throws InvalidSubnetException
     * @throws InvalidTagException
     * @throws UnauthorizedOperationException
     * @throws DependentServiceRequestThrottlingException
     * @throws ClusterSubnetQuotaExceededException
     * @throws ClusterSubnetGroupAlreadyExistsException
     * @throws ClusterSubnetGroupQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ClusterSubnetGroup createClusterSubnetGroup(CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the status of one or more table restore requests made using the
     * RestoreTableFromClusterSnapshot API action. If you don't specify a
     * value for the <code>TableRestoreRequestId</code> parameter, then
     * <code>DescribeTableRestoreStatus</code> returns the status of all
     * table restore requests ordered by the date and time of the request in
     * ascending order. Otherwise <code>DescribeTableRestoreStatus</code>
     * returns the status of the table specified by
     * <code>TableRestoreRequestId</code> .
     * </p>
     *
     * @param describeTableRestoreStatusRequest Container for the necessary
     *           parameters to execute the DescribeTableRestoreStatus service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeTableRestoreStatus service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ClusterNotFoundException
     * @throws TableRestoreNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTableRestoreStatusResult describeTableRestoreStatus(DescribeTableRestoreStatusRequest describeTableRestoreStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified HSM client certificate.
     * </p>
     *
     * @param deleteHsmClientCertificateRequest Container for the necessary
     *           parameters to execute the DeleteHsmClientCertificate service method on
     *           AmazonRedshift.
     * 
     * 
     * @throws InvalidHsmClientCertificateStateException
     * @throws HsmClientCertificateNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteHsmClientCertificate(DeleteHsmClientCertificateRequest deleteHsmClientCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reboots a cluster. This action is taken as soon as possible. It
     * results in a momentary outage to the cluster, during which the cluster
     * status is set to <code>rebooting</code> . A cluster event is created
     * when the reboot is completed. Any pending cluster modifications (see
     * ModifyCluster) are applied at this reboot. For more information about
     * managing clusters, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>
     * </p>
     *
     * @param rebootClusterRequest Container for the necessary parameters to
     *           execute the RebootCluster service method on AmazonRedshift.
     * 
     * @return The response from the RebootCluster service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster rebootCluster(RebootClusterRequest rebootClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified cluster subnet group.
     * </p>
     *
     * @param deleteClusterSubnetGroupRequest Container for the necessary
     *           parameters to execute the DeleteClusterSubnetGroup service method on
     *           AmazonRedshift.
     * 
     * 
     * @throws InvalidClusterSubnetStateException
     * @throws ClusterSubnetGroupNotFoundException
     * @throws InvalidClusterSubnetGroupStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest deleteClusterSubnetGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a manual snapshot of the specified cluster. The cluster must
     * be in the <code>available</code> state.
     * </p>
     * <p>
     * For more information about working with snapshots, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html"> Amazon Redshift Snapshots </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param createClusterSnapshotRequest Container for the necessary
     *           parameters to execute the CreateClusterSnapshot service method on
     *           AmazonRedshift.
     * 
     * @return The response from the CreateClusterSnapshot service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws TagLimitExceededException
     * @throws ClusterSnapshotAlreadyExistsException
     * @throws InvalidTagException
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     * @throws ClusterSnapshotQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Snapshot createClusterSnapshot(CreateClusterSnapshotRequest createClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a previously provisioned cluster. A successful response from
     * the web service indicates that the request was received correctly. Use
     * DescribeClusters to monitor the status of the deletion. The delete
     * operation cannot be canceled or reverted once submitted. For more
     * information about managing clusters, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     * <p>
     * If you want to shut down the cluster and retain it for future use,
     * set <i>SkipFinalClusterSnapshot</i> to <code>false</code> and specify
     * a name for <i>FinalClusterSnapshotIdentifier</i> . You can later
     * restore this snapshot to resume using the cluster. If a final cluster
     * snapshot is requested, the status of the cluster will be
     * "final-snapshot" while the snapshot is being taken, then it's
     * "deleting" once Amazon Redshift begins deleting the cluster.
     * </p>
     * <p>
     * For more information about managing clusters, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param deleteClusterRequest Container for the necessary parameters to
     *           execute the DeleteCluster service method on AmazonRedshift.
     * 
     * @return The response from the DeleteCluster service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterSnapshotAlreadyExistsException
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     * @throws ClusterSnapshotQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster deleteCluster(DeleteClusterRequest deleteClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new cluster. To create the cluster in virtual private cloud
     * (VPC), you must provide cluster subnet group name. If you don't
     * provide a cluster subnet group name or the cluster security group
     * parameter, Amazon Redshift creates a non-VPC cluster, it associates
     * the default cluster security group with the cluster. For more
     * information about managing clusters, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param createClusterRequest Container for the necessary parameters to
     *           execute the CreateCluster service method on AmazonRedshift.
     * 
     * @return The response from the CreateCluster service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws InvalidElasticIpException
     * @throws InvalidSubnetException
     * @throws HsmConfigurationNotFoundException
     * @throws InvalidTagException
     * @throws DependentServiceRequestThrottlingException
     * @throws ClusterSubnetGroupNotFoundException
     * @throws InvalidClusterSubnetGroupStateException
     * @throws ClusterAlreadyExistsException
     * @throws InvalidVPCNetworkStateException
     * @throws ClusterParameterGroupNotFoundException
     * @throws TagLimitExceededException
     * @throws UnauthorizedOperationException
     * @throws InsufficientClusterCapacityException
     * @throws NumberOfNodesQuotaExceededException
     * @throws NumberOfNodesPerClusterLimitExceededException
     * @throws LimitExceededException
     * @throws ClusterQuotaExceededException
     * @throws ClusterSecurityGroupNotFoundException
     * @throws HsmClientCertificateNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster createCluster(CreateClusterRequest createClusterRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns events related to clusters, security groups, snapshots, and
     * parameter groups for the past 14 days. Events specific to a particular
     * cluster, security group, snapshot or parameter group can be obtained
     * by providing the name as a parameter. By default, the past hour of
     * events are returned.
     * </p>
     *
     * @param describeEventsRequest Container for the necessary parameters to
     *           execute the DescribeEvents service method on AmazonRedshift.
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds an inbound (ingress) rule to an Amazon Redshift security group.
     * Depending on whether the application accessing your cluster is running
     * on the Internet or an Amazon EC2 instance, you can authorize inbound
     * access to either a Classless Interdomain Routing (CIDR)/Internet
     * Protocol (IP) range or to an Amazon EC2 security group. You can add as
     * many as 20 ingress rules to an Amazon Redshift security group.
     * </p>
     * <p>
     * If you authorize access to an Amazon EC2 security group, specify
     * <i>EC2SecurityGroupName</i> and <i>EC2SecurityGroupOwnerId</i> . The
     * Amazon EC2 security group and Amazon Redshift cluster must be in the
     * same AWS region.
     * </p>
     * <p>
     * If you authorize access to a CIDR/IP address range, specify
     * <i>CIDRIP</i> . For an overview of CIDR blocks, see the Wikipedia
     * article on
     * <a href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"> Classless Inter-Domain Routing </a>
     * .
     * </p>
     * <p>
     * You must also associate the security group with a cluster so that
     * clients running on these IP addresses or the EC2 instance are
     * authorized to connect to the cluster. For information about managing
     * security groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"> Working with Security Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param authorizeClusterSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the
     *           AuthorizeClusterSecurityGroupIngress service method on AmazonRedshift.
     * 
     * @return The response from the AuthorizeClusterSecurityGroupIngress
     *         service method, as returned by AmazonRedshift.
     * 
     * @throws InvalidClusterSecurityGroupStateException
     * @throws AuthorizationAlreadyExistsException
     * @throws AuthorizationQuotaExceededException
     * @throws ClusterSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ClusterSecurityGroup authorizeClusterSecurityGroupIngress(AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Rotates the encryption keys for a cluster.
     * </p>
     *
     * @param rotateEncryptionKeyRequest Container for the necessary
     *           parameters to execute the RotateEncryptionKey service method on
     *           AmazonRedshift.
     * 
     * @return The response from the RotateEncryptionKey service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws InvalidClusterStateException
     * @throws DependentServiceRequestThrottlingException
     * @throws ClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster rotateEncryptionKey(RotateEncryptionKeyRequest rotateEncryptionKeyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an Amazon Redshift security group.
     * </p>
     * <p>
     * <b>NOTE:</b>You cannot delete a security group that is associated
     * with any clusters. You cannot delete the default security group.
     * </p>
     * <p>
     * For information about managing security groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"> Amazon Redshift Cluster Security Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param deleteClusterSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteClusterSecurityGroup service method on
     *           AmazonRedshift.
     * 
     * 
     * @throws InvalidClusterSecurityGroupStateException
     * @throws ClusterSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteClusterSecurityGroup(DeleteClusterSecurityGroupRequest deleteClusterSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the descriptions of the reserved nodes.
     * </p>
     *
     * @param describeReservedNodesRequest Container for the necessary
     *           parameters to execute the DescribeReservedNodes service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeReservedNodes service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ReservedNodeNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedNodesResult describeReservedNodes(DescribeReservedNodesRequest describeReservedNodesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of parameter settings for the specified parameter
     * group family.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"> Amazon Redshift Parameter Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param describeDefaultClusterParametersRequest Container for the
     *           necessary parameters to execute the DescribeDefaultClusterParameters
     *           service method on AmazonRedshift.
     * 
     * @return The response from the DescribeDefaultClusterParameters service
     *         method, as returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefaultClusterParameters describeDefaultClusterParameters(DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies an existing Amazon Redshift event notification subscription.
     * </p>
     *
     * @param modifyEventSubscriptionRequest Container for the necessary
     *           parameters to execute the ModifyEventSubscription service method on
     *           AmazonRedshift.
     * 
     * @return The response from the ModifyEventSubscription service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws SubscriptionCategoryNotFoundException
     * @throws InvalidSubscriptionStateException
     * @throws SubscriptionEventIdNotFoundException
     * @throws SubscriptionSeverityNotFoundException
     * @throws SourceNotFoundException
     * @throws SNSNoAuthorizationException
     * @throws SNSTopicArnNotFoundException
     * @throws SubscriptionNotFoundException
     * @throws SNSInvalidTopicException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EventSubscription modifyEventSubscription(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Amazon Redshift security group. You use security groups
     * to control access to non-VPC clusters.
     * </p>
     * <p>
     * For information about managing security groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"> Amazon Redshift Cluster Security Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param createClusterSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateClusterSecurityGroup service method on
     *           AmazonRedshift.
     * 
     * @return The response from the CreateClusterSecurityGroup service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws ClusterSecurityGroupQuotaExceededException
     * @throws ClusterSecurityGroupAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ClusterSecurityGroup createClusterSecurityGroup(CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the last resize operation for the specified
     * cluster. If no resize operation has ever been initiated for the
     * specified cluster, a <code>HTTP 404</code> error is returned. If a
     * resize operation was initiated and completed, the status of the resize
     * remains as <code>SUCCEEDED</code> until the next resize.
     * </p>
     * <p>
     * A resize operation can be requested using ModifyCluster and
     * specifying a different number or type of nodes for the cluster.
     * </p>
     *
     * @param describeResizeRequest Container for the necessary parameters to
     *           execute the DescribeResize service method on AmazonRedshift.
     * 
     * @return The response from the DescribeResize service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterNotFoundException
     * @throws ResizeNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeResizeResult describeResize(DescribeResizeRequest describeResizeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns descriptions of the available Amazon Redshift cluster
     * versions. You can call this operation even before creating any
     * clusters to learn more about the Amazon Redshift versions. For more
     * information about managing clusters, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>
     * </p>
     *
     * @param describeClusterVersionsRequest Container for the necessary
     *           parameters to execute the DescribeClusterVersions service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeClusterVersions service method,
     *         as returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterVersionsResult describeClusterVersions(DescribeClusterVersionsRequest describeClusterVersionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new table from a table in an Amazon Redshift cluster
     * snapshot. You must create the new table within the Amazon Redshift
     * cluster that the snapshot was taken from.
     * </p>
     * <p>
     * You cannot use <code>RestoreTableFromClusterSnapshot</code> to
     * restore a table with the same name as an existing table in an Amazon
     * Redshift cluster. That is, you cannot overwrite an existing table in a
     * cluster with a restored table. If you want to replace your original
     * table with a new, restored table, then rename or drop your original
     * table before you call <code>RestoreTableFromClusterSnapshot</code> .
     * When you have renamed your original table, then you can pass the
     * original name of the table as the <code>NewTableName</code> parameter
     * value in the call to <code>RestoreTableFromClusterSnapshot</code> .
     * This way, you can replace the original table with the table created
     * from the snapshot.
     * </p>
     *
     * @param restoreTableFromClusterSnapshotRequest Container for the
     *           necessary parameters to execute the RestoreTableFromClusterSnapshot
     *           service method on AmazonRedshift.
     * 
     * @return The response from the RestoreTableFromClusterSnapshot service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InProgressTableRestoreQuotaExceededException
     * @throws InvalidClusterStateException
     * @throws UnsupportedOperationException
     * @throws ClusterNotFoundException
     * @throws ClusterSnapshotNotFoundException
     * @throws InvalidTableRestoreArgumentException
     * @throws InvalidClusterSnapshotStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TableRestoreStatus restoreTableFromClusterSnapshot(RestoreTableFromClusterSnapshotRequest restoreTableFromClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
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
     * @param restoreFromClusterSnapshotRequest Container for the necessary
     *           parameters to execute the RestoreFromClusterSnapshot service method on
     *           AmazonRedshift.
     * 
     * @return The response from the RestoreFromClusterSnapshot service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidElasticIpException
     * @throws InvalidSubnetException
     * @throws HsmConfigurationNotFoundException
     * @throws DependentServiceRequestThrottlingException
     * @throws ClusterSubnetGroupNotFoundException
     * @throws InvalidClusterSubnetGroupStateException
     * @throws ClusterAlreadyExistsException
     * @throws InvalidVPCNetworkStateException
     * @throws ClusterParameterGroupNotFoundException
     * @throws InvalidClusterSnapshotStateException
     * @throws AccessToSnapshotDeniedException
     * @throws InvalidRestoreException
     * @throws InsufficientClusterCapacityException
     * @throws UnauthorizedOperationException
     * @throws NumberOfNodesQuotaExceededException
     * @throws NumberOfNodesPerClusterLimitExceededException
     * @throws LimitExceededException
     * @throws ClusterSnapshotNotFoundException
     * @throws ClusterQuotaExceededException
     * @throws HsmClientCertificateNotFoundException
     * @throws ClusterSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the list of AWS Identity and Access Management (IAM) roles
     * that can be used by the cluster to access other AWS services.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     *
     * @param modifyClusterIamRolesRequest Container for the necessary
     *           parameters to execute the ModifyClusterIamRoles service method on
     *           AmazonRedshift.
     * 
     * @return The response from the ModifyClusterIamRoles service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster modifyClusterIamRoles(ModifyClusterIamRolesRequest modifyClusterIamRolesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more tags to a specified resource.
     * </p>
     * <p>
     * A resource can have up to 10 tags. If you try to create more than 10
     * tags for a resource, you will receive an error and the attempt will
     * fail.
     * </p>
     * <p>
     * If you specify a key that already exists for the resource, the value
     * for that key will be updated with the new value.
     * </p>
     *
     * @param createTagsRequest Container for the necessary parameters to
     *           execute the CreateTags service method on AmazonRedshift.
     * 
     * 
     * @throws TagLimitExceededException
     * @throws ResourceNotFoundException
     * @throws InvalidTagException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createTags(CreateTagsRequest createTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of tags. You can return tags from a specific resource
     * by specifying an ARN, or you can return all tags for a given type of
     * resource, such as clusters, snapshots, and so on.
     * </p>
     * <p>
     * The following are limitations for <code>DescribeTags</code> :
     * <ul>
     * <li>You cannot specify an ARN and a resource-type value together in
     * the same request.</li>
     * <li>You cannot use the <code>MaxRecords</code> and
     * <code>Marker</code> parameters together with the ARN parameter.</li>
     * <li>The <code>MaxRecords</code> parameter can be a range from 10 to
     * 50 results to return in a request.</li>
     * 
     * </ul>
     * 
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all resources that match any combination of
     * the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all resources
     * that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, resources
     * are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags service method on AmazonRedshift.
     * 
     * @return The response from the DescribeTags service method, as returned
     *         by AmazonRedshift.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidTagException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the parameters of a parameter group.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"> Amazon Redshift Parameter Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param modifyClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the ModifyClusterParameterGroup service method
     *           on AmazonRedshift.
     * 
     * @return The response from the ModifyClusterParameterGroup service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidClusterParameterGroupStateException
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyClusterParameterGroupResult modifyClusterParameterGroup(ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Displays a list of event categories for all event source types, or
     * for a specified source type. For a list of the event categories and
     * source types, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html"> Amazon Redshift Event Notifications </a>
     * .
     * </p>
     *
     * @param describeEventCategoriesRequest Container for the necessary
     *           parameters to execute the DescribeEventCategories service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeEventCategories service method,
     *         as returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest describeEventCategoriesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about Amazon Redshift security groups. If the
     * name of a security group is specified, the response will contain only
     * information about only that security group.
     * </p>
     * <p>
     * For information about managing security groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"> Amazon Redshift Cluster Security Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all security groups that match any combination
     * of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all security
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, security
     * groups are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     *
     * @param describeClusterSecurityGroupsRequest Container for the
     *           necessary parameters to execute the DescribeClusterSecurityGroups
     *           service method on AmazonRedshift.
     * 
     * @return The response from the DescribeClusterSecurityGroups service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws ClusterSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterSecurityGroupsResult describeClusterSecurityGroups(DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns one or more cluster subnet group objects, which contain
     * metadata about your cluster subnet groups. By default, this operation
     * returns information about all cluster subnet groups that are defined
     * in you AWS account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all subnet groups that match any combination
     * of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all subnet
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, subnet
     * groups are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     *
     * @param describeClusterSubnetGroupsRequest Container for the necessary
     *           parameters to execute the DescribeClusterSubnetGroups service method
     *           on AmazonRedshift.
     * 
     * @return The response from the DescribeClusterSubnetGroups service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws ClusterSubnetGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterSubnetGroupsResult describeClusterSubnetGroups(DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the specified Amazon Redshift HSM
     * configuration. If no configuration ID is specified, returns
     * information about all the HSM configurations owned by your AWS
     * customer account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all HSM connections that match any combination
     * of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all HSM
     * connections that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, HSM
     * connections are returned regardless of whether they have tag keys or
     * values associated with them.
     * </p>
     *
     * @param describeHsmConfigurationsRequest Container for the necessary
     *           parameters to execute the DescribeHsmConfigurations service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeHsmConfigurations service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws HsmConfigurationNotFoundException
     * @throws InvalidTagException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeHsmConfigurationsResult describeHsmConfigurations(DescribeHsmConfigurationsRequest describeHsmConfigurationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified manual snapshot. The snapshot must be in the
     * <code>available</code> state, with no other users authorized to access
     * the snapshot.
     * </p>
     * <p>
     * Unlike automated snapshots, manual snapshots are retained even after
     * you delete your cluster. Amazon Redshift does not delete your manual
     * snapshots. You must delete manual snapshot explicitly to avoid getting
     * charged. If other accounts are authorized to access the snapshot, you
     * must revoke all of the authorizations before you can delete the
     * snapshot.
     * </p>
     *
     * @param deleteClusterSnapshotRequest Container for the necessary
     *           parameters to execute the DeleteClusterSnapshot service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DeleteClusterSnapshot service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterSnapshotNotFoundException
     * @throws InvalidClusterSnapshotStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Snapshot deleteClusterSnapshot(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified Amazon Redshift parameter group. <p>
     * <b>NOTE:</b>You cannot delete a parameter group if it is associated
     * with a cluster.
     * </p>
     * 
     * </p>
     *
     * @param deleteClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the DeleteClusterParameterGroup service method
     *           on AmazonRedshift.
     * 
     * 
     * @throws InvalidClusterParameterGroupStateException
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteClusterParameterGroup(DeleteClusterParameterGroupRequest deleteClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables the automatic copying of snapshots from one region to
     * another region for a specified cluster.
     * </p>
     * <p>
     * If your cluster and its snapshots are encrypted using a customer
     * master key (CMK) from AWS KMS, use DeleteSnapshotCopyGrant to delete
     * the grant that grants Amazon Redshift permission to the CMK in the
     * destination region.
     * </p>
     *
     * @param disableSnapshotCopyRequest Container for the necessary
     *           parameters to execute the DisableSnapshotCopy service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DisableSnapshotCopy service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws SnapshotCopyAlreadyDisabledException
     * @throws UnauthorizedOperationException
     * @throws InvalidClusterStateException
     * @throws ClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster disableSnapshotCopy(DisableSnapshotCopyRequest disableSnapshotCopyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Amazon Redshift event notification subscription. This
     * action requires an ARN (Amazon Resource Name) of an Amazon SNS topic
     * created by either the Amazon Redshift console, the Amazon SNS console,
     * or the Amazon SNS API. To obtain an ARN with Amazon SNS, you must
     * create a topic in Amazon SNS and subscribe to the topic. The ARN is
     * displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the source type, and lists of Amazon Redshift source
     * IDs, event categories, and event severities. Notifications will be
     * sent for all events you want that match those criteria. For example,
     * you can specify source type = cluster, source ID = my-cluster-1 and
     * mycluster2, event categories = Availability, Backup, and severity =
     * ERROR. The subscription will only send notifications for those ERROR
     * events in the Availability and Backup categories for the specified
     * clusters.
     * </p>
     * <p>
     * If you specify both the source type and source IDs, such as source
     * type = cluster and source identifier = my-cluster-1, notifications
     * will be sent for all the cluster events for my-cluster-1. If you
     * specify a source type but do not specify a source identifier, you will
     * receive notice of the events for the objects of that type in your AWS
     * account. If you do not specify either the SourceType nor the
     * SourceIdentifier, you will be notified of events generated from all
     * Amazon Redshift sources belonging to your AWS account. You must
     * specify a source type if you specify a source ID.
     * </p>
     *
     * @param createEventSubscriptionRequest Container for the necessary
     *           parameters to execute the CreateEventSubscription service method on
     *           AmazonRedshift.
     * 
     * @return The response from the CreateEventSubscription service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws TagLimitExceededException
     * @throws SubscriptionCategoryNotFoundException
     * @throws SubscriptionAlreadyExistException
     * @throws InvalidTagException
     * @throws EventSubscriptionQuotaExceededException
     * @throws SubscriptionEventIdNotFoundException
     * @throws SubscriptionSeverityNotFoundException
     * @throws SourceNotFoundException
     * @throws SNSNoAuthorizationException
     * @throws SNSTopicArnNotFoundException
     * @throws SNSInvalidTopicException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EventSubscription createEventSubscription(CreateEventSubscriptionRequest createEventSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Sets one or more parameters of the specified parameter group to their
     * default values and sets the source values of the parameters to
     * "engine-default". To reset the entire parameter group specify the
     * <i>ResetAllParameters</i> parameter. For parameter changes to take
     * effect you must reboot any associated clusters.
     * </p>
     *
     * @param resetClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the ResetClusterParameterGroup service method on
     *           AmazonRedshift.
     * 
     * @return The response from the ResetClusterParameterGroup service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidClusterParameterGroupStateException
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResetClusterParameterGroupResult resetClusterParameterGroup(ResetClusterParameterGroupRequest resetClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of snapshot copy grants owned by the AWS account in
     * the destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"> Amazon Redshift Database Encryption </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param describeSnapshotCopyGrantsRequest Container for the necessary
     *           parameters to execute the DescribeSnapshotCopyGrants service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeSnapshotCopyGrants service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws SnapshotCopyGrantNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotCopyGrantsResult describeSnapshotCopyGrants(DescribeSnapshotCopyGrantsRequest describeSnapshotCopyGrantsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Authorizes the specified AWS customer account to restore the
     * specified snapshot.
     * </p>
     * <p>
     * For more information about working with snapshots, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html"> Amazon Redshift Snapshots </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param authorizeSnapshotAccessRequest Container for the necessary
     *           parameters to execute the AuthorizeSnapshotAccess service method on
     *           AmazonRedshift.
     * 
     * @return The response from the AuthorizeSnapshotAccess service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws DependentServiceRequestThrottlingException
     * @throws AuthorizationAlreadyExistsException
     * @throws LimitExceededException
     * @throws ClusterSnapshotNotFoundException
     * @throws AuthorizationQuotaExceededException
     * @throws InvalidClusterSnapshotStateException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Snapshot authorizeSnapshotAccess(AuthorizeSnapshotAccessRequest authorizeSnapshotAccessRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables the automatic copy of snapshots from one region to another
     * region for a specified cluster.
     * </p>
     *
     * @param enableSnapshotCopyRequest Container for the necessary
     *           parameters to execute the EnableSnapshotCopy service method on
     *           AmazonRedshift.
     * 
     * @return The response from the EnableSnapshotCopy service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws CopyToRegionDisabledException
     * @throws UnauthorizedOperationException
     * @throws InvalidClusterStateException
     * @throws DependentServiceRequestThrottlingException
     * @throws ClusterNotFoundException
     * @throws LimitExceededException
     * @throws IncompatibleOrderableOptionsException
     * @throws SnapshotCopyAlreadyEnabledException
     * @throws UnknownSnapshotCopyRegionException
     * @throws SnapshotCopyGrantNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Cluster enableSnapshotCopy(EnableSnapshotCopyRequest enableSnapshotCopyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of the available reserved node offerings by Amazon
     * Redshift with their descriptions including the node type, the fixed
     * and recurring costs of reserving the node and duration the node will
     * be reserved for you. These descriptions help you determine which
     * reserve node offering you want to purchase. You then use the unique
     * offering ID in you call to PurchaseReservedNodeOffering to reserve one
     * or more nodes for your Amazon Redshift cluster.
     * </p>
     * <p>
     * For more information about reserved node offerings, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html"> Purchasing Reserved Nodes </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param describeReservedNodeOfferingsRequest Container for the
     *           necessary parameters to execute the DescribeReservedNodeOfferings
     *           service method on AmazonRedshift.
     * 
     * @return The response from the DescribeReservedNodeOfferings service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws UnsupportedOperationException
     * @throws ReservedNodeOfferingNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedNodeOfferingsResult describeReservedNodeOfferings(DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists descriptions of all the Amazon Redshift event notifications
     * subscription for a customer account. If you specify a subscription
     * name, lists the description for that subscription.
     * </p>
     *
     * @param describeEventSubscriptionsRequest Container for the necessary
     *           parameters to execute the DescribeEventSubscriptions service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeEventSubscriptions service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws SubscriptionNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventSubscriptionsResult describeEventSubscriptions(DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes whether information, such as queries and connection
     * attempts, is being logged for the specified Amazon Redshift cluster.
     * </p>
     *
     * @param describeLoggingStatusRequest Container for the necessary
     *           parameters to execute the DescribeLoggingStatus service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeLoggingStatus service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoggingStatusResult describeLoggingStatus(DescribeLoggingStatusRequest describeLoggingStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an Amazon Redshift event notification subscription.
     * </p>
     *
     * @param deleteEventSubscriptionRequest Container for the necessary
     *           parameters to execute the DeleteEventSubscription service method on
     *           AmazonRedshift.
     * 
     * 
     * @throws InvalidSubscriptionStateException
     * @throws SubscriptionNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteEventSubscription(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an HSM client certificate that an Amazon Redshift cluster
     * will use to connect to the client's HSM in order to store and retrieve
     * the keys used to encrypt the cluster databases.
     * </p>
     * <p>
     * The command returns a public key, which you must store in the HSM. In
     * addition to creating the HSM certificate, you must create an Amazon
     * Redshift HSM configuration that provides a cluster the information
     * needed to store and use encryption keys in the HSM. For more
     * information, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html"> Hardware Security Modules </a>
     * in the Amazon Redshift Cluster Management Guide.
     * </p>
     *
     * @param createHsmClientCertificateRequest Container for the necessary
     *           parameters to execute the CreateHsmClientCertificate service method on
     *           AmazonRedshift.
     * 
     * @return The response from the CreateHsmClientCertificate service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws HsmClientCertificateQuotaExceededException
     * @throws HsmClientCertificateAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public HsmClientCertificate createHsmClientCertificate(CreateHsmClientCertificateRequest createHsmClientCertificateRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the specified HSM client certificate. If no
     * certificate ID is specified, returns information about all the HSM
     * certificates owned by your AWS customer account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all HSM client certificates that match any
     * combination of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all HSM
     * client certificates that have any combination of those values are
     * returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, HSM client
     * certificates are returned regardless of whether they have tag keys or
     * values associated with them.
     * </p>
     *
     * @param describeHsmClientCertificatesRequest Container for the
     *           necessary parameters to execute the DescribeHsmClientCertificates
     *           service method on AmazonRedshift.
     * 
     * @return The response from the DescribeHsmClientCertificates service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws HsmClientCertificateNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeHsmClientCertificatesResult describeHsmClientCertificates(DescribeHsmClientCertificatesRequest describeHsmClientCertificatesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a detailed list of parameters contained within the specified
     * Amazon Redshift parameter group. For each parameter the response
     * includes information such as parameter name, description, data type,
     * value, whether the parameter value is modifiable, and so on.
     * </p>
     * <p>
     * You can specify <i>source</i> filter to retrieve parameters of only
     * specific type. For example, to retrieve parameters that were modified
     * by a user action such as from ModifyClusterParameterGroup, you can
     * specify <i>source</i> equal to <i>user</i> .
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"> Amazon Redshift Parameter Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param describeClusterParametersRequest Container for the necessary
     *           parameters to execute the DescribeClusterParameters service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeClusterParameters service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterParametersResult describeClusterParameters(DescribeClusterParametersRequest describeClusterParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Revokes an ingress rule in an Amazon Redshift security group for a
     * previously authorized IP range or Amazon EC2 security group. To add an
     * ingress rule, see AuthorizeClusterSecurityGroupIngress. For
     * information about managing security groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"> Amazon Redshift Cluster Security Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param revokeClusterSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the RevokeClusterSecurityGroupIngress
     *           service method on AmazonRedshift.
     * 
     * @return The response from the RevokeClusterSecurityGroupIngress
     *         service method, as returned by AmazonRedshift.
     * 
     * @throws InvalidClusterSecurityGroupStateException
     * @throws AuthorizationNotFoundException
     * @throws ClusterSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ClusterSecurityGroup revokeClusterSecurityGroupIngress(RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns properties of provisioned clusters including general cluster
     * properties, cluster database properties, maintenance and backup
     * properties, and security and access properties. This operation
     * supports pagination. For more information about managing clusters, go
     * to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all clusters that match any combination of the
     * specified keys and values. For example, if you have <code>owner</code>
     * and <code>environment</code> for tag keys, and <code>admin</code> and
     * <code>test</code> for tag values, all clusters that have any
     * combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, clusters
     * are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     *
     * @param describeClustersRequest Container for the necessary parameters
     *           to execute the DescribeClusters service method on AmazonRedshift.
     * 
     * @return The response from the DescribeClusters service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws ClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an HSM configuration that contains the information required
     * by an Amazon Redshift cluster to store and use database encryption
     * keys in a Hardware Security Module (HSM). After creating the HSM
     * configuration, you can specify it as a parameter when creating a
     * cluster. The cluster will then store its encryption keys in the HSM.
     * </p>
     * <p>
     * In addition to creating an HSM configuration, you must also create an
     * HSM client certificate. For more information, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html"> Hardware Security Modules </a>
     * in the Amazon Redshift Cluster Management Guide.
     * </p>
     *
     * @param createHsmConfigurationRequest Container for the necessary
     *           parameters to execute the CreateHsmConfiguration service method on
     *           AmazonRedshift.
     * 
     * @return The response from the CreateHsmConfiguration service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws TagLimitExceededException
     * @throws HsmConfigurationQuotaExceededException
     * @throws InvalidTagException
     * @throws HsmConfigurationAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public HsmConfiguration createHsmConfiguration(CreateHsmConfigurationRequest createHsmConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns one or more snapshot objects, which contain metadata about
     * your cluster snapshots. By default, this operation returns information
     * about all snapshots of all clusters that are owned by you AWS customer
     * account. No information is returned for snapshots owned by inactive
     * AWS customer accounts.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all snapshots that match any combination of
     * the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all snapshots
     * that have any combination of those values are returned. Only snapshots
     * that you own are returned in the response; shared snapshots are not
     * returned with the tag key and tag value request parameters.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, snapshots
     * are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     *
     * @param describeClusterSnapshotsRequest Container for the necessary
     *           parameters to execute the DescribeClusterSnapshots service method on
     *           AmazonRedshift.
     * 
     * @return The response from the DescribeClusterSnapshots service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws ClusterSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterSnapshotsResult describeClusterSnapshots(DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Amazon Redshift parameter group.
     * </p>
     * <p>
     * Creating parameter groups is independent of creating clusters. You
     * can associate a cluster with a parameter group when you create the
     * cluster. You can also associate an existing cluster with a parameter
     * group after the cluster is created by using ModifyCluster.
     * </p>
     * <p>
     * Parameters in the parameter group define specific behavior that
     * applies to the databases you create on the cluster. For more
     * information about parameters and parameter groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"> Amazon Redshift Parameter Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param createClusterParameterGroupRequest Container for the necessary
     *           parameters to execute the CreateClusterParameterGroup service method
     *           on AmazonRedshift.
     * 
     * @return The response from the CreateClusterParameterGroup service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws TagLimitExceededException
     * @throws ClusterParameterGroupQuotaExceededException
     * @throws InvalidTagException
     * @throws ClusterParameterGroupAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ClusterParameterGroup createClusterParameterGroup(CreateClusterParameterGroupRequest createClusterParameterGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of Amazon Redshift parameter groups, including
     * parameter groups you created and the default parameter group. For each
     * parameter group, the response includes the parameter group name,
     * description, and parameter group family name. You can optionally
     * specify a name to retrieve the description of a specific parameter
     * group.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"> Amazon Redshift Parameter Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all parameter groups that match any
     * combination of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all parameter
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, parameter
     * groups are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     *
     * @param describeClusterParameterGroupsRequest Container for the
     *           necessary parameters to execute the DescribeClusterParameterGroups
     *           service method on AmazonRedshift.
     * 
     * @return The response from the DescribeClusterParameterGroups service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterParameterGroupsResult describeClusterParameterGroups(DescribeClusterParameterGroupsRequest describeClusterParameterGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a snapshot copy grant that permits Amazon Redshift to use a
     * customer master key (CMK) from AWS Key Management Service (AWS KMS) to
     * encrypt copied snapshots in a destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"> Amazon Redshift Database Encryption </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     *
     * @param createSnapshotCopyGrantRequest Container for the necessary
     *           parameters to execute the CreateSnapshotCopyGrant service method on
     *           AmazonRedshift.
     * 
     * @return The response from the CreateSnapshotCopyGrant service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws TagLimitExceededException
     * @throws InvalidTagException
     * @throws DependentServiceRequestThrottlingException
     * @throws LimitExceededException
     * @throws SnapshotCopyGrantAlreadyExistsException
     * @throws SnapshotCopyGrantQuotaExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SnapshotCopyGrant createSnapshotCopyGrant(CreateSnapshotCopyGrantRequest createSnapshotCopyGrantRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of orderable cluster options. Before you create a new
     * cluster you can use this operation to find what options are available,
     * such as the EC2 Availability Zones (AZ) in the specific AWS region
     * that you can specify, and the node types you can request. The node
     * types differ by available storage, memory, CPU and price. With the
     * cost involved you might want to obtain a list of cluster options in
     * the specific region and specify values when creating a cluster. For
     * more information about managing clusters, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>
     * </p>
     * 
     * @return The response from the DescribeOrderableClusterOptions service
     *         method, as returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeOrderableClusterOptionsResult describeOrderableClusterOptions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists the status of one or more table restore requests made using the
     * RestoreTableFromClusterSnapshot API action. If you don't specify a
     * value for the <code>TableRestoreRequestId</code> parameter, then
     * <code>DescribeTableRestoreStatus</code> returns the status of all
     * table restore requests ordered by the date and time of the request in
     * ascending order. Otherwise <code>DescribeTableRestoreStatus</code>
     * returns the status of the table specified by
     * <code>TableRestoreRequestId</code> .
     * </p>
     * 
     * @return The response from the DescribeTableRestoreStatus service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws ClusterNotFoundException
     * @throws TableRestoreNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTableRestoreStatusResult describeTableRestoreStatus() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns events related to clusters, security groups, snapshots, and
     * parameter groups for the past 14 days. Events specific to a particular
     * cluster, security group, snapshot or parameter group can be obtained
     * by providing the name as a parameter. By default, the past hour of
     * events are returned.
     * </p>
     * 
     * @return The response from the DescribeEvents service method, as
     *         returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventsResult describeEvents() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns the descriptions of the reserved nodes.
     * </p>
     * 
     * @return The response from the DescribeReservedNodes service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws ReservedNodeNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedNodesResult describeReservedNodes() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns descriptions of the available Amazon Redshift cluster
     * versions. You can call this operation even before creating any
     * clusters to learn more about the Amazon Redshift versions. For more
     * information about managing clusters, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>
     * </p>
     * 
     * @return The response from the DescribeClusterVersions service method,
     *         as returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterVersionsResult describeClusterVersions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of tags. You can return tags from a specific resource
     * by specifying an ARN, or you can return all tags for a given type of
     * resource, such as clusters, snapshots, and so on.
     * </p>
     * <p>
     * The following are limitations for <code>DescribeTags</code> :
     * <ul>
     * <li>You cannot specify an ARN and a resource-type value together in
     * the same request.</li>
     * <li>You cannot use the <code>MaxRecords</code> and
     * <code>Marker</code> parameters together with the ARN parameter.</li>
     * <li>The <code>MaxRecords</code> parameter can be a range from 10 to
     * 50 results to return in a request.</li>
     * 
     * </ul>
     * 
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all resources that match any combination of
     * the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all resources
     * that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, resources
     * are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     * 
     * @return The response from the DescribeTags service method, as returned
     *         by AmazonRedshift.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidTagException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTagsResult describeTags() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Displays a list of event categories for all event source types, or
     * for a specified source type. For a list of the event categories and
     * source types, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html"> Amazon Redshift Event Notifications </a>
     * .
     * </p>
     * 
     * @return The response from the DescribeEventCategories service method,
     *         as returned by AmazonRedshift.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventCategoriesResult describeEventCategories() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns information about Amazon Redshift security groups. If the
     * name of a security group is specified, the response will contain only
     * information about only that security group.
     * </p>
     * <p>
     * For information about managing security groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html"> Amazon Redshift Cluster Security Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all security groups that match any combination
     * of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all security
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, security
     * groups are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     * 
     * @return The response from the DescribeClusterSecurityGroups service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws ClusterSecurityGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterSecurityGroupsResult describeClusterSecurityGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns one or more cluster subnet group objects, which contain
     * metadata about your cluster subnet groups. By default, this operation
     * returns information about all cluster subnet groups that are defined
     * in you AWS account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all subnet groups that match any combination
     * of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all subnet
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, subnet
     * groups are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     * 
     * @return The response from the DescribeClusterSubnetGroups service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws ClusterSubnetGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterSubnetGroupsResult describeClusterSubnetGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns information about the specified Amazon Redshift HSM
     * configuration. If no configuration ID is specified, returns
     * information about all the HSM configurations owned by your AWS
     * customer account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all HSM connections that match any combination
     * of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all HSM
     * connections that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, HSM
     * connections are returned regardless of whether they have tag keys or
     * values associated with them.
     * </p>
     * 
     * @return The response from the DescribeHsmConfigurations service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws HsmConfigurationNotFoundException
     * @throws InvalidTagException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeHsmConfigurationsResult describeHsmConfigurations() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of snapshot copy grants owned by the AWS account in
     * the destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html"> Amazon Redshift Database Encryption </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeSnapshotCopyGrants service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws SnapshotCopyGrantNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotCopyGrantsResult describeSnapshotCopyGrants() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of the available reserved node offerings by Amazon
     * Redshift with their descriptions including the node type, the fixed
     * and recurring costs of reserving the node and duration the node will
     * be reserved for you. These descriptions help you determine which
     * reserve node offering you want to purchase. You then use the unique
     * offering ID in you call to PurchaseReservedNodeOffering to reserve one
     * or more nodes for your Amazon Redshift cluster.
     * </p>
     * <p>
     * For more information about reserved node offerings, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html"> Purchasing Reserved Nodes </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeReservedNodeOfferings service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws UnsupportedOperationException
     * @throws ReservedNodeOfferingNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedNodeOfferingsResult describeReservedNodeOfferings() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Lists descriptions of all the Amazon Redshift event notifications
     * subscription for a customer account. If you specify a subscription
     * name, lists the description for that subscription.
     * </p>
     * 
     * @return The response from the DescribeEventSubscriptions service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws SubscriptionNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEventSubscriptionsResult describeEventSubscriptions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns information about the specified HSM client certificate. If no
     * certificate ID is specified, returns information about all the HSM
     * certificates owned by your AWS customer account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all HSM client certificates that match any
     * combination of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all HSM
     * client certificates that have any combination of those values are
     * returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, HSM client
     * certificates are returned regardless of whether they have tag keys or
     * values associated with them.
     * </p>
     * 
     * @return The response from the DescribeHsmClientCertificates service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws HsmClientCertificateNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeHsmClientCertificatesResult describeHsmClientCertificates() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns properties of provisioned clusters including general cluster
     * properties, cluster database properties, maintenance and backup
     * properties, and security and access properties. This operation
     * supports pagination. For more information about managing clusters, go
     * to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all clusters that match any combination of the
     * specified keys and values. For example, if you have <code>owner</code>
     * and <code>environment</code> for tag keys, and <code>admin</code> and
     * <code>test</code> for tag values, all clusters that have any
     * combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, clusters
     * are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     * 
     * @return The response from the DescribeClusters service method, as
     *         returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws ClusterNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClustersResult describeClusters() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns one or more snapshot objects, which contain metadata about
     * your cluster snapshots. By default, this operation returns information
     * about all snapshots of all clusters that are owned by you AWS customer
     * account. No information is returned for snapshots owned by inactive
     * AWS customer accounts.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all snapshots that match any combination of
     * the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all snapshots
     * that have any combination of those values are returned. Only snapshots
     * that you own are returned in the response; shared snapshots are not
     * returned with the tag key and tag value request parameters.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, snapshots
     * are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     * 
     * @return The response from the DescribeClusterSnapshots service method,
     *         as returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws ClusterSnapshotNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterSnapshotsResult describeClusterSnapshots() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns a list of Amazon Redshift parameter groups, including
     * parameter groups you created and the default parameter group. For each
     * parameter group, the response includes the parameter group name,
     * description, and parameter group family name. You can optionally
     * specify a name to retrieve the description of a specific parameter
     * group.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to
     * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"> Amazon Redshift Parameter Groups </a>
     * in the <i>Amazon Redshift Cluster Management Guide</i> .
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request,
     * Amazon Redshift returns all parameter groups that match any
     * combination of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and
     * <code>admin</code> and <code>test</code> for tag values, all parameter
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, parameter
     * groups are returned regardless of whether they have tag keys or values
     * associated with them.
     * </p>
     * 
     * @return The response from the DescribeClusterParameterGroups service
     *         method, as returned by AmazonRedshift.
     * 
     * @throws InvalidTagException
     * @throws ClusterParameterGroupNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRedshift indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClusterParameterGroupsResult describeClusterParameterGroups() throws AmazonServiceException, AmazonClientException;
    
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
        