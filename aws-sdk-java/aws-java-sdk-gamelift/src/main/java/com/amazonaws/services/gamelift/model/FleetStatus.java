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

package com.amazonaws.services.gamelift.model;

/**
 * 
 */
public enum FleetStatus {

    NEW("NEW"),
    DOWNLOADING("DOWNLOADING"),
    VALIDATING("VALIDATING"),
    BUILDING("BUILDING"),
    ACTIVATING("ACTIVATING"),
    ACTIVE("ACTIVE"),
    DELETING("DELETING"),
    ERROR("ERROR"),
    TERMINATED("TERMINATED");

    private String value;

    private FleetStatus(String value) {
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
     * @return FleetStatus corresponding to the value
     */
    public static FleetStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("NEW".equals(value)) {
            return NEW;
        } else if ("DOWNLOADING".equals(value)) {
            return DOWNLOADING;
        } else if ("VALIDATING".equals(value)) {
            return VALIDATING;
        } else if ("BUILDING".equals(value)) {
            return BUILDING;
        } else if ("ACTIVATING".equals(value)) {
            return ACTIVATING;
        } else if ("ACTIVE".equals(value)) {
            return ACTIVE;
        } else if ("DELETING".equals(value)) {
            return DELETING;
        } else if ("ERROR".equals(value)) {
            return ERROR;
        } else if ("TERMINATED".equals(value)) {
            return TERMINATED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}