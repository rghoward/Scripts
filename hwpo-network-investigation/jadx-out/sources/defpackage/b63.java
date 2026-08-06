package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {626}, m = "processDragStop", v = 1)
public final class b63 extends u02 {
    public n53.d t;
    public /* synthetic */ Object u;
    public final /* synthetic */ y53 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b63(y53 y53Var, u02 u02Var) {
        super(u02Var);
        this.v = y53Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return y53.h2(this.v, null, this);
    }
}
