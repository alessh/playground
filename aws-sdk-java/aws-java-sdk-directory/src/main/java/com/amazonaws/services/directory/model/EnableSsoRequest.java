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

package com.amazonaws.services.directory.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>EnableSso</a> operation.
 * </p>
 */
public class EnableSsoRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory for which to enable single-sign on.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The username of an alternate account to use to enable single-sign on.
     * This is only used for AD Connector directories. This account must have
     * privileges to add a service principal name.
     * </p>
     * <p>
     * If the AD Connector service account does not have privileges to add a
     * service principal name, you can specify an alternate account with the
     * <i>UserName</i> and <i>Password</i> parameters. These credentials are
     * only used to enable single sign-on and are not stored by the service. The
     * AD Connector service account is not changed.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The password of an alternate account to use to enable single-sign on.
     * This is only used for AD Connector directories. For more information, see
     * the <i>UserName</i> parameter.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The identifier of the directory for which to enable single-sign on.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which to enable single-sign
     *        on.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which to enable single-sign on.
     * </p>
     * 
     * @return The identifier of the directory for which to enable single-sign
     *         on.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which to enable single-sign on.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which to enable single-sign
     *        on.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EnableSsoRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The username of an alternate account to use to enable single-sign on.
     * This is only used for AD Connector directories. This account must have
     * privileges to add a service principal name.
     * </p>
     * <p>
     * If the AD Connector service account does not have privileges to add a
     * service principal name, you can specify an alternate account with the
     * <i>UserName</i> and <i>Password</i> parameters. These credentials are
     * only used to enable single sign-on and are not stored by the service. The
     * AD Connector service account is not changed.
     * </p>
     * 
     * @param userName
     *        The username of an alternate account to use to enable single-sign
     *        on. This is only used for AD Connector directories. This account
     *        must have privileges to add a service principal name. </p>
     *        <p>
     *        If the AD Connector service account does not have privileges to
     *        add a service principal name, you can specify an alternate account
     *        with the <i>UserName</i> and <i>Password</i> parameters. These
     *        credentials are only used to enable single sign-on and are not
     *        stored by the service. The AD Connector service account is not
     *        changed.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The username of an alternate account to use to enable single-sign on.
     * This is only used for AD Connector directories. This account must have
     * privileges to add a service principal name.
     * </p>
     * <p>
     * If the AD Connector service account does not have privileges to add a
     * service principal name, you can specify an alternate account with the
     * <i>UserName</i> and <i>Password</i> parameters. These credentials are
     * only used to enable single sign-on and are not stored by the service. The
     * AD Connector service account is not changed.
     * </p>
     * 
     * @return The username of an alternate account to use to enable single-sign
     *         on. This is only used for AD Connector directories. This account
     *         must have privileges to add a service principal name. </p>
     *         <p>
     *         If the AD Connector service account does not have privileges to
     *         add a service principal name, you can specify an alternate
     *         account with the <i>UserName</i> and <i>Password</i> parameters.
     *         These credentials are only used to enable single sign-on and are
     *         not stored by the service. The AD Connector service account is
     *         not changed.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The username of an alternate account to use to enable single-sign on.
     * This is only used for AD Connector directories. This account must have
     * privileges to add a service principal name.
     * </p>
     * <p>
     * If the AD Connector service account does not have privileges to add a
     * service principal name, you can specify an alternate account with the
     * <i>UserName</i> and <i>Password</i> parameters. These credentials are
     * only used to enable single sign-on and are not stored by the service. The
     * AD Connector service account is not changed.
     * </p>
     * 
     * @param userName
     *        The username of an alternate account to use to enable single-sign
     *        on. This is only used for AD Connector directories. This account
     *        must have privileges to add a service principal name. </p>
     *        <p>
     *        If the AD Connector service account does not have privileges to
     *        add a service principal name, you can specify an alternate account
     *        with the <i>UserName</i> and <i>Password</i> parameters. These
     *        credentials are only used to enable single sign-on and are not
     *        stored by the service. The AD Connector service account is not
     *        changed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EnableSsoRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The password of an alternate account to use to enable single-sign on.
     * This is only used for AD Connector directories. For more information, see
     * the <i>UserName</i> parameter.
     * </p>
     * 
     * @param password
     *        The password of an alternate account to use to enable single-sign
     *        on. This is only used for AD Connector directories. For more
     *        information, see the <i>UserName</i> parameter.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password of an alternate account to use to enable single-sign on.
     * This is only used for AD Connector directories. For more information, see
     * the <i>UserName</i> parameter.
     * </p>
     * 
     * @return The password of an alternate account to use to enable single-sign
     *         on. This is only used for AD Connector directories. For more
     *         information, see the <i>UserName</i> parameter.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password of an alternate account to use to enable single-sign on.
     * This is only used for AD Connector directories. For more information, see
     * the <i>UserName</i> parameter.
     * </p>
     * 
     * @param password
     *        The password of an alternate account to use to enable single-sign
     *        on. This is only used for AD Connector directories. For more
     *        information, see the <i>UserName</i> parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EnableSsoRequest withPassword(String password) {
        setPassword(password);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableSsoRequest == false)
            return false;
        EnableSsoRequest other = (EnableSsoRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null
                && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null
                && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null
                && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode
                + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public EnableSsoRequest clone() {
        return (EnableSsoRequest) super.clone();
    }
}