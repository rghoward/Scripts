package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2374, 2410}, m = "boundsUpdatesEventLoop$ui", v = 1)
public final class mm extends u02 {
    public f27 t;
    public ca1 u;
    public /* synthetic */ Object v;
    public final /* synthetic */ lm w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm(lm lmVar, u02 u02Var) {
        super(u02Var);
        this.w = lmVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(this);
    }
}
