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

package com.amazonaws.services.route53.model.transform;

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
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.XMLWriter;

/**
 * UpdateHostedZoneCommentRequest Marshaller
 */

public class UpdateHostedZoneCommentRequestMarshaller
        implements
        Marshaller<Request<UpdateHostedZoneCommentRequest>, UpdateHostedZoneCommentRequest> {

    public Request<UpdateHostedZoneCommentRequest> marshall(
            UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest) {

        if (updateHostedZoneCommentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateHostedZoneCommentRequest> request = new DefaultRequest<UpdateHostedZoneCommentRequest>(
                updateHostedZoneCommentRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2013-04-01/hostedzone/{Id}";

        uriResourcePath = uriResourcePath.replace(
                "{Id}",
                (updateHostedZoneCommentRequest.getId() != null) ? StringUtils
                        .fromString(updateHostedZoneCommentRequest.getId())
                        : "");
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter,
                    "https://route53.amazonaws.com/doc/2013-04-01/");

            xmlWriter.startElement("UpdateHostedZoneCommentRequest");
            if (updateHostedZoneCommentRequest != null) {

                if (updateHostedZoneCommentRequest.getComment() != null) {
                    xmlWriter.startElement("Comment")
                            .value(updateHostedZoneCommentRequest.getComment())
                            .endElement();
                }
            }
            xmlWriter.endElement();

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
