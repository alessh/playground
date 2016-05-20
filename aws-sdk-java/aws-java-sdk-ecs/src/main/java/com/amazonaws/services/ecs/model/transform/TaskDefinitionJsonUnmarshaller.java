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

package com.amazonaws.services.ecs.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TaskDefinition JSON Unmarshaller
 */
public class TaskDefinitionJsonUnmarshaller implements
        Unmarshaller<TaskDefinition, JsonUnmarshallerContext> {

    public TaskDefinition unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        TaskDefinition taskDefinition = new TaskDefinition();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("taskDefinitionArn", targetDepth)) {
                    context.nextToken();
                    taskDefinition.setTaskDefinitionArn(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("containerDefinitions", targetDepth)) {
                    context.nextToken();
                    taskDefinition
                            .setContainerDefinitions(new ListUnmarshaller<ContainerDefinition>(
                                    ContainerDefinitionJsonUnmarshaller
                                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("family", targetDepth)) {
                    context.nextToken();
                    taskDefinition.setFamily(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("revision", targetDepth)) {
                    context.nextToken();
                    taskDefinition.setRevision(context.getUnmarshaller(
                            Integer.class).unmarshall(context));
                }
                if (context.testExpression("volumes", targetDepth)) {
                    context.nextToken();
                    taskDefinition.setVolumes(new ListUnmarshaller<Volume>(
                            VolumeJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    taskDefinition.setStatus(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("requiresAttributes", targetDepth)) {
                    context.nextToken();
                    taskDefinition
                            .setRequiresAttributes(new ListUnmarshaller<Attribute>(
                                    AttributeJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return taskDefinition;
    }

    private static TaskDefinitionJsonUnmarshaller instance;

    public static TaskDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskDefinitionJsonUnmarshaller();
        return instance;
    }
}
