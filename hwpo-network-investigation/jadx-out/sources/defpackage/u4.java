package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u4 implements ei4 {
    @Override // defpackage.ei4
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hl6 hl6Var = (hl6) obj;
        final int iN1 = hl6Var.n1(10.0f);
        long j = ((xx1) obj3).a;
        int i = iN1 * 2;
        final jz7 jz7VarE = ((cl6) obj2).E(zx1.i(j, 0, i));
        int i2 = jz7VarE.u - i;
        return hl6Var.y0(jz7VarE.t, i2, if3.t, new oh4() { // from class: w4
            @Override // defpackage.oh4
            public final Object invoke(Object obj4) {
                ((jz7.a) obj4).l(jz7VarE, 0, -iN1, 0.0f);
                return g2b.a;
            }
        });
    }
}
