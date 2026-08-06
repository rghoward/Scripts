package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.session_details.SessionDetailsViewModel$listenSessionCompletionUpdates$1", f = "SessionDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class eg9 extends p6a implements ci4<gya<? extends Integer, ? extends Boolean, ? extends Boolean>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ qf9 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg9(qf9 qf9Var, r02<? super eg9> r02Var) {
        super(2, r02Var);
        this.u = qf9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        eg9 eg9Var = new eg9(this.u, r02Var);
        eg9Var.t = obj;
        return eg9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(gya<? extends Integer, ? extends Boolean, ? extends Boolean> gyaVar, r02<? super g2b> r02Var) {
        return ((eg9) create(gyaVar, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        gya gyaVar = (gya) this.t;
        dv8.b(obj);
        int iIntValue = ((Number) gyaVar.t).intValue();
        boolean zBooleanValue = ((Boolean) gyaVar.u).booleanValue();
        boolean zBooleanValue2 = ((Boolean) gyaVar.v).booleanValue();
        qf9 qf9Var = this.u;
        if (iIntValue == qf9Var.y) {
            qf9Var.e(new qf9.b.c(qf9Var.j(zBooleanValue, zBooleanValue2, qf9Var.b().e, qf9Var.b().f)));
        }
        return g2b.a;
    }
}
