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
package com.amazonaws.services.marketplacecommerceanalytics;

import com.amazonaws.services.marketplacecommerceanalytics.model.*;

/**
 * Interface for accessing AWS Marketplace Commerce Analytics asynchronously.
 * Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * Provides AWS Marketplace business intelligence data on-demand.
 */
public interface AWSMarketplaceCommerceAnalyticsAsync extends
        AWSMarketplaceCommerceAnalytics {

    /**
     * Given a data set type and data set publication date, asynchronously
     * publishes the requested data set to the specified S3 bucket and notifies
     * the specified SNS topic once the data is available. Returns a unique
     * request identifier that can be used to correlate requests with
     * notifications from the SNS topic. Data sets will be published in
     * comma-separated values (CSV) format with the file name
     * {data_set_type}_YYYY-MM-DD.csv. If a file with the same name already
     * exists (e.g. if the same data set is requested twice), the original file
     * will be overwritten by the new file. Requires a Role with an attached
     * permissions policy providing Allow permissions for the following actions:
     * s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish,
     * iam:GetRolePolicy.
     * 
     * @param generateDataSetRequest
     *        Container for the parameters to the GenerateDataSet operation.
     * @return A Java Future containing the result of the GenerateDataSet
     *         operation returned by the service.
     * @sample AWSMarketplaceCommerceAnalyticsAsync.GenerateDataSet
     */
    java.util.concurrent.Future<GenerateDataSetResult> generateDataSetAsync(
            GenerateDataSetRequest generateDataSetRequest);

    /**
     * Given a data set type and data set publication date, asynchronously
     * publishes the requested data set to the specified S3 bucket and notifies
     * the specified SNS topic once the data is available. Returns a unique
     * request identifier that can be used to correlate requests with
     * notifications from the SNS topic. Data sets will be published in
     * comma-separated values (CSV) format with the file name
     * {data_set_type}_YYYY-MM-DD.csv. If a file with the same name already
     * exists (e.g. if the same data set is requested twice), the original file
     * will be overwritten by the new file. Requires a Role with an attached
     * permissions policy providing Allow permissions for the following actions:
     * s3:PutObject, s3:GetBucketLocation, sns:GetTopicAttributes, sns:Publish,
     * iam:GetRolePolicy.
     * 
     * @param generateDataSetRequest
     *        Container for the parameters to the GenerateDataSet operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateDataSet
     *         operation returned by the service.
     * @sample AWSMarketplaceCommerceAnalyticsAsyncHandler.GenerateDataSet
     */
    java.util.concurrent.Future<GenerateDataSetResult> generateDataSetAsync(
            GenerateDataSetRequest generateDataSetRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateDataSetRequest, GenerateDataSetResult> asyncHandler);

}
