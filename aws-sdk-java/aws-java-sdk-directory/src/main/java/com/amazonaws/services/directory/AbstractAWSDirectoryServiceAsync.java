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
package com.amazonaws.services.directory;

import com.amazonaws.services.directory.model.*;

/**
 * Abstract implementation of {@code AWSDirectoryServiceAsync}. Convenient
 * method forms pass through to the corresponding overload that takes a request
 * object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAWSDirectoryServiceAsync extends
        AbstractAWSDirectoryService implements AWSDirectoryServiceAsync {

    protected AbstractAWSDirectoryServiceAsync() {
    }

    @Override
    public java.util.concurrent.Future<ConnectDirectoryResult> connectDirectoryAsync(
            ConnectDirectoryRequest request) {

        return connectDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConnectDirectoryResult> connectDirectoryAsync(
            ConnectDirectoryRequest request,
            com.amazonaws.handlers.AsyncHandler<ConnectDirectoryRequest, ConnectDirectoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(
            CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(
            CreateAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateComputerResult> createComputerAsync(
            CreateComputerRequest request) {

        return createComputerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateComputerResult> createComputerAsync(
            CreateComputerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateComputerRequest, CreateComputerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateConditionalForwarderResult> createConditionalForwarderAsync(
            CreateConditionalForwarderRequest request) {

        return createConditionalForwarderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConditionalForwarderResult> createConditionalForwarderAsync(
            CreateConditionalForwarderRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConditionalForwarderRequest, CreateConditionalForwarderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(
            CreateDirectoryRequest request) {

        return createDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(
            CreateDirectoryRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDirectoryRequest, CreateDirectoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMicrosoftADResult> createMicrosoftADAsync(
            CreateMicrosoftADRequest request) {

        return createMicrosoftADAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMicrosoftADResult> createMicrosoftADAsync(
            CreateMicrosoftADRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMicrosoftADRequest, CreateMicrosoftADResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(
            CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(
            CreateSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTrustResult> createTrustAsync(
            CreateTrustRequest request) {

        return createTrustAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrustResult> createTrustAsync(
            CreateTrustRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTrustRequest, CreateTrustResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConditionalForwarderResult> deleteConditionalForwarderAsync(
            DeleteConditionalForwarderRequest request) {

        return deleteConditionalForwarderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConditionalForwarderResult> deleteConditionalForwarderAsync(
            DeleteConditionalForwarderRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConditionalForwarderRequest, DeleteConditionalForwarderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(
            DeleteDirectoryRequest request) {

        return deleteDirectoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(
            DeleteDirectoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDirectoryRequest, DeleteDirectoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(
            DeleteSnapshotRequest request) {

        return deleteSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(
            DeleteSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTrustResult> deleteTrustAsync(
            DeleteTrustRequest request) {

        return deleteTrustAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrustResult> deleteTrustAsync(
            DeleteTrustRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTrustRequest, DeleteTrustResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterEventTopicResult> deregisterEventTopicAsync(
            DeregisterEventTopicRequest request) {

        return deregisterEventTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterEventTopicResult> deregisterEventTopicAsync(
            DeregisterEventTopicRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterEventTopicRequest, DeregisterEventTopicResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConditionalForwardersResult> describeConditionalForwardersAsync(
            DescribeConditionalForwardersRequest request) {

        return describeConditionalForwardersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConditionalForwardersResult> describeConditionalForwardersAsync(
            DescribeConditionalForwardersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConditionalForwardersRequest, DescribeConditionalForwardersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(
            DescribeDirectoriesRequest request) {

        return describeDirectoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(
            DescribeDirectoriesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDirectoriesRequest, DescribeDirectoriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDirectories operation.
     *
     * @see #describeDirectoriesAsync(DescribeDirectoriesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync() {

        return describeDirectoriesAsync(new DescribeDirectoriesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDirectories operation
     * with an AsyncHandler.
     *
     * @see #describeDirectoriesAsync(DescribeDirectoriesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDirectoriesResult> describeDirectoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDirectoriesRequest, DescribeDirectoriesResult> asyncHandler) {

        return describeDirectoriesAsync(new DescribeDirectoriesRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventTopicsResult> describeEventTopicsAsync(
            DescribeEventTopicsRequest request) {

        return describeEventTopicsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventTopicsResult> describeEventTopicsAsync(
            DescribeEventTopicsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventTopicsRequest, DescribeEventTopicsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            DescribeSnapshotsRequest request) {

        return describeSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            DescribeSnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync() {

        return describeSnapshotsAsync(new DescribeSnapshotsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSnapshots operation with
     * an AsyncHandler.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {

        return describeSnapshotsAsync(new DescribeSnapshotsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustsResult> describeTrustsAsync(
            DescribeTrustsRequest request) {

        return describeTrustsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrustsResult> describeTrustsAsync(
            DescribeTrustsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustsRequest, DescribeTrustsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableRadiusResult> disableRadiusAsync(
            DisableRadiusRequest request) {

        return disableRadiusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableRadiusResult> disableRadiusAsync(
            DisableRadiusRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableRadiusRequest, DisableRadiusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableSsoResult> disableSsoAsync(
            DisableSsoRequest request) {

        return disableSsoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableSsoResult> disableSsoAsync(
            DisableSsoRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableSsoRequest, DisableSsoResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableRadiusResult> enableRadiusAsync(
            EnableRadiusRequest request) {

        return enableRadiusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableRadiusResult> enableRadiusAsync(
            EnableRadiusRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableRadiusRequest, EnableRadiusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableSsoResult> enableSsoAsync(
            EnableSsoRequest request) {

        return enableSsoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableSsoResult> enableSsoAsync(
            EnableSsoRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableSsoRequest, EnableSsoResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(
            GetDirectoryLimitsRequest request) {

        return getDirectoryLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(
            GetDirectoryLimitsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDirectoryLimitsRequest, GetDirectoryLimitsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetDirectoryLimits operation.
     *
     * @see #getDirectoryLimitsAsync(GetDirectoryLimitsRequest)
     */
    @Override
    public java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync() {

        return getDirectoryLimitsAsync(new GetDirectoryLimitsRequest());
    }

    /**
     * Simplified method form for invoking the GetDirectoryLimits operation with
     * an AsyncHandler.
     *
     * @see #getDirectoryLimitsAsync(GetDirectoryLimitsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(
            com.amazonaws.handlers.AsyncHandler<GetDirectoryLimitsRequest, GetDirectoryLimitsResult> asyncHandler) {

        return getDirectoryLimitsAsync(new GetDirectoryLimitsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(
            GetSnapshotLimitsRequest request) {

        return getSnapshotLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(
            GetSnapshotLimitsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSnapshotLimitsRequest, GetSnapshotLimitsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterEventTopicResult> registerEventTopicAsync(
            RegisterEventTopicRequest request) {

        return registerEventTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterEventTopicResult> registerEventTopicAsync(
            RegisterEventTopicRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterEventTopicRequest, RegisterEventTopicResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(
            RestoreFromSnapshotRequest request) {

        return restoreFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(
            RestoreFromSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreFromSnapshotRequest, RestoreFromSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateConditionalForwarderResult> updateConditionalForwarderAsync(
            UpdateConditionalForwarderRequest request) {

        return updateConditionalForwarderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConditionalForwarderResult> updateConditionalForwarderAsync(
            UpdateConditionalForwarderRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateConditionalForwarderRequest, UpdateConditionalForwarderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRadiusResult> updateRadiusAsync(
            UpdateRadiusRequest request) {

        return updateRadiusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRadiusResult> updateRadiusAsync(
            UpdateRadiusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRadiusRequest, UpdateRadiusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<VerifyTrustResult> verifyTrustAsync(
            VerifyTrustRequest request) {

        return verifyTrustAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyTrustResult> verifyTrustAsync(
            VerifyTrustRequest request,
            com.amazonaws.handlers.AsyncHandler<VerifyTrustRequest, VerifyTrustResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
