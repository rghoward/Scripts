package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel", f = "SessionsViewModel.kt", l = {289}, m = "onSelectedProgramLoaded", v = 2)
public final class uj9 extends u02 {
    public bc8 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ lj9 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj9(lj9 lj9Var, u02 u02Var) {
        super(u02Var);
        this.v = lj9Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return lj9.g(this.v, null, this);
    }
}
