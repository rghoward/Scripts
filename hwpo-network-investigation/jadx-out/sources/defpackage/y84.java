package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y84 {
    public static final h37 a(h27 h27Var, jt1 jt1Var, int i) {
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = bl7.i(Boolean.FALSE);
            jt1Var.C(objF);
        }
        h37 h37Var = (h37) objF;
        boolean z = (((i & 14) ^ 6) > 4 && jt1Var.J(h27Var)) || (i & 6) == 4;
        Object objF2 = jt1Var.f();
        if (z || objF2 == c0187a) {
            objF2 = new x84(h27Var, h37Var, null);
            jt1Var.C(objF2);
        }
        wd3.d(jt1Var, (ci4) objF2, h27Var);
        return h37Var;
    }
}
