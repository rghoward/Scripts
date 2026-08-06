package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.domain.use_case.SavePerformanceUseCase", f = "SavePerformanceUseCase.kt", l = {28, 43, 48, 49, 50}, m = "executeOnBackground", v = 2)
public final class a09 extends u02 {
    public zz8.a t;
    public bd8 u;
    public vc8 v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ zz8 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a09(zz8 zz8Var, u02 u02Var) {
        super(u02Var);
        this.y = zz8Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(null, this);
    }
}
