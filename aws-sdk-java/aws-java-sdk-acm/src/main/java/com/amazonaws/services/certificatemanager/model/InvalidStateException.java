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

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Processing has reached an invalid state. For example, this exception can
 * occur if the specified domain is not using email validation, or the current
 * certificate status does not permit the requested operation. See the exception
 * message returned by ACM to determine which state is not valid.
 * </p>
 */
public class InvalidStateException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidStateException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidStateException(String message) {
        super(message);
    }

}