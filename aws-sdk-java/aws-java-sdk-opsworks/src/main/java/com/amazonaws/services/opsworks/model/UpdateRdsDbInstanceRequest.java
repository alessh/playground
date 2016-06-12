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

package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateRdsDbInstanceRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon RDS instance's ARN.
     * </p>
     */
    private String rdsDbInstanceArn;
    /**
     * <p>
     * The master user name.
     * </p>
     */
    private String dbUser;
    /**
     * <p>
     * The database password.
     * </p>
     */
    private String dbPassword;

    /**
     * <p>
     * The Amazon RDS instance's ARN.
     * </p>
     * 
     * @param rdsDbInstanceArn
     *        The Amazon RDS instance's ARN.
     */

    public void setRdsDbInstanceArn(String rdsDbInstanceArn) {
        this.rdsDbInstanceArn = rdsDbInstanceArn;
    }

    /**
     * <p>
     * The Amazon RDS instance's ARN.
     * </p>
     * 
     * @return The Amazon RDS instance's ARN.
     */

    public String getRdsDbInstanceArn() {
        return this.rdsDbInstanceArn;
    }

    /**
     * <p>
     * The Amazon RDS instance's ARN.
     * </p>
     * 
     * @param rdsDbInstanceArn
     *        The Amazon RDS instance's ARN.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateRdsDbInstanceRequest withRdsDbInstanceArn(
            String rdsDbInstanceArn) {
        setRdsDbInstanceArn(rdsDbInstanceArn);
        return this;
    }

    /**
     * <p>
     * The master user name.
     * </p>
     * 
     * @param dbUser
     *        The master user name.
     */

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * <p>
     * The master user name.
     * </p>
     * 
     * @return The master user name.
     */

    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * <p>
     * The master user name.
     * </p>
     * 
     * @param dbUser
     *        The master user name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateRdsDbInstanceRequest withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * <p>
     * The database password.
     * </p>
     * 
     * @param dbPassword
     *        The database password.
     */

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    /**
     * <p>
     * The database password.
     * </p>
     * 
     * @return The database password.
     */

    public String getDbPassword() {
        return this.dbPassword;
    }

    /**
     * <p>
     * The database password.
     * </p>
     * 
     * @param dbPassword
     *        The database password.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateRdsDbInstanceRequest withDbPassword(String dbPassword) {
        setDbPassword(dbPassword);
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
        if (getRdsDbInstanceArn() != null)
            sb.append("RdsDbInstanceArn: " + getRdsDbInstanceArn() + ",");
        if (getDbUser() != null)
            sb.append("DbUser: " + getDbUser() + ",");
        if (getDbPassword() != null)
            sb.append("DbPassword: " + getDbPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRdsDbInstanceRequest == false)
            return false;
        UpdateRdsDbInstanceRequest other = (UpdateRdsDbInstanceRequest) obj;
        if (other.getRdsDbInstanceArn() == null
                ^ this.getRdsDbInstanceArn() == null)
            return false;
        if (other.getRdsDbInstanceArn() != null
                && other.getRdsDbInstanceArn().equals(
                        this.getRdsDbInstanceArn()) == false)
            return false;
        if (other.getDbUser() == null ^ this.getDbUser() == null)
            return false;
        if (other.getDbUser() != null
                && other.getDbUser().equals(this.getDbUser()) == false)
            return false;
        if (other.getDbPassword() == null ^ this.getDbPassword() == null)
            return false;
        if (other.getDbPassword() != null
                && other.getDbPassword().equals(this.getDbPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRdsDbInstanceArn() == null) ? 0 : getRdsDbInstanceArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDbUser() == null) ? 0 : getDbUser().hashCode());
        hashCode = prime * hashCode
                + ((getDbPassword() == null) ? 0 : getDbPassword().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRdsDbInstanceRequest clone() {
        return (UpdateRdsDbInstanceRequest) super.clone();
    }
}