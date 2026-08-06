package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l92 {
    public final Context a;
    public final se2 b;
    public final jh7 c;
    public final long d;
    public m92 e;
    public m92 f;
    public d92 g;
    public final z65 h;
    public final ey3 i;
    public final ui j;
    public final vi k;
    public final v82 l;
    public final q92 m;
    public final um8 n;
    public final sa2 o;

    public l92(e04 e04Var, z65 z65Var, q92 q92Var, se2 se2Var, ui uiVar, vi viVar, ey3 ey3Var, v82 v82Var, um8 um8Var, sa2 sa2Var) {
        this.b = se2Var;
        e04Var.a();
        this.a = e04Var.a;
        this.h = z65Var;
        this.m = q92Var;
        this.j = uiVar;
        this.k = viVar;
        this.i = ey3Var;
        this.l = v82Var;
        this.n = um8Var;
        this.o = sa2Var;
        this.d = System.currentTimeMillis();
        this.c = new jh7();
    }

    public final void a(xk9 xk9Var) {
        sa2.a();
        sa2.a();
        this.e.a();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.a(new tv0() { // from class: k92
                    @Override // defpackage.tv0
                    public final void a(String str) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        l92 l92Var = this.a;
                        l92Var.o.a.b(new h92(l92Var, jCurrentTimeMillis - l92Var.d, str));
                    }
                });
                this.g.g();
                if (!xk9Var.b().b.a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.d(xk9Var)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.g.h(xk9Var.i.get().a);
                c();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(final xk9 xk9Var) {
        Future<?> futureSubmit = this.o.a.t.submit(new Runnable() { // from class: i92
            @Override // java.lang.Runnable
            public final void run() {
                this.t.a(xk9Var);
            }
        });
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void c() {
        sa2.a();
        try {
            m92 m92Var = this.e;
            ey3 ey3Var = (ey3) m92Var.b;
            String str = (String) m92Var.a;
            ey3Var.getClass();
            if (new File(ey3Var.c, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}
