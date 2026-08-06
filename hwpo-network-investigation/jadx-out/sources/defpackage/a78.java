package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a78 {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        z90.a(str);
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        zn3.b();
    }

    public static void c(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            ux1.b(sb, "Must be called on ", name2, " thread, but got ", name);
            ru3.e(sb, ".");
        }
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            z90.a("Given String is empty or null");
        }
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            z90.a(str2);
        }
    }

    public static void f(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        aa0.c(str);
    }

    public static void g(Object obj) {
        if (obj != null) {
            return;
        }
        ac4.c("null reference");
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ac4.c(str);
    }

    public static void i(String str, boolean z) {
        if (z) {
            return;
        }
        aa0.c(str);
    }
}
