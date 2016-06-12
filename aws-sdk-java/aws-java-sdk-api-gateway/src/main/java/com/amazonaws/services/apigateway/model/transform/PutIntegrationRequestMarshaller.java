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
 * PutIntegrationRequest Marshaller
 */
public class PutIntegrationRequestMarshaller implements
        Marshaller<Request<PutIntegrationRequest>, PutIntegrationRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<PutIntegrationRequest> marshall(
            PutIntegrationRequest putIntegrationRequest) {

        if (putIntegrationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<PutIntegrationRequest> request = new DefaultRequest<PutIntegrationRequest>(
                putIntegrationRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration";

        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (putIntegrationRequest.getRestApiId() != null) ? StringUtils
                        .fromString(putIntegrationRequest.getRestApiId()) : "");
        uriResourcePath = uriResourcePath
                .replace(
                        "{resource_id}",
                        (putIntegrationRequest.getResourceId() != null) ? StringUtils
                                .fromString(putIntegrationRequest
                                        .getResourceId()) : "");
        uriResourcePath = uriResourcePath
                .replace(
                        "{http_method}",
                        (putIntegrationRequest.getHttpMethod() != null) ? StringUtils
                                .fromString(putIntegrationRequest
                                        .getHttpMethod()) : "");
        request.setResourcePath(uriResourcePath);

        try {
            final SdkJsonGenerator jsonGenerator = new SdkJsonGenerator();

            jsonGenerator.writeStartObject();

            if (putIntegrationRequest.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(
                        putIntegrationRequest.getType());
            }
            if (putIntegrationRequest.getIntegrationHttpMethod() != null) {
                jsonGenerator.writeFieldName("httpMethod").writeValue(
                        putIntegrationRequest.getIntegrationHttpMethod());
            }
            if (putIntegrationRequest.getUri() != null) {
                jsonGenerator.writeFieldName("uri").writeValue(
                        putIntegrationRequest.getUri());
            }
            if (putIntegrationRequest.getCredentials() != null) {
                jsonGenerator.writeFieldName("credentials").writeValue(
                        putIntegrationRequest.getCredentials());
            }

            java.util.Map<String, String> requestParametersMap = putIntegrationRequest
                    .getRequestParameters();
            if (requestParametersMap != null) {
                jsonGenerator.writeFieldName("requestParameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> requestParametersMapValue : requestParametersMap
                        .entrySet()) {
                    if (requestParametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(requestParametersMapValue
                                .getKey());

                        jsonGenerator.writeValue(requestParametersMapValue
                                .getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, String> requestTemplatesMap = putIntegrationRequest
                    .getRequestTemplates();
            if (requestTemplatesMap != null) {
                jsonGenerator.writeFieldName("requestTemplates");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> requestTemplatesMapValue : requestTemplatesMap
                        .entrySet()) {
                    if (requestTemplatesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(requestTemplatesMapValue
                                .getKey());

                        jsonGenerator.writeValue(requestTemplatesMapValue
                                .getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (putIntegrationRequest.getCacheNamespace() != null) {
                jsonGenerator.writeFieldName("cacheNamespace").writeValue(
                        putIntegrationRequest.getCacheNamespace());
            }

            java.util.List<String> cacheKeyParametersList = putIntegrationRequest
                    .getCacheKeyParameters();
            if (cacheKeyParametersList != null) {
                jsonGenerator.writeFieldName("cacheKeyParameters");
                jsonGenerator.writeStartArray();
                for (String cacheKeyParametersListValue : cacheKeyParametersList) {
                    if (cacheKeyParametersListValue != null) {
                        jsonGenerator.writeValue(cacheKeyParametersListValue);
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
