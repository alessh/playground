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

package com.amazonaws.services.apigateway.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * GetSdkRequest Marshaller
 */
public class GetSdkRequestMarshaller implements
        Marshaller<Request<GetSdkRequest>, GetSdkRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<GetSdkRequest> marshall(GetSdkRequest getSdkRequest) {

        if (getSdkRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<GetSdkRequest> request = new DefaultRequest<GetSdkRequest>(
                getSdkRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/restapis/{restapi_id}/stages/{stage_name}/sdks/{sdk_type}";

        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (getSdkRequest.getRestApiId() != null) ? StringUtils
                        .fromString(getSdkRequest.getRestApiId()) : "");
        uriResourcePath = uriResourcePath.replace(
                "{stage_name}",
                (getSdkRequest.getStageName() != null) ? StringUtils
                        .fromString(getSdkRequest.getStageName()) : "");
        uriResourcePath = uriResourcePath.replace(
                "{sdk_type}",
                (getSdkRequest.getSdkType() != null) ? StringUtils
                        .fromString(getSdkRequest.getSdkType()) : "");
        request.setResourcePath(uriResourcePath);

        java.util.Map<String, String> parameters = getSdkRequest
                .getParameters();
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            if (entry.getValue() != null) {
                request.addParameter(StringUtils.fromString(entry.getKey()),
                        StringUtils.fromString(entry.getValue()));
            }
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
        }

        return request;
    }

}
