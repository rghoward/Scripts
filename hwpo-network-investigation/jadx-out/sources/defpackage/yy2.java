package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yy2 {
    public static final dp c = dp.d();
    public static yy2 d;
    public volatile SharedPreferences a;
    public final ExecutorService b;

    public yy2(ExecutorService executorService) {
        this.b = executorService;
    }

    public static Context a() {
        try {
            e04.c();
            e04 e04VarC = e04.c();
            e04VarC.a();
            return e04VarC.a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized yy2 b() {
        try {
            if (d == null) {
                d = new yy2(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public final synchronized void c(final Context context) {
        if (this.a == null && context != null) {
            this.b.execute(new Runnable() { // from class: xy2
                @Override // java.lang.Runnable
                public final void run() {
                    yy2 yy2Var = this.t;
                    Context context2 = context;
                    if (yy2Var.a != null || context2 == null) {
                        return;
                    }
                    yy2Var.a = context2.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                }
            });
        }
    }

    public final void d(long j, String str) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, j).apply();
    }

    public final void e(String str, double d2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
    }

    public final void f(String str, String str2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        SharedPreferences sharedPreferences = this.a;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putBoolean(str, z).apply();
    }
}
