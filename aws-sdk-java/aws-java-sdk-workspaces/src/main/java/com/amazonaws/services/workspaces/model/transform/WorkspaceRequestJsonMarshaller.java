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

package com.amazonaws.services.workspaces.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * WorkspaceRequestMarshaller
 */
public class WorkspaceRequestJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(WorkspaceRequest workspaceRequest,
            StructuredJsonGenerator jsonGenerator) {

        if (workspaceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (workspaceRequest.getDirectoryId() != null) {
                jsonGenerator.writeFieldName("DirectoryId").writeValue(
                        workspaceRequest.getDirectoryId());
            }
            if (workspaceRequest.getUserName() != null) {
                jsonGenerator.writeFieldName("UserName").writeValue(
                        workspaceRequest.getUserName());
            }
            if (workspaceRequest.getBundleId() != null) {
                jsonGenerator.writeFieldName("BundleId").writeValue(
                        workspaceRequest.getBundleId());
            }
            if (workspaceRequest.getVolumeEncryptionKey() != null) {
                jsonGenerator.writeFieldName("VolumeEncryptionKey").writeValue(
                        workspaceRequest.getVolumeEncryptionKey());
            }
            if (workspaceRequest.getUserVolumeEncryptionEnabled() != null) {
                jsonGenerator.writeFieldName("UserVolumeEncryptionEnabled")
                        .writeValue(
                                workspaceRequest
                                        .getUserVolumeEncryptionEnabled());
            }
            if (workspaceRequest.getRootVolumeEncryptionEnabled() != null) {
                jsonGenerator.writeFieldName("RootVolumeEncryptionEnabled")
                        .writeValue(
                                workspaceRequest
                                        .getRootVolumeEncryptionEnabled());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static WorkspaceRequestJsonMarshaller instance;

    public static WorkspaceRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkspaceRequestJsonMarshaller();
        return instance;
    }

}
