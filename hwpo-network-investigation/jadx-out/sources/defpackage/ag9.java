package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.session_details.SessionDetailsViewModel$getSectionDetails$3", f = "SessionDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ag9 extends p6a implements ci4<Exception, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ qf9 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag9(qf9 qf9Var, r02<? super ag9> r02Var) {
        super(2, r02Var);
        this.u = qf9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ag9 ag9Var = new ag9(this.u, r02Var);
        ag9Var.t = obj;
        return ag9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(Exception exc, r02<? super g2b> r02Var) {
        return ((ag9) create(exc, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Exception exc = (Exception) this.t;
        dv8.b(obj);
        qf9 qf9Var = this.u;
        qf9Var.e(new qf9.b.C0224b(qf9Var.M.a(exc)));
        return g2b.a;
    }
}
