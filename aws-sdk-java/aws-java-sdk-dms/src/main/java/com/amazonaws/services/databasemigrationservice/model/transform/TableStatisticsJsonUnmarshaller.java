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

package com.amazonaws.services.databasemigrationservice.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TableStatistics JSON Unmarshaller
 */
public class TableStatisticsJsonUnmarshaller implements
        Unmarshaller<TableStatistics, JsonUnmarshallerContext> {

    public TableStatistics unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        TableStatistics tableStatistics = new TableStatistics();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("SchemaName", targetDepth)) {
                    context.nextToken();
                    tableStatistics.setSchemaName(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("TableName", targetDepth)) {
                    context.nextToken();
                    tableStatistics.setTableName(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("Inserts", targetDepth)) {
                    context.nextToken();
                    tableStatistics.setInserts(context.getUnmarshaller(
                            Long.class).unmarshall(context));
                }
                if (context.testExpression("Deletes", targetDepth)) {
                    context.nextToken();
                    tableStatistics.setDeletes(context.getUnmarshaller(
                            Long.class).unmarshall(context));
                }
                if (context.testExpression("Updates", targetDepth)) {
                    context.nextToken();
                    tableStatistics.setUpdates(context.getUnmarshaller(
                            Long.class).unmarshall(context));
                }
                if (context.testExpression("Ddls", targetDepth)) {
                    context.nextToken();
                    tableStatistics.setDdls(context.getUnmarshaller(Long.class)
                            .unmarshall(context));
                }
                if (context.testExpression("FullLoadRows", targetDepth)) {
                    context.nextToken();
                    tableStatistics.setFullLoadRows(context.getUnmarshaller(
                            Long.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdateTime", targetDepth)) {
                    context.nextToken();
                    tableStatistics.setLastUpdateTime(context.getUnmarshaller(
                            java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("TableState", targetDepth)) {
                    context.nextToken();
                    tableStatistics.setTableState(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tableStatistics;
    }

    private static TableStatisticsJsonUnmarshaller instance;

    public static TableStatisticsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableStatisticsJsonUnmarshaller();
        return instance;
    }
}
