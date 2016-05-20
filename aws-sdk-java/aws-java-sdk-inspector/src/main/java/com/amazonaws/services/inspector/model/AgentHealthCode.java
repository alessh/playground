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
public enum AgentHealthCode {

    IDLE("IDLE"),
    RUNNING("RUNNING"),
    SHUTDOWN("SHUTDOWN"),
    UNHEALTHY("UNHEALTHY"),
    THROTTLED("THROTTLED"),
    UNKNOWN("UNKNOWN");

    private String value;

    private AgentHealthCode(String value) {
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
     * @return AgentHealthCode corresponding to the value
     */
    public static AgentHealthCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("IDLE".equals(value)) {
            return IDLE;
        } else if ("RUNNING".equals(value)) {
            return RUNNING;
        } else if ("SHUTDOWN".equals(value)) {
            return SHUTDOWN;
        } else if ("UNHEALTHY".equals(value)) {
            return UNHEALTHY;
        } else if ("THROTTLED".equals(value)) {
            return THROTTLED;
        } else if ("UNKNOWN".equals(value)) {
            return UNKNOWN;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}