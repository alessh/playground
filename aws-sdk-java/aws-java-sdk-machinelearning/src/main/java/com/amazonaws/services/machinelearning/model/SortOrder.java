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

package com.amazonaws.services.machinelearning.model;

/**
 * <p>
 * The sort order specified in a listing condition. Possible values include the
 * following:
 * </p>
 * <ul>
 * <li> <code>asc</code> - Present the information in ascending order (from A-Z).
 * </li>
 * <li> <code>dsc</code> - Present the information in descending order (from
 * Z-A).</li>
 * </ul>
 */
public enum SortOrder {

    Asc("asc"),
    Dsc("dsc");

    private String value;

    private SortOrder(String value) {
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
     * @return SortOrder corresponding to the value
     */
    public static SortOrder fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("asc".equals(value)) {
            return Asc;
        } else if ("dsc".equals(value)) {
            return Dsc;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}