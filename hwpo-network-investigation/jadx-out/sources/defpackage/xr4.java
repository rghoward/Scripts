package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.affiliated_gym.presentation.filters.location_filter.GymLocationFilterViewModel", f = "GymLocationFilterViewModel.kt", l = {134, 136, 137}, m = "requestFilterItemsNextPage", v = 2)
public final class xr4 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ rr4 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr4(rr4 rr4Var, u02 u02Var) {
        super(u02Var);
        this.u = rr4Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return rr4.i(this.u, this);
    }
}
