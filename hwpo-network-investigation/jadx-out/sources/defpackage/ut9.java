package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {134, 150}, m = "invokeSuspend", v = 1)
public final class ut9 extends p6a implements ci4<t72, r02<? super tv<Float, bw>>, Object> {
    public dl8 t;
    public int u;
    public final /* synthetic */ xt9 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ oh4<Float, g2b> x;
    public final /* synthetic */ t69 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ut9(xt9 xt9Var, float f, oh4<? super Float, g2b> oh4Var, t69 t69Var, r02<? super ut9> r02Var) {
        super(2, r02Var);
        this.v = xt9Var;
        this.w = f;
        this.x = oh4Var;
        this.y = t69Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ut9(this.v, this.w, this.x, this.y, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super tv<Float, bw>> r02Var) {
        return ((ut9) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        final dl8 dl8Var;
        Object objC;
        xt9 xt9Var = this.v;
        cu9 cu9Var = xt9Var.a;
        int i = this.u;
        final oh4<Float, g2b> oh4Var = this.x;
        v72 v72Var = v72.t;
        if (i == 0) {
            dv8.b(obj);
            ldb ldbVarA = xt9Var.b.a();
            bw bwVar = new bw(0.0f);
            float f = this.w;
            float fA = cu9Var.a(f, ((bw) ldbVarA.b(bwVar, new bw(f))).a);
            if (Float.isNaN(fA)) {
                xc5.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            dl8Var = new dl8();
            float fSignum = Math.signum(f) * Math.abs(fA);
            dl8Var.t = fSignum;
            oh4Var.invoke(new Float(fSignum));
            float f2 = dl8Var.t;
            st9 st9Var = new st9(0, oh4Var, dl8Var);
            this.t = dl8Var;
            this.u = 1;
            objC = xt9.c(xt9Var, this.y, f2, this.w, st9Var, this);
            if (objC != v72Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                dv8.b(obj);
                return obj;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dl8 dl8Var2 = this.t;
        dv8.b(obj);
        dl8Var = dl8Var2;
        objC = obj;
        yv yvVar = (yv) objC;
        float fB = cu9Var.b(((Number) yvVar.d()).floatValue());
        if (Float.isNaN(fB)) {
            xc5.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        dl8Var.t = fB;
        yv yvVarC = zv.c(yvVar, 0.0f, 0.0f, 30);
        wv<Float> wvVar = xt9Var.c;
        oh4 oh4Var2 = new oh4() { // from class: tt9
            @Override // defpackage.oh4
            public final Object invoke(Object obj2) {
                float fFloatValue = ((Float) obj2).floatValue();
                dl8 dl8Var3 = dl8Var;
                float f3 = dl8Var3.t - fFloatValue;
                dl8Var3.t = f3;
                oh4Var.invoke(Float.valueOf(f3));
                return g2b.a;
            }
        };
        this.t = null;
        this.u = 2;
        Object objB = b23.b(this.y, fB, fB, yvVarC, wvVar, oh4Var2, this);
        return objB == v72Var ? v72Var : objB;
    }
}
