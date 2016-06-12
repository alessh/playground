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

package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateOrUpdateTagsRequest Marshaller
 */

public class CreateOrUpdateTagsRequestMarshaller
        implements
        Marshaller<Request<CreateOrUpdateTagsRequest>, CreateOrUpdateTagsRequest> {

    public Request<CreateOrUpdateTagsRequest> marshall(
            CreateOrUpdateTagsRequest createOrUpdateTagsRequest) {

        if (createOrUpdateTagsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateOrUpdateTagsRequest> request = new DefaultRequest<CreateOrUpdateTagsRequest>(
                createOrUpdateTagsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "CreateOrUpdateTags");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createOrUpdateTagsRequest
                .getTags();
        if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getResourceId() != null) {
                    request.addParameter("Tags.member." + tagsListIndex
                            + ".ResourceId", StringUtils
                            .fromString(tagsListValue.getResourceId()));
                }

                if (tagsListValue.getResourceType() != null) {
                    request.addParameter("Tags.member." + tagsListIndex
                            + ".ResourceType", StringUtils
                            .fromString(tagsListValue.getResourceType()));
                }

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex
                            + ".Key",
                            StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex
                            + ".Value",
                            StringUtils.fromString(tagsListValue.getValue()));
                }

                if (tagsListValue.getPropagateAtLaunch() != null) {
                    request.addParameter("Tags.member." + tagsListIndex
                            + ".PropagateAtLaunch", StringUtils
                            .fromBoolean(tagsListValue.getPropagateAtLaunch()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
