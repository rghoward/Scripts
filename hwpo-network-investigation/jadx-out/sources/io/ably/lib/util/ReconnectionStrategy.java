package io.ably.lib.util;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ReconnectionStrategy {
    private static float getBackoffCoefficient(int i) {
        return Math.min((i + 2) / 3.0f, 2.0f);
    }

    private static double getJitterCoefficient() {
        return 1.0d - (Math.random() * 0.2d);
    }

    public static int getRetryTime(long j, int i) {
        return Double.valueOf(j * getJitterCoefficient() * ((double) getBackoffCoefficient(i))).intValue();
    }
}
