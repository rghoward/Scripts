package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollingLogic.kt", l = {219, 273}, m = "dispatchMouseWheelScroll", v = 1)
public final class ez6 extends u02 {
    public z79 t;
    public dl8 u;
    public float v;
    public /* synthetic */ Object w;
    public final /* synthetic */ dz6 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez6(dz6 dz6Var, u02 u02Var) {
        super(u02Var);
        this.x = dz6Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return dz6.c(this.x, null, null, 0.0f, 0.0f, this);
    }
}
