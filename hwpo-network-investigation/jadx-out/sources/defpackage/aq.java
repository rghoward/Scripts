package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aq extends wp5 implements oh4<t72, pd5> {
    public final /* synthetic */ t18 u;
    public final /* synthetic */ cq v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(t18 t18Var, cq cqVar) {
        super(1);
        this.u = t18Var;
        this.v = cqVar;
    }

    @Override // defpackage.oh4
    public final pd5 invoke(t72 t72Var) {
        return new pd5(this.u, new zp(this.v));
    }
}
