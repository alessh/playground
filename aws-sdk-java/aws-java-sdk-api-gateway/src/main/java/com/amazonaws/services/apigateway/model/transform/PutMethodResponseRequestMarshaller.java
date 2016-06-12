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
 * PutMethodResponseRequest Marshaller
 */
public class PutMethodResponseRequestMarshaller implements
        Marshaller<Request<PutMethodResponseRequest>, PutMethodResponseRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<PutMethodResponseRequest> marshall(
            PutMethodResponseRequest putMethodResponseRequest) {

        if (putMethodResponseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<PutMethodResponseRequest> request = new DefaultRequest<PutMethodResponseRequest>(
                putMethodResponseRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}";

        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (putMethodResponseRequest.getRestApiId() != null) ? StringUtils
                        .fromString(putMethodResponseRequest.getRestApiId())
                        : "");
        uriResourcePath = uriResourcePath
                .replace(
                        "{resource_id}",
                        (putMethodResponseRequest.getResourceId() != null) ? StringUtils
                                .fromString(putMethodResponseRequest
                                        .getResourceId()) : "");
        uriResourcePath = uriResourcePath
                .replace(
                        "{http_method}",
                        (putMethodResponseRequest.getHttpMethod() != null) ? StringUtils
                                .fromString(putMethodResponseRequest
                                        .getHttpMethod()) : "");
        uriResourcePath = uriResourcePath
                .replace(
                        "{status_code}",
                        (putMethodResponseRequest.getStatusCode() != null) ? StringUtils
                                .fromString(putMethodResponseRequest
                                        .getStatusCode()) : "");
        request.setResourcePath(uriResourcePath);

        try {
            final SdkJsonGenerator jsonGenerator = new SdkJsonGenerator();

            jsonGenerator.writeStartObject();

            java.util.Map<String, Boolean> responseParametersMap = putMethodResponseRequest
                    .getResponseParameters();
            if (responseParametersMap != null) {
                jsonGenerator.writeFieldName("responseParameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Boolean> responseParametersMapValue : responseParametersMap
                        .entrySet()) {
                    if (responseParametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(responseParametersMapValue
                                .getKey());

                        jsonGenerator.writeValue(responseParametersMapValue
                                .getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, String> responseModelsMap = putMethodResponseRequest
                    .getResponseModels();
            if (responseModelsMap != null) {
                jsonGenerator.writeFieldName("responseModels");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> responseModelsMapValue : responseModelsMap
                        .entrySet()) {
                    if (responseModelsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(responseModelsMapValue
                                .getKey());

                        jsonGenerator.writeValue(responseModelsMapValue
                                .getValue());
                    }
                }
                jsonGenerator.writeEndObject();
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
