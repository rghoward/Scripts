package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceViewModel", f = "EditPerformanceViewModel.kt", l = {293, 294, 298}, m = "savePerformance", v = 2)
public final class hd3 extends u02 {
    public boolean t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ pc3 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd3(pc3 pc3Var, u02 u02Var) {
        super(u02Var);
        this.x = pc3Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return pc3.g(this.x, null, false, this);
    }
}
