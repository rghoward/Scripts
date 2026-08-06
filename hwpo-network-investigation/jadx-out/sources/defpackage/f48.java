package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.player.presentation.PlayerViewModel", f = "PlayerViewModel.kt", l = {68, 69, 75, 76}, m = "getCurrentLanguage", v = 2)
public final class f48 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ k48 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f48(k48 k48Var, u02 u02Var) {
        super(u02Var);
        this.u = k48Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return k48.g(this.u, this);
    }
}
