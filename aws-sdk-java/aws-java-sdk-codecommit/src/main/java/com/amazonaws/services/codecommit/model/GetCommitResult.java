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

/**
 * <p>
 * Represents the output of a get commit operation.
 * </p>
 */
public class GetCommitResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the specified commit.
     * </p>
     */
    private Commit commit;

    /**
     * <p>
     * Information about the specified commit.
     * </p>
     * 
     * @param commit
     *        Information about the specified commit.
     */

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    /**
     * <p>
     * Information about the specified commit.
     * </p>
     * 
     * @return Information about the specified commit.
     */

    public Commit getCommit() {
        return this.commit;
    }

    /**
     * <p>
     * Information about the specified commit.
     * </p>
     * 
     * @param commit
     *        Information about the specified commit.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetCommitResult withCommit(Commit commit) {
        setCommit(commit);
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
        if (getCommit() != null)
            sb.append("Commit: " + getCommit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCommitResult == false)
            return false;
        GetCommitResult other = (GetCommitResult) obj;
        if (other.getCommit() == null ^ this.getCommit() == null)
            return false;
        if (other.getCommit() != null
                && other.getCommit().equals(this.getCommit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCommit() == null) ? 0 : getCommit().hashCode());
        return hashCode;
    }

    @Override
    public GetCommitResult clone() {
        try {
            return (GetCommitResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
