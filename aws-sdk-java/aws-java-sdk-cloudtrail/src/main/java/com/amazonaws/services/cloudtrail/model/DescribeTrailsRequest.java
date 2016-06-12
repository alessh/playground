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

package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about the trail.
 * </p>
 */
public class DescribeTrailsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Specifies a list of trail names, trail ARNs, or both, of the trails to
     * describe. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>. If
     * an empty list is specified, information for the trail in the current
     * region is returned.
     * </p>
     * <ul>
     * <li>If an empty list is specified and <code>IncludeShadowTrails</code> is
     * false, then information for all trails in the current region is returned.
     * </li>
     * <li>If an empty list is specified and IncludeShadowTrails is null or
     * true, then information for all trails in the current region and any
     * associated shadow trails in other regions is returned.</li>
     * </ul>
     * <note>If one or more trail names are specified, information is returned
     * only if the names match the names of trails belonging only to the current
     * region. To return information about a trail in another region, you must
     * specify its trail ARN.</note>
     */
    private com.amazonaws.internal.SdkInternalList<String> trailNameList;
    /**
     * <p>
     * Specifies whether to include shadow trails in the response. A shadow
     * trail is the replication in a region of a trail that was created in a
     * different region. The default is true.
     * </p>
     */
    private Boolean includeShadowTrails;

    /**
     * <p>
     * Specifies a list of trail names, trail ARNs, or both, of the trails to
     * describe. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>. If
     * an empty list is specified, information for the trail in the current
     * region is returned.
     * </p>
     * <ul>
     * <li>If an empty list is specified and <code>IncludeShadowTrails</code> is
     * false, then information for all trails in the current region is returned.
     * </li>
     * <li>If an empty list is specified and IncludeShadowTrails is null or
     * true, then information for all trails in the current region and any
     * associated shadow trails in other regions is returned.</li>
     * </ul>
     * <note>If one or more trail names are specified, information is returned
     * only if the names match the names of trails belonging only to the current
     * region. To return information about a trail in another region, you must
     * specify its trail ARN.</note>
     * 
     * @return Specifies a list of trail names, trail ARNs, or both, of the
     *         trails to describe. The format of a trail ARN is
     *         <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     *         . If an empty list is specified, information for the trail in the
     *         current region is returned.</p>
     *         <ul>
     *         <li>If an empty list is specified and
     *         <code>IncludeShadowTrails</code> is false, then information for
     *         all trails in the current region is returned.</li>
     *         <li>If an empty list is specified and IncludeShadowTrails is null
     *         or true, then information for all trails in the current region
     *         and any associated shadow trails in other regions is returned.</li>
     *         </ul>
     *         <note>If one or more trail names are specified, information is
     *         returned only if the names match the names of trails belonging
     *         only to the current region. To return information about a trail
     *         in another region, you must specify its trail ARN.
     */

    public java.util.List<String> getTrailNameList() {
        if (trailNameList == null) {
            trailNameList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return trailNameList;
    }

    /**
     * <p>
     * Specifies a list of trail names, trail ARNs, or both, of the trails to
     * describe. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>. If
     * an empty list is specified, information for the trail in the current
     * region is returned.
     * </p>
     * <ul>
     * <li>If an empty list is specified and <code>IncludeShadowTrails</code> is
     * false, then information for all trails in the current region is returned.
     * </li>
     * <li>If an empty list is specified and IncludeShadowTrails is null or
     * true, then information for all trails in the current region and any
     * associated shadow trails in other regions is returned.</li>
     * </ul>
     * <note>If one or more trail names are specified, information is returned
     * only if the names match the names of trails belonging only to the current
     * region. To return information about a trail in another region, you must
     * specify its trail ARN.</note>
     * 
     * @param trailNameList
     *        Specifies a list of trail names, trail ARNs, or both, of the
     *        trails to describe. The format of a trail ARN is
     *        <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     *        . If an empty list is specified, information for the trail in the
     *        current region is returned.</p>
     *        <ul>
     *        <li>If an empty list is specified and
     *        <code>IncludeShadowTrails</code> is false, then information for
     *        all trails in the current region is returned.</li>
     *        <li>If an empty list is specified and IncludeShadowTrails is null
     *        or true, then information for all trails in the current region and
     *        any associated shadow trails in other regions is returned.</li>
     *        </ul>
     *        <note>If one or more trail names are specified, information is
     *        returned only if the names match the names of trails belonging
     *        only to the current region. To return information about a trail in
     *        another region, you must specify its trail ARN.
     */

    public void setTrailNameList(java.util.Collection<String> trailNameList) {
        if (trailNameList == null) {
            this.trailNameList = null;
            return;
        }

        this.trailNameList = new com.amazonaws.internal.SdkInternalList<String>(
                trailNameList);
    }

    /**
     * <p>
     * Specifies a list of trail names, trail ARNs, or both, of the trails to
     * describe. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>. If
     * an empty list is specified, information for the trail in the current
     * region is returned.
     * </p>
     * <ul>
     * <li>If an empty list is specified and <code>IncludeShadowTrails</code> is
     * false, then information for all trails in the current region is returned.
     * </li>
     * <li>If an empty list is specified and IncludeShadowTrails is null or
     * true, then information for all trails in the current region and any
     * associated shadow trails in other regions is returned.</li>
     * </ul>
     * <note>If one or more trail names are specified, information is returned
     * only if the names match the names of trails belonging only to the current
     * region. To return information about a trail in another region, you must
     * specify its trail ARN.</note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTrailNameList(java.util.Collection)} or
     * {@link #withTrailNameList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param trailNameList
     *        Specifies a list of trail names, trail ARNs, or both, of the
     *        trails to describe. The format of a trail ARN is
     *        <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     *        . If an empty list is specified, information for the trail in the
     *        current region is returned.</p>
     *        <ul>
     *        <li>If an empty list is specified and
     *        <code>IncludeShadowTrails</code> is false, then information for
     *        all trails in the current region is returned.</li>
     *        <li>If an empty list is specified and IncludeShadowTrails is null
     *        or true, then information for all trails in the current region and
     *        any associated shadow trails in other regions is returned.</li>
     *        </ul>
     *        <note>If one or more trail names are specified, information is
     *        returned only if the names match the names of trails belonging
     *        only to the current region. To return information about a trail in
     *        another region, you must specify its trail ARN.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTrailsRequest withTrailNameList(String... trailNameList) {
        if (this.trailNameList == null) {
            setTrailNameList(new com.amazonaws.internal.SdkInternalList<String>(
                    trailNameList.length));
        }
        for (String ele : trailNameList) {
            this.trailNameList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a list of trail names, trail ARNs, or both, of the trails to
     * describe. The format of a trail ARN is
     * <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>. If
     * an empty list is specified, information for the trail in the current
     * region is returned.
     * </p>
     * <ul>
     * <li>If an empty list is specified and <code>IncludeShadowTrails</code> is
     * false, then information for all trails in the current region is returned.
     * </li>
     * <li>If an empty list is specified and IncludeShadowTrails is null or
     * true, then information for all trails in the current region and any
     * associated shadow trails in other regions is returned.</li>
     * </ul>
     * <note>If one or more trail names are specified, information is returned
     * only if the names match the names of trails belonging only to the current
     * region. To return information about a trail in another region, you must
     * specify its trail ARN.</note>
     * 
     * @param trailNameList
     *        Specifies a list of trail names, trail ARNs, or both, of the
     *        trails to describe. The format of a trail ARN is
     *        <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     *        . If an empty list is specified, information for the trail in the
     *        current region is returned.</p>
     *        <ul>
     *        <li>If an empty list is specified and
     *        <code>IncludeShadowTrails</code> is false, then information for
     *        all trails in the current region is returned.</li>
     *        <li>If an empty list is specified and IncludeShadowTrails is null
     *        or true, then information for all trails in the current region and
     *        any associated shadow trails in other regions is returned.</li>
     *        </ul>
     *        <note>If one or more trail names are specified, information is
     *        returned only if the names match the names of trails belonging
     *        only to the current region. To return information about a trail in
     *        another region, you must specify its trail ARN.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTrailsRequest withTrailNameList(
            java.util.Collection<String> trailNameList) {
        setTrailNameList(trailNameList);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include shadow trails in the response. A shadow
     * trail is the replication in a region of a trail that was created in a
     * different region. The default is true.
     * </p>
     * 
     * @param includeShadowTrails
     *        Specifies whether to include shadow trails in the response. A
     *        shadow trail is the replication in a region of a trail that was
     *        created in a different region. The default is true.
     */

    public void setIncludeShadowTrails(Boolean includeShadowTrails) {
        this.includeShadowTrails = includeShadowTrails;
    }

    /**
     * <p>
     * Specifies whether to include shadow trails in the response. A shadow
     * trail is the replication in a region of a trail that was created in a
     * different region. The default is true.
     * </p>
     * 
     * @return Specifies whether to include shadow trails in the response. A
     *         shadow trail is the replication in a region of a trail that was
     *         created in a different region. The default is true.
     */

    public Boolean getIncludeShadowTrails() {
        return this.includeShadowTrails;
    }

    /**
     * <p>
     * Specifies whether to include shadow trails in the response. A shadow
     * trail is the replication in a region of a trail that was created in a
     * different region. The default is true.
     * </p>
     * 
     * @param includeShadowTrails
     *        Specifies whether to include shadow trails in the response. A
     *        shadow trail is the replication in a region of a trail that was
     *        created in a different region. The default is true.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTrailsRequest withIncludeShadowTrails(
            Boolean includeShadowTrails) {
        setIncludeShadowTrails(includeShadowTrails);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include shadow trails in the response. A shadow
     * trail is the replication in a region of a trail that was created in a
     * different region. The default is true.
     * </p>
     * 
     * @return Specifies whether to include shadow trails in the response. A
     *         shadow trail is the replication in a region of a trail that was
     *         created in a different region. The default is true.
     */

    public Boolean isIncludeShadowTrails() {
        return this.includeShadowTrails;
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
        if (getTrailNameList() != null)
            sb.append("TrailNameList: " + getTrailNameList() + ",");
        if (getIncludeShadowTrails() != null)
            sb.append("IncludeShadowTrails: " + getIncludeShadowTrails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrailsRequest == false)
            return false;
        DescribeTrailsRequest other = (DescribeTrailsRequest) obj;
        if (other.getTrailNameList() == null ^ this.getTrailNameList() == null)
            return false;
        if (other.getTrailNameList() != null
                && other.getTrailNameList().equals(this.getTrailNameList()) == false)
            return false;
        if (other.getIncludeShadowTrails() == null
                ^ this.getIncludeShadowTrails() == null)
            return false;
        if (other.getIncludeShadowTrails() != null
                && other.getIncludeShadowTrails().equals(
                        this.getIncludeShadowTrails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrailNameList() == null) ? 0 : getTrailNameList()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeShadowTrails() == null) ? 0
                        : getIncludeShadowTrails().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrailsRequest clone() {
        return (DescribeTrailsRequest) super.clone();
    }
}