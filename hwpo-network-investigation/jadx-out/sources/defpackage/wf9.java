package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.session_details.SessionDetailsViewModel$completePerformance$1", f = "SessionDetailsViewModel.kt", l = {218}, m = "invokeSuspend", v = 2)
public final class wf9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qf9 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf9(qf9 qf9Var, r02<? super wf9> r02Var) {
        super(2, r02Var);
        this.u = qf9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new wf9(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((wf9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        qf9 qf9Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            qf9.b.g gVar = qf9.b.g.a;
            int i2 = qf9.Y;
            qf9Var.e(gVar);
            fp1 fp1Var = qf9Var.C;
            fp1.a aVar = new fp1.a(qf9Var.x, qf9Var.y);
            this.t = 1;
            fp1Var.getClass();
            obj = g5b.b(fp1Var, aVar, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        xd3 xd3Var = (xd3) obj;
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            Exception exc = (Exception) ((xd3.a) xd3Var).a;
            qf9.b.a aVar2 = qf9.b.a.a;
            int i3 = qf9.Y;
            qf9Var.e(aVar2);
            qf9Var.f(new tf9(qf9Var.M.a(exc)));
            g2b g2bVar = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            qf9.b.a aVar3 = qf9.b.a.a;
            int i4 = qf9.Y;
            qf9Var.e(aVar3);
            g2b g2bVar2 = g2b.a;
        }
        return g2b.a;
    }
}
