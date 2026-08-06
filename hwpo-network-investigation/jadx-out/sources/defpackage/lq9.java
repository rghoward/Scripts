package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {120}, m = "onFinish", v = 1)
public final class lq9 extends u02 {
    public el5 t;
    public a47 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ kq9.b w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq9(kq9.b bVar, u02 u02Var) {
        super(u02Var);
        this.w = bVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, this);
    }
}
