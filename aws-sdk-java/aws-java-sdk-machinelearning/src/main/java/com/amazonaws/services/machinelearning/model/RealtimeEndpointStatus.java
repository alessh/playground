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

package com.amazonaws.services.machinelearning.model;

/**
 * 
 */
public enum RealtimeEndpointStatus {

    NONE("NONE"),
    READY("READY"),
    UPDATING("UPDATING"),
    FAILED("FAILED");

    private String value;

    private RealtimeEndpointStatus(String value) {
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
     * @return RealtimeEndpointStatus corresponding to the value
     */
    public static RealtimeEndpointStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("NONE".equals(value)) {
            return NONE;
        } else if ("READY".equals(value)) {
            return READY;
        } else if ("UPDATING".equals(value)) {
            return UPDATING;
        } else if ("FAILED".equals(value)) {
            return FAILED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}