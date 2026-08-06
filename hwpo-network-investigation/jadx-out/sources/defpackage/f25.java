package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.host.presentation.HostActivityViewModel$connectToSocket$1", f = "HostActivityViewModel.kt", l = {241}, m = "invokeSuspend", v = 2)
public final class f25 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ e25 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f25(e25 e25Var, r02<? super f25> r02Var) {
        super(2, r02Var);
        this.u = e25Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new f25(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((f25) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            ww1 ww1Var = this.u.F;
            g2b g2bVar = g2b.a;
            this.t = 1;
            ww1Var.getClass();
            Object objB = g5b.b(ww1Var, g2bVar, this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
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
