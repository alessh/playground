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
package com.amazonaws.services.cloudwatch;

import com.amazonaws.services.cloudwatch.model.*;

/**
 * Abstract implementation of {@code AmazonCloudWatchAsync}. Convenient method
 * forms pass through to the corresponding overload that takes a request object
 * and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAmazonCloudWatchAsync extends AbstractAmazonCloudWatch
        implements AmazonCloudWatchAsync {

    protected AbstractAmazonCloudWatchAsync() {
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAlarmsAsync(
            DeleteAlarmsRequest request) {

        return deleteAlarmsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAlarmsAsync(
            DeleteAlarmsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAlarmsRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(
            DescribeAlarmHistoryRequest request) {

        return describeAlarmHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(
            DescribeAlarmHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAlarmHistory operation.
     *
     * @see #describeAlarmHistoryAsync(DescribeAlarmHistoryRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync() {

        return describeAlarmHistoryAsync(new DescribeAlarmHistoryRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAlarmHistory operation
     * with an AsyncHandler.
     *
     * @see #describeAlarmHistoryAsync(DescribeAlarmHistoryRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler) {

        return describeAlarmHistoryAsync(new DescribeAlarmHistoryRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(
            DescribeAlarmsRequest request) {

        return describeAlarmsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(
            DescribeAlarmsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAlarms operation.
     *
     * @see #describeAlarmsAsync(DescribeAlarmsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync() {

        return describeAlarmsAsync(new DescribeAlarmsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAlarms operation with an
     * AsyncHandler.
     *
     * @see #describeAlarmsAsync(DescribeAlarmsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeAlarmsResult> describeAlarmsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler) {

        return describeAlarmsAsync(new DescribeAlarmsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(
            DescribeAlarmsForMetricRequest request) {

        return describeAlarmsForMetricAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(
            DescribeAlarmsForMetricRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmsForMetricRequest, DescribeAlarmsForMetricResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> disableAlarmActionsAsync(
            DisableAlarmActionsRequest request) {

        return disableAlarmActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> disableAlarmActionsAsync(
            DisableAlarmActionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableAlarmActionsRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> enableAlarmActionsAsync(
            EnableAlarmActionsRequest request) {

        return enableAlarmActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> enableAlarmActionsAsync(
            EnableAlarmActionsRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableAlarmActionsRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMetricStatisticsResult> getMetricStatisticsAsync(
            GetMetricStatisticsRequest request) {

        return getMetricStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetricStatisticsResult> getMetricStatisticsAsync(
            GetMetricStatisticsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMetricStatisticsRequest, GetMetricStatisticsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(
            ListMetricsRequest request) {

        return listMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(
            ListMetricsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListMetrics operation.
     *
     * @see #listMetricsAsync(ListMetricsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListMetricsResult> listMetricsAsync() {

        return listMetricsAsync(new ListMetricsRequest());
    }

    /**
     * Simplified method form for invoking the ListMetrics operation with an
     * AsyncHandler.
     *
     * @see #listMetricsAsync(ListMetricsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListMetricsResult> listMetricsAsync(
            com.amazonaws.handlers.AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler) {

        return listMetricsAsync(new ListMetricsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> putMetricAlarmAsync(
            PutMetricAlarmRequest request) {

        return putMetricAlarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putMetricAlarmAsync(
            PutMetricAlarmRequest request,
            com.amazonaws.handlers.AsyncHandler<PutMetricAlarmRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> putMetricDataAsync(
            PutMetricDataRequest request) {

        return putMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putMetricDataAsync(
            PutMetricDataRequest request,
            com.amazonaws.handlers.AsyncHandler<PutMetricDataRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> setAlarmStateAsync(
            SetAlarmStateRequest request) {

        return setAlarmStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setAlarmStateAsync(
            SetAlarmStateRequest request,
            com.amazonaws.handlers.AsyncHandler<SetAlarmStateRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
