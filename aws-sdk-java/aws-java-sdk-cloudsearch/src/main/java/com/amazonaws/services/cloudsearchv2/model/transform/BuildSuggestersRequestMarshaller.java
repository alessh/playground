/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Build Suggesters Request Marshaller
 */
public class BuildSuggestersRequestMarshaller implements Marshaller<Request<BuildSuggestersRequest>, BuildSuggestersRequest> {

    public Request<BuildSuggestersRequest> marshall(BuildSuggestersRequest buildSuggestersRequest) {

        if (buildSuggestersRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<BuildSuggestersRequest> request = new DefaultRequest<BuildSuggestersRequest>(buildSuggestersRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "BuildSuggesters");
        request.addParameter("Version", "2013-01-01");

        if (buildSuggestersRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(buildSuggestersRequest.getDomainName()));
        }

        return request;
    }
}
