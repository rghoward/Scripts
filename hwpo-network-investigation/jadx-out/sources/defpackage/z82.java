package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z82 implements Callable<r9a<Void>> {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ xk9 d;
    public final /* synthetic */ d92 e;

    public z82(d92 d92Var, long j, Throwable th, Thread thread, xk9 xk9Var) {
        this.e = d92Var;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = xk9Var;
    }

    @Override // java.util.concurrent.Callable
    public final r9a<Void> call() throws Throwable {
        long j = this.a;
        long j2 = j / 1000;
        d92 d92Var = this.e;
        String strE = d92Var.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return caa.e(null);
        }
        d92Var.c.a();
        hh9 hh9Var = d92Var.m;
        hh9Var.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        hh9Var.f(this.b, this.c, "crash", new wm3(strE, j2, if3.t), true);
        try {
            ey3 ey3Var = d92Var.g;
            String str = ".ae" + j;
            ey3Var.getClass();
            if (!new File(ey3Var.c, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        xk9 xk9Var = this.d;
        d92Var.b(false, xk9Var, false);
        d92Var.c(new k01().a, Boolean.FALSE);
        return !d92Var.b.a() ? caa.e(null) : xk9Var.i.get().a.o(d92Var.e.a, new x51(this, strE));
    }
}
