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

package com.amazonaws.services.codepipeline.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * PutThirdPartyJobSuccessResultRequest Marshaller
 */
public class PutThirdPartyJobSuccessResultRequestMarshaller
        implements
        Marshaller<Request<PutThirdPartyJobSuccessResultRequest>, PutThirdPartyJobSuccessResultRequest> {

    public Request<PutThirdPartyJobSuccessResultRequest> marshall(
            PutThirdPartyJobSuccessResultRequest putThirdPartyJobSuccessResultRequest) {

        if (putThirdPartyJobSuccessResultRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<PutThirdPartyJobSuccessResultRequest> request = new DefaultRequest<PutThirdPartyJobSuccessResultRequest>(
                putThirdPartyJobSuccessResultRequest, "AWSCodePipeline");
        request.addHeader("X-Amz-Target",
                "CodePipeline_20150709.PutThirdPartyJobSuccessResult");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (putThirdPartyJobSuccessResultRequest.getJobId() != null) {
                jsonGenerator.writeFieldName("jobId").writeValue(
                        putThirdPartyJobSuccessResultRequest.getJobId());
            }
            if (putThirdPartyJobSuccessResultRequest.getClientToken() != null) {
                jsonGenerator.writeFieldName("clientToken").writeValue(
                        putThirdPartyJobSuccessResultRequest.getClientToken());
            }
            if (putThirdPartyJobSuccessResultRequest.getCurrentRevision() != null) {
                jsonGenerator.writeFieldName("currentRevision");
                CurrentRevisionJsonMarshaller
                        .getInstance()
                        .marshall(
                                putThirdPartyJobSuccessResultRequest
                                        .getCurrentRevision(),
                                jsonGenerator);
            }
            if (putThirdPartyJobSuccessResultRequest.getContinuationToken() != null) {
                jsonGenerator.writeFieldName("continuationToken").writeValue(
                        putThirdPartyJobSuccessResultRequest
                                .getContinuationToken());
            }
            if (putThirdPartyJobSuccessResultRequest.getExecutionDetails() != null) {
                jsonGenerator.writeFieldName("executionDetails");
                ExecutionDetailsJsonMarshaller
                        .getInstance()
                        .marshall(
                                putThirdPartyJobSuccessResultRequest
                                        .getExecutionDetails(),
                                jsonGenerator);
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
