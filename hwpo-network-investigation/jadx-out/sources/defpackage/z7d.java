package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z7d {
    public static final rla a;

    static {
        rla y7dVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            y7dVar = new x7d();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            y7dVar = new y7d();
        }
        a = y7dVar;
    }
}
