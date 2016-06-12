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

package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * InstanceInformationFilterMarshaller
 */
public class InstanceInformationFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceInformationFilter instanceInformationFilter,
            StructuredJsonGenerator jsonGenerator) {

        if (instanceInformationFilter == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceInformationFilter.getKey() != null) {
                jsonGenerator.writeFieldName("key").writeValue(
                        instanceInformationFilter.getKey());
            }

            com.amazonaws.internal.SdkInternalList<String> valueSetList = (com.amazonaws.internal.SdkInternalList<String>) instanceInformationFilter
                    .getValueSet();
            if (!valueSetList.isEmpty() || !valueSetList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("valueSet");
                jsonGenerator.writeStartArray();
                for (String valueSetListValue : valueSetList) {
                    if (valueSetListValue != null) {
                        jsonGenerator.writeValue(valueSetListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceInformationFilterJsonMarshaller instance;

    public static InstanceInformationFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceInformationFilterJsonMarshaller();
        return instance;
    }

}
