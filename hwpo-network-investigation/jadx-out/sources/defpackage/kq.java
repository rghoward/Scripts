package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kq extends wp5 implements oh4<c33, b33> {
    public final /* synthetic */ d68 u;
    public final /* synthetic */ l68 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(d68 d68Var, l68 l68Var) {
        super(1);
        this.u = d68Var;
        this.v = l68Var;
    }

    @Override // defpackage.oh4
    public final b33 invoke(c33 c33Var) {
        l68 l68Var = this.v;
        d68 d68Var = this.u;
        d68Var.setPositionProvider(l68Var);
        d68Var.h();
        return new jq();
    }
}
