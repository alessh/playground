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

package com.amazonaws.services.storagegateway.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * VolumeRecoveryPointInfoMarshaller
 */
public class VolumeRecoveryPointInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(VolumeRecoveryPointInfo volumeRecoveryPointInfo,
            StructuredJsonGenerator jsonGenerator) {

        if (volumeRecoveryPointInfo == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (volumeRecoveryPointInfo.getVolumeARN() != null) {
                jsonGenerator.writeFieldName("VolumeARN").writeValue(
                        volumeRecoveryPointInfo.getVolumeARN());
            }
            if (volumeRecoveryPointInfo.getVolumeSizeInBytes() != null) {
                jsonGenerator.writeFieldName("VolumeSizeInBytes").writeValue(
                        volumeRecoveryPointInfo.getVolumeSizeInBytes());
            }
            if (volumeRecoveryPointInfo.getVolumeUsageInBytes() != null) {
                jsonGenerator.writeFieldName("VolumeUsageInBytes").writeValue(
                        volumeRecoveryPointInfo.getVolumeUsageInBytes());
            }
            if (volumeRecoveryPointInfo.getVolumeRecoveryPointTime() != null) {
                jsonGenerator.writeFieldName("VolumeRecoveryPointTime")
                        .writeValue(
                                volumeRecoveryPointInfo
                                        .getVolumeRecoveryPointTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static VolumeRecoveryPointInfoJsonMarshaller instance;

    public static VolumeRecoveryPointInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeRecoveryPointInfoJsonMarshaller();
        return instance;
    }

}
