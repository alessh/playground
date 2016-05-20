/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.retry;

import org.apache.http.HttpStatus;

import com.amazonaws.AmazonServiceException;

public class RetryUtils {

    /**
     * Returns true if the specified exception is a retryable service side
     * exception.
     *
     * @param ase
     *            The exception to test.
     *
     * @return True if the exception resulted from a retryable service error,
     *         otherwise false.
     */
    public static boolean isRetryableServiceException(AmazonServiceException ase) {
        return ((ase != null) && (ase.getStatusCode() == HttpStatus.SC_INTERNAL_SERVER_ERROR
                || ase.getStatusCode() == HttpStatus.SC_SERVICE_UNAVAILABLE));
    }

    /**
     * Returns true if the specified exception is a throttling error.
     *
     * @param ase
     *            The exception to test.
     *
     * @return True if the exception resulted from a throttling error message
     *         from a service, otherwise false.
     */
    public static boolean isThrottlingException(AmazonServiceException ase) {
        if (ase == null) return false;

        String errorCode = ase.getErrorCode();
        return "Throttling".equals(errorCode)
            || "ThrottlingException".equals(errorCode)
            || "ProvisionedThroughputExceededException".equals(errorCode);
    }

    /**
     * Returns true if the specified exception is a request entity too large
     * error.
     *
     * @param ase
     *            The exception to test.
     *
     * @return True if the exception resulted from a request entity too large
     *         error message from a service, otherwise false.
     */
    public static boolean isRequestEntityTooLargeException(AmazonServiceException ase) {
        return ase != null
            && ase.getStatusCode() == HttpStatus.SC_REQUEST_TOO_LONG;
    }

    /**
     * Returns true if the specified exception is a clock skew error.
     *
     * @param ase
     *            The exception to test.
     *
     * @return True if the exception resulted from a clock skews error message
     *         from a service, otherwise false.
     */
    public static boolean isClockSkewError(AmazonServiceException ase) {
        if (ase == null) return false;

        String errorCode = ase.getErrorCode();
        return "RequestTimeTooSkewed".equals(errorCode)
                || "RequestExpired".equals(errorCode)
                || "InvalidSignatureException".equals(errorCode)
                || "SignatureDoesNotMatch".equals(errorCode)
                || "AuthFailure".equals(errorCode);
    }
}
