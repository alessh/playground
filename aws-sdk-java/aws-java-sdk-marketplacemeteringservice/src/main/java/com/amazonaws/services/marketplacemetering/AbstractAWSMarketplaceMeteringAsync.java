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
package com.amazonaws.services.marketplacemetering;

import com.amazonaws.services.marketplacemetering.model.*;

/**
 * Abstract implementation of {@code AWSMarketplaceMeteringAsync}. Convenient
 * method forms pass through to the corresponding overload that takes a request
 * object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAWSMarketplaceMeteringAsync extends
        AbstractAWSMarketplaceMetering implements AWSMarketplaceMeteringAsync {

    protected AbstractAWSMarketplaceMeteringAsync() {
    }

    @Override
    public java.util.concurrent.Future<MeterUsageResult> meterUsageAsync(
            MeterUsageRequest request) {

        return meterUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MeterUsageResult> meterUsageAsync(
            MeterUsageRequest request,
            com.amazonaws.handlers.AsyncHandler<MeterUsageRequest, MeterUsageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
