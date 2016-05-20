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

package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <a>GetEvaluation</a> operation and describes an
 * <code>Evaluation</code>.
 * </p>
 */
public class GetEvaluationResult implements Serializable, Cloneable {

    /**
     * <p>
     * The evaluation ID which is same as the <code>EvaluationId</code> in the
     * request.
     * </p>
     */
    private String evaluationId;
    /**
     * <p>
     * The ID of the <code>MLModel</code> that was the focus of the evaluation.
     * </p>
     */
    private String mLModelId;
    /**
     * <p>
     * The <code>DataSource</code> used for this evaluation.
     * </p>
     */
    private String evaluationDataSourceId;
    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     */
    private String inputDataLocationS3;
    /**
     * <p>
     * The AWS user account that invoked the evaluation. The account type can be
     * either an AWS root account or an AWS Identity and Access Management (IAM)
     * user account.
     * </p>
     */
    private String createdByIamUser;
    /**
     * <p>
     * The time that the <code>Evaluation</code> was created. The time is
     * expressed in epoch time.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time of the most recent edit to the <code>BatchPrediction</code>. The
     * time is expressed in epoch time.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * A user-supplied name or description of the <code>Evaluation</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the evaluation. This element can have one of the following
     * values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Language (Amazon ML) submitted
     * a request to evaluate an <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     * <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code>
     * did not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The evaluation process completed
     * successfully.</li>
     * <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as
     * deleted. It is not usable.</li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Measurements of how well the <code>MLModel</code> performed using
     * observations referenced by the <code>DataSource</code>. One of the
     * following metric is returned based on the type of the
     * <code>MLModel</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BinaryAUC: A binary <code>MLModel</code> uses the Area Under the Curve
     * (AUC) technique to measure performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RegressionRMSE: A regression <code>MLModel</code> uses the Root Mean
     * Square Error (RMSE) technique to measure performance. RMSE measures the
     * difference between predicted and actual values for a single variable.
     * </p>
     * </li>
     * <li>
     * <p>
     * MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1 score
     * technique to measure performance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about performance metrics, please see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     * </p>
     */
    private PerformanceMetrics performanceMetrics;
    /**
     * <p>
     * A link to the file that contains logs of the <a>CreateEvaluation</a>
     * operation.
     * </p>
     */
    private String logUri;
    /**
     * <p>
     * A description of the most recent details about evaluating the
     * <code>MLModel</code>.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The evaluation ID which is same as the <code>EvaluationId</code> in the
     * request.
     * </p>
     * 
     * @param evaluationId
     *        The evaluation ID which is same as the <code>EvaluationId</code>
     *        in the request.
     */

    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }

    /**
     * <p>
     * The evaluation ID which is same as the <code>EvaluationId</code> in the
     * request.
     * </p>
     * 
     * @return The evaluation ID which is same as the <code>EvaluationId</code>
     *         in the request.
     */

    public String getEvaluationId() {
        return this.evaluationId;
    }

    /**
     * <p>
     * The evaluation ID which is same as the <code>EvaluationId</code> in the
     * request.
     * </p>
     * 
     * @param evaluationId
     *        The evaluation ID which is same as the <code>EvaluationId</code>
     *        in the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetEvaluationResult withEvaluationId(String evaluationId) {
        setEvaluationId(evaluationId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that was the focus of the evaluation.
     * </p>
     * 
     * @param mLModelId
     *        The ID of the <code>MLModel</code> that was the focus of the
     *        evaluation.
     */

    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that was the focus of the evaluation.
     * </p>
     * 
     * @return The ID of the <code>MLModel</code> that was the focus of the
     *         evaluation.
     */

    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that was the focus of the evaluation.
     * </p>
     * 
     * @param mLModelId
     *        The ID of the <code>MLModel</code> that was the focus of the
     *        evaluation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetEvaluationResult withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * <p>
     * The <code>DataSource</code> used for this evaluation.
     * </p>
     * 
     * @param evaluationDataSourceId
     *        The <code>DataSource</code> used for this evaluation.
     */

    public void setEvaluationDataSourceId(String evaluationDataSourceId) {
        this.evaluationDataSourceId = evaluationDataSourceId;
    }

    /**
     * <p>
     * The <code>DataSource</code> used for this evaluation.
     * </p>
     * 
     * @return The <code>DataSource</code> used for this evaluation.
     */

    public String getEvaluationDataSourceId() {
        return this.evaluationDataSourceId;
    }

    /**
     * <p>
     * The <code>DataSource</code> used for this evaluation.
     * </p>
     * 
     * @param evaluationDataSourceId
     *        The <code>DataSource</code> used for this evaluation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetEvaluationResult withEvaluationDataSourceId(
            String evaluationDataSourceId) {
        setEvaluationDataSourceId(evaluationDataSourceId);
        return this;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     * 
     * @param inputDataLocationS3
     *        The location of the data file or directory in Amazon Simple
     *        Storage Service (Amazon S3).
     */

    public void setInputDataLocationS3(String inputDataLocationS3) {
        this.inputDataLocationS3 = inputDataLocationS3;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     * 
     * @return The location of the data file or directory in Amazon Simple
     *         Storage Service (Amazon S3).
     */

    public String getInputDataLocationS3() {
        return this.inputDataLocationS3;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     * 
     * @param inputDataLocationS3
     *        The location of the data file or directory in Amazon Simple
     *        Storage Service (Amazon S3).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetEvaluationResult withInputDataLocationS3(
            String inputDataLocationS3) {
        setInputDataLocationS3(inputDataLocationS3);
        return this;
    }

    /**
     * <p>
     * The AWS user account that invoked the evaluation. The account type can be
     * either an AWS root account or an AWS Identity and Access Management (IAM)
     * user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account that invoked the evaluation. The account type
     *        can be either an AWS root account or an AWS Identity and Access
     *        Management (IAM) user account.
     */

    public void setCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account that invoked the evaluation. The account type can be
     * either an AWS root account or an AWS Identity and Access Management (IAM)
     * user account.
     * </p>
     * 
     * @return The AWS user account that invoked the evaluation. The account
     *         type can be either an AWS root account or an AWS Identity and
     *         Access Management (IAM) user account.
     */

    public String getCreatedByIamUser() {
        return this.createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account that invoked the evaluation. The account type can be
     * either an AWS root account or an AWS Identity and Access Management (IAM)
     * user account.
     * </p>
     * 
     * @param createdByIamUser
     *        The AWS user account that invoked the evaluation. The account type
     *        can be either an AWS root account or an AWS Identity and Access
     *        Management (IAM) user account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetEvaluationResult withCreatedByIamUser(String createdByIamUser) {
        setCreatedByIamUser(createdByIamUser);
        return this;
    }

    /**
     * <p>
     * The time that the <code>Evaluation</code> was created. The time is
     * expressed in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>Evaluation</code> was created. The time is
     *        expressed in epoch time.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the <code>Evaluation</code> was created. The time is
     * expressed in epoch time.
     * </p>
     * 
     * @return The time that the <code>Evaluation</code> was created. The time
     *         is expressed in epoch time.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that the <code>Evaluation</code> was created. The time is
     * expressed in epoch time.
     * </p>
     * 
     * @param createdAt
     *        The time that the <code>Evaluation</code> was created. The time is
     *        expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetEvaluationResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>BatchPrediction</code>. The
     * time is expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the
     *        <code>BatchPrediction</code>. The time is expressed in epoch time.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>BatchPrediction</code>. The
     * time is expressed in epoch time.
     * </p>
     * 
     * @return The time of the most recent edit to the
     *         <code>BatchPrediction</code>. The time is expressed in epoch
     *         time.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>BatchPrediction</code>. The
     * time is expressed in epoch time.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time of the most recent edit to the
     *        <code>BatchPrediction</code>. The time is expressed in epoch time.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetEvaluationResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>Evaluation</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name or description of the <code>Evaluation</code>
     *        .
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>Evaluation</code>.
     * </p>
     * 
     * @return A user-supplied name or description of the
     *         <code>Evaluation</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>Evaluation</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name or description of the <code>Evaluation</code>
     *        .
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetEvaluationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the evaluation. This element can have one of the following
     * values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Language (Amazon ML) submitted
     * a request to evaluate an <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     * <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code>
     * did not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The evaluation process completed
     * successfully.</li>
     * <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as
     * deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the evaluation. This element can have one of the
     *        following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Language (Amazon ML)
     *        submitted a request to evaluate an <code>MLModel</code>.</li>
     *        <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     *        <li> <code>FAILED</code> - The request to evaluate an
     *        <code>MLModel</code> did not run to completion. It is not usable.</li>
     *        <li> <code>COMPLETED</code> - The evaluation process completed
     *        successfully.</li>
     *        <li> <code>DELETED</code> - The <code>Evaluation</code> is marked
     *        as deleted. It is not usable.</li>
     * @see EntityStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the evaluation. This element can have one of the following
     * values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Language (Amazon ML) submitted
     * a request to evaluate an <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     * <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code>
     * did not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The evaluation process completed
     * successfully.</li>
     * <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as
     * deleted. It is not usable.</li>
     * </ul>
     * 
     * @return The status of the evaluation. This element can have one of the
     *         following values:</p>
     *         <ul>
     *         <li> <code>PENDING</code> - Amazon Machine Language (Amazon ML)
     *         submitted a request to evaluate an <code>MLModel</code>.</li>
     *         <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     *         <li> <code>FAILED</code> - The request to evaluate an
     *         <code>MLModel</code> did not run to completion. It is not usable.
     *         </li>
     *         <li> <code>COMPLETED</code> - The evaluation process completed
     *         successfully.</li>
     *         <li> <code>DELETED</code> - The <code>Evaluation</code> is marked
     *         as deleted. It is not usable.</li>
     * @see EntityStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the evaluation. This element can have one of the following
     * values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Language (Amazon ML) submitted
     * a request to evaluate an <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     * <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code>
     * did not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The evaluation process completed
     * successfully.</li>
     * <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as
     * deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the evaluation. This element can have one of the
     *        following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Language (Amazon ML)
     *        submitted a request to evaluate an <code>MLModel</code>.</li>
     *        <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     *        <li> <code>FAILED</code> - The request to evaluate an
     *        <code>MLModel</code> did not run to completion. It is not usable.</li>
     *        <li> <code>COMPLETED</code> - The evaluation process completed
     *        successfully.</li>
     *        <li> <code>DELETED</code> - The <code>Evaluation</code> is marked
     *        as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityStatus
     */

    public GetEvaluationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the evaluation. This element can have one of the following
     * values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Language (Amazon ML) submitted
     * a request to evaluate an <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     * <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code>
     * did not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The evaluation process completed
     * successfully.</li>
     * <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as
     * deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the evaluation. This element can have one of the
     *        following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Language (Amazon ML)
     *        submitted a request to evaluate an <code>MLModel</code>.</li>
     *        <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     *        <li> <code>FAILED</code> - The request to evaluate an
     *        <code>MLModel</code> did not run to completion. It is not usable.</li>
     *        <li> <code>COMPLETED</code> - The evaluation process completed
     *        successfully.</li>
     *        <li> <code>DELETED</code> - The <code>Evaluation</code> is marked
     *        as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityStatus
     */

    public void setStatus(EntityStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the evaluation. This element can have one of the following
     * values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Language (Amazon ML) submitted
     * a request to evaluate an <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     * <li> <code>FAILED</code> - The request to evaluate an <code>MLModel</code>
     * did not run to completion. It is not usable.</li>
     * <li> <code>COMPLETED</code> - The evaluation process completed
     * successfully.</li>
     * <li> <code>DELETED</code> - The <code>Evaluation</code> is marked as
     * deleted. It is not usable.</li>
     * </ul>
     * 
     * @param status
     *        The status of the evaluation. This element can have one of the
     *        following values:</p>
     *        <ul>
     *        <li> <code>PENDING</code> - Amazon Machine Language (Amazon ML)
     *        submitted a request to evaluate an <code>MLModel</code>.</li>
     *        <li> <code>INPROGRESS</code> - The evaluation is underway.</li>
     *        <li> <code>FAILED</code> - The request to evaluate an
     *        <code>MLModel</code> did not run to completion. It is not usable.</li>
     *        <li> <code>COMPLETED</code> - The evaluation process completed
     *        successfully.</li>
     *        <li> <code>DELETED</code> - The <code>Evaluation</code> is marked
     *        as deleted. It is not usable.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityStatus
     */

    public GetEvaluationResult withStatus(EntityStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Measurements of how well the <code>MLModel</code> performed using
     * observations referenced by the <code>DataSource</code>. One of the
     * following metric is returned based on the type of the
     * <code>MLModel</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BinaryAUC: A binary <code>MLModel</code> uses the Area Under the Curve
     * (AUC) technique to measure performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RegressionRMSE: A regression <code>MLModel</code> uses the Root Mean
     * Square Error (RMSE) technique to measure performance. RMSE measures the
     * difference between predicted and actual values for a single variable.
     * </p>
     * </li>
     * <li>
     * <p>
     * MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1 score
     * technique to measure performance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about performance metrics, please see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     * </p>
     * 
     * @param performanceMetrics
     *        Measurements of how well the <code>MLModel</code> performed using
     *        observations referenced by the <code>DataSource</code>. One of the
     *        following metric is returned based on the type of the
     *        <code>MLModel</code>: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        BinaryAUC: A binary <code>MLModel</code> uses the Area Under the
     *        Curve (AUC) technique to measure performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RegressionRMSE: A regression <code>MLModel</code> uses the Root
     *        Mean Square Error (RMSE) technique to measure performance. RMSE
     *        measures the difference between predicted and actual values for a
     *        single variable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1
     *        score technique to measure performance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about performance metrics, please see the <a
     *        href
     *        ="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *        Machine Learning Developer Guide</a>.
     */

    public void setPerformanceMetrics(PerformanceMetrics performanceMetrics) {
        this.performanceMetrics = performanceMetrics;
    }

    /**
     * <p>
     * Measurements of how well the <code>MLModel</code> performed using
     * observations referenced by the <code>DataSource</code>. One of the
     * following metric is returned based on the type of the
     * <code>MLModel</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BinaryAUC: A binary <code>MLModel</code> uses the Area Under the Curve
     * (AUC) technique to measure performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RegressionRMSE: A regression <code>MLModel</code> uses the Root Mean
     * Square Error (RMSE) technique to measure performance. RMSE measures the
     * difference between predicted and actual values for a single variable.
     * </p>
     * </li>
     * <li>
     * <p>
     * MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1 score
     * technique to measure performance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about performance metrics, please see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     * </p>
     * 
     * @return Measurements of how well the <code>MLModel</code> performed using
     *         observations referenced by the <code>DataSource</code>. One of
     *         the following metric is returned based on the type of the
     *         <code>MLModel</code>: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         BinaryAUC: A binary <code>MLModel</code> uses the Area Under the
     *         Curve (AUC) technique to measure performance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RegressionRMSE: A regression <code>MLModel</code> uses the Root
     *         Mean Square Error (RMSE) technique to measure performance. RMSE
     *         measures the difference between predicted and actual values for a
     *         single variable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the
     *         F1 score technique to measure performance.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about performance metrics, please see the <a
     *         href
     *         ="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *         Machine Learning Developer Guide</a>.
     */

    public PerformanceMetrics getPerformanceMetrics() {
        return this.performanceMetrics;
    }

    /**
     * <p>
     * Measurements of how well the <code>MLModel</code> performed using
     * observations referenced by the <code>DataSource</code>. One of the
     * following metric is returned based on the type of the
     * <code>MLModel</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BinaryAUC: A binary <code>MLModel</code> uses the Area Under the Curve
     * (AUC) technique to measure performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RegressionRMSE: A regression <code>MLModel</code> uses the Root Mean
     * Square Error (RMSE) technique to measure performance. RMSE measures the
     * difference between predicted and actual values for a single variable.
     * </p>
     * </li>
     * <li>
     * <p>
     * MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1 score
     * technique to measure performance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about performance metrics, please see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     * </p>
     * 
     * @param performanceMetrics
     *        Measurements of how well the <code>MLModel</code> performed using
     *        observations referenced by the <code>DataSource</code>. One of the
     *        following metric is returned based on the type of the
     *        <code>MLModel</code>: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        BinaryAUC: A binary <code>MLModel</code> uses the Area Under the
     *        Curve (AUC) technique to measure performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RegressionRMSE: A regression <code>MLModel</code> uses the Root
     *        Mean Square Error (RMSE) technique to measure performance. RMSE
     *        measures the difference between predicted and actual values for a
     *        single variable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MulticlassAvgFScore: A multiclass <code>MLModel</code> uses the F1
     *        score technique to measure performance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about performance metrics, please see the <a
     *        href
     *        ="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     *        Machine Learning Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetEvaluationResult withPerformanceMetrics(
            PerformanceMetrics performanceMetrics) {
        setPerformanceMetrics(performanceMetrics);
        return this;
    }

    /**
     * <p>
     * A link to the file that contains logs of the <a>CreateEvaluation</a>
     * operation.
     * </p>
     * 
     * @param logUri
     *        A link to the file that contains logs of the
     *        <a>CreateEvaluation</a> operation.
     */

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * A link to the file that contains logs of the <a>CreateEvaluation</a>
     * operation.
     * </p>
     * 
     * @return A link to the file that contains logs of the
     *         <a>CreateEvaluation</a> operation.
     */

    public String getLogUri() {
        return this.logUri;
    }

    /**
     * <p>
     * A link to the file that contains logs of the <a>CreateEvaluation</a>
     * operation.
     * </p>
     * 
     * @param logUri
     *        A link to the file that contains logs of the
     *        <a>CreateEvaluation</a> operation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetEvaluationResult withLogUri(String logUri) {
        setLogUri(logUri);
        return this;
    }

    /**
     * <p>
     * A description of the most recent details about evaluating the
     * <code>MLModel</code>.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about evaluating the
     *        <code>MLModel</code>.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the most recent details about evaluating the
     * <code>MLModel</code>.
     * </p>
     * 
     * @return A description of the most recent details about evaluating the
     *         <code>MLModel</code>.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the most recent details about evaluating the
     * <code>MLModel</code>.
     * </p>
     * 
     * @param message
     *        A description of the most recent details about evaluating the
     *        <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetEvaluationResult withMessage(String message) {
        setMessage(message);
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
        if (getEvaluationId() != null)
            sb.append("EvaluationId: " + getEvaluationId() + ",");
        if (getMLModelId() != null)
            sb.append("MLModelId: " + getMLModelId() + ",");
        if (getEvaluationDataSourceId() != null)
            sb.append("EvaluationDataSourceId: " + getEvaluationDataSourceId()
                    + ",");
        if (getInputDataLocationS3() != null)
            sb.append("InputDataLocationS3: " + getInputDataLocationS3() + ",");
        if (getCreatedByIamUser() != null)
            sb.append("CreatedByIamUser: " + getCreatedByIamUser() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getPerformanceMetrics() != null)
            sb.append("PerformanceMetrics: " + getPerformanceMetrics() + ",");
        if (getLogUri() != null)
            sb.append("LogUri: " + getLogUri() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEvaluationResult == false)
            return false;
        GetEvaluationResult other = (GetEvaluationResult) obj;
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null)
            return false;
        if (other.getEvaluationId() != null
                && other.getEvaluationId().equals(this.getEvaluationId()) == false)
            return false;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null
                && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getEvaluationDataSourceId() == null
                ^ this.getEvaluationDataSourceId() == null)
            return false;
        if (other.getEvaluationDataSourceId() != null
                && other.getEvaluationDataSourceId().equals(
                        this.getEvaluationDataSourceId()) == false)
            return false;
        if (other.getInputDataLocationS3() == null
                ^ this.getInputDataLocationS3() == null)
            return false;
        if (other.getInputDataLocationS3() != null
                && other.getInputDataLocationS3().equals(
                        this.getInputDataLocationS3()) == false)
            return false;
        if (other.getCreatedByIamUser() == null
                ^ this.getCreatedByIamUser() == null)
            return false;
        if (other.getCreatedByIamUser() != null
                && other.getCreatedByIamUser().equals(
                        this.getCreatedByIamUser()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null
                && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPerformanceMetrics() == null
                ^ this.getPerformanceMetrics() == null)
            return false;
        if (other.getPerformanceMetrics() != null
                && other.getPerformanceMetrics().equals(
                        this.getPerformanceMetrics()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null
                && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null
                && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEvaluationId() == null) ? 0 : getEvaluationId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime
                * hashCode
                + ((getEvaluationDataSourceId() == null) ? 0
                        : getEvaluationDataSourceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getInputDataLocationS3() == null) ? 0
                        : getInputDataLocationS3().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreatedByIamUser() == null) ? 0 : getCreatedByIamUser()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getPerformanceMetrics() == null) ? 0
                        : getPerformanceMetrics().hashCode());
        hashCode = prime * hashCode
                + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode
                + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public GetEvaluationResult clone() {
        try {
            return (GetEvaluationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
