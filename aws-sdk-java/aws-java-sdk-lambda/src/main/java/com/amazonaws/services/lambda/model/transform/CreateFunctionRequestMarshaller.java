/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Create Function Request Marshaller
 */
public class CreateFunctionRequestMarshaller implements Marshaller<Request<CreateFunctionRequest>, CreateFunctionRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/2015-03-31/functions";
        Map<String, String> staticMap = new HashMap<String, String>();
        Map<String, String> dynamicMap = new HashMap<String, String>();

        int index = path.indexOf("?");
        if (index != -1) {
            String queryString = path.substring(index + 1);
            path = path.substring(0, index);

            for (String s : queryString.split("[;&]")) {
                index = s.indexOf("=");
                if (index != -1) {
                    String name = s.substring(0, index);
                    String value = s.substring(index + 1);

                    if (value.startsWith("{") && value.endsWith("}")) {
                        dynamicMap.put(value.substring(1, value.length() - 1), name);
                    } else {
                        staticMap.put(name, value);
                    }
                }
            }
        }

        RESOURCE_PATH_TEMPLATE = path;
        STATIC_QUERY_PARAMS = Collections.unmodifiableMap(staticMap);
        DYNAMIC_QUERY_PARAMS = Collections.unmodifiableMap(dynamicMap);
    }

    public Request<CreateFunctionRequest> marshall(CreateFunctionRequest createFunctionRequest) {
        if (createFunctionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateFunctionRequest> request = new DefaultRequest<CreateFunctionRequest>(createFunctionRequest, "AWSLambda");
        String target = "AWSLambda.CreateFunction";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        String uriResourcePath = RESOURCE_PATH_TEMPLATE;

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (createFunctionRequest.getFunctionName() != null) {
                jsonWriter.key("FunctionName").value(createFunctionRequest.getFunctionName());
            }
            if (createFunctionRequest.getRuntime() != null) {
                jsonWriter.key("Runtime").value(createFunctionRequest.getRuntime());
            }
            if (createFunctionRequest.getRole() != null) {
                jsonWriter.key("Role").value(createFunctionRequest.getRole());
            }
            if (createFunctionRequest.getHandler() != null) {
                jsonWriter.key("Handler").value(createFunctionRequest.getHandler());
            }
            FunctionCode code = createFunctionRequest.getCode();
            if (code != null) {

                jsonWriter.key("Code");
                jsonWriter.object();

                if (code.getZipFile() != null) {
                    jsonWriter.key("ZipFile").value(code.getZipFile());
                }
                if (code.getS3Bucket() != null) {
                    jsonWriter.key("S3Bucket").value(code.getS3Bucket());
                }
                if (code.getS3Key() != null) {
                    jsonWriter.key("S3Key").value(code.getS3Key());
                }
                if (code.getS3ObjectVersion() != null) {
                    jsonWriter.key("S3ObjectVersion").value(code.getS3ObjectVersion());
                }
                jsonWriter.endObject();
            }
            if (createFunctionRequest.getDescription() != null) {
                jsonWriter.key("Description").value(createFunctionRequest.getDescription());
            }
            if (createFunctionRequest.getTimeout() != null) {
                jsonWriter.key("Timeout").value(createFunctionRequest.getTimeout());
            }
            if (createFunctionRequest.getMemorySize() != null) {
                jsonWriter.key("MemorySize").value(createFunctionRequest.getMemorySize());
            }
            if (createFunctionRequest.isPublish() != null) {
                jsonWriter.key("Publish").value(createFunctionRequest.isPublish());
            }
            VpcConfig vpcConfig = createFunctionRequest.getVpcConfig();
            if (vpcConfig != null) {

                jsonWriter.key("VpcConfig");
                jsonWriter.object();

                com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetIdsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(vpcConfig.getSubnetIds());
                if (subnetIdsList != null && !(subnetIdsList.isAutoConstruct() && subnetIdsList.isEmpty())) {

                    jsonWriter.key("SubnetIds");
                    jsonWriter.array();

                    for (String subnetIdsListValue : subnetIdsList) {
                        if (subnetIdsListValue != null) {
                            jsonWriter.value(subnetIdsListValue);
                        }
                    }
                    jsonWriter.endArray();
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(vpcConfig.getSecurityGroupIds());
                if (securityGroupIdsList != null && !(securityGroupIdsList.isAutoConstruct() && securityGroupIdsList.isEmpty())) {

                    jsonWriter.key("SecurityGroupIds");
                    jsonWriter.array();

                    for (String securityGroupIdsListValue : securityGroupIdsList) {
                        if (securityGroupIdsListValue != null) {
                            jsonWriter.value(securityGroupIdsListValue);
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}