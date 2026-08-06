package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.client.onboarding_settings.slide2.data.RequiredBenchmarksRepositoryImpl", f = "RequiredBenchmarksRepositoryImpl.kt", l = {18, 19}, m = "fetchRequiredBenchmarks", v = 2)
public final class tr8 extends u02 {
    public ArrayList t;
    public /* synthetic */ Object u;
    public final /* synthetic */ vr8 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr8(vr8 vr8Var, u02 u02Var) {
        super(u02Var);
        this.v = vr8Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
