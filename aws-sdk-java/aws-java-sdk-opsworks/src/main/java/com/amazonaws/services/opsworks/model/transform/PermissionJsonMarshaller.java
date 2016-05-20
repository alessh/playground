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

package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * PermissionMarshaller
 */
public class PermissionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Permission permission,
            StructuredJsonGenerator jsonGenerator) {

        if (permission == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (permission.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(
                        permission.getStackId());
            }
            if (permission.getIamUserArn() != null) {
                jsonGenerator.writeFieldName("IamUserArn").writeValue(
                        permission.getIamUserArn());
            }
            if (permission.getAllowSsh() != null) {
                jsonGenerator.writeFieldName("AllowSsh").writeValue(
                        permission.getAllowSsh());
            }
            if (permission.getAllowSudo() != null) {
                jsonGenerator.writeFieldName("AllowSudo").writeValue(
                        permission.getAllowSudo());
            }
            if (permission.getLevel() != null) {
                jsonGenerator.writeFieldName("Level").writeValue(
                        permission.getLevel());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PermissionJsonMarshaller instance;

    public static PermissionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PermissionJsonMarshaller();
        return instance;
    }

}
