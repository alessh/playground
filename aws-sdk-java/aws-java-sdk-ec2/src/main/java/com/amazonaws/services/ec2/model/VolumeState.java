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

package com.amazonaws.services.ec2.model;

/**
 * 
 */
public enum VolumeState {

    Creating("creating"),
    Available("available"),
    InUse("in-use"),
    Deleting("deleting"),
    Deleted("deleted"),
    Error("error");

    private String value;

    private VolumeState(String value) {
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
     * @return VolumeState corresponding to the value
     */
    public static VolumeState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("creating".equals(value)) {
            return Creating;
        } else if ("available".equals(value)) {
            return Available;
        } else if ("in-use".equals(value)) {
            return InUse;
        } else if ("deleting".equals(value)) {
            return Deleting;
        } else if ("deleted".equals(value)) {
            return Deleted;
        } else if ("error".equals(value)) {
            return Error;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}