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

package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * SslConfigurationMarshaller
 */
public class SslConfigurationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(SslConfiguration sslConfiguration,
            StructuredJsonGenerator jsonGenerator) {

        if (sslConfiguration == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (sslConfiguration.getCertificate() != null) {
                jsonGenerator.writeFieldName("Certificate").writeValue(
                        sslConfiguration.getCertificate());
            }
            if (sslConfiguration.getPrivateKey() != null) {
                jsonGenerator.writeFieldName("PrivateKey").writeValue(
                        sslConfiguration.getPrivateKey());
            }
            if (sslConfiguration.getChain() != null) {
                jsonGenerator.writeFieldName("Chain").writeValue(
                        sslConfiguration.getChain());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SslConfigurationJsonMarshaller instance;

    public static SslConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SslConfigurationJsonMarshaller();
        return instance;
    }

}
