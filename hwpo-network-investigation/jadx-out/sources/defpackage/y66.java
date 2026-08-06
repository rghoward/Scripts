package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend", v = 1)
public final class y66 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ z66 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y66(z66 z66Var, r02<? super y66> r02Var) {
        super(2, r02Var);
        this.u = z66Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        y66 y66Var = new y66(this.u, r02Var);
        y66Var.t = obj;
        return y66Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((y66) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        t72 t72Var = (t72) this.t;
        z66 z66Var = this.u;
        s66 s66Var = z66Var.t;
        if (s66Var.b().compareTo(s66.b.u) >= 0) {
            s66Var.a(z66Var);
        } else {
            sd.c(t72Var.getCoroutineContext(), null);
        }
        return g2b.a;
    }
}
