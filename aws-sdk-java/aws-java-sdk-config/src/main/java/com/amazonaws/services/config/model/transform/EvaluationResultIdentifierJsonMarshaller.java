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
 * EvaluationResultIdentifierMarshaller
 */
public class EvaluationResultIdentifierJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EvaluationResultIdentifier evaluationResultIdentifier,
            StructuredJsonGenerator jsonGenerator) {

        if (evaluationResultIdentifier == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (evaluationResultIdentifier.getEvaluationResultQualifier() != null) {
                jsonGenerator.writeFieldName("EvaluationResultQualifier");
                EvaluationResultQualifierJsonMarshaller
                        .getInstance()
                        .marshall(
                                evaluationResultIdentifier
                                        .getEvaluationResultQualifier(),
                                jsonGenerator);
            }
            if (evaluationResultIdentifier.getOrderingTimestamp() != null) {
                jsonGenerator.writeFieldName("OrderingTimestamp").writeValue(
                        evaluationResultIdentifier.getOrderingTimestamp());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EvaluationResultIdentifierJsonMarshaller instance;

    public static EvaluationResultIdentifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationResultIdentifierJsonMarshaller();
        return instance;
    }

}
