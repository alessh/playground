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

package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the <code>UnlinkDeveloperIdentity</code> action.
 * </p>
 */
public class UnlinkDeveloperIdentityRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     */
    private String developerProviderName;
    /**
     * A unique ID used by your backend authentication process to identify a
     * user.
     */
    private String developerUserIdentifier;

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @return A unique identifier in the format REGION:GUID.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UnlinkDeveloperIdentityRequest withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @return An identity pool ID in the format REGION:GUID.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UnlinkDeveloperIdentityRequest withIdentityPoolId(
            String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * 
     * @param developerProviderName
     *        The "domain" by which Cognito will refer to your users.
     */

    public void setDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * 
     * @return The "domain" by which Cognito will refer to your users.
     */

    public String getDeveloperProviderName() {
        return this.developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * 
     * @param developerProviderName
     *        The "domain" by which Cognito will refer to your users.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UnlinkDeveloperIdentityRequest withDeveloperProviderName(
            String developerProviderName) {
        setDeveloperProviderName(developerProviderName);
        return this;
    }

    /**
     * A unique ID used by your backend authentication process to identify a
     * user.
     * 
     * @param developerUserIdentifier
     *        A unique ID used by your backend authentication process to
     *        identify a user.
     */

    public void setDeveloperUserIdentifier(String developerUserIdentifier) {
        this.developerUserIdentifier = developerUserIdentifier;
    }

    /**
     * A unique ID used by your backend authentication process to identify a
     * user.
     * 
     * @return A unique ID used by your backend authentication process to
     *         identify a user.
     */

    public String getDeveloperUserIdentifier() {
        return this.developerUserIdentifier;
    }

    /**
     * A unique ID used by your backend authentication process to identify a
     * user.
     * 
     * @param developerUserIdentifier
     *        A unique ID used by your backend authentication process to
     *        identify a user.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UnlinkDeveloperIdentityRequest withDeveloperUserIdentifier(
            String developerUserIdentifier) {
        setDeveloperUserIdentifier(developerUserIdentifier);
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
        if (getIdentityId() != null)
            sb.append("IdentityId: " + getIdentityId() + ",");
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getDeveloperProviderName() != null)
            sb.append("DeveloperProviderName: " + getDeveloperProviderName()
                    + ",");
        if (getDeveloperUserIdentifier() != null)
            sb.append("DeveloperUserIdentifier: "
                    + getDeveloperUserIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnlinkDeveloperIdentityRequest == false)
            return false;
        UnlinkDeveloperIdentityRequest other = (UnlinkDeveloperIdentityRequest) obj;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null
                && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getIdentityPoolId() == null
                ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null
                && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getDeveloperProviderName() == null
                ^ this.getDeveloperProviderName() == null)
            return false;
        if (other.getDeveloperProviderName() != null
                && other.getDeveloperProviderName().equals(
                        this.getDeveloperProviderName()) == false)
            return false;
        if (other.getDeveloperUserIdentifier() == null
                ^ this.getDeveloperUserIdentifier() == null)
            return false;
        if (other.getDeveloperUserIdentifier() != null
                && other.getDeveloperUserIdentifier().equals(
                        this.getDeveloperUserIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeveloperProviderName() == null) ? 0
                        : getDeveloperProviderName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeveloperUserIdentifier() == null) ? 0
                        : getDeveloperUserIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public UnlinkDeveloperIdentityRequest clone() {
        return (UnlinkDeveloperIdentityRequest) super.clone();
    }
}