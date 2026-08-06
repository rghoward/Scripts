package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.settings.presentation.AccountSettingsViewModel", f = "AccountSettingsViewModel.kt", l = {125}, m = "mapUpdateAccountSettings", v = 2)
public final class n7 extends u02 {
    public z3b t;
    public /* synthetic */ Object u;
    public final /* synthetic */ r7 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(r7 r7Var, r02<? super n7> r02Var) {
        super(r02Var);
        this.v = r7Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return r7.g(this.v, null, this);
    }
}
