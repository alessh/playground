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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the Amazon Glacier response to the
 * <code>GetDataRetrievalPolicy</code> request.
 * </p>
 */
public class GetDataRetrievalPolicyResult implements Serializable, Cloneable {

    /**
     * Contains the returned data retrieval policy in JSON format.
     */
    private DataRetrievalPolicy policy;

    /**
     * Contains the returned data retrieval policy in JSON format.
     *
     * @return Contains the returned data retrieval policy in JSON format.
     */
    public DataRetrievalPolicy getPolicy() {
        return policy;
    }
    
    /**
     * Contains the returned data retrieval policy in JSON format.
     *
     * @param policy Contains the returned data retrieval policy in JSON format.
     */
    public void setPolicy(DataRetrievalPolicy policy) {
        this.policy = policy;
    }
    
    /**
     * Contains the returned data retrieval policy in JSON format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policy Contains the returned data retrieval policy in JSON format.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetDataRetrievalPolicyResult withPolicy(DataRetrievalPolicy policy) {
        this.policy = policy;
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
        if (getPolicy() != null) sb.append("Policy: " + getPolicy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetDataRetrievalPolicyResult == false) return false;
        GetDataRetrievalPolicyResult other = (GetDataRetrievalPolicyResult)obj;
        
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        return true;
    }
    
    @Override
    public GetDataRetrievalPolicyResult clone() {
        try {
            return (GetDataRetrievalPolicyResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    