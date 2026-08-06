package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = {91}, m = "invokeSuspend", v = 1)
public final class p11 extends p6a implements ei4<s54<? super i17<Object>>, sr7<Object>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ s54 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ eg1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p11(r02 r02Var, eg1 eg1Var) {
        super(3, r02Var);
        this.w = eg1Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(s54<? super i17<Object>> s54Var, sr7<Object> sr7Var, r02<? super g2b> r02Var) {
        p11 p11Var = new p11(r02Var, this.w);
        p11Var.u = s54Var;
        p11Var.v = sr7Var;
        return p11Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            s54 s54Var = this.u;
            i17 i17Var = new i17(this.w, (sr7) this.v);
            this.t = 1;
            Object objEmit = s54Var.emit(i17Var, this);
            v72 v72Var = v72.t;
            if (objEmit == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
