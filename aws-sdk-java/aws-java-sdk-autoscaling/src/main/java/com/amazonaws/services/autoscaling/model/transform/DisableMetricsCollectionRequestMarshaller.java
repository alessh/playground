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

package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DisableMetricsCollectionRequest Marshaller
 */

public class DisableMetricsCollectionRequestMarshaller
        implements
        Marshaller<Request<DisableMetricsCollectionRequest>, DisableMetricsCollectionRequest> {

    public Request<DisableMetricsCollectionRequest> marshall(
            DisableMetricsCollectionRequest disableMetricsCollectionRequest) {

        if (disableMetricsCollectionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DisableMetricsCollectionRequest> request = new DefaultRequest<DisableMetricsCollectionRequest>(
                disableMetricsCollectionRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DisableMetricsCollection");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (disableMetricsCollectionRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils
                    .fromString(disableMetricsCollectionRequest
                            .getAutoScalingGroupName()));
        }

        com.amazonaws.internal.SdkInternalList<String> metricsList = (com.amazonaws.internal.SdkInternalList<String>) disableMetricsCollectionRequest
                .getMetrics();
        if (!metricsList.isEmpty() || !metricsList.isAutoConstruct()) {
            int metricsListIndex = 1;

            for (String metricsListValue : metricsList) {
                if (metricsListValue != null) {
                    request.addParameter("Metrics.member." + metricsListIndex,
                            StringUtils.fromString(metricsListValue));
                }
                metricsListIndex++;
            }
        }

        return request;
    }

}
