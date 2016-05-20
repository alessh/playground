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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Reserved Instance.
 * </p>
 */
public class ReservedInstances implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     */
    private String reservedInstancesId;
    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The date and time the Reserved Instance started.
     * </p>
     */
    private java.util.Date start;
    /**
     * <p>
     * The time when the Reserved Instance expires.
     * </p>
     */
    private java.util.Date end;
    /**
     * <p>
     * The duration of the Reserved Instance, in seconds.
     * </p>
     */
    private Long duration;
    /**
     * <p>
     * The usage price of the Reserved Instance, per hour.
     * </p>
     */
    private Float usagePrice;
    /**
     * <p>
     * The purchase price of the Reserved Instance.
     * </p>
     */
    private Float fixedPrice;
    /**
     * <p>
     * The number of reservations purchased.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * The state of the Reserved Instance purchase.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     */
    private String instanceTenancy;
    /**
     * <p>
     * The currency of the Reserved Instance. It's specified using ISO 4217
     * standard currency codes. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     */
    private String offeringType;
    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RecurringCharge> recurringCharges;

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     * 
     * @param reservedInstancesId
     *        The ID of the Reserved Instance.
     */

    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     * 
     * @return The ID of the Reserved Instance.
     */

    public String getReservedInstancesId() {
        return this.reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     * 
     * @param reservedInstancesId
     *        The ID of the Reserved Instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstances withReservedInstancesId(String reservedInstancesId) {
        setReservedInstancesId(reservedInstancesId);
        return this;
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * 
     * @param instanceType
     *        The instance type on which the Reserved Instance can be used.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * 
     * @return The instance type on which the Reserved Instance can be used.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * 
     * @param instanceType
     *        The instance type on which the Reserved Instance can be used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceType
     */

    public ReservedInstances withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * 
     * @param instanceType
     *        The instance type on which the Reserved Instance can be used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceType
     */

    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * 
     * @param instanceType
     *        The instance type on which the Reserved Instance can be used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceType
     */

    public ReservedInstances withInstanceType(InstanceType instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the Reserved Instance can be used.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     * 
     * @return The Availability Zone in which the Reserved Instance can be used.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the Reserved Instance can be used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstances withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The date and time the Reserved Instance started.
     * </p>
     * 
     * @param start
     *        The date and time the Reserved Instance started.
     */

    public void setStart(java.util.Date start) {
        this.start = start;
    }

    /**
     * <p>
     * The date and time the Reserved Instance started.
     * </p>
     * 
     * @return The date and time the Reserved Instance started.
     */

    public java.util.Date getStart() {
        return this.start;
    }

    /**
     * <p>
     * The date and time the Reserved Instance started.
     * </p>
     * 
     * @param start
     *        The date and time the Reserved Instance started.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstances withStart(java.util.Date start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * The time when the Reserved Instance expires.
     * </p>
     * 
     * @param end
     *        The time when the Reserved Instance expires.
     */

    public void setEnd(java.util.Date end) {
        this.end = end;
    }

    /**
     * <p>
     * The time when the Reserved Instance expires.
     * </p>
     * 
     * @return The time when the Reserved Instance expires.
     */

    public java.util.Date getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The time when the Reserved Instance expires.
     * </p>
     * 
     * @param end
     *        The time when the Reserved Instance expires.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstances withEnd(java.util.Date end) {
        setEnd(end);
        return this;
    }

    /**
     * <p>
     * The duration of the Reserved Instance, in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the Reserved Instance, in seconds.
     */

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the Reserved Instance, in seconds.
     * </p>
     * 
     * @return The duration of the Reserved Instance, in seconds.
     */

    public Long getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the Reserved Instance, in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the Reserved Instance, in seconds.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstances withDuration(Long duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The usage price of the Reserved Instance, per hour.
     * </p>
     * 
     * @param usagePrice
     *        The usage price of the Reserved Instance, per hour.
     */

    public void setUsagePrice(Float usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The usage price of the Reserved Instance, per hour.
     * </p>
     * 
     * @return The usage price of the Reserved Instance, per hour.
     */

    public Float getUsagePrice() {
        return this.usagePrice;
    }

    /**
     * <p>
     * The usage price of the Reserved Instance, per hour.
     * </p>
     * 
     * @param usagePrice
     *        The usage price of the Reserved Instance, per hour.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstances withUsagePrice(Float usagePrice) {
        setUsagePrice(usagePrice);
        return this;
    }

    /**
     * <p>
     * The purchase price of the Reserved Instance.
     * </p>
     * 
     * @param fixedPrice
     *        The purchase price of the Reserved Instance.
     */

    public void setFixedPrice(Float fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The purchase price of the Reserved Instance.
     * </p>
     * 
     * @return The purchase price of the Reserved Instance.
     */

    public Float getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * <p>
     * The purchase price of the Reserved Instance.
     * </p>
     * 
     * @param fixedPrice
     *        The purchase price of the Reserved Instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstances withFixedPrice(Float fixedPrice) {
        setFixedPrice(fixedPrice);
        return this;
    }

    /**
     * <p>
     * The number of reservations purchased.
     * </p>
     * 
     * @param instanceCount
     *        The number of reservations purchased.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of reservations purchased.
     * </p>
     * 
     * @return The number of reservations purchased.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of reservations purchased.
     * </p>
     * 
     * @param instanceCount
     *        The number of reservations purchased.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstances withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * 
     * @param productDescription
     *        The Reserved Instance product platform description.
     * @see RIProductDescription
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * 
     * @return The Reserved Instance product platform description.
     * @see RIProductDescription
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * 
     * @param productDescription
     *        The Reserved Instance product platform description.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RIProductDescription
     */

    public ReservedInstances withProductDescription(String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * 
     * @param productDescription
     *        The Reserved Instance product platform description.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RIProductDescription
     */

    public void setProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * 
     * @param productDescription
     *        The Reserved Instance product platform description.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RIProductDescription
     */

    public ReservedInstances withProductDescription(
            RIProductDescription productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The state of the Reserved Instance purchase.
     * </p>
     * 
     * @param state
     *        The state of the Reserved Instance purchase.
     * @see ReservedInstanceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Reserved Instance purchase.
     * </p>
     * 
     * @return The state of the Reserved Instance purchase.
     * @see ReservedInstanceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the Reserved Instance purchase.
     * </p>
     * 
     * @param state
     *        The state of the Reserved Instance purchase.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ReservedInstanceState
     */

    public ReservedInstances withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the Reserved Instance purchase.
     * </p>
     * 
     * @param state
     *        The state of the Reserved Instance purchase.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ReservedInstanceState
     */

    public void setState(ReservedInstanceState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the Reserved Instance purchase.
     * </p>
     * 
     * @param state
     *        The state of the Reserved Instance purchase.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ReservedInstanceState
     */

    public ReservedInstances withState(ReservedInstanceState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * 
     * @return Any tags assigned to the resource.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or
     * {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstances withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstances withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy of the instance.
     * @see Tenancy
     */

    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * 
     * @return The tenancy of the instance.
     * @see Tenancy
     */

    public String getInstanceTenancy() {
        return this.instanceTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Tenancy
     */

    public ReservedInstances withInstanceTenancy(String instanceTenancy) {
        setInstanceTenancy(instanceTenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Tenancy
     */

    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Tenancy
     */

    public ReservedInstances withInstanceTenancy(Tenancy instanceTenancy) {
        setInstanceTenancy(instanceTenancy);
        return this;
    }

    /**
     * <p>
     * The currency of the Reserved Instance. It's specified using ISO 4217
     * standard currency codes. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the Reserved Instance. It's specified using ISO
     *        4217 standard currency codes. At this time, the only supported
     *        currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency of the Reserved Instance. It's specified using ISO 4217
     * standard currency codes. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @return The currency of the Reserved Instance. It's specified using ISO
     *         4217 standard currency codes. At this time, the only supported
     *         currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency of the Reserved Instance. It's specified using ISO 4217
     * standard currency codes. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the Reserved Instance. It's specified using ISO
     *        4217 standard currency codes. At this time, the only supported
     *        currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */

    public ReservedInstances withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The currency of the Reserved Instance. It's specified using ISO 4217
     * standard currency codes. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the Reserved Instance. It's specified using ISO
     *        4217 standard currency codes. At this time, the only supported
     *        currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }

    /**
     * <p>
     * The currency of the Reserved Instance. It's specified using ISO 4217
     * standard currency codes. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the Reserved Instance. It's specified using ISO
     *        4217 standard currency codes. At this time, the only supported
     *        currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */

    public ReservedInstances withCurrencyCode(CurrencyCodeValues currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * 
     * @param offeringType
     *        The Reserved Instance offering type.
     * @see OfferingTypeValues
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * 
     * @return The Reserved Instance offering type.
     * @see OfferingTypeValues
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * 
     * @param offeringType
     *        The Reserved Instance offering type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see OfferingTypeValues
     */

    public ReservedInstances withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * 
     * @param offeringType
     *        The Reserved Instance offering type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see OfferingTypeValues
     */

    public void setOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * 
     * @param offeringType
     *        The Reserved Instance offering type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see OfferingTypeValues
     */

    public ReservedInstances withOfferingType(OfferingTypeValues offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     * 
     * @return The recurring charge tag assigned to the resource.
     */

    public java.util.List<RecurringCharge> getRecurringCharges() {
        if (recurringCharges == null) {
            recurringCharges = new com.amazonaws.internal.SdkInternalList<RecurringCharge>();
        }
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charge tag assigned to the resource.
     */

    public void setRecurringCharges(
            java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new com.amazonaws.internal.SdkInternalList<RecurringCharge>(
                recurringCharges);
    }

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRecurringCharges(java.util.Collection)} or
     * {@link #withRecurringCharges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charge tag assigned to the resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstances withRecurringCharges(
            RecurringCharge... recurringCharges) {
        if (this.recurringCharges == null) {
            setRecurringCharges(new com.amazonaws.internal.SdkInternalList<RecurringCharge>(
                    recurringCharges.length));
        }
        for (RecurringCharge ele : recurringCharges) {
            this.recurringCharges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charge tag assigned to the resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReservedInstances withRecurringCharges(
            java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
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
        if (getReservedInstancesId() != null)
            sb.append("ReservedInstancesId: " + getReservedInstancesId() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getStart() != null)
            sb.append("Start: " + getStart() + ",");
        if (getEnd() != null)
            sb.append("End: " + getEnd() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getInstanceTenancy() != null)
            sb.append("InstanceTenancy: " + getInstanceTenancy() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType() + ",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: " + getRecurringCharges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstances == false)
            return false;
        ReservedInstances other = (ReservedInstances) obj;
        if (other.getReservedInstancesId() == null
                ^ this.getReservedInstancesId() == null)
            return false;
        if (other.getReservedInstancesId() != null
                && other.getReservedInstancesId().equals(
                        this.getReservedInstancesId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getAvailabilityZone() == null
                ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(
                        this.getAvailabilityZone()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null
                && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null
                && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null
                && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null
                && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null
                && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getProductDescription() == null
                ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null
                && other.getProductDescription().equals(
                        this.getProductDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null
                && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null
                && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getInstanceTenancy() == null
                ^ this.getInstanceTenancy() == null)
            return false;
        if (other.getInstanceTenancy() != null
                && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null
                && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getRecurringCharges() == null
                ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null
                && other.getRecurringCharges().equals(
                        this.getRecurringCharges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReservedInstancesId() == null) ? 0
                        : getReservedInstancesId().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode
                + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode
                + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode
                + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode
                + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getProductDescription() == null) ? 0
                        : getProductDescription().hashCode());
        hashCode = prime * hashCode
                + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getOfferingType() == null) ? 0 : getOfferingType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRecurringCharges() == null) ? 0 : getRecurringCharges()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstances clone() {
        try {
            return (ReservedInstances) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
