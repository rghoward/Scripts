package io.intercom.android.sdk.api;

import defpackage.o03;
import defpackage.qu8;
import defpackage.vg5;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
class RetryInterceptor implements vg5 {
    private static final int MAX_RETRIES = 3;
    private final Sleeper sleeper;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Sleeper {
        public void sleep(int i) {
            try {
                TimeUnit.SECONDS.sleep(i);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public RetryInterceptor(Sleeper sleeper) {
        this.sleeper = sleeper;
    }

    public static int getRetryTimer(int i) {
        return (int) Math.pow(2.0d, i);
    }

    @Override // defpackage.vg5
    public qu8 intercept(vg5.a aVar) throws IOException {
        int i = 0;
        while (i <= 3) {
            try {
                return aVar.a(aVar.request());
            } catch (IOException e) {
                if (i == 3) {
                    throw e;
                }
                i++;
                this.sleeper.sleep(getRetryTimer(i));
            }
        }
        o03.a("request failed due to network errors");
        return null;
    }
}
