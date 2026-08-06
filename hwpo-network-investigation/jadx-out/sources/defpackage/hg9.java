package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.session_details.SessionDetailsViewModel$listenSessionDetailsUpdates$3", f = "SessionDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hg9 extends p6a implements ci4<gd8, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ qf9 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg9(qf9 qf9Var, r02<? super hg9> r02Var) {
        super(2, r02Var);
        this.u = qf9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        hg9 hg9Var = new hg9(this.u, r02Var);
        hg9Var.t = obj;
        return hg9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(gd8 gd8Var, r02<? super g2b> r02Var) {
        return ((hg9) create(gd8Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        gd8 gd8Var = (gd8) this.t;
        dv8.b(obj);
        qf9.b.d dVar = new qf9.b.d(gd8Var);
        int i = qf9.Y;
        this.u.e(dVar);
        return g2b.a;
    }
}
