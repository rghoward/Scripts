package defpackage;

import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.host.domain.usecase.ObserveSocketConnectionStatesUseCase", f = "ObserveSocketConnectionStatesUseCase.kt", l = {InboxPagingSource.PAGE_SIZE}, m = "executeOnBackground$suspendImpl", v = 2)
public final class hf7 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ lf7 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf7(lf7 lf7Var, u02 u02Var) {
        super(u02Var);
        this.u = lf7Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return lf7.c(this.u, this);
    }
}
