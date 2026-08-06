package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {551, 2189}, m = "waitForComposition", v = 1)
public final class b99 extends u02 {
    public Object t;
    public /* synthetic */ Object u;
    public final /* synthetic */ w89<Object> v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b99(w89 w89Var, u02 u02Var) {
        super(u02Var);
        this.v = w89Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return w89.w(this.v, this);
    }
}
