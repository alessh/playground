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

package com.amazonaws.services.waf.model;

import java.io.Serializable;

/**
 * <p>
 * Contains one or more IP addresses or blocks of IP addresses specified in
 * Classless Inter-Domain Routing (CIDR) notation. To specify an individual IP
 * address, you specify the four-part IP address followed by a <code>/32</code>,
 * for example, 192.0.2.0/31. To block a range of IP addresses, you can specify
 * a <code>/24</code>, a <code>/16</code>, or a <code>/8</code> CIDR. For more
 * information about CIDR notation, perform an Internet search on
 * <code>cidr notation</code>.
 * </p>
 */
public class IPSet implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>IPSetId</code> for an <code>IPSet</code>. You use
     * <code>IPSetId</code> to get information about an <code>IPSet</code> (see
     * <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>),
     * insert an <code>IPSet</code> into a <code>Rule</code> or delete one from
     * a <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     * <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     * </p>
     * <p>
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     */
    private String iPSetId;
    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the
     * name of an <code>IPSet</code> after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The IP address type (<code>IPV4</code>) and the IP address range (in CIDR
     * notation) that web requests originate from. If the <code>WebACL</code> is
     * associated with a CloudFront distribution, this is the value of one of
     * the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li><code>c-ip</code>, if the viewer did not use an HTTP proxy or a load
     * balancer to send the request</li>
     * <li><code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or
     * a load balancer to send the request</li>
     * </ul>
     */
    private java.util.List<IPSetDescriptor> iPSetDescriptors;

    /**
     * <p>
     * The <code>IPSetId</code> for an <code>IPSet</code>. You use
     * <code>IPSetId</code> to get information about an <code>IPSet</code> (see
     * <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>),
     * insert an <code>IPSet</code> into a <code>Rule</code> or delete one from
     * a <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     * <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     * </p>
     * <p>
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     * 
     * @param iPSetId
     *        The <code>IPSetId</code> for an <code>IPSet</code>. You use
     *        <code>IPSetId</code> to get information about an
     *        <code>IPSet</code> (see <a>GetIPSet</a>), update an
     *        <code>IPSet</code> (see <a>UpdateIPSet</a>), insert an
     *        <code>IPSet</code> into a <code>Rule</code> or delete one from a
     *        <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     *        <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).</p>
     *        <p>
     *        <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     *        <a>ListIPSets</a>.
     */

    public void setIPSetId(String iPSetId) {
        this.iPSetId = iPSetId;
    }

    /**
     * <p>
     * The <code>IPSetId</code> for an <code>IPSet</code>. You use
     * <code>IPSetId</code> to get information about an <code>IPSet</code> (see
     * <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>),
     * insert an <code>IPSet</code> into a <code>Rule</code> or delete one from
     * a <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     * <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     * </p>
     * <p>
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     * 
     * @return The <code>IPSetId</code> for an <code>IPSet</code>. You use
     *         <code>IPSetId</code> to get information about an
     *         <code>IPSet</code> (see <a>GetIPSet</a>), update an
     *         <code>IPSet</code> (see <a>UpdateIPSet</a>), insert an
     *         <code>IPSet</code> into a <code>Rule</code> or delete one from a
     *         <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     *         <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).</p>
     *         <p>
     *         <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     *         <a>ListIPSets</a>.
     */

    public String getIPSetId() {
        return this.iPSetId;
    }

    /**
     * <p>
     * The <code>IPSetId</code> for an <code>IPSet</code>. You use
     * <code>IPSetId</code> to get information about an <code>IPSet</code> (see
     * <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>),
     * insert an <code>IPSet</code> into a <code>Rule</code> or delete one from
     * a <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     * <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     * </p>
     * <p>
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     * 
     * @param iPSetId
     *        The <code>IPSetId</code> for an <code>IPSet</code>. You use
     *        <code>IPSetId</code> to get information about an
     *        <code>IPSet</code> (see <a>GetIPSet</a>), update an
     *        <code>IPSet</code> (see <a>UpdateIPSet</a>), insert an
     *        <code>IPSet</code> into a <code>Rule</code> or delete one from a
     *        <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     *        <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).</p>
     *        <p>
     *        <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     *        <a>ListIPSets</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public IPSet withIPSetId(String iPSetId) {
        setIPSetId(iPSetId);
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the
     * name of an <code>IPSet</code> after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>IPSet</a>. You can't
     *        change the name of an <code>IPSet</code> after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the
     * name of an <code>IPSet</code> after you create it.
     * </p>
     * 
     * @return A friendly name or description of the <a>IPSet</a>. You can't
     *         change the name of an <code>IPSet</code> after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the
     * name of an <code>IPSet</code> after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>IPSet</a>. You can't
     *        change the name of an <code>IPSet</code> after you create it.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public IPSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code>) and the IP address range (in CIDR
     * notation) that web requests originate from. If the <code>WebACL</code> is
     * associated with a CloudFront distribution, this is the value of one of
     * the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li><code>c-ip</code>, if the viewer did not use an HTTP proxy or a load
     * balancer to send the request</li>
     * <li><code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or
     * a load balancer to send the request</li>
     * </ul>
     * 
     * @return The IP address type (<code>IPV4</code>) and the IP address range
     *         (in CIDR notation) that web requests originate from. If the
     *         <code>WebACL</code> is associated with a CloudFront distribution,
     *         this is the value of one of the following fields in CloudFront
     *         access logs:</p>
     *         <ul>
     *         <li><code>c-ip</code>, if the viewer did not use an HTTP proxy or
     *         a load balancer to send the request</li>
     *         <li><code>x-forwarded-for</code>, if the viewer did use an HTTP
     *         proxy or a load balancer to send the request</li>
     */

    public java.util.List<IPSetDescriptor> getIPSetDescriptors() {
        return iPSetDescriptors;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code>) and the IP address range (in CIDR
     * notation) that web requests originate from. If the <code>WebACL</code> is
     * associated with a CloudFront distribution, this is the value of one of
     * the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li><code>c-ip</code>, if the viewer did not use an HTTP proxy or a load
     * balancer to send the request</li>
     * <li><code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or
     * a load balancer to send the request</li>
     * </ul>
     * 
     * @param iPSetDescriptors
     *        The IP address type (<code>IPV4</code>) and the IP address range
     *        (in CIDR notation) that web requests originate from. If the
     *        <code>WebACL</code> is associated with a CloudFront distribution,
     *        this is the value of one of the following fields in CloudFront
     *        access logs:</p>
     *        <ul>
     *        <li><code>c-ip</code>, if the viewer did not use an HTTP proxy or
     *        a load balancer to send the request</li>
     *        <li><code>x-forwarded-for</code>, if the viewer did use an HTTP
     *        proxy or a load balancer to send the request</li>
     */

    public void setIPSetDescriptors(
            java.util.Collection<IPSetDescriptor> iPSetDescriptors) {
        if (iPSetDescriptors == null) {
            this.iPSetDescriptors = null;
            return;
        }

        this.iPSetDescriptors = new java.util.ArrayList<IPSetDescriptor>(
                iPSetDescriptors);
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code>) and the IP address range (in CIDR
     * notation) that web requests originate from. If the <code>WebACL</code> is
     * associated with a CloudFront distribution, this is the value of one of
     * the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li><code>c-ip</code>, if the viewer did not use an HTTP proxy or a load
     * balancer to send the request</li>
     * <li><code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or
     * a load balancer to send the request</li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setIPSetDescriptors(java.util.Collection)} or
     * {@link #withIPSetDescriptors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param iPSetDescriptors
     *        The IP address type (<code>IPV4</code>) and the IP address range
     *        (in CIDR notation) that web requests originate from. If the
     *        <code>WebACL</code> is associated with a CloudFront distribution,
     *        this is the value of one of the following fields in CloudFront
     *        access logs:</p>
     *        <ul>
     *        <li><code>c-ip</code>, if the viewer did not use an HTTP proxy or
     *        a load balancer to send the request</li>
     *        <li><code>x-forwarded-for</code>, if the viewer did use an HTTP
     *        proxy or a load balancer to send the request</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public IPSet withIPSetDescriptors(IPSetDescriptor... iPSetDescriptors) {
        if (this.iPSetDescriptors == null) {
            setIPSetDescriptors(new java.util.ArrayList<IPSetDescriptor>(
                    iPSetDescriptors.length));
        }
        for (IPSetDescriptor ele : iPSetDescriptors) {
            this.iPSetDescriptors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code>) and the IP address range (in CIDR
     * notation) that web requests originate from. If the <code>WebACL</code> is
     * associated with a CloudFront distribution, this is the value of one of
     * the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li><code>c-ip</code>, if the viewer did not use an HTTP proxy or a load
     * balancer to send the request</li>
     * <li><code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or
     * a load balancer to send the request</li>
     * </ul>
     * 
     * @param iPSetDescriptors
     *        The IP address type (<code>IPV4</code>) and the IP address range
     *        (in CIDR notation) that web requests originate from. If the
     *        <code>WebACL</code> is associated with a CloudFront distribution,
     *        this is the value of one of the following fields in CloudFront
     *        access logs:</p>
     *        <ul>
     *        <li><code>c-ip</code>, if the viewer did not use an HTTP proxy or
     *        a load balancer to send the request</li>
     *        <li><code>x-forwarded-for</code>, if the viewer did use an HTTP
     *        proxy or a load balancer to send the request</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public IPSet withIPSetDescriptors(
            java.util.Collection<IPSetDescriptor> iPSetDescriptors) {
        setIPSetDescriptors(iPSetDescriptors);
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
        if (getIPSetId() != null)
            sb.append("IPSetId: " + getIPSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getIPSetDescriptors() != null)
            sb.append("IPSetDescriptors: " + getIPSetDescriptors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPSet == false)
            return false;
        IPSet other = (IPSet) obj;
        if (other.getIPSetId() == null ^ this.getIPSetId() == null)
            return false;
        if (other.getIPSetId() != null
                && other.getIPSetId().equals(this.getIPSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIPSetDescriptors() == null
                ^ this.getIPSetDescriptors() == null)
            return false;
        if (other.getIPSetDescriptors() != null
                && other.getIPSetDescriptors().equals(
                        this.getIPSetDescriptors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIPSetId() == null) ? 0 : getIPSetId().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getIPSetDescriptors() == null) ? 0 : getIPSetDescriptors()
                        .hashCode());
        return hashCode;
    }

    @Override
    public IPSet clone() {
        try {
            return (IPSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
