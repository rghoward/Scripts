package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xl7 implements jac {
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ int u = 0;
    public static final /* synthetic */ xl7 v = new xl7();

    public static String b(int i, int i2, String str) {
        if (i < 0) {
            return p2a.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return p2a.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        z90.a(pp2.a(i2, "negative size: "));
        return null;
    }

    public static void c(int i, int i2, String str, boolean z) {
        if (z) {
            return;
        }
        z90.a(p2a.a(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void d(int i, String str, boolean z) {
        if (z) {
            return;
        }
        z90.a(p2a.a(str, Integer.valueOf(i)));
    }

    public static void e(long j, String str, boolean z) {
        if (z) {
            return;
        }
        z90.a(p2a.a(str, Long.valueOf(j)));
    }

    public static void f(String str, boolean z) {
        if (z) {
            return;
        }
        z90.a(str);
    }

    public static void g(boolean z) {
        if (z) {
            return;
        }
        zn3.b();
    }

    public static void h(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        z90.a(p2a.a(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void i(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        z90.a(p2a.a(str, obj));
    }

    public static void j(boolean z, String str, Object obj, Comparable comparable) {
        if (z) {
            return;
        }
        z90.a(p2a.a(str, obj, comparable));
    }

    public static void k(int i, int i2) {
        String strA;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strA = p2a.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    z90.a(pp2.a(i2, "negative size: "));
                    return;
                }
                strA = p2a.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void l(vp6 vp6Var) {
        vp6Var.getClass();
    }

    public static void m(ListenableFuture listenableFuture, String str, Object obj) {
        if (listenableFuture != null) {
            return;
        }
        ac4.c(p2a.a(str, obj));
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ac4.c(str);
    }

    public static void o(int i, int i2) {
        if (i < 0 || i > i2) {
            r.b(b(i, i2, "index"));
        }
    }

    public static void p(int i, int i2, int i3) {
        String strB;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strB = b(i, i3, "start index");
            } else {
                strB = (i2 < 0 || i2 > i3) ? b(i2, i3, "end index") : p2a.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void q(String str, boolean z) {
        if (z) {
            return;
        }
        aa0.c(str);
    }

    public static void r(boolean z) {
        if (z) {
            return;
        }
        d43.c();
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().g0());
    }
}
