/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lambda.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Get Event Source Mapping Result JSON Unmarshaller
 */
public class GetEventSourceMappingResultJsonUnmarshaller implements Unmarshaller<GetEventSourceMappingResult, JsonUnmarshallerContext> {

    public GetEventSourceMappingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEventSourceMappingResult getEventSourceMappingResult = new GetEventSourceMappingResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("UUID", targetDepth)) {
                    context.nextToken();
                    getEventSourceMappingResult.setUUID(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BatchSize", targetDepth)) {
                    context.nextToken();
                    getEventSourceMappingResult.setBatchSize(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventSourceArn", targetDepth)) {
                    context.nextToken();
                    getEventSourceMappingResult.setEventSourceArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FunctionArn", targetDepth)) {
                    context.nextToken();
                    getEventSourceMappingResult.setFunctionArn(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    context.nextToken();
                    getEventSourceMappingResult.setLastModified(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastProcessingResult", targetDepth)) {
                    context.nextToken();
                    getEventSourceMappingResult.setLastProcessingResult(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    getEventSourceMappingResult.setState(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StateTransitionReason", targetDepth)) {
                    context.nextToken();
                    getEventSourceMappingResult.setStateTransitionReason(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return getEventSourceMappingResult;
    }

    private static GetEventSourceMappingResultJsonUnmarshaller instance;
    public static GetEventSourceMappingResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new GetEventSourceMappingResultJsonUnmarshaller();
        return instance;
    }
}
    