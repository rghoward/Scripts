package defpackage;

import io.ably.lib.util.Crypto;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.domain.usecase.GetScoreDetailsUseCase", f = "GetScoreDetailsUseCase.kt", l = {Crypto.DEFAULT_BLOCKLENGTH}, m = "executeOnBackground", v = 2)
public final class gl4 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ fl4 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl4(fl4 fl4Var, u02 u02Var) {
        super(u02Var);
        this.u = fl4Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, this);
    }
}
