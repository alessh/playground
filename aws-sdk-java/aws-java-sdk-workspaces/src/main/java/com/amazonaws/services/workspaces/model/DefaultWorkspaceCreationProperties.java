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

package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Contains default WorkSpace creation information.
 * </p>
 */
public class DefaultWorkspaceCreationProperties implements Serializable,
        Cloneable {

    /**
     * <p>
     * Specifies if the directory is enabled for Amazon WorkDocs.
     * </p>
     */
    private Boolean enableWorkDocs;
    /**
     * <p>
     * A public IP address will be attached to all WorkSpaces that are created
     * or rebuilt.
     * </p>
     */
    private Boolean enableInternetAccess;
    /**
     * <p>
     * The organizational unit (OU) in the directory that the WorkSpace machine
     * accounts are placed in.
     * </p>
     */
    private String defaultOu;
    /**
     * <p>
     * The identifier of any custom security groups that are applied to the
     * WorkSpaces when they are created.
     * </p>
     */
    private String customSecurityGroupId;
    /**
     * <p>
     * The WorkSpace user is an administrator on the WorkSpace.
     * </p>
     */
    private Boolean userEnabledAsLocalAdministrator;

    /**
     * <p>
     * Specifies if the directory is enabled for Amazon WorkDocs.
     * </p>
     * 
     * @param enableWorkDocs
     *        Specifies if the directory is enabled for Amazon WorkDocs.
     */

    public void setEnableWorkDocs(Boolean enableWorkDocs) {
        this.enableWorkDocs = enableWorkDocs;
    }

    /**
     * <p>
     * Specifies if the directory is enabled for Amazon WorkDocs.
     * </p>
     * 
     * @return Specifies if the directory is enabled for Amazon WorkDocs.
     */

    public Boolean getEnableWorkDocs() {
        return this.enableWorkDocs;
    }

    /**
     * <p>
     * Specifies if the directory is enabled for Amazon WorkDocs.
     * </p>
     * 
     * @param enableWorkDocs
     *        Specifies if the directory is enabled for Amazon WorkDocs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DefaultWorkspaceCreationProperties withEnableWorkDocs(
            Boolean enableWorkDocs) {
        setEnableWorkDocs(enableWorkDocs);
        return this;
    }

    /**
     * <p>
     * Specifies if the directory is enabled for Amazon WorkDocs.
     * </p>
     * 
     * @return Specifies if the directory is enabled for Amazon WorkDocs.
     */

    public Boolean isEnableWorkDocs() {
        return this.enableWorkDocs;
    }

    /**
     * <p>
     * A public IP address will be attached to all WorkSpaces that are created
     * or rebuilt.
     * </p>
     * 
     * @param enableInternetAccess
     *        A public IP address will be attached to all WorkSpaces that are
     *        created or rebuilt.
     */

    public void setEnableInternetAccess(Boolean enableInternetAccess) {
        this.enableInternetAccess = enableInternetAccess;
    }

    /**
     * <p>
     * A public IP address will be attached to all WorkSpaces that are created
     * or rebuilt.
     * </p>
     * 
     * @return A public IP address will be attached to all WorkSpaces that are
     *         created or rebuilt.
     */

    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    /**
     * <p>
     * A public IP address will be attached to all WorkSpaces that are created
     * or rebuilt.
     * </p>
     * 
     * @param enableInternetAccess
     *        A public IP address will be attached to all WorkSpaces that are
     *        created or rebuilt.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DefaultWorkspaceCreationProperties withEnableInternetAccess(
            Boolean enableInternetAccess) {
        setEnableInternetAccess(enableInternetAccess);
        return this;
    }

    /**
     * <p>
     * A public IP address will be attached to all WorkSpaces that are created
     * or rebuilt.
     * </p>
     * 
     * @return A public IP address will be attached to all WorkSpaces that are
     *         created or rebuilt.
     */

    public Boolean isEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    /**
     * <p>
     * The organizational unit (OU) in the directory that the WorkSpace machine
     * accounts are placed in.
     * </p>
     * 
     * @param defaultOu
     *        The organizational unit (OU) in the directory that the WorkSpace
     *        machine accounts are placed in.
     */

    public void setDefaultOu(String defaultOu) {
        this.defaultOu = defaultOu;
    }

    /**
     * <p>
     * The organizational unit (OU) in the directory that the WorkSpace machine
     * accounts are placed in.
     * </p>
     * 
     * @return The organizational unit (OU) in the directory that the WorkSpace
     *         machine accounts are placed in.
     */

    public String getDefaultOu() {
        return this.defaultOu;
    }

    /**
     * <p>
     * The organizational unit (OU) in the directory that the WorkSpace machine
     * accounts are placed in.
     * </p>
     * 
     * @param defaultOu
     *        The organizational unit (OU) in the directory that the WorkSpace
     *        machine accounts are placed in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DefaultWorkspaceCreationProperties withDefaultOu(String defaultOu) {
        setDefaultOu(defaultOu);
        return this;
    }

    /**
     * <p>
     * The identifier of any custom security groups that are applied to the
     * WorkSpaces when they are created.
     * </p>
     * 
     * @param customSecurityGroupId
     *        The identifier of any custom security groups that are applied to
     *        the WorkSpaces when they are created.
     */

    public void setCustomSecurityGroupId(String customSecurityGroupId) {
        this.customSecurityGroupId = customSecurityGroupId;
    }

    /**
     * <p>
     * The identifier of any custom security groups that are applied to the
     * WorkSpaces when they are created.
     * </p>
     * 
     * @return The identifier of any custom security groups that are applied to
     *         the WorkSpaces when they are created.
     */

    public String getCustomSecurityGroupId() {
        return this.customSecurityGroupId;
    }

    /**
     * <p>
     * The identifier of any custom security groups that are applied to the
     * WorkSpaces when they are created.
     * </p>
     * 
     * @param customSecurityGroupId
     *        The identifier of any custom security groups that are applied to
     *        the WorkSpaces when they are created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DefaultWorkspaceCreationProperties withCustomSecurityGroupId(
            String customSecurityGroupId) {
        setCustomSecurityGroupId(customSecurityGroupId);
        return this;
    }

    /**
     * <p>
     * The WorkSpace user is an administrator on the WorkSpace.
     * </p>
     * 
     * @param userEnabledAsLocalAdministrator
     *        The WorkSpace user is an administrator on the WorkSpace.
     */

    public void setUserEnabledAsLocalAdministrator(
            Boolean userEnabledAsLocalAdministrator) {
        this.userEnabledAsLocalAdministrator = userEnabledAsLocalAdministrator;
    }

    /**
     * <p>
     * The WorkSpace user is an administrator on the WorkSpace.
     * </p>
     * 
     * @return The WorkSpace user is an administrator on the WorkSpace.
     */

    public Boolean getUserEnabledAsLocalAdministrator() {
        return this.userEnabledAsLocalAdministrator;
    }

    /**
     * <p>
     * The WorkSpace user is an administrator on the WorkSpace.
     * </p>
     * 
     * @param userEnabledAsLocalAdministrator
     *        The WorkSpace user is an administrator on the WorkSpace.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DefaultWorkspaceCreationProperties withUserEnabledAsLocalAdministrator(
            Boolean userEnabledAsLocalAdministrator) {
        setUserEnabledAsLocalAdministrator(userEnabledAsLocalAdministrator);
        return this;
    }

    /**
     * <p>
     * The WorkSpace user is an administrator on the WorkSpace.
     * </p>
     * 
     * @return The WorkSpace user is an administrator on the WorkSpace.
     */

    public Boolean isUserEnabledAsLocalAdministrator() {
        return this.userEnabledAsLocalAdministrator;
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
        if (getEnableWorkDocs() != null)
            sb.append("EnableWorkDocs: " + getEnableWorkDocs() + ",");
        if (getEnableInternetAccess() != null)
            sb.append("EnableInternetAccess: " + getEnableInternetAccess()
                    + ",");
        if (getDefaultOu() != null)
            sb.append("DefaultOu: " + getDefaultOu() + ",");
        if (getCustomSecurityGroupId() != null)
            sb.append("CustomSecurityGroupId: " + getCustomSecurityGroupId()
                    + ",");
        if (getUserEnabledAsLocalAdministrator() != null)
            sb.append("UserEnabledAsLocalAdministrator: "
                    + getUserEnabledAsLocalAdministrator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultWorkspaceCreationProperties == false)
            return false;
        DefaultWorkspaceCreationProperties other = (DefaultWorkspaceCreationProperties) obj;
        if (other.getEnableWorkDocs() == null
                ^ this.getEnableWorkDocs() == null)
            return false;
        if (other.getEnableWorkDocs() != null
                && other.getEnableWorkDocs().equals(this.getEnableWorkDocs()) == false)
            return false;
        if (other.getEnableInternetAccess() == null
                ^ this.getEnableInternetAccess() == null)
            return false;
        if (other.getEnableInternetAccess() != null
                && other.getEnableInternetAccess().equals(
                        this.getEnableInternetAccess()) == false)
            return false;
        if (other.getDefaultOu() == null ^ this.getDefaultOu() == null)
            return false;
        if (other.getDefaultOu() != null
                && other.getDefaultOu().equals(this.getDefaultOu()) == false)
            return false;
        if (other.getCustomSecurityGroupId() == null
                ^ this.getCustomSecurityGroupId() == null)
            return false;
        if (other.getCustomSecurityGroupId() != null
                && other.getCustomSecurityGroupId().equals(
                        this.getCustomSecurityGroupId()) == false)
            return false;
        if (other.getUserEnabledAsLocalAdministrator() == null
                ^ this.getUserEnabledAsLocalAdministrator() == null)
            return false;
        if (other.getUserEnabledAsLocalAdministrator() != null
                && other.getUserEnabledAsLocalAdministrator().equals(
                        this.getUserEnabledAsLocalAdministrator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEnableWorkDocs() == null) ? 0 : getEnableWorkDocs()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableInternetAccess() == null) ? 0
                        : getEnableInternetAccess().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultOu() == null) ? 0 : getDefaultOu().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomSecurityGroupId() == null) ? 0
                        : getCustomSecurityGroupId().hashCode());
        hashCode = prime
                * hashCode
                + ((getUserEnabledAsLocalAdministrator() == null) ? 0
                        : getUserEnabledAsLocalAdministrator().hashCode());
        return hashCode;
    }

    @Override
    public DefaultWorkspaceCreationProperties clone() {
        try {
            return (DefaultWorkspaceCreationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
