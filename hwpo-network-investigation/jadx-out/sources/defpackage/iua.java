package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.data.repository.TrackingValuesRepositoryImpl", f = "TrackingValuesRepositoryImpl.kt", l = {162}, m = "getScoreInfo", v = 2)
public final class iua extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ tta u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iua(tta ttaVar, u02 u02Var) {
        super(u02Var);
        this.u = ttaVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.h(0, this);
    }
}
