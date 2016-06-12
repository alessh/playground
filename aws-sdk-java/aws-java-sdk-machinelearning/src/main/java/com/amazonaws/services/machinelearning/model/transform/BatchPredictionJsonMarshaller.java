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

package com.amazonaws.services.machinelearning.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * BatchPredictionMarshaller
 */
public class BatchPredictionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BatchPrediction batchPrediction,
            StructuredJsonGenerator jsonGenerator) {

        if (batchPrediction == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (batchPrediction.getBatchPredictionId() != null) {
                jsonGenerator.writeFieldName("BatchPredictionId").writeValue(
                        batchPrediction.getBatchPredictionId());
            }
            if (batchPrediction.getMLModelId() != null) {
                jsonGenerator.writeFieldName("MLModelId").writeValue(
                        batchPrediction.getMLModelId());
            }
            if (batchPrediction.getBatchPredictionDataSourceId() != null) {
                jsonGenerator.writeFieldName("BatchPredictionDataSourceId")
                        .writeValue(
                                batchPrediction
                                        .getBatchPredictionDataSourceId());
            }
            if (batchPrediction.getInputDataLocationS3() != null) {
                jsonGenerator.writeFieldName("InputDataLocationS3").writeValue(
                        batchPrediction.getInputDataLocationS3());
            }
            if (batchPrediction.getCreatedByIamUser() != null) {
                jsonGenerator.writeFieldName("CreatedByIamUser").writeValue(
                        batchPrediction.getCreatedByIamUser());
            }
            if (batchPrediction.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(
                        batchPrediction.getCreatedAt());
            }
            if (batchPrediction.getLastUpdatedAt() != null) {
                jsonGenerator.writeFieldName("LastUpdatedAt").writeValue(
                        batchPrediction.getLastUpdatedAt());
            }
            if (batchPrediction.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(
                        batchPrediction.getName());
            }
            if (batchPrediction.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(
                        batchPrediction.getStatus());
            }
            if (batchPrediction.getOutputUri() != null) {
                jsonGenerator.writeFieldName("OutputUri").writeValue(
                        batchPrediction.getOutputUri());
            }
            if (batchPrediction.getMessage() != null) {
                jsonGenerator.writeFieldName("Message").writeValue(
                        batchPrediction.getMessage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BatchPredictionJsonMarshaller instance;

    public static BatchPredictionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BatchPredictionJsonMarshaller();
        return instance;
    }

}
