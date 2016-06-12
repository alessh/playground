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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Contains status information for a DB cluster option group.
 * </p>
 */
public class DBClusterOptionGroupStatus implements Serializable, Cloneable {

    /**
     * Specifies the name of the DB cluster option group.
     */
    private String dBClusterOptionGroupName;

    /**
     * Specifies the status of the DB cluster option group.
     */
    private String status;

    /**
     * Specifies the name of the DB cluster option group.
     *
     * @return Specifies the name of the DB cluster option group.
     */
    public String getDBClusterOptionGroupName() {
        return dBClusterOptionGroupName;
    }
    
    /**
     * Specifies the name of the DB cluster option group.
     *
     * @param dBClusterOptionGroupName Specifies the name of the DB cluster option group.
     */
    public void setDBClusterOptionGroupName(String dBClusterOptionGroupName) {
        this.dBClusterOptionGroupName = dBClusterOptionGroupName;
    }
    
    /**
     * Specifies the name of the DB cluster option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterOptionGroupName Specifies the name of the DB cluster option group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterOptionGroupStatus withDBClusterOptionGroupName(String dBClusterOptionGroupName) {
        this.dBClusterOptionGroupName = dBClusterOptionGroupName;
        return this;
    }

    /**
     * Specifies the status of the DB cluster option group.
     *
     * @return Specifies the status of the DB cluster option group.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Specifies the status of the DB cluster option group.
     *
     * @param status Specifies the status of the DB cluster option group.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Specifies the status of the DB cluster option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Specifies the status of the DB cluster option group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterOptionGroupStatus withStatus(String status) {
        this.status = status;
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
        if (getDBClusterOptionGroupName() != null) sb.append("DBClusterOptionGroupName: " + getDBClusterOptionGroupName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBClusterOptionGroupName() == null) ? 0 : getDBClusterOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DBClusterOptionGroupStatus == false) return false;
        DBClusterOptionGroupStatus other = (DBClusterOptionGroupStatus)obj;
        
        if (other.getDBClusterOptionGroupName() == null ^ this.getDBClusterOptionGroupName() == null) return false;
        if (other.getDBClusterOptionGroupName() != null && other.getDBClusterOptionGroupName().equals(this.getDBClusterOptionGroupName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
    @Override
    public DBClusterOptionGroupStatus clone() {
        try {
            return (DBClusterOptionGroupStatus) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    