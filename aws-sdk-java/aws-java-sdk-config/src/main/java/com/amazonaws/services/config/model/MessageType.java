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

package com.amazonaws.services.config.model;

/**
 * 
 */
public enum MessageType {

    ConfigurationItemChangeNotification("ConfigurationItemChangeNotification"),
    ConfigurationSnapshotDeliveryCompleted(
            "ConfigurationSnapshotDeliveryCompleted");

    private String value;

    private MessageType(String value) {
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
     * @return MessageType corresponding to the value
     */
    public static MessageType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("ConfigurationItemChangeNotification".equals(value)) {
            return ConfigurationItemChangeNotification;
        } else if ("ConfigurationSnapshotDeliveryCompleted".equals(value)) {
            return ConfigurationSnapshotDeliveryCompleted;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}