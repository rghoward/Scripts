package defpackage;

import android.util.Log;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sa2 {
    public static final a d = new a();
    public final oa2 a;
    public final oa2 b;
    public final oa2 c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static String a() {
            return Thread.currentThread().getName();
        }
    }

    public sa2(ExecutorService executorService, ExecutorService executorService2) {
        executorService.getClass();
        executorService2.getClass();
        this.a = new oa2(executorService);
        this.b = new oa2(executorService);
        caa.e(null);
        this.c = new oa2(executorService2);
    }

    public static final void a() {
        a aVar = d;
        aVar.getClass();
        if (((Boolean) new pa2(0, aVar, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + a.a() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        a aVar = d;
        aVar.getClass();
        if (((Boolean) new qa2(0, aVar, a.class, "isBlockingThread", "isBlockingThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + a.a() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
