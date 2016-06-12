/*
 * Copyright 2015-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.handlers;

/**
 * A type safe key used for setting and retrieving context in a {@link
 * com.amazonaws.Request} object.
 *
 * <pre class="brush: java">
 *     final HandlerContextKey<String> METRICS_KEY = new HandlerContextKey("METRICS_KEY");
 *
 *      new RequestHandler2(){
 *
 *          @Override
 *          public void beforeRequest(Request<?> request) {
 *              request.addHandlerContext(METRICS_KEY, AWSRequestMetrics
 *                                                  .Field.HttpRequestTime.name());
 *          }
 *
 *          @Override
 *          public void afterResponse(Request<?> request, Response<?> response) {
 *              String metricsKey = request.getHandlerContext(METRICS_KEY);
 *          }
 *
 *          @Override
 *          public void afterError(Request<?> request, Response<?> response,
 *          Exception e) { }
 *      }
 * </pre>
 */
public class HandlerContextKey<T> {
    private final String name;

    public HandlerContextKey(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HandlerContextKey<?> key = (HandlerContextKey<?>) o;

        return name.equals(key.getName());

    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
