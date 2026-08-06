package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {361, 364}, m = "runAnimations", v = 1)
public final class y89 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ w89<Object> u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y89(w89 w89Var, u02 u02Var) {
        super(u02Var);
        this.u = w89Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return w89.v(this.u, this);
    }
}
