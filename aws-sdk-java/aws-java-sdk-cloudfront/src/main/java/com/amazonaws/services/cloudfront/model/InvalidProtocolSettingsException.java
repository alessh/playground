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

package com.amazonaws.services.cloudfront.model;

import com.amazonaws.AmazonServiceException;

/**
 * You cannot specify SSLv3 as the minimum protocol version if you only want to
 * support only clients that Support Server Name Indication (SNI).
 */
public class InvalidProtocolSettingsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidProtocolSettingsException with the specified
     * error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidProtocolSettingsException(String message) {
        super(message);
    }

}