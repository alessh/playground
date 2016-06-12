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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.services.redshift.model.transform.*;

/**
 * Client for accessing AmazonRedshift.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
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
public class AmazonRedshiftClient extends AmazonWebServiceClient implements AmazonRedshift {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonRedshift exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, org.w3c.dom.Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, org.w3c.dom.Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonRedshiftClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonRedshift
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonRedshiftClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonRedshiftClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonRedshift
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonRedshiftClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonRedshiftClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonRedshift
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonRedshiftClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonRedshift using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonRedshift
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonRedshiftClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new SnapshotCopyGrantAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyGrantQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidHsmConfigurationStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberOfNodesQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmClientCertificateQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRestoreExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSnapshotNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmClientCertificateAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSInvalidTopicExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSNoAuthorizationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSecurityGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmConfigurationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EventSubscriptionQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeOfferingNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSecurityGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetAlreadyInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmConfigurationQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSnapshotAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyAlreadyEnabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyGrantNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTagExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CopyToRegionDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberOfNodesPerClusterLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmClientCertificateNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionCategoryNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterParameterGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterParameterGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidHsmClientCertificateStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnsupportedOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSecurityGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DependentServiceRequestThrottlingExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResizeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TagLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyAlreadyDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterParameterGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionSeverityNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSnapshotCopyGrantStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionAlreadyExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSubnetStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AccessToSnapshotDeniedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubscriptionStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnknownSnapshotCopyRegionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidS3BucketNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSnapshotQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IncompatibleOrderableOptionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientS3BucketPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmConfigurationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BucketNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVPCNetworkStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterParameterGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSubnetGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSTopicArnNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnsupportedOptionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TableRestoreNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnauthorizedOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidElasticIpExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTableRestoreArgumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSnapshotStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidS3KeyPrefixExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSecurityGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InProgressTableRestoreQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionEventIdNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetGroupAlreadyExistsExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("redshift.us-east-1.amazonaws.com");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/redshift/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/redshift/request.handler2s"));
    }

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
    public Snapshot revokeSnapshotAccess(RevokeSnapshotAccessRequest revokeSnapshotAccessRequest) {
        ExecutionContext executionContext = createExecutionContext(revokeSnapshotAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeSnapshotAccessRequest> request = null;
        Response<Snapshot> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeSnapshotAccessRequestMarshaller().marshall(super.beforeMarshalling(revokeSnapshotAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SnapshotStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public Cluster modifySnapshotCopyRetentionPeriod(ModifySnapshotCopyRetentionPeriodRequest modifySnapshotCopyRetentionPeriodRequest) {
        ExecutionContext executionContext = createExecutionContext(modifySnapshotCopyRetentionPeriodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifySnapshotCopyRetentionPeriodRequest> request = null;
        Response<Cluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifySnapshotCopyRetentionPeriodRequestMarshaller().marshall(super.beforeMarshalling(modifySnapshotCopyRetentionPeriodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public ClusterSubnetGroup modifyClusterSubnetGroup(ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyClusterSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterSubnetGroupRequest> request = null;
        Response<ClusterSubnetGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyClusterSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterSubnetGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public ReservedNode purchaseReservedNodeOffering(PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest) {
        ExecutionContext executionContext = createExecutionContext(purchaseReservedNodeOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedNodeOfferingRequest> request = null;
        Response<ReservedNode> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseReservedNodeOfferingRequestMarshaller().marshall(super.beforeMarshalling(purchaseReservedNodeOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ReservedNodeStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public void deleteHsmConfiguration(DeleteHsmConfigurationRequest deleteHsmConfigurationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteHsmConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteHsmConfigurationRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHsmConfigurationRequestMarshaller().marshall(super.beforeMarshalling(deleteHsmConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
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
    public DisableLoggingResult disableLogging(DisableLoggingRequest disableLoggingRequest) {
        ExecutionContext executionContext = createExecutionContext(disableLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableLoggingRequest> request = null;
        Response<DisableLoggingResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableLoggingRequestMarshaller().marshall(super.beforeMarshalling(disableLoggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DisableLoggingResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public void deleteSnapshotCopyGrant(DeleteSnapshotCopyGrantRequest deleteSnapshotCopyGrantRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotCopyGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteSnapshotCopyGrantRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotCopyGrantRequestMarshaller().marshall(super.beforeMarshalling(deleteSnapshotCopyGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
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
    public Cluster modifyCluster(ModifyClusterRequest modifyClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterRequest> request = null;
        Response<Cluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterRequestMarshaller().marshall(super.beforeMarshalling(modifyClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public void deleteTags(DeleteTagsRequest deleteTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteTagsRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestMarshaller().marshall(super.beforeMarshalling(deleteTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
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
    public Snapshot copyClusterSnapshot(CopyClusterSnapshotRequest copyClusterSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(copyClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyClusterSnapshotRequest> request = null;
        Response<Snapshot> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(copyClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SnapshotStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeOrderableClusterOptionsResult describeOrderableClusterOptions(DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeOrderableClusterOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrderableClusterOptionsRequest> request = null;
        Response<DescribeOrderableClusterOptionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrderableClusterOptionsRequestMarshaller().marshall(super.beforeMarshalling(describeOrderableClusterOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeOrderableClusterOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public EnableLoggingResult enableLogging(EnableLoggingRequest enableLoggingRequest) {
        ExecutionContext executionContext = createExecutionContext(enableLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableLoggingRequest> request = null;
        Response<EnableLoggingResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableLoggingRequestMarshaller().marshall(super.beforeMarshalling(enableLoggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new EnableLoggingResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public ClusterSubnetGroup createClusterSubnetGroup(CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createClusterSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterSubnetGroupRequest> request = null;
        Response<ClusterSubnetGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(createClusterSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterSubnetGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeTableRestoreStatusResult describeTableRestoreStatus(DescribeTableRestoreStatusRequest describeTableRestoreStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTableRestoreStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTableRestoreStatusRequest> request = null;
        Response<DescribeTableRestoreStatusResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTableRestoreStatusRequestMarshaller().marshall(super.beforeMarshalling(describeTableRestoreStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeTableRestoreStatusResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public void deleteHsmClientCertificate(DeleteHsmClientCertificateRequest deleteHsmClientCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteHsmClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteHsmClientCertificateRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHsmClientCertificateRequestMarshaller().marshall(super.beforeMarshalling(deleteHsmClientCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
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
    public Cluster rebootCluster(RebootClusterRequest rebootClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(rebootClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootClusterRequest> request = null;
        Response<Cluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootClusterRequestMarshaller().marshall(super.beforeMarshalling(rebootClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public void deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest deleteClusterSubnetGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteClusterSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteClusterSubnetGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteClusterSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
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
    public Snapshot createClusterSnapshot(CreateClusterSnapshotRequest createClusterSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(createClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterSnapshotRequest> request = null;
        Response<Snapshot> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(createClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SnapshotStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public Cluster deleteCluster(DeleteClusterRequest deleteClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterRequest> request = null;
        Response<Cluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterRequestMarshaller().marshall(super.beforeMarshalling(deleteClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public Cluster createCluster(CreateClusterRequest createClusterRequest) {
        ExecutionContext executionContext = createExecutionContext(createClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterRequest> request = null;
        Response<Cluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterRequestMarshaller().marshall(super.beforeMarshalling(createClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsRequestMarshaller().marshall(super.beforeMarshalling(describeEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeEventsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public ClusterSecurityGroup authorizeClusterSecurityGroupIngress(AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest) {
        ExecutionContext executionContext = createExecutionContext(authorizeClusterSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeClusterSecurityGroupIngressRequest> request = null;
        Response<ClusterSecurityGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AuthorizeClusterSecurityGroupIngressRequestMarshaller().marshall(super.beforeMarshalling(authorizeClusterSecurityGroupIngressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterSecurityGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public Cluster rotateEncryptionKey(RotateEncryptionKeyRequest rotateEncryptionKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(rotateEncryptionKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RotateEncryptionKeyRequest> request = null;
        Response<Cluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RotateEncryptionKeyRequestMarshaller().marshall(super.beforeMarshalling(rotateEncryptionKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public void deleteClusterSecurityGroup(DeleteClusterSecurityGroupRequest deleteClusterSecurityGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteClusterSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteClusterSecurityGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterSecurityGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteClusterSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
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
    public DescribeReservedNodesResult describeReservedNodes(DescribeReservedNodesRequest describeReservedNodesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReservedNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedNodesRequest> request = null;
        Response<DescribeReservedNodesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedNodesRequestMarshaller().marshall(super.beforeMarshalling(describeReservedNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeReservedNodesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DefaultClusterParameters describeDefaultClusterParameters(DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDefaultClusterParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDefaultClusterParametersRequest> request = null;
        Response<DefaultClusterParameters> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDefaultClusterParametersRequestMarshaller().marshall(super.beforeMarshalling(describeDefaultClusterParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DefaultClusterParametersStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public EventSubscription modifyEventSubscription(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyEventSubscriptionRequest> request = null;
        Response<EventSubscription> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyEventSubscriptionRequestMarshaller().marshall(super.beforeMarshalling(modifyEventSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new EventSubscriptionStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public ClusterSecurityGroup createClusterSecurityGroup(CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createClusterSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterSecurityGroupRequest> request = null;
        Response<ClusterSecurityGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterSecurityGroupRequestMarshaller().marshall(super.beforeMarshalling(createClusterSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterSecurityGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeResizeResult describeResize(DescribeResizeRequest describeResizeRequest) {
        ExecutionContext executionContext = createExecutionContext(describeResizeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResizeRequest> request = null;
        Response<DescribeResizeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResizeRequestMarshaller().marshall(super.beforeMarshalling(describeResizeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeResizeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeClusterVersionsResult describeClusterVersions(DescribeClusterVersionsRequest describeClusterVersionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeClusterVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterVersionsRequest> request = null;
        Response<DescribeClusterVersionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterVersionsRequestMarshaller().marshall(super.beforeMarshalling(describeClusterVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeClusterVersionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public TableRestoreStatus restoreTableFromClusterSnapshot(RestoreTableFromClusterSnapshotRequest restoreTableFromClusterSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(restoreTableFromClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreTableFromClusterSnapshotRequest> request = null;
        Response<TableRestoreStatus> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreTableFromClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(restoreTableFromClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new TableRestoreStatusStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public Cluster restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(restoreFromClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreFromClusterSnapshotRequest> request = null;
        Response<Cluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreFromClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(restoreFromClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public Cluster modifyClusterIamRoles(ModifyClusterIamRolesRequest modifyClusterIamRolesRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyClusterIamRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterIamRolesRequest> request = null;
        Response<Cluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterIamRolesRequestMarshaller().marshall(super.beforeMarshalling(modifyClusterIamRolesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public void createTags(CreateTagsRequest createTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateTagsRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagsRequestMarshaller().marshall(super.beforeMarshalling(createTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
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
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestMarshaller().marshall(super.beforeMarshalling(describeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeTagsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public ModifyClusterParameterGroupResult modifyClusterParameterGroup(ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterParameterGroupRequest> request = null;
        Response<ModifyClusterParameterGroupResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ModifyClusterParameterGroupResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest describeEventCategoriesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEventCategoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventCategoriesRequest> request = null;
        Response<DescribeEventCategoriesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventCategoriesRequestMarshaller().marshall(super.beforeMarshalling(describeEventCategoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeEventCategoriesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeClusterSecurityGroupsResult describeClusterSecurityGroups(DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeClusterSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterSecurityGroupsRequest> request = null;
        Response<DescribeClusterSecurityGroupsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterSecurityGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeClusterSecurityGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeClusterSecurityGroupsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeClusterSubnetGroupsResult describeClusterSubnetGroups(DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeClusterSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterSubnetGroupsRequest> request = null;
        Response<DescribeClusterSubnetGroupsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterSubnetGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeClusterSubnetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeClusterSubnetGroupsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeHsmConfigurationsResult describeHsmConfigurations(DescribeHsmConfigurationsRequest describeHsmConfigurationsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeHsmConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHsmConfigurationsRequest> request = null;
        Response<DescribeHsmConfigurationsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHsmConfigurationsRequestMarshaller().marshall(super.beforeMarshalling(describeHsmConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeHsmConfigurationsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public Snapshot deleteClusterSnapshot(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterSnapshotRequest> request = null;
        Response<Snapshot> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(deleteClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SnapshotStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public void deleteClusterParameterGroup(DeleteClusterParameterGroupRequest deleteClusterParameterGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteClusterParameterGroupRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
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
    public Cluster disableSnapshotCopy(DisableSnapshotCopyRequest disableSnapshotCopyRequest) {
        ExecutionContext executionContext = createExecutionContext(disableSnapshotCopyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableSnapshotCopyRequest> request = null;
        Response<Cluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableSnapshotCopyRequestMarshaller().marshall(super.beforeMarshalling(disableSnapshotCopyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public EventSubscription createEventSubscription(CreateEventSubscriptionRequest createEventSubscriptionRequest) {
        ExecutionContext executionContext = createExecutionContext(createEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventSubscriptionRequest> request = null;
        Response<EventSubscription> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEventSubscriptionRequestMarshaller().marshall(super.beforeMarshalling(createEventSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new EventSubscriptionStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public ResetClusterParameterGroupResult resetClusterParameterGroup(ResetClusterParameterGroupRequest resetClusterParameterGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(resetClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetClusterParameterGroupRequest> request = null;
        Response<ResetClusterParameterGroupResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(resetClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ResetClusterParameterGroupResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeSnapshotCopyGrantsResult describeSnapshotCopyGrants(DescribeSnapshotCopyGrantsRequest describeSnapshotCopyGrantsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotCopyGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotCopyGrantsRequest> request = null;
        Response<DescribeSnapshotCopyGrantsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotCopyGrantsRequestMarshaller().marshall(super.beforeMarshalling(describeSnapshotCopyGrantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeSnapshotCopyGrantsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public Snapshot authorizeSnapshotAccess(AuthorizeSnapshotAccessRequest authorizeSnapshotAccessRequest) {
        ExecutionContext executionContext = createExecutionContext(authorizeSnapshotAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeSnapshotAccessRequest> request = null;
        Response<Snapshot> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AuthorizeSnapshotAccessRequestMarshaller().marshall(super.beforeMarshalling(authorizeSnapshotAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SnapshotStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public Cluster enableSnapshotCopy(EnableSnapshotCopyRequest enableSnapshotCopyRequest) {
        ExecutionContext executionContext = createExecutionContext(enableSnapshotCopyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSnapshotCopyRequest> request = null;
        Response<Cluster> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableSnapshotCopyRequestMarshaller().marshall(super.beforeMarshalling(enableSnapshotCopyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeReservedNodeOfferingsResult describeReservedNodeOfferings(DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReservedNodeOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedNodeOfferingsRequest> request = null;
        Response<DescribeReservedNodeOfferingsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedNodeOfferingsRequestMarshaller().marshall(super.beforeMarshalling(describeReservedNodeOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeReservedNodeOfferingsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeEventSubscriptionsResult describeEventSubscriptions(DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEventSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventSubscriptionsRequest> request = null;
        Response<DescribeEventSubscriptionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventSubscriptionsRequestMarshaller().marshall(super.beforeMarshalling(describeEventSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeEventSubscriptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeLoggingStatusResult describeLoggingStatus(DescribeLoggingStatusRequest describeLoggingStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLoggingStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoggingStatusRequest> request = null;
        Response<DescribeLoggingStatusResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoggingStatusRequestMarshaller().marshall(super.beforeMarshalling(describeLoggingStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeLoggingStatusResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public void deleteEventSubscription(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteEventSubscriptionRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventSubscriptionRequestMarshaller().marshall(super.beforeMarshalling(deleteEventSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            invoke(request, null, executionContext);

        } finally {
            
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
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
    public HsmClientCertificate createHsmClientCertificate(CreateHsmClientCertificateRequest createHsmClientCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(createHsmClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHsmClientCertificateRequest> request = null;
        Response<HsmClientCertificate> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHsmClientCertificateRequestMarshaller().marshall(super.beforeMarshalling(createHsmClientCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new HsmClientCertificateStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeHsmClientCertificatesResult describeHsmClientCertificates(DescribeHsmClientCertificatesRequest describeHsmClientCertificatesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeHsmClientCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHsmClientCertificatesRequest> request = null;
        Response<DescribeHsmClientCertificatesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHsmClientCertificatesRequestMarshaller().marshall(super.beforeMarshalling(describeHsmClientCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeHsmClientCertificatesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeClusterParametersResult describeClusterParameters(DescribeClusterParametersRequest describeClusterParametersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeClusterParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterParametersRequest> request = null;
        Response<DescribeClusterParametersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterParametersRequestMarshaller().marshall(super.beforeMarshalling(describeClusterParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeClusterParametersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public ClusterSecurityGroup revokeClusterSecurityGroupIngress(RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest) {
        ExecutionContext executionContext = createExecutionContext(revokeClusterSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeClusterSecurityGroupIngressRequest> request = null;
        Response<ClusterSecurityGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeClusterSecurityGroupIngressRequestMarshaller().marshall(super.beforeMarshalling(revokeClusterSecurityGroupIngressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterSecurityGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClustersRequest> request = null;
        Response<DescribeClustersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClustersRequestMarshaller().marshall(super.beforeMarshalling(describeClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeClustersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public HsmConfiguration createHsmConfiguration(CreateHsmConfigurationRequest createHsmConfigurationRequest) {
        ExecutionContext executionContext = createExecutionContext(createHsmConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHsmConfigurationRequest> request = null;
        Response<HsmConfiguration> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHsmConfigurationRequestMarshaller().marshall(super.beforeMarshalling(createHsmConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new HsmConfigurationStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeClusterSnapshotsResult describeClusterSnapshots(DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeClusterSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterSnapshotsRequest> request = null;
        Response<DescribeClusterSnapshotsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterSnapshotsRequestMarshaller().marshall(super.beforeMarshalling(describeClusterSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeClusterSnapshotsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public ClusterParameterGroup createClusterParameterGroup(CreateClusterParameterGroupRequest createClusterParameterGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterParameterGroupRequest> request = null;
        Response<ClusterParameterGroup> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(createClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ClusterParameterGroupStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeClusterParameterGroupsResult describeClusterParameterGroups(DescribeClusterParameterGroupsRequest describeClusterParameterGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeClusterParameterGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterParameterGroupsRequest> request = null;
        Response<DescribeClusterParameterGroupsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterParameterGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeClusterParameterGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeClusterParameterGroupsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public SnapshotCopyGrant createSnapshotCopyGrant(CreateSnapshotCopyGrantRequest createSnapshotCopyGrantRequest) {
        ExecutionContext executionContext = createExecutionContext(createSnapshotCopyGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotCopyGrantRequest> request = null;
        Response<SnapshotCopyGrant> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotCopyGrantRequestMarshaller().marshall(super.beforeMarshalling(createSnapshotCopyGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new SnapshotCopyGrantStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
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
    public DescribeOrderableClusterOptionsResult describeOrderableClusterOptions() throws AmazonServiceException, AmazonClientException {
        return describeOrderableClusterOptions(new DescribeOrderableClusterOptionsRequest());
    }
    
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
    public DescribeTableRestoreStatusResult describeTableRestoreStatus() throws AmazonServiceException, AmazonClientException {
        return describeTableRestoreStatus(new DescribeTableRestoreStatusRequest());
    }
    
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
    public DescribeEventsResult describeEvents() throws AmazonServiceException, AmazonClientException {
        return describeEvents(new DescribeEventsRequest());
    }
    
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
    public DescribeReservedNodesResult describeReservedNodes() throws AmazonServiceException, AmazonClientException {
        return describeReservedNodes(new DescribeReservedNodesRequest());
    }
    
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
    public DescribeClusterVersionsResult describeClusterVersions() throws AmazonServiceException, AmazonClientException {
        return describeClusterVersions(new DescribeClusterVersionsRequest());
    }
    
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
    public DescribeTagsResult describeTags() throws AmazonServiceException, AmazonClientException {
        return describeTags(new DescribeTagsRequest());
    }
    
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
    public DescribeEventCategoriesResult describeEventCategories() throws AmazonServiceException, AmazonClientException {
        return describeEventCategories(new DescribeEventCategoriesRequest());
    }
    
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
    public DescribeClusterSecurityGroupsResult describeClusterSecurityGroups() throws AmazonServiceException, AmazonClientException {
        return describeClusterSecurityGroups(new DescribeClusterSecurityGroupsRequest());
    }
    
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
    public DescribeClusterSubnetGroupsResult describeClusterSubnetGroups() throws AmazonServiceException, AmazonClientException {
        return describeClusterSubnetGroups(new DescribeClusterSubnetGroupsRequest());
    }
    
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
    public DescribeHsmConfigurationsResult describeHsmConfigurations() throws AmazonServiceException, AmazonClientException {
        return describeHsmConfigurations(new DescribeHsmConfigurationsRequest());
    }
    
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
    public DescribeSnapshotCopyGrantsResult describeSnapshotCopyGrants() throws AmazonServiceException, AmazonClientException {
        return describeSnapshotCopyGrants(new DescribeSnapshotCopyGrantsRequest());
    }
    
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
    public DescribeReservedNodeOfferingsResult describeReservedNodeOfferings() throws AmazonServiceException, AmazonClientException {
        return describeReservedNodeOfferings(new DescribeReservedNodeOfferingsRequest());
    }
    
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
    public DescribeEventSubscriptionsResult describeEventSubscriptions() throws AmazonServiceException, AmazonClientException {
        return describeEventSubscriptions(new DescribeEventSubscriptionsRequest());
    }
    
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
    public DescribeHsmClientCertificatesResult describeHsmClientCertificates() throws AmazonServiceException, AmazonClientException {
        return describeHsmClientCertificates(new DescribeHsmClientCertificatesRequest());
    }
    
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
    public DescribeClustersResult describeClusters() throws AmazonServiceException, AmazonClientException {
        return describeClusters(new DescribeClustersRequest());
    }
    
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
    public DescribeClusterSnapshotsResult describeClusterSnapshots() throws AmazonServiceException, AmazonClientException {
        return describeClusterSnapshots(new DescribeClusterSnapshotsRequest());
    }
    
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
    public DescribeClusterParameterGroupsResult describeClusterParameterGroups() throws AmazonServiceException, AmazonClientException {
        return describeClusterParameterGroups(new DescribeClusterParameterGroupsRequest());
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext)
    {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        