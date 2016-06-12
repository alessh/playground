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
 * A list of the variables to use in searching or filtering
 * <code>Evaluation</code>.
 * </p>
 * <ul>
 * <li> <code>CreatedAt</code> - Sets the search criteria to
 * <code>Evaluation</code> creation date.</li>
 * <li> <code>Status</code> - Sets the search criteria to <code>Evaluation</code>
 * status.</li>
 * <li> <code>Name</code> - Sets the search criteria to the contents of
 * <code>Evaluation</code> <b> </b> <code>Name</code>.</li>
 * <li> <code>IAMUser</code> - Sets the search criteria to the user account that
 * invoked an evaluation.</li>
 * <li> <code>MLModelId</code> - Sets the search criteria to the
 * <code>Predictor</code> that was evaluated.</li>
 * <li> <code>DataSourceId</code> - Sets the search criteria to the
 * <code>DataSource</code> used in evaluation.</li>
 * <li> <code>DataUri</code> - Sets the search criteria to the data file(s) used
 * in evaluation. The URL can identify either a file or an Amazon Simple Storage
 * Service (Amazon S3) bucket or directory.</li>
 * </ul>
 */
public enum EvaluationFilterVariable {

    CreatedAt("CreatedAt"),
    LastUpdatedAt("LastUpdatedAt"),
    Status("Status"),
    Name("Name"),
    IAMUser("IAMUser"),
    MLModelId("MLModelId"),
    DataSourceId("DataSourceId"),
    DataURI("DataURI");

    private String value;

    private EvaluationFilterVariable(String value) {
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
     * @return EvaluationFilterVariable corresponding to the value
     */
    public static EvaluationFilterVariable fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("CreatedAt".equals(value)) {
            return CreatedAt;
        } else if ("LastUpdatedAt".equals(value)) {
            return LastUpdatedAt;
        } else if ("Status".equals(value)) {
            return Status;
        } else if ("Name".equals(value)) {
            return Name;
        } else if ("IAMUser".equals(value)) {
            return IAMUser;
        } else if ("MLModelId".equals(value)) {
            return MLModelId;
        } else if ("DataSourceId".equals(value)) {
            return DataSourceId;
        } else if ("DataURI".equals(value)) {
            return DataURI;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}