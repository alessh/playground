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
 * DescribeLifecycleHooksRequest Marshaller
 */

public class DescribeLifecycleHooksRequestMarshaller
        implements
        Marshaller<Request<DescribeLifecycleHooksRequest>, DescribeLifecycleHooksRequest> {

    public Request<DescribeLifecycleHooksRequest> marshall(
            DescribeLifecycleHooksRequest describeLifecycleHooksRequest) {

        if (describeLifecycleHooksRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeLifecycleHooksRequest> request = new DefaultRequest<DescribeLifecycleHooksRequest>(
                describeLifecycleHooksRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeLifecycleHooks");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeLifecycleHooksRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils
                    .fromString(describeLifecycleHooksRequest
                            .getAutoScalingGroupName()));
        }

        com.amazonaws.internal.SdkInternalList<String> lifecycleHookNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeLifecycleHooksRequest
                .getLifecycleHookNames();
        if (!lifecycleHookNamesList.isEmpty()
                || !lifecycleHookNamesList.isAutoConstruct()) {
            int lifecycleHookNamesListIndex = 1;

            for (String lifecycleHookNamesListValue : lifecycleHookNamesList) {
                if (lifecycleHookNamesListValue != null) {
                    request.addParameter("LifecycleHookNames.member."
                            + lifecycleHookNamesListIndex,
                            StringUtils.fromString(lifecycleHookNamesListValue));
                }
                lifecycleHookNamesListIndex++;
            }
        }

        return request;
    }

}
