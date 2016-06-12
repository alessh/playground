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

package com.amazonaws.services.kms.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * KeyMetadata JSON Unmarshaller
 */
public class KeyMetadataJsonUnmarshaller implements
        Unmarshaller<KeyMetadata, JsonUnmarshallerContext> {

    public KeyMetadata unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        KeyMetadata keyMetadata = new KeyMetadata();

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
                if (context.testExpression("AWSAccountId", targetDepth)) {
                    context.nextToken();
                    keyMetadata.setAWSAccountId(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("KeyId", targetDepth)) {
                    context.nextToken();
                    keyMetadata.setKeyId(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    keyMetadata.setArn(context.getUnmarshaller(String.class)
                            .unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    keyMetadata.setCreationDate(context.getUnmarshaller(
                            java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    context.nextToken();
                    keyMetadata.setEnabled(context.getUnmarshaller(
                            Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    keyMetadata.setDescription(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("KeyUsage", targetDepth)) {
                    context.nextToken();
                    keyMetadata.setKeyUsage(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("KeyState", targetDepth)) {
                    context.nextToken();
                    keyMetadata.setKeyState(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("DeletionDate", targetDepth)) {
                    context.nextToken();
                    keyMetadata.setDeletionDate(context.getUnmarshaller(
                            java.util.Date.class).unmarshall(context));
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

        return keyMetadata;
    }

    private static KeyMetadataJsonUnmarshaller instance;

    public static KeyMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeyMetadataJsonUnmarshaller();
        return instance;
    }
}
