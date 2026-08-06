package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1", f = "LazyPagingItems.kt", l = {202, 204}, m = "invokeSuspend", v = 1)
public final class c06 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ a06<Object> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c06(a06 a06Var, r02 r02Var) {
        super(2, r02Var);
        this.u = a06Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new c06(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((c06) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            a06<Object> a06Var = this.u;
            a06Var.c.k.collect(new j74.a(new yz5(a06Var)), this);
            return v72.t;
        }
        if (i == 1 || i == 2) {
            dv8.b(obj);
            return g2b.a;
        }
        aa0.c("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
