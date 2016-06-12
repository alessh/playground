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
 * Restore D B Cluster To Point In Time Request Marshaller
 */
public class RestoreDBClusterToPointInTimeRequestMarshaller implements Marshaller<Request<RestoreDBClusterToPointInTimeRequest>, RestoreDBClusterToPointInTimeRequest> {

    public Request<RestoreDBClusterToPointInTimeRequest> marshall(RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest) {

        if (restoreDBClusterToPointInTimeRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RestoreDBClusterToPointInTimeRequest> request = new DefaultRequest<RestoreDBClusterToPointInTimeRequest>(restoreDBClusterToPointInTimeRequest, "AmazonRDS");
        request.addParameter("Action", "RestoreDBClusterToPointInTime");
        request.addParameter("Version", "2014-10-31");

        if (restoreDBClusterToPointInTimeRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(restoreDBClusterToPointInTimeRequest.getDBClusterIdentifier()));
        }
        if (restoreDBClusterToPointInTimeRequest.getSourceDBClusterIdentifier() != null) {
            request.addParameter("SourceDBClusterIdentifier", StringUtils.fromString(restoreDBClusterToPointInTimeRequest.getSourceDBClusterIdentifier()));
        }
        if (restoreDBClusterToPointInTimeRequest.getRestoreToTime() != null) {
            request.addParameter("RestoreToTime", StringUtils.fromDate(restoreDBClusterToPointInTimeRequest.getRestoreToTime()));
        }
        if (restoreDBClusterToPointInTimeRequest.isUseLatestRestorableTime() != null) {
            request.addParameter("UseLatestRestorableTime", StringUtils.fromBoolean(restoreDBClusterToPointInTimeRequest.isUseLatestRestorableTime()));
        }
        if (restoreDBClusterToPointInTimeRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(restoreDBClusterToPointInTimeRequest.getPort()));
        }
        if (restoreDBClusterToPointInTimeRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(restoreDBClusterToPointInTimeRequest.getDBSubnetGroupName()));
        }
        if (restoreDBClusterToPointInTimeRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(restoreDBClusterToPointInTimeRequest.getOptionGroupName()));
        }

        java.util.List<String> vpcSecurityGroupIdsList = restoreDBClusterToPointInTimeRequest.getVpcSecurityGroupIds();
        int vpcSecurityGroupIdsListIndex = 1;

        for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
            if (vpcSecurityGroupIdsListValue != null) {
                request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex, StringUtils.fromString(vpcSecurityGroupIdsListValue));
            }

            vpcSecurityGroupIdsListIndex++;
        }

        java.util.List<Tag> tagsList = restoreDBClusterToPointInTimeRequest.getTags();
        int tagsListIndex = 1;

        for (Tag tagsListValue : tagsList) {
            Tag tagMember = tagsListValue;
            if (tagMember != null) {
                if (tagMember.getKey() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagMember.getKey()));
                }
                if (tagMember.getValue() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagMember.getValue()));
                }
            }

            tagsListIndex++;
        }
        if (restoreDBClusterToPointInTimeRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(restoreDBClusterToPointInTimeRequest.getKmsKeyId()));
        }

        return request;
    }
}
