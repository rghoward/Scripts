package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.core.domain.usecase.user.LogOutUseCase", f = "LogOutUseCase.kt", l = {26, 30, 31, 33}, m = "executeOnBackground", v = 2)
public final class sd6 extends u02 {
    public rd6.a t;
    public /* synthetic */ Object u;
    public final /* synthetic */ rd6 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd6(rd6 rd6Var, u02 u02Var) {
        super(u02Var);
        this.v = rd6Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
