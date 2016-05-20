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

package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request for a list of the configured Cognito Events
 * </p>
 */
public class GetCognitoEventsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Cognito Identity Pool ID for the request
     * </p>
     */
    private String identityPoolId;

    /**
     * <p>
     * The Cognito Identity Pool ID for the request
     * </p>
     * 
     * @param identityPoolId
     *        The Cognito Identity Pool ID for the request
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * The Cognito Identity Pool ID for the request
     * </p>
     * 
     * @return The Cognito Identity Pool ID for the request
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * The Cognito Identity Pool ID for the request
     * </p>
     * 
     * @param identityPoolId
     *        The Cognito Identity Pool ID for the request
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetCognitoEventsRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: " + getIdentityPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCognitoEventsRequest == false)
            return false;
        GetCognitoEventsRequest other = (GetCognitoEventsRequest) obj;
        if (other.getIdentityPoolId() == null
                ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null
                && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GetCognitoEventsRequest clone() {
        return (GetCognitoEventsRequest) super.clone();
    }
}