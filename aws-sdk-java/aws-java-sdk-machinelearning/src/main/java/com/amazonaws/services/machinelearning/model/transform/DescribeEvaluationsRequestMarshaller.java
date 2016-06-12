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

package com.amazonaws.services.machinelearning.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DescribeEvaluationsRequest Marshaller
 */
public class DescribeEvaluationsRequestMarshaller
        implements
        Marshaller<Request<DescribeEvaluationsRequest>, DescribeEvaluationsRequest> {

    public Request<DescribeEvaluationsRequest> marshall(
            DescribeEvaluationsRequest describeEvaluationsRequest) {

        if (describeEvaluationsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeEvaluationsRequest> request = new DefaultRequest<DescribeEvaluationsRequest>(
                describeEvaluationsRequest, "AmazonMachineLearning");
        request.addHeader("X-Amz-Target",
                "AmazonML_20141212.DescribeEvaluations");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (describeEvaluationsRequest.getFilterVariable() != null) {
                jsonGenerator.writeFieldName("FilterVariable").writeValue(
                        describeEvaluationsRequest.getFilterVariable());
            }
            if (describeEvaluationsRequest.getEQ() != null) {
                jsonGenerator.writeFieldName("EQ").writeValue(
                        describeEvaluationsRequest.getEQ());
            }
            if (describeEvaluationsRequest.getGT() != null) {
                jsonGenerator.writeFieldName("GT").writeValue(
                        describeEvaluationsRequest.getGT());
            }
            if (describeEvaluationsRequest.getLT() != null) {
                jsonGenerator.writeFieldName("LT").writeValue(
                        describeEvaluationsRequest.getLT());
            }
            if (describeEvaluationsRequest.getGE() != null) {
                jsonGenerator.writeFieldName("GE").writeValue(
                        describeEvaluationsRequest.getGE());
            }
            if (describeEvaluationsRequest.getLE() != null) {
                jsonGenerator.writeFieldName("LE").writeValue(
                        describeEvaluationsRequest.getLE());
            }
            if (describeEvaluationsRequest.getNE() != null) {
                jsonGenerator.writeFieldName("NE").writeValue(
                        describeEvaluationsRequest.getNE());
            }
            if (describeEvaluationsRequest.getPrefix() != null) {
                jsonGenerator.writeFieldName("Prefix").writeValue(
                        describeEvaluationsRequest.getPrefix());
            }
            if (describeEvaluationsRequest.getSortOrder() != null) {
                jsonGenerator.writeFieldName("SortOrder").writeValue(
                        describeEvaluationsRequest.getSortOrder());
            }
            if (describeEvaluationsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(
                        describeEvaluationsRequest.getNextToken());
            }
            if (describeEvaluationsRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(
                        describeEvaluationsRequest.getLimit());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", jsonGenerator.getContentType());
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
