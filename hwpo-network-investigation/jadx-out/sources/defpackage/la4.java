package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class la4 extends gw2 implements qb9, bn4, ju1, rf7, txa {
    public static final a P = new a();
    public h27 J;
    public final oh4<Boolean, g2b> K;
    public v84 L;
    public ez7.a M;
    public mb7 N;
    public final aa4 O;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements mh4<Boolean> {
        @Override // defpackage.mh4
        public final Boolean invoke() {
            return Boolean.valueOf(((la4) this.receiver).O.y(7));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {322}, m = "invokeSuspend", v = 1)
    public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ h27 u;
        public final /* synthetic */ qg5 v;
        public final /* synthetic */ e33 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h27 h27Var, qg5 qg5Var, e33 e33Var, r02<? super c> r02Var) {
            super(2, r02Var);
            this.u = h27Var;
            this.v = qg5Var;
            this.w = e33Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new c(this.u, this.v, this.w, r02Var);
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
                Object objC = this.u.c(this.v, this);
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
            e33 e33Var = this.w;
            if (e33Var != null) {
                e33Var.dispose();
            }
            return g2b.a;
        }
    }

    public la4() {
        throw null;
    }

    public la4(h27 h27Var, int i, m0.b bVar) {
        this.J = h27Var;
        this.K = bVar;
        ba4 ba4Var = new ba4(i, new ma4(2, this, la4.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0), 10);
        c2(ba4Var);
        this.O = ba4Var;
    }

    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        boolean zE = this.O.a0().e();
        ho5<Object>[] ho5VarArr = ec9.a;
        gc9<Boolean> gc9Var = ac9.l;
        ho5<Object> ho5Var = ec9.a[4];
        hc9Var.d(gc9Var, Boolean.valueOf(zE));
        hc9Var.d(kb9.w, new k3(null, new b(0, this, la4.class, "requestFocus", "requestFocus()Z", 0)));
    }

    @Override // defpackage.txa
    public final Object G() {
        return P;
    }

    @Override // defpackage.bn4
    public final void Q0(mb7 mb7Var) {
        this.N = mb7Var;
        if (this.O.a0().e()) {
            if (!mb7Var.g1().G) {
                g2();
                return;
            }
            mb7 mb7Var2 = this.N;
            if (mb7Var2 == null || !mb7Var2.g1().G) {
                return;
            }
            g2();
        }
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    @Override // ox6.c
    public final void W1() {
        ez7.a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        this.M = null;
    }

    @Override // defpackage.rf7
    public final void e1() {
        gl8 gl8Var = new gl8();
        sf7.a(this, new ka4(gl8Var, this));
        ez7 ez7Var = (ez7) gl8Var.t;
        if (this.O.a0().e()) {
            ez7.a aVar = this.M;
            if (aVar != null) {
                aVar.a();
            }
            this.M = ez7Var != null ? ez7Var.b() : null;
        }
    }

    public final void f2(h27 h27Var, qg5 qg5Var) {
        if (!this.G) {
            h27Var.b(qg5Var);
        } else {
            el5 el5Var = (el5) ((o02) Q1()).t.d0(el5.a.t);
            oy0.d(Q1(), null, null, new c(h27Var, qg5Var, el5Var != null ? el5Var.j0(new ja4(0, h27Var, qg5Var)) : null, null), 3);
        }
    }

    public final oa4 g2() {
        if (!this.G) {
            return null;
        }
        txa txaVarA = yx.a(this, oa4.H);
        if (txaVarA instanceof oa4) {
            return (oa4) txaVarA;
        }
        return null;
    }

    public final void h2(h27 h27Var) {
        v84 v84Var;
        if (xj5.a(this.J, h27Var)) {
            return;
        }
        h27 h27Var2 = this.J;
        if (h27Var2 != null && (v84Var = this.L) != null) {
            h27Var2.b(new w84(v84Var));
        }
        this.L = null;
        this.J = h27Var;
    }
}
