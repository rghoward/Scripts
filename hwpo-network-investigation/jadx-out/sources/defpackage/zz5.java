package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", l = {168}, m = "invokeSuspend", v = 1)
public final class zz5 extends p6a implements ci4<sr7<Object>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ a06<Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz5(a06<Object> a06Var, r02<? super zz5> r02Var) {
        super(2, r02Var);
        this.v = a06Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        zz5 zz5Var = new zz5(this.v, r02Var);
        zz5Var.u = obj;
        return zz5Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(sr7<Object> sr7Var, r02<? super g2b> r02Var) {
        return ((zz5) create(sr7Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            sr7 sr7Var = (sr7) this.u;
            a06.a aVar = this.v.c;
            this.t = 1;
            Object objA = aVar.g.a(new wr7(aVar, sr7Var, null), this);
            v72 v72Var = v72.t;
            if (objA != v72Var) {
                objA = g2b.a;
            }
            if (objA == v72Var) {
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
