package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.filters.location_filter.GymLocationFilterViewModel$onRetryClick$1", f = "GymLocationFilterViewModel.kt", l = {215}, m = "invokeSuspend", v = 2)
public final class ur4 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ rr4 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur4(rr4 rr4Var, r02<? super ur4> r02Var) {
        super(2, r02Var);
        this.u = rr4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ur4(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ur4) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            Object objG = rr4.g(this.u, this);
            v72 v72Var = v72.t;
            if (objG == v72Var) {
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
