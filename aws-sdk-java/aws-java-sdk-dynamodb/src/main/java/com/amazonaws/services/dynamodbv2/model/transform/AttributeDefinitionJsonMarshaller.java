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

package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * AttributeDefinitionMarshaller
 */
public class AttributeDefinitionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AttributeDefinition attributeDefinition,
            StructuredJsonGenerator jsonGenerator) {

        if (attributeDefinition == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (attributeDefinition.getAttributeName() != null) {
                jsonGenerator.writeFieldName("AttributeName").writeValue(
                        attributeDefinition.getAttributeName());
            }
            if (attributeDefinition.getAttributeType() != null) {
                jsonGenerator.writeFieldName("AttributeType").writeValue(
                        attributeDefinition.getAttributeType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AttributeDefinitionJsonMarshaller instance;

    public static AttributeDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttributeDefinitionJsonMarshaller();
        return instance;
    }

}
