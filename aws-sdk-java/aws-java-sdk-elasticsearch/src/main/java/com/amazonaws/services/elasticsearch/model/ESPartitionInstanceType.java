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

package com.amazonaws.services.elasticsearch.model;

/**
 * 
 */
public enum ESPartitionInstanceType {

    M3MediumElasticsearch("m3.medium.elasticsearch"),
    M3LargeElasticsearch("m3.large.elasticsearch"),
    M3XlargeElasticsearch("m3.xlarge.elasticsearch"),
    M32xlargeElasticsearch("m3.2xlarge.elasticsearch"),
    T2MicroElasticsearch("t2.micro.elasticsearch"),
    T2SmallElasticsearch("t2.small.elasticsearch"),
    T2MediumElasticsearch("t2.medium.elasticsearch"),
    R3LargeElasticsearch("r3.large.elasticsearch"),
    R3XlargeElasticsearch("r3.xlarge.elasticsearch"),
    R32xlargeElasticsearch("r3.2xlarge.elasticsearch"),
    R34xlargeElasticsearch("r3.4xlarge.elasticsearch"),
    R38xlargeElasticsearch("r3.8xlarge.elasticsearch"),
    I2XlargeElasticsearch("i2.xlarge.elasticsearch"),
    I22xlargeElasticsearch("i2.2xlarge.elasticsearch");

    private String value;

    private ESPartitionInstanceType(String value) {
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
     * @return ESPartitionInstanceType corresponding to the value
     */
    public static ESPartitionInstanceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("m3.medium.elasticsearch".equals(value)) {
            return M3MediumElasticsearch;
        } else if ("m3.large.elasticsearch".equals(value)) {
            return M3LargeElasticsearch;
        } else if ("m3.xlarge.elasticsearch".equals(value)) {
            return M3XlargeElasticsearch;
        } else if ("m3.2xlarge.elasticsearch".equals(value)) {
            return M32xlargeElasticsearch;
        } else if ("t2.micro.elasticsearch".equals(value)) {
            return T2MicroElasticsearch;
        } else if ("t2.small.elasticsearch".equals(value)) {
            return T2SmallElasticsearch;
        } else if ("t2.medium.elasticsearch".equals(value)) {
            return T2MediumElasticsearch;
        } else if ("r3.large.elasticsearch".equals(value)) {
            return R3LargeElasticsearch;
        } else if ("r3.xlarge.elasticsearch".equals(value)) {
            return R3XlargeElasticsearch;
        } else if ("r3.2xlarge.elasticsearch".equals(value)) {
            return R32xlargeElasticsearch;
        } else if ("r3.4xlarge.elasticsearch".equals(value)) {
            return R34xlargeElasticsearch;
        } else if ("r3.8xlarge.elasticsearch".equals(value)) {
            return R38xlargeElasticsearch;
        } else if ("i2.xlarge.elasticsearch".equals(value)) {
            return I2XlargeElasticsearch;
        } else if ("i2.2xlarge.elasticsearch".equals(value)) {
            return I22xlargeElasticsearch;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}