package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.data.repository.TrackingValuesRepositoryImpl", f = "TrackingValuesRepositoryImpl.kt", l = {157}, m = "getValueEntry", v = 2)
public final class kua extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ tta u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kua(tta ttaVar, u02 u02Var) {
        super(u02Var);
        this.u = ttaVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.j(null, 0, this);
    }
}
