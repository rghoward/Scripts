package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.onboarding.presentation.sign_in.SignInViewModel", f = "SignInViewModel.kt", l = {131, 135, 136, 140, 141, 142, 144}, m = "handleAuthSuccess", v = 2)
public final class uo9 extends u02 {
    public h5b t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ qo9 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo9(qo9 qo9Var, u02 u02Var) {
        super(u02Var);
        this.w = qo9Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return qo9.g(this.w, null, this);
    }
}
