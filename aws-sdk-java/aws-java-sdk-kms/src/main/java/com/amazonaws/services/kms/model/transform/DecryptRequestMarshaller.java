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

package com.amazonaws.services.kms.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DecryptRequest Marshaller
 */
public class DecryptRequestMarshaller implements
        Marshaller<Request<DecryptRequest>, DecryptRequest> {

    public Request<DecryptRequest> marshall(DecryptRequest decryptRequest) {

        if (decryptRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DecryptRequest> request = new DefaultRequest<DecryptRequest>(
                decryptRequest, "AWSKMS");
        request.addHeader("X-Amz-Target", "TrentService.Decrypt");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
                    .createWriter(false, "1.1");

            jsonGenerator.writeStartObject();

            if (decryptRequest.getCiphertextBlob() != null) {
                jsonGenerator.writeFieldName("CiphertextBlob").writeValue(
                        decryptRequest.getCiphertextBlob());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> encryptionContextMap = (com.amazonaws.internal.SdkInternalMap<String, String>) decryptRequest
                    .getEncryptionContext();
            if (!encryptionContextMap.isEmpty()
                    || !encryptionContextMap.isAutoConstruct()) {
                jsonGenerator.writeFieldName("EncryptionContext");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> encryptionContextMapValue : encryptionContextMap
                        .entrySet()) {
                    if (encryptionContextMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(encryptionContextMapValue
                                .getKey());

                        jsonGenerator.writeValue(encryptionContextMapValue
                                .getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            com.amazonaws.internal.SdkInternalList<String> grantTokensList = (com.amazonaws.internal.SdkInternalList<String>) decryptRequest
                    .getGrantTokens();
            if (!grantTokensList.isEmpty()
                    || !grantTokensList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("GrantTokens");
                jsonGenerator.writeStartArray();
                for (String grantTokensListValue : grantTokensList) {
                    if (grantTokensListValue != null) {
                        jsonGenerator.writeValue(grantTokensListValue);
                    }
                }
                jsonGenerator.writeEndArray();
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
