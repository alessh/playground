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
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ThirdPartyJobData JSON Unmarshaller
 */
public class ThirdPartyJobDataJsonUnmarshaller implements
        Unmarshaller<ThirdPartyJobData, JsonUnmarshallerContext> {

    public ThirdPartyJobData unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ThirdPartyJobData thirdPartyJobData = new ThirdPartyJobData();

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
                if (context.testExpression("actionTypeId", targetDepth)) {
                    context.nextToken();
                    thirdPartyJobData
                            .setActionTypeId(ActionTypeIdJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("actionConfiguration", targetDepth)) {
                    context.nextToken();
                    thirdPartyJobData
                            .setActionConfiguration(ActionConfigurationJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("pipelineContext", targetDepth)) {
                    context.nextToken();
                    thirdPartyJobData
                            .setPipelineContext(PipelineContextJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("inputArtifacts", targetDepth)) {
                    context.nextToken();
                    thirdPartyJobData
                            .setInputArtifacts(new ListUnmarshaller<Artifact>(
                                    ArtifactJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("outputArtifacts", targetDepth)) {
                    context.nextToken();
                    thirdPartyJobData
                            .setOutputArtifacts(new ListUnmarshaller<Artifact>(
                                    ArtifactJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("artifactCredentials", targetDepth)) {
                    context.nextToken();
                    thirdPartyJobData
                            .setArtifactCredentials(AWSSessionCredentialsJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("continuationToken", targetDepth)) {
                    context.nextToken();
                    thirdPartyJobData.setContinuationToken(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encryptionKey", targetDepth)) {
                    context.nextToken();
                    thirdPartyJobData
                            .setEncryptionKey(EncryptionKeyJsonUnmarshaller
                                    .getInstance().unmarshall(context));
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

        return thirdPartyJobData;
    }

    private static ThirdPartyJobDataJsonUnmarshaller instance;

    public static ThirdPartyJobDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ThirdPartyJobDataJsonUnmarshaller();
        return instance;
    }
}
