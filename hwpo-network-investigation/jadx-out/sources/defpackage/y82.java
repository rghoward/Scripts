package defpackage;

import android.util.Log;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y82 {
    public final /* synthetic */ d92 a;

    public y82(d92 d92Var) {
        this.a = d92Var;
    }

    public final void a(xk9 xk9Var, Thread thread, Throwable th) {
        d92 d92Var = this.a;
        synchronized (d92Var) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                if (vx.t == null) {
                    nm9 nm9VarB = ((o24) e04.c().b(o24.class)).b();
                    nm9VarB.getClass();
                    vx.t = nm9VarB;
                }
                nm9 nm9Var = vx.t;
                if (nm9Var == null) {
                    xj5.e("sharedSessionRepository");
                    throw null;
                }
                if (nm9Var.a()) {
                    nm9 nm9Var2 = vx.t;
                    if (nm9Var2 == null) {
                        xj5.e("sharedSessionRepository");
                        throw null;
                    }
                    nm9Var2.b();
                }
                try {
                    p6b.a(d92Var.e.a.b(new z82(d92Var, System.currentTimeMillis(), th, thread, xk9Var)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                }
            } catch (Exception unused2) {
            }
        }
    }
}
