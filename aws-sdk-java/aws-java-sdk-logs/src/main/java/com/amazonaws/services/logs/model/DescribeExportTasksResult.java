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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeExportTasksResult implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<ExportTask> exportTasks;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<ExportTask> getExportTasks() {
        if (exportTasks == null) {
            exportTasks = new com.amazonaws.internal.SdkInternalList<ExportTask>();
        }
        return exportTasks;
    }

    /**
     * @param exportTasks
     */

    public void setExportTasks(java.util.Collection<ExportTask> exportTasks) {
        if (exportTasks == null) {
            this.exportTasks = null;
            return;
        }

        this.exportTasks = new com.amazonaws.internal.SdkInternalList<ExportTask>(
                exportTasks);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setExportTasks(java.util.Collection)} or
     * {@link #withExportTasks(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param exportTasks
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeExportTasksResult withExportTasks(ExportTask... exportTasks) {
        if (this.exportTasks == null) {
            setExportTasks(new com.amazonaws.internal.SdkInternalList<ExportTask>(
                    exportTasks.length));
        }
        for (ExportTask ele : exportTasks) {
            this.exportTasks.add(ele);
        }
        return this;
    }

    /**
     * @param exportTasks
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeExportTasksResult withExportTasks(
            java.util.Collection<ExportTask> exportTasks) {
        setExportTasks(exportTasks);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeExportTasksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getExportTasks() != null)
            sb.append("ExportTasks: " + getExportTasks() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExportTasksResult == false)
            return false;
        DescribeExportTasksResult other = (DescribeExportTasksResult) obj;
        if (other.getExportTasks() == null ^ this.getExportTasks() == null)
            return false;
        if (other.getExportTasks() != null
                && other.getExportTasks().equals(this.getExportTasks()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getExportTasks() == null) ? 0 : getExportTasks().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportTasksResult clone() {
        try {
            return (DescribeExportTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
