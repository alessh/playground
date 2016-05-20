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

package com.amazonaws.services.config.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * EvaluationResultQualifierMarshaller
 */
public class EvaluationResultQualifierJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EvaluationResultQualifier evaluationResultQualifier,
            StructuredJsonGenerator jsonGenerator) {

        if (evaluationResultQualifier == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (evaluationResultQualifier.getConfigRuleName() != null) {
                jsonGenerator.writeFieldName("ConfigRuleName").writeValue(
                        evaluationResultQualifier.getConfigRuleName());
            }
            if (evaluationResultQualifier.getResourceType() != null) {
                jsonGenerator.writeFieldName("ResourceType").writeValue(
                        evaluationResultQualifier.getResourceType());
            }
            if (evaluationResultQualifier.getResourceId() != null) {
                jsonGenerator.writeFieldName("ResourceId").writeValue(
                        evaluationResultQualifier.getResourceId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EvaluationResultQualifierJsonMarshaller instance;

    public static EvaluationResultQualifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationResultQualifierJsonMarshaller();
        return instance;
    }

}
