package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {647}, m = "currentPagingState", v = 1)
public final class zo7 extends u02 {
    public hp7.a t;
    public a47 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ uo7<Object, Object> w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo7(uo7 uo7Var, u02 u02Var) {
        super(u02Var);
        this.w = uo7Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.e(this);
    }
}
