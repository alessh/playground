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

package com.amazonaws.services.inspector.model;

/**
 * 
 */
public enum LimitExceededErrorCode {

    ASSESSMENT_TARGET_LIMIT_EXCEEDED("ASSESSMENT_TARGET_LIMIT_EXCEEDED"),
    ASSESSMENT_TEMPLATE_LIMIT_EXCEEDED("ASSESSMENT_TEMPLATE_LIMIT_EXCEEDED"),
    ASSESSMENT_RUN_LIMIT_EXCEEDED("ASSESSMENT_RUN_LIMIT_EXCEEDED"),
    RESOURCE_GROUP_LIMIT_EXCEEDED("RESOURCE_GROUP_LIMIT_EXCEEDED"),
    EVENT_SUBSCRIPTION_LIMIT_EXCEEDED("EVENT_SUBSCRIPTION_LIMIT_EXCEEDED");

    private String value;

    private LimitExceededErrorCode(String value) {
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
     * @return LimitExceededErrorCode corresponding to the value
     */
    public static LimitExceededErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("ASSESSMENT_TARGET_LIMIT_EXCEEDED".equals(value)) {
            return ASSESSMENT_TARGET_LIMIT_EXCEEDED;
        } else if ("ASSESSMENT_TEMPLATE_LIMIT_EXCEEDED".equals(value)) {
            return ASSESSMENT_TEMPLATE_LIMIT_EXCEEDED;
        } else if ("ASSESSMENT_RUN_LIMIT_EXCEEDED".equals(value)) {
            return ASSESSMENT_RUN_LIMIT_EXCEEDED;
        } else if ("RESOURCE_GROUP_LIMIT_EXCEEDED".equals(value)) {
            return RESOURCE_GROUP_LIMIT_EXCEEDED;
        } else if ("EVENT_SUBSCRIPTION_LIMIT_EXCEEDED".equals(value)) {
            return EVENT_SUBSCRIPTION_LIMIT_EXCEEDED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}