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
 * Data retrieval policy.
 * </p>
 */
public class DataRetrievalPolicy implements Serializable, Cloneable {

    /**
     * The policy rule. Although this is a list type, currently there must be
     * only one rule, which contains a Strategy field and optionally a
     * BytesPerHour field.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DataRetrievalRule> rules;

    /**
     * The policy rule. Although this is a list type, currently there must be
     * only one rule, which contains a Strategy field and optionally a
     * BytesPerHour field.
     *
     * @return The policy rule. Although this is a list type, currently there must be
     *         only one rule, which contains a Strategy field and optionally a
     *         BytesPerHour field.
     */
    public java.util.List<DataRetrievalRule> getRules() {
        if (rules == null) {
              rules = new com.amazonaws.internal.ListWithAutoConstructFlag<DataRetrievalRule>();
              rules.setAutoConstruct(true);
        }
        return rules;
    }
    
    /**
     * The policy rule. Although this is a list type, currently there must be
     * only one rule, which contains a Strategy field and optionally a
     * BytesPerHour field.
     *
     * @param rules The policy rule. Although this is a list type, currently there must be
     *         only one rule, which contains a Strategy field and optionally a
     *         BytesPerHour field.
     */
    public void setRules(java.util.Collection<DataRetrievalRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DataRetrievalRule> rulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DataRetrievalRule>(rules.size());
        rulesCopy.addAll(rules);
        this.rules = rulesCopy;
    }
    
    /**
     * The policy rule. Although this is a list type, currently there must be
     * only one rule, which contains a Strategy field and optionally a
     * BytesPerHour field.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRules(java.util.Collection)} or {@link
     * #withRules(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rules The policy rule. Although this is a list type, currently there must be
     *         only one rule, which contains a Strategy field and optionally a
     *         BytesPerHour field.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DataRetrievalPolicy withRules(DataRetrievalRule... rules) {
        if (getRules() == null) setRules(new java.util.ArrayList<DataRetrievalRule>(rules.length));
        for (DataRetrievalRule value : rules) {
            getRules().add(value);
        }
        return this;
    }
    
    /**
     * The policy rule. Although this is a list type, currently there must be
     * only one rule, which contains a Strategy field and optionally a
     * BytesPerHour field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rules The policy rule. Although this is a list type, currently there must be
     *         only one rule, which contains a Strategy field and optionally a
     *         BytesPerHour field.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DataRetrievalPolicy withRules(java.util.Collection<DataRetrievalRule> rules) {
        if (rules == null) {
            this.rules = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DataRetrievalRule> rulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DataRetrievalRule>(rules.size());
            rulesCopy.addAll(rules);
            this.rules = rulesCopy;
        }

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
        if (getRules() != null) sb.append("Rules: " + getRules() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DataRetrievalPolicy == false) return false;
        DataRetrievalPolicy other = (DataRetrievalPolicy)obj;
        
        if (other.getRules() == null ^ this.getRules() == null) return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false) return false; 
        return true;
    }
    
    @Override
    public DataRetrievalPolicy clone() {
        try {
            return (DataRetrievalPolicy) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    