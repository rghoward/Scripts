package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.benchmarks.presentation.benchmarks.BenchmarksViewModel$observeBenchmarkUpdates$2", f = "BenchmarksViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ip0 extends p6a implements ci4<Boolean, r02<? super g2b>, Object> {
    public /* synthetic */ boolean t;
    public final /* synthetic */ fp0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip0(fp0 fp0Var, r02<? super ip0> r02Var) {
        super(2, r02Var);
        this.u = fp0Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ip0 ip0Var = new ip0(this.u, r02Var);
        ip0Var.t = ((Boolean) obj).booleanValue();
        return ip0Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(Boolean bool, r02<? super g2b> r02Var) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((ip0) create(bool2, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.t;
        dv8.b(obj);
        fp0.a.C0090a c0090a = new fp0.a.C0090a(z);
        int i = fp0.K;
        this.u.e(c0090a);
        return g2b.a;
    }
}
