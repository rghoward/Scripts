package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {203}, m = "decode")
public final class jg3 extends u02 {
    public jn2 A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ ig3 D;
    public int E;
    public ig3 t;
    public tw9 u;
    public uq1 v;
    public k85 w;
    public Object x;
    public zk7 y;
    public nm3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg3(ig3 ig3Var, u02 u02Var) {
        super(u02Var);
        this.D = ig3Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return ig3.b(this.D, null, null, null, null, null, null, this);
    }
}
