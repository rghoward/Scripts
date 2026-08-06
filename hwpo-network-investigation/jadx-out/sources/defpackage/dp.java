package defpackage;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dp {
    public static volatile dp c;
    public final wd6 a;
    public boolean b = false;

    public dp() {
        wd6 wd6Var;
        synchronized (wd6.class) {
            try {
                if (wd6.a == null) {
                    wd6.a = new wd6();
                }
                wd6Var = wd6.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = wd6Var;
    }

    public static dp d() {
        if (c == null) {
            synchronized (dp.class) {
                try {
                    if (c == null) {
                        c = new dp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final void a(String str) {
        if (this.b) {
            this.a.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.d("FirebasePerformance", str2);
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.e("FirebasePerformance", str2);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.i("FirebasePerformance", str2);
        }
    }

    public final void f(String str) {
        if (this.b) {
            this.a.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.a.getClass();
            Log.w("FirebasePerformance", str2);
        }
    }
}
