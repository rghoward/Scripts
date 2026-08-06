package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.main_tabs.presentation.tabs.MainTabsViewModel$observeSocketNotifications$2", f = "MainTabsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ah6 extends p6a implements ci4<Throwable, r02<? super Boolean>, Object> {
    public /* synthetic */ Object t;

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ah6 ah6Var = new ah6(2, r02Var);
        ah6Var.t = obj;
        return ah6Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(Throwable th, r02<? super Boolean> r02Var) throws Throwable {
        ((ah6) create(th, r02Var)).invokeSuspend(g2b.a);
        return Boolean.TRUE;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.t;
        dv8.b(obj);
        rma.a.b(th);
        return Boolean.TRUE;
    }
}
