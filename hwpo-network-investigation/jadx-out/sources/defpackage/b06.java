package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1", f = "LazyPagingItems.kt", l = {194, 196}, m = "invokeSuspend", v = 1)
public final class b06 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ a06<Object> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b06(a06 a06Var, r02 r02Var) {
        super(2, r02Var);
        this.u = a06Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new b06(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((b06) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            a06<Object> a06Var = this.u;
            Object objF = yk2.f(a06Var.a, new zz5(a06Var, null), this);
            Object obj2 = v72.t;
            if (objF != obj2) {
                objF = g2b.a;
            }
            if (objF == obj2) {
                return obj2;
            }
        } else {
            if (i != 1 && i != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
