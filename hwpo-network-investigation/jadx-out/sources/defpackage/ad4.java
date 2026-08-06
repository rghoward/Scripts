package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.forgotpassword.presentation.ForgotPasswordViewModel$validateEmail$1", f = "ForgotPasswordViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ad4 extends p6a implements ci4<String, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ cd4 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad4(cd4 cd4Var, r02<? super ad4> r02Var) {
        super(2, r02Var);
        this.u = cd4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ad4 ad4Var = new ad4(this.u, r02Var);
        ad4Var.t = obj;
        return ad4Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(String str, r02<? super g2b> r02Var) {
        return ((ad4) create(str, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.t;
        dv8.b(obj);
        ec4.a aVar = new ec4.a(str);
        int i = cd4.B;
        this.u.e(aVar);
        return g2b.a;
    }
}
