package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ly8 {
    public static final ny8 a = new ny8(c30.a, di.a.j);

    public static final ny8 a(c30.e eVar, di.c cVar, jt1 jt1Var, int i) {
        if (eVar.equals(c30.a) && xj5.a(cVar, di.a.j)) {
            jt1Var.K(-1073830487);
            jt1Var.B();
            return a;
        }
        jt1Var.K(-1073779616);
        boolean z = ((((i & 14) ^ 6) > 4 && jt1Var.J(eVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && jt1Var.J(cVar)) || (i & 48) == 32);
        Object objF = jt1Var.f();
        if (z || objF == jt1.a.a) {
            objF = new ny8(eVar, cVar);
            jt1Var.C(objF);
        }
        ny8 ny8Var = (ny8) objF;
        jt1Var.B();
        return ny8Var;
    }
}
