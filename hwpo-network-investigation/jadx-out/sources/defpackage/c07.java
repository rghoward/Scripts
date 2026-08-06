package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c07 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public int a;
        public long b;
        public int c;
    }

    public static int a(ot7 ot7Var, int i, int i2, int i3) {
        xl7.g(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        xf5.a(xf5.a(i4, i5), 1 << i3);
        if (ot7Var.b() < i) {
            return -1;
        }
        int iG = ot7Var.g(i);
        if (iG == i4) {
            if (ot7Var.b() < i2) {
                return -1;
            }
            int iG2 = ot7Var.g(i2);
            iG += iG2;
            if (iG2 == i5) {
                if (ot7Var.b() < i3) {
                    return -1;
                }
                return ot7Var.g(i3) + iG;
            }
        }
        return iG;
    }

    public static void b(ot7 ot7Var) {
        ot7Var.o(3);
        ot7Var.o(8);
        boolean zF = ot7Var.f();
        boolean zF2 = ot7Var.f();
        if (zF) {
            ot7Var.o(5);
        }
        if (zF2) {
            ot7Var.o(6);
        }
    }

    public static void c(ot7 ot7Var) {
        int iG;
        int iG2 = ot7Var.g(2);
        if (iG2 == 0) {
            ot7Var.o(6);
            return;
        }
        int iA = a(ot7Var, 5, 8, 16) + 1;
        if (iG2 == 1) {
            ot7Var.o(iA * 7);
            return;
        }
        if (iG2 == 2) {
            boolean zF = ot7Var.f();
            int i = zF ? 1 : 5;
            int i2 = zF ? 7 : 5;
            int i3 = zF ? 8 : 6;
            int i4 = 0;
            while (i4 < iA) {
                if (ot7Var.f()) {
                    ot7Var.o(7);
                    iG = 0;
                } else {
                    if (ot7Var.g(2) == 3 && ot7Var.g(i2) * i != 0) {
                        ot7Var.n();
                    }
                    iG = ot7Var.g(i3) * i;
                    if (iG != 0 && iG != 180) {
                        ot7Var.n();
                    }
                    ot7Var.n();
                }
                if (iG != 0 && iG != 180 && ot7Var.f()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
