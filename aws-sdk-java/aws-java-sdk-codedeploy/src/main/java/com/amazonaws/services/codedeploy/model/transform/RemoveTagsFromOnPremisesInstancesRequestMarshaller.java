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

package com.amazonaws.services.codedeploy.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RemoveTagsFromOnPremisesInstancesRequest Marshaller
 */
public class RemoveTagsFromOnPremisesInstancesRequestMarshaller
        implements
        Marshaller<Request<RemoveTagsFromOnPremisesInstancesRequest>, RemoveTagsFromOnPremisesInstancesRequest> {

    public Request<RemoveTagsFromOnPremisesInstancesRequest> marshall(
            RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest) {

        if (removeTagsFromOnPremisesInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RemoveTagsFromOnPremisesInstancesRequest> request = new DefaultRequest<RemoveTagsFromOnPremisesInstancesRequest>(
                removeTagsFromOnPremisesInstancesRequest, "AmazonCodeDeploy");
        request.addHeader("X-Amz-Target",
                "CodeDeploy_20141006.RemoveTagsFromOnPremisesInstances");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) removeTagsFromOnPremisesInstancesRequest
                    .getTags();
            if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartArray();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue,
                                jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> instanceNamesList = (com.amazonaws.internal.SdkInternalList<String>) removeTagsFromOnPremisesInstancesRequest
                    .getInstanceNames();
            if (!instanceNamesList.isEmpty()
                    || !instanceNamesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("instanceNames");
                jsonGenerator.writeStartArray();
                for (String instanceNamesListValue : instanceNamesList) {
                    if (instanceNamesListValue != null) {
                        jsonGenerator.writeValue(instanceNamesListValue);
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
