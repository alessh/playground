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

package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * UniqueProblemMarshaller
 */
public class UniqueProblemJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(UniqueProblem uniqueProblem,
            StructuredJsonGenerator jsonGenerator) {

        if (uniqueProblem == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (uniqueProblem.getMessage() != null) {
                jsonGenerator.writeFieldName("message").writeValue(
                        uniqueProblem.getMessage());
            }

            java.util.List<Problem> problemsList = uniqueProblem.getProblems();
            if (problemsList != null) {
                jsonGenerator.writeFieldName("problems");
                jsonGenerator.writeStartArray();
                for (Problem problemsListValue : problemsList) {
                    if (problemsListValue != null) {

                        ProblemJsonMarshaller.getInstance().marshall(
                                problemsListValue, jsonGenerator);
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

    private static UniqueProblemJsonMarshaller instance;

    public static UniqueProblemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UniqueProblemJsonMarshaller();
        return instance;
    }

}
