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

package com.amazonaws.services.datapipeline.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AddTagsResult JSON Unmarshaller
 */
public class AddTagsResultJsonUnmarshaller implements
        Unmarshaller<AddTagsResult, JsonUnmarshallerContext> {

    public AddTagsResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AddTagsResult addTagsResult = new AddTagsResult();

        return addTagsResult;
    }

    private static AddTagsResultJsonUnmarshaller instance;

    public static AddTagsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddTagsResultJsonUnmarshaller();
        return instance;
    }
}
