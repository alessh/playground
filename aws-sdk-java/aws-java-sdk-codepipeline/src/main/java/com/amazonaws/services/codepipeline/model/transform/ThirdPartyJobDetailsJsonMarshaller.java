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

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ThirdPartyJobDetailsMarshaller
 */
public class ThirdPartyJobDetailsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ThirdPartyJobDetails thirdPartyJobDetails,
            StructuredJsonGenerator jsonGenerator) {

        if (thirdPartyJobDetails == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (thirdPartyJobDetails.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(
                        thirdPartyJobDetails.getId());
            }
            if (thirdPartyJobDetails.getData() != null) {
                jsonGenerator.writeFieldName("data");
                ThirdPartyJobDataJsonMarshaller.getInstance().marshall(
                        thirdPartyJobDetails.getData(), jsonGenerator);
            }
            if (thirdPartyJobDetails.getNonce() != null) {
                jsonGenerator.writeFieldName("nonce").writeValue(
                        thirdPartyJobDetails.getNonce());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ThirdPartyJobDetailsJsonMarshaller instance;

    public static ThirdPartyJobDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ThirdPartyJobDetailsJsonMarshaller();
        return instance;
    }

}
