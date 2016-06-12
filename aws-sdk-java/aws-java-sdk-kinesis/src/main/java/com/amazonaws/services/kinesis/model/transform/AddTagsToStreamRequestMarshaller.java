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

package com.amazonaws.services.kinesis.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * AddTagsToStreamRequest Marshaller
 */
public class AddTagsToStreamRequestMarshaller implements
        Marshaller<Request<AddTagsToStreamRequest>, AddTagsToStreamRequest> {

    public Request<AddTagsToStreamRequest> marshall(
            AddTagsToStreamRequest addTagsToStreamRequest) {

        if (addTagsToStreamRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AddTagsToStreamRequest> request = new DefaultRequest<AddTagsToStreamRequest>(
                addTagsToStreamRequest, "AmazonKinesis");
        request.addHeader("X-Amz-Target", "Kinesis_20131202.AddTagsToStream");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (addTagsToStreamRequest.getStreamName() != null) {
                jsonGenerator.writeFieldName("StreamName").writeValue(
                        addTagsToStreamRequest.getStreamName());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> tagsMap = (com.amazonaws.internal.SdkInternalMap<String, String>) addTagsToStreamRequest
                    .getTags();
            if (!tagsMap.isEmpty() || !tagsMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Tags");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> tagsMapValue : tagsMap
                        .entrySet()) {
                    if (tagsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(tagsMapValue.getKey());

                        jsonGenerator.writeValue(tagsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
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
