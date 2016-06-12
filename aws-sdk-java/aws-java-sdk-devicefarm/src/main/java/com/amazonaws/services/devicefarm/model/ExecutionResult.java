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
public enum ExecutionResult {

    PENDING("PENDING"),
    PASSED("PASSED"),
    WARNED("WARNED"),
    FAILED("FAILED"),
    SKIPPED("SKIPPED"),
    ERRORED("ERRORED"),
    STOPPED("STOPPED");

    private String value;

    private ExecutionResult(String value) {
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
     * @return ExecutionResult corresponding to the value
     */
    public static ExecutionResult fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("PENDING".equals(value)) {
            return PENDING;
        } else if ("PASSED".equals(value)) {
            return PASSED;
        } else if ("WARNED".equals(value)) {
            return WARNED;
        } else if ("FAILED".equals(value)) {
            return FAILED;
        } else if ("SKIPPED".equals(value)) {
            return SKIPPED;
        } else if ("ERRORED".equals(value)) {
            return ERRORED;
        } else if ("STOPPED".equals(value)) {
            return STOPPED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}