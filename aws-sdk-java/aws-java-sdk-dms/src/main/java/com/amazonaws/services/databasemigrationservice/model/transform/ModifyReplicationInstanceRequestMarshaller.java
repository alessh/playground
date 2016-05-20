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

package com.amazonaws.services.databasemigrationservice.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ModifyReplicationInstanceRequest Marshaller
 */
public class ModifyReplicationInstanceRequestMarshaller
        implements
        Marshaller<Request<ModifyReplicationInstanceRequest>, ModifyReplicationInstanceRequest> {

    public Request<ModifyReplicationInstanceRequest> marshall(
            ModifyReplicationInstanceRequest modifyReplicationInstanceRequest) {

        if (modifyReplicationInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyReplicationInstanceRequest> request = new DefaultRequest<ModifyReplicationInstanceRequest>(
                modifyReplicationInstanceRequest, "AWSDatabaseMigrationService");
        request.addHeader("X-Amz-Target",
                "AmazonDMSv20160101.ModifyReplicationInstance");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (modifyReplicationInstanceRequest.getReplicationInstanceArn() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceArn")
                        .writeValue(
                                modifyReplicationInstanceRequest
                                        .getReplicationInstanceArn());
            }
            if (modifyReplicationInstanceRequest.getAllocatedStorage() != null) {
                jsonGenerator.writeFieldName("AllocatedStorage").writeValue(
                        modifyReplicationInstanceRequest.getAllocatedStorage());
            }
            if (modifyReplicationInstanceRequest.getApplyImmediately() != null) {
                jsonGenerator.writeFieldName("ApplyImmediately").writeValue(
                        modifyReplicationInstanceRequest.getApplyImmediately());
            }
            if (modifyReplicationInstanceRequest.getReplicationInstanceClass() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceClass")
                        .writeValue(
                                modifyReplicationInstanceRequest
                                        .getReplicationInstanceClass());
            }
            if (modifyReplicationInstanceRequest
                    .getPreferredMaintenanceWindow() != null) {
                jsonGenerator.writeFieldName("PreferredMaintenanceWindow")
                        .writeValue(
                                modifyReplicationInstanceRequest
                                        .getPreferredMaintenanceWindow());
            }
            if (modifyReplicationInstanceRequest.getEngineVersion() != null) {
                jsonGenerator.writeFieldName("EngineVersion").writeValue(
                        modifyReplicationInstanceRequest.getEngineVersion());
            }
            if (modifyReplicationInstanceRequest.getAllowMajorVersionUpgrade() != null) {
                jsonGenerator.writeFieldName("AllowMajorVersionUpgrade")
                        .writeValue(
                                modifyReplicationInstanceRequest
                                        .getAllowMajorVersionUpgrade());
            }
            if (modifyReplicationInstanceRequest.getAutoMinorVersionUpgrade() != null) {
                jsonGenerator.writeFieldName("AutoMinorVersionUpgrade")
                        .writeValue(
                                modifyReplicationInstanceRequest
                                        .getAutoMinorVersionUpgrade());
            }
            if (modifyReplicationInstanceRequest
                    .getReplicationInstanceIdentifier() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceIdentifier")
                        .writeValue(
                                modifyReplicationInstanceRequest
                                        .getReplicationInstanceIdentifier());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", jsonGenerator.getContentType());
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
