package defpackage;

import io.ably.lib.util.Crypto;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.main_tabs.domain.use_case.CheckIntercomLoginStatusUseCase", f = "CheckIntercomLoginStatusUseCase.kt", l = {14, Crypto.DEFAULT_BLOCKLENGTH, Crypto.DEFAULT_BLOCKLENGTH, 17}, m = "executeOnBackground", v = 2)
public final class sb1 extends u02 {
    public xg5 t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ tb1 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb1(tb1 tb1Var, u02 u02Var) {
        super(u02Var);
        this.w = tb1Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(this);
    }
}
