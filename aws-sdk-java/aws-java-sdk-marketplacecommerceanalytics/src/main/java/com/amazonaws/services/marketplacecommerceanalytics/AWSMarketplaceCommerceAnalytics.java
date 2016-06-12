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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.marketplacecommerceanalytics.model.*;

/**
 * Interface for accessing AWS Marketplace Commerce Analytics.
 * <p>
 * Provides AWS Marketplace business intelligence data on-demand.
 */
public interface AWSMarketplaceCommerceAnalytics {

    /**
     * Overrides the default endpoint for this client
     * ("https://marketplacecommerceanalytics.us-east-1.amazonaws.com"). Callers
     * can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "marketplacecommerceanalytics.us-east-1.amazonaws.com") or a full URL,
     * including the protocol (ex:
     * "https://marketplacecommerceanalytics.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex:
     *        "marketplacecommerceanalytics.us-east-1.amazonaws.com") or a full
     *        URL, including the protocol (ex:
     *        "https://marketplacecommerceanalytics.us-east-1.amazonaws.com") of
     *        the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to
     * {@link AWSMarketplaceCommerceAnalytics#setEndpoint(String)}, sets the
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
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
     * @return Result of the GenerateDataSet operation returned by the service.
     * @throws MarketplaceCommerceAnalyticsException
     *         This exception is thrown when an internal service error occurs.
     * @sample AWSMarketplaceCommerceAnalytics.GenerateDataSet
     */
    GenerateDataSetResult generateDataSet(
            GenerateDataSetRequest generateDataSetRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
