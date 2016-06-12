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
 * DescribeVolumesRequest Marshaller
 */
public class DescribeVolumesRequestMarshaller implements
        Marshaller<Request<DescribeVolumesRequest>, DescribeVolumesRequest> {

    public Request<DescribeVolumesRequest> marshall(
            DescribeVolumesRequest describeVolumesRequest) {

        if (describeVolumesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeVolumesRequest> request = new DefaultRequest<DescribeVolumesRequest>(
                describeVolumesRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.DescribeVolumes");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (describeVolumesRequest.getInstanceId() != null) {
                jsonGenerator.writeFieldName("InstanceId").writeValue(
                        describeVolumesRequest.getInstanceId());
            }
            if (describeVolumesRequest.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(
                        describeVolumesRequest.getStackId());
            }
            if (describeVolumesRequest.getRaidArrayId() != null) {
                jsonGenerator.writeFieldName("RaidArrayId").writeValue(
                        describeVolumesRequest.getRaidArrayId());
            }

            com.amazonaws.internal.SdkInternalList<String> volumeIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVolumesRequest
                    .getVolumeIds();
            if (!volumeIdsList.isEmpty() || !volumeIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("VolumeIds");
                jsonGenerator.writeStartArray();
                for (String volumeIdsListValue : volumeIdsList) {
                    if (volumeIdsListValue != null) {
                        jsonGenerator.writeValue(volumeIdsListValue);
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
