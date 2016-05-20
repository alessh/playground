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
 * InstanceInformationMarshaller
 */
public class InstanceInformationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceInformation instanceInformation,
            StructuredJsonGenerator jsonGenerator) {

        if (instanceInformation == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceInformation.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(
                        instanceInformation.getInstanceId());
            }
            if (instanceInformation.getPingStatus() != null) {
                jsonGenerator.writeFieldName("PingStatus").writeValue(
                        instanceInformation.getPingStatus());
            }
            if (instanceInformation.getLastPingDateTime() != null) {
                jsonGenerator.writeFieldName("LastPingDateTime").writeValue(
                        instanceInformation.getLastPingDateTime());
            }
            if (instanceInformation.getAgentVersion() != null) {
                jsonGenerator.writeFieldName("AgentVersion").writeValue(
                        instanceInformation.getAgentVersion());
            }
            if (instanceInformation.getIsLatestVersion() != null) {
                jsonGenerator.writeFieldName("IsLatestVersion").writeValue(
                        instanceInformation.getIsLatestVersion());
            }
            if (instanceInformation.getPlatformType() != null) {
                jsonGenerator.writeFieldName("PlatformType").writeValue(
                        instanceInformation.getPlatformType());
            }
            if (instanceInformation.getPlatformName() != null) {
                jsonGenerator.writeFieldName("PlatformName").writeValue(
                        instanceInformation.getPlatformName());
            }
            if (instanceInformation.getPlatformVersion() != null) {
                jsonGenerator.writeFieldName("PlatformVersion").writeValue(
                        instanceInformation.getPlatformVersion());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceInformationJsonMarshaller instance;

    public static InstanceInformationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceInformationJsonMarshaller();
        return instance;
    }

}
