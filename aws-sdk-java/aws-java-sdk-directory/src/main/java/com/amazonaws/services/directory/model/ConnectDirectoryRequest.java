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
 * Contains the inputs for the <a>ConnectDirectory</a> operation.
 * </p>
 */
public class ConnectDirectoryRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The fully-qualified name of the on-premises directory, such as
     * <code>corp.example.com</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The NetBIOS name of the on-premises directory, such as <code>CORP</code>.
     * </p>
     */
    private String shortName;
    /**
     * <p>
     * The password for the on-premises user account.
     * </p>
     */
    private String password;
    /**
     * <p>
     * A textual description for the directory.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The size of the directory.
     * </p>
     */
    private String size;
    /**
     * <p>
     * A <a>DirectoryConnectSettings</a> object that contains additional
     * information for the operation.
     * </p>
     */
    private DirectoryConnectSettings connectSettings;

    /**
     * <p>
     * The fully-qualified name of the on-premises directory, such as
     * <code>corp.example.com</code>.
     * </p>
     * 
     * @param name
     *        The fully-qualified name of the on-premises directory, such as
     *        <code>corp.example.com</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The fully-qualified name of the on-premises directory, such as
     * <code>corp.example.com</code>.
     * </p>
     * 
     * @return The fully-qualified name of the on-premises directory, such as
     *         <code>corp.example.com</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The fully-qualified name of the on-premises directory, such as
     * <code>corp.example.com</code>.
     * </p>
     * 
     * @param name
     *        The fully-qualified name of the on-premises directory, such as
     *        <code>corp.example.com</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ConnectDirectoryRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The NetBIOS name of the on-premises directory, such as <code>CORP</code>.
     * </p>
     * 
     * @param shortName
     *        The NetBIOS name of the on-premises directory, such as
     *        <code>CORP</code>.
     */

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * <p>
     * The NetBIOS name of the on-premises directory, such as <code>CORP</code>.
     * </p>
     * 
     * @return The NetBIOS name of the on-premises directory, such as
     *         <code>CORP</code>.
     */

    public String getShortName() {
        return this.shortName;
    }

    /**
     * <p>
     * The NetBIOS name of the on-premises directory, such as <code>CORP</code>.
     * </p>
     * 
     * @param shortName
     *        The NetBIOS name of the on-premises directory, such as
     *        <code>CORP</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ConnectDirectoryRequest withShortName(String shortName) {
        setShortName(shortName);
        return this;
    }

    /**
     * <p>
     * The password for the on-premises user account.
     * </p>
     * 
     * @param password
     *        The password for the on-premises user account.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the on-premises user account.
     * </p>
     * 
     * @return The password for the on-premises user account.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the on-premises user account.
     * </p>
     * 
     * @param password
     *        The password for the on-premises user account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ConnectDirectoryRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * A textual description for the directory.
     * </p>
     * 
     * @param description
     *        A textual description for the directory.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A textual description for the directory.
     * </p>
     * 
     * @return A textual description for the directory.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A textual description for the directory.
     * </p>
     * 
     * @param description
     *        A textual description for the directory.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ConnectDirectoryRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The size of the directory.
     * </p>
     * 
     * @param size
     *        The size of the directory.
     * @see DirectorySize
     */

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the directory.
     * </p>
     * 
     * @return The size of the directory.
     * @see DirectorySize
     */

    public String getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the directory.
     * </p>
     * 
     * @param size
     *        The size of the directory.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DirectorySize
     */

    public ConnectDirectoryRequest withSize(String size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The size of the directory.
     * </p>
     * 
     * @param size
     *        The size of the directory.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DirectorySize
     */

    public void setSize(DirectorySize size) {
        this.size = size.toString();
    }

    /**
     * <p>
     * The size of the directory.
     * </p>
     * 
     * @param size
     *        The size of the directory.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DirectorySize
     */

    public ConnectDirectoryRequest withSize(DirectorySize size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * A <a>DirectoryConnectSettings</a> object that contains additional
     * information for the operation.
     * </p>
     * 
     * @param connectSettings
     *        A <a>DirectoryConnectSettings</a> object that contains additional
     *        information for the operation.
     */

    public void setConnectSettings(DirectoryConnectSettings connectSettings) {
        this.connectSettings = connectSettings;
    }

    /**
     * <p>
     * A <a>DirectoryConnectSettings</a> object that contains additional
     * information for the operation.
     * </p>
     * 
     * @return A <a>DirectoryConnectSettings</a> object that contains additional
     *         information for the operation.
     */

    public DirectoryConnectSettings getConnectSettings() {
        return this.connectSettings;
    }

    /**
     * <p>
     * A <a>DirectoryConnectSettings</a> object that contains additional
     * information for the operation.
     * </p>
     * 
     * @param connectSettings
     *        A <a>DirectoryConnectSettings</a> object that contains additional
     *        information for the operation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ConnectDirectoryRequest withConnectSettings(
            DirectoryConnectSettings connectSettings) {
        setConnectSettings(connectSettings);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getShortName() != null)
            sb.append("ShortName: " + getShortName() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSize() != null)
            sb.append("Size: " + getSize() + ",");
        if (getConnectSettings() != null)
            sb.append("ConnectSettings: " + getConnectSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectDirectoryRequest == false)
            return false;
        ConnectDirectoryRequest other = (ConnectDirectoryRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getShortName() == null ^ this.getShortName() == null)
            return false;
        if (other.getShortName() != null
                && other.getShortName().equals(this.getShortName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null
                && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null
                && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getConnectSettings() == null
                ^ this.getConnectSettings() == null)
            return false;
        if (other.getConnectSettings() != null
                && other.getConnectSettings().equals(this.getConnectSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getShortName() == null) ? 0 : getShortName().hashCode());
        hashCode = prime * hashCode
                + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectSettings() == null) ? 0 : getConnectSettings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ConnectDirectoryRequest clone() {
        return (ConnectDirectoryRequest) super.clone();
    }
}