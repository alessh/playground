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

package com.amazonaws.codegen.model.config.customization;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleMethodFormsWrapper {

    private List<List<String>> methodForms;

    public List<List<String>> getMethodForms() {
        return methodForms;
    }

    @JsonProperty(value = "methodForms")
    public void setMethodForms(List<List<String>> methodForms) {
        this.methodForms = methodForms;
    }
}
