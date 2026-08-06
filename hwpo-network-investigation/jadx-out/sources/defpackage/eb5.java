package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eb5 extends gw2 implements ju1 {
    public boolean J;
    public boolean K;
    public h27 L;
    public float M;
    public float N;
    public boolean O;
    public dz9 P;
    public pda Q;
    public qt<uh1, ew> R;
    public jl9 S;
    public final qt<y43, bw> T;
    public final o01 U;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$1", f = "TextField.kt", l = {1599}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return eb5.this.new a(r02Var);
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
                eb5 eb5Var = eb5.this;
                qt<uh1, ew> qtVar = eb5Var.R;
                if (qtVar != null) {
                    pda pdaVarD = eb5Var.Q;
                    if (pdaVarD == null) {
                        pdaVarD = xda.d((fi1) ku1.a(eb5Var, hi1.a), (qja) ku1.a(eb5Var, rja.a));
                    }
                    uh1 uh1Var = new uh1(pdaVarD.c(eb5Var.J, eb5Var.K, eb5Var.O));
                    wv wvVarB = eb5Var.J ? zs4.b((vy6) ku1.a(eb5Var, tk6.a), wy6.w) : new fu9();
                    this.t = 1;
                    obj = qt.c(qtVar, uh1Var, wvVarB, null, this, 12);
                    v72 v72Var = v72.t;
                    if (obj == v72Var) {
                        return v72Var;
                    }
                }
                return g2b.a;
            }
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2", f = "TextField.kt", l = {1611}, m = "invokeSuspend")
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public b(r02<? super b> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return eb5.this.new b(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                eb5 eb5Var = eb5.this;
                qt<y43, bw> qtVar = eb5Var.T;
                y43 y43Var = new y43((eb5Var.O && eb5Var.J) ? eb5Var.M : eb5Var.N);
                wv wvVarB = eb5Var.J ? zs4.b((vy6) ku1.a(eb5Var, tk6.a), wy6.u) : new fu9();
                this.t = 1;
                Object objC = qt.c(qtVar, y43Var, wvVarB, null, this, 12);
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.IndicatorLineNode$onAttach$1", f = "TextField.kt", l = {1569}, m = "invokeSuspend")
    public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public c(r02<? super c> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return eb5.this.new c(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                eb5.f2(eb5.this, this);
                return v72.t;
            }
            if (i == 1) {
                dv8.b(obj);
                return g2b.a;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public eb5(boolean z, boolean z2, h27 h27Var, pda pdaVar, jl9 jl9Var, float f, float f2) {
        this.J = z;
        this.K = z2;
        this.L = h27Var;
        this.M = f;
        this.N = f2;
        this.Q = pdaVar;
        this.S = jl9Var;
        this.T = new qt<>(new y43((this.O && z) ? f : f2), b0a.x, null, 12);
        q01 q01Var = new q01(new s01(), new i2(1, this));
        c2(q01Var);
        this.U = q01Var;
    }

    public static final Object f2(eb5 eb5Var, p6a p6aVar) throws Throwable {
        eb5Var.O = false;
        eb5Var.L.a().collect(new fb5(new ArrayList(), eb5Var), p6aVar);
        return v72.t;
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    @Override // ox6.c
    public final void U1() {
        this.P = oy0.d(Q1(), null, null, new c(null), 3);
        if (this.R == null) {
            pda pdaVarD = this.Q;
            if (pdaVarD == null) {
                pdaVarD = xda.d((fi1) ku1.a(this, hi1.a), (qja) ku1.a(this, rja.a));
            }
            long jC = pdaVarD.c(this.J, this.K, this.O);
            this.R = new qt<>(new uh1(jC), new dza(wi1.u, new xi1(uh1.f(jC))), null, 12);
        }
    }

    public final void g2() {
        oy0.d(Q1(), null, null, new a(null), 3);
        oy0.d(Q1(), null, null, new b(null), 3);
    }
}
