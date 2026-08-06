package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.MulticastedPagingData$asPagingData$1", f = "CachedPagingData.kt", l = {53}, m = "invokeSuspend", v = 1)
public final class g17 extends p6a implements ci4<s54<? super oo7<Object>>, r02<? super g2b>, Object> {
    public final /* synthetic */ i17<Object> t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g17(i17<Object> i17Var, r02<? super g17> r02Var) {
        super(2, r02Var);
        this.t = i17Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new g17(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(s54<? super oo7<Object>> s54Var, r02<? super g2b> r02Var) {
        return ((g17) create(s54Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.getClass();
        return g2b.a;
    }
}
