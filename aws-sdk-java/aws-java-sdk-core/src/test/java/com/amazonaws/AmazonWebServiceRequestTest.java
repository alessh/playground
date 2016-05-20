package com.amazonaws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.amazonaws.RequestClientOptions.Marker;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.event.SyncProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;

public class AmazonWebServiceRequestTest {

    @Test
    public void testClone() {
        AmazonWebServiceRequest root = new AmazonWebServiceRequest() {};
        assertNull(root.getCloneSource());
        assertNull(root.getCloneRoot());

        AmazonWebServiceRequest clone = root.clone();
        assertEquals(root, clone.getCloneSource());
        assertEquals(root, clone.getCloneRoot());

        AmazonWebServiceRequest clone2 = clone.clone();
        assertEquals(clone, clone2.getCloneSource());
        assertEquals(root, clone2.getCloneRoot());
    }

    @Test
    public void copyBaseTo() {
        final ProgressListener listener = new SyncProgressListener() {
            @Override
            public void progressChanged(ProgressEvent progressEvent) {
            }
        };
        final AWSCredentials credentials = new BasicAWSCredentials("accesskey",
                "accessid");
        final RequestMetricCollector collector = new RequestMetricCollector() {
            @Override
            public void collectMetrics(Request<?> request, Response<?> response) {
            }
        };

        final AmazonWebServiceRequest from = new AmazonWebServiceRequest() {
        };
        from.setGeneralProgressListener(listener);
        from.setRequestCredentials(credentials);
        from.setRequestMetricCollector(collector);
        from.putCustomRequestHeader("k1", "v1");
        from.putCustomRequestHeader("k2", "v2");
        from.putCustomQueryParameter("k1", "v1");
        from.putCustomQueryParameter("k2", "v2a");
        from.putCustomQueryParameter("k2", "v2b");
        from.getRequestClientOptions().setReadLimit(1234);

        final AmazonWebServiceRequest to = new AmazonWebServiceRequest() {
        };

        // Before copy
        RequestClientOptions toOptions;
        verifyBaseBeforeCopy(to);

        // After copy
        from.copyBaseTo(to);
        verifyBaseAfterCopy(listener, credentials, collector, from, to);
    }

    public static void verifyBaseBeforeCopy(final AmazonWebServiceRequest to) {
        assertNull(to.getCustomRequestHeaders());
        assertNull(to.getCustomQueryParameters());
        assertSame(ProgressListener.NOOP, to.getGeneralProgressListener());
        assertNull(to.getRequestCredentials());
        assertNull(to.getRequestMetricCollector());

        assertTrue(RequestClientOptions.DEFAULT_STREAM_BUFFER_SIZE == to
                .getReadLimit());
        RequestClientOptions toOptions = to.getRequestClientOptions();
        assertNull(toOptions.getClientMarker(Marker.USER_AGENT));
        assertTrue(RequestClientOptions.DEFAULT_STREAM_BUFFER_SIZE == toOptions
                .getReadLimit());
    }

    private static void verifyBaseAfterCopy(final ProgressListener listener,
            final AWSCredentials credentials,
            final RequestMetricCollector collector,
            final AmazonWebServiceRequest from, final AmazonWebServiceRequest to) {
        RequestClientOptions toOptions;
        Map<String, String> headers = to.getCustomRequestHeaders();
        assertTrue(2 == headers.size());
        assertEquals("v1", headers.get("k1"));
        assertEquals("v2", headers.get("k2"));
        Map<String, List<String>> parmas = to.getCustomQueryParameters();
        assertTrue(2 == parmas.size());
        assertEquals(Arrays.asList("v1"), parmas.get("k1"));
        assertEquals(Arrays.asList("v2a", "v2b"), parmas.get("k2"));
        assertSame(listener, to.getGeneralProgressListener());
        assertSame(credentials, to.getRequestCredentials());
        assertSame(collector, to.getRequestMetricCollector());

        assertTrue(1234 == to.getReadLimit());
        toOptions = to.getRequestClientOptions();
        assertEquals(
                from.getRequestClientOptions().getClientMarker(
                        Marker.USER_AGENT),
                toOptions.getClientMarker(Marker.USER_AGENT));
        assertTrue(1234 == toOptions.getReadLimit());
    }
}
