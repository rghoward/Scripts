package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.session_details.SessionDetailsViewModel$listenTrackingActions$2", f = "SessionDetailsViewModel.kt", l = {540}, m = "invokeSuspend", v = 2)
public final class jg9 extends p6a implements ci4<xd3<? extends Exception, ? extends rsa>, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qf9 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg9(qf9 qf9Var, r02<? super jg9> r02Var) {
        super(2, r02Var);
        this.u = qf9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new jg9(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends rsa> xd3Var, r02<? super g2b> r02Var) {
        return ((jg9) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            Object objI = qf9.i(this.u, this);
            v72 v72Var = v72.t;
            if (objI == v72Var) {
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
