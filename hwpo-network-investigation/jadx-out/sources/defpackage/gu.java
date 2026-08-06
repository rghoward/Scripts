package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gu extends wp5 implements oh4<c33, b33> {
    public final /* synthetic */ fv9<Object> u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ su<Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu(fv9<Object> fv9Var, Object obj, su<Object> suVar) {
        super(1);
        this.u = fv9Var;
        this.v = obj;
        this.w = suVar;
    }

    @Override // defpackage.oh4
    public final b33 invoke(c33 c33Var) {
        return new fu(this.u, this.v, this.w);
    }
}
