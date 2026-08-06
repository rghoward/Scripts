package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {945}, m = "invokeSuspend", v = 1)
public final class y79 extends p6a implements ci4<t69, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ z79 v;
    public final /* synthetic */ ci4<k97, r02<? super g2b>, Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y79(z79 z79Var, ci4<? super k97, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super y79> r02Var) {
        super(2, r02Var);
        this.v = z79Var;
        this.w = ci4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        y79 y79Var = new y79(this.v, this.w, r02Var);
        y79Var.u = obj;
        return y79Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t69 t69Var, r02<? super g2b> r02Var) {
        return ((y79) create(t69Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            t69 t69Var = (t69) this.u;
            z79 z79Var = this.v;
            z79Var.k = t69Var;
            w79 w79Var = z79Var.l;
            this.t = 1;
            Object objInvoke = this.w.invoke(w79Var, this);
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
