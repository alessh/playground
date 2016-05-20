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
 * Delete D B Cluster Request Marshaller
 */
public class DeleteDBClusterRequestMarshaller implements Marshaller<Request<DeleteDBClusterRequest>, DeleteDBClusterRequest> {

    public Request<DeleteDBClusterRequest> marshall(DeleteDBClusterRequest deleteDBClusterRequest) {

        if (deleteDBClusterRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteDBClusterRequest> request = new DefaultRequest<DeleteDBClusterRequest>(deleteDBClusterRequest, "AmazonRDS");
        request.addParameter("Action", "DeleteDBCluster");
        request.addParameter("Version", "2014-10-31");

        if (deleteDBClusterRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(deleteDBClusterRequest.getDBClusterIdentifier()));
        }
        if (deleteDBClusterRequest.isSkipFinalSnapshot() != null) {
            request.addParameter("SkipFinalSnapshot", StringUtils.fromBoolean(deleteDBClusterRequest.isSkipFinalSnapshot()));
        }
        if (deleteDBClusterRequest.getFinalDBSnapshotIdentifier() != null) {
            request.addParameter("FinalDBSnapshotIdentifier", StringUtils.fromString(deleteDBClusterRequest.getFinalDBSnapshotIdentifier()));
        }

        return request;
    }
}
