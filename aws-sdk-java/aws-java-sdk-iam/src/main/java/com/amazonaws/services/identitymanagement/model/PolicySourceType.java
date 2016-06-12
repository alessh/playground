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
public enum PolicySourceType {

    User("user"),
    Group("group"),
    Role("role"),
    AwsManaged("aws-managed"),
    UserManaged("user-managed"),
    Resource("resource"),
    None("none");

    private String value;

    private PolicySourceType(String value) {
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
     * @return PolicySourceType corresponding to the value
     */
    public static PolicySourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("user".equals(value)) {
            return User;
        } else if ("group".equals(value)) {
            return Group;
        } else if ("role".equals(value)) {
            return Role;
        } else if ("aws-managed".equals(value)) {
            return AwsManaged;
        } else if ("user-managed".equals(value)) {
            return UserManaged;
        } else if ("resource".equals(value)) {
            return Resource;
        } else if ("none".equals(value)) {
            return None;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}