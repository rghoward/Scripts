package defpackage;

import io.ably.lib.transport.Defaults;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.player.presentation.PlayerViewModel$startPlayer$1", f = "PlayerViewModel.kt", l = {Defaults.HTTP_ASYNC_THREADPOOL_SIZE}, m = "invokeSuspend", v = 2)
public final class j48 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ k48 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j48(k48 k48Var, r02<? super j48> r02Var) {
        super(2, r02Var);
        this.u = k48Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new j48(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((j48) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        k48 k48Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            obj = k48.g(k48Var, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        s10 s10Var = (s10) obj;
        if (s10Var == null) {
            return g2b.a;
        }
        q38 q38Var = new q38(s10Var != s10.ENGLISH ? s10Var : null);
        int i2 = k48.D;
        k48Var.f(q38Var);
        return g2b.a;
    }
}
