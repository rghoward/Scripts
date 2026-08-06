package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.main_tabs.presentation.tabs.MainTabsViewModel", f = "MainTabsViewModel.kt", l = {86, 87, 93, 94, 95}, m = "checkIsSwitchLanguageNecessary", v = 2)
public final class sg6 extends u02 {
    public h5b t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ qg6 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg6(qg6 qg6Var, u02 u02Var) {
        super(u02Var);
        this.w = qg6Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return qg6.g(this.w, null, this);
    }
}
