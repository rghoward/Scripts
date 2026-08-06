package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gl7 {
    public static final /* synthetic */ int a = 0;

    public static final boolean a(int i, KeyEvent keyEvent) {
        return ((int) (db7.a(keyEvent) >> 32)) == i;
    }

    public static long b(long j, ds5 ds5Var) {
        ds5 ds5Var2 = ds5.t;
        return zx1.a(ds5Var == ds5Var2 ? xx1.j(j) : xx1.i(j), ds5Var == ds5Var2 ? xx1.h(j) : xx1.g(j), ds5Var == ds5Var2 ? xx1.i(j) : xx1.j(j), ds5Var == ds5Var2 ? xx1.g(j) : xx1.h(j));
    }

    public static long c(int i, long j) {
        return zx1.a(0, xx1.h(j), (i & 4) != 0 ? xx1.i(j) : 0, xx1.g(j));
    }

    public static final long d(long j, ds5 ds5Var) {
        return ds5Var == ds5.t ? zx1.a(xx1.j(j), xx1.h(j), xx1.i(j), xx1.g(j)) : zx1.a(xx1.i(j), xx1.g(j), xx1.j(j), xx1.h(j));
    }
}
