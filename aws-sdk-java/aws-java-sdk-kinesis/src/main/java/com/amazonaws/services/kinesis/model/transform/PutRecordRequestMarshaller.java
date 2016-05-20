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
 * PutRecordRequest Marshaller
 */
public class PutRecordRequestMarshaller implements
        Marshaller<Request<PutRecordRequest>, PutRecordRequest> {

    public Request<PutRecordRequest> marshall(PutRecordRequest putRecordRequest) {

        if (putRecordRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<PutRecordRequest> request = new DefaultRequest<PutRecordRequest>(
                putRecordRequest, "AmazonKinesis");
        request.addHeader("X-Amz-Target", "Kinesis_20131202.PutRecord");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (putRecordRequest.getStreamName() != null) {
                jsonGenerator.writeFieldName("StreamName").writeValue(
                        putRecordRequest.getStreamName());
            }
            if (putRecordRequest.getData() != null) {
                jsonGenerator.writeFieldName("Data").writeValue(
                        putRecordRequest.getData());
            }
            if (putRecordRequest.getPartitionKey() != null) {
                jsonGenerator.writeFieldName("PartitionKey").writeValue(
                        putRecordRequest.getPartitionKey());
            }
            if (putRecordRequest.getExplicitHashKey() != null) {
                jsonGenerator.writeFieldName("ExplicitHashKey").writeValue(
                        putRecordRequest.getExplicitHashKey());
            }
            if (putRecordRequest.getSequenceNumberForOrdering() != null) {
                jsonGenerator
                        .writeFieldName("SequenceNumberForOrdering")
                        .writeValue(
                                putRecordRequest.getSequenceNumberForOrdering());
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
