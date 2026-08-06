package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bk7 extends wp5 implements oh4<lp0.a, Boolean> {
    public final /* synthetic */ ba4 u;
    public final /* synthetic */ ba4 v;
    public final /* synthetic */ ba4 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ h94.a y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk7(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, int i, h94.a aVar) {
        super(1);
        this.u = ba4Var;
        this.v = ba4Var2;
        this.w = ba4Var3;
        this.x = i;
        this.y = aVar;
    }

    @Override // defpackage.oh4
    public final Boolean invoke(lp0.a aVar) {
        lp0.a aVar2 = aVar;
        ba4 ba4Var = this.v;
        if (this.u != ew2.g(ba4Var).getFocusOwner().v()) {
            return Boolean.TRUE;
        }
        boolean zF = ck7.f(ba4Var, this.w, this.x, this.y);
        Boolean boolValueOf = Boolean.valueOf(zF);
        if (zF || !aVar2.a()) {
            return boolValueOf;
        }
        return null;
    }
}
