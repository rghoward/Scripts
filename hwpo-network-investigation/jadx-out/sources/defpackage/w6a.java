package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {890}, m = "withTimeout", v = 1)
public final class w6a<T> extends u02 {
    public dz9 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ z6a.a<Object> v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6a(z6a.a aVar, ak0 ak0Var) {
        super(ak0Var);
        this.v = aVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.w1(0L, null, this);
    }
}
