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
 * CreateReplicationInstanceRequest Marshaller
 */
public class CreateReplicationInstanceRequestMarshaller
        implements
        Marshaller<Request<CreateReplicationInstanceRequest>, CreateReplicationInstanceRequest> {

    public Request<CreateReplicationInstanceRequest> marshall(
            CreateReplicationInstanceRequest createReplicationInstanceRequest) {

        if (createReplicationInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateReplicationInstanceRequest> request = new DefaultRequest<CreateReplicationInstanceRequest>(
                createReplicationInstanceRequest, "AWSDatabaseMigrationService");
        request.addHeader("X-Amz-Target",
                "AmazonDMSv20160101.CreateReplicationInstance");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (createReplicationInstanceRequest
                    .getReplicationInstanceIdentifier() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceIdentifier")
                        .writeValue(
                                createReplicationInstanceRequest
                                        .getReplicationInstanceIdentifier());
            }
            if (createReplicationInstanceRequest.getAllocatedStorage() != null) {
                jsonGenerator.writeFieldName("AllocatedStorage").writeValue(
                        createReplicationInstanceRequest.getAllocatedStorage());
            }
            if (createReplicationInstanceRequest.getReplicationInstanceClass() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceClass")
                        .writeValue(
                                createReplicationInstanceRequest
                                        .getReplicationInstanceClass());
            }
            if (createReplicationInstanceRequest.getAvailabilityZone() != null) {
                jsonGenerator.writeFieldName("AvailabilityZone").writeValue(
                        createReplicationInstanceRequest.getAvailabilityZone());
            }
            if (createReplicationInstanceRequest
                    .getReplicationSubnetGroupIdentifier() != null) {
                jsonGenerator
                        .writeFieldName("ReplicationSubnetGroupIdentifier")
                        .writeValue(
                                createReplicationInstanceRequest
                                        .getReplicationSubnetGroupIdentifier());
            }
            if (createReplicationInstanceRequest
                    .getPreferredMaintenanceWindow() != null) {
                jsonGenerator.writeFieldName("PreferredMaintenanceWindow")
                        .writeValue(
                                createReplicationInstanceRequest
                                        .getPreferredMaintenanceWindow());
            }
            if (createReplicationInstanceRequest.getEngineVersion() != null) {
                jsonGenerator.writeFieldName("EngineVersion").writeValue(
                        createReplicationInstanceRequest.getEngineVersion());
            }
            if (createReplicationInstanceRequest.getAutoMinorVersionUpgrade() != null) {
                jsonGenerator.writeFieldName("AutoMinorVersionUpgrade")
                        .writeValue(
                                createReplicationInstanceRequest
                                        .getAutoMinorVersionUpgrade());
            }

            java.util.List<Tag> tagsList = createReplicationInstanceRequest
                    .getTags();
            if (tagsList != null) {
                jsonGenerator.writeFieldName("Tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue,
                                jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createReplicationInstanceRequest.getKmsKeyId() != null) {
                jsonGenerator.writeFieldName("KmsKeyId").writeValue(
                        createReplicationInstanceRequest.getKmsKeyId());
            }
            if (createReplicationInstanceRequest.getPubliclyAccessible() != null) {
                jsonGenerator.writeFieldName("PubliclyAccessible").writeValue(
                        createReplicationInstanceRequest
                                .getPubliclyAccessible());
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
