/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen.model.service;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceModel {

    private final ServiceMetadata metadata;

    private final Map<String, Operation> operations;

    private final Map<String, Shape> shapes;

    private String documentation;

    public ServiceModel(
            @JsonProperty(value = "metadata", required = true) ServiceMetadata metadata,
            @JsonProperty(value = "operations", required = true) Map<String, Operation> operations,
            @JsonProperty(value = "shapes", required = true) Map<String, Shape> shapes) {
        this.metadata = metadata;
        this.operations = operations;
        this.shapes = shapes;
    }

    public ServiceMetadata getMetadata() {
        return metadata;
    }

    public Map<String, Operation> getOperations() {
        return operations;
    }

    public Map<String, Shape> getShapes() {
        return shapes;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }
}
