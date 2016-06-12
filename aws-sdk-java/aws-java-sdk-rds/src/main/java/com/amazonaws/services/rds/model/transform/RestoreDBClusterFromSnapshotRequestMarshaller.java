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
 * Restore D B Cluster From Snapshot Request Marshaller
 */
public class RestoreDBClusterFromSnapshotRequestMarshaller implements Marshaller<Request<RestoreDBClusterFromSnapshotRequest>, RestoreDBClusterFromSnapshotRequest> {

    public Request<RestoreDBClusterFromSnapshotRequest> marshall(RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest) {

        if (restoreDBClusterFromSnapshotRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RestoreDBClusterFromSnapshotRequest> request = new DefaultRequest<RestoreDBClusterFromSnapshotRequest>(restoreDBClusterFromSnapshotRequest, "AmazonRDS");
        request.addParameter("Action", "RestoreDBClusterFromSnapshot");
        request.addParameter("Version", "2014-10-31");

        java.util.List<String> availabilityZonesList = restoreDBClusterFromSnapshotRequest.getAvailabilityZones();
        int availabilityZonesListIndex = 1;

        for (String availabilityZonesListValue : availabilityZonesList) {
            if (availabilityZonesListValue != null) {
                request.addParameter("AvailabilityZones.AvailabilityZone." + availabilityZonesListIndex, StringUtils.fromString(availabilityZonesListValue));
            }

            availabilityZonesListIndex++;
        }
        if (restoreDBClusterFromSnapshotRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getDBClusterIdentifier()));
        }
        if (restoreDBClusterFromSnapshotRequest.getSnapshotIdentifier() != null) {
            request.addParameter("SnapshotIdentifier", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getSnapshotIdentifier()));
        }
        if (restoreDBClusterFromSnapshotRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getEngine()));
        }
        if (restoreDBClusterFromSnapshotRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getEngineVersion()));
        }
        if (restoreDBClusterFromSnapshotRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(restoreDBClusterFromSnapshotRequest.getPort()));
        }
        if (restoreDBClusterFromSnapshotRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getDBSubnetGroupName()));
        }
        if (restoreDBClusterFromSnapshotRequest.getDatabaseName() != null) {
            request.addParameter("DatabaseName", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getDatabaseName()));
        }
        if (restoreDBClusterFromSnapshotRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getOptionGroupName()));
        }

        java.util.List<String> vpcSecurityGroupIdsList = restoreDBClusterFromSnapshotRequest.getVpcSecurityGroupIds();
        int vpcSecurityGroupIdsListIndex = 1;

        for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
            if (vpcSecurityGroupIdsListValue != null) {
                request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex, StringUtils.fromString(vpcSecurityGroupIdsListValue));
            }

            vpcSecurityGroupIdsListIndex++;
        }

        java.util.List<Tag> tagsList = restoreDBClusterFromSnapshotRequest.getTags();
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
        if (restoreDBClusterFromSnapshotRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(restoreDBClusterFromSnapshotRequest.getKmsKeyId()));
        }

        return request;
    }
}
