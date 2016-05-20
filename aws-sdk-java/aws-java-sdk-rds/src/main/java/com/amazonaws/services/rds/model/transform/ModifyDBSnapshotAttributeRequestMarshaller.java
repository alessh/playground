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
 * Modify D B Snapshot Attribute Request Marshaller
 */
public class ModifyDBSnapshotAttributeRequestMarshaller implements Marshaller<Request<ModifyDBSnapshotAttributeRequest>, ModifyDBSnapshotAttributeRequest> {

    public Request<ModifyDBSnapshotAttributeRequest> marshall(ModifyDBSnapshotAttributeRequest modifyDBSnapshotAttributeRequest) {

        if (modifyDBSnapshotAttributeRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDBSnapshotAttributeRequest> request = new DefaultRequest<ModifyDBSnapshotAttributeRequest>(modifyDBSnapshotAttributeRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyDBSnapshotAttribute");
        request.addParameter("Version", "2014-10-31");

        if (modifyDBSnapshotAttributeRequest.getDBSnapshotIdentifier() != null) {
            request.addParameter("DBSnapshotIdentifier", StringUtils.fromString(modifyDBSnapshotAttributeRequest.getDBSnapshotIdentifier()));
        }
        if (modifyDBSnapshotAttributeRequest.getAttributeName() != null) {
            request.addParameter("AttributeName", StringUtils.fromString(modifyDBSnapshotAttributeRequest.getAttributeName()));
        }

        java.util.List<String> valuesToAddList = modifyDBSnapshotAttributeRequest.getValuesToAdd();
        int valuesToAddListIndex = 1;

        for (String valuesToAddListValue : valuesToAddList) {
            if (valuesToAddListValue != null) {
                request.addParameter("ValuesToAdd.AttributeValue." + valuesToAddListIndex, StringUtils.fromString(valuesToAddListValue));
            }

            valuesToAddListIndex++;
        }

        java.util.List<String> valuesToRemoveList = modifyDBSnapshotAttributeRequest.getValuesToRemove();
        int valuesToRemoveListIndex = 1;

        for (String valuesToRemoveListValue : valuesToRemoveList) {
            if (valuesToRemoveListValue != null) {
                request.addParameter("ValuesToRemove.AttributeValue." + valuesToRemoveListIndex, StringUtils.fromString(valuesToRemoveListValue));
            }

            valuesToRemoveListIndex++;
        }

        return request;
    }
}
