package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.data.repository.ProgramsRepositoryImpl", f = "ProgramsRepositoryImpl.kt", l = {109}, m = "uncompleteSection", v = 2)
public final class rd8 extends u02 {
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ sd8 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd8(sd8 sd8Var, u02 u02Var) {
        super(u02Var);
        this.w = sd8Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.f(0, 0, this);
    }
}
