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

package com.amazonaws.services.route53.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.XMLWriter;

/**
 * GetHealthCheckRequest Marshaller
 */

public class GetHealthCheckRequestMarshaller implements
        Marshaller<Request<GetHealthCheckRequest>, GetHealthCheckRequest> {

    public Request<GetHealthCheckRequest> marshall(
            GetHealthCheckRequest getHealthCheckRequest) {

        if (getHealthCheckRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<GetHealthCheckRequest> request = new DefaultRequest<GetHealthCheckRequest>(
                getHealthCheckRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-04-01/healthcheck/{HealthCheckId}";

        uriResourcePath = uriResourcePath
                .replace(
                        "{HealthCheckId}",
                        (getHealthCheckRequest.getHealthCheckId() != null) ? StringUtils
                                .fromString(getHealthCheckRequest
                                        .getHealthCheckId()) : "");
        request.setResourcePath(uriResourcePath);

        return request;
    }

}
