package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
public final class mg3 extends u02 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ig3 C;
    public int D;
    public ig3 t;
    public uq1 u;
    public k85 v;
    public Object w;
    public zk7 x;
    public nm3 y;
    public lu3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg3(ig3 ig3Var, u02 u02Var) {
        super(u02Var);
        this.C = ig3Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.d(null, null, null, null, null, this);
    }
}
