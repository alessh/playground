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

package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the <a>ListMetrics</a> action.
 * </p>
 */
public class ListMetricsResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list of metrics used to generate statistics for an AWS account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Metric> metrics;
    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of metrics used to generate statistics for an AWS account.
     * </p>
     * 
     * @return A list of metrics used to generate statistics for an AWS account.
     */

    public java.util.List<Metric> getMetrics() {
        if (metrics == null) {
            metrics = new com.amazonaws.internal.SdkInternalList<Metric>();
        }
        return metrics;
    }

    /**
     * <p>
     * A list of metrics used to generate statistics for an AWS account.
     * </p>
     * 
     * @param metrics
     *        A list of metrics used to generate statistics for an AWS account.
     */

    public void setMetrics(java.util.Collection<Metric> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new com.amazonaws.internal.SdkInternalList<Metric>(
                metrics);
    }

    /**
     * <p>
     * A list of metrics used to generate statistics for an AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMetrics(java.util.Collection)} or
     * {@link #withMetrics(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param metrics
     *        A list of metrics used to generate statistics for an AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListMetricsResult withMetrics(Metric... metrics) {
        if (this.metrics == null) {
            setMetrics(new com.amazonaws.internal.SdkInternalList<Metric>(
                    metrics.length));
        }
        for (Metric ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of metrics used to generate statistics for an AWS account.
     * </p>
     * 
     * @param metrics
     *        A list of metrics used to generate statistics for an AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListMetricsResult withMetrics(java.util.Collection<Metric> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        A string that marks the start of the next batch of returned
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * 
     * @return A string that marks the start of the next batch of returned
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        A string that marks the start of the next batch of returned
     *        results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListMetricsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMetricsResult == false)
            return false;
        ListMetricsResult other = (ListMetricsResult) obj;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null
                && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMetricsResult clone() {
        try {
            return (ListMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
