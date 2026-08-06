package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsViewModel", f = "ChallengeEntryDetailsViewModel.kt", l = {162}, m = "onEntryDetailsLoaded", v = 2)
public final class v71 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ w71 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v71(w71 w71Var, r02<? super v71> r02Var) {
        super(r02Var);
        this.u = w71Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return w71.g(this.u, null, this);
    }
}
