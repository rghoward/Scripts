package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {205, 215}, m = "boundsUpdatesEventLoop$ui", v = 1)
public final class dn extends u02 {
    public ca1 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ bn v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(bn bnVar, u02 u02Var) {
        super(u02Var);
        this.v = bnVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
