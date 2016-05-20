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
 * Contains the key values of <code>DetailsMap</code>: PredictiveModelType -
 * Indicates the type of the <code>MLModel</code>. Algorithm - Indicates the
 * algorithm was used for the <code>MLModel</code>.
 */
public enum DetailsAttributes {

    PredictiveModelType("PredictiveModelType"),
    Algorithm("Algorithm");

    private String value;

    private DetailsAttributes(String value) {
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
     * @return DetailsAttributes corresponding to the value
     */
    public static DetailsAttributes fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("PredictiveModelType".equals(value)) {
            return PredictiveModelType;
        } else if ("Algorithm".equals(value)) {
            return Algorithm;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}