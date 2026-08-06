package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", l = {419}, m = "invokeSuspend")
public final class ws9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qt<Float, bw> u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ wv<Float> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws9(qt<Float, bw> qtVar, boolean z, wv<Float> wvVar, r02<? super ws9> r02Var) {
        super(2, r02Var);
        this.u = qtVar;
        this.v = z;
        this.w = wvVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ws9(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ws9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            Float f = new Float(this.v ? 1.0f : 0.8f);
            this.t = 1;
            Object objC = qt.c(this.u, f, this.w, null, this, 12);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
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
