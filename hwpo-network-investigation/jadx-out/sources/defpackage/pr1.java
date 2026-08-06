package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pr1 implements ei4 {
    @Override // defpackage.ei4
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b02 b02Var = (b02) obj;
        jt1 jt1Var = (jt1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= jt1Var.J(b02Var) ? 4 : 2;
        }
        if (jt1Var.A(iIntValue & 1, (iIntValue & 19) != 18)) {
            dv0.a(gi0.c(ir9.d(ir9.c(eo7.k(ox6.a.t, 0.0f, f02.g, 1), 1.0f), f02.f), b02Var.c, al8.a), jt1Var, 0);
        } else {
            jt1Var.u();
        }
        return g2b.a;
    }
}
