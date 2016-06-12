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
 * SendEmailRequest Marshaller
 */

public class SendEmailRequestMarshaller implements
        Marshaller<Request<SendEmailRequest>, SendEmailRequest> {

    public Request<SendEmailRequest> marshall(SendEmailRequest sendEmailRequest) {

        if (sendEmailRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<SendEmailRequest> request = new DefaultRequest<SendEmailRequest>(
                sendEmailRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SendEmail");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (sendEmailRequest.getSource() != null) {
            request.addParameter("Source",
                    StringUtils.fromString(sendEmailRequest.getSource()));
        }

        Destination destination = sendEmailRequest.getDestination();
        if (destination != null) {

            com.amazonaws.internal.SdkInternalList<String> toAddressesList = (com.amazonaws.internal.SdkInternalList<String>) destination
                    .getToAddresses();
            if (!toAddressesList.isEmpty()
                    || !toAddressesList.isAutoConstruct()) {
                int toAddressesListIndex = 1;

                for (String toAddressesListValue : toAddressesList) {
                    if (toAddressesListValue != null) {
                        request.addParameter("Destination.ToAddresses.member."
                                + toAddressesListIndex,
                                StringUtils.fromString(toAddressesListValue));
                    }
                    toAddressesListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<String> ccAddressesList = (com.amazonaws.internal.SdkInternalList<String>) destination
                    .getCcAddresses();
            if (!ccAddressesList.isEmpty()
                    || !ccAddressesList.isAutoConstruct()) {
                int ccAddressesListIndex = 1;

                for (String ccAddressesListValue : ccAddressesList) {
                    if (ccAddressesListValue != null) {
                        request.addParameter("Destination.CcAddresses.member."
                                + ccAddressesListIndex,
                                StringUtils.fromString(ccAddressesListValue));
                    }
                    ccAddressesListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<String> bccAddressesList = (com.amazonaws.internal.SdkInternalList<String>) destination
                    .getBccAddresses();
            if (!bccAddressesList.isEmpty()
                    || !bccAddressesList.isAutoConstruct()) {
                int bccAddressesListIndex = 1;

                for (String bccAddressesListValue : bccAddressesList) {
                    if (bccAddressesListValue != null) {
                        request.addParameter("Destination.BccAddresses.member."
                                + bccAddressesListIndex,
                                StringUtils.fromString(bccAddressesListValue));
                    }
                    bccAddressesListIndex++;
                }
            }
        }

        Message message = sendEmailRequest.getMessage();
        if (message != null) {

            Content subject = message.getSubject();
            if (subject != null) {

                if (subject.getData() != null) {
                    request.addParameter("Message.Subject.Data",
                            StringUtils.fromString(subject.getData()));
                }

                if (subject.getCharset() != null) {
                    request.addParameter("Message.Subject.Charset",
                            StringUtils.fromString(subject.getCharset()));
                }
            }

            Body body = message.getBody();
            if (body != null) {

                Content text = body.getText();
                if (text != null) {

                    if (text.getData() != null) {
                        request.addParameter("Message.Body.Text.Data",
                                StringUtils.fromString(text.getData()));
                    }

                    if (text.getCharset() != null) {
                        request.addParameter("Message.Body.Text.Charset",
                                StringUtils.fromString(text.getCharset()));
                    }
                }

                Content html = body.getHtml();
                if (html != null) {

                    if (html.getData() != null) {
                        request.addParameter("Message.Body.Html.Data",
                                StringUtils.fromString(html.getData()));
                    }

                    if (html.getCharset() != null) {
                        request.addParameter("Message.Body.Html.Charset",
                                StringUtils.fromString(html.getCharset()));
                    }
                }
            }
        }

        com.amazonaws.internal.SdkInternalList<String> replyToAddressesList = (com.amazonaws.internal.SdkInternalList<String>) sendEmailRequest
                .getReplyToAddresses();
        if (!replyToAddressesList.isEmpty()
                || !replyToAddressesList.isAutoConstruct()) {
            int replyToAddressesListIndex = 1;

            for (String replyToAddressesListValue : replyToAddressesList) {
                if (replyToAddressesListValue != null) {
                    request.addParameter("ReplyToAddresses.member."
                            + replyToAddressesListIndex,
                            StringUtils.fromString(replyToAddressesListValue));
                }
                replyToAddressesListIndex++;
            }
        }

        if (sendEmailRequest.getReturnPath() != null) {
            request.addParameter("ReturnPath",
                    StringUtils.fromString(sendEmailRequest.getReturnPath()));
        }

        if (sendEmailRequest.getSourceArn() != null) {
            request.addParameter("SourceArn",
                    StringUtils.fromString(sendEmailRequest.getSourceArn()));
        }

        if (sendEmailRequest.getReturnPathArn() != null) {
            request.addParameter("ReturnPathArn",
                    StringUtils.fromString(sendEmailRequest.getReturnPathArn()));
        }

        return request;
    }

}
