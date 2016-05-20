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
 * Represents additional information about a job required for a job worker to
 * complete the job.
 * </p>
 */
public class JobData implements Serializable, Cloneable {

    private ActionTypeId actionTypeId;

    private ActionConfiguration actionConfiguration;

    private PipelineContext pipelineContext;
    /**
     * <p>
     * The artifact supplied to the job.
     * </p>
     */
    private java.util.List<Artifact> inputArtifacts;
    /**
     * <p>
     * The output of the job.
     * </p>
     */
    private java.util.List<Artifact> outputArtifacts;

    private AWSSessionCredentials artifactCredentials;
    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that a
     * job requires in order to continue the job asynchronously.
     * </p>
     */
    private String continuationToken;

    private EncryptionKey encryptionKey;

    /**
     * @param actionTypeId
     */

    public void setActionTypeId(ActionTypeId actionTypeId) {
        this.actionTypeId = actionTypeId;
    }

    /**
     * @return
     */

    public ActionTypeId getActionTypeId() {
        return this.actionTypeId;
    }

    /**
     * @param actionTypeId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobData withActionTypeId(ActionTypeId actionTypeId) {
        setActionTypeId(actionTypeId);
        return this;
    }

    /**
     * @param actionConfiguration
     */

    public void setActionConfiguration(ActionConfiguration actionConfiguration) {
        this.actionConfiguration = actionConfiguration;
    }

    /**
     * @return
     */

    public ActionConfiguration getActionConfiguration() {
        return this.actionConfiguration;
    }

    /**
     * @param actionConfiguration
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobData withActionConfiguration(
            ActionConfiguration actionConfiguration) {
        setActionConfiguration(actionConfiguration);
        return this;
    }

    /**
     * @param pipelineContext
     */

    public void setPipelineContext(PipelineContext pipelineContext) {
        this.pipelineContext = pipelineContext;
    }

    /**
     * @return
     */

    public PipelineContext getPipelineContext() {
        return this.pipelineContext;
    }

    /**
     * @param pipelineContext
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobData withPipelineContext(PipelineContext pipelineContext) {
        setPipelineContext(pipelineContext);
        return this;
    }

    /**
     * <p>
     * The artifact supplied to the job.
     * </p>
     * 
     * @return The artifact supplied to the job.
     */

    public java.util.List<Artifact> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * The artifact supplied to the job.
     * </p>
     * 
     * @param inputArtifacts
     *        The artifact supplied to the job.
     */

    public void setInputArtifacts(java.util.Collection<Artifact> inputArtifacts) {
        if (inputArtifacts == null) {
            this.inputArtifacts = null;
            return;
        }

        this.inputArtifacts = new java.util.ArrayList<Artifact>(inputArtifacts);
    }

    /**
     * <p>
     * The artifact supplied to the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInputArtifacts(java.util.Collection)} or
     * {@link #withInputArtifacts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param inputArtifacts
     *        The artifact supplied to the job.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobData withInputArtifacts(Artifact... inputArtifacts) {
        if (this.inputArtifacts == null) {
            setInputArtifacts(new java.util.ArrayList<Artifact>(
                    inputArtifacts.length));
        }
        for (Artifact ele : inputArtifacts) {
            this.inputArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The artifact supplied to the job.
     * </p>
     * 
     * @param inputArtifacts
     *        The artifact supplied to the job.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobData withInputArtifacts(
            java.util.Collection<Artifact> inputArtifacts) {
        setInputArtifacts(inputArtifacts);
        return this;
    }

    /**
     * <p>
     * The output of the job.
     * </p>
     * 
     * @return The output of the job.
     */

    public java.util.List<Artifact> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * <p>
     * The output of the job.
     * </p>
     * 
     * @param outputArtifacts
     *        The output of the job.
     */

    public void setOutputArtifacts(
            java.util.Collection<Artifact> outputArtifacts) {
        if (outputArtifacts == null) {
            this.outputArtifacts = null;
            return;
        }

        this.outputArtifacts = new java.util.ArrayList<Artifact>(
                outputArtifacts);
    }

    /**
     * <p>
     * The output of the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setOutputArtifacts(java.util.Collection)} or
     * {@link #withOutputArtifacts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param outputArtifacts
     *        The output of the job.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobData withOutputArtifacts(Artifact... outputArtifacts) {
        if (this.outputArtifacts == null) {
            setOutputArtifacts(new java.util.ArrayList<Artifact>(
                    outputArtifacts.length));
        }
        for (Artifact ele : outputArtifacts) {
            this.outputArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The output of the job.
     * </p>
     * 
     * @param outputArtifacts
     *        The output of the job.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobData withOutputArtifacts(
            java.util.Collection<Artifact> outputArtifacts) {
        setOutputArtifacts(outputArtifacts);
        return this;
    }

    /**
     * @param artifactCredentials
     */

