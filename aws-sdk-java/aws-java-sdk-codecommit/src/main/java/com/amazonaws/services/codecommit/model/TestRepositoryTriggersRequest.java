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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a test repository triggers operation.
 * </p>
 */
public class TestRepositoryTriggersRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository in which to test the triggers.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The list of triggers to test.
     * </p>
     */
    private java.util.List<RepositoryTrigger> triggers;

    /**
     * <p>
     * The name of the repository in which to test the triggers.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository in which to test the triggers.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository in which to test the triggers.
     * </p>
     * 
     * @return The name of the repository in which to test the triggers.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository in which to test the triggers.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository in which to test the triggers.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestRepositoryTriggersRequest withRepositoryName(
            String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The list of triggers to test.
     * </p>
     * 
     * @return The list of triggers to test.
     */

    public java.util.List<RepositoryTrigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * The list of triggers to test.
     * </p>
     * 
     * @param triggers
     *        The list of triggers to test.
     */

    public void setTriggers(java.util.Collection<RepositoryTrigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }

        this.triggers = new java.util.ArrayList<RepositoryTrigger>(triggers);
    }

    /**
     * <p>
     * The list of triggers to test.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTriggers(java.util.Collection)} or
     * {@link #withTriggers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param triggers
     *        The list of triggers to test.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestRepositoryTriggersRequest withTriggers(
            RepositoryTrigger... triggers) {
        if (this.triggers == null) {
            setTriggers(new java.util.ArrayList<RepositoryTrigger>(
                    triggers.length));
        }
        for (RepositoryTrigger ele : triggers) {
            this.triggers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of triggers to test.
     * </p>
     * 
     * @param triggers
     *        The list of triggers to test.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TestRepositoryTriggersRequest withTriggers(
            java.util.Collection<RepositoryTrigger> triggers) {
        setTriggers(triggers);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: " + getRepositoryName() + ",");
        if (getTriggers() != null)
            sb.append("Triggers: " + getTriggers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestRepositoryTriggersRequest == false)
            return false;
        TestRepositoryTriggersRequest other = (TestRepositoryTriggersRequest) obj;
        if (other.getRepositoryName() == null
                ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null
                && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        return hashCode;
    }

    @Override
    public TestRepositoryTriggersRequest clone() {
        return (TestRepositoryTriggersRequest) super.clone();
    }
}