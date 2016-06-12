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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeAlarmsForMetricRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The namespace of the metric.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The statistic for the metric.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The list of dimensions associated with the metric. If the metric has any
     * associated dimensions, you must specify them in order for the
     * DescribeAlarmsForMetric to succeed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;
    /**
     * <p>
     * The period in seconds over which the statistic is applied.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The unit for the metric.
     * </p>
     */
    private String unit;

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @return The name of the metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the metric.
     * </p>
     * 
     * @param metricName
     *        The name of the metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsForMetricRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     * 
     * @return The namespace of the metric.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the metric.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsForMetricRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric.
     * @see Statistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * 
     * @return The statistic for the metric.
     * @see Statistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Statistic
     */

    public DescribeAlarmsForMetricRequest withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Statistic
     */

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * 
     * @param statistic
     *        The statistic for the metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Statistic
     */

    public DescribeAlarmsForMetricRequest withStatistic(Statistic statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The list of dimensions associated with the metric. If the metric has any
     * associated dimensions, you must specify them in order for the
     * DescribeAlarmsForMetric to succeed.
     * </p>
     * 
     * @return The list of dimensions associated with the metric. If the metric
     *         has any associated dimensions, you must specify them in order for
     *         the DescribeAlarmsForMetric to succeed.
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * The list of dimensions associated with the metric. If the metric has any
     * associated dimensions, you must specify them in order for the
     * DescribeAlarmsForMetric to succeed.
     * </p>
     * 
     * @param dimensions
     *        The list of dimensions associated with the metric. If the metric
     *        has any associated dimensions, you must specify them in order for
     *        the DescribeAlarmsForMetric to succeed.
     */

    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>(
                dimensions);
    }

    /**
     * <p>
     * The list of dimensions associated with the metric. If the metric has any
     * associated dimensions, you must specify them in order for the
     * DescribeAlarmsForMetric to succeed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDimensions(java.util.Collection)} or
     * {@link #withDimensions(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param dimensions
     *        The list of dimensions associated with the metric. If the metric
     *        has any associated dimensions, you must specify them in order for
     *        the DescribeAlarmsForMetric to succeed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsForMetricRequest withDimensions(
            Dimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new com.amazonaws.internal.SdkInternalList<Dimension>(
                    dimensions.length));
        }
        for (Dimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of dimensions associated with the metric. If the metric has any
     * associated dimensions, you must specify them in order for the
     * DescribeAlarmsForMetric to succeed.
     * </p>
     * 
     * @param dimensions
     *        The list of dimensions associated with the metric. If the metric
     *        has any associated dimensions, you must specify them in order for
     *        the DescribeAlarmsForMetric to succeed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsForMetricRequest withDimensions(
            java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The period in seconds over which the statistic is applied.
     * </p>
     * 
     * @param period
     *        The period in seconds over which the statistic is applied.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period in seconds over which the statistic is applied.
     * </p>
     * 
     * @return The period in seconds over which the statistic is applied.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period in seconds over which the statistic is applied.
     * </p>
     * 
     * @param period
     *        The period in seconds over which the statistic is applied.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsForMetricRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @param unit
     *        The unit for the metric.
     * @see StandardUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @return The unit for the metric.
     * @see StandardUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @param unit
     *        The unit for the metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */

    public DescribeAlarmsForMetricRequest withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @param unit
     *        The unit for the metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */

    public void setUnit(StandardUnit unit) {
        this.unit = unit.toString();
    }

    /**
     * <p>
     * The unit for the metric.
     * </p>
     * 
     * @param unit
     *        The unit for the metric.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StandardUnit
     */

    public DescribeAlarmsForMetricRequest withUnit(StandardUnit unit) {
        setUnit(unit);
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
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getStatistic() != null)
            sb.append("Statistic: " + getStatistic() + ",");
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getPeriod() != null)
            sb.append("Period: " + getPeriod() + ",");
        if (getUnit() != null)
            sb.append("Unit: " + getUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlarmsForMetricRequest == false)
            return false;
        DescribeAlarmsForMetricRequest other = (DescribeAlarmsForMetricRequest) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null
                && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null
                && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null
                && other.getUnit().equals(this.getUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode
                + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode
                + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode
                + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode
                + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode
                + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlarmsForMetricRequest clone() {
        return (DescribeAlarmsForMetricRequest) super.clone();
    }
}