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

package com.amazonaws.services.cognitoidentity.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * UpdateIdentityPoolRequest Marshaller
 */
public class UpdateIdentityPoolRequestMarshaller
        implements
        Marshaller<Request<UpdateIdentityPoolRequest>, UpdateIdentityPoolRequest> {

    public Request<UpdateIdentityPoolRequest> marshall(
            UpdateIdentityPoolRequest updateIdentityPoolRequest) {

        if (updateIdentityPoolRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateIdentityPoolRequest> request = new DefaultRequest<UpdateIdentityPoolRequest>(
                updateIdentityPoolRequest, "AmazonCognitoIdentity");
        request.addHeader("X-Amz-Target",
                "AWSCognitoIdentityService.UpdateIdentityPool");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (updateIdentityPoolRequest.getIdentityPoolId() != null) {
                jsonGenerator.writeFieldName("IdentityPoolId").writeValue(
                        updateIdentityPoolRequest.getIdentityPoolId());
            }
            if (updateIdentityPoolRequest.getIdentityPoolName() != null) {
                jsonGenerator.writeFieldName("IdentityPoolName").writeValue(
                        updateIdentityPoolRequest.getIdentityPoolName());
            }
            if (updateIdentityPoolRequest.getAllowUnauthenticatedIdentities() != null) {
                jsonGenerator.writeFieldName("AllowUnauthenticatedIdentities")
                        .writeValue(
                                updateIdentityPoolRequest
                                        .getAllowUnauthenticatedIdentities());
            }

            java.util.Map<String, String> supportedLoginProvidersMap = updateIdentityPoolRequest
                    .getSupportedLoginProviders();
            if (supportedLoginProvidersMap != null) {
                jsonGenerator.writeFieldName("SupportedLoginProviders");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> supportedLoginProvidersMapValue : supportedLoginProvidersMap
                        .entrySet()) {
                    if (supportedLoginProvidersMapValue.getValue() != null) {
                        jsonGenerator
                                .writeFieldName(supportedLoginProvidersMapValue
                                        .getKey());

                        jsonGenerator
                                .writeValue(supportedLoginProvidersMapValue
                                        .getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (updateIdentityPoolRequest.getDeveloperProviderName() != null) {
                jsonGenerator.writeFieldName("DeveloperProviderName")
                        .writeValue(
                                updateIdentityPoolRequest
                                        .getDeveloperProviderName());
            }

            java.util.List<String> openIdConnectProviderARNsList = updateIdentityPoolRequest
                    .getOpenIdConnectProviderARNs();
            if (openIdConnectProviderARNsList != null) {
                jsonGenerator.writeFieldName("OpenIdConnectProviderARNs");
                jsonGenerator.writeStartArray();
                for (String openIdConnectProviderARNsListValue : openIdConnectProviderARNsList) {
                    if (openIdConnectProviderARNsListValue != null) {
                        jsonGenerator
                                .writeValue(openIdConnectProviderARNsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
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
