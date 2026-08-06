package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide2.domain.ClearRequiredBenchmarksUseCase", f = "ClearRequiredBenchmarksUseCase.kt", l = {z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER}, m = "executeOnBackground", v = 2)
public final class ge1 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ he1 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge1(he1 he1Var, u02 u02Var) {
        super(u02Var);
        this.u = he1Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.c(this);
    }
}
