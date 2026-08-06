package io.ably.lib.types;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Stats {
    private static String[] intervalFormatString = {"yyyy-MM-dd:hh:mm", "yyyy-MM-dd:hh", "yyyy-MM-dd", "yyyy-MM"};
    public MessageTypes all;
    public RequestCount apiRequests;
    public ResourceCount channels;
    public ConnectionTypes connections;
    public int count;
    public String inProgress;
    public MessageTraffic inbound;
    public String intervalId;
    public MessageTraffic outbound;
    public MessageTypes persisted;
    public ProcessedMessages processed;
    public PushedMessages push;
    public RequestCount tokenRequests;
    public String unit;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ConnectionTypes {
        public ResourceCount all;
        public ResourceCount plain;
        public ResourceCount tls;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum Granularity {
        minute,
        hour,
        day,
        month
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class MessageCategory extends MessageCount {
        public Map<String, MessageCount> category;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class MessageCount {
        public double count;
        public double data;
        public double uncompressedData;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class MessageTraffic {
        public MessageTypes all;
        public MessageTypes realtime;
        public MessageTypes rest;
        public MessageTypes webhook;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class MessageTypes {
        public MessageCategory all;
        public MessageCategory messages;
        public MessageCategory presence;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ProcessedCount {
        public double failed;
        public double skipped;
        public double succeeded;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ProcessedMessages {
        public Map<String, ProcessedCount> delta;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class PushedMessages {
        public int directPublishes;
        public int messages;
        public Map<String, Integer> notifications;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class RequestCount {
        public double failed;
        public double refused;
        public double succeeded;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ResourceCount {
        public double mean;
        public double min;
        public double opened;
        public double peak;
        public double refused;
    }

    public static long fromIntervalId(String str) {
        try {
            return new SimpleDateFormat(intervalFormatString[0].substring(0, str.length())).parse(str).getTime();
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static String toIntervalId(long j, Granularity granularity) {
        return new SimpleDateFormat(intervalFormatString[granularity.ordinal()]).format(new Date(j));
    }
}
