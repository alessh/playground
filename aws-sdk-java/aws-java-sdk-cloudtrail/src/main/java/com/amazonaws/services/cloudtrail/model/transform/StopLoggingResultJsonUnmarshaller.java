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

package com.amazonaws.services.cloudtrail.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StopLoggingResult JSON Unmarshaller
 */
public class StopLoggingResultJsonUnmarshaller implements
        Unmarshaller<StopLoggingResult, JsonUnmarshallerContext> {

    public StopLoggingResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        StopLoggingResult stopLoggingResult = new StopLoggingResult();

        return stopLoggingResult;
    }

    private static StopLoggingResultJsonUnmarshaller instance;

    public static StopLoggingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopLoggingResultJsonUnmarshaller();
        return instance;
    }
}
