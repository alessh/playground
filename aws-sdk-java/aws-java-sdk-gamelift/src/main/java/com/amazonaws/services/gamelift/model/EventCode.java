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
public enum EventCode {

    GENERIC_EVENT("GENERIC_EVENT"),
    FLEET_CREATED("FLEET_CREATED"),
    FLEET_DELETED("FLEET_DELETED"),
    FLEET_SCALING_EVENT("FLEET_SCALING_EVENT"),
    FLEET_STATE_DOWNLOADING("FLEET_STATE_DOWNLOADING"),
    FLEET_STATE_VALIDATING("FLEET_STATE_VALIDATING"),
    FLEET_STATE_BUILDING("FLEET_STATE_BUILDING"),
    FLEET_STATE_ACTIVATING("FLEET_STATE_ACTIVATING"),
    FLEET_STATE_ACTIVE("FLEET_STATE_ACTIVE"),
    FLEET_STATE_ERROR("FLEET_STATE_ERROR"),
    FLEET_INITIALIZATION_FAILED("FLEET_INITIALIZATION_FAILED"),
    FLEET_BINARY_DOWNLOAD_FAILED("FLEET_BINARY_DOWNLOAD_FAILED"),
    FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND(
            "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND"),
    FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE(
            "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE"),
    FLEET_VALIDATION_TIMED_OUT("FLEET_VALIDATION_TIMED_OUT"),
    FLEET_ACTIVATION_FAILED("FLEET_ACTIVATION_FAILED"),
    FLEET_ACTIVATION_FAILED_NO_INSTANCES("FLEET_ACTIVATION_FAILED_NO_INSTANCES"),
    FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED(
            "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED");

    private String value;

    private EventCode(String value) {
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
     * @return EventCode corresponding to the value
     */
    public static EventCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("GENERIC_EVENT".equals(value)) {
            return GENERIC_EVENT;
        } else if ("FLEET_CREATED".equals(value)) {
            return FLEET_CREATED;
        } else if ("FLEET_DELETED".equals(value)) {
            return FLEET_DELETED;
        } else if ("FLEET_SCALING_EVENT".equals(value)) {
            return FLEET_SCALING_EVENT;
        } else if ("FLEET_STATE_DOWNLOADING".equals(value)) {
            return FLEET_STATE_DOWNLOADING;
        } else if ("FLEET_STATE_VALIDATING".equals(value)) {
            return FLEET_STATE_VALIDATING;
        } else if ("FLEET_STATE_BUILDING".equals(value)) {
            return FLEET_STATE_BUILDING;
        } else if ("FLEET_STATE_ACTIVATING".equals(value)) {
            return FLEET_STATE_ACTIVATING;
        } else if ("FLEET_STATE_ACTIVE".equals(value)) {
            return FLEET_STATE_ACTIVE;
        } else if ("FLEET_STATE_ERROR".equals(value)) {
            return FLEET_STATE_ERROR;
        } else if ("FLEET_INITIALIZATION_FAILED".equals(value)) {
            return FLEET_INITIALIZATION_FAILED;
        } else if ("FLEET_BINARY_DOWNLOAD_FAILED".equals(value)) {
            return FLEET_BINARY_DOWNLOAD_FAILED;
        } else if ("FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND".equals(value)) {
            return FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND;
        } else if ("FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE".equals(value)) {
            return FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE;
        } else if ("FLEET_VALIDATION_TIMED_OUT".equals(value)) {
            return FLEET_VALIDATION_TIMED_OUT;
        } else if ("FLEET_ACTIVATION_FAILED".equals(value)) {
            return FLEET_ACTIVATION_FAILED;
        } else if ("FLEET_ACTIVATION_FAILED_NO_INSTANCES".equals(value)) {
            return FLEET_ACTIVATION_FAILED_NO_INSTANCES;
        } else if ("FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED"
                .equals(value)) {
            return FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}