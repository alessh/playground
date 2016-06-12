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

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RefreshSchemasStatusMarshaller
 */
public class RefreshSchemasStatusJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RefreshSchemasStatus refreshSchemasStatus,
            StructuredJsonGenerator jsonGenerator) {

        if (refreshSchemasStatus == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (refreshSchemasStatus.getEndpointArn() != null) {
                jsonGenerator.writeFieldName("EndpointArn").writeValue(
                        refreshSchemasStatus.getEndpointArn());
            }
            if (refreshSchemasStatus.getReplicationInstanceArn() != null) {
                jsonGenerator.writeFieldName("ReplicationInstanceArn")
                        .writeValue(
                                refreshSchemasStatus
                                        .getReplicationInstanceArn());
            }
            if (refreshSchemasStatus.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(
                        refreshSchemasStatus.getStatus());
            }
            if (refreshSchemasStatus.getLastRefreshDate() != null) {
                jsonGenerator.writeFieldName("LastRefreshDate").writeValue(
                        refreshSchemasStatus.getLastRefreshDate());
            }
            if (refreshSchemasStatus.getLastFailureMessage() != null) {
                jsonGenerator.writeFieldName("LastFailureMessage").writeValue(
                        refreshSchemasStatus.getLastFailureMessage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RefreshSchemasStatusJsonMarshaller instance;

    public static RefreshSchemasStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RefreshSchemasStatusJsonMarshaller();
        return instance;
    }

}
