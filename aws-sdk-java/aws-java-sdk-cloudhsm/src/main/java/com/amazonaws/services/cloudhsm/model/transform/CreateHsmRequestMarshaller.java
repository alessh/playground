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

package com.amazonaws.services.cloudhsm.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudhsm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateHsmRequest Marshaller
 */
public class CreateHsmRequestMarshaller implements
        Marshaller<Request<CreateHsmRequest>, CreateHsmRequest> {

    public Request<CreateHsmRequest> marshall(CreateHsmRequest createHsmRequest) {

        if (createHsmRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateHsmRequest> request = new DefaultRequest<CreateHsmRequest>(
                createHsmRequest, "AWSCloudHSM");
        request.addHeader("X-Amz-Target", "CloudHsmFrontendService.CreateHsm");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (createHsmRequest.getSubnetId() != null) {
                jsonGenerator.writeFieldName("SubnetId").writeValue(
                        createHsmRequest.getSubnetId());
            }
            if (createHsmRequest.getSshKey() != null) {
                jsonGenerator.writeFieldName("SshKey").writeValue(
                        createHsmRequest.getSshKey());
            }
            if (createHsmRequest.getEniIp() != null) {
                jsonGenerator.writeFieldName("EniIp").writeValue(
                        createHsmRequest.getEniIp());
            }
            if (createHsmRequest.getIamRoleArn() != null) {
                jsonGenerator.writeFieldName("IamRoleArn").writeValue(
                        createHsmRequest.getIamRoleArn());
            }
            if (createHsmRequest.getExternalId() != null) {
                jsonGenerator.writeFieldName("ExternalId").writeValue(
                        createHsmRequest.getExternalId());
            }
            if (createHsmRequest.getSubscriptionType() != null) {
                jsonGenerator.writeFieldName("SubscriptionType").writeValue(
                        createHsmRequest.getSubscriptionType());
            }
            if (createHsmRequest.getClientToken() != null) {
                jsonGenerator.writeFieldName("ClientToken").writeValue(
                        createHsmRequest.getClientToken());
            }
            if (createHsmRequest.getSyslogIp() != null) {
                jsonGenerator.writeFieldName("SyslogIp").writeValue(
                        createHsmRequest.getSyslogIp());
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
