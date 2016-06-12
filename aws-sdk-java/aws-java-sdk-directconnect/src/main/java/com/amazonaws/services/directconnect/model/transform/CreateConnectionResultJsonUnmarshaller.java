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

package com.amazonaws.services.directconnect.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateConnectionResult JSON Unmarshaller
 */
public class CreateConnectionResultJsonUnmarshaller implements
        Unmarshaller<CreateConnectionResult, JsonUnmarshallerContext> {

    public CreateConnectionResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateConnectionResult createConnectionResult = new CreateConnectionResult();

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
                if (context.testExpression("ownerAccount", targetDepth)) {
                    context.nextToken();
                    createConnectionResult.setOwnerAccount(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    context.nextToken();
                    createConnectionResult.setConnectionId(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionName", targetDepth)) {
                    context.nextToken();
                    createConnectionResult.setConnectionName(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionState", targetDepth)) {
                    context.nextToken();
                    createConnectionResult.setConnectionState(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    createConnectionResult.setRegion(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    createConnectionResult.setLocation(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("bandwidth", targetDepth)) {
                    context.nextToken();
                    createConnectionResult.setBandwidth(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vlan", targetDepth)) {
                    context.nextToken();
                    createConnectionResult.setVlan(context.getUnmarshaller(
                            Integer.class).unmarshall(context));
                }
                if (context.testExpression("partnerName", targetDepth)) {
                    context.nextToken();
                    createConnectionResult.setPartnerName(context
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

        return createConnectionResult;
    }

    private static CreateConnectionResultJsonUnmarshaller instance;

    public static CreateConnectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateConnectionResultJsonUnmarshaller();
        return instance;
    }
}
