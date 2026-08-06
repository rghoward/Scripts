package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.workouts.presentation.day_workouts.DayViewModel$requestRefreshDay$1", f = "DayViewModel.kt", l = {138}, m = "invokeSuspend", v = 2)
public final class nm2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ cm2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm2(cm2 cm2Var, r02<? super nm2> r02Var) {
        super(2, r02Var);
        this.u = cm2Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new nm2(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((nm2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            uc9 uc9Var = this.u.A;
            dl2.a aVar = new dl2.a(false);
            this.t = 1;
            uc9Var.getClass();
            Object objB = g5b.b(uc9Var, aVar, this);
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
