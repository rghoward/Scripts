package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide1.presentation.OnboardingSettingsFirstPageViewModel$onUpdateAccountSuccess$1", f = "OnboardingSettingsFirstPageViewModel.kt", l = {174}, m = "invokeSuspend", v = 2)
public final class dj7 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ fj7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj7(boolean z, boolean z2, fj7 fj7Var, r02<? super dj7> r02Var) {
        super(2, r02Var);
        this.u = z;
        this.v = z2;
        this.w = fj7Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new dj7(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((dj7) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            boolean z = this.u;
            fj7 fj7Var = this.w;
            boolean z2 = this.v;
            if (z) {
                ni7.a aVar = new ni7.a(z2 ? xp5.ONBOARDING_PAGE_TWO : xp5.MAIN_TABS);
                int i2 = fj7.K;
                fj7Var.f(aVar);
            } else {
                this.t = 1;
                v72 v72Var = v72.t;
                if (z2) {
                    fj7Var.x.a();
                    objA = g2b.a;
                } else {
                    objA = fj7Var.z.a.a(a87.f.a, this);
                    if (objA != v72Var) {
                        objA = g2b.a;
                    }
                    if (objA != v72Var) {
                        objA = g2b.a;
                    }
                }
                if (objA == v72Var) {
                    return v72Var;
                }
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
