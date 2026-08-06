package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yi1 {
    public static final aj1 a = new aj1(c30.c, di.a.m);

    public static final aj1 a(c30.l lVar, di.b bVar, jt1 jt1Var, int i) {
        if (lVar.equals(c30.c) && xj5.a(bVar, di.a.m)) {
            jt1Var.K(-1446604504);
            jt1Var.B();
            return a;
        }
        jt1Var.K(-1446550657);
        boolean z = ((((i & 14) ^ 6) > 4 && jt1Var.J(lVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && jt1Var.J(bVar)) || (i & 48) == 32);
        Object objF = jt1Var.f();
        if (z || objF == jt1.a.a) {
            objF = new aj1(lVar, bVar);
            jt1Var.C(objF);
        }
        aj1 aj1Var = (aj1) objF;
        jt1Var.B();
        return aj1Var;
    }
}
