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

package com.amazonaws.services.apigateway.model;

/**
 * <p>
 * The integration type. The valid value is <code>HTTP</code>, <code>AWS</code>,
 * or <code>MOCK</code>.
 * </p>
 */
public enum IntegrationType {

    HTTP("HTTP"),
    AWS("AWS"),
    MOCK("MOCK");

    private String value;

    private IntegrationType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return IntegrationType corresponding to the value
     */
    public static IntegrationType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("HTTP".equals(value)) {
            return HTTP;
        } else if ("AWS".equals(value)) {
            return AWS;
        } else if ("MOCK".equals(value)) {
            return MOCK;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}