package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = {212}, m = "generateNewPagingSource", v = 1)
public final class ro7 extends u02 {
    public zr7 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ po7<Object, Object> v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro7(po7 po7Var, u02 u02Var) {
        super(u02Var);
        this.v = po7Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return po7.a(this.v, null, this);
    }
}
