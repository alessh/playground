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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * The result of a <code>DeleteAnalysisScheme</code> request. Contains
 * the status of the deleted analysis scheme.
 * </p>
 */
public class DeleteAnalysisSchemeResult implements Serializable, Cloneable {

    /**
     * The status of the analysis scheme being deleted.
     */
    private AnalysisSchemeStatus analysisScheme;

    /**
     * The status of the analysis scheme being deleted.
     *
     * @return The status of the analysis scheme being deleted.
     */
    public AnalysisSchemeStatus getAnalysisScheme() {
        return analysisScheme;
    }
    
    /**
     * The status of the analysis scheme being deleted.
     *
     * @param analysisScheme The status of the analysis scheme being deleted.
     */
    public void setAnalysisScheme(AnalysisSchemeStatus analysisScheme) {
        this.analysisScheme = analysisScheme;
    }
    
    /**
     * The status of the analysis scheme being deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param analysisScheme The status of the analysis scheme being deleted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteAnalysisSchemeResult withAnalysisScheme(AnalysisSchemeStatus analysisScheme) {
        this.analysisScheme = analysisScheme;
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
        if (getAnalysisScheme() != null) sb.append("AnalysisScheme: " + getAnalysisScheme() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAnalysisScheme() == null) ? 0 : getAnalysisScheme().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteAnalysisSchemeResult == false) return false;
        DeleteAnalysisSchemeResult other = (DeleteAnalysisSchemeResult)obj;
        
        if (other.getAnalysisScheme() == null ^ this.getAnalysisScheme() == null) return false;
        if (other.getAnalysisScheme() != null && other.getAnalysisScheme().equals(this.getAnalysisScheme()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteAnalysisSchemeResult clone() {
        try {
            return (DeleteAnalysisSchemeResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    