package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class da1 {
    public static zx0 a(int i, int i2, xx0 xx0Var) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i2 & 2;
        xx0 xx0Var2 = xx0.t;
        if (i3 != 0) {
            xx0Var = xx0Var2;
        }
        if (i == -2) {
            if (xx0Var != xx0Var2) {
                return new qw1(1, xx0Var);
            }
            p91.b.getClass();
            return new zx0(p91.a.b);
        }
        if (i == -1) {
            if (xx0Var == xx0Var2) {
                return new qw1(1, xx0.u);
            }
            z90.a("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return xx0Var == xx0Var2 ? new zx0(0) : new qw1(1, xx0Var);
        }
        if (i != Integer.MAX_VALUE) {
            return xx0Var == xx0Var2 ? new zx0(i) : new qw1(i, xx0Var);
        }
        return new zx0(Integer.MAX_VALUE);
    }
}
