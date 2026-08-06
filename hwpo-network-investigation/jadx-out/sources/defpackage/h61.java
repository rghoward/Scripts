package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {230}, m = "startInputMethod", v = 1)
public final class h61 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ k61.a u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(k61.a aVar, u02 u02Var) {
        super(u02Var);
        this.u = aVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        this.u.b(null, this);
        return v72.t;
    }
}
