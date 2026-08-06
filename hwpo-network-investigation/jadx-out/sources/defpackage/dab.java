package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.value_details.ValueDetailsViewModel", f = "ValueDetailsViewModel.kt", l = {236, 238, 239}, m = "requestScoreInfo", v = 2)
public final class dab extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ o9b u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dab(o9b o9bVar, u02 u02Var) {
        super(u02Var);
        this.u = o9bVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return o9b.i(this.u, this);
    }
}
