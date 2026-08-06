package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kr5 {
    public static final pl9 a = pl9.u;
    public static final gi1 b = gi1.B;
    public static final float c = 4.0f;
    public static final float d = 32.0f;
    public static final float e = 1.0f;
    public static final Object f = new Object();
    public static Thread g;
    public static volatile Handler h;

    public static final ox6 a(ox6 ox6Var, ei4 ei4Var) {
        return ox6Var.H(new uq5(ei4Var));
    }

    public static boolean b(Thread thread) {
        if (g == null) {
            g = Looper.getMainLooper().getThread();
        }
        return thread == g;
    }

    public static Handler c() {
        if (h == null) {
            synchronized (f) {
                try {
                    if (h == null) {
                        h = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }
}
