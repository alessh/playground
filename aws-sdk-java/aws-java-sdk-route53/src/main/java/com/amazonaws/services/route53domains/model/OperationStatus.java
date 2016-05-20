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

package com.amazonaws.services.route53domains.model;

/**
 * 
 */
public enum OperationStatus {

    SUBMITTED("SUBMITTED"),
    IN_PROGRESS("IN_PROGRESS"),
    ERROR("ERROR"),
    SUCCESSFUL("SUCCESSFUL"),
    FAILED("FAILED");

    private String value;

    private OperationStatus(String value) {
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
     * @return OperationStatus corresponding to the value
     */
    public static OperationStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("SUBMITTED".equals(value)) {
            return SUBMITTED;
        } else if ("IN_PROGRESS".equals(value)) {
            return IN_PROGRESS;
        } else if ("ERROR".equals(value)) {
            return ERROR;
        } else if ("SUCCESSFUL".equals(value)) {
            return SUCCESSFUL;
        } else if ("FAILED".equals(value)) {
            return FAILED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}