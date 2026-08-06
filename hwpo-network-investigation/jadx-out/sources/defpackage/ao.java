package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", l = {693, 725}, m = "applyToFling-BMRW4eQ", v = 1)
public final class ao extends u02 {
    public long t;
    public /* synthetic */ Object u;
    public final /* synthetic */ bo v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(bo boVar, u02 u02Var) {
        super(u02Var);
        this.v = boVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(0L, null, this);
    }
}
