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

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the results of a simulation.
 * </p>
 * <p>
 * This data type is used by the return parameter of
 * <code><a>SimulatePolicy</a></code>.
 * </p>
 */
public class EvaluationResult implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the API action tested on the indicated resource.
     * </p>
     */
    private String evalActionName;
    /**
     * <p>
     * The ARN of the resource that the indicated API action was tested on.
     * </p>
     */
    private String evalResourceName;
    /**
     * <p>
     * The result of the simulation.
     * </p>
     */
    private String evalDecision;
    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this scenario. Remember that even if multiple statements allow the
     * action on the resource, if only one statement denies that action, then
     * the explicit deny overrides any allow, and the deny statement is the only
     * entry included in the result.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Statement> matchedStatements;
    /**
     * <p>
     * A list of context keys that are required by the included input policies
     * but that were not provided by one of the input parameters. To discover
     * the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <caution>
     * <p>
     * If the response includes any keys in this list, then the reported results
     * might be untrustworthy because the simulation could not completely
     * evaluate all of the conditions specified in the policies that would occur
     * in a real world request.
     * </p>
     * </caution>
     */
    private com.amazonaws.internal.SdkInternalList<String> missingContextValues;
    /**
     * <p>
     * Additional details about the results of the evaluation decision. When
     * there are both IAM policies and resource policies, this parameter
     * explains how each set of policies contributes to the final evaluation
     * decision. When simulating cross-account access to a resource, both the
     * resource-based policy and the caller's IAM policy must grant access. See
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html"
     * >How IAM Roles Differ from Resource-based Policies</a>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> evalDecisionDetails;
    /**
     * <p>
     * The individual results of the simulation of the API action specified in
     * EvalActionName on each resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceSpecificResult> resourceSpecificResults;

    /**
     * <p>
     * The name of the API action tested on the indicated resource.
     * </p>
     * 
     * @param evalActionName
     *        The name of the API action tested on the indicated resource.
     */

    public void setEvalActionName(String evalActionName) {
        this.evalActionName = evalActionName;
    }

    /**
     * <p>
     * The name of the API action tested on the indicated resource.
     * </p>
     * 
     * @return The name of the API action tested on the indicated resource.
     */

    public String getEvalActionName() {
        return this.evalActionName;
    }

    /**
     * <p>
     * The name of the API action tested on the indicated resource.
     * </p>
     * 
     * @param evalActionName
     *        The name of the API action tested on the indicated resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EvaluationResult withEvalActionName(String evalActionName) {
        setEvalActionName(evalActionName);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource that the indicated API action was tested on.
     * </p>
     * 
     * @param evalResourceName
     *        The ARN of the resource that the indicated API action was tested
     *        on.
     */

    public void setEvalResourceName(String evalResourceName) {
        this.evalResourceName = evalResourceName;
    }

    /**
     * <p>
     * The ARN of the resource that the indicated API action was tested on.
     * </p>
     * 
     * @return The ARN of the resource that the indicated API action was tested
     *         on.
     */

    public String getEvalResourceName() {
        return this.evalResourceName;
    }

    /**
     * <p>
     * The ARN of the resource that the indicated API action was tested on.
     * </p>
     * 
     * @param evalResourceName
     *        The ARN of the resource that the indicated API action was tested
     *        on.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EvaluationResult withEvalResourceName(String evalResourceName) {
        setEvalResourceName(evalResourceName);
        return this;
    }

    /**
     * <p>
     * The result of the simulation.
     * </p>
     * 
     * @param evalDecision
     *        The result of the simulation.
     * @see PolicyEvaluationDecisionType
     */

    public void setEvalDecision(String evalDecision) {
        this.evalDecision = evalDecision;
    }

    /**
     * <p>
     * The result of the simulation.
     * </p>
     * 
     * @return The result of the simulation.
     * @see PolicyEvaluationDecisionType
     */

    public String getEvalDecision() {
        return this.evalDecision;
    }

    /**
     * <p>
     * The result of the simulation.
     * </p>
     * 
     * @param evalDecision
     *        The result of the simulation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PolicyEvaluationDecisionType
     */

    public EvaluationResult withEvalDecision(String evalDecision) {
        setEvalDecision(evalDecision);
        return this;
    }

    /**
     * <p>
     * The result of the simulation.
     * </p>
     * 
     * @param evalDecision
     *        The result of the simulation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PolicyEvaluationDecisionType
     */

    public void setEvalDecision(PolicyEvaluationDecisionType evalDecision) {
        this.evalDecision = evalDecision.toString();
    }

    /**
     * <p>
     * The result of the simulation.
     * </p>
     * 
     * @param evalDecision
     *        The result of the simulation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PolicyEvaluationDecisionType
     */

    public EvaluationResult withEvalDecision(
            PolicyEvaluationDecisionType evalDecision) {
        setEvalDecision(evalDecision);
        return this;
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this scenario. Remember that even if multiple statements allow the
     * action on the resource, if only one statement denies that action, then
     * the explicit deny overrides any allow, and the deny statement is the only
     * entry included in the result.
     * </p>
     * 
     * @return A list of the statements in the input policies that determine the
     *         result for this scenario. Remember that even if multiple
     *         statements allow the action on the resource, if only one
     *         statement denies that action, then the explicit deny overrides
     *         any allow, and the deny statement is the only entry included in
     *         the result.
     */

    public java.util.List<Statement> getMatchedStatements() {
        if (matchedStatements == null) {
            matchedStatements = new com.amazonaws.internal.SdkInternalList<Statement>();
        }
        return matchedStatements;
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this scenario. Remember that even if multiple statements allow the
     * action on the resource, if only one statement denies that action, then
     * the explicit deny overrides any allow, and the deny statement is the only
     * entry included in the result.
     * </p>
     * 
     * @param matchedStatements
     *        A list of the statements in the input policies that determine the
     *        result for this scenario. Remember that even if multiple
     *        statements allow the action on the resource, if only one statement
     *        denies that action, then the explicit deny overrides any allow,
     *        and the deny statement is the only entry included in the result.
     */

    public void setMatchedStatements(
            java.util.Collection<Statement> matchedStatements) {
        if (matchedStatements == null) {
            this.matchedStatements = null;
            return;
        }

        this.matchedStatements = new com.amazonaws.internal.SdkInternalList<Statement>(
                matchedStatements);
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this scenario. Remember that even if multiple statements allow the
     * action on the resource, if only one statement denies that action, then
     * the explicit deny overrides any allow, and the deny statement is the only
     * entry included in the result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMatchedStatements(java.util.Collection)} or
     * {@link #withMatchedStatements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param matchedStatements
     *        A list of the statements in the input policies that determine the
     *        result for this scenario. Remember that even if multiple
     *        statements allow the action on the resource, if only one statement
     *        denies that action, then the explicit deny overrides any allow,
     *        and the deny statement is the only entry included in the result.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EvaluationResult withMatchedStatements(
            Statement... matchedStatements) {
        if (this.matchedStatements == null) {
            setMatchedStatements(new com.amazonaws.internal.SdkInternalList<Statement>(
                    matchedStatements.length));
        }
        for (Statement ele : matchedStatements) {
            this.matchedStatements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the statements in the input policies that determine the result
     * for this scenario. Remember that even if multiple statements allow the
     * action on the resource, if only one statement denies that action, then
     * the explicit deny overrides any allow, and the deny statement is the only
     * entry included in the result.
     * </p>
     * 
     * @param matchedStatements
     *        A list of the statements in the input policies that determine the
     *        result for this scenario. Remember that even if multiple
     *        statements allow the action on the resource, if only one statement
     *        denies that action, then the explicit deny overrides any allow,
     *        and the deny statement is the only entry included in the result.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EvaluationResult withMatchedStatements(
            java.util.Collection<Statement> matchedStatements) {
        setMatchedStatements(matchedStatements);
        return this;
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies
     * but that were not provided by one of the input parameters. To discover
     * the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <caution>
     * <p>
     * If the response includes any keys in this list, then the reported results
     * might be untrustworthy because the simulation could not completely
     * evaluate all of the conditions specified in the policies that would occur
     * in a real world request.
     * </p>
     * </caution>
     * 
     * @return A list of context keys that are required by the included input
     *         policies but that were not provided by one of the input
     *         parameters. To discover the context keys used by a set of
     *         policies, you can call <a>GetContextKeysForCustomPolicy</a> or
     *         <a>GetContextKeysForPrincipalPolicy</a>.</p> <caution>
     *         <p>
     *         If the response includes any keys in this list, then the reported
     *         results might be untrustworthy because the simulation could not
     *         completely evaluate all of the conditions specified in the
     *         policies that would occur in a real world request.
     *         </p>
     */

    public java.util.List<String> getMissingContextValues() {
        if (missingContextValues == null) {
            missingContextValues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return missingContextValues;
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies
     * but that were not provided by one of the input parameters. To discover
     * the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <caution>
     * <p>
     * If the response includes any keys in this list, then the reported results
     * might be untrustworthy because the simulation could not completely
     * evaluate all of the conditions specified in the policies that would occur
     * in a real world request.
     * </p>
     * </caution>
     * 
     * @param missingContextValues
     *        A list of context keys that are required by the included input
     *        policies but that were not provided by one of the input
     *        parameters. To discover the context keys used by a set of
     *        policies, you can call <a>GetContextKeysForCustomPolicy</a> or
     *        <a>GetContextKeysForPrincipalPolicy</a>.</p> <caution>
     *        <p>
     *        If the response includes any keys in this list, then the reported
     *        results might be untrustworthy because the simulation could not
     *        completely evaluate all of the conditions specified in the
     *        policies that would occur in a real world request.
     *        </p>
     */

    public void setMissingContextValues(
            java.util.Collection<String> missingContextValues) {
        if (missingContextValues == null) {
            this.missingContextValues = null;
            return;
        }

        this.missingContextValues = new com.amazonaws.internal.SdkInternalList<String>(
                missingContextValues);
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies
     * but that were not provided by one of the input parameters. To discover
     * the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <caution>
     * <p>
     * If the response includes any keys in this list, then the reported results
     * might be untrustworthy because the simulation could not completely
     * evaluate all of the conditions specified in the policies that would occur
     * in a real world request.
     * </p>
     * </caution>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMissingContextValues(java.util.Collection)} or
     * {@link #withMissingContextValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param missingContextValues
     *        A list of context keys that are required by the included input
     *        policies but that were not provided by one of the input
     *        parameters. To discover the context keys used by a set of
     *        policies, you can call <a>GetContextKeysForCustomPolicy</a> or
     *        <a>GetContextKeysForPrincipalPolicy</a>.</p> <caution>
     *        <p>
     *        If the response includes any keys in this list, then the reported
     *        results might be untrustworthy because the simulation could not
     *        completely evaluate all of the conditions specified in the
     *        policies that would occur in a real world request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EvaluationResult withMissingContextValues(
            String... missingContextValues) {
        if (this.missingContextValues == null) {
            setMissingContextValues(new com.amazonaws.internal.SdkInternalList<String>(
                    missingContextValues.length));
        }
        for (String ele : missingContextValues) {
            this.missingContextValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of context keys that are required by the included input policies
     * but that were not provided by one of the input parameters. To discover
     * the context keys used by a set of policies, you can call
     * <a>GetContextKeysForCustomPolicy</a> or
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <caution>
     * <p>
     * If the response includes any keys in this list, then the reported results
     * might be untrustworthy because the simulation could not completely
     * evaluate all of the conditions specified in the policies that would occur
     * in a real world request.
     * </p>
     * </caution>
     * 
     * @param missingContextValues
     *        A list of context keys that are required by the included input
     *        policies but that were not provided by one of the input
     *        parameters. To discover the context keys used by a set of
     *        policies, you can call <a>GetContextKeysForCustomPolicy</a> or
     *        <a>GetContextKeysForPrincipalPolicy</a>.</p> <caution>
     *        <p>
     *        If the response includes any keys in this list, then the reported
     *        results might be untrustworthy because the simulation could not
     *        completely evaluate all of the conditions specified in the
     *        policies that would occur in a real world request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EvaluationResult withMissingContextValues(
            java.util.Collection<String> missingContextValues) {
        setMissingContextValues(missingContextValues);
        return this;
    }

    /**
     * <p>
     * Additional details about the results of the evaluation decision. When
     * there are both IAM policies and resource policies, this parameter
     * explains how each set of policies contributes to the final evaluation
     * decision. When simulating cross-account access to a resource, both the
     * resource-based policy and the caller's IAM policy must grant access. See
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html"
     * >How IAM Roles Differ from Resource-based Policies</a>
     * </p>
     * 
     * @return Additional details about the results of the evaluation decision.
     *         When there are both IAM policies and resource policies, this
     *         parameter explains how each set of policies contributes to the
     *         final evaluation decision. When simulating cross-account access
     *         to a resource, both the resource-based policy and the caller's
     *         IAM policy must grant access. See <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html"
     *         >How IAM Roles Differ from Resource-based Policies</a>
     */

    public java.util.Map<String, String> getEvalDecisionDetails() {
        if (evalDecisionDetails == null) {
            evalDecisionDetails = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return evalDecisionDetails;
    }

    /**
     * <p>
     * Additional details about the results of the evaluation decision. When
     * there are both IAM policies and resource policies, this parameter
     * explains how each set of policies contributes to the final evaluation
     * decision. When simulating cross-account access to a resource, both the
     * resource-based policy and the caller's IAM policy must grant access. See
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html"
     * >How IAM Roles Differ from Resource-based Policies</a>
     * </p>
     * 
     * @param evalDecisionDetails
     *        Additional details about the results of the evaluation decision.
     *        When there are both IAM policies and resource policies, this
     *        parameter explains how each set of policies contributes to the
     *        final evaluation decision. When simulating cross-account access to
     *        a resource, both the resource-based policy and the caller's IAM
     *        policy must grant access. See <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html"
     *        >How IAM Roles Differ from Resource-based Policies</a>
     */

    public void setEvalDecisionDetails(
            java.util.Map<String, String> evalDecisionDetails) {
        this.evalDecisionDetails = evalDecisionDetails == null ? null
                : new com.amazonaws.internal.SdkInternalMap<String, String>(
                        evalDecisionDetails);
    }

    /**
     * <p>
     * Additional details about the results of the evaluation decision. When
     * there are both IAM policies and resource policies, this parameter
     * explains how each set of policies contributes to the final evaluation
     * decision. When simulating cross-account access to a resource, both the
     * resource-based policy and the caller's IAM policy must grant access. See
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html"
     * >How IAM Roles Differ from Resource-based Policies</a>
     * </p>
     * 
     * @param evalDecisionDetails
     *        Additional details about the results of the evaluation decision.
     *        When there are both IAM policies and resource policies, this
     *        parameter explains how each set of policies contributes to the
     *        final evaluation decision. When simulating cross-account access to
     *        a resource, both the resource-based policy and the caller's IAM
     *        policy must grant access. See <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_compare-resource-policies.html"
     *        >How IAM Roles Differ from Resource-based Policies</a>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EvaluationResult withEvalDecisionDetails(
            java.util.Map<String, String> evalDecisionDetails) {
        setEvalDecisionDetails(evalDecisionDetails);
        return this;
    }

    public EvaluationResult addEvalDecisionDetailsEntry(String key, String value) {
        if (null == this.evalDecisionDetails) {
            this.evalDecisionDetails = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.evalDecisionDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.evalDecisionDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EvalDecisionDetails. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */

    public EvaluationResult clearEvalDecisionDetailsEntries() {
        this.evalDecisionDetails = null;
        return this;
    }

    /**
     * <p>
     * The individual results of the simulation of the API action specified in
     * EvalActionName on each resource.
     * </p>
     * 
     * @return The individual results of the simulation of the API action
     *         specified in EvalActionName on each resource.
     */

    public java.util.List<ResourceSpecificResult> getResourceSpecificResults() {
        if (resourceSpecificResults == null) {
            resourceSpecificResults = new com.amazonaws.internal.SdkInternalList<ResourceSpecificResult>();
        }
        return resourceSpecificResults;
    }

    /**
     * <p>
     * The individual results of the simulation of the API action specified in
     * EvalActionName on each resource.
     * </p>
     * 
     * @param resourceSpecificResults
     *        The individual results of the simulation of the API action
     *        specified in EvalActionName on each resource.
     */

    public void setResourceSpecificResults(
            java.util.Collection<ResourceSpecificResult> resourceSpecificResults) {
        if (resourceSpecificResults == null) {
            this.resourceSpecificResults = null;
            return;
        }

        this.resourceSpecificResults = new com.amazonaws.internal.SdkInternalList<ResourceSpecificResult>(
                resourceSpecificResults);
    }

    /**
     * <p>
     * The individual results of the simulation of the API action specified in
     * EvalActionName on each resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceSpecificResults(java.util.Collection)} or
     * {@link #withResourceSpecificResults(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceSpecificResults
     *        The individual results of the simulation of the API action
     *        specified in EvalActionName on each resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EvaluationResult withResourceSpecificResults(
            ResourceSpecificResult... resourceSpecificResults) {
        if (this.resourceSpecificResults == null) {
            setResourceSpecificResults(new com.amazonaws.internal.SdkInternalList<ResourceSpecificResult>(
                    resourceSpecificResults.length));
        }
        for (ResourceSpecificResult ele : resourceSpecificResults) {
            this.resourceSpecificResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The individual results of the simulation of the API action specified in
     * EvalActionName on each resource.
     * </p>
     * 
     * @param resourceSpecificResults
     *        The individual results of the simulation of the API action
     *        specified in EvalActionName on each resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EvaluationResult withResourceSpecificResults(
            java.util.Collection<ResourceSpecificResult> resourceSpecificResults) {
        setResourceSpecificResults(resourceSpecificResults);
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
        if (getEvalActionName() != null)
            sb.append("EvalActionName: " + getEvalActionName() + ",");
        if (getEvalResourceName() != null)
            sb.append("EvalResourceName: " + getEvalResourceName() + ",");
        if (getEvalDecision() != null)
            sb.append("EvalDecision: " + getEvalDecision() + ",");
        if (getMatchedStatements() != null)
            sb.append("MatchedStatements: " + getMatchedStatements() + ",");
        if (getMissingContextValues() != null)
            sb.append("MissingContextValues: " + getMissingContextValues()
                    + ",");
        if (getEvalDecisionDetails() != null)
            sb.append("EvalDecisionDetails: " + getEvalDecisionDetails() + ",");
        if (getResourceSpecificResults() != null)
            sb.append("ResourceSpecificResults: "
                    + getResourceSpecificResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationResult == false)
            return false;
        EvaluationResult other = (EvaluationResult) obj;
        if (other.getEvalActionName() == null
                ^ this.getEvalActionName() == null)
            return false;
        if (other.getEvalActionName() != null
                && other.getEvalActionName().equals(this.getEvalActionName()) == false)
            return false;
        if (other.getEvalResourceName() == null
                ^ this.getEvalResourceName() == null)
            return false;
        if (other.getEvalResourceName() != null
                && other.getEvalResourceName().equals(
                        this.getEvalResourceName()) == false)
            return false;
        if (other.getEvalDecision() == null ^ this.getEvalDecision() == null)
            return false;
        if (other.getEvalDecision() != null
                && other.getEvalDecision().equals(this.getEvalDecision()) == false)
            return false;
        if (other.getMatchedStatements() == null
                ^ this.getMatchedStatements() == null)
            return false;
        if (other.getMatchedStatements() != null
                && other.getMatchedStatements().equals(
                        this.getMatchedStatements()) == false)
            return false;
        if (other.getMissingContextValues() == null
                ^ this.getMissingContextValues() == null)
            return false;
        if (other.getMissingContextValues() != null
                && other.getMissingContextValues().equals(
                        this.getMissingContextValues()) == false)
            return false;
        if (other.getEvalDecisionDetails() == null
                ^ this.getEvalDecisionDetails() == null)
            return false;
        if (other.getEvalDecisionDetails() != null
                && other.getEvalDecisionDetails().equals(
                        this.getEvalDecisionDetails()) == false)
            return false;
        if (other.getResourceSpecificResults() == null
                ^ this.getResourceSpecificResults() == null)
            return false;
        if (other.getResourceSpecificResults() != null
                && other.getResourceSpecificResults().equals(
                        this.getResourceSpecificResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEvalActionName() == null) ? 0 : getEvalActionName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEvalResourceName() == null) ? 0 : getEvalResourceName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEvalDecision() == null) ? 0 : getEvalDecision()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMatchedStatements() == null) ? 0
                        : getMatchedStatements().hashCode());
        hashCode = prime
                * hashCode
                + ((getMissingContextValues() == null) ? 0
                        : getMissingContextValues().hashCode());
        hashCode = prime
                * hashCode
                + ((getEvalDecisionDetails() == null) ? 0
                        : getEvalDecisionDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceSpecificResults() == null) ? 0
                        : getResourceSpecificResults().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationResult clone() {
        try {
            return (EvaluationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
