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
public enum AssessmentRunNotificationSnsStatusCode {

    SUCCESS("SUCCESS"),
    TOPIC_DOES_NOT_EXIST("TOPIC_DOES_NOT_EXIST"),
    ACCESS_DENIED("ACCESS_DENIED"),
    INTERNAL_ERROR("INTERNAL_ERROR");

    private String value;

    private AssessmentRunNotificationSnsStatusCode(String value) {
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
     * @return AssessmentRunNotificationSnsStatusCode corresponding to the value
     */
    public static AssessmentRunNotificationSnsStatusCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("SUCCESS".equals(value)) {
            return SUCCESS;
        } else if ("TOPIC_DOES_NOT_EXIST".equals(value)) {
            return TOPIC_DOES_NOT_EXIST;
        } else if ("ACCESS_DENIED".equals(value)) {
            return ACCESS_DENIED;
        } else if ("INTERNAL_ERROR".equals(value)) {
            return INTERNAL_ERROR;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}