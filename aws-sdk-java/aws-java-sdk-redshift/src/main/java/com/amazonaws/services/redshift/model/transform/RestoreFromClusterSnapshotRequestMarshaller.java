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
 * Restore From Cluster Snapshot Request Marshaller
 */
public class RestoreFromClusterSnapshotRequestMarshaller implements Marshaller<Request<RestoreFromClusterSnapshotRequest>, RestoreFromClusterSnapshotRequest> {

    public Request<RestoreFromClusterSnapshotRequest> marshall(RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest) {

        if (restoreFromClusterSnapshotRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RestoreFromClusterSnapshotRequest> request = new DefaultRequest<RestoreFromClusterSnapshotRequest>(restoreFromClusterSnapshotRequest, "AmazonRedshift");
        request.addParameter("Action", "RestoreFromClusterSnapshot");
        request.addParameter("Version", "2012-12-01");

        if (restoreFromClusterSnapshotRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(restoreFromClusterSnapshotRequest.getClusterIdentifier()));
        }
        if (restoreFromClusterSnapshotRequest.getSnapshotIdentifier() != null) {
            request.addParameter("SnapshotIdentifier", StringUtils.fromString(restoreFromClusterSnapshotRequest.getSnapshotIdentifier()));
        }
        if (restoreFromClusterSnapshotRequest.getSnapshotClusterIdentifier() != null) {
            request.addParameter("SnapshotClusterIdentifier", StringUtils.fromString(restoreFromClusterSnapshotRequest.getSnapshotClusterIdentifier()));
        }
        if (restoreFromClusterSnapshotRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(restoreFromClusterSnapshotRequest.getPort()));
        }
        if (restoreFromClusterSnapshotRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(restoreFromClusterSnapshotRequest.getAvailabilityZone()));
        }
        if (restoreFromClusterSnapshotRequest.isAllowVersionUpgrade() != null) {
            request.addParameter("AllowVersionUpgrade", StringUtils.fromBoolean(restoreFromClusterSnapshotRequest.isAllowVersionUpgrade()));
        }
        if (restoreFromClusterSnapshotRequest.getClusterSubnetGroupName() != null) {
            request.addParameter("ClusterSubnetGroupName", StringUtils.fromString(restoreFromClusterSnapshotRequest.getClusterSubnetGroupName()));
        }
        if (restoreFromClusterSnapshotRequest.isPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils.fromBoolean(restoreFromClusterSnapshotRequest.isPubliclyAccessible()));
        }
        if (restoreFromClusterSnapshotRequest.getOwnerAccount() != null) {
            request.addParameter("OwnerAccount", StringUtils.fromString(restoreFromClusterSnapshotRequest.getOwnerAccount()));
        }
        if (restoreFromClusterSnapshotRequest.getHsmClientCertificateIdentifier() != null) {
            request.addParameter("HsmClientCertificateIdentifier", StringUtils.fromString(restoreFromClusterSnapshotRequest.getHsmClientCertificateIdentifier()));
        }
        if (restoreFromClusterSnapshotRequest.getHsmConfigurationIdentifier() != null) {
            request.addParameter("HsmConfigurationIdentifier", StringUtils.fromString(restoreFromClusterSnapshotRequest.getHsmConfigurationIdentifier()));
        }
        if (restoreFromClusterSnapshotRequest.getElasticIp() != null) {
            request.addParameter("ElasticIp", StringUtils.fromString(restoreFromClusterSnapshotRequest.getElasticIp()));
        }
        if (restoreFromClusterSnapshotRequest.getClusterParameterGroupName() != null) {
            request.addParameter("ClusterParameterGroupName", StringUtils.fromString(restoreFromClusterSnapshotRequest.getClusterParameterGroupName()));
        }

        java.util.List<String> clusterSecurityGroupsList = restoreFromClusterSnapshotRequest.getClusterSecurityGroups();
        int clusterSecurityGroupsListIndex = 1;

        for (String clusterSecurityGroupsListValue : clusterSecurityGroupsList) {
            if (clusterSecurityGroupsListValue != null) {
                request.addParameter("ClusterSecurityGroups.ClusterSecurityGroupName." + clusterSecurityGroupsListIndex, StringUtils.fromString(clusterSecurityGroupsListValue));
            }

            clusterSecurityGroupsListIndex++;
        }

        java.util.List<String> vpcSecurityGroupIdsList = restoreFromClusterSnapshotRequest.getVpcSecurityGroupIds();
        int vpcSecurityGroupIdsListIndex = 1;

        for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
            if (vpcSecurityGroupIdsListValue != null) {
                request.addParameter("VpcSecurityGroupIds.VpcSecurityGroupId." + vpcSecurityGroupIdsListIndex, StringUtils.fromString(vpcSecurityGroupIdsListValue));
            }

            vpcSecurityGroupIdsListIndex++;
        }
        if (restoreFromClusterSnapshotRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils.fromString(restoreFromClusterSnapshotRequest.getPreferredMaintenanceWindow()));
        }
        if (restoreFromClusterSnapshotRequest.getAutomatedSnapshotRetentionPeriod() != null) {
            request.addParameter("AutomatedSnapshotRetentionPeriod", StringUtils.fromInteger(restoreFromClusterSnapshotRequest.getAutomatedSnapshotRetentionPeriod()));
        }
        if (restoreFromClusterSnapshotRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(restoreFromClusterSnapshotRequest.getKmsKeyId()));
        }
        if (restoreFromClusterSnapshotRequest.getNodeType() != null) {
            request.addParameter("NodeType", StringUtils.fromString(restoreFromClusterSnapshotRequest.getNodeType()));
        }
        if (restoreFromClusterSnapshotRequest.getAdditionalInfo() != null) {
            request.addParameter("AdditionalInfo", StringUtils.fromString(restoreFromClusterSnapshotRequest.getAdditionalInfo()));
        }

        java.util.List<String> iamRolesList = restoreFromClusterSnapshotRequest.getIamRoles();
        int iamRolesListIndex = 1;

        for (String iamRolesListValue : iamRolesList) {
            if (iamRolesListValue != null) {
                request.addParameter("IamRoles.IamRoleArn." + iamRolesListIndex, StringUtils.fromString(iamRolesListValue));
            }

            iamRolesListIndex++;
        }

        return request;
    }
}
