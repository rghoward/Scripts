package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {71}, m = "startInputMethod", v = 1)
public final class yp extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ cq u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(cq cqVar, u02 u02Var) {
        super(u02Var);
        this.u = cqVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        this.u.b(null, this);
        return v72.t;
    }
}
