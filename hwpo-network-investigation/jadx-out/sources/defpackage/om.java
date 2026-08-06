package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class om extends wp5 implements oh4<ub9, Boolean> {
    public final /* synthetic */ zf5<xb9> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(zf5<xb9> zf5Var) {
        super(1);
        this.u = zf5Var;
    }

    @Override // defpackage.oh4
    public final Boolean invoke(ub9 ub9Var) {
        return Boolean.valueOf(this.u.a(ub9Var.f));
    }
}
