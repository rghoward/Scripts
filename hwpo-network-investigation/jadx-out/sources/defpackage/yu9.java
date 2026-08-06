package defpackage;

import io.ably.lib.transport.Defaults;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", f = "ProduceState.kt", l = {Defaults.PORT}, m = "invokeSuspend", v = 1)
public final class yu9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ci4<ra8<Object>, r02<? super g2b>, Object> v;
    public final /* synthetic */ h37<Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yu9(ci4<? super ra8<Object>, ? super r02<? super g2b>, ? extends Object> ci4Var, h37<Object> h37Var, r02<? super yu9> r02Var) {
        super(2, r02Var);
        this.v = ci4Var;
        this.w = h37Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        yu9 yu9Var = new yu9(this.v, this.w, r02Var);
        yu9Var.u = obj;
        return yu9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((yu9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            sa8 sa8Var = new sa8(this.w, ((t72) this.u).getCoroutineContext());
            this.t = 1;
            Object objInvoke = this.v.invoke(sa8Var, this);
            v72 v72Var = v72.t;
            if (objInvoke == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
