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
 * DocumentDescription JSON Unmarshaller
 */
public class DocumentDescriptionJsonUnmarshaller implements
        Unmarshaller<DocumentDescription, JsonUnmarshallerContext> {

    public DocumentDescription unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DocumentDescription documentDescription = new DocumentDescription();

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
                if (context.testExpression("Sha1", targetDepth)) {
                    context.nextToken();
                    documentDescription.setSha1(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    documentDescription.setName(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    context.nextToken();
                    documentDescription.setCreatedDate(context.getUnmarshaller(
                            java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    documentDescription.setStatus(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    documentDescription.setDescription(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    context.nextToken();
                    documentDescription
                            .setParameters(new ListUnmarshaller<DocumentParameter>(
                                    DocumentParameterJsonUnmarshaller
                                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("PlatformTypes", targetDepth)) {
                    context.nextToken();
                    documentDescription
                            .setPlatformTypes(new ListUnmarshaller<String>(
                                    context.getUnmarshaller(String.class))
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

        return documentDescription;
    }

    private static DocumentDescriptionJsonUnmarshaller instance;

    public static DocumentDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentDescriptionJsonUnmarshaller();
        return instance;
    }
}
