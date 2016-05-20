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

package com.amazonaws.services.kinesisfirehose.model;

/**
 * 
 */
public enum CompressionFormat {

    UNCOMPRESSED("UNCOMPRESSED"),
    GZIP("GZIP"),
    ZIP("ZIP"),
    Snappy("Snappy");

    private String value;

    private CompressionFormat(String value) {
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
     * @return CompressionFormat corresponding to the value
     */
    public static CompressionFormat fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("UNCOMPRESSED".equals(value)) {
            return UNCOMPRESSED;
        } else if ("GZIP".equals(value)) {
            return GZIP;
        } else if ("ZIP".equals(value)) {
            return ZIP;
        } else if ("Snappy".equals(value)) {
            return Snappy;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}