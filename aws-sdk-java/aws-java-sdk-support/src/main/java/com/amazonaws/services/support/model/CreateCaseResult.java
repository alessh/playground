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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * The AWS Support case ID returned by a successful completion of the
 * <a>CreateCase</a> operation.
 * </p>
 */
public class CreateCaseResult implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     */
    private String caseId;

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * 
     * @param caseId
     *        The AWS Support case ID requested or returned in the call. The
     *        case ID is an alphanumeric string formatted as shown in this
     *        example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     */

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * 
     * @return The AWS Support case ID requested or returned in the call. The
     *         case ID is an alphanumeric string formatted as shown in this
     *         example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     */

    public String getCaseId() {
        return this.caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * 
     * @param caseId
     *        The AWS Support case ID requested or returned in the call. The
     *        case ID is an alphanumeric string formatted as shown in this
     *        example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateCaseResult withCaseId(String caseId) {
        setCaseId(caseId);
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
        if (getCaseId() != null)
            sb.append("CaseId: " + getCaseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCaseResult == false)
            return false;
        CreateCaseResult other = (CreateCaseResult) obj;
        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null
                && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        return hashCode;
    }

    @Override
    public CreateCaseResult clone() {
        try {
            return (CreateCaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
