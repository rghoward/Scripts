package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.client.onboarding_settings.benchmark_input.presentation.RequiredBenchmarkInputViewModel$observeBenchmarkUpdates$2", f = "RequiredBenchmarkInputViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mr8 extends p6a implements ci4<Boolean, r02<? super g2b>, Object> {
    public /* synthetic */ boolean t;
    public final /* synthetic */ jr8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr8(jr8 jr8Var, r02<? super mr8> r02Var) {
        super(2, r02Var);
        this.u = jr8Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        mr8 mr8Var = new mr8(this.u, r02Var);
        mr8Var.t = ((Boolean) obj).booleanValue();
        return mr8Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(Boolean bool, r02<? super g2b> r02Var) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((mr8) create(bool2, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.t;
        dv8.b(obj);
        br8.d dVar = new br8.d(z);
        jr8.a aVar = jr8.Companion;
        this.u.e(dVar);
        return g2b.a;
    }
}
