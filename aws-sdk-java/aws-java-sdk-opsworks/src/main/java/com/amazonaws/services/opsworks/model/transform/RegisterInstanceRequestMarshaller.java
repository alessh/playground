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

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RegisterInstanceRequest Marshaller
 */
public class RegisterInstanceRequestMarshaller implements
        Marshaller<Request<RegisterInstanceRequest>, RegisterInstanceRequest> {

    public Request<RegisterInstanceRequest> marshall(
            RegisterInstanceRequest registerInstanceRequest) {

        if (registerInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RegisterInstanceRequest> request = new DefaultRequest<RegisterInstanceRequest>(
                registerInstanceRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.RegisterInstance");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (registerInstanceRequest.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(
                        registerInstanceRequest.getStackId());
            }
            if (registerInstanceRequest.getHostname() != null) {
                jsonGenerator.writeFieldName("Hostname").writeValue(
                        registerInstanceRequest.getHostname());
            }
            if (registerInstanceRequest.getPublicIp() != null) {
                jsonGenerator.writeFieldName("PublicIp").writeValue(
                        registerInstanceRequest.getPublicIp());
            }
            if (registerInstanceRequest.getPrivateIp() != null) {
                jsonGenerator.writeFieldName("PrivateIp").writeValue(
                        registerInstanceRequest.getPrivateIp());
            }
            if (registerInstanceRequest.getRsaPublicKey() != null) {
                jsonGenerator.writeFieldName("RsaPublicKey").writeValue(
                        registerInstanceRequest.getRsaPublicKey());
            }
            if (registerInstanceRequest.getRsaPublicKeyFingerprint() != null) {
                jsonGenerator.writeFieldName("RsaPublicKeyFingerprint")
                        .writeValue(
                                registerInstanceRequest
                                        .getRsaPublicKeyFingerprint());
            }
            if (registerInstanceRequest.getInstanceIdentity() != null) {
                jsonGenerator.writeFieldName("InstanceIdentity");
                InstanceIdentityJsonMarshaller.getInstance().marshall(
                        registerInstanceRequest.getInstanceIdentity(),
                        jsonGenerator);
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
