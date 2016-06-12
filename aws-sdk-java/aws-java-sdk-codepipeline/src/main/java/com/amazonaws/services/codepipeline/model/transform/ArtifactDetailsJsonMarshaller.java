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
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ArtifactDetailsMarshaller
 */
public class ArtifactDetailsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ArtifactDetails artifactDetails,
            StructuredJsonGenerator jsonGenerator) {

        if (artifactDetails == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (artifactDetails.getMinimumCount() != null) {
                jsonGenerator.writeFieldName("minimumCount").writeValue(
                        artifactDetails.getMinimumCount());
            }
            if (artifactDetails.getMaximumCount() != null) {
                jsonGenerator.writeFieldName("maximumCount").writeValue(
                        artifactDetails.getMaximumCount());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ArtifactDetailsJsonMarshaller instance;

    public static ArtifactDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ArtifactDetailsJsonMarshaller();
        return instance;
    }

}
