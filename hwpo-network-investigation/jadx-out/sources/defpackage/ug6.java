package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.main_tabs.presentation.tabs.MainTabsViewModel$checkIsSwitchLanguageNecessary$result$1", f = "MainTabsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ug6 extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
    public final /* synthetic */ qg6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug6(qg6 qg6Var, r02<? super ug6> r02Var) {
        super(2, r02Var);
        this.t = qg6Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ug6(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(g2b g2bVar, r02<? super g2b> r02Var) {
        return ((ug6) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        dg6 dg6Var = dg6.b;
        qg6.b bVar = qg6.Companion;
        this.t.f(dg6Var);
        return g2b.a;
    }
}
