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

package com.amazonaws.services.waf.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * UpdateIPSetRequest Marshaller
 */
public class UpdateIPSetRequestMarshaller implements
        Marshaller<Request<UpdateIPSetRequest>, UpdateIPSetRequest> {

    public Request<UpdateIPSetRequest> marshall(
            UpdateIPSetRequest updateIPSetRequest) {

        if (updateIPSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateIPSetRequest> request = new DefaultRequest<UpdateIPSetRequest>(
                updateIPSetRequest, "AWSWAF");
        request.addHeader("X-Amz-Target", "AWSWAF_20150824.UpdateIPSet");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (updateIPSetRequest.getIPSetId() != null) {
                jsonGenerator.writeFieldName("IPSetId").writeValue(
                        updateIPSetRequest.getIPSetId());
            }
            if (updateIPSetRequest.getChangeToken() != null) {
                jsonGenerator.writeFieldName("ChangeToken").writeValue(
                        updateIPSetRequest.getChangeToken());
            }

            java.util.List<IPSetUpdate> updatesList = updateIPSetRequest
                    .getUpdates();
            if (updatesList != null) {
                jsonGenerator.writeFieldName("Updates");
                jsonGenerator.writeStartArray();
                for (IPSetUpdate updatesListValue : updatesList) {
                    if (updatesListValue != null) {

                        IPSetUpdateJsonMarshaller.getInstance().marshall(
                                updatesListValue, jsonGenerator);
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
