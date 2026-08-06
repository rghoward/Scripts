package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.domain.use_case.ClearPerformanceUseCase", f = "ClearPerformanceUseCase.kt", l = {23, 26, 27, 28, 29}, m = "executeOnBackground", v = 2)
public final class fe1 extends u02 {
    public ee1.a t;
    public bd8 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ee1 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe1(ee1 ee1Var, u02 u02Var) {
        super(u02Var);
        this.w = ee1Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, this);
    }
}
