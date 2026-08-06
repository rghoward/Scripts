package defpackage;

import io.intercom.android.sdk.models.Config;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {Config.DEFAULT_RATE_LIMIT_COUNT, 151}, m = "animateToZero", v = 1)
public final class q3b extends u02 {
    public di4 t;
    public mh4 u;
    public float v;
    public /* synthetic */ Object w;
    public final /* synthetic */ r3b x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3b(r3b r3bVar, u02 u02Var) {
        super(u02Var);
        this.x = r3bVar;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.a(null, null, this);
    }
}
