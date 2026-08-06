package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.values_list.ValuesListViewModel$observeActions$2", f = "ValuesListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bcb extends p6a implements ci4<xd3<? extends Exception, ? extends rsa>, r02<? super g2b>, Object> {
    public final /* synthetic */ ybb t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcb(ybb ybbVar, r02<? super bcb> r02Var) {
        super(2, r02Var);
        this.t = ybbVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new bcb(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends rsa> xd3Var, r02<? super g2b> r02Var) {
        return ((bcb) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.H = true;
        return g2b.a;
    }
}
