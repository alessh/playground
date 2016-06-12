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
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceInformation JSON Unmarshaller
 */
public class InstanceInformationJsonUnmarshaller implements
        Unmarshaller<InstanceInformation, JsonUnmarshallerContext> {

    public InstanceInformation unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        InstanceInformation instanceInformation = new InstanceInformation();

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
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setInstanceId(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("PingStatus", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setPingStatus(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("LastPingDateTime", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setLastPingDateTime(context
                            .getUnmarshaller(java.util.Date.class).unmarshall(
                                    context));
                }
                if (context.testExpression("AgentVersion", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setAgentVersion(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsLatestVersion", targetDepth)) {
                    context.nextToken();
                    instanceInformation
                            .setIsLatestVersion(context.getUnmarshaller(
                                    Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PlatformType", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setPlatformType(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlatformName", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setPlatformName(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlatformVersion", targetDepth)) {
                    context.nextToken();
                    instanceInformation.setPlatformVersion(context
                            .getUnmarshaller(String.class).unmarshall(context));
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

        return instanceInformation;
    }

    private static InstanceInformationJsonUnmarshaller instance;

    public static InstanceInformationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceInformationJsonUnmarshaller();
        return instance;
    }
}
