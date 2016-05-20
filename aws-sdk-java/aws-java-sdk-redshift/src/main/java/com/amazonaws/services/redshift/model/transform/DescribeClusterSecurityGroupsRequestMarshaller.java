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
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Cluster Security Groups Request Marshaller
 */
public class DescribeClusterSecurityGroupsRequestMarshaller implements Marshaller<Request<DescribeClusterSecurityGroupsRequest>, DescribeClusterSecurityGroupsRequest> {

    public Request<DescribeClusterSecurityGroupsRequest> marshall(DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest) {

        if (describeClusterSecurityGroupsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeClusterSecurityGroupsRequest> request = new DefaultRequest<DescribeClusterSecurityGroupsRequest>(describeClusterSecurityGroupsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeClusterSecurityGroups");
        request.addParameter("Version", "2012-12-01");

        if (describeClusterSecurityGroupsRequest.getClusterSecurityGroupName() != null) {
            request.addParameter("ClusterSecurityGroupName", StringUtils.fromString(describeClusterSecurityGroupsRequest.getClusterSecurityGroupName()));
        }
        if (describeClusterSecurityGroupsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeClusterSecurityGroupsRequest.getMaxRecords()));
        }
        if (describeClusterSecurityGroupsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeClusterSecurityGroupsRequest.getMarker()));
        }

        java.util.List<String> tagKeysList = describeClusterSecurityGroupsRequest.getTagKeys();
        int tagKeysListIndex = 1;

        for (String tagKeysListValue : tagKeysList) {
            if (tagKeysListValue != null) {
                request.addParameter("TagKeys.TagKey." + tagKeysListIndex, StringUtils.fromString(tagKeysListValue));
            }

            tagKeysListIndex++;
        }

        java.util.List<String> tagValuesList = describeClusterSecurityGroupsRequest.getTagValues();
        int tagValuesListIndex = 1;

        for (String tagValuesListValue : tagValuesList) {
            if (tagValuesListValue != null) {
                request.addParameter("TagValues.TagValue." + tagValuesListIndex, StringUtils.fromString(tagValuesListValue));
            }

            tagValuesListIndex++;
        }

        return request;
    }
}
