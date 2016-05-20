/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudsearchv2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Index Field StAX Unmarshaller
 */
public class IndexFieldStaxUnmarshaller implements Unmarshaller<IndexField, StaxUnmarshallerContext> {

    public IndexField unmarshall(StaxUnmarshallerContext context) throws Exception {
        IndexField indexField = new IndexField();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return indexField;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("IndexFieldName", targetDepth)) {
                    indexField.setIndexFieldName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IndexFieldType", targetDepth)) {
                    indexField.setIndexFieldType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IntOptions", targetDepth)) {
                    indexField.setIntOptions(IntOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DoubleOptions", targetDepth)) {
                    indexField.setDoubleOptions(DoubleOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LiteralOptions", targetDepth)) {
                    indexField.setLiteralOptions(LiteralOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TextOptions", targetDepth)) {
                    indexField.setTextOptions(TextOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DateOptions", targetDepth)) {
                    indexField.setDateOptions(DateOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LatLonOptions", targetDepth)) {
                    indexField.setLatLonOptions(LatLonOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IntArrayOptions", targetDepth)) {
                    indexField.setIntArrayOptions(IntArrayOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DoubleArrayOptions", targetDepth)) {
                    indexField.setDoubleArrayOptions(DoubleArrayOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LiteralArrayOptions", targetDepth)) {
                    indexField.setLiteralArrayOptions(LiteralArrayOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TextArrayOptions", targetDepth)) {
                    indexField.setTextArrayOptions(TextArrayOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DateArrayOptions", targetDepth)) {
                    indexField.setDateArrayOptions(DateArrayOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return indexField;
                }
            }
        }
    }

    private static IndexFieldStaxUnmarshaller instance;
    public static IndexFieldStaxUnmarshaller getInstance() {
        if (instance == null) instance = new IndexFieldStaxUnmarshaller();
        return instance;
    }
}
    