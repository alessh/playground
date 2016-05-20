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

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ApiKeyMarshaller
 */
public class ApiKeyJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ApiKey apiKey, StructuredJsonGenerator jsonGenerator) {

        if (apiKey == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (apiKey.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(apiKey.getId());
            }
            if (apiKey.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(
                        apiKey.getName());
            }
            if (apiKey.getDescription() != null) {
                jsonGenerator.writeFieldName("description").writeValue(
                        apiKey.getDescription());
            }
            if (apiKey.getEnabled() != null) {
                jsonGenerator.writeFieldName("enabled").writeValue(
                        apiKey.getEnabled());
            }

            java.util.List<String> stageKeysList = apiKey.getStageKeys();
            if (stageKeysList != null) {
                jsonGenerator.writeFieldName("stageKeys");
                jsonGenerator.writeStartArray();
                for (String stageKeysListValue : stageKeysList) {
                    if (stageKeysListValue != null) {
                        jsonGenerator.writeValue(stageKeysListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (apiKey.getCreatedDate() != null) {
                jsonGenerator.writeFieldName("createdDate").writeValue(
                        apiKey.getCreatedDate());
            }
            if (apiKey.getLastUpdatedDate() != null) {
                jsonGenerator.writeFieldName("lastUpdatedDate").writeValue(
                        apiKey.getLastUpdatedDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ApiKeyJsonMarshaller instance;

    public static ApiKeyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApiKeyJsonMarshaller();
        return instance;
    }

}
