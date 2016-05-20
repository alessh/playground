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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

/**
 * <p>
 * Provides details of the <code>RecordMarker</code> decision.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this decision's access to Amazon
 * SWF resources as follows:
 * </p>
 * 
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit
 * the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to
 * call this action.</li>
 * <li>You cannot use an IAM policy to constrain this action's
 * parameters.</li>
 * 
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the
 * action, or the parameter values fall outside the specified
 * constraints, the action fails. The associated event attribute's
 * <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For
 * details and example IAM policies, see
 * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
 * .
 * </p>
 */
public class RecordMarkerDecisionAttributes implements Serializable, Cloneable {

    /**
     * <b>Required.</b> The name of the marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String markerName;

    /**
     * <i>Optional.</i> details of the marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String details;

    /**
     * <b>Required.</b> The name of the marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <b>Required.</b> The name of the marker.
     */
    public String getMarkerName() {
        return markerName;
    }
    
    /**
     * <b>Required.</b> The name of the marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param markerName <b>Required.</b> The name of the marker.
     */
    public void setMarkerName(String markerName) {
        this.markerName = markerName;
    }
    
    /**
     * <b>Required.</b> The name of the marker.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param markerName <b>Required.</b> The name of the marker.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordMarkerDecisionAttributes withMarkerName(String markerName) {
        this.markerName = markerName;
        return this;
    }

    /**
     * <i>Optional.</i> details of the marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return <i>Optional.</i> details of the marker.
     */
    public String getDetails() {
        return details;
    }
    
    /**
     * <i>Optional.</i> details of the marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details <i>Optional.</i> details of the marker.
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    /**
     * <i>Optional.</i> details of the marker.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param details <i>Optional.</i> details of the marker.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordMarkerDecisionAttributes withDetails(String details) {
        this.details = details;
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
        if (getMarkerName() != null) sb.append("MarkerName: " + getMarkerName() + ",");
        if (getDetails() != null) sb.append("Details: " + getDetails() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarkerName() == null) ? 0 : getMarkerName().hashCode()); 
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RecordMarkerDecisionAttributes == false) return false;
        RecordMarkerDecisionAttributes other = (RecordMarkerDecisionAttributes)obj;
        
        if (other.getMarkerName() == null ^ this.getMarkerName() == null) return false;
        if (other.getMarkerName() != null && other.getMarkerName().equals(this.getMarkerName()) == false) return false; 
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false; 
        return true;
    }
    
    @Override
    public RecordMarkerDecisionAttributes clone() {
        try {
            return (RecordMarkerDecisionAttributes) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    