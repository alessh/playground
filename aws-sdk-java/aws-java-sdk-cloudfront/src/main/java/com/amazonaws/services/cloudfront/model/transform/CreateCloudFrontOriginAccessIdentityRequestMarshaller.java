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

package com.amazonaws.services.cloudfront.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.XMLWriter;

/**
 * CreateCloudFrontOriginAccessIdentityRequest Marshaller
 */

public class CreateCloudFrontOriginAccessIdentityRequestMarshaller
        implements
        Marshaller<Request<CreateCloudFrontOriginAccessIdentityRequest>, CreateCloudFrontOriginAccessIdentityRequest> {

    public Request<CreateCloudFrontOriginAccessIdentityRequest> marshall(
            CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest) {

        if (createCloudFrontOriginAccessIdentityRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateCloudFrontOriginAccessIdentityRequest> request = new DefaultRequest<CreateCloudFrontOriginAccessIdentityRequest>(
                createCloudFrontOriginAccessIdentityRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2016-01-28/origin-access-identity/cloudfront";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter,
                    "http://cloudfront.amazonaws.com/doc/2016-01-28/");

            CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfig = createCloudFrontOriginAccessIdentityRequest
                    .getCloudFrontOriginAccessIdentityConfig();
            if (cloudFrontOriginAccessIdentityConfig != null) {
                xmlWriter.startElement("CloudFrontOriginAccessIdentityConfig");

                if (cloudFrontOriginAccessIdentityConfig.getCallerReference() != null) {
                    xmlWriter
                            .startElement("CallerReference")
                            .value(cloudFrontOriginAccessIdentityConfig
                                    .getCallerReference()).endElement();
                }

                if (cloudFrontOriginAccessIdentityConfig.getComment() != null) {
                    xmlWriter
                            .startElement("Comment")
                            .value(cloudFrontOriginAccessIdentityConfig
                                    .getComment()).endElement();
                }
                xmlWriter.endElement();
            }

            request.setContent(new StringInputStream(stringWriter.getBuffer()
                    .toString()));
            request.addHeader(
                    "Content-Length",
                    Integer.toString(stringWriter.getBuffer().toString()
                            .getBytes(UTF8).length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", "application/xml");
            }
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to XML: " + t.getMessage(), t);
        }

        return request;
    }

}
