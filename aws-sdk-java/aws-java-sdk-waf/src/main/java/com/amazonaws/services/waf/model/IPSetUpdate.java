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
 * Specifies the type of update to perform to an <a>IPSet</a> with
 * <a>UpdateIPSet</a>.
 * </p>
 */
public class IPSetUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether to insert or delete an IP address with
     * <a>UpdateIPSet</a>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The IP address type (<code>IPV4</code>) and the IP address range (in CIDR
     * notation) that web requests originate from.
     * </p>
     */
    private IPSetDescriptor iPSetDescriptor;

    /**
     * <p>
     * Specifies whether to insert or delete an IP address with
     * <a>UpdateIPSet</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete an IP address with
     *        <a>UpdateIPSet</a>.
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete an IP address with
     * <a>UpdateIPSet</a>.
     * </p>
     * 
     * @return Specifies whether to insert or delete an IP address with
     *         <a>UpdateIPSet</a>.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete an IP address with
     * <a>UpdateIPSet</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete an IP address with
     *        <a>UpdateIPSet</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */

    public IPSetUpdate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies whether to insert or delete an IP address with
     * <a>UpdateIPSet</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete an IP address with
     *        <a>UpdateIPSet</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */

    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * Specifies whether to insert or delete an IP address with
     * <a>UpdateIPSet</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete an IP address with
     *        <a>UpdateIPSet</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */

    public IPSetUpdate withAction(ChangeAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code>) and the IP address range (in CIDR
     * notation) that web requests originate from.
     * </p>
     * 
     * @param iPSetDescriptor
     *        The IP address type (<code>IPV4</code>) and the IP address range
     *        (in CIDR notation) that web requests originate from.
     */

    public void setIPSetDescriptor(IPSetDescriptor iPSetDescriptor) {
        this.iPSetDescriptor = iPSetDescriptor;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code>) and the IP address range (in CIDR
     * notation) that web requests originate from.
     * </p>
     * 
     * @return The IP address type (<code>IPV4</code>) and the IP address range
     *         (in CIDR notation) that web requests originate from.
     */

    public IPSetDescriptor getIPSetDescriptor() {
        return this.iPSetDescriptor;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code>) and the IP address range (in CIDR
     * notation) that web requests originate from.
     * </p>
     * 
     * @param iPSetDescriptor
     *        The IP address type (<code>IPV4</code>) and the IP address range
     *        (in CIDR notation) that web requests originate from.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public IPSetUpdate withIPSetDescriptor(IPSetDescriptor iPSetDescriptor) {
        setIPSetDescriptor(iPSetDescriptor);
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getIPSetDescriptor() != null)
            sb.append("IPSetDescriptor: " + getIPSetDescriptor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPSetUpdate == false)
            return false;
        IPSetUpdate other = (IPSetUpdate) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null
                && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getIPSetDescriptor() == null
                ^ this.getIPSetDescriptor() == null)
            return false;
        if (other.getIPSetDescriptor() != null
                && other.getIPSetDescriptor().equals(this.getIPSetDescriptor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime
                * hashCode
                + ((getIPSetDescriptor() == null) ? 0 : getIPSetDescriptor()
                        .hashCode());
        return hashCode;
    }

    @Override
    public IPSetUpdate clone() {
        try {
            return (IPSetUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
