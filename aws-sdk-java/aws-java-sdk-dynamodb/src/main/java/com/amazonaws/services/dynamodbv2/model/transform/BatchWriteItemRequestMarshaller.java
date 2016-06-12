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

package com.amazonaws.services.dynamodbv2.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * BatchWriteItemRequest Marshaller
 */
public class BatchWriteItemRequestMarshaller implements
        Marshaller<Request<BatchWriteItemRequest>, BatchWriteItemRequest> {

    public Request<BatchWriteItemRequest> marshall(
            BatchWriteItemRequest batchWriteItemRequest) {

        if (batchWriteItemRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<BatchWriteItemRequest> request = new DefaultRequest<BatchWriteItemRequest>(
                batchWriteItemRequest, "AmazonDynamoDBv2");
        request.addHeader("X-Amz-Target", "DynamoDB_20120810.BatchWriteItem");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.0");

            jsonGenerator.writeStartObject();

            java.util.Map<String, java.util.List<WriteRequest>> requestItemsMap = batchWriteItemRequest
                    .getRequestItems();
            if (requestItemsMap != null) {
                jsonGenerator.writeFieldName("RequestItems");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, java.util.List<WriteRequest>> requestItemsMapValue : requestItemsMap
                        .entrySet()) {
                    if (requestItemsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(requestItemsMapValue
                                .getKey());

                        jsonGenerator.writeStartArray();
                        for (WriteRequest requestItemsMapValueList : requestItemsMapValue
                                .getValue()) {
                            if (requestItemsMapValueList != null) {

                                WriteRequestJsonMarshaller.getInstance()
                                        .marshall(requestItemsMapValueList,
                                                jsonGenerator);
                            }
                        }
                        jsonGenerator.writeEndArray();
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (batchWriteItemRequest.getReturnConsumedCapacity() != null) {
                jsonGenerator.writeFieldName("ReturnConsumedCapacity")
                        .writeValue(
                                batchWriteItemRequest
                                        .getReturnConsumedCapacity());
            }
            if (batchWriteItemRequest.getReturnItemCollectionMetrics() != null) {
                jsonGenerator.writeFieldName("ReturnItemCollectionMetrics")
                        .writeValue(
                                batchWriteItemRequest
                                        .getReturnItemCollectionMetrics());
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
