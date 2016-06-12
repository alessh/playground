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
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe D B Snapshot Attributes Request Marshaller
 */
public class DescribeDBSnapshotAttributesRequestMarshaller implements Marshaller<Request<DescribeDBSnapshotAttributesRequest>, DescribeDBSnapshotAttributesRequest> {

    public Request<DescribeDBSnapshotAttributesRequest> marshall(DescribeDBSnapshotAttributesRequest describeDBSnapshotAttributesRequest) {

        if (describeDBSnapshotAttributesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDBSnapshotAttributesRequest> request = new DefaultRequest<DescribeDBSnapshotAttributesRequest>(describeDBSnapshotAttributesRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBSnapshotAttributes");
        request.addParameter("Version", "2014-10-31");

        if (describeDBSnapshotAttributesRequest.getDBSnapshotIdentifier() != null) {
            request.addParameter("DBSnapshotIdentifier", StringUtils.fromString(describeDBSnapshotAttributesRequest.getDBSnapshotIdentifier()));
        }

        return request;
    }
}
