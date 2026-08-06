package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend", v = 1)
public final class wo7 extends p6a implements ei4<hk4, hk4, r02<? super hk4>, Object> {
    public /* synthetic */ hk4 t;
    public /* synthetic */ hk4 u;
    public final /* synthetic */ wb6 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo7(wb6 wb6Var, r02<? super wo7> r02Var) {
        super(3, r02Var);
        this.v = wb6Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(hk4 hk4Var, hk4 hk4Var2, r02<? super hk4> r02Var) {
        wo7 wo7Var = new wo7(this.v, r02Var);
        wo7Var.t = hk4Var;
        wo7Var.u = hk4Var2;
        return wo7Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zB;
        dv8.b(obj);
        hk4 hk4Var = this.t;
        hk4 hk4Var2 = this.u;
        hk4Var2.getClass();
        hk4Var.getClass();
        int i = hk4Var2.a;
        int i2 = hk4Var.a;
        if (i > i2) {
            zB = true;
        } else {
            zB = i < i2 ? false : e9.b(hk4Var2.b, hk4Var.b, this.v);
        }
        return zB ? hk4Var2 : hk4Var;
    }
}
