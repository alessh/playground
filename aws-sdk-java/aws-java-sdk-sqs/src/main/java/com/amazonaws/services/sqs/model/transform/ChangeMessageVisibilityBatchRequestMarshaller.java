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

package com.amazonaws.services.sqs.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ChangeMessageVisibilityBatchRequest Marshaller
 */

public class ChangeMessageVisibilityBatchRequestMarshaller
        implements
        Marshaller<Request<ChangeMessageVisibilityBatchRequest>, ChangeMessageVisibilityBatchRequest> {

    public Request<ChangeMessageVisibilityBatchRequest> marshall(
            ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest) {

        if (changeMessageVisibilityBatchRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ChangeMessageVisibilityBatchRequest> request = new DefaultRequest<ChangeMessageVisibilityBatchRequest>(
                changeMessageVisibilityBatchRequest, "AmazonSQS");
        request.addParameter("Action", "ChangeMessageVisibilityBatch");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (changeMessageVisibilityBatchRequest.getQueueUrl() != null) {
            request.addParameter("QueueUrl", StringUtils
                    .fromString(changeMessageVisibilityBatchRequest
                            .getQueueUrl()));
        }

        com.amazonaws.internal.SdkInternalList<ChangeMessageVisibilityBatchRequestEntry> entriesList = (com.amazonaws.internal.SdkInternalList<ChangeMessageVisibilityBatchRequestEntry>) changeMessageVisibilityBatchRequest
                .getEntries();
        if (!entriesList.isEmpty() || !entriesList.isAutoConstruct()) {
            int entriesListIndex = 1;

            for (ChangeMessageVisibilityBatchRequestEntry entriesListValue : entriesList) {

                if (entriesListValue.getId() != null) {
                    request.addParameter(
                            "ChangeMessageVisibilityBatchRequestEntry."
                                    + entriesListIndex + ".Id",
                            StringUtils.fromString(entriesListValue.getId()));
                }

                if (entriesListValue.getReceiptHandle() != null) {
                    request.addParameter(
                            "ChangeMessageVisibilityBatchRequestEntry."
                                    + entriesListIndex + ".ReceiptHandle",
                            StringUtils.fromString(entriesListValue
                                    .getReceiptHandle()));
                }

                if (entriesListValue.getVisibilityTimeout() != null) {
                    request.addParameter(
                            "ChangeMessageVisibilityBatchRequestEntry."
                                    + entriesListIndex + ".VisibilityTimeout",
                            StringUtils.fromInteger(entriesListValue
                                    .getVisibilityTimeout()));
                }
                entriesListIndex++;
            }
        }

        return request;
    }

}
