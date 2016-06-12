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

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * StreamRecordMarshaller
 */
public class StreamRecordJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StreamRecord streamRecord,
            StructuredJsonGenerator jsonGenerator) {

        if (streamRecord == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.Map<String, AttributeValue> keysMap = streamRecord
                    .getKeys();
            if (keysMap != null) {
                jsonGenerator.writeFieldName("Keys");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, AttributeValue> keysMapValue : keysMap
                        .entrySet()) {
                    if (keysMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(keysMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(
                                keysMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, AttributeValue> newImageMap = streamRecord
                    .getNewImage();
            if (newImageMap != null) {
                jsonGenerator.writeFieldName("NewImage");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, AttributeValue> newImageMapValue : newImageMap
                        .entrySet()) {
                    if (newImageMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(newImageMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(
                                newImageMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, AttributeValue> oldImageMap = streamRecord
                    .getOldImage();
            if (oldImageMap != null) {
                jsonGenerator.writeFieldName("OldImage");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, AttributeValue> oldImageMapValue : oldImageMap
                        .entrySet()) {
                    if (oldImageMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(oldImageMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(
                                oldImageMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (streamRecord.getSequenceNumber() != null) {
                jsonGenerator.writeFieldName("SequenceNumber").writeValue(
                        streamRecord.getSequenceNumber());
            }
            if (streamRecord.getSizeBytes() != null) {
                jsonGenerator.writeFieldName("SizeBytes").writeValue(
                        streamRecord.getSizeBytes());
            }
            if (streamRecord.getStreamViewType() != null) {
                jsonGenerator.writeFieldName("StreamViewType").writeValue(
                        streamRecord.getStreamViewType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StreamRecordJsonMarshaller instance;

    public static StreamRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamRecordJsonMarshaller();
        return instance;
    }

}
