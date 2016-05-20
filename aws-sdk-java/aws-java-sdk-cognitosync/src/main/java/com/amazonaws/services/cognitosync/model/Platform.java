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

package com.amazonaws.services.cognitosync.model;

/**
 * 
 */
public enum Platform {

    APNS("APNS"),
    APNS_SANDBOX("APNS_SANDBOX"),
    GCM("GCM"),
    ADM("ADM");

    private String value;

    private Platform(String value) {
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
     * @return Platform corresponding to the value
     */
    public static Platform fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("APNS".equals(value)) {
            return APNS;
        } else if ("APNS_SANDBOX".equals(value)) {
            return APNS_SANDBOX;
        } else if ("GCM".equals(value)) {
            return GCM;
        } else if ("ADM".equals(value)) {
            return ADM;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}