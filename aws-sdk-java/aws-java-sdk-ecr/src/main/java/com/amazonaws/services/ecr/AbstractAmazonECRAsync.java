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
package com.amazonaws.services.ecr;

import com.amazonaws.services.ecr.model.*;

/**
 * Abstract implementation of {@code AmazonECRAsync}. Convenient method forms
 * pass through to the corresponding overload that takes a request object and an
 * {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonECRAsync extends AbstractAmazonECR implements
        AmazonECRAsync {

    protected AbstractAmazonECRAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchCheckLayerAvailabilityResult> batchCheckLayerAvailabilityAsync(
            BatchCheckLayerAvailabilityRequest request) {

        return batchCheckLayerAvailabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCheckLayerAvailabilityResult> batchCheckLayerAvailabilityAsync(
            BatchCheckLayerAvailabilityRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchCheckLayerAvailabilityRequest, BatchCheckLayerAvailabilityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteImageResult> batchDeleteImageAsync(
            BatchDeleteImageRequest request) {

        return batchDeleteImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteImageResult> batchDeleteImageAsync(
            BatchDeleteImageRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteImageRequest, BatchDeleteImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetImageResult> batchGetImageAsync(
            BatchGetImageRequest request) {

        return batchGetImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetImageResult> batchGetImageAsync(
            BatchGetImageRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetImageRequest, BatchGetImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CompleteLayerUploadResult> completeLayerUploadAsync(
            CompleteLayerUploadRequest request) {

        return completeLayerUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompleteLayerUploadResult> completeLayerUploadAsync(
            CompleteLayerUploadRequest request,
            com.amazonaws.handlers.AsyncHandler<CompleteLayerUploadRequest, CompleteLayerUploadResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(
            CreateRepositoryRequest request) {

        return createRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(
            CreateRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(
            DeleteRepositoryRequest request) {

        return deleteRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(
            DeleteRepositoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryPolicyResult> deleteRepositoryPolicyAsync(
            DeleteRepositoryPolicyRequest request) {

        return deleteRepositoryPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryPolicyResult> deleteRepositoryPolicyAsync(
            DeleteRepositoryPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryPolicyRequest, DeleteRepositoryPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoriesResult> describeRepositoriesAsync(
            DescribeRepositoriesRequest request) {

        return describeRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoriesResult> describeRepositoriesAsync(
            DescribeRepositoriesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRepositoriesRequest, DescribeRepositoriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(
            GetAuthorizationTokenRequest request) {

        return getAuthorizationTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(
            GetAuthorizationTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAuthorizationTokenRequest, GetAuthorizationTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDownloadUrlForLayerResult> getDownloadUrlForLayerAsync(
            GetDownloadUrlForLayerRequest request) {

        return getDownloadUrlForLayerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDownloadUrlForLayerResult> getDownloadUrlForLayerAsync(
            GetDownloadUrlForLayerRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDownloadUrlForLayerRequest, GetDownloadUrlForLayerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryPolicyResult> getRepositoryPolicyAsync(
            GetRepositoryPolicyRequest request) {

        return getRepositoryPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryPolicyResult> getRepositoryPolicyAsync(
            GetRepositoryPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryPolicyRequest, GetRepositoryPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InitiateLayerUploadResult> initiateLayerUploadAsync(
            InitiateLayerUploadRequest request) {

        return initiateLayerUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateLayerUploadResult> initiateLayerUploadAsync(
            InitiateLayerUploadRequest request,
            com.amazonaws.handlers.AsyncHandler<InitiateLayerUploadRequest, InitiateLayerUploadResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListImagesResult> listImagesAsync(
            ListImagesRequest request) {

        return listImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImagesResult> listImagesAsync(
            ListImagesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListImagesRequest, ListImagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutImageResult> putImageAsync(
            PutImageRequest request) {

        return putImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutImageResult> putImageAsync(
            PutImageRequest request,
            com.amazonaws.handlers.AsyncHandler<PutImageRequest, PutImageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetRepositoryPolicyResult> setRepositoryPolicyAsync(
            SetRepositoryPolicyRequest request) {

        return setRepositoryPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetRepositoryPolicyResult> setRepositoryPolicyAsync(
            SetRepositoryPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<SetRepositoryPolicyRequest, SetRepositoryPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UploadLayerPartResult> uploadLayerPartAsync(
            UploadLayerPartRequest request) {

        return uploadLayerPartAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadLayerPartResult> uploadLayerPartAsync(
            UploadLayerPartRequest request,
            com.amazonaws.handlers.AsyncHandler<UploadLayerPartRequest, UploadLayerPartResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
