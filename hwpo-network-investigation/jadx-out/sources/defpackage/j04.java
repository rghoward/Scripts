package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j04 {
    public final l92 a;

    public j04(l92 l92Var) {
        this.a = l92Var;
    }

    public static j04 a() {
        j04 j04Var = (j04) e04.c().b(j04.class);
        if (j04Var != null) {
            return j04Var;
        }
        ac4.c("FirebaseCrashlytics component is not present.");
        return null;
    }

    public final void b(final Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        Map map = Collections.EMPTY_MAP;
        final l92 l92Var = this.a;
        l92Var.o.a.a(new Runnable() { // from class: f92
            public final /* synthetic */ Map v = Collections.EMPTY_MAP;

            @Override // java.lang.Runnable
            public final void run() {
                Map map2 = Collections.EMPTY_MAP;
                d92 d92Var = l92Var.g;
                Thread threadCurrentThread = Thread.currentThread();
                d92Var.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                la2 la2Var = d92Var.n;
                if (la2Var == null || !la2Var.e.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strE = d92Var.e();
                    if (strE == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    wm3 wm3Var = new wm3(strE, j, map2);
                    hh9 hh9Var = d92Var.m;
                    hh9Var.getClass();
                    String strConcat = "Persisting non-fatal event for session ".concat(strE);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    hh9Var.f(th, threadCurrentThread, "error", wm3Var, false);
                }
            }
        });
    }
}
