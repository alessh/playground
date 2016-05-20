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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * AddTagsRequest Marshaller
 */

public class AddTagsRequestMarshaller implements
        Marshaller<Request<AddTagsRequest>, AddTagsRequest> {

    public Request<AddTagsRequest> marshall(AddTagsRequest addTagsRequest) {

        if (addTagsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<AddTagsRequest> request = new DefaultRequest<AddTagsRequest>(
                addTagsRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "AddTags");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> loadBalancerNamesList = (com.amazonaws.internal.SdkInternalList<String>) addTagsRequest
                .getLoadBalancerNames();
        if (!loadBalancerNamesList.isEmpty()
                || !loadBalancerNamesList.isAutoConstruct()) {
            int loadBalancerNamesListIndex = 1;

            for (String loadBalancerNamesListValue : loadBalancerNamesList) {
                if (loadBalancerNamesListValue != null) {
                    request.addParameter("LoadBalancerNames.member."
                            + loadBalancerNamesListIndex,
                            StringUtils.fromString(loadBalancerNamesListValue));
                }
                loadBalancerNamesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) addTagsRequest
                .getTags();
        if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

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
                tagsListIndex++;
            }
        }

        return request;
    }

}
