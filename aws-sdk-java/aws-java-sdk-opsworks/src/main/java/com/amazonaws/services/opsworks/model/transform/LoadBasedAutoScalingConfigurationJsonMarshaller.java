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

package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * LoadBasedAutoScalingConfigurationMarshaller
 */
public class LoadBasedAutoScalingConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(
            LoadBasedAutoScalingConfiguration loadBasedAutoScalingConfiguration,
            StructuredJsonGenerator jsonGenerator) {

        if (loadBasedAutoScalingConfiguration == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (loadBasedAutoScalingConfiguration.getLayerId() != null) {
                jsonGenerator.writeFieldName("LayerId").writeValue(
                        loadBasedAutoScalingConfiguration.getLayerId());
            }
            if (loadBasedAutoScalingConfiguration.getEnable() != null) {
                jsonGenerator.writeFieldName("Enable").writeValue(
                        loadBasedAutoScalingConfiguration.getEnable());
            }
            if (loadBasedAutoScalingConfiguration.getUpScaling() != null) {
                jsonGenerator.writeFieldName("UpScaling");
                AutoScalingThresholdsJsonMarshaller.getInstance().marshall(
                        loadBasedAutoScalingConfiguration.getUpScaling(),
                        jsonGenerator);
            }
            if (loadBasedAutoScalingConfiguration.getDownScaling() != null) {
                jsonGenerator.writeFieldName("DownScaling");
                AutoScalingThresholdsJsonMarshaller.getInstance().marshall(
                        loadBasedAutoScalingConfiguration.getDownScaling(),
                        jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static LoadBasedAutoScalingConfigurationJsonMarshaller instance;

    public static LoadBasedAutoScalingConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoadBasedAutoScalingConfigurationJsonMarshaller();
        return instance;
    }

}
