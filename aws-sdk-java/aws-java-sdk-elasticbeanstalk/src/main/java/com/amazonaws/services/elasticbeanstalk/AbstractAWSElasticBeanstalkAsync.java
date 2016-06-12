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
package com.amazonaws.services.elasticbeanstalk;

import com.amazonaws.services.elasticbeanstalk.model.*;

/**
 * Abstract implementation of {@code AWSElasticBeanstalkAsync}. Convenient
 * method forms pass through to the corresponding overload that takes a request
 * object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAWSElasticBeanstalkAsync extends
        AbstractAWSElasticBeanstalk implements AWSElasticBeanstalkAsync {

    protected AbstractAWSElasticBeanstalkAsync() {
    }

    @Override
    public java.util.concurrent.Future<Void> abortEnvironmentUpdateAsync(
            AbortEnvironmentUpdateRequest request) {

        return abortEnvironmentUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> abortEnvironmentUpdateAsync(
            AbortEnvironmentUpdateRequest request,
            com.amazonaws.handlers.AsyncHandler<AbortEnvironmentUpdateRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the AbortEnvironmentUpdate operation.
     *
     * @see #abortEnvironmentUpdateAsync(AbortEnvironmentUpdateRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> abortEnvironmentUpdateAsync() {

        return abortEnvironmentUpdateAsync(new AbortEnvironmentUpdateRequest());
    }

    /**
     * Simplified method form for invoking the AbortEnvironmentUpdate operation
     * with an AsyncHandler.
     *
     * @see #abortEnvironmentUpdateAsync(AbortEnvironmentUpdateRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> abortEnvironmentUpdateAsync(
            com.amazonaws.handlers.AsyncHandler<AbortEnvironmentUpdateRequest, Void> asyncHandler) {

        return abortEnvironmentUpdateAsync(new AbortEnvironmentUpdateRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CheckDNSAvailabilityResult> checkDNSAvailabilityAsync(
            CheckDNSAvailabilityRequest request) {

        return checkDNSAvailabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckDNSAvailabilityResult> checkDNSAvailabilityAsync(
            CheckDNSAvailabilityRequest request,
            com.amazonaws.handlers.AsyncHandler<CheckDNSAvailabilityRequest, CheckDNSAvailabilityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ComposeEnvironmentsResult> composeEnvironmentsAsync(
            ComposeEnvironmentsRequest request) {

        return composeEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ComposeEnvironmentsResult> composeEnvironmentsAsync(
            ComposeEnvironmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ComposeEnvironmentsRequest, ComposeEnvironmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(
            CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(
            CreateApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationVersionResult> createApplicationVersionAsync(
            CreateApplicationVersionRequest request) {

        return createApplicationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationVersionResult> createApplicationVersionAsync(
            CreateApplicationVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationVersionRequest, CreateApplicationVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationTemplateResult> createConfigurationTemplateAsync(
            CreateConfigurationTemplateRequest request) {

        return createConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationTemplateResult> createConfigurationTemplateAsync(
            CreateConfigurationTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(
            CreateEnvironmentRequest request) {

        return createEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(
            CreateEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStorageLocationResult> createStorageLocationAsync(
            CreateStorageLocationRequest request) {

        return createStorageLocationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStorageLocationResult> createStorageLocationAsync(
            CreateStorageLocationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStorageLocationRequest, CreateStorageLocationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the CreateStorageLocation operation.
     *
     * @see #createStorageLocationAsync(CreateStorageLocationRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateStorageLocationResult> createStorageLocationAsync() {

        return createStorageLocationAsync(new CreateStorageLocationRequest());
    }

    /**
     * Simplified method form for invoking the CreateStorageLocation operation
     * with an AsyncHandler.
     *
     * @see #createStorageLocationAsync(CreateStorageLocationRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<CreateStorageLocationResult> createStorageLocationAsync(
            com.amazonaws.handlers.AsyncHandler<CreateStorageLocationRequest, CreateStorageLocationResult> asyncHandler) {

        return createStorageLocationAsync(new CreateStorageLocationRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteApplicationAsync(
            DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteApplicationAsync(
            DeleteApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteApplicationVersionAsync(
            DeleteApplicationVersionRequest request) {

        return deleteApplicationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteApplicationVersionAsync(
            DeleteApplicationVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationVersionRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteConfigurationTemplateAsync(
            DeleteConfigurationTemplateRequest request) {

        return deleteConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteConfigurationTemplateAsync(
            DeleteConfigurationTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationTemplateRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteEnvironmentConfigurationAsync(
            DeleteEnvironmentConfigurationRequest request) {

        return deleteEnvironmentConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteEnvironmentConfigurationAsync(
            DeleteEnvironmentConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentConfigurationRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync(
            DescribeApplicationVersionsRequest request) {

        return describeApplicationVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync(
            DescribeApplicationVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationVersionsRequest, DescribeApplicationVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeApplicationVersions
     * operation.
     *
     * @see #describeApplicationVersionsAsync(DescribeApplicationVersionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync() {

        return describeApplicationVersionsAsync(new DescribeApplicationVersionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeApplicationVersions
     * operation with an AsyncHandler.
     *
     * @see #describeApplicationVersionsAsync(DescribeApplicationVersionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationVersionsRequest, DescribeApplicationVersionsResult> asyncHandler) {

        return describeApplicationVersionsAsync(
                new DescribeApplicationVersionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationsResult> describeApplicationsAsync(
            DescribeApplicationsRequest request) {

        return describeApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApplicationsResult> describeApplicationsAsync(
            DescribeApplicationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationsRequest, DescribeApplicationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeApplications operation.
     *
     * @see #describeApplicationsAsync(DescribeApplicationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeApplicationsResult> describeApplicationsAsync() {

        return describeApplicationsAsync(new DescribeApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeApplications operation
     * with an AsyncHandler.
     *
     * @see #describeApplicationsAsync(DescribeApplicationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeApplicationsResult> describeApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationsRequest, DescribeApplicationsResult> asyncHandler) {

        return describeApplicationsAsync(new DescribeApplicationsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationOptionsResult> describeConfigurationOptionsAsync(
            DescribeConfigurationOptionsRequest request) {

        return describeConfigurationOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationOptionsResult> describeConfigurationOptionsAsync(
            DescribeConfigurationOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationOptionsRequest, DescribeConfigurationOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationSettingsResult> describeConfigurationSettingsAsync(
            DescribeConfigurationSettingsRequest request) {

        return describeConfigurationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationSettingsResult> describeConfigurationSettingsAsync(
            DescribeConfigurationSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationSettingsRequest, DescribeConfigurationSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentHealthResult> describeEnvironmentHealthAsync(
            DescribeEnvironmentHealthRequest request) {

        return describeEnvironmentHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentHealthResult> describeEnvironmentHealthAsync(
            DescribeEnvironmentHealthRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentHealthRequest, DescribeEnvironmentHealthResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentResourcesResult> describeEnvironmentResourcesAsync(
            DescribeEnvironmentResourcesRequest request) {

        return describeEnvironmentResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentResourcesResult> describeEnvironmentResourcesAsync(
            DescribeEnvironmentResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentResourcesRequest, DescribeEnvironmentResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(
            DescribeEnvironmentsRequest request) {

        return describeEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(
            DescribeEnvironmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentsRequest, DescribeEnvironmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeEnvironments operation.
     *
     * @see #describeEnvironmentsAsync(DescribeEnvironmentsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync() {

        return describeEnvironmentsAsync(new DescribeEnvironmentsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEnvironments operation
     * with an AsyncHandler.
     *
     * @see #describeEnvironmentsAsync(DescribeEnvironmentsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentsRequest, DescribeEnvironmentsResult> asyncHandler) {

        return describeEnvironmentsAsync(new DescribeEnvironmentsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            DescribeEventsRequest request) {

        return describeEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            DescribeEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEventsAsync(DescribeEventsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync() {

        return describeEventsAsync(new DescribeEventsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEvents operation with an
     * AsyncHandler.
     *
     * @see #describeEventsAsync(DescribeEventsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {

        return describeEventsAsync(new DescribeEventsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesHealthResult> describeInstancesHealthAsync(
            DescribeInstancesHealthRequest request) {

        return describeInstancesHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesHealthResult> describeInstancesHealthAsync(
            DescribeInstancesHealthRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInstancesHealthRequest, DescribeInstancesHealthResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync(
            ListAvailableSolutionStacksRequest request) {

        return listAvailableSolutionStacksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync(
            ListAvailableSolutionStacksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAvailableSolutionStacksRequest, ListAvailableSolutionStacksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListAvailableSolutionStacks
     * operation.
     *
     * @see #listAvailableSolutionStacksAsync(ListAvailableSolutionStacksRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync() {

        return listAvailableSolutionStacksAsync(new ListAvailableSolutionStacksRequest());
    }

    /**
     * Simplified method form for invoking the ListAvailableSolutionStacks
     * operation with an AsyncHandler.
     *
     * @see #listAvailableSolutionStacksAsync(ListAvailableSolutionStacksRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync(
            com.amazonaws.handlers.AsyncHandler<ListAvailableSolutionStacksRequest, ListAvailableSolutionStacksResult> asyncHandler) {

        return listAvailableSolutionStacksAsync(
                new ListAvailableSolutionStacksRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> rebuildEnvironmentAsync(
            RebuildEnvironmentRequest request) {

        return rebuildEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> rebuildEnvironmentAsync(
            RebuildEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<RebuildEnvironmentRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> requestEnvironmentInfoAsync(
            RequestEnvironmentInfoRequest request) {

        return requestEnvironmentInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> requestEnvironmentInfoAsync(
            RequestEnvironmentInfoRequest request,
            com.amazonaws.handlers.AsyncHandler<RequestEnvironmentInfoRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> restartAppServerAsync(
            RestartAppServerRequest request) {

        return restartAppServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> restartAppServerAsync(
            RestartAppServerRequest request,
            com.amazonaws.handlers.AsyncHandler<RestartAppServerRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RetrieveEnvironmentInfoResult> retrieveEnvironmentInfoAsync(
            RetrieveEnvironmentInfoRequest request) {

        return retrieveEnvironmentInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RetrieveEnvironmentInfoResult> retrieveEnvironmentInfoAsync(
            RetrieveEnvironmentInfoRequest request,
            com.amazonaws.handlers.AsyncHandler<RetrieveEnvironmentInfoRequest, RetrieveEnvironmentInfoResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> swapEnvironmentCNAMEsAsync(
            SwapEnvironmentCNAMEsRequest request) {

        return swapEnvironmentCNAMEsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> swapEnvironmentCNAMEsAsync(
            SwapEnvironmentCNAMEsRequest request,
            com.amazonaws.handlers.AsyncHandler<SwapEnvironmentCNAMEsRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the SwapEnvironmentCNAMEs operation.
     *
     * @see #swapEnvironmentCNAMEsAsync(SwapEnvironmentCNAMEsRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> swapEnvironmentCNAMEsAsync() {

        return swapEnvironmentCNAMEsAsync(new SwapEnvironmentCNAMEsRequest());
    }

    /**
     * Simplified method form for invoking the SwapEnvironmentCNAMEs operation
     * with an AsyncHandler.
     *
     * @see #swapEnvironmentCNAMEsAsync(SwapEnvironmentCNAMEsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> swapEnvironmentCNAMEsAsync(
            com.amazonaws.handlers.AsyncHandler<SwapEnvironmentCNAMEsRequest, Void> asyncHandler) {

        return swapEnvironmentCNAMEsAsync(new SwapEnvironmentCNAMEsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<TerminateEnvironmentResult> terminateEnvironmentAsync(
            TerminateEnvironmentRequest request) {

        return terminateEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TerminateEnvironmentResult> terminateEnvironmentAsync(
            TerminateEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateEnvironmentRequest, TerminateEnvironmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(
            UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(
            UpdateApplicationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationVersionResult> updateApplicationVersionAsync(
            UpdateApplicationVersionRequest request) {

        return updateApplicationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationVersionResult> updateApplicationVersionAsync(
            UpdateApplicationVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationVersionRequest, UpdateApplicationVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationTemplateResult> updateConfigurationTemplateAsync(
            UpdateConfigurationTemplateRequest request) {

        return updateConfigurationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationTemplateResult> updateConfigurationTemplateAsync(
            UpdateConfigurationTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationTemplateRequest, UpdateConfigurationTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(
            UpdateEnvironmentRequest request) {

        return updateEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(
            UpdateEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ValidateConfigurationSettingsResult> validateConfigurationSettingsAsync(
            ValidateConfigurationSettingsRequest request) {

        return validateConfigurationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidateConfigurationSettingsResult> validateConfigurationSettingsAsync(
            ValidateConfigurationSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ValidateConfigurationSettingsRequest, ValidateConfigurationSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
