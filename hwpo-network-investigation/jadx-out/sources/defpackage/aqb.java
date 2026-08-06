package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.workouts.presentation.workouts.WorkoutsViewModel$listenScheduleActions$1", f = "WorkoutsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class aqb extends p6a implements ci4<xd3<? extends Exception, ? extends dl2>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ wpb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqb(wpb wpbVar, r02<? super aqb> r02Var) {
        super(2, r02Var);
        this.u = wpbVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        aqb aqbVar = new aqb(this.u, r02Var);
        aqbVar.t = obj;
        return aqbVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends dl2> xd3Var, r02<? super g2b> r02Var) {
        return ((aqb) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        yd3.h(xd3Var, new tq4(2, this.u));
        return g2b.a;
    }
}
