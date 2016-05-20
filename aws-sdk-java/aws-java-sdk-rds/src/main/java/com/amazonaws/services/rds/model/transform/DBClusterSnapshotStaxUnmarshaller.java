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

package com.amazonaws.services.rds.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * D B Cluster Snapshot StAX Unmarshaller
 */
public class DBClusterSnapshotStaxUnmarshaller implements Unmarshaller<DBClusterSnapshot, StaxUnmarshallerContext> {

    public DBClusterSnapshot unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBClusterSnapshot dBClusterSnapshot = new DBClusterSnapshot();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) targetDepth += 2;

        if (context.isStartOfDocument()) targetDepth++;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return dBClusterSnapshot;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("AvailabilityZones/AvailabilityZone", targetDepth)) {
                    dBClusterSnapshot.getAvailabilityZones().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBClusterSnapshotIdentifier", targetDepth)) {
                    dBClusterSnapshot.setDBClusterSnapshotIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBClusterIdentifier", targetDepth)) {
                    dBClusterSnapshot.setDBClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SnapshotCreateTime", targetDepth)) {
                    dBClusterSnapshot.setSnapshotCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Engine", targetDepth)) {
                    dBClusterSnapshot.setEngine(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    dBClusterSnapshot.setAllocatedStorage(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    dBClusterSnapshot.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Port", targetDepth)) {
                    dBClusterSnapshot.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    dBClusterSnapshot.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterCreateTime", targetDepth)) {
                    dBClusterSnapshot.setClusterCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    dBClusterSnapshot.setMasterUsername(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    dBClusterSnapshot.setEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LicenseModel", targetDepth)) {
                    dBClusterSnapshot.setLicenseModel(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SnapshotType", targetDepth)) {
                    dBClusterSnapshot.setSnapshotType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PercentProgress", targetDepth)) {
                    dBClusterSnapshot.setPercentProgress(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("StorageEncrypted", targetDepth)) {
                    dBClusterSnapshot.setStorageEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    dBClusterSnapshot.setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBClusterSnapshot;
                }
            }
        }
    }

    private static DBClusterSnapshotStaxUnmarshaller instance;
    public static DBClusterSnapshotStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DBClusterSnapshotStaxUnmarshaller();
        return instance;
    }
}
    