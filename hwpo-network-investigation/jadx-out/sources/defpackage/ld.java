package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.add_value.AddValueViewModel$onRetryClick$1", f = "AddValueViewModel.kt", l = {250}, m = "invokeSuspend", v = 2)
public final class ld extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ gd u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(gd gdVar, r02<? super ld> r02Var) {
        super(2, r02Var);
        this.u = gdVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ld(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ld) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            gd gdVar = this.u;
            String str = gdVar.C;
            this.t = 1;
            Object objG = gd.g(gdVar, str, this);
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
