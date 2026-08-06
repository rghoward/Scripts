package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.settings.presentation.AccountSettingsViewModel$observeCurrentUserUpdates$1", f = "AccountSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p7 extends p6a implements ci4<xd3<? extends Exception, ? extends h5b>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ r7 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(r7 r7Var, r02<? super p7> r02Var) {
        super(2, r02Var);
        this.u = r7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        p7 p7Var = new p7(this.u, r02Var);
        p7Var.t = obj;
        return p7Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends h5b> xd3Var, r02<? super g2b> r02Var) {
        return ((p7) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        yd3.h(xd3Var, new o7(0, this.u));
        return g2b.a;
    }
}
