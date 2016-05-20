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

package com.amazonaws.services.certificatemanager.model;

/**
 * 
 */
public enum RevocationReason {

    UNSPECIFIED("UNSPECIFIED"),
    KEY_COMPROMISE("KEY_COMPROMISE"),
    CA_COMPROMISE("CA_COMPROMISE"),
    AFFILIATION_CHANGED("AFFILIATION_CHANGED"),
    SUPERCEDED("SUPERCEDED"),
    CESSATION_OF_OPERATION("CESSATION_OF_OPERATION"),
    CERTIFICATE_HOLD("CERTIFICATE_HOLD"),
    REMOVE_FROM_CRL("REMOVE_FROM_CRL"),
    PRIVILEGE_WITHDRAWN("PRIVILEGE_WITHDRAWN"),
    A_A_COMPROMISE("A_A_COMPROMISE");

    private String value;

    private RevocationReason(String value) {
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
     * @return RevocationReason corresponding to the value
     */
    public static RevocationReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("UNSPECIFIED".equals(value)) {
            return UNSPECIFIED;
        } else if ("KEY_COMPROMISE".equals(value)) {
            return KEY_COMPROMISE;
        } else if ("CA_COMPROMISE".equals(value)) {
            return CA_COMPROMISE;
        } else if ("AFFILIATION_CHANGED".equals(value)) {
            return AFFILIATION_CHANGED;
        } else if ("SUPERCEDED".equals(value)) {
            return SUPERCEDED;
        } else if ("CESSATION_OF_OPERATION".equals(value)) {
            return CESSATION_OF_OPERATION;
        } else if ("CERTIFICATE_HOLD".equals(value)) {
            return CERTIFICATE_HOLD;
        } else if ("REMOVE_FROM_CRL".equals(value)) {
            return REMOVE_FROM_CRL;
        } else if ("PRIVILEGE_WITHDRAWN".equals(value)) {
            return PRIVILEGE_WITHDRAWN;
        } else if ("A_A_COMPROMISE".equals(value)) {
            return A_A_COMPROMISE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}