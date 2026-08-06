package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.session_details.SessionDetailsViewModel", f = "SessionDetailsViewModel.kt", l = {242, 243, 249}, m = "getSectionDetails", v = 2)
public final class yf9 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ qf9 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf9(qf9 qf9Var, u02 u02Var) {
        super(u02Var);
        this.u = qf9Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return qf9.i(this.u, this);
    }
}
