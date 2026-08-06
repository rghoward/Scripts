package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.host.presentation.HostActivityViewModel$onSessionExpired$1", f = "HostActivityViewModel.kt", l = {250}, m = "invokeSuspend", v = 2)
public final class q25 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ e25 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q25(e25 e25Var, r02<? super q25> r02Var) {
        super(2, r02Var);
        this.u = e25Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new q25(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((q25) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        e25 e25Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            wd1 wd1Var = e25Var.H;
            g2b g2bVar = g2b.a;
            this.t = 1;
            wd1Var.getClass();
            obj = g5b.b(wd1Var, g2bVar, this);
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
            e25Var.y.b();
            g2b g2bVar2 = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            e25Var.y.b();
            g2b g2bVar3 = g2b.a;
        }
        return g2b.a;
    }
}
