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

package com.amazonaws.services.devicefarm.model;

/**
 * 
 */
public enum ExecutionStatus {

    PENDING("PENDING"),
    PROCESSING("PROCESSING"),
    SCHEDULING("SCHEDULING"),
    RUNNING("RUNNING"),
    COMPLETED("COMPLETED"),
    STOPPING("STOPPING");

    private String value;

    private ExecutionStatus(String value) {
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
     * @return ExecutionStatus corresponding to the value
     */
    public static ExecutionStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("PENDING".equals(value)) {
            return PENDING;
        } else if ("PROCESSING".equals(value)) {
            return PROCESSING;
        } else if ("SCHEDULING".equals(value)) {
            return SCHEDULING;
        } else if ("RUNNING".equals(value)) {
            return RUNNING;
        } else if ("COMPLETED".equals(value)) {
            return COMPLETED;
        } else if ("STOPPING".equals(value)) {
            return STOPPING;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}