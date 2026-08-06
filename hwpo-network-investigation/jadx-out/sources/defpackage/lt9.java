package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lt9 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ ms9 t;

    public lt9(ms9 ms9Var) {
        this.t = ms9Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ms9 ms9Var = this.t;
            boolean zJ = jt1Var2.J(ms9Var);
            Object objF = jt1Var2.f();
            if (zJ || objF == jt1.a.a) {
                objF = new lt4(2, ms9Var);
                jt1Var2.C(objF);
            }
            h65.b(1572864, 62, jt1Var2, (mh4) objF, zr1.a, null, null, null, false);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
