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

package com.amazonaws.services.apigateway.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * UpdateIntegrationResponseRequest Marshaller
 */
public class UpdateIntegrationResponseRequestMarshaller
        implements
        Marshaller<Request<UpdateIntegrationResponseRequest>, UpdateIntegrationResponseRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<UpdateIntegrationResponseRequest> marshall(
            UpdateIntegrationResponseRequest updateIntegrationResponseRequest) {

        if (updateIntegrationResponseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateIntegrationResponseRequest> request = new DefaultRequest<UpdateIntegrationResponseRequest>(
                updateIntegrationResponseRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}";

        uriResourcePath = uriResourcePath
                .replace(
                        "{restapi_id}",
                        (updateIntegrationResponseRequest.getRestApiId() != null) ? StringUtils
                                .fromString(updateIntegrationResponseRequest
                                        .getRestApiId()) : "");
        uriResourcePath = uriResourcePath
                .replace(
                        "{resource_id}",
                        (updateIntegrationResponseRequest.getResourceId() != null) ? StringUtils
                                .fromString(updateIntegrationResponseRequest
                                        .getResourceId()) : "");
        uriResourcePath = uriResourcePath
                .replace(
                        "{http_method}",
                        (updateIntegrationResponseRequest.getHttpMethod() != null) ? StringUtils
                                .fromString(updateIntegrationResponseRequest
                                        .getHttpMethod()) : "");
        uriResourcePath = uriResourcePath
                .replace(
                        "{status_code}",
                        (updateIntegrationResponseRequest.getStatusCode() != null) ? StringUtils
                                .fromString(updateIntegrationResponseRequest
                                        .getStatusCode()) : "");
        request.setResourcePath(uriResourcePath);

        try {
            final SdkJsonGenerator jsonGenerator = new SdkJsonGenerator();

            jsonGenerator.writeStartObject();

            java.util.List<PatchOperation> patchOperationsList = updateIntegrationResponseRequest
                    .getPatchOperations();
            if (patchOperationsList != null) {
                jsonGenerator.writeFieldName("patchOperations");
                jsonGenerator.writeStartArray();
                for (PatchOperation patchOperationsListValue : patchOperationsList) {
                    if (patchOperationsListValue != null) {

                        PatchOperationJsonMarshaller.getInstance().marshall(
                                patchOperationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
            }
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
