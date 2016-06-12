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
package com.amazonaws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Test;

import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.QueryStringSigner;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

public class AmazonWebServiceClientTest {

    @Test
    public void emptyClient() {
        AmazonWebServiceClient client =
            new AmazonWebServiceClient(new ClientConfiguration()) { };

        try {
            client.getServiceName();
        } catch (IllegalStateException exception) {
        }
    }

    @Test
    public void testDefaultSigner() {
        AmazonTestClient client = new AmazonTestClient();

        Assert.assertEquals("test", client.getServiceName());
        Assert.assertTrue(client.getSigner() instanceof AWS4Signer);
    }

    @Test
    public void testOverrideSigner() {
        ClientConfiguration config = new ClientConfiguration();
        config.setSignerOverride("QueryStringSignerType");

        AmazonTestClient client = new AmazonTestClient(config);

        Assert.assertTrue(client.getSigner() instanceof QueryStringSigner);
    }

    @Test
    public void setServiceNameIntern() {
        AmazonTestClient client = new AmazonTestClient();
        assertEquals(client.getServiceName(), client.getServiceNameIntern());
        String serviceNameOverride = "foo";
        assertFalse(serviceNameOverride.equals(client.getServiceName()));
        client.setServiceNameIntern(serviceNameOverride);
        assertEquals(serviceNameOverride, client.getServiceName());
    }

    @Test
    public void setEndpointPrefix() {
        AmazonTestClient client = new AmazonTestClient();
        Assert.assertEquals(client.getServiceName(), client.getEndpointPrefix());
        String endpointPrefixOverride = "foo";
        Assert.assertNotEquals(endpointPrefixOverride, client.getServiceName());
        client.setEndpointPrefix(endpointPrefixOverride);
        Assert.assertEquals(endpointPrefixOverride, client.getEndpointPrefix());
        Assert.assertNotEquals(client.getEndpointPrefix(), client.getServiceName());
    }

    private static class AmazonTestClient extends AmazonWebServiceClient {
        public AmazonTestClient() {
            this(new ClientConfiguration());
        }

        public AmazonTestClient(final ClientConfiguration config) {
            super(config);
            super.setEndpoint("test.us-west-2.amazonaws.com");
        }
    }
}
