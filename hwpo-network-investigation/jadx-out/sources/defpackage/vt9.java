package defpackage;

import io.intercom.android.sdk.models.Config;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {Config.DEFAULT_RATE_LIMIT_COUNT}, m = "performFling", v = 1)
public final class vt9 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ xt9 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt9(xt9 xt9Var, u02 u02Var) {
        super(u02Var);
        this.u = xt9Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.b(null, 0.0f, null, this);
    }
}
