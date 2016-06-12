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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <i>Query</i> operation.
 * </p>
 */
public class QueryRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the table containing the requested items.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table. Note that if you use the
     * <i>IndexName</i> parameter, you must also provide <i>TableName.</i>
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or in
     * the case of an index, some or all of the attributes projected into the
     * index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the
     * specified table or index. If you query a local secondary index, then for
     * each matching item in the index DynamoDB will fetch the entire item from
     * the parent table. If the index is configured to project all item
     * attributes, then all of the data can be obtained from the local secondary
     * index, and no fetching is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
     * index. Retrieves all attributes that have been projected into the index.
     * If the index is configured to project all attributes, this return value
     * is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than
     * the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
     * <i>AttributesToGet</i>. This return value is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
     * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, unless the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <note>
     * <p>
     * If you use the <i>ProjectionExpression</i> parameter, then the value for
     * <i>Select</i> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other
     * value for <i>Select</i> will return an error.
     * </p>
     * </note>
     */
    private String select;
    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>ProjectionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map;
     * however, it cannot retrieve individual elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names
     * are provided, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput
     * consumption. DynamoDB determines capacity units consumed based on item
     * size, not on the amount of data that is returned to an application.
     * </p>
     * <p>
     * You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in
     * a <i>Query</i> request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     */
    private java.util.List<String> attributesToGet;
    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that you
     * can pick up where you left off. Also, if the processed data set size
     * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
     * and returns the matching values up to the limit, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     * the operation. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     * >Query and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, the operation
     * uses eventually consistent reads.
     * </p>
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes.
     * If you query a global secondary index with <i>ConsistentRead</i> set to
     * <code>true</code>, you will receive a <i>ValidationException</i>.
     * </p>
     */
    private Boolean consistentRead;
    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>KeyConditionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * provide the partition key name and value as an <code>EQ</code> condition.
     * You can optionally provide a second condition, referring to the sort key.
     * </p>
     * <note>
     * <p>
     * If you don't provide a sort key condition, all of the items that match
     * the partition key will be retrieved. If a <i>FilterExpression</i> or
     * <i>QueryFilter</i> is present, it will be applied after the items are
     * retrieved.
     * </p>
     * </note>
     * <p>
     * For a query on an index, you can have conditions only on the index key
     * attributes. You must provide the index partition key name and value as an
     * <code>EQ</code> condition. You can optionally provide a second condition,
     * referring to the index sort key.
     * </p>
     * <p>
     * Each <i>KeyConditions</i> element consists of an attribute name to
     * compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when
     * it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes, for
     * example, equals, greater than, less than, and so on.
     * </p>
     * <p>
     * For <i>KeyConditions</i>, only the following comparison operators are
     * supported:
     * </p>
     * <p>
     * <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of these comparison operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one specified
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>
     * .
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String or Binary (not a Number or a set type). The target attribute
     * of the comparison must be of type String or Binary (not a Number or a set
     * type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less
     * than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements
     * of the same type, either String, Number, or Binary (not a set type). A
     * target attribute matches if the target value is greater than, or equal
     * to, the first element and less than, or equal to, the second element. If
     * an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     * >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     */
    private java.util.Map<String, Condition> keyConditions;
    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the query results after the items are read and
     * returns only the desired values.
     * </p>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * <note>
     * <p>
     * A <i>QueryFilter</i> is applied after the items have already been read;
     * the process of filtering does not consume any additional read capacity
     * units.
     * </p>
     * </note>
     * <p>
     * If you provide more than one condition in the <i>QueryFilter</i> map,
     * then by default all of the conditions must evaluate to true. In other
     * words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If you
     * do this, then at least one of the conditions must evaluate to true,
     * rather than all of them.)
     * </p>
     * <p>
     * Note that <i>QueryFilter</i> does not allow key attributes. You cannot
     * define a filter condition on a partition key or a sort key.
     * </p>
     * <p>
     * Each <i>QueryFilter</i> element consists of an attribute name to compare,
     * along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * operator specified in <i>ComparisonOperator</i>.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     * >JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For
     * example, equals, greater than, less than, etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see the <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     * >Condition</a> data type.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, Condition> queryFilter;
    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>QueryFilter</i>
     * map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the
     * entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true,
     * then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the
     * default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     */
    private String conditionalOperator;
    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default),
     * the traversal is performed in ascending order; if <code>false</code>, the
     * traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by
     * sort key. If the sort key data type is Number, the results are stored in
     * numeric order. For type String, the results are stored in order of ASCII
     * character code values. For type Binary, DynamoDB treats each byte of the
     * binary data as unsigned.
     * </p>
     * <p>
     * If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns the
     * results in the order in which they are stored (by sort key value). This
     * is the default behavior. If <i>ScanIndexForward</i> is <code>false</code>
     * , DynamoDB reads the results in reverse order by sort key value, and then
     * returns the results to the client.
     * </p>
     */
    private Boolean scanIndexForward;
    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <i>LastEvaluatedKey</i> in the previous
     * operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or
     * Binary. No set data types are allowed.
     * </p>
     */
    private java.util.Map<String, AttributeValue> exclusiveStartKey;

    private String returnConsumedCapacity;
    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a JSON
     * document. The attributes in the expression must be separated by commas.
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
     * A string that contains conditions that DynamoDB applies after the
     * <i>Query</i> operation, but before the data is returned to you. Items
     * that do not satisfy the <i>FilterExpression</i> criteria are not
     * returned.
     * </p>
     * <note>
     * <p>
     * A <i>FilterExpression</i> is applied after the items have already been
     * read; the process of filtering does not consume any additional read
     * capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     * >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i> and
     * <i>ConditionalOperator</i> parameters.
     * </p>
     * </note>
     */
    private String filterExpression;
    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved
     * by the <i>Query</i> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key
     * value. The condition can also perform one of several comparison tests on
     * a single sort key value. <i>Query</i> can use
     * <i>KeyConditionExpression</i> to retrieve one item with a given partition
     * key value and sort key value, or several items that have the same
     * partition key value but different sort key values.
     * </p>
     * <p>
     * The partition key equality test is required, and must be specified in the
     * following format:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * </p>
     * <p>
     * If you also want to provide a condition for the sort key, it must be
     * combined using <i>AND</i> with the condition for the sort key. Following
     * is an example, using the <b>=</b> comparison operator for the sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * <i>AND</i> <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> - true if the
     * sort key value is equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3C;]]></i>
     * <code>:sortkeyval</code> - true if the sort key value is less than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3C;]]>=</i>
     * <code>:sortkeyval</code> - true if the sort key value is less than or
     * equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3E;]]></i>
     * <code>:sortkeyval</code> - true if the sort key value is greater than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3E;]]>= </i>
     * <code>:sortkeyval</code> - true if the sort key value is greater than or
     * equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>BETWEEN</i> <code>:sortkeyval1</code>
     * <i>AND</i> <code>:sortkeyval2</code> - true if the sort key value is
     * greater than or equal to <code>:sortkeyval1</code>, and less than or
     * equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>begins_with (</i><code>sortKeyName</code>, <code>:sortkeyval</code>
     * <i>)</i> - true if the sort key value begins with a particular operand.
     * (You cannot use this function with a sort key that is of type Number.)
     * Note that the function name <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <i>ExpressionAttributeValues</i> parameter to replace tokens such
     * as <code>:partitionval</code> and <code>:sortval</code> with actual
     * values at runtime.
     * </p>
     * <p>
     * You can optionally use the <i>ExpressionAttributeNames</i> parameter to
     * replace the names of the partition key and sort key with placeholder
     * tokens. This option might be necessary if an attribute name conflicts
     * with a DynamoDB reserved word. For example, the following
     * <i>KeyConditionExpression</i> parameter causes an error because
     * <i>Size</i> is a reserved word:
     * </p>
     * <ul>
     * <li> <code>Size = :myval</code></li>
     * </ul>
     * <p>
     * To work around this, define a placeholder (such a <code>#S</code>) to
     * represent the attribute name <i>Size</i>. <i>KeyConditionExpression</i>
     * then is as follows:
     * </p>
     * <ul>
     * <li> <code>#S = :myval</code></li>
     * </ul>
     * <p>
     * For a list of reserved words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For more information on <i>ExpressionAttributeNames</i> and
     * <i>ExpressionAttributeValues</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     * >Using Placeholders for Attribute Names and Values</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>KeyConditionExpression</i> replaces the legacy <i>KeyConditions</i>
     * parameter.
     * </p>
     * </note>
     */
    private String keyConditionExpression;
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
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an
     * attribute value. For example, suppose that you wanted to check whether
     * the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <i>ExpressionAttributeValues</i> as
     * follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, AttributeValue> expressionAttributeValues;

    /**
     * Default constructor for QueryRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public QueryRequest() {
    }

    /**
     * Constructs a new QueryRequest object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param tableName
     *        The name of the table containing the requested items.
     */
    public QueryRequest(String tableName) {
        setTableName(tableName);
    }

    /**
     * <p>
     * The name of the table containing the requested items.
     * </p>
     * 
     * @param tableName
     *        The name of the table containing the requested items.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table containing the requested items.
     * </p>
     * 
     * @return The name of the table containing the requested items.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table containing the requested items.
     * </p>
     * 
     * @param tableName
     *        The name of the table containing the requested items.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table. Note that if you use the
     * <i>IndexName</i> parameter, you must also provide <i>TableName.</i>
     * </p>
     * 
     * @param indexName
     *        The name of an index to query. This index can be any local
     *        secondary index or global secondary index on the table. Note that
     *        if you use the <i>IndexName</i> parameter, you must also provide
     *        <i>TableName.</i>
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table. Note that if you use the
     * <i>IndexName</i> parameter, you must also provide <i>TableName.</i>
     * </p>
     * 
     * @return The name of an index to query. This index can be any local
     *         secondary index or global secondary index on the table. Note that
     *         if you use the <i>IndexName</i> parameter, you must also provide
     *         <i>TableName.</i>
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of an index to query. This index can be any local secondary
     * index or global secondary index on the table. Note that if you use the
     * <i>IndexName</i> parameter, you must also provide <i>TableName.</i>
     * </p>
     * 
     * @param indexName
     *        The name of an index to query. This index can be any local
     *        secondary index or global secondary index on the table. Note that
     *        if you use the <i>IndexName</i> parameter, you must also provide
     *        <i>TableName.</i>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or in
     * the case of an index, some or all of the attributes projected into the
     * index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the
     * specified table or index. If you query a local secondary index, then for
     * each matching item in the index DynamoDB will fetch the entire item from
     * the parent table. If the index is configured to project all item
     * attributes, then all of the data can be obtained from the local secondary
     * index, and no fetching is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
     * index. Retrieves all attributes that have been projected into the index.
     * If the index is configured to project all attributes, this return value
     * is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than
     * the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
     * <i>AttributesToGet</i>. This return value is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
     * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, unless the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <note>
     * <p>
     * If you use the <i>ProjectionExpression</i> parameter, then the value for
     * <i>Select</i> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other
     * value for <i>Select</i> will return an error.
     * </p>
     * </note>
     * 
     * @param select
     *        The attributes to be returned in the result. You can retrieve all
     *        item attributes, specific item attributes, the count of matching
     *        items, or in the case of an index, some or all of the attributes
     *        projected into the index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes
     *        from the specified table or index. If you query a local secondary
     *        index, then for each matching item in the index DynamoDB will
     *        fetch the entire item from the parent table. If the index is
     *        configured to project all item attributes, then all of the data
     *        can be obtained from the local secondary index, and no fetching is
     *        required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying
     *        an index. Retrieves all attributes that have been projected into
     *        the index. If the index is configured to project all attributes,
     *        this return value is equivalent to specifying
     *        <code>ALL_ATTRIBUTES</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code> - Returns the number of matching items, rather
     *        than the matching items themselves.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes
     *        listed in <i>AttributesToGet</i>. This return value is equivalent
     *        to specifying <i>AttributesToGet</i> without specifying any value
     *        for <i>Select</i>.
     *        </p>
     *        <p>
     *        If you query a local secondary index and request only attributes
     *        that are projected into that index, the operation will read only
     *        the index and not the table. If any of the requested attributes
     *        are not projected into the local secondary index, DynamoDB will
     *        fetch each of these attributes from the parent table. This extra
     *        fetching incurs additional throughput cost and latency.
     *        </p>
     *        <p>
     *        If you query a global secondary index, you can only request
     *        attributes that are projected into the index. Global secondary
     *        index queries cannot fetch attributes from the parent table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     *        DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     *        table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     *        index. You cannot use both <i>Select</i> and
     *        <i>AttributesToGet</i> together in a single request, unless the
     *        value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     *        usage is equivalent to specifying <i>AttributesToGet</i> without
     *        any value for <i>Select</i>.)
     *        </p>
     *        <note>
     *        <p>
     *        If you use the <i>ProjectionExpression</i> parameter, then the
     *        value for <i>Select</i> can only be
     *        <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *        <i>Select</i> will return an error.
     *        </p>
     * @see Select
     */

    public void setSelect(String select) {
        this.select = select;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or in
     * the case of an index, some or all of the attributes projected into the
     * index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the
     * specified table or index. If you query a local secondary index, then for
     * each matching item in the index DynamoDB will fetch the entire item from
     * the parent table. If the index is configured to project all item
     * attributes, then all of the data can be obtained from the local secondary
     * index, and no fetching is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
     * index. Retrieves all attributes that have been projected into the index.
     * If the index is configured to project all attributes, this return value
     * is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than
     * the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
     * <i>AttributesToGet</i>. This return value is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
     * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, unless the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <note>
     * <p>
     * If you use the <i>ProjectionExpression</i> parameter, then the value for
     * <i>Select</i> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other
     * value for <i>Select</i> will return an error.
     * </p>
     * </note>
     * 
     * @return The attributes to be returned in the result. You can retrieve all
     *         item attributes, specific item attributes, the count of matching
     *         items, or in the case of an index, some or all of the attributes
     *         projected into the index.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes
     *         from the specified table or index. If you query a local secondary
     *         index, then for each matching item in the index DynamoDB will
     *         fetch the entire item from the parent table. If the index is
     *         configured to project all item attributes, then all of the data
     *         can be obtained from the local secondary index, and no fetching
     *         is required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when
     *         querying an index. Retrieves all attributes that have been
     *         projected into the index. If the index is configured to project
     *         all attributes, this return value is equivalent to specifying
     *         <code>ALL_ATTRIBUTES</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COUNT</code> - Returns the number of matching items, rather
     *         than the matching items themselves.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes
     *         listed in <i>AttributesToGet</i>. This return value is equivalent
     *         to specifying <i>AttributesToGet</i> without specifying any value
     *         for <i>Select</i>.
     *         </p>
     *         <p>
     *         If you query a local secondary index and request only attributes
     *         that are projected into that index, the operation will read only
     *         the index and not the table. If any of the requested attributes
     *         are not projected into the local secondary index, DynamoDB will
     *         fetch each of these attributes from the parent table. This extra
     *         fetching incurs additional throughput cost and latency.
     *         </p>
     *         <p>
     *         If you query a global secondary index, you can only request
     *         attributes that are projected into the index. Global secondary
     *         index queries cannot fetch attributes from the parent table.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If neither <i>Select</i> nor <i>AttributesToGet</i> are
     *         specified, DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when
     *         accessing a table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when
     *         accessing an index. You cannot use both <i>Select</i> and
     *         <i>AttributesToGet</i> together in a single request, unless the
     *         value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>.
     *         (This usage is equivalent to specifying <i>AttributesToGet</i>
     *         without any value for <i>Select</i>.)
     *         </p>
     *         <note>
     *         <p>
     *         If you use the <i>ProjectionExpression</i> parameter, then the
     *         value for <i>Select</i> can only be
     *         <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *         <i>Select</i> will return an error.
     *         </p>
     * @see Select
     */

    public String getSelect() {
        return this.select;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or in
     * the case of an index, some or all of the attributes projected into the
     * index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the
     * specified table or index. If you query a local secondary index, then for
     * each matching item in the index DynamoDB will fetch the entire item from
     * the parent table. If the index is configured to project all item
     * attributes, then all of the data can be obtained from the local secondary
     * index, and no fetching is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
     * index. Retrieves all attributes that have been projected into the index.
     * If the index is configured to project all attributes, this return value
     * is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than
     * the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
     * <i>AttributesToGet</i>. This return value is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
     * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, unless the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <note>
     * <p>
     * If you use the <i>ProjectionExpression</i> parameter, then the value for
     * <i>Select</i> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other
     * value for <i>Select</i> will return an error.
     * </p>
     * </note>
     * 
     * @param select
     *        The attributes to be returned in the result. You can retrieve all
     *        item attributes, specific item attributes, the count of matching
     *        items, or in the case of an index, some or all of the attributes
     *        projected into the index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes
     *        from the specified table or index. If you query a local secondary
     *        index, then for each matching item in the index DynamoDB will
     *        fetch the entire item from the parent table. If the index is
     *        configured to project all item attributes, then all of the data
     *        can be obtained from the local secondary index, and no fetching is
     *        required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying
     *        an index. Retrieves all attributes that have been projected into
     *        the index. If the index is configured to project all attributes,
     *        this return value is equivalent to specifying
     *        <code>ALL_ATTRIBUTES</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code> - Returns the number of matching items, rather
     *        than the matching items themselves.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes
     *        listed in <i>AttributesToGet</i>. This return value is equivalent
     *        to specifying <i>AttributesToGet</i> without specifying any value
     *        for <i>Select</i>.
     *        </p>
     *        <p>
     *        If you query a local secondary index and request only attributes
     *        that are projected into that index, the operation will read only
     *        the index and not the table. If any of the requested attributes
     *        are not projected into the local secondary index, DynamoDB will
     *        fetch each of these attributes from the parent table. This extra
     *        fetching incurs additional throughput cost and latency.
     *        </p>
     *        <p>
     *        If you query a global secondary index, you can only request
     *        attributes that are projected into the index. Global secondary
     *        index queries cannot fetch attributes from the parent table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     *        DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     *        table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     *        index. You cannot use both <i>Select</i> and
     *        <i>AttributesToGet</i> together in a single request, unless the
     *        value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     *        usage is equivalent to specifying <i>AttributesToGet</i> without
     *        any value for <i>Select</i>.)
     *        </p>
     *        <note>
     *        <p>
     *        If you use the <i>ProjectionExpression</i> parameter, then the
     *        value for <i>Select</i> can only be
     *        <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *        <i>Select</i> will return an error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Select
     */

    public QueryRequest withSelect(String select) {
        setSelect(select);
        return this;
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or in
     * the case of an index, some or all of the attributes projected into the
     * index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the
     * specified table or index. If you query a local secondary index, then for
     * each matching item in the index DynamoDB will fetch the entire item from
     * the parent table. If the index is configured to project all item
     * attributes, then all of the data can be obtained from the local secondary
     * index, and no fetching is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
     * index. Retrieves all attributes that have been projected into the index.
     * If the index is configured to project all attributes, this return value
     * is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than
     * the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
     * <i>AttributesToGet</i>. This return value is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
     * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, unless the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <note>
     * <p>
     * If you use the <i>ProjectionExpression</i> parameter, then the value for
     * <i>Select</i> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other
     * value for <i>Select</i> will return an error.
     * </p>
     * </note>
     * 
     * @param select
     *        The attributes to be returned in the result. You can retrieve all
     *        item attributes, specific item attributes, the count of matching
     *        items, or in the case of an index, some or all of the attributes
     *        projected into the index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes
     *        from the specified table or index. If you query a local secondary
     *        index, then for each matching item in the index DynamoDB will
     *        fetch the entire item from the parent table. If the index is
     *        configured to project all item attributes, then all of the data
     *        can be obtained from the local secondary index, and no fetching is
     *        required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying
     *        an index. Retrieves all attributes that have been projected into
     *        the index. If the index is configured to project all attributes,
     *        this return value is equivalent to specifying
     *        <code>ALL_ATTRIBUTES</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code> - Returns the number of matching items, rather
     *        than the matching items themselves.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes
     *        listed in <i>AttributesToGet</i>. This return value is equivalent
     *        to specifying <i>AttributesToGet</i> without specifying any value
     *        for <i>Select</i>.
     *        </p>
     *        <p>
     *        If you query a local secondary index and request only attributes
     *        that are projected into that index, the operation will read only
     *        the index and not the table. If any of the requested attributes
     *        are not projected into the local secondary index, DynamoDB will
     *        fetch each of these attributes from the parent table. This extra
     *        fetching incurs additional throughput cost and latency.
     *        </p>
     *        <p>
     *        If you query a global secondary index, you can only request
     *        attributes that are projected into the index. Global secondary
     *        index queries cannot fetch attributes from the parent table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     *        DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     *        table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     *        index. You cannot use both <i>Select</i> and
     *        <i>AttributesToGet</i> together in a single request, unless the
     *        value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     *        usage is equivalent to specifying <i>AttributesToGet</i> without
     *        any value for <i>Select</i>.)
     *        </p>
     *        <note>
     *        <p>
     *        If you use the <i>ProjectionExpression</i> parameter, then the
     *        value for <i>Select</i> can only be
     *        <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *        <i>Select</i> will return an error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Select
     */

    public void setSelect(Select select) {
        this.select = select.toString();
    }

    /**
     * <p>
     * The attributes to be returned in the result. You can retrieve all item
     * attributes, specific item attributes, the count of matching items, or in
     * the case of an index, some or all of the attributes projected into the
     * index.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes from the
     * specified table or index. If you query a local secondary index, then for
     * each matching item in the index DynamoDB will fetch the entire item from
     * the parent table. If the index is configured to project all item
     * attributes, then all of the data can be obtained from the local secondary
     * index, and no fetching is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying an
     * index. Retrieves all attributes that have been projected into the index.
     * If the index is configured to project all attributes, this return value
     * is equivalent to specifying <code>ALL_ATTRIBUTES</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT</code> - Returns the number of matching items, rather than
     * the matching items themselves.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes listed in
     * <i>AttributesToGet</i>. This return value is equivalent to specifying
     * <i>AttributesToGet</i> without specifying any value for <i>Select</i>.
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     * DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a table,
     * and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an index. You
     * cannot use both <i>Select</i> and <i>AttributesToGet</i> together in a
     * single request, unless the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <note>
     * <p>
     * If you use the <i>ProjectionExpression</i> parameter, then the value for
     * <i>Select</i> can only be <code>SPECIFIC_ATTRIBUTES</code>. Any other
     * value for <i>Select</i> will return an error.
     * </p>
     * </note>
     * 
     * @param select
     *        The attributes to be returned in the result. You can retrieve all
     *        item attributes, specific item attributes, the count of matching
     *        items, or in the case of an index, some or all of the attributes
     *        projected into the index.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_ATTRIBUTES</code> - Returns all of the item attributes
     *        from the specified table or index. If you query a local secondary
     *        index, then for each matching item in the index DynamoDB will
     *        fetch the entire item from the parent table. If the index is
     *        configured to project all item attributes, then all of the data
     *        can be obtained from the local secondary index, and no fetching is
     *        required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL_PROJECTED_ATTRIBUTES</code> - Allowed only when querying
     *        an index. Retrieves all attributes that have been projected into
     *        the index. If the index is configured to project all attributes,
     *        this return value is equivalent to specifying
     *        <code>ALL_ATTRIBUTES</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT</code> - Returns the number of matching items, rather
     *        than the matching items themselves.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPECIFIC_ATTRIBUTES</code> - Returns only the attributes
     *        listed in <i>AttributesToGet</i>. This return value is equivalent
     *        to specifying <i>AttributesToGet</i> without specifying any value
     *        for <i>Select</i>.
     *        </p>
     *        <p>
     *        If you query a local secondary index and request only attributes
     *        that are projected into that index, the operation will read only
     *        the index and not the table. If any of the requested attributes
     *        are not projected into the local secondary index, DynamoDB will
     *        fetch each of these attributes from the parent table. This extra
     *        fetching incurs additional throughput cost and latency.
     *        </p>
     *        <p>
     *        If you query a global secondary index, you can only request
     *        attributes that are projected into the index. Global secondary
     *        index queries cannot fetch attributes from the parent table.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If neither <i>Select</i> nor <i>AttributesToGet</i> are specified,
     *        DynamoDB defaults to <code>ALL_ATTRIBUTES</code> when accessing a
     *        table, and <code>ALL_PROJECTED_ATTRIBUTES</code> when accessing an
     *        index. You cannot use both <i>Select</i> and
     *        <i>AttributesToGet</i> together in a single request, unless the
     *        value for <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This
     *        usage is equivalent to specifying <i>AttributesToGet</i> without
     *        any value for <i>Select</i>.)
     *        </p>
     *        <note>
     *        <p>
     *        If you use the <i>ProjectionExpression</i> parameter, then the
     *        value for <i>Select</i> can only be
     *        <code>SPECIFIC_ATTRIBUTES</code>. Any other value for
     *        <i>Select</i> will return an error.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Select
     */

    public QueryRequest withSelect(Select select) {
        setSelect(select);
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>ProjectionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map;
     * however, it cannot retrieve individual elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names
     * are provided, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput
     * consumption. DynamoDB determines capacity units consumed based on item
     * size, not on the amount of data that is returned to an application.
     * </p>
     * <p>
     * You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in
     * a <i>Query</i> request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * 
     * @return This is a legacy parameter, for backward compatibility. New
     *         applications should use <i>ProjectionExpression</i> instead. Do
     *         not combine legacy parameters and expression parameters in a
     *         single API call; otherwise, DynamoDB will return a
     *         <i>ValidationException</i> exception.</p>
     *         <p>
     *         This parameter allows you to retrieve attributes of type List or
     *         Map; however, it cannot retrieve individual elements within a
     *         List or a Map.
     *         </p>
     *         </important>
     *         <p>
     *         The names of one or more attributes to retrieve. If no attribute
     *         names are provided, then all attributes will be returned. If any
     *         of the requested attributes are not found, they will not appear
     *         in the result.
     *         </p>
     *         <p>
     *         Note that <i>AttributesToGet</i> has no effect on provisioned
     *         throughput consumption. DynamoDB determines capacity units
     *         consumed based on item size, not on the amount of data that is
     *         returned to an application.
     *         </p>
     *         <p>
     *         You cannot use both <i>AttributesToGet</i> and <i>Select</i>
     *         together in a <i>Query</i> request, <i>unless</i> the value for
     *         <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *         equivalent to specifying <i>AttributesToGet</i> without any value
     *         for <i>Select</i>.)
     *         </p>
     *         <p>
     *         If you query a local secondary index and request only attributes
     *         that are projected into that index, the operation will read only
     *         the index and not the table. If any of the requested attributes
     *         are not projected into the local secondary index, DynamoDB will
     *         fetch each of these attributes from the parent table. This extra
     *         fetching incurs additional throughput cost and latency.
     *         </p>
     */

    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>ProjectionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map;
     * however, it cannot retrieve individual elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names
     * are provided, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput
     * consumption. DynamoDB determines capacity units consumed based on item
     * size, not on the amount of data that is returned to an application.
     * </p>
     * <p>
     * You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in
     * a <i>Query</i> request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * 
     * @param attributesToGet
     *        This is a legacy parameter, for backward compatibility. New
     *        applications should use <i>ProjectionExpression</i> instead. Do
     *        not combine legacy parameters and expression parameters in a
     *        single API call; otherwise, DynamoDB will return a
     *        <i>ValidationException</i> exception.</p>
     *        <p>
     *        This parameter allows you to retrieve attributes of type List or
     *        Map; however, it cannot retrieve individual elements within a List
     *        or a Map.
     *        </p>
     *        </important>
     *        <p>
     *        The names of one or more attributes to retrieve. If no attribute
     *        names are provided, then all attributes will be returned. If any
     *        of the requested attributes are not found, they will not appear in
     *        the result.
     *        </p>
     *        <p>
     *        Note that <i>AttributesToGet</i> has no effect on provisioned
     *        throughput consumption. DynamoDB determines capacity units
     *        consumed based on item size, not on the amount of data that is
     *        returned to an application.
     *        </p>
     *        <p>
     *        You cannot use both <i>AttributesToGet</i> and <i>Select</i>
     *        together in a <i>Query</i> request, <i>unless</i> the value for
     *        <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *        equivalent to specifying <i>AttributesToGet</i> without any value
     *        for <i>Select</i>.)
     *        </p>
     *        <p>
     *        If you query a local secondary index and request only attributes
     *        that are projected into that index, the operation will read only
     *        the index and not the table. If any of the requested attributes
     *        are not projected into the local secondary index, DynamoDB will
     *        fetch each of these attributes from the parent table. This extra
     *        fetching incurs additional throughput cost and latency.
     *        </p>
     */

    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        this.attributesToGet = new java.util.ArrayList<String>(attributesToGet);
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>ProjectionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map;
     * however, it cannot retrieve individual elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names
     * are provided, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput
     * consumption. DynamoDB determines capacity units consumed based on item
     * size, not on the amount of data that is returned to an application.
     * </p>
     * <p>
     * You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in
     * a <i>Query</i> request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAttributesToGet(java.util.Collection)} or
     * {@link #withAttributesToGet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributesToGet
     *        This is a legacy parameter, for backward compatibility. New
     *        applications should use <i>ProjectionExpression</i> instead. Do
     *        not combine legacy parameters and expression parameters in a
     *        single API call; otherwise, DynamoDB will return a
     *        <i>ValidationException</i> exception.</p>
     *        <p>
     *        This parameter allows you to retrieve attributes of type List or
     *        Map; however, it cannot retrieve individual elements within a List
     *        or a Map.
     *        </p>
     *        </important>
     *        <p>
     *        The names of one or more attributes to retrieve. If no attribute
     *        names are provided, then all attributes will be returned. If any
     *        of the requested attributes are not found, they will not appear in
     *        the result.
     *        </p>
     *        <p>
     *        Note that <i>AttributesToGet</i> has no effect on provisioned
     *        throughput consumption. DynamoDB determines capacity units
     *        consumed based on item size, not on the amount of data that is
     *        returned to an application.
     *        </p>
     *        <p>
     *        You cannot use both <i>AttributesToGet</i> and <i>Select</i>
     *        together in a <i>Query</i> request, <i>unless</i> the value for
     *        <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *        equivalent to specifying <i>AttributesToGet</i> without any value
     *        for <i>Select</i>.)
     *        </p>
     *        <p>
     *        If you query a local secondary index and request only attributes
     *        that are projected into that index, the operation will read only
     *        the index and not the table. If any of the requested attributes
     *        are not projected into the local secondary index, DynamoDB will
     *        fetch each of these attributes from the parent table. This extra
     *        fetching incurs additional throughput cost and latency.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withAttributesToGet(String... attributesToGet) {
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
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>ProjectionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * <p>
     * This parameter allows you to retrieve attributes of type List or Map;
     * however, it cannot retrieve individual elements within a List or a Map.
     * </p>
     * </important>
     * <p>
     * The names of one or more attributes to retrieve. If no attribute names
     * are provided, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the result.
     * </p>
     * <p>
     * Note that <i>AttributesToGet</i> has no effect on provisioned throughput
     * consumption. DynamoDB determines capacity units consumed based on item
     * size, not on the amount of data that is returned to an application.
     * </p>
     * <p>
     * You cannot use both <i>AttributesToGet</i> and <i>Select</i> together in
     * a <i>Query</i> request, <i>unless</i> the value for <i>Select</i> is
     * <code>SPECIFIC_ATTRIBUTES</code>. (This usage is equivalent to specifying
     * <i>AttributesToGet</i> without any value for <i>Select</i>.)
     * </p>
     * <p>
     * If you query a local secondary index and request only attributes that are
     * projected into that index, the operation will read only the index and not
     * the table. If any of the requested attributes are not projected into the
     * local secondary index, DynamoDB will fetch each of these attributes from
     * the parent table. This extra fetching incurs additional throughput cost
     * and latency.
     * </p>
     * <p>
     * If you query a global secondary index, you can only request attributes
     * that are projected into the index. Global secondary index queries cannot
     * fetch attributes from the parent table.
     * </p>
     * 
     * @param attributesToGet
     *        This is a legacy parameter, for backward compatibility. New
     *        applications should use <i>ProjectionExpression</i> instead. Do
     *        not combine legacy parameters and expression parameters in a
     *        single API call; otherwise, DynamoDB will return a
     *        <i>ValidationException</i> exception.</p>
     *        <p>
     *        This parameter allows you to retrieve attributes of type List or
     *        Map; however, it cannot retrieve individual elements within a List
     *        or a Map.
     *        </p>
     *        </important>
     *        <p>
     *        The names of one or more attributes to retrieve. If no attribute
     *        names are provided, then all attributes will be returned. If any
     *        of the requested attributes are not found, they will not appear in
     *        the result.
     *        </p>
     *        <p>
     *        Note that <i>AttributesToGet</i> has no effect on provisioned
     *        throughput consumption. DynamoDB determines capacity units
     *        consumed based on item size, not on the amount of data that is
     *        returned to an application.
     *        </p>
     *        <p>
     *        You cannot use both <i>AttributesToGet</i> and <i>Select</i>
     *        together in a <i>Query</i> request, <i>unless</i> the value for
     *        <i>Select</i> is <code>SPECIFIC_ATTRIBUTES</code>. (This usage is
     *        equivalent to specifying <i>AttributesToGet</i> without any value
     *        for <i>Select</i>.)
     *        </p>
     *        <p>
     *        If you query a local secondary index and request only attributes
     *        that are projected into that index, the operation will read only
     *        the index and not the table. If any of the requested attributes
     *        are not projected into the local secondary index, DynamoDB will
     *        fetch each of these attributes from the parent table. This extra
     *        fetching incurs additional throughput cost and latency.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withAttributesToGet(
            java.util.Collection<String> attributesToGet) {
        setAttributesToGet(attributesToGet);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that you
     * can pick up where you left off. Also, if the processed data set size
     * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
     * and returns the matching values up to the limit, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     * the operation. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     * >Query and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to evaluate (not necessarily the
     *        number of matching items). If DynamoDB processes the number of
     *        items up to the limit while processing the results, it stops the
     *        operation and returns the matching values up to that point, and a
     *        key in <i>LastEvaluatedKey</i> to apply in a subsequent operation,
     *        so that you can pick up where you left off. Also, if the processed
     *        data set size exceeds 1 MB before DynamoDB reaches this limit, it
     *        stops the operation and returns the matching values up to the
     *        limit, and a key in <i>LastEvaluatedKey</i> to apply in a
     *        subsequent operation to continue the operation. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     *        >Query and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that you
     * can pick up where you left off. Also, if the processed data set size
     * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
     * and returns the matching values up to the limit, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     * the operation. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     * >Query and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return The maximum number of items to evaluate (not necessarily the
     *         number of matching items). If DynamoDB processes the number of
     *         items up to the limit while processing the results, it stops the
     *         operation and returns the matching values up to that point, and a
     *         key in <i>LastEvaluatedKey</i> to apply in a subsequent
     *         operation, so that you can pick up where you left off. Also, if
     *         the processed data set size exceeds 1 MB before DynamoDB reaches
     *         this limit, it stops the operation and returns the matching
     *         values up to the limit, and a key in <i>LastEvaluatedKey</i> to
     *         apply in a subsequent operation to continue the operation. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     *         >Query and Scan</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to evaluate (not necessarily the number of
     * matching items). If DynamoDB processes the number of items up to the
     * limit while processing the results, it stops the operation and returns
     * the matching values up to that point, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation, so that you
     * can pick up where you left off. Also, if the processed data set size
     * exceeds 1 MB before DynamoDB reaches this limit, it stops the operation
     * and returns the matching values up to the limit, and a key in
     * <i>LastEvaluatedKey</i> to apply in a subsequent operation to continue
     * the operation. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     * >Query and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to evaluate (not necessarily the
     *        number of matching items). If DynamoDB processes the number of
     *        items up to the limit while processing the results, it stops the
     *        operation and returns the matching values up to that point, and a
     *        key in <i>LastEvaluatedKey</i> to apply in a subsequent operation,
     *        so that you can pick up where you left off. Also, if the processed
     *        data set size exceeds 1 MB before DynamoDB reaches this limit, it
     *        stops the operation and returns the matching values up to the
     *        limit, and a key in <i>LastEvaluatedKey</i> to apply in a
     *        subsequent operation to continue the operation. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
     *        >Query and Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, the operation
     * uses eventually consistent reads.
     * </p>
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes.
     * If you query a global secondary index with <i>ConsistentRead</i> set to
     * <code>true</code>, you will receive a <i>ValidationException</i>.
     * </p>
     * 
     * @param consistentRead
     *        Determines the read consistency model: If set to <code>true</code>
     *        , then the operation uses strongly consistent reads; otherwise,
     *        the operation uses eventually consistent reads.</p>
     *        <p>
     *        Strongly consistent reads are not supported on global secondary
     *        indexes. If you query a global secondary index with
     *        <i>ConsistentRead</i> set to <code>true</code>, you will receive a
     *        <i>ValidationException</i>.
     */

    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, the operation
     * uses eventually consistent reads.
     * </p>
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes.
     * If you query a global secondary index with <i>ConsistentRead</i> set to
     * <code>true</code>, you will receive a <i>ValidationException</i>.
     * </p>
     * 
     * @return Determines the read consistency model: If set to
     *         <code>true</code>, then the operation uses strongly consistent
     *         reads; otherwise, the operation uses eventually consistent
     *         reads.</p>
     *         <p>
     *         Strongly consistent reads are not supported on global secondary
     *         indexes. If you query a global secondary index with
     *         <i>ConsistentRead</i> set to <code>true</code>, you will receive
     *         a <i>ValidationException</i>.
     */

    public Boolean getConsistentRead() {
        return this.consistentRead;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, the operation
     * uses eventually consistent reads.
     * </p>
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes.
     * If you query a global secondary index with <i>ConsistentRead</i> set to
     * <code>true</code>, you will receive a <i>ValidationException</i>.
     * </p>
     * 
     * @param consistentRead
     *        Determines the read consistency model: If set to <code>true</code>
     *        , then the operation uses strongly consistent reads; otherwise,
     *        the operation uses eventually consistent reads.</p>
     *        <p>
     *        Strongly consistent reads are not supported on global secondary
     *        indexes. If you query a global secondary index with
     *        <i>ConsistentRead</i> set to <code>true</code>, you will receive a
     *        <i>ValidationException</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withConsistentRead(Boolean consistentRead) {
        setConsistentRead(consistentRead);
        return this;
    }

    /**
     * <p>
     * Determines the read consistency model: If set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, the operation
     * uses eventually consistent reads.
     * </p>
     * <p>
     * Strongly consistent reads are not supported on global secondary indexes.
     * If you query a global secondary index with <i>ConsistentRead</i> set to
     * <code>true</code>, you will receive a <i>ValidationException</i>.
     * </p>
     * 
     * @return Determines the read consistency model: If set to
     *         <code>true</code>, then the operation uses strongly consistent
     *         reads; otherwise, the operation uses eventually consistent
     *         reads.</p>
     *         <p>
     *         Strongly consistent reads are not supported on global secondary
     *         indexes. If you query a global secondary index with
     *         <i>ConsistentRead</i> set to <code>true</code>, you will receive
     *         a <i>ValidationException</i>.
     */

    public Boolean isConsistentRead() {
        return this.consistentRead;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>KeyConditionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * provide the partition key name and value as an <code>EQ</code> condition.
     * You can optionally provide a second condition, referring to the sort key.
     * </p>
     * <note>
     * <p>
     * If you don't provide a sort key condition, all of the items that match
     * the partition key will be retrieved. If a <i>FilterExpression</i> or
     * <i>QueryFilter</i> is present, it will be applied after the items are
     * retrieved.
     * </p>
     * </note>
     * <p>
     * For a query on an index, you can have conditions only on the index key
     * attributes. You must provide the index partition key name and value as an
     * <code>EQ</code> condition. You can optionally provide a second condition,
     * referring to the index sort key.
     * </p>
     * <p>
     * Each <i>KeyConditions</i> element consists of an attribute name to
     * compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when
     * it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes, for
     * example, equals, greater than, less than, and so on.
     * </p>
     * <p>
     * For <i>KeyConditions</i>, only the following comparison operators are
     * supported:
     * </p>
     * <p>
     * <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of these comparison operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one specified
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>
     * .
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String or Binary (not a Number or a set type). The target attribute
     * of the comparison must be of type String or Binary (not a Number or a set
     * type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less
     * than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements
     * of the same type, either String, Number, or Binary (not a set type). A
     * target attribute matches if the target value is greater than, or equal
     * to, the first element and less than, or equal to, the second element. If
     * an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     * >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * 
     * @return <p>
     *         This is a legacy parameter, for backward compatibility. New
     *         applications should use <i>KeyConditionExpression</i> instead. Do
     *         not combine legacy parameters and expression parameters in a
     *         single API call; otherwise, DynamoDB will return a
     *         <i>ValidationException</i> exception.
     *         </p>
     *         </important>
     *         <p>
     *         The selection criteria for the query. For a query on a table, you
     *         can have conditions only on the table primary key attributes. You
     *         must provide the partition key name and value as an
     *         <code>EQ</code> condition. You can optionally provide a second
     *         condition, referring to the sort key.
     *         </p>
     *         <note>
     *         <p>
     *         If you don't provide a sort key condition, all of the items that
     *         match the partition key will be retrieved. If a
     *         <i>FilterExpression</i> or <i>QueryFilter</i> is present, it will
     *         be applied after the items are retrieved.
     *         </p>
     *         </note>
     *         <p>
     *         For a query on an index, you can have conditions only on the
     *         index key attributes. You must provide the index partition key
     *         name and value as an <code>EQ</code> condition. You can
     *         optionally provide a second condition, referring to the index
     *         sort key.
     *         </p>
     *         <p>
     *         Each <i>KeyConditions</i> element consists of an attribute name
     *         to compare, along with the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>AttributeValueList</i> - One or more values to evaluate
     *         against the supplied attribute. The number of values in the list
     *         depends on the <i>ComparisonOperator</i> being used.
     *         </p>
     *         <p>
     *         For type Number, value comparisons are numeric.
     *         </p>
     *         <p>
     *         String value comparisons for greater than, equals, or less than
     *         are based on ASCII character code values. For example,
     *         <code>a</code> is greater than <code>A</code>, and <code>a</code>
     *         is greater than <code>B</code>. For a list of code values, see <a
     *         href
     *         ="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *         >http
     *         ://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         </p>
     *         <p>
     *         For Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>ComparisonOperator</i> - A comparator for evaluating
     *         attributes, for example, equals, greater than, less than, and so
     *         on.
     *         </p>
     *         <p>
     *         For <i>KeyConditions</i>, only the following comparison operators
     *         are supported:
     *         </p>
     *         <p>
     *         <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     *         </p>
     *         <p>
     *         The following are descriptions of these comparison operators.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EQ</code> : Equal.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a
     *         set type). If an item contains an <i>AttributeValue</i> element
     *         of a different type than the one specified in the request, the
     *         value does not match. For example, <code>{"S":"6"}</code> does
     *         not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code>
     *         does not equal <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>LE</code> : Less than or equal.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary
     *         (not a set type). If an item contains an <i>AttributeValue</i>
     *         element of a different type than the one provided in the request,
     *         the value does not match. For example, <code>{"S":"6"}</code>
     *         does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to
     *         <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>LT</code> : Less than.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String, Number, or Binary (not a
     *         set type). If an item contains an <i>AttributeValue</i> element
     *         of a different type than the one provided in the request, the
     *         value does not match. For example, <code>{"S":"6"}</code> does
     *         not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code>
     *         does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>GE</code> : Greater than or equal.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary
     *         (not a set type). If an item contains an <i>AttributeValue</i>
     *         element of a different type than the one provided in the request,
     *         the value does not match. For example, <code>{"S":"6"}</code>
     *         does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to
     *         <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>GT</code> : Greater than.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> element of type String, Number, or Binary
     *         (not a set type). If an item contains an <i>AttributeValue</i>
     *         element of a different type than the one provided in the request,
     *         the value does not match. For example, <code>{"S":"6"}</code>
     *         does not equal <code>{"N":"6"}</code>. Also,
     *         <code>{"N":"6"}</code> does not compare to
     *         <code>{"NS":["6", "2", "1"]}</code>.
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>BEGINS_WITH</code> : Checks for a prefix.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> can contain only one
     *         <i>AttributeValue</i> of type String or Binary (not a Number or a
     *         set type). The target attribute of the comparison must be of type
     *         String or Binary (not a Number or a set type).
     *         </p>
     *         <p/></li>
     *         <li>
     *         <p>
     *         <code>BETWEEN</code> : Greater than or equal to the first value,
     *         and less than or equal to the second value.
     *         </p>
     *         <p>
     *         <i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *         elements of the same type, either String, Number, or Binary (not
     *         a set type). A target attribute matches if the target value is
     *         greater than, or equal to, the first element and less than, or
     *         equal to, the second element. If an item contains an
     *         <i>AttributeValue</i> element of a different type than the one
     *         provided in the request, the value does not match. For example,
     *         <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>
     *         . Also, <code>{"N":"6"}</code> does not compare to
     *         <code>{"NS":["6", "2", "1"]}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         For usage examples of <i>AttributeValueList</i> and
     *         <i>ComparisonOperator</i>, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     *         >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB
     *         Developer Guide</i>.
     */

    public java.util.Map<String, Condition> getKeyConditions() {
        return keyConditions;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>KeyConditionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * provide the partition key name and value as an <code>EQ</code> condition.
     * You can optionally provide a second condition, referring to the sort key.
     * </p>
     * <note>
     * <p>
     * If you don't provide a sort key condition, all of the items that match
     * the partition key will be retrieved. If a <i>FilterExpression</i> or
     * <i>QueryFilter</i> is present, it will be applied after the items are
     * retrieved.
     * </p>
     * </note>
     * <p>
     * For a query on an index, you can have conditions only on the index key
     * attributes. You must provide the index partition key name and value as an
     * <code>EQ</code> condition. You can optionally provide a second condition,
     * referring to the index sort key.
     * </p>
     * <p>
     * Each <i>KeyConditions</i> element consists of an attribute name to
     * compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when
     * it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes, for
     * example, equals, greater than, less than, and so on.
     * </p>
     * <p>
     * For <i>KeyConditions</i>, only the following comparison operators are
     * supported:
     * </p>
     * <p>
     * <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of these comparison operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one specified
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>
     * .
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String or Binary (not a Number or a set type). The target attribute
     * of the comparison must be of type String or Binary (not a Number or a set
     * type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less
     * than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements
     * of the same type, either String, Number, or Binary (not a set type). A
     * target attribute matches if the target value is greater than, or equal
     * to, the first element and less than, or equal to, the second element. If
     * an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     * >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * 
     * @param keyConditions
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New
     *        applications should use <i>KeyConditionExpression</i> instead. Do
     *        not combine legacy parameters and expression parameters in a
     *        single API call; otherwise, DynamoDB will return a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        The selection criteria for the query. For a query on a table, you
     *        can have conditions only on the table primary key attributes. You
     *        must provide the partition key name and value as an
     *        <code>EQ</code> condition. You can optionally provide a second
     *        condition, referring to the sort key.
     *        </p>
     *        <note>
     *        <p>
     *        If you don't provide a sort key condition, all of the items that
     *        match the partition key will be retrieved. If a
     *        <i>FilterExpression</i> or <i>QueryFilter</i> is present, it will
     *        be applied after the items are retrieved.
     *        </p>
     *        </note>
     *        <p>
     *        For a query on an index, you can have conditions only on the index
     *        key attributes. You must provide the index partition key name and
     *        value as an <code>EQ</code> condition. You can optionally provide
     *        a second condition, referring to the index sort key.
     *        </p>
     *        <p>
     *        Each <i>KeyConditions</i> element consists of an attribute name to
     *        compare, along with the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeValueList</i> - One or more values to evaluate against
     *        the supplied attribute. The number of values in the list depends
     *        on the <i>ComparisonOperator</i> being used.
     *        </p>
     *        <p>
     *        For type Number, value comparisons are numeric.
     *        </p>
     *        <p>
     *        String value comparisons for greater than, equals, or less than
     *        are based on ASCII character code values. For example,
     *        <code>a</code> is greater than <code>A</code>, and <code>a</code>
     *        is greater than <code>B</code>. For a list of code values, see <a
     *        href
     *        ="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *        >http
     *        ://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *        </p>
     *        <p>
     *        For Binary, DynamoDB treats each byte of the binary data as
     *        unsigned when it compares binary values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ComparisonOperator</i> - A comparator for evaluating
     *        attributes, for example, equals, greater than, less than, and so
     *        on.
     *        </p>
     *        <p>
     *        For <i>KeyConditions</i>, only the following comparison operators
     *        are supported:
     *        </p>
     *        <p>
     *        <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     *        </p>
     *        <p>
     *        The following are descriptions of these comparison operators.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EQ</code> : Equal.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one
     *        <i>AttributeValue</i> of type String, Number, or Binary (not a set
     *        type). If an item contains an <i>AttributeValue</i> element of a
     *        different type than the one specified in the request, the value
     *        does not match. For example, <code>{"S":"6"}</code> does not equal
     *        <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *        equal <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>LE</code> : Less than or equal.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one
     *        <i>AttributeValue</i> element of type String, Number, or Binary
     *        (not a set type). If an item contains an <i>AttributeValue</i>
     *        element of a different type than the one provided in the request,
     *        the value does not match. For example, <code>{"S":"6"}</code> does
     *        not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code>
     *        does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>LT</code> : Less than.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one
     *        <i>AttributeValue</i> of type String, Number, or Binary (not a set
     *        type). If an item contains an <i>AttributeValue</i> element of a
     *        different type than the one provided in the request, the value
     *        does not match. For example, <code>{"S":"6"}</code> does not equal
     *        <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *        compare to <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>GE</code> : Greater than or equal.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one
     *        <i>AttributeValue</i> element of type String, Number, or Binary
     *        (not a set type). If an item contains an <i>AttributeValue</i>
     *        element of a different type than the one provided in the request,
     *        the value does not match. For example, <code>{"S":"6"}</code> does
     *        not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code>
     *        does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>GT</code> : Greater than.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one
     *        <i>AttributeValue</i> element of type String, Number, or Binary
     *        (not a set type). If an item contains an <i>AttributeValue</i>
     *        element of a different type than the one provided in the request,
     *        the value does not match. For example, <code>{"S":"6"}</code> does
     *        not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code>
     *        does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>BEGINS_WITH</code> : Checks for a prefix.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one
     *        <i>AttributeValue</i> of type String or Binary (not a Number or a
     *        set type). The target attribute of the comparison must be of type
     *        String or Binary (not a Number or a set type).
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>BETWEEN</code> : Greater than or equal to the first value,
     *        and less than or equal to the second value.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *        elements of the same type, either String, Number, or Binary (not a
     *        set type). A target attribute matches if the target value is
     *        greater than, or equal to, the first element and less than, or
     *        equal to, the second element. If an item contains an
     *        <i>AttributeValue</i> element of a different type than the one
     *        provided in the request, the value does not match. For example,
     *        <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>.
     *        Also, <code>{"N":"6"}</code> does not compare to
     *        <code>{"NS":["6", "2", "1"]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For usage examples of <i>AttributeValueList</i> and
     *        <i>ComparisonOperator</i>, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     *        >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB
     *        Developer Guide</i>.
     */

    public void setKeyConditions(java.util.Map<String, Condition> keyConditions) {
        this.keyConditions = keyConditions;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>KeyConditionExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * The selection criteria for the query. For a query on a table, you can
     * have conditions only on the table primary key attributes. You must
     * provide the partition key name and value as an <code>EQ</code> condition.
     * You can optionally provide a second condition, referring to the sort key.
     * </p>
     * <note>
     * <p>
     * If you don't provide a sort key condition, all of the items that match
     * the partition key will be retrieved. If a <i>FilterExpression</i> or
     * <i>QueryFilter</i> is present, it will be applied after the items are
     * retrieved.
     * </p>
     * </note>
     * <p>
     * For a query on an index, you can have conditions only on the index key
     * attributes. You must provide the index partition key name and value as an
     * <code>EQ</code> condition. You can optionally provide a second condition,
     * referring to the index sort key.
     * </p>
     * <p>
     * Each <i>KeyConditions</i> element consists of an attribute name to
     * compare, along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * <i>ComparisonOperator</i> being used.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For Binary, DynamoDB treats each byte of the binary data as unsigned when
     * it compares binary values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes, for
     * example, equals, greater than, less than, and so on.
     * </p>
     * <p>
     * For <i>KeyConditions</i>, only the following comparison operators are
     * supported:
     * </p>
     * <p>
     * <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     * </p>
     * <p>
     * The following are descriptions of these comparison operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code> : Equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one specified
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not equal <code>{"NS":["6", "2", "1"]}</code>
     * .
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LE</code> : Less than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>LT</code> : Less than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String, Number, or Binary (not a set type). If an item contains an
     * <i>AttributeValue</i> element of a different type than the one provided
     * in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GE</code> : Greater than or equal.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>GT</code> : Greater than.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i>
     * element of type String, Number, or Binary (not a set type). If an item
     * contains an <i>AttributeValue</i> element of a different type than the
     * one provided in the request, the value does not match. For example,
     * <code>{"S":"6"}</code> does not equal <code>{"N":"6"}</code>. Also,
     * <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code> : Checks for a prefix.
     * </p>
     * <p>
     * <i>AttributeValueList</i> can contain only one <i>AttributeValue</i> of
     * type String or Binary (not a Number or a set type). The target attribute
     * of the comparison must be of type String or Binary (not a Number or a set
     * type).
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>BETWEEN</code> : Greater than or equal to the first value, and less
     * than or equal to the second value.
     * </p>
     * <p>
     * <i>AttributeValueList</i> must contain two <i>AttributeValue</i> elements
     * of the same type, either String, Number, or Binary (not a set type). A
     * target attribute matches if the target value is greater than, or equal
     * to, the first element and less than, or equal to, the second element. If
     * an item contains an <i>AttributeValue</i> element of a different type
     * than the one provided in the request, the value does not match. For
     * example, <code>{"S":"6"}</code> does not compare to
     * <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not compare to
     * <code>{"NS":["6", "2", "1"]}</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * For usage examples of <i>AttributeValueList</i> and
     * <i>ComparisonOperator</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     * >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * 
     * @param keyConditions
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New
     *        applications should use <i>KeyConditionExpression</i> instead. Do
     *        not combine legacy parameters and expression parameters in a
     *        single API call; otherwise, DynamoDB will return a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        The selection criteria for the query. For a query on a table, you
     *        can have conditions only on the table primary key attributes. You
     *        must provide the partition key name and value as an
     *        <code>EQ</code> condition. You can optionally provide a second
     *        condition, referring to the sort key.
     *        </p>
     *        <note>
     *        <p>
     *        If you don't provide a sort key condition, all of the items that
     *        match the partition key will be retrieved. If a
     *        <i>FilterExpression</i> or <i>QueryFilter</i> is present, it will
     *        be applied after the items are retrieved.
     *        </p>
     *        </note>
     *        <p>
     *        For a query on an index, you can have conditions only on the index
     *        key attributes. You must provide the index partition key name and
     *        value as an <code>EQ</code> condition. You can optionally provide
     *        a second condition, referring to the index sort key.
     *        </p>
     *        <p>
     *        Each <i>KeyConditions</i> element consists of an attribute name to
     *        compare, along with the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeValueList</i> - One or more values to evaluate against
     *        the supplied attribute. The number of values in the list depends
     *        on the <i>ComparisonOperator</i> being used.
     *        </p>
     *        <p>
     *        For type Number, value comparisons are numeric.
     *        </p>
     *        <p>
     *        String value comparisons for greater than, equals, or less than
     *        are based on ASCII character code values. For example,
     *        <code>a</code> is greater than <code>A</code>, and <code>a</code>
     *        is greater than <code>B</code>. For a list of code values, see <a
     *        href
     *        ="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *        >http
     *        ://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *        </p>
     *        <p>
     *        For Binary, DynamoDB treats each byte of the binary data as
     *        unsigned when it compares binary values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ComparisonOperator</i> - A comparator for evaluating
     *        attributes, for example, equals, greater than, less than, and so
     *        on.
     *        </p>
     *        <p>
     *        For <i>KeyConditions</i>, only the following comparison operators
     *        are supported:
     *        </p>
     *        <p>
     *        <code>EQ | LE | LT | GE | GT | BEGINS_WITH | BETWEEN</code>
     *        </p>
     *        <p>
     *        The following are descriptions of these comparison operators.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EQ</code> : Equal.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one
     *        <i>AttributeValue</i> of type String, Number, or Binary (not a set
     *        type). If an item contains an <i>AttributeValue</i> element of a
     *        different type than the one specified in the request, the value
     *        does not match. For example, <code>{"S":"6"}</code> does not equal
     *        <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *        equal <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>LE</code> : Less than or equal.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one
     *        <i>AttributeValue</i> element of type String, Number, or Binary
     *        (not a set type). If an item contains an <i>AttributeValue</i>
     *        element of a different type than the one provided in the request,
     *        the value does not match. For example, <code>{"S":"6"}</code> does
     *        not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code>
     *        does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>LT</code> : Less than.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one
     *        <i>AttributeValue</i> of type String, Number, or Binary (not a set
     *        type). If an item contains an <i>AttributeValue</i> element of a
     *        different type than the one provided in the request, the value
     *        does not match. For example, <code>{"S":"6"}</code> does not equal
     *        <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code> does not
     *        compare to <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>GE</code> : Greater than or equal.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one
     *        <i>AttributeValue</i> element of type String, Number, or Binary
     *        (not a set type). If an item contains an <i>AttributeValue</i>
     *        element of a different type than the one provided in the request,
     *        the value does not match. For example, <code>{"S":"6"}</code> does
     *        not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code>
     *        does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>GT</code> : Greater than.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one
     *        <i>AttributeValue</i> element of type String, Number, or Binary
     *        (not a set type). If an item contains an <i>AttributeValue</i>
     *        element of a different type than the one provided in the request,
     *        the value does not match. For example, <code>{"S":"6"}</code> does
     *        not equal <code>{"N":"6"}</code>. Also, <code>{"N":"6"}</code>
     *        does not compare to <code>{"NS":["6", "2", "1"]}</code>.
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>BEGINS_WITH</code> : Checks for a prefix.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> can contain only one
     *        <i>AttributeValue</i> of type String or Binary (not a Number or a
     *        set type). The target attribute of the comparison must be of type
     *        String or Binary (not a Number or a set type).
     *        </p>
     *        <p/></li>
     *        <li>
     *        <p>
     *        <code>BETWEEN</code> : Greater than or equal to the first value,
     *        and less than or equal to the second value.
     *        </p>
     *        <p>
     *        <i>AttributeValueList</i> must contain two <i>AttributeValue</i>
     *        elements of the same type, either String, Number, or Binary (not a
     *        set type). A target attribute matches if the target value is
     *        greater than, or equal to, the first element and less than, or
     *        equal to, the second element. If an item contains an
     *        <i>AttributeValue</i> element of a different type than the one
     *        provided in the request, the value does not match. For example,
     *        <code>{"S":"6"}</code> does not compare to <code>{"N":"6"}</code>.
     *        Also, <code>{"N":"6"}</code> does not compare to
     *        <code>{"NS":["6", "2", "1"]}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        For usage examples of <i>AttributeValueList</i> and
     *        <i>ComparisonOperator</i>, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/LegacyConditionalParameters.html"
     *        >Legacy Conditional Parameters</a> in the <i>Amazon DynamoDB
     *        Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withKeyConditions(
            java.util.Map<String, Condition> keyConditions) {
        setKeyConditions(keyConditions);
        return this;
    }

    public QueryRequest addKeyConditionsEntry(String key, Condition value) {
        if (null == this.keyConditions) {
            this.keyConditions = new java.util.HashMap<String, Condition>();
        }
        if (this.keyConditions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.keyConditions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into KeyConditions. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */

    public QueryRequest clearKeyConditionsEntries() {
        this.keyConditions = null;
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the query results after the items are read and
     * returns only the desired values.
     * </p>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * <note>
     * <p>
     * A <i>QueryFilter</i> is applied after the items have already been read;
     * the process of filtering does not consume any additional read capacity
     * units.
     * </p>
     * </note>
     * <p>
     * If you provide more than one condition in the <i>QueryFilter</i> map,
     * then by default all of the conditions must evaluate to true. In other
     * words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If you
     * do this, then at least one of the conditions must evaluate to true,
     * rather than all of them.)
     * </p>
     * <p>
     * Note that <i>QueryFilter</i> does not allow key attributes. You cannot
     * define a filter condition on a partition key or a sort key.
     * </p>
     * <p>
     * Each <i>QueryFilter</i> element consists of an attribute name to compare,
     * along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * operator specified in <i>ComparisonOperator</i>.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     * >JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For
     * example, equals, greater than, less than, etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see the <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     * >Condition</a> data type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <p>
     *         This is a legacy parameter, for backward compatibility. New
     *         applications should use <i>FilterExpression</i> instead. Do not
     *         combine legacy parameters and expression parameters in a single
     *         API call; otherwise, DynamoDB will return a
     *         <i>ValidationException</i> exception.
     *         </p>
     *         </important>
     *         <p>
     *         A condition that evaluates the query results after the items are
     *         read and returns only the desired values.
     *         </p>
     *         <p>
     *         This parameter does not support attributes of type List or Map.
     *         </p>
     *         <note>
     *         <p>
     *         A <i>QueryFilter</i> is applied after the items have already been
     *         read; the process of filtering does not consume any additional
     *         read capacity units.
     *         </p>
     *         </note>
     *         <p>
     *         If you provide more than one condition in the <i>QueryFilter</i>
     *         map, then by default all of the conditions must evaluate to true.
     *         In other words, the conditions are ANDed together. (You can use
     *         the <i>ConditionalOperator</i> parameter to OR the conditions
     *         instead. If you do this, then at least one of the conditions must
     *         evaluate to true, rather than all of them.)
     *         </p>
     *         <p>
     *         Note that <i>QueryFilter</i> does not allow key attributes. You
     *         cannot define a filter condition on a partition key or a sort
     *         key.
     *         </p>
     *         <p>
     *         Each <i>QueryFilter</i> element consists of an attribute name to
     *         compare, along with the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>AttributeValueList</i> - One or more values to evaluate
     *         against the supplied attribute. The number of values in the list
     *         depends on the operator specified in <i>ComparisonOperator</i>.
     *         </p>
     *         <p>
     *         For type Number, value comparisons are numeric.
     *         </p>
     *         <p>
     *         String value comparisons for greater than, equals, or less than
     *         are based on ASCII character code values. For example,
     *         <code>a</code> is greater than <code>A</code>, and <code>a</code>
     *         is greater than <code>B</code>. For a list of code values, see <a
     *         href
     *         ="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *         >http
     *         ://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *         </p>
     *         <p>
     *         For type Binary, DynamoDB treats each byte of the binary data as
     *         unsigned when it compares binary values.
     *         </p>
     *         <p>
     *         For information on specifying data types in JSON, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     *         >JSON Data Format</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>ComparisonOperator</i> - A comparator for evaluating
     *         attributes. For example, equals, greater than, less than, etc.
     *         </p>
     *         <p>
     *         The following comparison operators are available:
     *         </p>
     *         <p>
     *         <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     *         </p>
     *         <p>
     *         For complete descriptions of all comparison operators, see the <a
     *         href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     *         >Condition</a> data type.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, Condition> getQueryFilter() {
        return queryFilter;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the query results after the items are read and
     * returns only the desired values.
     * </p>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * <note>
     * <p>
     * A <i>QueryFilter</i> is applied after the items have already been read;
     * the process of filtering does not consume any additional read capacity
     * units.
     * </p>
     * </note>
     * <p>
     * If you provide more than one condition in the <i>QueryFilter</i> map,
     * then by default all of the conditions must evaluate to true. In other
     * words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If you
     * do this, then at least one of the conditions must evaluate to true,
     * rather than all of them.)
     * </p>
     * <p>
     * Note that <i>QueryFilter</i> does not allow key attributes. You cannot
     * define a filter condition on a partition key or a sort key.
     * </p>
     * <p>
     * Each <i>QueryFilter</i> element consists of an attribute name to compare,
     * along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * operator specified in <i>ComparisonOperator</i>.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     * >JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For
     * example, equals, greater than, less than, etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see the <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     * >Condition</a> data type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param queryFilter
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New
     *        applications should use <i>FilterExpression</i> instead. Do not
     *        combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A condition that evaluates the query results after the items are
     *        read and returns only the desired values.
     *        </p>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     *        <note>
     *        <p>
     *        A <i>QueryFilter</i> is applied after the items have already been
     *        read; the process of filtering does not consume any additional
     *        read capacity units.
     *        </p>
     *        </note>
     *        <p>
     *        If you provide more than one condition in the <i>QueryFilter</i>
     *        map, then by default all of the conditions must evaluate to true.
     *        In other words, the conditions are ANDed together. (You can use
     *        the <i>ConditionalOperator</i> parameter to OR the conditions
     *        instead. If you do this, then at least one of the conditions must
     *        evaluate to true, rather than all of them.)
     *        </p>
     *        <p>
     *        Note that <i>QueryFilter</i> does not allow key attributes. You
     *        cannot define a filter condition on a partition key or a sort key.
     *        </p>
     *        <p>
     *        Each <i>QueryFilter</i> element consists of an attribute name to
     *        compare, along with the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeValueList</i> - One or more values to evaluate against
     *        the supplied attribute. The number of values in the list depends
     *        on the operator specified in <i>ComparisonOperator</i>.
     *        </p>
     *        <p>
     *        For type Number, value comparisons are numeric.
     *        </p>
     *        <p>
     *        String value comparisons for greater than, equals, or less than
     *        are based on ASCII character code values. For example,
     *        <code>a</code> is greater than <code>A</code>, and <code>a</code>
     *        is greater than <code>B</code>. For a list of code values, see <a
     *        href
     *        ="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *        >http
     *        ://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *        </p>
     *        <p>
     *        For type Binary, DynamoDB treats each byte of the binary data as
     *        unsigned when it compares binary values.
     *        </p>
     *        <p>
     *        For information on specifying data types in JSON, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     *        >JSON Data Format</a> in the <i>Amazon DynamoDB Developer
     *        Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ComparisonOperator</i> - A comparator for evaluating
     *        attributes. For example, equals, greater than, less than, etc.
     *        </p>
     *        <p>
     *        The following comparison operators are available:
     *        </p>
     *        <p>
     *        <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     *        </p>
     *        <p>
     *        For complete descriptions of all comparison operators, see the <a
     *        href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     *        >Condition</a> data type.
     *        </p>
     *        </li>
     */

    public void setQueryFilter(java.util.Map<String, Condition> queryFilter) {
        this.queryFilter = queryFilter;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A condition that evaluates the query results after the items are read and
     * returns only the desired values.
     * </p>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * <note>
     * <p>
     * A <i>QueryFilter</i> is applied after the items have already been read;
     * the process of filtering does not consume any additional read capacity
     * units.
     * </p>
     * </note>
     * <p>
     * If you provide more than one condition in the <i>QueryFilter</i> map,
     * then by default all of the conditions must evaluate to true. In other
     * words, the conditions are ANDed together. (You can use the
     * <i>ConditionalOperator</i> parameter to OR the conditions instead. If you
     * do this, then at least one of the conditions must evaluate to true,
     * rather than all of them.)
     * </p>
     * <p>
     * Note that <i>QueryFilter</i> does not allow key attributes. You cannot
     * define a filter condition on a partition key or a sort key.
     * </p>
     * <p>
     * Each <i>QueryFilter</i> element consists of an attribute name to compare,
     * along with the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeValueList</i> - One or more values to evaluate against the
     * supplied attribute. The number of values in the list depends on the
     * operator specified in <i>ComparisonOperator</i>.
     * </p>
     * <p>
     * For type Number, value comparisons are numeric.
     * </p>
     * <p>
     * String value comparisons for greater than, equals, or less than are based
     * on ASCII character code values. For example, <code>a</code> is greater
     * than <code>A</code>, and <code>a</code> is greater than <code>B</code>.
     * For a list of code values, see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     * </p>
     * <p>
     * For type Binary, DynamoDB treats each byte of the binary data as unsigned
     * when it compares binary values.
     * </p>
     * <p>
     * For information on specifying data types in JSON, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     * >JSON Data Format</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>ComparisonOperator</i> - A comparator for evaluating attributes. For
     * example, equals, greater than, less than, etc.
     * </p>
     * <p>
     * The following comparison operators are available:
     * </p>
     * <p>
     * <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     * </p>
     * <p>
     * For complete descriptions of all comparison operators, see the <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     * >Condition</a> data type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param queryFilter
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New
     *        applications should use <i>FilterExpression</i> instead. Do not
     *        combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A condition that evaluates the query results after the items are
     *        read and returns only the desired values.
     *        </p>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     *        <note>
     *        <p>
     *        A <i>QueryFilter</i> is applied after the items have already been
     *        read; the process of filtering does not consume any additional
     *        read capacity units.
     *        </p>
     *        </note>
     *        <p>
     *        If you provide more than one condition in the <i>QueryFilter</i>
     *        map, then by default all of the conditions must evaluate to true.
     *        In other words, the conditions are ANDed together. (You can use
     *        the <i>ConditionalOperator</i> parameter to OR the conditions
     *        instead. If you do this, then at least one of the conditions must
     *        evaluate to true, rather than all of them.)
     *        </p>
     *        <p>
     *        Note that <i>QueryFilter</i> does not allow key attributes. You
     *        cannot define a filter condition on a partition key or a sort key.
     *        </p>
     *        <p>
     *        Each <i>QueryFilter</i> element consists of an attribute name to
     *        compare, along with the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AttributeValueList</i> - One or more values to evaluate against
     *        the supplied attribute. The number of values in the list depends
     *        on the operator specified in <i>ComparisonOperator</i>.
     *        </p>
     *        <p>
     *        For type Number, value comparisons are numeric.
     *        </p>
     *        <p>
     *        String value comparisons for greater than, equals, or less than
     *        are based on ASCII character code values. For example,
     *        <code>a</code> is greater than <code>A</code>, and <code>a</code>
     *        is greater than <code>B</code>. For a list of code values, see <a
     *        href
     *        ="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *        >http
     *        ://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters</a>.
     *        </p>
     *        <p>
     *        For type Binary, DynamoDB treats each byte of the binary data as
     *        unsigned when it compares binary values.
     *        </p>
     *        <p>
     *        For information on specifying data types in JSON, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataFormat.html"
     *        >JSON Data Format</a> in the <i>Amazon DynamoDB Developer
     *        Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>ComparisonOperator</i> - A comparator for evaluating
     *        attributes. For example, equals, greater than, less than, etc.
     *        </p>
     *        <p>
     *        The following comparison operators are available:
     *        </p>
     *        <p>
     *        <code>EQ | NE | LE | LT | GE | GT | NOT_NULL | NULL | CONTAINS | NOT_CONTAINS | BEGINS_WITH | IN | BETWEEN</code>
     *        </p>
     *        <p>
     *        For complete descriptions of all comparison operators, see the <a
     *        href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_Condition.html"
     *        >Condition</a> data type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withQueryFilter(
            java.util.Map<String, Condition> queryFilter) {
        setQueryFilter(queryFilter);
        return this;
    }

    public QueryRequest addQueryFilterEntry(String key, Condition value) {
        if (null == this.queryFilter) {
            this.queryFilter = new java.util.HashMap<String, Condition>();
        }
        if (this.queryFilter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.queryFilter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into QueryFilter. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */

    public QueryRequest clearQueryFilterEntries() {
        this.queryFilter = null;
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>QueryFilter</i>
     * map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the
     * entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true,
     * then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the
     * default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @param conditionalOperator
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New
     *        applications should use <i>FilterExpression</i> instead. Do not
     *        combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A logical operator to apply to the conditions in a
     *        <i>QueryFilter</i> map:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AND</code> - If all of the conditions evaluate to true, then
     *        the entire map evaluates to true.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OR</code> - If at least one of the conditions evaluate to
     *        true, then the entire map evaluates to true.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     *        the default.
     *        </p>
     *        <p>
     *        The operation will succeed only if the entire map evaluates to
     *        true.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     * @see ConditionalOperator
     */

    public void setConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>QueryFilter</i>
     * map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the
     * entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true,
     * then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the
     * default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @return <p>
     *         This is a legacy parameter, for backward compatibility. New
     *         applications should use <i>FilterExpression</i> instead. Do not
     *         combine legacy parameters and expression parameters in a single
     *         API call; otherwise, DynamoDB will return a
     *         <i>ValidationException</i> exception.
     *         </p>
     *         </important>
     *         <p>
     *         A logical operator to apply to the conditions in a
     *         <i>QueryFilter</i> map:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AND</code> - If all of the conditions evaluate to true,
     *         then the entire map evaluates to true.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OR</code> - If at least one of the conditions evaluate to
     *         true, then the entire map evaluates to true.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     *         the default.
     *         </p>
     *         <p>
     *         The operation will succeed only if the entire map evaluates to
     *         true.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter does not support attributes of type List or Map.
     *         </p>
     * @see ConditionalOperator
     */

    public String getConditionalOperator() {
        return this.conditionalOperator;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>QueryFilter</i>
     * map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the
     * entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true,
     * then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the
     * default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @param conditionalOperator
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New
     *        applications should use <i>FilterExpression</i> instead. Do not
     *        combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A logical operator to apply to the conditions in a
     *        <i>QueryFilter</i> map:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AND</code> - If all of the conditions evaluate to true, then
     *        the entire map evaluates to true.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OR</code> - If at least one of the conditions evaluate to
     *        true, then the entire map evaluates to true.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     *        the default.
     *        </p>
     *        <p>
     *        The operation will succeed only if the entire map evaluates to
     *        true.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ConditionalOperator
     */

    public QueryRequest withConditionalOperator(String conditionalOperator) {
        setConditionalOperator(conditionalOperator);
        return this;
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>QueryFilter</i>
     * map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the
     * entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true,
     * then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the
     * default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @param conditionalOperator
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New
     *        applications should use <i>FilterExpression</i> instead. Do not
     *        combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A logical operator to apply to the conditions in a
     *        <i>QueryFilter</i> map:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AND</code> - If all of the conditions evaluate to true, then
     *        the entire map evaluates to true.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OR</code> - If at least one of the conditions evaluate to
     *        true, then the entire map evaluates to true.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     *        the default.
     *        </p>
     *        <p>
     *        The operation will succeed only if the entire map evaluates to
     *        true.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ConditionalOperator
     */

    public void setConditionalOperator(ConditionalOperator conditionalOperator) {
        this.conditionalOperator = conditionalOperator.toString();
    }

    /**
     * <important>
     * <p>
     * This is a legacy parameter, for backward compatibility. New applications
     * should use <i>FilterExpression</i> instead. Do not combine legacy
     * parameters and expression parameters in a single API call; otherwise,
     * DynamoDB will return a <i>ValidationException</i> exception.
     * </p>
     * </important>
     * <p>
     * A logical operator to apply to the conditions in a <i>QueryFilter</i>
     * map:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AND</code> - If all of the conditions evaluate to true, then the
     * entire map evaluates to true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> - If at least one of the conditions evaluate to true,
     * then the entire map evaluates to true.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you omit <i>ConditionalOperator</i>, then <code>AND</code> is the
     * default.
     * </p>
     * <p>
     * The operation will succeed only if the entire map evaluates to true.
     * </p>
     * <note>
     * <p>
     * This parameter does not support attributes of type List or Map.
     * </p>
     * </note>
     * 
     * @param conditionalOperator
     *        <p>
     *        This is a legacy parameter, for backward compatibility. New
     *        applications should use <i>FilterExpression</i> instead. Do not
     *        combine legacy parameters and expression parameters in a single
     *        API call; otherwise, DynamoDB will return a
     *        <i>ValidationException</i> exception.
     *        </p>
     *        </important>
     *        <p>
     *        A logical operator to apply to the conditions in a
     *        <i>QueryFilter</i> map:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AND</code> - If all of the conditions evaluate to true, then
     *        the entire map evaluates to true.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OR</code> - If at least one of the conditions evaluate to
     *        true, then the entire map evaluates to true.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you omit <i>ConditionalOperator</i>, then <code>AND</code> is
     *        the default.
     *        </p>
     *        <p>
     *        The operation will succeed only if the entire map evaluates to
     *        true.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter does not support attributes of type List or Map.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ConditionalOperator
     */

    public QueryRequest withConditionalOperator(
            ConditionalOperator conditionalOperator) {
        setConditionalOperator(conditionalOperator);
        return this;
    }

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default),
     * the traversal is performed in ascending order; if <code>false</code>, the
     * traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by
     * sort key. If the sort key data type is Number, the results are stored in
     * numeric order. For type String, the results are stored in order of ASCII
     * character code values. For type Binary, DynamoDB treats each byte of the
     * binary data as unsigned.
     * </p>
     * <p>
     * If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns the
     * results in the order in which they are stored (by sort key value). This
     * is the default behavior. If <i>ScanIndexForward</i> is <code>false</code>
     * , DynamoDB reads the results in reverse order by sort key value, and then
     * returns the results to the client.
     * </p>
     * 
     * @param scanIndexForward
     *        Specifies the order for index traversal: If <code>true</code>
     *        (default), the traversal is performed in ascending order; if
     *        <code>false</code>, the traversal is performed in descending
     *        order. </p>
     *        <p>
     *        Items with the same partition key value are stored in sorted order
     *        by sort key. If the sort key data type is Number, the results are
     *        stored in numeric order. For type String, the results are stored
     *        in order of ASCII character code values. For type Binary, DynamoDB
     *        treats each byte of the binary data as unsigned.
     *        </p>
     *        <p>
     *        If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns
     *        the results in the order in which they are stored (by sort key
     *        value). This is the default behavior. If <i>ScanIndexForward</i>
     *        is <code>false</code>, DynamoDB reads the results in reverse order
     *        by sort key value, and then returns the results to the client.
     */

    public void setScanIndexForward(Boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
    }

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default),
     * the traversal is performed in ascending order; if <code>false</code>, the
     * traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by
     * sort key. If the sort key data type is Number, the results are stored in
     * numeric order. For type String, the results are stored in order of ASCII
     * character code values. For type Binary, DynamoDB treats each byte of the
     * binary data as unsigned.
     * </p>
     * <p>
     * If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns the
     * results in the order in which they are stored (by sort key value). This
     * is the default behavior. If <i>ScanIndexForward</i> is <code>false</code>
     * , DynamoDB reads the results in reverse order by sort key value, and then
     * returns the results to the client.
     * </p>
     * 
     * @return Specifies the order for index traversal: If <code>true</code>
     *         (default), the traversal is performed in ascending order; if
     *         <code>false</code>, the traversal is performed in descending
     *         order. </p>
     *         <p>
     *         Items with the same partition key value are stored in sorted
     *         order by sort key. If the sort key data type is Number, the
     *         results are stored in numeric order. For type String, the results
     *         are stored in order of ASCII character code values. For type
     *         Binary, DynamoDB treats each byte of the binary data as unsigned.
     *         </p>
     *         <p>
     *         If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns
     *         the results in the order in which they are stored (by sort key
     *         value). This is the default behavior. If <i>ScanIndexForward</i>
     *         is <code>false</code>, DynamoDB reads the results in reverse
     *         order by sort key value, and then returns the results to the
     *         client.
     */

    public Boolean getScanIndexForward() {
        return this.scanIndexForward;
    }

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default),
     * the traversal is performed in ascending order; if <code>false</code>, the
     * traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by
     * sort key. If the sort key data type is Number, the results are stored in
     * numeric order. For type String, the results are stored in order of ASCII
     * character code values. For type Binary, DynamoDB treats each byte of the
     * binary data as unsigned.
     * </p>
     * <p>
     * If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns the
     * results in the order in which they are stored (by sort key value). This
     * is the default behavior. If <i>ScanIndexForward</i> is <code>false</code>
     * , DynamoDB reads the results in reverse order by sort key value, and then
     * returns the results to the client.
     * </p>
     * 
     * @param scanIndexForward
     *        Specifies the order for index traversal: If <code>true</code>
     *        (default), the traversal is performed in ascending order; if
     *        <code>false</code>, the traversal is performed in descending
     *        order. </p>
     *        <p>
     *        Items with the same partition key value are stored in sorted order
     *        by sort key. If the sort key data type is Number, the results are
     *        stored in numeric order. For type String, the results are stored
     *        in order of ASCII character code values. For type Binary, DynamoDB
     *        treats each byte of the binary data as unsigned.
     *        </p>
     *        <p>
     *        If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns
     *        the results in the order in which they are stored (by sort key
     *        value). This is the default behavior. If <i>ScanIndexForward</i>
     *        is <code>false</code>, DynamoDB reads the results in reverse order
     *        by sort key value, and then returns the results to the client.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withScanIndexForward(Boolean scanIndexForward) {
        setScanIndexForward(scanIndexForward);
        return this;
    }

    /**
     * <p>
     * Specifies the order for index traversal: If <code>true</code> (default),
     * the traversal is performed in ascending order; if <code>false</code>, the
     * traversal is performed in descending order.
     * </p>
     * <p>
     * Items with the same partition key value are stored in sorted order by
     * sort key. If the sort key data type is Number, the results are stored in
     * numeric order. For type String, the results are stored in order of ASCII
     * character code values. For type Binary, DynamoDB treats each byte of the
     * binary data as unsigned.
     * </p>
     * <p>
     * If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns the
     * results in the order in which they are stored (by sort key value). This
     * is the default behavior. If <i>ScanIndexForward</i> is <code>false</code>
     * , DynamoDB reads the results in reverse order by sort key value, and then
     * returns the results to the client.
     * </p>
     * 
     * @return Specifies the order for index traversal: If <code>true</code>
     *         (default), the traversal is performed in ascending order; if
     *         <code>false</code>, the traversal is performed in descending
     *         order. </p>
     *         <p>
     *         Items with the same partition key value are stored in sorted
     *         order by sort key. If the sort key data type is Number, the
     *         results are stored in numeric order. For type String, the results
     *         are stored in order of ASCII character code values. For type
     *         Binary, DynamoDB treats each byte of the binary data as unsigned.
     *         </p>
     *         <p>
     *         If <i>ScanIndexForward</i> is <code>true</code>, DynamoDB returns
     *         the results in the order in which they are stored (by sort key
     *         value). This is the default behavior. If <i>ScanIndexForward</i>
     *         is <code>false</code>, DynamoDB reads the results in reverse
     *         order by sort key value, and then returns the results to the
     *         client.
     */

    public Boolean isScanIndexForward() {
        return this.scanIndexForward;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <i>LastEvaluatedKey</i> in the previous
     * operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or
     * Binary. No set data types are allowed.
     * </p>
     * 
     * @return The primary key of the first item that this operation will
     *         evaluate. Use the value that was returned for
     *         <i>LastEvaluatedKey</i> in the previous operation.</p>
     *         <p>
     *         The data type for <i>ExclusiveStartKey</i> must be String, Number
     *         or Binary. No set data types are allowed.
     */

    public java.util.Map<String, AttributeValue> getExclusiveStartKey() {
        return exclusiveStartKey;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <i>LastEvaluatedKey</i> in the previous
     * operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or
     * Binary. No set data types are allowed.
     * </p>
     * 
     * @param exclusiveStartKey
     *        The primary key of the first item that this operation will
     *        evaluate. Use the value that was returned for
     *        <i>LastEvaluatedKey</i> in the previous operation.</p>
     *        <p>
     *        The data type for <i>ExclusiveStartKey</i> must be String, Number
     *        or Binary. No set data types are allowed.
     */

    public void setExclusiveStartKey(
            java.util.Map<String, AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }

    /**
     * <p>
     * The primary key of the first item that this operation will evaluate. Use
     * the value that was returned for <i>LastEvaluatedKey</i> in the previous
     * operation.
     * </p>
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or
     * Binary. No set data types are allowed.
     * </p>
     * 
     * @param exclusiveStartKey
     *        The primary key of the first item that this operation will
     *        evaluate. Use the value that was returned for
     *        <i>LastEvaluatedKey</i> in the previous operation.</p>
     *        <p>
     *        The data type for <i>ExclusiveStartKey</i> must be String, Number
     *        or Binary. No set data types are allowed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withExclusiveStartKey(
            java.util.Map<String, AttributeValue> exclusiveStartKey) {
        setExclusiveStartKey(exclusiveStartKey);
        return this;
    }

    public QueryRequest addExclusiveStartKeyEntry(String key,
            AttributeValue value) {
        if (null == this.exclusiveStartKey) {
            this.exclusiveStartKey = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.exclusiveStartKey.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.exclusiveStartKey.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExclusiveStartKey. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */

    public QueryRequest clearExclusiveStartKeyEntries() {
        this.exclusiveStartKey = null;
        return this;
    }

    /**
     * @param returnConsumedCapacity
     * @see ReturnConsumedCapacity
     */

    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }

    /**
     * @return
     * @see ReturnConsumedCapacity
     */

    public String getReturnConsumedCapacity() {
        return this.returnConsumedCapacity;
    }

    /**
     * @param returnConsumedCapacity
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ReturnConsumedCapacity
     */

    public QueryRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        setReturnConsumedCapacity(returnConsumedCapacity);
        return this;
    }

    /**
     * @param returnConsumedCapacity
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ReturnConsumedCapacity
     */

    public void setReturnConsumedCapacity(
            ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }

    /**
     * @param returnConsumedCapacity
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ReturnConsumedCapacity
     */

    public QueryRequest withReturnConsumedCapacity(
            ReturnConsumedCapacity returnConsumedCapacity) {
        setReturnConsumedCapacity(returnConsumedCapacity);
        return this;
    }

    /**
     * <p>
     * A string that identifies one or more attributes to retrieve from the
     * table. These attributes can include scalars, sets, or elements of a JSON
     * document. The attributes in the expression must be separated by commas.
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
     *        of a JSON document. The attributes in the expression must be
     *        separated by commas.</p>
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
     * document. The attributes in the expression must be separated by commas.
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
     *         elements of a JSON document. The attributes in the expression
     *         must be separated by commas.</p>
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
     * document. The attributes in the expression must be separated by commas.
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
     *        of a JSON document. The attributes in the expression must be
     *        separated by commas.</p>
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

    public QueryRequest withProjectionExpression(String projectionExpression) {
        setProjectionExpression(projectionExpression);
        return this;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the
     * <i>Query</i> operation, but before the data is returned to you. Items
     * that do not satisfy the <i>FilterExpression</i> criteria are not
     * returned.
     * </p>
     * <note>
     * <p>
     * A <i>FilterExpression</i> is applied after the items have already been
     * read; the process of filtering does not consume any additional read
     * capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     * >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i> and
     * <i>ConditionalOperator</i> parameters.
     * </p>
     * </note>
     * 
     * @param filterExpression
     *        A string that contains conditions that DynamoDB applies after the
     *        <i>Query</i> operation, but before the data is returned to you.
     *        Items that do not satisfy the <i>FilterExpression</i> criteria are
     *        not returned.</p> <note>
     *        <p>
     *        A <i>FilterExpression</i> is applied after the items have already
     *        been read; the process of filtering does not consume any
     *        additional read capacity units.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *        >Filter Expressions</a> in the <i>Amazon DynamoDB Developer
     *        Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i> and
     *        <i>ConditionalOperator</i> parameters.
     *        </p>
     */

    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the
     * <i>Query</i> operation, but before the data is returned to you. Items
     * that do not satisfy the <i>FilterExpression</i> criteria are not
     * returned.
     * </p>
     * <note>
     * <p>
     * A <i>FilterExpression</i> is applied after the items have already been
     * read; the process of filtering does not consume any additional read
     * capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     * >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i> and
     * <i>ConditionalOperator</i> parameters.
     * </p>
     * </note>
     * 
     * @return A string that contains conditions that DynamoDB applies after the
     *         <i>Query</i> operation, but before the data is returned to you.
     *         Items that do not satisfy the <i>FilterExpression</i> criteria
     *         are not returned.</p> <note>
     *         <p>
     *         A <i>FilterExpression</i> is applied after the items have already
     *         been read; the process of filtering does not consume any
     *         additional read capacity units.
     *         </p>
     *         </note>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *         >Filter Expressions</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i>
     *         and <i>ConditionalOperator</i> parameters.
     *         </p>
     */

    public String getFilterExpression() {
        return this.filterExpression;
    }

    /**
     * <p>
     * A string that contains conditions that DynamoDB applies after the
     * <i>Query</i> operation, but before the data is returned to you. Items
     * that do not satisfy the <i>FilterExpression</i> criteria are not
     * returned.
     * </p>
     * <note>
     * <p>
     * A <i>FilterExpression</i> is applied after the items have already been
     * read; the process of filtering does not consume any additional read
     * capacity units.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     * >Filter Expressions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i> and
     * <i>ConditionalOperator</i> parameters.
     * </p>
     * </note>
     * 
     * @param filterExpression
     *        A string that contains conditions that DynamoDB applies after the
     *        <i>Query</i> operation, but before the data is returned to you.
     *        Items that do not satisfy the <i>FilterExpression</i> criteria are
     *        not returned.</p> <note>
     *        <p>
     *        A <i>FilterExpression</i> is applied after the items have already
     *        been read; the process of filtering does not consume any
     *        additional read capacity units.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#FilteringResults"
     *        >Filter Expressions</a> in the <i>Amazon DynamoDB Developer
     *        Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>FilterExpression</i> replaces the legacy <i>QueryFilter</i> and
     *        <i>ConditionalOperator</i> parameters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withFilterExpression(String filterExpression) {
        setFilterExpression(filterExpression);
        return this;
    }

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved
     * by the <i>Query</i> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key
     * value. The condition can also perform one of several comparison tests on
     * a single sort key value. <i>Query</i> can use
     * <i>KeyConditionExpression</i> to retrieve one item with a given partition
     * key value and sort key value, or several items that have the same
     * partition key value but different sort key values.
     * </p>
     * <p>
     * The partition key equality test is required, and must be specified in the
     * following format:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * </p>
     * <p>
     * If you also want to provide a condition for the sort key, it must be
     * combined using <i>AND</i> with the condition for the sort key. Following
     * is an example, using the <b>=</b> comparison operator for the sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * <i>AND</i> <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> - true if the
     * sort key value is equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3C;]]></i>
     * <code>:sortkeyval</code> - true if the sort key value is less than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3C;]]>=</i>
     * <code>:sortkeyval</code> - true if the sort key value is less than or
     * equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3E;]]></i>
     * <code>:sortkeyval</code> - true if the sort key value is greater than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3E;]]>= </i>
     * <code>:sortkeyval</code> - true if the sort key value is greater than or
     * equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>BETWEEN</i> <code>:sortkeyval1</code>
     * <i>AND</i> <code>:sortkeyval2</code> - true if the sort key value is
     * greater than or equal to <code>:sortkeyval1</code>, and less than or
     * equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>begins_with (</i><code>sortKeyName</code>, <code>:sortkeyval</code>
     * <i>)</i> - true if the sort key value begins with a particular operand.
     * (You cannot use this function with a sort key that is of type Number.)
     * Note that the function name <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <i>ExpressionAttributeValues</i> parameter to replace tokens such
     * as <code>:partitionval</code> and <code>:sortval</code> with actual
     * values at runtime.
     * </p>
     * <p>
     * You can optionally use the <i>ExpressionAttributeNames</i> parameter to
     * replace the names of the partition key and sort key with placeholder
     * tokens. This option might be necessary if an attribute name conflicts
     * with a DynamoDB reserved word. For example, the following
     * <i>KeyConditionExpression</i> parameter causes an error because
     * <i>Size</i> is a reserved word:
     * </p>
     * <ul>
     * <li> <code>Size = :myval</code></li>
     * </ul>
     * <p>
     * To work around this, define a placeholder (such a <code>#S</code>) to
     * represent the attribute name <i>Size</i>. <i>KeyConditionExpression</i>
     * then is as follows:
     * </p>
     * <ul>
     * <li> <code>#S = :myval</code></li>
     * </ul>
     * <p>
     * For a list of reserved words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For more information on <i>ExpressionAttributeNames</i> and
     * <i>ExpressionAttributeValues</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     * >Using Placeholders for Attribute Names and Values</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>KeyConditionExpression</i> replaces the legacy <i>KeyConditions</i>
     * parameter.
     * </p>
     * </note>
     * 
     * @param keyConditionExpression
     *        The condition that specifies the key value(s) for items to be
     *        retrieved by the <i>Query</i> action.</p>
     *        <p>
     *        The condition must perform an equality test on a single partition
     *        key value. The condition can also perform one of several
     *        comparison tests on a single sort key value. <i>Query</i> can use
     *        <i>KeyConditionExpression</i> to retrieve one item with a given
     *        partition key value and sort key value, or several items that have
     *        the same partition key value but different sort key values.
     *        </p>
     *        <p>
     *        The partition key equality test is required, and must be specified
     *        in the following format:
     *        </p>
     *        <p>
     *        <code>partitionKeyName</code> <i>=</i>
     *        <code>:partitionkeyval</code>
     *        </p>
     *        <p>
     *        If you also want to provide a condition for the sort key, it must
     *        be combined using <i>AND</i> with the condition for the sort key.
     *        Following is an example, using the <b>=</b> comparison operator
     *        for the sort key:
     *        </p>
     *        <p>
     *        <code>partitionKeyName</code> <i>=</i>
     *        <code>:partitionkeyval</code> <i>AND</i> <code>sortKeyName</code>
     *        <i>=</i> <code>:sortkeyval</code>
     *        </p>
     *        <p>
     *        Valid comparisons for the sort key condition are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> - true
     *        if the sort key value is equal to <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <i><![CDATA[&#x3C;]]></i>
     *        <code>:sortkeyval</code> - true if the sort key value is less than
     *        <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <i><![CDATA[&#x3C;]]>=</i>
     *        <code>:sortkeyval</code> - true if the sort key value is less than
     *        or equal to <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <i><![CDATA[&#x3E;]]></i>
     *        <code>:sortkeyval</code> - true if the sort key value is greater
     *        than <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <i><![CDATA[&#x3E;]]>= </i>
     *        <code>:sortkeyval</code> - true if the sort key value is greater
     *        than or equal to <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <i>BETWEEN</i> <code>:sortkeyval1</code>
     *        <i>AND</i> <code>:sortkeyval2</code> - true if the sort key value
     *        is greater than or equal to <code>:sortkeyval1</code>, and less
     *        than or equal to <code>:sortkeyval2</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>begins_with (</i><code>sortKeyName</code>,
     *        <code>:sortkeyval</code><i>)</i> - true if the sort key value
     *        begins with a particular operand. (You cannot use this function
     *        with a sort key that is of type Number.) Note that the function
     *        name <code>begins_with</code> is case-sensitive.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use the <i>ExpressionAttributeValues</i> parameter to replace
     *        tokens such as <code>:partitionval</code> and
     *        <code>:sortval</code> with actual values at runtime.
     *        </p>
     *        <p>
     *        You can optionally use the <i>ExpressionAttributeNames</i>
     *        parameter to replace the names of the partition key and sort key
     *        with placeholder tokens. This option might be necessary if an
     *        attribute name conflicts with a DynamoDB reserved word. For
     *        example, the following <i>KeyConditionExpression</i> parameter
     *        causes an error because <i>Size</i> is a reserved word:
     *        </p>
     *        <ul>
     *        <li> <code>Size = :myval</code></li>
     *        </ul>
     *        <p>
     *        To work around this, define a placeholder (such a <code>#S</code>)
     *        to represent the attribute name <i>Size</i>.
     *        <i>KeyConditionExpression</i> then is as follows:
     *        </p>
     *        <ul>
     *        <li> <code>#S = :myval</code></li>
     *        </ul>
     *        <p>
     *        For a list of reserved words, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     *        >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information on <i>ExpressionAttributeNames</i> and
     *        <i>ExpressionAttributeValues</i>, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     *        >Using Placeholders for Attribute Names and Values</a> in the
     *        <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>KeyConditionExpression</i> replaces the legacy
     *        <i>KeyConditions</i> parameter.
     *        </p>
     */

    public void setKeyConditionExpression(String keyConditionExpression) {
        this.keyConditionExpression = keyConditionExpression;
    }

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved
     * by the <i>Query</i> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key
     * value. The condition can also perform one of several comparison tests on
     * a single sort key value. <i>Query</i> can use
     * <i>KeyConditionExpression</i> to retrieve one item with a given partition
     * key value and sort key value, or several items that have the same
     * partition key value but different sort key values.
     * </p>
     * <p>
     * The partition key equality test is required, and must be specified in the
     * following format:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * </p>
     * <p>
     * If you also want to provide a condition for the sort key, it must be
     * combined using <i>AND</i> with the condition for the sort key. Following
     * is an example, using the <b>=</b> comparison operator for the sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * <i>AND</i> <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> - true if the
     * sort key value is equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3C;]]></i>
     * <code>:sortkeyval</code> - true if the sort key value is less than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3C;]]>=</i>
     * <code>:sortkeyval</code> - true if the sort key value is less than or
     * equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3E;]]></i>
     * <code>:sortkeyval</code> - true if the sort key value is greater than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3E;]]>= </i>
     * <code>:sortkeyval</code> - true if the sort key value is greater than or
     * equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>BETWEEN</i> <code>:sortkeyval1</code>
     * <i>AND</i> <code>:sortkeyval2</code> - true if the sort key value is
     * greater than or equal to <code>:sortkeyval1</code>, and less than or
     * equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>begins_with (</i><code>sortKeyName</code>, <code>:sortkeyval</code>
     * <i>)</i> - true if the sort key value begins with a particular operand.
     * (You cannot use this function with a sort key that is of type Number.)
     * Note that the function name <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <i>ExpressionAttributeValues</i> parameter to replace tokens such
     * as <code>:partitionval</code> and <code>:sortval</code> with actual
     * values at runtime.
     * </p>
     * <p>
     * You can optionally use the <i>ExpressionAttributeNames</i> parameter to
     * replace the names of the partition key and sort key with placeholder
     * tokens. This option might be necessary if an attribute name conflicts
     * with a DynamoDB reserved word. For example, the following
     * <i>KeyConditionExpression</i> parameter causes an error because
     * <i>Size</i> is a reserved word:
     * </p>
     * <ul>
     * <li> <code>Size = :myval</code></li>
     * </ul>
     * <p>
     * To work around this, define a placeholder (such a <code>#S</code>) to
     * represent the attribute name <i>Size</i>. <i>KeyConditionExpression</i>
     * then is as follows:
     * </p>
     * <ul>
     * <li> <code>#S = :myval</code></li>
     * </ul>
     * <p>
     * For a list of reserved words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For more information on <i>ExpressionAttributeNames</i> and
     * <i>ExpressionAttributeValues</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     * >Using Placeholders for Attribute Names and Values</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>KeyConditionExpression</i> replaces the legacy <i>KeyConditions</i>
     * parameter.
     * </p>
     * </note>
     * 
     * @return The condition that specifies the key value(s) for items to be
     *         retrieved by the <i>Query</i> action.</p>
     *         <p>
     *         The condition must perform an equality test on a single partition
     *         key value. The condition can also perform one of several
     *         comparison tests on a single sort key value. <i>Query</i> can use
     *         <i>KeyConditionExpression</i> to retrieve one item with a given
     *         partition key value and sort key value, or several items that
     *         have the same partition key value but different sort key values.
     *         </p>
     *         <p>
     *         The partition key equality test is required, and must be
     *         specified in the following format:
     *         </p>
     *         <p>
     *         <code>partitionKeyName</code> <i>=</i>
     *         <code>:partitionkeyval</code>
     *         </p>
     *         <p>
     *         If you also want to provide a condition for the sort key, it must
     *         be combined using <i>AND</i> with the condition for the sort key.
     *         Following is an example, using the <b>=</b> comparison operator
     *         for the sort key:
     *         </p>
     *         <p>
     *         <code>partitionKeyName</code> <i>=</i>
     *         <code>:partitionkeyval</code> <i>AND</i> <code>sortKeyName</code>
     *         <i>=</i> <code>:sortkeyval</code>
     *         </p>
     *         <p>
     *         Valid comparisons for the sort key condition are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> - true
     *         if the sort key value is equal to <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <i><![CDATA[&#x3C;]]></i>
     *         <code>:sortkeyval</code> - true if the sort key value is less
     *         than <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <i><![CDATA[&#x3C;]]>=</i>
     *         <code>:sortkeyval</code> - true if the sort key value is less
     *         than or equal to <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <i><![CDATA[&#x3E;]]></i>
     *         <code>:sortkeyval</code> - true if the sort key value is greater
     *         than <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <i><![CDATA[&#x3E;]]>= </i>
     *         <code>:sortkeyval</code> - true if the sort key value is greater
     *         than or equal to <code>:sortkeyval</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sortKeyName</code> <i>BETWEEN</i> <code>:sortkeyval1</code>
     *         <i>AND</i> <code>:sortkeyval2</code> - true if the sort key value
     *         is greater than or equal to <code>:sortkeyval1</code>, and less
     *         than or equal to <code>:sortkeyval2</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>begins_with (</i><code>sortKeyName</code>,
     *         <code>:sortkeyval</code><i>)</i> - true if the sort key value
     *         begins with a particular operand. (You cannot use this function
     *         with a sort key that is of type Number.) Note that the function
     *         name <code>begins_with</code> is case-sensitive.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Use the <i>ExpressionAttributeValues</i> parameter to replace
     *         tokens such as <code>:partitionval</code> and
     *         <code>:sortval</code> with actual values at runtime.
     *         </p>
     *         <p>
     *         You can optionally use the <i>ExpressionAttributeNames</i>
     *         parameter to replace the names of the partition key and sort key
     *         with placeholder tokens. This option might be necessary if an
     *         attribute name conflicts with a DynamoDB reserved word. For
     *         example, the following <i>KeyConditionExpression</i> parameter
     *         causes an error because <i>Size</i> is a reserved word:
     *         </p>
     *         <ul>
     *         <li> <code>Size = :myval</code></li>
     *         </ul>
     *         <p>
     *         To work around this, define a placeholder (such a <code>#S</code>
     *         ) to represent the attribute name <i>Size</i>.
     *         <i>KeyConditionExpression</i> then is as follows:
     *         </p>
     *         <ul>
     *         <li> <code>#S = :myval</code></li>
     *         </ul>
     *         <p>
     *         For a list of reserved words, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     *         >Reserved Words</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     *         <p>
     *         For more information on <i>ExpressionAttributeNames</i> and
     *         <i>ExpressionAttributeValues</i>, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     *         >Using Placeholders for Attribute Names and Values</a> in the
     *         <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         <i>KeyConditionExpression</i> replaces the legacy
     *         <i>KeyConditions</i> parameter.
     *         </p>
     */

    public String getKeyConditionExpression() {
        return this.keyConditionExpression;
    }

    /**
     * <p>
     * The condition that specifies the key value(s) for items to be retrieved
     * by the <i>Query</i> action.
     * </p>
     * <p>
     * The condition must perform an equality test on a single partition key
     * value. The condition can also perform one of several comparison tests on
     * a single sort key value. <i>Query</i> can use
     * <i>KeyConditionExpression</i> to retrieve one item with a given partition
     * key value and sort key value, or several items that have the same
     * partition key value but different sort key values.
     * </p>
     * <p>
     * The partition key equality test is required, and must be specified in the
     * following format:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * </p>
     * <p>
     * If you also want to provide a condition for the sort key, it must be
     * combined using <i>AND</i> with the condition for the sort key. Following
     * is an example, using the <b>=</b> comparison operator for the sort key:
     * </p>
     * <p>
     * <code>partitionKeyName</code> <i>=</i> <code>:partitionkeyval</code>
     * <i>AND</i> <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code>
     * </p>
     * <p>
     * Valid comparisons for the sort key condition are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> - true if the
     * sort key value is equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3C;]]></i>
     * <code>:sortkeyval</code> - true if the sort key value is less than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3C;]]>=</i>
     * <code>:sortkeyval</code> - true if the sort key value is less than or
     * equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3E;]]></i>
     * <code>:sortkeyval</code> - true if the sort key value is greater than
     * <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i><![CDATA[&#x3E;]]>= </i>
     * <code>:sortkeyval</code> - true if the sort key value is greater than or
     * equal to <code>:sortkeyval</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sortKeyName</code> <i>BETWEEN</i> <code>:sortkeyval1</code>
     * <i>AND</i> <code>:sortkeyval2</code> - true if the sort key value is
     * greater than or equal to <code>:sortkeyval1</code>, and less than or
     * equal to <code>:sortkeyval2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>begins_with (</i><code>sortKeyName</code>, <code>:sortkeyval</code>
     * <i>)</i> - true if the sort key value begins with a particular operand.
     * (You cannot use this function with a sort key that is of type Number.)
     * Note that the function name <code>begins_with</code> is case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the <i>ExpressionAttributeValues</i> parameter to replace tokens such
     * as <code>:partitionval</code> and <code>:sortval</code> with actual
     * values at runtime.
     * </p>
     * <p>
     * You can optionally use the <i>ExpressionAttributeNames</i> parameter to
     * replace the names of the partition key and sort key with placeholder
     * tokens. This option might be necessary if an attribute name conflicts
     * with a DynamoDB reserved word. For example, the following
     * <i>KeyConditionExpression</i> parameter causes an error because
     * <i>Size</i> is a reserved word:
     * </p>
     * <ul>
     * <li> <code>Size = :myval</code></li>
     * </ul>
     * <p>
     * To work around this, define a placeholder (such a <code>#S</code>) to
     * represent the attribute name <i>Size</i>. <i>KeyConditionExpression</i>
     * then is as follows:
     * </p>
     * <ul>
     * <li> <code>#S = :myval</code></li>
     * </ul>
     * <p>
     * For a list of reserved words, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     * >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * For more information on <i>ExpressionAttributeNames</i> and
     * <i>ExpressionAttributeValues</i>, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     * >Using Placeholders for Attribute Names and Values</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <i>KeyConditionExpression</i> replaces the legacy <i>KeyConditions</i>
     * parameter.
     * </p>
     * </note>
     * 
     * @param keyConditionExpression
     *        The condition that specifies the key value(s) for items to be
     *        retrieved by the <i>Query</i> action.</p>
     *        <p>
     *        The condition must perform an equality test on a single partition
     *        key value. The condition can also perform one of several
     *        comparison tests on a single sort key value. <i>Query</i> can use
     *        <i>KeyConditionExpression</i> to retrieve one item with a given
     *        partition key value and sort key value, or several items that have
     *        the same partition key value but different sort key values.
     *        </p>
     *        <p>
     *        The partition key equality test is required, and must be specified
     *        in the following format:
     *        </p>
     *        <p>
     *        <code>partitionKeyName</code> <i>=</i>
     *        <code>:partitionkeyval</code>
     *        </p>
     *        <p>
     *        If you also want to provide a condition for the sort key, it must
     *        be combined using <i>AND</i> with the condition for the sort key.
     *        Following is an example, using the <b>=</b> comparison operator
     *        for the sort key:
     *        </p>
     *        <p>
     *        <code>partitionKeyName</code> <i>=</i>
     *        <code>:partitionkeyval</code> <i>AND</i> <code>sortKeyName</code>
     *        <i>=</i> <code>:sortkeyval</code>
     *        </p>
     *        <p>
     *        Valid comparisons for the sort key condition are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <i>=</i> <code>:sortkeyval</code> - true
     *        if the sort key value is equal to <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <i><![CDATA[&#x3C;]]></i>
     *        <code>:sortkeyval</code> - true if the sort key value is less than
     *        <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <i><![CDATA[&#x3C;]]>=</i>
     *        <code>:sortkeyval</code> - true if the sort key value is less than
     *        or equal to <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <i><![CDATA[&#x3E;]]></i>
     *        <code>:sortkeyval</code> - true if the sort key value is greater
     *        than <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <i><![CDATA[&#x3E;]]>= </i>
     *        <code>:sortkeyval</code> - true if the sort key value is greater
     *        than or equal to <code>:sortkeyval</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sortKeyName</code> <i>BETWEEN</i> <code>:sortkeyval1</code>
     *        <i>AND</i> <code>:sortkeyval2</code> - true if the sort key value
     *        is greater than or equal to <code>:sortkeyval1</code>, and less
     *        than or equal to <code>:sortkeyval2</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>begins_with (</i><code>sortKeyName</code>,
     *        <code>:sortkeyval</code><i>)</i> - true if the sort key value
     *        begins with a particular operand. (You cannot use this function
     *        with a sort key that is of type Number.) Note that the function
     *        name <code>begins_with</code> is case-sensitive.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Use the <i>ExpressionAttributeValues</i> parameter to replace
     *        tokens such as <code>:partitionval</code> and
     *        <code>:sortval</code> with actual values at runtime.
     *        </p>
     *        <p>
     *        You can optionally use the <i>ExpressionAttributeNames</i>
     *        parameter to replace the names of the partition key and sort key
     *        with placeholder tokens. This option might be necessary if an
     *        attribute name conflicts with a DynamoDB reserved word. For
     *        example, the following <i>KeyConditionExpression</i> parameter
     *        causes an error because <i>Size</i> is a reserved word:
     *        </p>
     *        <ul>
     *        <li> <code>Size = :myval</code></li>
     *        </ul>
     *        <p>
     *        To work around this, define a placeholder (such a <code>#S</code>)
     *        to represent the attribute name <i>Size</i>.
     *        <i>KeyConditionExpression</i> then is as follows:
     *        </p>
     *        <ul>
     *        <li> <code>#S = :myval</code></li>
     *        </ul>
     *        <p>
     *        For a list of reserved words, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ReservedWords.html"
     *        >Reserved Words</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information on <i>ExpressionAttributeNames</i> and
     *        <i>ExpressionAttributeValues</i>, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
     *        >Using Placeholders for Attribute Names and Values</a> in the
     *        <i>Amazon DynamoDB Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        <i>KeyConditionExpression</i> replaces the legacy
     *        <i>KeyConditions</i> parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withKeyConditionExpression(String keyConditionExpression) {
        setKeyConditionExpression(keyConditionExpression);
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

    public QueryRequest withExpressionAttributeNames(
            java.util.Map<String, String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    public QueryRequest addExpressionAttributeNamesEntry(String key,
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

    public QueryRequest clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
        return this;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an
     * attribute value. For example, suppose that you wanted to check whether
     * the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <i>ExpressionAttributeValues</i> as
     * follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return One or more values that can be substituted in an expression.</p>
     *         <p>
     *         Use the <b>:</b> (colon) character in an expression to
     *         dereference an attribute value. For example, suppose that you
     *         wanted to check whether the value of the <i>ProductStatus</i>
     *         attribute was one of the following:
     *         </p>
     *         <p>
     *         <code>Available | Backordered | Discontinued</code>
     *         </p>
     *         <p>
     *         You would first need to specify <i>ExpressionAttributeValues</i>
     *         as follows:
     *         </p>
     *         <p>
     *         <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     *         </p>
     *         <p>
     *         You could then use these values in an expression, such as this:
     *         </p>
     *         <p>
     *         <code>ProductStatus IN (:avail, :back, :disc)</code>
     *         </p>
     *         <p>
     *         For more information on expression attribute values, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *         >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     */

    public java.util.Map<String, AttributeValue> getExpressionAttributeValues() {
        return expressionAttributeValues;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an
     * attribute value. For example, suppose that you wanted to check whether
     * the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <i>ExpressionAttributeValues</i> as
     * follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param expressionAttributeValues
     *        One or more values that can be substituted in an expression.</p>
     *        <p>
     *        Use the <b>:</b> (colon) character in an expression to dereference
     *        an attribute value. For example, suppose that you wanted to check
     *        whether the value of the <i>ProductStatus</i> attribute was one of
     *        the following:
     *        </p>
     *        <p>
     *        <code>Available | Backordered | Discontinued</code>
     *        </p>
     *        <p>
     *        You would first need to specify <i>ExpressionAttributeValues</i>
     *        as follows:
     *        </p>
     *        <p>
     *        <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     *        </p>
     *        <p>
     *        You could then use these values in an expression, such as this:
     *        </p>
     *        <p>
     *        <code>ProductStatus IN (:avail, :back, :disc)</code>
     *        </p>
     *        <p>
     *        For more information on expression attribute values, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *        >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer
     *        Guide</i>.
     */

    public void setExpressionAttributeValues(
            java.util.Map<String, AttributeValue> expressionAttributeValues) {
        this.expressionAttributeValues = expressionAttributeValues;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Use the <b>:</b> (colon) character in an expression to dereference an
     * attribute value. For example, suppose that you wanted to check whether
     * the value of the <i>ProductStatus</i> attribute was one of the following:
     * </p>
     * <p>
     * <code>Available | Backordered | Discontinued</code>
     * </p>
     * <p>
     * You would first need to specify <i>ExpressionAttributeValues</i> as
     * follows:
     * </p>
     * <p>
     * <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     * </p>
     * <p>
     * You could then use these values in an expression, such as this:
     * </p>
     * <p>
     * <code>ProductStatus IN (:avail, :back, :disc)</code>
     * </p>
     * <p>
     * For more information on expression attribute values, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     * >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param expressionAttributeValues
     *        One or more values that can be substituted in an expression.</p>
     *        <p>
     *        Use the <b>:</b> (colon) character in an expression to dereference
     *        an attribute value. For example, suppose that you wanted to check
     *        whether the value of the <i>ProductStatus</i> attribute was one of
     *        the following:
     *        </p>
     *        <p>
     *        <code>Available | Backordered | Discontinued</code>
     *        </p>
     *        <p>
     *        You would first need to specify <i>ExpressionAttributeValues</i>
     *        as follows:
     *        </p>
     *        <p>
     *        <code>{ ":avail":{"S":"Available"}, ":back":{"S":"Backordered"}, ":disc":{"S":"Discontinued"} }</code>
     *        </p>
     *        <p>
     *        You could then use these values in an expression, such as this:
     *        </p>
     *        <p>
     *        <code>ProductStatus IN (:avail, :back, :disc)</code>
     *        </p>
     *        <p>
     *        For more information on expression attribute values, see <a href=
     *        "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html"
     *        >Specifying Conditions</a> in the <i>Amazon DynamoDB Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public QueryRequest withExpressionAttributeValues(
            java.util.Map<String, AttributeValue> expressionAttributeValues) {
        setExpressionAttributeValues(expressionAttributeValues);
        return this;
    }

    public QueryRequest addExpressionAttributeValuesEntry(String key,
            AttributeValue value) {
        if (null == this.expressionAttributeValues) {
            this.expressionAttributeValues = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.expressionAttributeValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.expressionAttributeValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeValues. &lt;p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */

    public QueryRequest clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
    }

    /**
     * The primary hash and range keys of the first item that this operation
     * will evaluate. Use the value that was returned for
     * <i>LastEvaluatedKey</i> in the previous operation.
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or
     * Binary. No set data types are allowed.
     *
     * @param hashKey
     *        a map entry including the name and value of the primary hash key.
     * @param rangeKey
     *        a map entry including the name and value of the primary range key,
     *        or null if it is a hash-only table.
     */
    public void setExclusiveStartKey(
            java.util.Map.Entry<String, AttributeValue> hashKey,
            java.util.Map.Entry<String, AttributeValue> rangeKey)
            throws IllegalArgumentException {
        java.util.HashMap<String, AttributeValue> exclusiveStartKey = new java.util.HashMap<String, AttributeValue>();
        if (hashKey != null) {
            exclusiveStartKey.put(hashKey.getKey(), hashKey.getValue());
        } else {
            throw new IllegalArgumentException(
                    "hashKey must be non-null object.");
        }
        if (rangeKey != null) {
            exclusiveStartKey.put(rangeKey.getKey(), rangeKey.getValue());
        }
        setExclusiveStartKey(exclusiveStartKey);
    }

    /**
     * The primary hash and range keys of the first item that this operation
     * will evaluate. Use the value that was returned for
     * <i>LastEvaluatedKey</i> in the previous operation.
     * <p>
     * The data type for <i>ExclusiveStartKey</i> must be String, Number or
     * Binary. No set data types are allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hashKey
     *        a map entry including the name and value of the primary hash key.
     * @param rangeKey
     *        a map entry including the name and value of the primary range key,
     *        or null if it is a hash-only table.
     */
    public QueryRequest withExclusiveStartKey(
            java.util.Map.Entry<String, AttributeValue> hashKey,
            java.util.Map.Entry<String, AttributeValue> rangeKey)
            throws IllegalArgumentException {
        setExclusiveStartKey(hashKey, rangeKey);
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
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName() + ",");
        if (getSelect() != null)
            sb.append("Select: " + getSelect() + ",");
        if (getAttributesToGet() != null)
            sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getConsistentRead() != null)
            sb.append("ConsistentRead: " + getConsistentRead() + ",");
        if (getKeyConditions() != null)
            sb.append("KeyConditions: " + getKeyConditions() + ",");
        if (getQueryFilter() != null)
            sb.append("QueryFilter: " + getQueryFilter() + ",");
        if (getConditionalOperator() != null)
            sb.append("ConditionalOperator: " + getConditionalOperator() + ",");
        if (getScanIndexForward() != null)
            sb.append("ScanIndexForward: " + getScanIndexForward() + ",");
        if (getExclusiveStartKey() != null)
            sb.append("ExclusiveStartKey: " + getExclusiveStartKey() + ",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity()
                    + ",");
        if (getProjectionExpression() != null)
            sb.append("ProjectionExpression: " + getProjectionExpression()
                    + ",");
        if (getFilterExpression() != null)
            sb.append("FilterExpression: " + getFilterExpression() + ",");
        if (getKeyConditionExpression() != null)
            sb.append("KeyConditionExpression: " + getKeyConditionExpression()
                    + ",");
        if (getExpressionAttributeNames() != null)
            sb.append("ExpressionAttributeNames: "
                    + getExpressionAttributeNames() + ",");
        if (getExpressionAttributeValues() != null)
            sb.append("ExpressionAttributeValues: "
                    + getExpressionAttributeValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryRequest == false)
            return false;
        QueryRequest other = (QueryRequest) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null
                && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getSelect() == null ^ this.getSelect() == null)
            return false;
        if (other.getSelect() != null
                && other.getSelect().equals(this.getSelect()) == false)
            return false;
        if (other.getAttributesToGet() == null
                ^ this.getAttributesToGet() == null)
            return false;
        if (other.getAttributesToGet() != null
                && other.getAttributesToGet().equals(this.getAttributesToGet()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null
                && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getConsistentRead() == null
                ^ this.getConsistentRead() == null)
            return false;
        if (other.getConsistentRead() != null
                && other.getConsistentRead().equals(this.getConsistentRead()) == false)
            return false;
        if (other.getKeyConditions() == null ^ this.getKeyConditions() == null)
            return false;
        if (other.getKeyConditions() != null
                && other.getKeyConditions().equals(this.getKeyConditions()) == false)
            return false;
        if (other.getQueryFilter() == null ^ this.getQueryFilter() == null)
            return false;
        if (other.getQueryFilter() != null
                && other.getQueryFilter().equals(this.getQueryFilter()) == false)
            return false;
        if (other.getConditionalOperator() == null
                ^ this.getConditionalOperator() == null)
            return false;
        if (other.getConditionalOperator() != null
                && other.getConditionalOperator().equals(
                        this.getConditionalOperator()) == false)
            return false;
        if (other.getScanIndexForward() == null
                ^ this.getScanIndexForward() == null)
            return false;
        if (other.getScanIndexForward() != null
                && other.getScanIndexForward().equals(
                        this.getScanIndexForward()) == false)
            return false;
        if (other.getExclusiveStartKey() == null
                ^ this.getExclusiveStartKey() == null)
            return false;
        if (other.getExclusiveStartKey() != null
                && other.getExclusiveStartKey().equals(
                        this.getExclusiveStartKey()) == false)
            return false;
        if (other.getReturnConsumedCapacity() == null
                ^ this.getReturnConsumedCapacity() == null)
            return false;
        if (other.getReturnConsumedCapacity() != null
                && other.getReturnConsumedCapacity().equals(
                        this.getReturnConsumedCapacity()) == false)
            return false;
        if (other.getProjectionExpression() == null
                ^ this.getProjectionExpression() == null)
            return false;
        if (other.getProjectionExpression() != null
                && other.getProjectionExpression().equals(
                        this.getProjectionExpression()) == false)
            return false;
        if (other.getFilterExpression() == null
                ^ this.getFilterExpression() == null)
            return false;
        if (other.getFilterExpression() != null
                && other.getFilterExpression().equals(
                        this.getFilterExpression()) == false)
            return false;
        if (other.getKeyConditionExpression() == null
                ^ this.getKeyConditionExpression() == null)
            return false;
        if (other.getKeyConditionExpression() != null
                && other.getKeyConditionExpression().equals(
                        this.getKeyConditionExpression()) == false)
            return false;
        if (other.getExpressionAttributeNames() == null
                ^ this.getExpressionAttributeNames() == null)
            return false;
        if (other.getExpressionAttributeNames() != null
                && other.getExpressionAttributeNames().equals(
                        this.getExpressionAttributeNames()) == false)
            return false;
        if (other.getExpressionAttributeValues() == null
                ^ this.getExpressionAttributeValues() == null)
            return false;
        if (other.getExpressionAttributeValues() != null
                && other.getExpressionAttributeValues().equals(
                        this.getExpressionAttributeValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode
                + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode
                + ((getSelect() == null) ? 0 : getSelect().hashCode());
        hashCode = prime
                * hashCode
                + ((getAttributesToGet() == null) ? 0 : getAttributesToGet()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime
                * hashCode
                + ((getConsistentRead() == null) ? 0 : getConsistentRead()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getKeyConditions() == null) ? 0 : getKeyConditions()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getQueryFilter() == null) ? 0 : getQueryFilter().hashCode());
        hashCode = prime
                * hashCode
                + ((getConditionalOperator() == null) ? 0
                        : getConditionalOperator().hashCode());
        hashCode = prime
                * hashCode
                + ((getScanIndexForward() == null) ? 0 : getScanIndexForward()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getExclusiveStartKey() == null) ? 0
                        : getExclusiveStartKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getReturnConsumedCapacity() == null) ? 0
                        : getReturnConsumedCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getProjectionExpression() == null) ? 0
                        : getProjectionExpression().hashCode());
        hashCode = prime
                * hashCode
                + ((getFilterExpression() == null) ? 0 : getFilterExpression()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getKeyConditionExpression() == null) ? 0
                        : getKeyConditionExpression().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpressionAttributeNames() == null) ? 0
                        : getExpressionAttributeNames().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpressionAttributeValues() == null) ? 0
                        : getExpressionAttributeValues().hashCode());
        return hashCode;
    }

    @Override
    public QueryRequest clone() {
        return (QueryRequest) super.clone();
    }
}