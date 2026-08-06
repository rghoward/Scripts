package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cu extends wp5 implements ei4<hl6, cl6, xx1, gl6> {
    public final /* synthetic */ oz1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(oz1 oz1Var) {
        super(3);
        this.u = oz1Var;
    }

    @Override // defpackage.ei4
    public final gl6 invoke(hl6 hl6Var, cl6 cl6Var, xx1 xx1Var) {
        jz7 jz7VarE = cl6Var.E(xx1Var.a);
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new bu(jz7VarE, this.u));
    }
}
