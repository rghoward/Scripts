package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.main_tabs.presentation.tabs.MainTabsViewModel$observeSocketNotifications$1", f = "MainTabsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zg6 extends p6a implements ci4<xd3<? extends Exception, ? extends g2b>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ qg6 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg6(qg6 qg6Var, r02<? super zg6> r02Var) {
        super(2, r02Var);
        this.u = qg6Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        zg6 zg6Var = new zg6(this.u, r02Var);
        zg6Var.t = obj;
        return zg6Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends g2b> xd3Var, r02<? super g2b> r02Var) {
        return ((zg6) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            rma.a.b((Throwable) ((xd3.a) xd3Var).a);
            g2b g2bVar = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            qg6.b bVar = qg6.Companion;
            qg6 qg6Var = this.u;
            qg6Var.e(new qg6.a.b(qg6Var.b().b + 1));
            g2b g2bVar2 = g2b.a;
        }
        return g2b.a;
    }
}
