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

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * OutputLogEventMarshaller
 */
public class OutputLogEventJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(OutputLogEvent outputLogEvent,
            StructuredJsonGenerator jsonGenerator) {

        if (outputLogEvent == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (outputLogEvent.getTimestamp() != null) {
                jsonGenerator.writeFieldName("timestamp").writeValue(
                        outputLogEvent.getTimestamp());
            }
            if (outputLogEvent.getMessage() != null) {
                jsonGenerator.writeFieldName("message").writeValue(
                        outputLogEvent.getMessage());
            }
            if (outputLogEvent.getIngestionTime() != null) {
                jsonGenerator.writeFieldName("ingestionTime").writeValue(
                        outputLogEvent.getIngestionTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static OutputLogEventJsonMarshaller instance;

    public static OutputLogEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputLogEventJsonMarshaller();
        return instance;
    }

}
