package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kx1 {
    public static final e27<jx1> a;

    static {
        lw8 lw8Var = si1.e;
        int i = lw8Var.c;
        ix1 ix1Var = new ix1(lw8Var, lw8Var, 1);
        int i2 = lw8Var.c;
        og7 og7Var = si1.x;
        int i3 = (og7Var.c << 6) | i2;
        jx1 jx1Var = new jx1(lw8Var, og7Var, 0);
        int i4 = (i2 << 6) | og7Var.c;
        jx1 jx1Var2 = new jx1(og7Var, lw8Var, 0);
        e27 e27Var = ag5.a;
        e27<jx1> e27Var2 = new e27<>();
        e27Var2.i(i | (i << 6), ix1Var);
        e27Var2.i(i3, jx1Var);
        e27Var2.i(i4, jx1Var2);
        a = e27Var2;
    }
}
