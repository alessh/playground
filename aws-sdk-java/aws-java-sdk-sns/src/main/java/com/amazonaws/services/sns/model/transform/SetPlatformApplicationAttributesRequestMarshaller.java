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

package com.amazonaws.services.sns.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * SetPlatformApplicationAttributesRequest Marshaller
 */

public class SetPlatformApplicationAttributesRequestMarshaller
        implements
        Marshaller<Request<SetPlatformApplicationAttributesRequest>, SetPlatformApplicationAttributesRequest> {

    public Request<SetPlatformApplicationAttributesRequest> marshall(
            SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest) {

        if (setPlatformApplicationAttributesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<SetPlatformApplicationAttributesRequest> request = new DefaultRequest<SetPlatformApplicationAttributesRequest>(
                setPlatformApplicationAttributesRequest, "AmazonSNS");
        request.addParameter("Action", "SetPlatformApplicationAttributes");
        request.addParameter("Version", "2010-03-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (setPlatformApplicationAttributesRequest.getPlatformApplicationArn() != null) {
            request.addParameter("PlatformApplicationArn", StringUtils
                    .fromString(setPlatformApplicationAttributesRequest
                            .getPlatformApplicationArn()));
        }

        java.util.Map<String, String> attributes = setPlatformApplicationAttributesRequest
                .getAttributes();
        int attributesListIndex = 1;
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            if (entry.getKey() != null) {
                request.addParameter("Attributes.entry." + attributesListIndex
                        + ".key", StringUtils.fromString(entry.getKey()));
            }
            if (entry.getValue() != null) {
                request.addParameter("Attributes.entry." + attributesListIndex
                        + ".value", StringUtils.fromString(entry.getValue()));
            }
            attributesListIndex++;
        }

        return request;
    }

}
