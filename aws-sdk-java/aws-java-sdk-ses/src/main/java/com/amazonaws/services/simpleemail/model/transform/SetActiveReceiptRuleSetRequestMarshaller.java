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

package com.amazonaws.services.simpleemail.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * SetActiveReceiptRuleSetRequest Marshaller
 */

public class SetActiveReceiptRuleSetRequestMarshaller
        implements
        Marshaller<Request<SetActiveReceiptRuleSetRequest>, SetActiveReceiptRuleSetRequest> {

    public Request<SetActiveReceiptRuleSetRequest> marshall(
            SetActiveReceiptRuleSetRequest setActiveReceiptRuleSetRequest) {

        if (setActiveReceiptRuleSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<SetActiveReceiptRuleSetRequest> request = new DefaultRequest<SetActiveReceiptRuleSetRequest>(
                setActiveReceiptRuleSetRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SetActiveReceiptRuleSet");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (setActiveReceiptRuleSetRequest.getRuleSetName() != null) {
            request.addParameter("RuleSetName",
                    StringUtils.fromString(setActiveReceiptRuleSetRequest
                            .getRuleSetName()));
        }

        return request;
    }

}
