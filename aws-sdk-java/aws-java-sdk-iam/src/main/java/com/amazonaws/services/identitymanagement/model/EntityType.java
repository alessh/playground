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

package com.amazonaws.services.identitymanagement.model;

/**
 * 
 */
public enum EntityType {

    User("User"),
    Role("Role"),
    Group("Group"),
    LocalManagedPolicy("LocalManagedPolicy"),
    AWSManagedPolicy("AWSManagedPolicy");

    private String value;

    private EntityType(String value) {
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
     * @return EntityType corresponding to the value
     */
    public static EntityType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("User".equals(value)) {
            return User;
        } else if ("Role".equals(value)) {
            return Role;
        } else if ("Group".equals(value)) {
            return Group;
        } else if ("LocalManagedPolicy".equals(value)) {
            return LocalManagedPolicy;
        } else if ("AWSManagedPolicy".equals(value)) {
            return AWSManagedPolicy;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}