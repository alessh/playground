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

package com.amazonaws.services.ecs.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * SubmitTaskStateChangeRequest Marshaller
 */
public class SubmitTaskStateChangeRequestMarshaller
        implements
        Marshaller<Request<SubmitTaskStateChangeRequest>, SubmitTaskStateChangeRequest> {

    public Request<SubmitTaskStateChangeRequest> marshall(
            SubmitTaskStateChangeRequest submitTaskStateChangeRequest) {

        if (submitTaskStateChangeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<SubmitTaskStateChangeRequest> request = new DefaultRequest<SubmitTaskStateChangeRequest>(
                submitTaskStateChangeRequest, "AmazonECS");
        request.addHeader("X-Amz-Target",
                "AmazonEC2ContainerServiceV20141113.SubmitTaskStateChange");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (submitTaskStateChangeRequest.getCluster() != null) {
                jsonGenerator.writeFieldName("cluster").writeValue(
                        submitTaskStateChangeRequest.getCluster());
            }
            if (submitTaskStateChangeRequest.getTask() != null) {
                jsonGenerator.writeFieldName("task").writeValue(
                        submitTaskStateChangeRequest.getTask());
            }
            if (submitTaskStateChangeRequest.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(
                        submitTaskStateChangeRequest.getStatus());
            }
            if (submitTaskStateChangeRequest.getReason() != null) {
                jsonGenerator.writeFieldName("reason").writeValue(
                        submitTaskStateChangeRequest.getReason());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", jsonGenerator.getContentType());
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
