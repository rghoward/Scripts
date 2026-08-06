package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.workouts.presentation.day_workouts.DayViewModel", f = "DayViewModel.kt", l = {101, 106}, m = "loadPrograms", v = 2)
public final class lm2 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ cm2 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm2(cm2 cm2Var, u02 u02Var) {
        super(u02Var);
        this.u = cm2Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return cm2.g(this.u, this);
    }
}
