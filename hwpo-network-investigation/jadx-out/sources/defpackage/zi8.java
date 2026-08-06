package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {32}, m = "proceed")
public final class zi8 extends u02 {
    public bj8 t;
    public ug5 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ bj8 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi8(bj8 bj8Var, u02 u02Var) {
        super(u02Var);
        this.w = bj8Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(null, this);
    }
}
