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
 * Copy Option Group Request Marshaller
 */
public class CopyOptionGroupRequestMarshaller implements Marshaller<Request<CopyOptionGroupRequest>, CopyOptionGroupRequest> {

    public Request<CopyOptionGroupRequest> marshall(CopyOptionGroupRequest copyOptionGroupRequest) {

        if (copyOptionGroupRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CopyOptionGroupRequest> request = new DefaultRequest<CopyOptionGroupRequest>(copyOptionGroupRequest, "AmazonRDS");
        request.addParameter("Action", "CopyOptionGroup");
        request.addParameter("Version", "2014-10-31");

        if (copyOptionGroupRequest.getSourceOptionGroupIdentifier() != null) {
            request.addParameter("SourceOptionGroupIdentifier", StringUtils.fromString(copyOptionGroupRequest.getSourceOptionGroupIdentifier()));
        }
        if (copyOptionGroupRequest.getTargetOptionGroupIdentifier() != null) {
            request.addParameter("TargetOptionGroupIdentifier", StringUtils.fromString(copyOptionGroupRequest.getTargetOptionGroupIdentifier()));
        }
        if (copyOptionGroupRequest.getTargetOptionGroupDescription() != null) {
            request.addParameter("TargetOptionGroupDescription", StringUtils.fromString(copyOptionGroupRequest.getTargetOptionGroupDescription()));
        }

        java.util.List<Tag> tagsList = copyOptionGroupRequest.getTags();
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

        return request;
    }
}
