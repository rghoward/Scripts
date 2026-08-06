package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.session_details.SessionDetailsViewModel$listenPerformanceUpdates$1", f = "SessionDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cg9 extends p6a implements ci4<js7<? extends Integer, ? extends vc8>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ qf9 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg9(qf9 qf9Var, r02<? super cg9> r02Var) {
        super(2, r02Var);
        this.u = qf9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        cg9 cg9Var = new cg9(this.u, r02Var);
        cg9Var.t = obj;
        return cg9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(js7<? extends Integer, ? extends vc8> js7Var, r02<? super g2b> r02Var) {
        return ((cg9) create(js7Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        js7 js7Var = (js7) this.t;
        dv8.b(obj);
        int iIntValue = ((Number) js7Var.t).intValue();
        vc8 vc8Var = (vc8) js7Var.u;
        int i = qf9.Y;
        qf9 qf9Var = this.u;
        tc8 tc8Var = qf9Var.b().e;
        tc8 tc8VarA = qf9Var.J.a(vc8Var);
        if (iIntValue != qf9Var.y) {
            return g2b.a;
        }
        qf9Var.e(new qf9.b.e(tc8VarA));
        if (!yx.b(tc8Var) && yx.b(tc8VarA)) {
            qf9.g(qf9Var);
        }
        return g2b.a;
    }
}
