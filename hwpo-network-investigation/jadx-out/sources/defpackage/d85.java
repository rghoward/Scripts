package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "coil.ImageLoaders$executeBlocking$1", f = "ImageLoaders.kt", l = {26}, m = "invokeSuspend")
public final class d85 extends p6a implements ci4<t72, r02<? super l85>, Object> {
    public int t;
    public final /* synthetic */ b85 u;
    public final /* synthetic */ k85 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d85(b85 b85Var, k85 k85Var, r02<? super d85> r02Var) {
        super(2, r02Var);
        this.u = b85Var;
        this.v = k85Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new d85(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super l85> r02Var) {
        return ((d85) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i != 0) {
            if (i == 1) {
                dv8.b(obj);
                return obj;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        this.t = 1;
        Object objC = this.u.c(this.v, this);
        v72 v72Var = v72.t;
        return objC == v72Var ? v72Var : objC;
    }
}
