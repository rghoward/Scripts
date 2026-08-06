package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide2.presentation.OnboardingSettingsSecondPageViewModel$openMainTabsScreen$1", f = "OnboardingSettingsSecondPageViewModel.kt", l = {95}, m = "invokeSuspend", v = 2)
public final class sj7 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ rj7 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj7(rj7 rj7Var, r02<? super sj7> r02Var) {
        super(2, r02Var);
        this.u = rj7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new sj7(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((sj7) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            b87 b87Var = this.u.x;
            this.t = 1;
            Object objA = b87Var.a.a(a87.f.a, this);
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
