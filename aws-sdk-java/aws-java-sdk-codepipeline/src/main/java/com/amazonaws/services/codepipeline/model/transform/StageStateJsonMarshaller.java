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

package com.amazonaws.services.codepipeline.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * StageStateMarshaller
 */
public class StageStateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StageState stageState,
            StructuredJsonGenerator jsonGenerator) {

        if (stageState == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (stageState.getStageName() != null) {
                jsonGenerator.writeFieldName("stageName").writeValue(
                        stageState.getStageName());
            }
            if (stageState.getInboundTransitionState() != null) {
                jsonGenerator.writeFieldName("inboundTransitionState");
                TransitionStateJsonMarshaller.getInstance().marshall(
                        stageState.getInboundTransitionState(), jsonGenerator);
            }

            java.util.List<ActionState> actionStatesList = stageState
                    .getActionStates();
            if (actionStatesList != null) {
                jsonGenerator.writeFieldName("actionStates");
                jsonGenerator.writeStartArray();
                for (ActionState actionStatesListValue : actionStatesList) {
                    if (actionStatesListValue != null) {

                        ActionStateJsonMarshaller.getInstance().marshall(
                                actionStatesListValue, jsonGenerator);
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

    private static StageStateJsonMarshaller instance;

    public static StageStateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StageStateJsonMarshaller();
        return instance;
    }

}
