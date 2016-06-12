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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeRulesPackagesRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN(s) specifying the rules package(s) that you want to describe.
     * </p>
     */
    private java.util.List<String> rulesPackageArns;
    /**
     * <p>
     * The locale that you want to translate a rules package description(s)
     * into.
     * </p>
     */
    private String locale;

    /**
     * <p>
     * The ARN(s) specifying the rules package(s) that you want to describe.
     * </p>
     * 
     * @return The ARN(s) specifying the rules package(s) that you want to
     *         describe.
     */

    public java.util.List<String> getRulesPackageArns() {
        return rulesPackageArns;
    }

    /**
     * <p>
     * The ARN(s) specifying the rules package(s) that you want to describe.
     * </p>
     * 
     * @param rulesPackageArns
     *        The ARN(s) specifying the rules package(s) that you want to
     *        describe.
     */

    public void setRulesPackageArns(
            java.util.Collection<String> rulesPackageArns) {
        if (rulesPackageArns == null) {
            this.rulesPackageArns = null;
            return;
        }

        this.rulesPackageArns = new java.util.ArrayList<String>(
                rulesPackageArns);
    }

    /**
     * <p>
     * The ARN(s) specifying the rules package(s) that you want to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRulesPackageArns(java.util.Collection)} or
     * {@link #withRulesPackageArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param rulesPackageArns
     *        The ARN(s) specifying the rules package(s) that you want to
     *        describe.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeRulesPackagesRequest withRulesPackageArns(
            String... rulesPackageArns) {
        if (this.rulesPackageArns == null) {
            setRulesPackageArns(new java.util.ArrayList<String>(
                    rulesPackageArns.length));
        }
        for (String ele : rulesPackageArns) {
            this.rulesPackageArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN(s) specifying the rules package(s) that you want to describe.
     * </p>
     * 
     * @param rulesPackageArns
     *        The ARN(s) specifying the rules package(s) that you want to
     *        describe.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeRulesPackagesRequest withRulesPackageArns(
            java.util.Collection<String> rulesPackageArns) {
        setRulesPackageArns(rulesPackageArns);
        return this;
    }

    /**
     * <p>
     * The locale that you want to translate a rules package description(s)
     * into.
     * </p>
     * 
     * @param locale
     *        The locale that you want to translate a rules package
     *        description(s) into.
     * @see Locale
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale that you want to translate a rules package description(s)
     * into.
     * </p>
     * 
     * @return The locale that you want to translate a rules package
     *         description(s) into.
     * @see Locale
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The locale that you want to translate a rules package description(s)
     * into.
     * </p>
     * 
     * @param locale
     *        The locale that you want to translate a rules package
     *        description(s) into.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Locale
     */

    public DescribeRulesPackagesRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The locale that you want to translate a rules package description(s)
     * into.
     * </p>
     * 
     * @param locale
     *        The locale that you want to translate a rules package
     *        description(s) into.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Locale
     */

    public void setLocale(Locale locale) {
        this.locale = locale.toString();
    }

    /**
     * <p>
     * The locale that you want to translate a rules package description(s)
     * into.
     * </p>
     * 
     * @param locale
     *        The locale that you want to translate a rules package
     *        description(s) into.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Locale
     */

    public DescribeRulesPackagesRequest withLocale(Locale locale) {
        setLocale(locale);
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
        if (getRulesPackageArns() != null)
            sb.append("RulesPackageArns: " + getRulesPackageArns() + ",");
        if (getLocale() != null)
            sb.append("Locale: " + getLocale());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRulesPackagesRequest == false)
            return false;
        DescribeRulesPackagesRequest other = (DescribeRulesPackagesRequest) obj;
        if (other.getRulesPackageArns() == null
                ^ this.getRulesPackageArns() == null)
            return false;
        if (other.getRulesPackageArns() != null
                && other.getRulesPackageArns().equals(
                        this.getRulesPackageArns()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null
                && other.getLocale().equals(this.getLocale()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRulesPackageArns() == null) ? 0 : getRulesPackageArns()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLocale() == null) ? 0 : getLocale().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRulesPackagesRequest clone() {
        return (DescribeRulesPackagesRequest) super.clone();
    }
}