package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {409}, m = "invokeSuspend")
public final class vs9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ qt<Float, bw> u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ wv<Float> w;
    public final /* synthetic */ mh4<g2b> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs9(qt<Float, bw> qtVar, boolean z, wv<Float> wvVar, mh4<g2b> mh4Var, r02<? super vs9> r02Var) {
        super(2, r02Var);
        this.u = qtVar;
        this.v = z;
        this.w = wvVar;
        this.x = mh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new vs9(this.u, this.v, this.w, this.x, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((vs9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        vs9 vs9Var;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            Float f = new Float(this.v ? 1.0f : 0.0f);
            this.t = 1;
            vs9Var = this;
            Object objC = qt.c(this.u, f, this.w, null, vs9Var, 12);
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
            vs9Var = this;
        }
        vs9Var.x.invoke();
        return g2b.a;
    }
}
