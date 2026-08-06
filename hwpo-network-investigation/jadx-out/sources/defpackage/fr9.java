package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {242}, m = "invokeSuspend", v = 1)
public final class fr9 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ er9.a u;
    public final /* synthetic */ long v;
    public final /* synthetic */ er9 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr9(er9.a aVar, long j, er9 er9Var, r02<? super fr9> r02Var) {
        super(2, r02Var);
        this.u = aVar;
        this.v = j;
        this.w = er9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new fr9(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((fr9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            qt<kg5, cw> qtVar = this.u.a;
            kg5 kg5Var = new kg5(this.v);
            wv<kg5> wvVar = this.w.H;
            this.t = 1;
            obj = qt.c(qtVar, kg5Var, wvVar, null, this, 12);
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
        mv mvVar = ((uv) obj).b;
        return g2b.a;
    }
}
