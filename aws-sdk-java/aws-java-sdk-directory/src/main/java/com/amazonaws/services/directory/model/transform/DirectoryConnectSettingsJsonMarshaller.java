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

package com.amazonaws.services.directory.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DirectoryConnectSettingsMarshaller
 */
public class DirectoryConnectSettingsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DirectoryConnectSettings directoryConnectSettings,
            StructuredJsonGenerator jsonGenerator) {

        if (directoryConnectSettings == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (directoryConnectSettings.getVpcId() != null) {
                jsonGenerator.writeFieldName("VpcId").writeValue(
                        directoryConnectSettings.getVpcId());
            }

            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) directoryConnectSettings
                    .getSubnetIds();
            if (!subnetIdsList.isEmpty() || !subnetIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("SubnetIds");
                jsonGenerator.writeStartArray();
                for (String subnetIdsListValue : subnetIdsList) {
                    if (subnetIdsListValue != null) {
                        jsonGenerator.writeValue(subnetIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> customerDnsIpsList = (com.amazonaws.internal.SdkInternalList<String>) directoryConnectSettings
                    .getCustomerDnsIps();
            if (!customerDnsIpsList.isEmpty()
                    || !customerDnsIpsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("CustomerDnsIps");
                jsonGenerator.writeStartArray();
                for (String customerDnsIpsListValue : customerDnsIpsList) {
                    if (customerDnsIpsListValue != null) {
                        jsonGenerator.writeValue(customerDnsIpsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (directoryConnectSettings.getCustomerUserName() != null) {
                jsonGenerator.writeFieldName("CustomerUserName").writeValue(
                        directoryConnectSettings.getCustomerUserName());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DirectoryConnectSettingsJsonMarshaller instance;

    public static DirectoryConnectSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectoryConnectSettingsJsonMarshaller();
        return instance;
    }

}
