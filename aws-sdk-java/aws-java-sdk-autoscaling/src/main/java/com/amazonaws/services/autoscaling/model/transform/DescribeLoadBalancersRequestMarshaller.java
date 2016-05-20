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
 * DescribeLoadBalancersRequest Marshaller
 */

public class DescribeLoadBalancersRequestMarshaller
        implements
        Marshaller<Request<DescribeLoadBalancersRequest>, DescribeLoadBalancersRequest> {

    public Request<DescribeLoadBalancersRequest> marshall(
            DescribeLoadBalancersRequest describeLoadBalancersRequest) {

        if (describeLoadBalancersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeLoadBalancersRequest> request = new DefaultRequest<DescribeLoadBalancersRequest>(
                describeLoadBalancersRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeLoadBalancers");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeLoadBalancersRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils
                    .fromString(describeLoadBalancersRequest
                            .getAutoScalingGroupName()));
        }

        if (describeLoadBalancersRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeLoadBalancersRequest.getNextToken()));
        }

        if (describeLoadBalancersRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils
                    .fromInteger(describeLoadBalancersRequest.getMaxRecords()));
        }

        return request;
    }

}
