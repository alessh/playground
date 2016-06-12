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
 * The function used to train a <code>MLModel</code>. Training choices supported
 * by Amazon ML include the following:
 * </p>
 * <ul>
 * <li>SGD - Stochastic Gradient Descent.</li>
 * <li>RandomForest - Random forest of decision trees.</li>
 * </ul>
 */
public enum Algorithm {

    Sgd("sgd");

    private String value;

    private Algorithm(String value) {
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
     * @return Algorithm corresponding to the value
     */
    public static Algorithm fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("sgd".equals(value)) {
            return Sgd;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}