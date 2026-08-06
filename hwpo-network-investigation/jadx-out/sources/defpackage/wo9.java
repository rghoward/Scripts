package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.onboarding.presentation.sign_in.SignInViewModel$handleAuthSuccess$3", f = "SignInViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wo9 extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
    public final /* synthetic */ qo9 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo9(qo9 qo9Var, r02<? super wo9> r02Var) {
        super(2, r02Var);
        this.t = qo9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new wo9(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(g2b g2bVar, r02<? super g2b> r02Var) {
        return ((wo9) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        so9 so9Var = so9.b;
        int i = qo9.H;
        this.t.f(so9Var);
        return g2b.a;
    }
}
