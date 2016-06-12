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

package com.amazonaws.services.directory.model;

/**
 * 
 */
public enum RadiusAuthenticationProtocol {

    PAP("PAP"),
    CHAP("CHAP"),
    MSCHAPv1("MS-CHAPv1"),
    MSCHAPv2("MS-CHAPv2");

    private String value;

    private RadiusAuthenticationProtocol(String value) {
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
     * @return RadiusAuthenticationProtocol corresponding to the value
     */
    public static RadiusAuthenticationProtocol fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("PAP".equals(value)) {
            return PAP;
        } else if ("CHAP".equals(value)) {
            return CHAP;
        } else if ("MS-CHAPv1".equals(value)) {
            return MSCHAPv1;
        } else if ("MS-CHAPv2".equals(value)) {
            return MSCHAPv2;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}