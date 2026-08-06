package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {616, 619}, m = "processDragStart", v = 1)
public final class a63 extends u02 {
    public n53.c t;
    public d63 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ y53 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a63(y53 y53Var, u02 u02Var) {
        super(u02Var);
        this.w = y53Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return y53.g2(this.w, null, this);
    }
}
