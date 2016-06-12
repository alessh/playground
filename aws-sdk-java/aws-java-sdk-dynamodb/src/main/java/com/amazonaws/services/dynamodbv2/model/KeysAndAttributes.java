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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a set of primary keys and, for each key, the attributes to
 * retrieve from the table.
 * </p>
 * <p>
 * For each primary key, you must provide <i>all</i> of the key attributes. For
 * example, with a simple primary key, you only need to provide the partition
 * key. For a composite primary key, you must provide <i>both</i> the partition
 * key and the sort key.
 * </p>
 */
public class KeysAndAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The primary key attribute values that define the items and the attributes
     * associated with the items.
     * </p>
     */
    private java.util.List<java.util.Map<String, AttributeValue>> keys;
    /**
     * <p>
     * One or more attributes to retrieve from the table or index. If no
     * attribute names are specified then all attributes will be returned. If
     * any of the specified attributes are not found, they will not appear in
     * the result.
     * </p>
     */
    private java.util.List<String> attributesToGet;
    /**
     * <p>
     * The consistency of a read operation. If set to <code>true</code>, then a
     * strongly consistent read is used; otherwise, an eventually consistent
     * read is used.
     * </p>
     */
    private Boolean consistentRead;
    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a JSON
     * document. The attributes in the <i>ProjectionExpression</i> must be
     * separated by commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not
     * appear in the result.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i>
     * parameter.
     * </p>
     * </note>
     */
    private String projectionExpression;
    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The
     * following are some use cases for using <i>ExpressionAttributeNames</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved
     * word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in
     * an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being
     * misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute
     * name. For example, consider the following attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot
     * be used directly in an expression. (For the complete list of reserved
     * words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To
     * work around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute
     * values</i>, which are placeholders for the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> expressionAttributeNames;

    /**
     * <p>
     * The primary key attribute values that define the items and the attributes
     * associated with the items.
     * </p>
     * 
     * @return The primary key attribute values that define the items and the
     *         attributes associated with the items.
     */

    public java.util.List<java.util.Map<String, AttributeValue>> getKeys() {
        return keys;
    }

    /**
     * <p>
     * The primary key attribute values that define the items and the attributes
     * associated with the items.
     * </p>
     * 
     * @param keys
     *        The primary key attribute values that define the items and the
     *        attributes associated with the items.
     */

    public void setKeys(
            java.util.Collection<java.util.Map<String, AttributeValue>> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<java.util.Map<String, AttributeValue>>(
                keys);
    }

    /**
     * <p>
     * The primary key attribute values that define the items and the attributes
     * associated with the items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setKeys(java.util.Collection)} or
     * {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        The primary key attribute values that define the items and the
     *        attributes associated with the items.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeysAndAttributes withKeys(
            java.util.Map<String, AttributeValue>... keys) {
        if (this.keys == null) {
            setKeys(new java.util.ArrayList<java.util.Map<String, AttributeValue>>(
                    keys.length));
        }
        for (java.util.Map<String, AttributeValue> ele : keys) {
            this.keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The primary key attribute values that define the items and the attributes
     * associated with the items.
     * </p>
     * 
     * @param keys
     *        The primary key attribute values that define the items and the
     *        attributes associated with the items.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeysAndAttributes withKeys(
            java.util.Collection<java.util.Map<String, AttributeValue>> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * <p>
     * One or more attributes to retrieve from the table or index. If no
     * attribute names are specified then all attributes will be returned. If
     * any of the specified attributes are not found, they will not appear in
     * the result.
     * </p>
     * 
     * @return One or more attributes to retrieve from the table or index. If no
     *         attribute names are specified then all attributes will be
     *         returned. If any of the specified attributes are not found, they
     *         will not appear in the result.
     */

    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }

    /**
     * <p>
     * One or more attributes to retrieve from the table or index. If no
     * attribute names are specified then all attributes will be returned. If
     * any of the specified attributes are not found, they will not appear in
     * the result.
     * </p>
     * 
     * @param attributesToGet
     *        One or more attributes to retrieve from the table or index. If no
     *        attribute names are specified then all attributes will be
     *        returned. If any of the specified attributes are not found, they
     *        will not appear in the result.
     */

    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        this.attributesToGet = new java.util.ArrayList<String>(attributesToGet);
    }

    /**
     * <p>
     * One or more attributes to retrieve from the table or index. If no
     * attribute names are specified then all attributes will be returned. If
     * any of the specified attributes are not found, they will not appear in
     * the result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAttributesToGet(java.util.Collection)} or
     * {@link #withAttributesToGet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributesToGet
     *        One or more attributes to retrieve from the table or index. If no
     *        attribute names are specified then all attributes will be
     *        returned. If any of the specified attributes are not found, they
     *        will not appear in the result.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeysAndAttributes withAttributesToGet(String... attributesToGet) {
        if (this.attributesToGet == null) {
            setAttributesToGet(new java.util.ArrayList<String>(
                    attributesToGet.length));
        }
        for (String ele : attributesToGet) {
            this.attributesToGet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more attributes to retrieve from the table or index. If no
     * attribute names are specified then all attributes will be returned. If
     * any of the specified attributes are not found, they will not appear in
     * the result.
     * </p>
     * 
     * @param attributesToGet
     *        One or more attributes to retrieve from the table or index. If no
     *        attribute names are specified then all attributes will be
     *        returned. If any of the specified attributes are not found, they
     *        will not appear in the result.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeysAndAttributes withAttributesToGet(
            java.util.Collection<String> attributesToGet) {
        setAttributesToGet(attributesToGet);
        return this;
    }

    /**
     * <p>
     * The consistency of a read operation. If set to <code>true</code>, then a
     * strongly consistent read is used; otherwise, an eventually consistent
     * read is used.
     * </p>
     * 
     * @param consistentRead
     *        The consistency of a read operation. If set to <code>true</code>,
     *        then a strongly consistent read is used; otherwise, an eventually
     *        consistent read is used.
     */

    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    /**
     * <p>
     * The consistency of a read operation. If set to <code>true</code>, then a
     * strongly consistent read is used; otherwise, an eventually consistent
     * read is used.
     * </p>
     * 
     * @return The consistency of a read operation. If set to <code>true</code>,
     *         then a strongly consistent read is used; otherwise, an eventually
     *         consistent read is used.
     */

    public Boolean getConsistentRead() {
        return this.consistentRead;
    }

    /**
     * <p>
     * The consistency of a read operation. If set to <code>true</code>, then a
     * strongly consistent read is used; otherwise, an eventually consistent
     * read is used.
     * </p>
     * 
     * @param consistentRead
     *        The consistency of a read operation. If set to <code>true</code>,
     *        then a strongly consistent read is used; otherwise, an eventually
     *        consistent read is used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeysAndAttributes withConsistentRead(Boolean consistentRead) {
        setConsistentRead(consistentRead);
        return this;
    }

    /**
     * <p>
     * The consistency of a read operation. If set to <code>true</code>, then a
     * strongly consistent read is used; otherwise, an eventually consistent
     * read is used.
     * </p>
     * 
     * @return The consistency of a read operation. If set to <code>true</code>,
     *         then a strongly consistent read is used; otherwise, an eventually
     *         consistent read is used.
     */

    public Boolean isConsistentRead() {
        return this.consistentRead;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a JSON
     * document. The attributes in the <i>ProjectionExpression</i> must be
     * separated by commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not
     * appear in the result.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i>
     * parameter.
     * </p>
     * </note>
     * 
     * @param projectionExpression
     *        A string that identifies one or more attributes to retrieve from
     *        the table. These attributes can include scalars, sets, or elements
     *        of a JSON document. The attributes in the
     *        <i>ProjectionExpression</i> must be separated by commas.</p>
     *        <p>
     *        If no attribute names are specified, then all attributes will be
     *        returned. If any of the requested attributes are not found, they
     *        will not appear in the result.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     *        Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>ProjectionExpression</i> replaces the legacy
     *        <i>AttributesToGet</i> parameter.
     *        </p>
     */

    public void setProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a JSON
     * document. The attributes in the <i>ProjectionExpression</i> must be
     * separated by commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not
     * appear in the result.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i>
     * parameter.
     * </p>
     * </note>
     * 
     * @return A string that identifies one or more attributes to retrieve from
     *         the table. These attributes can include scalars, sets, or
     *         elements of a JSON document. The attributes in the
     *         <i>ProjectionExpression</i> must be separated by commas.</p>
     *         <p>
     *         If no attribute names are specified, then all attributes will be
     *         returned. If any of the requested attributes are not found, they
     *         will not appear in the result.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *         >Accessing Item Attributes</a> in the <i>Amazon DynamoDB
     *         Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         <i>ProjectionExpression</i> replaces the legacy
     *         <i>AttributesToGet</i> parameter.
     *         </p>
     */

    public String getProjectionExpression() {
        return this.projectionExpression;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a JSON
     * document. The attributes in the <i>ProjectionExpression</i> must be
     * separated by commas.
     * </p>
     * <p>
     * If no attribute names are specified, then all attributes will be
     * returned. If any of the requested attributes are not found, they will not
     * appear in the result.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>ProjectionExpression</i> replaces the legacy <i>AttributesToGet</i>
     * parameter.
     * </p>
     * </note>
     * 
     * @param projectionExpression
     *        A string that identifies one or more attributes to retrieve from
     *        the table. These attributes can include scalars, sets, or elements
     *        of a JSON document. The attributes in the
     *        <i>ProjectionExpression</i> must be separated by commas.</p>
     *        <p>
     *        If no attribute names are specified, then all attributes will be
     *        returned. If any of the requested attributes are not found, they
     *        will not appear in the result.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     *        Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>ProjectionExpression</i> replaces the legacy
     *        <i>AttributesToGet</i> parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeysAndAttributes withProjectionExpression(
            String projectionExpression) {
        setProjectionExpression(projectionExpression);
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The
     * following are some use cases for using <i>ExpressionAttributeNames</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved
     * word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in
     * an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being
     * misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute
     * name. For example, consider the following attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot
     * be used directly in an expression. (For the complete list of reserved
     * words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To
     * work around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute
     * values</i>, which are placeholders for the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * 
     * @return One or more substitution tokens for attribute names in an
     *         expression. The following are some use cases for using
     *         <i>ExpressionAttributeNames</i>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To access an attribute whose name conflicts with a DynamoDB
     *         reserved word.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To create a placeholder for repeating occurrences of an attribute
     *         name in an expression.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To prevent special characters in an attribute name from being
     *         misinterpreted in an expression.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use the <b>#</b> character in an expression to dereference an
     *         attribute name. For example, consider the following attribute
     *         name:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Percentile</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The name of this attribute conflicts with a reserved word, so it
     *         cannot be used directly in an expression. (For the complete list
     *         of reserved words, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     *         >Reserved Words</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>). To work around this, you could specify the following
     *         for <i>ExpressionAttributeNames</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>{"#P":"Percentile"}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You could then use this substitution in an expression, as in this
     *         example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>#P = :val</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Tokens that begin with the <b>:</b> character are <i>expression
     *         attribute values</i>, which are placeholders for the actual value
     *         at runtime.
     *         </p>
     *         </note>
     *         <p>
     *         For more information on expression attribute names, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *         >Accessing Item Attributes</a> in the <i>Amazon DynamoDB
     *         Developer Guide</i>.
     */

    public java.util.Map<String, String> getExpressionAttributeNames() {
        return expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The
     * following are some use cases for using <i>ExpressionAttributeNames</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved
     * word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in
     * an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being
     * misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute
     * name. For example, consider the following attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot
     * be used directly in an expression. (For the complete list of reserved
     * words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To
     * work around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute
     * values</i>, which are placeholders for the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * 
     * @param expressionAttributeNames
     *        One or more substitution tokens for attribute names in an
     *        expression. The following are some use cases for using
     *        <i>ExpressionAttributeNames</i>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To access an attribute whose name conflicts with a DynamoDB
     *        reserved word.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To create a placeholder for repeating occurrences of an attribute
     *        name in an expression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To prevent special characters in an attribute name from being
     *        misinterpreted in an expression.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use the <b>#</b> character in an expression to dereference an
     *        attribute name. For example, consider the following attribute
     *        name:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Percentile</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The name of this attribute conflicts with a reserved word, so it
     *        cannot be used directly in an expression. (For the complete list
     *        of reserved words, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     *        >Reserved Words</a> in the <i>Amazon DynamoDB Developer
     *        Guide</i>). To work around this, you could specify the following
     *        for <i>ExpressionAttributeNames</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>{"#P":"Percentile"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You could then use this substitution in an expression, as in this
     *        example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>#P = :val</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Tokens that begin with the <b>:</b> character are <i>expression
     *        attribute values</i>, which are placeholders for the actual value
     *        at runtime.
     *        </p>
     *        </note>
     *        <p>
     *        For more information on expression attribute names, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     *        Guide</i>.
     */

    public void setExpressionAttributeNames(
            java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression. The
     * following are some use cases for using <i>ExpressionAttributeNames</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To access an attribute whose name conflicts with a DynamoDB reserved
     * word.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a placeholder for repeating occurrences of an attribute name in
     * an expression.
     * </p>
     * </li>
     * <li>
     * <p>
     * To prevent special characters in an attribute name from being
     * misinterpreted in an expression.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute
     * name. For example, consider the following attribute name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Percentile</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of this attribute conflicts with a reserved word, so it cannot
     * be used directly in an expression. (For the complete list of reserved
     * words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>). To
     * work around this, you could specify the following for
     * <i>ExpressionAttributeNames</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>{"#P":"Percentile"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You could then use this substitution in an expression, as in this
     * example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>#P = :val</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Tokens that begin with the <b>:</b> character are <i>expression attribute
     * values</i>, which are placeholders for the actual value at runtime.
     * </p>
     * </note>
     * <p>
     * For more information on expression attribute names, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     * >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * 
     * @param expressionAttributeNames
     *        One or more substitution tokens for attribute names in an
     *        expression. The following are some use cases for using
     *        <i>ExpressionAttributeNames</i>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To access an attribute whose name conflicts with a DynamoDB
     *        reserved word.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To create a placeholder for repeating occurrences of an attribute
     *        name in an expression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To prevent special characters in an attribute name from being
     *        misinterpreted in an expression.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use the <b>#</b> character in an expression to dereference an
     *        attribute name. For example, consider the following attribute
     *        name:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Percentile</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The name of this attribute conflicts with a reserved word, so it
     *        cannot be used directly in an expression. (For the complete list
     *        of reserved words, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     *        >Reserved Words</a> in the <i>Amazon DynamoDB Developer
     *        Guide</i>). To work around this, you could specify the following
     *        for <i>ExpressionAttributeNames</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>{"#P":"Percentile"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You could then use this substitution in an expression, as in this
     *        example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>#P = :val</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Tokens that begin with the <b>:</b> character are <i>expression
     *        attribute values</i>, which are placeholders for the actual value
     *        at runtime.
     *        </p>
     *        </note>
     *        <p>
     *        For more information on expression attribute names, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.AccessingItemAttributes.html"
     *        >Accessing Item Attributes</a> in the <i>Amazon DynamoDB Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeysAndAttributes withExpressionAttributeNames(
            java.util.Map<String, String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    public KeysAndAttributes addExpressionAttributeNamesEntry(String key,
            String value) {
        if (null == this.expressionAttributeNames) {
            this.expressionAttributeNames = new java.util.HashMap<String, String>();
        }
        if (this.expressionAttributeNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.expressionAttributeNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeNames. &lt;p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */

    public KeysAndAttributes clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
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
        if (getKeys() != null)
            sb.append("Keys: " + getKeys() + ",");
        if (getAttributesToGet() != null)
            sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (getConsistentRead() != null)
            sb.append("ConsistentRead: " + getConsistentRead() + ",");
        if (getProjectionExpression() != null)
            sb.append("ProjectionExpression: " + getProjectionExpression()
                    + ",");
        if (getExpressionAttributeNames() != null)
            sb.append("ExpressionAttributeNames: "
                    + getExpressionAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeysAndAttributes == false)
            return false;
        KeysAndAttributes other = (KeysAndAttributes) obj;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null
                && other.getKeys().equals(this.getKeys()) == false)
            return false;
        if (other.getAttributesToGet() == null
                ^ this.getAttributesToGet() == null)
            return false;
        if (other.getAttributesToGet() != null
                && other.getAttributesToGet().equals(this.getAttributesToGet()) == false)
            return false;
        if (other.getConsistentRead() == null
                ^ this.getConsistentRead() == null)
            return false;
        if (other.getConsistentRead() != null
                && other.getConsistentRead().equals(this.getConsistentRead()) == false)
            return false;
        if (other.getProjectionExpression() == null
                ^ this.getProjectionExpression() == null)
            return false;
        if (other.getProjectionExpression() != null
                && other.getProjectionExpression().equals(
                        this.getProjectionExpression()) == false)
            return false;
        if (other.getExpressionAttributeNames() == null
                ^ this.getExpressionAttributeNames() == null)
            return false;
        if (other.getExpressionAttributeNames() != null
                && other.getExpressionAttributeNames().equals(
                        this.getExpressionAttributeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeys() == null) ? 0 : getKeys().hashCode());
        hashCode = prime
                * hashCode
                + ((getAttributesToGet() == null) ? 0 : getAttributesToGet()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getConsistentRead() == null) ? 0 : getConsistentRead()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getProjectionExpression() == null) ? 0
                        : getProjectionExpression().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpressionAttributeNames() == null) ? 0
                        : getExpressionAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public KeysAndAttributes clone() {
        try {
            return (KeysAndAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
