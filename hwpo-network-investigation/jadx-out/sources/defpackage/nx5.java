package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nx5 {
    public dz9 a;
    public yv<Float, bw> b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {79}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return nx5.this.new a(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                yv<Float, bw> yvVar = nx5.this.b;
                Float f = new Float(0.0f);
                ty9 ty9VarB = xv.b(0.0f, 400.0f, new Float(0.5f), 1);
                this.t = 1;
                Object objF = o6a.f(yvVar, f, ty9VarB, true, null, this, 8);
                v72 v72Var = v72.t;
                if (objF == v72Var) {
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

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public nx5() {
        dza dzaVar = b0a.v;
        Object objValueOf = Float.valueOf(0.0f);
        this.b = new yv<>(dzaVar, objValueOf, (fw) dzaVar.a.invoke((T) objValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        return !(((Number) this.b.u.getValue()).floatValue() == 0.0f);
    }

    public final void b() {
        dz9 dz9Var = this.a;
        if (dz9Var != null) {
            dz9Var.k(null);
        }
        this.b = new yv<>(b0a.v, Float.valueOf(0.0f), null, 60);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(float f, tx2 tx2Var, t72 t72Var) {
        if (f <= tx2Var.U0(1.0f)) {
            return;
        }
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            float fFloatValue = ((Number) this.b.u.getValue()).floatValue();
            dz9 dz9Var = this.a;
            if (dz9Var != null) {
                dz9Var.k(null);
            }
            yv<Float, bw> yvVar = this.b;
            if (yvVar.y) {
                this.b = zv.c(yvVar, fFloatValue - f, 0.0f, 30);
            } else {
                this.b = new yv<>(b0a.v, Float.valueOf(-f), null, 60);
            }
            this.a = oy0.d(t72Var, null, null, new a(null), 3);
            g2b g2bVar = g2b.a;
        } finally {
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
        }
    }
}
