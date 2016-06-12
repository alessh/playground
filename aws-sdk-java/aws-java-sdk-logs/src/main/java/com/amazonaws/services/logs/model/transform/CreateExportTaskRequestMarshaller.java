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

package com.amazonaws.services.logs.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateExportTaskRequest Marshaller
 */
public class CreateExportTaskRequestMarshaller implements
        Marshaller<Request<CreateExportTaskRequest>, CreateExportTaskRequest> {

    public Request<CreateExportTaskRequest> marshall(
            CreateExportTaskRequest createExportTaskRequest) {

        if (createExportTaskRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateExportTaskRequest> request = new DefaultRequest<CreateExportTaskRequest>(
                createExportTaskRequest, "AWSLogs");
        request.addHeader("X-Amz-Target", "Logs_20140328.CreateExportTask");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (createExportTaskRequest.getTaskName() != null) {
                jsonGenerator.writeFieldName("taskName").writeValue(
                        createExportTaskRequest.getTaskName());
            }
            if (createExportTaskRequest.getLogGroupName() != null) {
                jsonGenerator.writeFieldName("logGroupName").writeValue(
                        createExportTaskRequest.getLogGroupName());
            }
            if (createExportTaskRequest.getLogStreamNamePrefix() != null) {
                jsonGenerator.writeFieldName("logStreamNamePrefix").writeValue(
                        createExportTaskRequest.getLogStreamNamePrefix());
            }
            if (createExportTaskRequest.getFrom() != null) {
                jsonGenerator.writeFieldName("from").writeValue(
                        createExportTaskRequest.getFrom());
            }
            if (createExportTaskRequest.getTo() != null) {
                jsonGenerator.writeFieldName("to").writeValue(
                        createExportTaskRequest.getTo());
            }
            if (createExportTaskRequest.getDestination() != null) {
                jsonGenerator.writeFieldName("destination").writeValue(
                        createExportTaskRequest.getDestination());
            }
            if (createExportTaskRequest.getDestinationPrefix() != null) {
                jsonGenerator.writeFieldName("destinationPrefix").writeValue(
                        createExportTaskRequest.getDestinationPrefix());
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
