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

package com.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ListAttachedGroupPoliciesRequest Marshaller
 */

public class ListAttachedGroupPoliciesRequestMarshaller
        implements
        Marshaller<Request<ListAttachedGroupPoliciesRequest>, ListAttachedGroupPoliciesRequest> {

    public Request<ListAttachedGroupPoliciesRequest> marshall(
            ListAttachedGroupPoliciesRequest listAttachedGroupPoliciesRequest) {

        if (listAttachedGroupPoliciesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ListAttachedGroupPoliciesRequest> request = new DefaultRequest<ListAttachedGroupPoliciesRequest>(
                listAttachedGroupPoliciesRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "ListAttachedGroupPolicies");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (listAttachedGroupPoliciesRequest.getGroupName() != null) {
            request.addParameter("GroupName",
                    StringUtils.fromString(listAttachedGroupPoliciesRequest
                            .getGroupName()));
        }

        if (listAttachedGroupPoliciesRequest.getPathPrefix() != null) {
            request.addParameter("PathPrefix", StringUtils
                    .fromString(listAttachedGroupPoliciesRequest
                            .getPathPrefix()));
        }

        if (listAttachedGroupPoliciesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils
                    .fromString(listAttachedGroupPoliciesRequest.getMarker()));
        }

        if (listAttachedGroupPoliciesRequest.getMaxItems() != null) {
            request.addParameter("MaxItems",
                    StringUtils.fromInteger(listAttachedGroupPoliciesRequest
                            .getMaxItems()));
        }

        return request;
    }

}
