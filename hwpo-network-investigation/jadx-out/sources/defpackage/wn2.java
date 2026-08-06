package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wn2 {
    public static final v72 a = v72.t;

    public static final void a(d27 d27Var, int i) {
        if (d27Var.b == 0 || !(d27Var.a(0) == i || d27Var.a(d27Var.b - 1) == i)) {
            int i2 = d27Var.b;
            d27Var.c(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iA = d27Var.a(i3);
                if (i <= iA) {
                    break;
                }
                d27Var.g(i2, iA);
                i2 = i3;
            }
            d27Var.g(i2, i);
        }
    }

    public static final int b(d27 d27Var) {
        int iA;
        int i = d27Var.b;
        int iA2 = d27Var.a(0);
        while (d27Var.b != 0 && d27Var.a(0) == iA2) {
            d27Var.g(0, d27Var.b());
            d27Var.f(d27Var.b - 1);
            int i2 = d27Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iA3 = d27Var.a(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iA4 = d27Var.a(i6);
                if (i5 < i2 && (iA = d27Var.a(i5)) > iA4) {
                    if (iA <= iA3) {
                        break;
                    }
                    d27Var.g(i4, iA);
                    d27Var.g(i5, iA3);
                    i4 = i5;
                } else {
                    if (iA4 <= iA3) {
                        break;
                    }
                    d27Var.g(i4, iA4);
                    d27Var.g(i6, iA3);
                    i4 = i6;
                }
            }
        }
        return iA2;
    }
}
