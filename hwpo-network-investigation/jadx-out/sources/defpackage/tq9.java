package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tq9 {
    public static final ty9<uh1> a = xv.b(0.0f, 0.0f, null, 7);

    public static final yz9 a(long j, a04 a04Var, String str, jt1 jt1Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            a04Var = a;
        }
        a04 a04Var2 = a04Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zJ = jt1Var.J(uh1.f(j));
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            dza dzaVar = new dza(wi1.u, new xi1(uh1.f(j)));
            jt1Var.C(dzaVar);
            objF = dzaVar;
        }
        return xt.c(new uh1(j), (cza) objF, a04Var2, null, str2, jt1Var, (i << 6) & 57344, 8);
    }
}