    public void setArtifactCredentials(AWSSessionCredentials artifactCredentials) {
        this.artifactCredentials = artifactCredentials;
    }

    /**
     * @return
     */

    public AWSSessionCredentials getArtifactCredentials() {
        return this.artifactCredentials;
    }

    /**
     * @param artifactCredentials
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobData withArtifactCredentials(
            AWSSessionCredentials artifactCredentials) {
        setArtifactCredentials(artifactCredentials);
        return this;
    }

    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that a
     * job requires in order to continue the job asynchronously.
     * </p>
     * 
     * @param continuationToken
     *        A system-generated token, such as a AWS CodeDeploy deployment ID,
     *        that a job requires in order to continue the job asynchronously.
     */

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that a
     * job requires in order to continue the job asynchronously.
     * </p>
     * 
     * @return A system-generated token, such as a AWS CodeDeploy deployment ID,
     *         that a job requires in order to continue the job asynchronously.
     */

    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that a
     * job requires in order to continue the job asynchronously.
     * </p>
     * 
     * @param continuationToken
     *        A system-generated token, such as a AWS CodeDeploy deployment ID,
     *        that a job requires in order to continue the job asynchronously.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobData withContinuationToken(String continuationToken) {
        setContinuationToken(continuationToken);
        return this;
    }

    /**
     * @param encryptionKey
     */

    public void setEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * @return
     */

    public EncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @param encryptionKey
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobData withEncryptionKey(EncryptionKey encryptionKey) {
        setEncryptionKey(encryptionKey);
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
        if (getActionTypeId() != null)
            sb.append("ActionTypeId: " + getActionTypeId() + ",");
        if (getActionConfiguration() != null)
            sb.append("ActionConfiguration: " + getActionConfiguration() + ",");
        if (getPipelineContext() != null)
            sb.append("PipelineContext: " + getPipelineContext() + ",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: " + getInputArtifacts() + ",");
        if (getOutputArtifacts() != null)
            sb.append("OutputArtifacts: " + getOutputArtifacts() + ",");
        if (getArtifactCredentials() != null)
            sb.append("ArtifactCredentials: " + getArtifactCredentials() + ",");
        if (getContinuationToken() != null)
            sb.append("ContinuationToken: " + getContinuationToken() + ",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: " + getEncryptionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobData == false)
            return false;
        JobData other = (JobData) obj;
        if (other.getActionTypeId() == null ^ this.getActionTypeId() == null)
            return false;
        if (other.getActionTypeId() != null
                && other.getActionTypeId().equals(this.getActionTypeId()) == false)
            return false;
        if (other.getActionConfiguration() == null
                ^ this.getActionConfiguration() == null)
            return false;
        if (other.getActionConfiguration() != null
                && other.getActionConfiguration().equals(
                        this.getActionConfiguration()) == false)
            return false;
        if (other.getPipelineContext() == null
                ^ this.getPipelineContext() == null)
            return false;
        if (other.getPipelineContext() != null
                && other.getPipelineContext().equals(this.getPipelineContext()) == false)
            return false;
        if (other.getInputArtifacts() == null
                ^ this.getInputArtifacts() == null)
            return false;
        if (other.getInputArtifacts() != null
                && other.getInputArtifacts().equals(this.getInputArtifacts()) == false)
            return false;
        if (other.getOutputArtifacts() == null
                ^ this.getOutputArtifacts() == null)
            return false;
        if (other.getOutputArtifacts() != null
                && other.getOutputArtifacts().equals(this.getOutputArtifacts()) == false)
            return false;
        if (other.getArtifactCredentials() == null
                ^ this.getArtifactCredentials() == null)
            return false;
        if (other.getArtifactCredentials() != null
                && other.getArtifactCredentials().equals(
                        this.getArtifactCredentials()) == false)
            return false;
        if (other.getContinuationToken() == null
                ^ this.getContinuationToken() == null)
            return false;
        if (other.getContinuationToken() != null
                && other.getContinuationToken().equals(
                        this.getContinuationToken()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null
                && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getActionTypeId() == null) ? 0 : getActionTypeId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getActionConfiguration() == null) ? 0
                        : getActionConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getPipelineContext() == null) ? 0 : getPipelineContext()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInputArtifacts() == null) ? 0 : getInputArtifacts()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getOutputArtifacts() == null) ? 0 : getOutputArtifacts()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getArtifactCredentials() == null) ? 0
                        : getArtifactCredentials().hashCode());
        hashCode = prime
                * hashCode
                + ((getContinuationToken() == null) ? 0
                        : getContinuationToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getEncryptionKey() == null) ? 0 : getEncryptionKey()
                        .hashCode());
        return hashCode;
    }

    @Override
    public JobData clone() {
        try {
            return (JobData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
