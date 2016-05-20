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

package com.amazonaws.services.codedeploy.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeploymentConfigInfo JSON Unmarshaller
 */
public class DeploymentConfigInfoJsonUnmarshaller implements
        Unmarshaller<DeploymentConfigInfo, JsonUnmarshallerContext> {

    public DeploymentConfigInfo unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DeploymentConfigInfo deploymentConfigInfo = new DeploymentConfigInfo();

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
                if (context.testExpression("deploymentConfigId", targetDepth)) {
                    context.nextToken();
                    deploymentConfigInfo.setDeploymentConfigId(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentConfigName", targetDepth)) {
                    context.nextToken();
                    deploymentConfigInfo.setDeploymentConfigName(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minimumHealthyHosts", targetDepth)) {
                    context.nextToken();
                    deploymentConfigInfo
                            .setMinimumHealthyHosts(MinimumHealthyHostsJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    deploymentConfigInfo.setCreateTime(context.getUnmarshaller(
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

        return deploymentConfigInfo;
    }

    private static DeploymentConfigInfoJsonUnmarshaller instance;

    public static DeploymentConfigInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentConfigInfoJsonUnmarshaller();
        return instance;
    }
}
