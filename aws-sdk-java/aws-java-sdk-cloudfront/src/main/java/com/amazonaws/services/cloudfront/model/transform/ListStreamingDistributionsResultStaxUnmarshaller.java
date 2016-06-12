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

package com.amazonaws.services.cloudfront.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ListStreamingDistributionsResult StAX Unmarshaller
 */
public class ListStreamingDistributionsResultStaxUnmarshaller implements
        Unmarshaller<ListStreamingDistributionsResult, StaxUnmarshallerContext> {

    public ListStreamingDistributionsResult unmarshall(
            StaxUnmarshallerContext context) throws Exception {
        ListStreamingDistributionsResult listStreamingDistributionsResult = new ListStreamingDistributionsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listStreamingDistributionsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("StreamingDistributionList",
                        targetDepth)) {
                    listStreamingDistributionsResult
                            .setStreamingDistributionList(StreamingDistributionListStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listStreamingDistributionsResult;
                }
            }
        }
    }

    private static ListStreamingDistributionsResultStaxUnmarshaller instance;

    public static ListStreamingDistributionsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListStreamingDistributionsResultStaxUnmarshaller();
        return instance;
    }
}