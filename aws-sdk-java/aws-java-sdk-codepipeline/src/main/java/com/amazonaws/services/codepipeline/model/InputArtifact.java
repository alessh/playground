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

package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents information about an artifact to be worked on, such as a test or
 * build artifact.
 * </p>
 */
public class InputArtifact implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the artifact to be worked on, for example, "My App".
     * </p>
     * <p>
     * The input artifact of an action must exactly match the output artifact
     * declared in a preceding action, but the input artifact does not have to
     * be the next action in strict sequence from the action that provided the
     * output artifact. Actions in parallel can declare different output
     * artifacts, which are in turn consumed by different following actions.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The name of the artifact to be worked on, for example, "My App".
     * </p>
     * <p>
     * The input artifact of an action must exactly match the output artifact
     * declared in a preceding action, but the input artifact does not have to
     * be the next action in strict sequence from the action that provided the
     * output artifact. Actions in parallel can declare different output
     * artifacts, which are in turn consumed by different following actions.
     * </p>
     * 
     * @param name
     *        The name of the artifact to be worked on, for example,
     *        "My App".</p>
     *        <p>
     *        The input artifact of an action must exactly match the output
     *        artifact declared in a preceding action, but the input artifact
     *        does not have to be the next action in strict sequence from the
     *        action that provided the output artifact. Actions in parallel can
     *        declare different output artifacts, which are in turn consumed by
     *        different following actions.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the artifact to be worked on, for example, "My App".
     * </p>
     * <p>
     * The input artifact of an action must exactly match the output artifact
     * declared in a preceding action, but the input artifact does not have to
     * be the next action in strict sequence from the action that provided the
     * output artifact. Actions in parallel can declare different output
     * artifacts, which are in turn consumed by different following actions.
     * </p>
     * 
     * @return The name of the artifact to be worked on, for example,
     *         "My App".</p>
     *         <p>
     *         The input artifact of an action must exactly match the output
     *         artifact declared in a preceding action, but the input artifact
     *         does not have to be the next action in strict sequence from the
     *         action that provided the output artifact. Actions in parallel can
     *         declare different output artifacts, which are in turn consumed by
     *         different following actions.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the artifact to be worked on, for example, "My App".
     * </p>
     * <p>
     * The input artifact of an action must exactly match the output artifact
     * declared in a preceding action, but the input artifact does not have to
     * be the next action in strict sequence from the action that provided the
     * output artifact. Actions in parallel can declare different output
     * artifacts, which are in turn consumed by different following actions.
     * </p>
     * 
     * @param name
     *        The name of the artifact to be worked on, for example,
     *        "My App".</p>
     *        <p>
     *        The input artifact of an action must exactly match the output
     *        artifact declared in a preceding action, but the input artifact
     *        does not have to be the next action in strict sequence from the
     *        action that provided the output artifact. Actions in parallel can
     *        declare different output artifacts, which are in turn consumed by
     *        different following actions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InputArtifact withName(String name) {
        setName(name);
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
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputArtifact == false)
            return false;
        InputArtifact other = (InputArtifact) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public InputArtifact clone() {
        try {
            return (InputArtifact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
