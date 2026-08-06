package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {221}, m = "invokeSuspend", v = 1)
public final class og2 extends p6a implements ci4<os6.a<Object>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ xf2<Object> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og2(xf2<Object> xf2Var, r02<? super og2> r02Var) {
        super(2, r02Var);
        this.v = xf2Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        og2 og2Var = new og2(this.v, r02Var);
        og2Var.u = obj;
        return og2Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(os6.a<Object> aVar, r02<? super g2b> r02Var) {
        return ((og2) create(aVar, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            os6.a aVar = (os6.a) this.u;
            this.t = 1;
            Object objC = xf2.c(this.v, aVar, this);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
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
