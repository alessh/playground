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

package com.amazonaws.services.storagegateway.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DescribeVTLDevicesRequest Marshaller
 */
public class DescribeVTLDevicesRequestMarshaller
        implements
        Marshaller<Request<DescribeVTLDevicesRequest>, DescribeVTLDevicesRequest> {

    public Request<DescribeVTLDevicesRequest> marshall(
            DescribeVTLDevicesRequest describeVTLDevicesRequest) {

        if (describeVTLDevicesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeVTLDevicesRequest> request = new DefaultRequest<DescribeVTLDevicesRequest>(
                describeVTLDevicesRequest, "AWSStorageGateway");
        request.addHeader("X-Amz-Target",
                "StorageGateway_20130630.DescribeVTLDevices");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (describeVTLDevicesRequest.getGatewayARN() != null) {
                jsonGenerator.writeFieldName("GatewayARN").writeValue(
                        describeVTLDevicesRequest.getGatewayARN());
            }

            com.amazonaws.internal.SdkInternalList<String> vTLDeviceARNsList = (com.amazonaws.internal.SdkInternalList<String>) describeVTLDevicesRequest
                    .getVTLDeviceARNs();
            if (!vTLDeviceARNsList.isEmpty()
                    || !vTLDeviceARNsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("VTLDeviceARNs");
                jsonGenerator.writeStartArray();
                for (String vTLDeviceARNsListValue : vTLDeviceARNsList) {
                    if (vTLDeviceARNsListValue != null) {
                        jsonGenerator.writeValue(vTLDeviceARNsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeVTLDevicesRequest.getMarker() != null) {
                jsonGenerator.writeFieldName("Marker").writeValue(
                        describeVTLDevicesRequest.getMarker());
            }
            if (describeVTLDevicesRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(
                        describeVTLDevicesRequest.getLimit());
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
