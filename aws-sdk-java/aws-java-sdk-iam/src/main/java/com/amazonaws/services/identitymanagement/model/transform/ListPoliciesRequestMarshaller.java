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
 * ListPoliciesRequest Marshaller
 */

public class ListPoliciesRequestMarshaller implements
        Marshaller<Request<ListPoliciesRequest>, ListPoliciesRequest> {

    public Request<ListPoliciesRequest> marshall(
            ListPoliciesRequest listPoliciesRequest) {

        if (listPoliciesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ListPoliciesRequest> request = new DefaultRequest<ListPoliciesRequest>(
                listPoliciesRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "ListPolicies");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (listPoliciesRequest.getScope() != null) {
            request.addParameter("Scope",
                    StringUtils.fromString(listPoliciesRequest.getScope()));
        }

        if (listPoliciesRequest.getOnlyAttached() != null) {
            request.addParameter("OnlyAttached", StringUtils
                    .fromBoolean(listPoliciesRequest.getOnlyAttached()));
        }

        if (listPoliciesRequest.getPathPrefix() != null) {
            request.addParameter("PathPrefix",
                    StringUtils.fromString(listPoliciesRequest.getPathPrefix()));
        }

        if (listPoliciesRequest.getMarker() != null) {
            request.addParameter("Marker",
                    StringUtils.fromString(listPoliciesRequest.getMarker()));
        }

        if (listPoliciesRequest.getMaxItems() != null) {
            request.addParameter("MaxItems",
                    StringUtils.fromInteger(listPoliciesRequest.getMaxItems()));
        }

        return request;
    }

}
