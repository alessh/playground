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
 * RdsDbInstanceMarshaller
 */
public class RdsDbInstanceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RdsDbInstance rdsDbInstance,
            StructuredJsonGenerator jsonGenerator) {

        if (rdsDbInstance == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (rdsDbInstance.getRdsDbInstanceArn() != null) {
                jsonGenerator.writeFieldName("RdsDbInstanceArn").writeValue(
                        rdsDbInstance.getRdsDbInstanceArn());
            }
            if (rdsDbInstance.getDbInstanceIdentifier() != null) {
                jsonGenerator.writeFieldName("DbInstanceIdentifier")
                        .writeValue(rdsDbInstance.getDbInstanceIdentifier());
            }
            if (rdsDbInstance.getDbUser() != null) {
                jsonGenerator.writeFieldName("DbUser").writeValue(
                        rdsDbInstance.getDbUser());
            }
            if (rdsDbInstance.getDbPassword() != null) {
                jsonGenerator.writeFieldName("DbPassword").writeValue(
                        rdsDbInstance.getDbPassword());
            }
            if (rdsDbInstance.getRegion() != null) {
                jsonGenerator.writeFieldName("Region").writeValue(
                        rdsDbInstance.getRegion());
            }
            if (rdsDbInstance.getAddress() != null) {
                jsonGenerator.writeFieldName("Address").writeValue(
                        rdsDbInstance.getAddress());
            }
            if (rdsDbInstance.getEngine() != null) {
                jsonGenerator.writeFieldName("Engine").writeValue(
                        rdsDbInstance.getEngine());
            }
            if (rdsDbInstance.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(
                        rdsDbInstance.getStackId());
            }
            if (rdsDbInstance.getMissingOnRds() != null) {
                jsonGenerator.writeFieldName("MissingOnRds").writeValue(
                        rdsDbInstance.getMissingOnRds());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RdsDbInstanceJsonMarshaller instance;

    public static RdsDbInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RdsDbInstanceJsonMarshaller();
        return instance;
    }

}
