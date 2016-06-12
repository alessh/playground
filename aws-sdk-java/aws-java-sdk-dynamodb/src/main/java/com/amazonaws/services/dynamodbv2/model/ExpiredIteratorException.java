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

package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The shard iterator has expired and can no longer be used to retrieve stream
 * records. A shard iterator expires 15 minutes after it is retrieved using the
 * <i>GetShardIterator</i> action.
 * </p>
 */
public class ExpiredIteratorException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ExpiredIteratorException with the specified error
     * message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ExpiredIteratorException(String message) {
        super(message);
    }

}