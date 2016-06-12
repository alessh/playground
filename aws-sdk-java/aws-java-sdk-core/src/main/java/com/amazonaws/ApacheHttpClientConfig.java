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
package com.amazonaws;

import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.conn.ssl.SSLSocketFactory;

/**
 * Used for Apache HTTP client specific custom configurations.
 */
@SuppressWarnings("deprecation")
@NotThreadSafe
public final class ApacheHttpClientConfig {
    private SSLSocketFactory sslSocketFactory;

    ApacheHttpClientConfig() {}

    ApacheHttpClientConfig(ApacheHttpClientConfig that) {
        this.sslSocketFactory = that.sslSocketFactory;
    }

    /**
     * Returns a custom Apache HTTP client specific SSL socket factory; 
     * or null if there is none.
     */
    public SSLSocketFactory getSslSocketFactory() {
        return sslSocketFactory;
    }

    /**
     * Sets a custom Apache HTTP client specific SSL socket factory.
     * 
     * @param sslSocketFactory a custom Apache HTTP client specific SSL socket 
     * factory; or null if there is none.
     */
    public void setSslSocketFactory(SSLSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
    }

    /**
     * Fluent API for setting a custom Apache HTTP client specific SSL socket
     * factory.
     * 
     * @param sslSocketFactory a custom Apache HTTP client specific SSL socket 
     * factory; or null if there is none.
     */
    public ApacheHttpClientConfig withSslSocketFactory(
            SSLSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
        return this;
    }
}