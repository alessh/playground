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

package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * InstanceStateChangeReasonMarshaller
 */
public class InstanceStateChangeReasonJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceStateChangeReason instanceStateChangeReason,
            StructuredJsonGenerator jsonGenerator) {

        if (instanceStateChangeReason == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceStateChangeReason.getCode() != null) {
                jsonGenerator.writeFieldName("Code").writeValue(
                        instanceStateChangeReason.getCode());
            }
            if (instanceStateChangeReason.getMessage() != null) {
                jsonGenerator.writeFieldName("Message").writeValue(
                        instanceStateChangeReason.getMessage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceStateChangeReasonJsonMarshaller instance;

    public static InstanceStateChangeReasonJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStateChangeReasonJsonMarshaller();
        return instance;
    }

}
