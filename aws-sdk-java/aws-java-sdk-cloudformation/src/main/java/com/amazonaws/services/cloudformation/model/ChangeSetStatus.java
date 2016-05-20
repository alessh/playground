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

package com.amazonaws.services.cloudformation.model;

/**
 * 
 */
public enum ChangeSetStatus {

    CREATE_PENDING("CREATE_PENDING"),
    CREATE_IN_PROGRESS("CREATE_IN_PROGRESS"),
    CREATE_COMPLETE("CREATE_COMPLETE"),
    DELETE_COMPLETE("DELETE_COMPLETE"),
    FAILED("FAILED");

    private String value;

    private ChangeSetStatus(String value) {
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
     * @return ChangeSetStatus corresponding to the value
     */
    public static ChangeSetStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("CREATE_PENDING".equals(value)) {
            return CREATE_PENDING;
        } else if ("CREATE_IN_PROGRESS".equals(value)) {
            return CREATE_IN_PROGRESS;
        } else if ("CREATE_COMPLETE".equals(value)) {
            return CREATE_COMPLETE;
        } else if ("DELETE_COMPLETE".equals(value)) {
            return DELETE_COMPLETE;
        } else if ("FAILED".equals(value)) {
            return FAILED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}