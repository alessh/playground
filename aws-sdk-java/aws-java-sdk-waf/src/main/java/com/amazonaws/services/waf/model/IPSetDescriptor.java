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
 * Specifies the IP address type (<code>IPV4</code>) and the IP address range
 * (in CIDR format) that web requests originate from.
 * </p>
 */
public class IPSetDescriptor implements Serializable, Cloneable {

    /**
     * <p>
     * Specify <code>IPV4</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Specify an IPv4 address by using CIDR notation. For example:
     * </p>
     * <ul>
     * <li>To configure AWS WAF to allow, block, or count requests that
     * originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.</li>
     * <li>To configure AWS WAF to allow, block, or count requests that
     * originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.</li>
     * </ul>
     * <p>
     * AWS WAF supports only /8, /16, /24, and /32 IP addresses.
     * </p>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
     * Inter-Domain Routing</a>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Specify <code>IPV4</code>.
     * </p>
     * 
     * @param type
     *        Specify <code>IPV4</code>.
     * @see IPSetDescriptorType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specify <code>IPV4</code>.
     * </p>
     * 
     * @return Specify <code>IPV4</code>.
     * @see IPSetDescriptorType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specify <code>IPV4</code>.
     * </p>
     * 
     * @param type
     *        Specify <code>IPV4</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see IPSetDescriptorType
     */

    public IPSetDescriptor withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specify <code>IPV4</code>.
     * </p>
     * 
     * @param type
     *        Specify <code>IPV4</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see IPSetDescriptorType
     */

    public void setType(IPSetDescriptorType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specify <code>IPV4</code>.
     * </p>
     * 
     * @param type
     *        Specify <code>IPV4</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see IPSetDescriptorType
     */

    public IPSetDescriptor withType(IPSetDescriptorType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specify an IPv4 address by using CIDR notation. For example:
     * </p>
     * <ul>
     * <li>To configure AWS WAF to allow, block, or count requests that
     * originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.</li>
     * <li>To configure AWS WAF to allow, block, or count requests that
     * originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.</li>
     * </ul>
     * <p>
     * AWS WAF supports only /8, /16, /24, and /32 IP addresses.
     * </p>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
     * Inter-Domain Routing</a>.
     * </p>
     * 
     * @param value
     *        Specify an IPv4 address by using CIDR notation. For example:</p>
     *        <ul>
     *        <li>To configure AWS WAF to allow, block, or count requests that
     *        originated from the IP address 192.0.2.44, specify
     *        <code>192.0.2.44/32</code>.</li>
     *        <li>To configure AWS WAF to allow, block, or count requests that
     *        originated from IP addresses from 192.0.2.0 to 192.0.2.255,
     *        specify <code>192.0.2.0/24</code>.</li>
     *        </ul>
     *        <p>
     *        AWS WAF supports only /8, /16, /24, and /32 IP addresses.
     *        </p>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry
     *        <a href=
     *        "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
     *        >Classless Inter-Domain Routing</a>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Specify an IPv4 address by using CIDR notation. For example:
     * </p>
     * <ul>
     * <li>To configure AWS WAF to allow, block, or count requests that
     * originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.</li>
     * <li>To configure AWS WAF to allow, block, or count requests that
     * originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.</li>
     * </ul>
     * <p>
     * AWS WAF supports only /8, /16, /24, and /32 IP addresses.
     * </p>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
     * Inter-Domain Routing</a>.
     * </p>
     * 
     * @return Specify an IPv4 address by using CIDR notation. For example:</p>
     *         <ul>
     *         <li>To configure AWS WAF to allow, block, or count requests that
     *         originated from the IP address 192.0.2.44, specify
     *         <code>192.0.2.44/32</code>.</li>
     *         <li>To configure AWS WAF to allow, block, or count requests that
     *         originated from IP addresses from 192.0.2.0 to 192.0.2.255,
     *         specify <code>192.0.2.0/24</code>.</li>
     *         </ul>
     *         <p>
     *         AWS WAF supports only /8, /16, /24, and /32 IP addresses.
     *         </p>
     *         <p>
     *         For more information about CIDR notation, see the Wikipedia entry
     *         <a href=
     *         "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
     *         >Classless Inter-Domain Routing</a>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Specify an IPv4 address by using CIDR notation. For example:
     * </p>
     * <ul>
     * <li>To configure AWS WAF to allow, block, or count requests that
     * originated from the IP address 192.0.2.44, specify
     * <code>192.0.2.44/32</code>.</li>
     * <li>To configure AWS WAF to allow, block, or count requests that
     * originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.</li>
     * </ul>
     * <p>
     * AWS WAF supports only /8, /16, /24, and /32 IP addresses.
     * </p>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
     * Inter-Domain Routing</a>.
     * </p>
     * 
     * @param value
     *        Specify an IPv4 address by using CIDR notation. For example:</p>
     *        <ul>
     *        <li>To configure AWS WAF to allow, block, or count requests that
     *        originated from the IP address 192.0.2.44, specify
     *        <code>192.0.2.44/32</code>.</li>
     *        <li>To configure AWS WAF to allow, block, or count requests that
     *        originated from IP addresses from 192.0.2.0 to 192.0.2.255,
     *        specify <code>192.0.2.0/24</code>.</li>
     *        </ul>
     *        <p>
     *        AWS WAF supports only /8, /16, /24, and /32 IP addresses.
     *        </p>
     *        <p>
     *        For more information about CIDR notation, see the Wikipedia entry
     *        <a href=
     *        "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
     *        >Classless Inter-Domain Routing</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public IPSetDescriptor withValue(String value) {
        setValue(value);
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPSetDescriptor == false)
            return false;
        IPSetDescriptor other = (IPSetDescriptor) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null
                && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null
                && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public IPSetDescriptor clone() {
        try {
            return (IPSetDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
