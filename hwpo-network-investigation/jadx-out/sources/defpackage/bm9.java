package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl", v = 1)
public final class bm9<T> extends u02 {
    public am9 t;
    public s54 u;
    public cm9 v;
    public el5 w;
    public /* synthetic */ Object x;
    public final /* synthetic */ am9<T> y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm9(am9<T> am9Var, r02<? super bm9> r02Var) {
        super(r02Var);
        this.y = am9Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        am9.n(this.y, null, this);
        return v72.t;
    }
}
