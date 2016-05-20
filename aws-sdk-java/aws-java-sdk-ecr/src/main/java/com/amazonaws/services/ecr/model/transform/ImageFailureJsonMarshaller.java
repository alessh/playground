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

package com.amazonaws.services.ecr.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ImageFailureMarshaller
 */
public class ImageFailureJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ImageFailure imageFailure,
            StructuredJsonGenerator jsonGenerator) {

        if (imageFailure == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (imageFailure.getImageId() != null) {
                jsonGenerator.writeFieldName("imageId");
                ImageIdentifierJsonMarshaller.getInstance().marshall(
                        imageFailure.getImageId(), jsonGenerator);
            }
            if (imageFailure.getFailureCode() != null) {
                jsonGenerator.writeFieldName("failureCode").writeValue(
                        imageFailure.getFailureCode());
            }
            if (imageFailure.getFailureReason() != null) {
                jsonGenerator.writeFieldName("failureReason").writeValue(
                        imageFailure.getFailureReason());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ImageFailureJsonMarshaller instance;

    public static ImageFailureJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageFailureJsonMarshaller();
        return instance;
    }

}
