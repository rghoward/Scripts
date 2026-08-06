package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r35 extends ox6.c implements g58 {
    public h27 H;
    public l35 I;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {89}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return r35.this.new a(r02Var);
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
                this.t = 1;
                Object objC2 = r35.c2(r35.this, this);
                v72 v72Var = v72.t;
                if (objC2 == v72Var) {
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
    @xm2(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {90}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public b(r02<? super b> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return r35.this.new b(r02Var);
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
                this.t = 1;
                Object objD2 = r35.d2(r35.this, this);
                v72 v72Var = v72.t;
                if (objD2 == v72Var) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c2(r35 r35Var, u02 u02Var) throws Throwable {
        p35 p35Var;
        l35 l35Var;
        if (u02Var instanceof p35) {
            p35Var = (p35) u02Var;
            int i = p35Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                p35Var.w = i - Integer.MIN_VALUE;
            } else {
                p35Var = new p35(r35Var, u02Var);
            }
        } else {
            p35Var = new p35(r35Var, u02Var);
        }
        Object obj = p35Var.u;
        int i2 = p35Var.w;
        if (i2 == 0) {
            dv8.b(obj);
            if (r35Var.I == null) {
                l35 l35Var2 = new l35();
                h27 h27Var = r35Var.H;
                p35Var.t = l35Var2;
                p35Var.w = 1;
                Object objC = h27Var.c(l35Var2, p35Var);
                v72 v72Var = v72.t;
                if (objC == v72Var) {
                    return v72Var;
                }
                l35Var = l35Var2;
            }
            return g2b.a;
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l35Var = p35Var.t;
        dv8.b(obj);
        r35Var.I = l35Var;
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d2(r35 r35Var, u02 u02Var) throws Throwable {
        q35 q35Var;
        if (u02Var instanceof q35) {
            q35Var = (q35) u02Var;
            int i = q35Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                q35Var.v = i - Integer.MIN_VALUE;
            } else {
                q35Var = new q35(r35Var, u02Var);
            }
        } else {
            q35Var = new q35(r35Var, u02Var);
        }
        Object obj = q35Var.t;
        int i2 = q35Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            l35 l35Var = r35Var.I;
            if (l35Var != null) {
                m35 m35Var = new m35(l35Var);
                h27 h27Var = r35Var.H;
                q35Var.v = 1;
                Object objC = h27Var.c(m35Var, q35Var);
                v72 v72Var = v72.t;
                if (objC == v72Var) {
                    return v72Var;
                }
            }
            return g2b.a;
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        r35Var.I = null;
        return g2b.a;
    }

    @Override // ox6.c
    public final void V1() {
        e2();
    }

    @Override // defpackage.g58
    public final void c0(r48 r48Var, s48 s48Var, long j) {
        if (s48Var == s48.u) {
            int i = r48Var.f;
            if (i == 4) {
                oy0.d(Q1(), null, null, new a(null), 3);
            } else if (i == 5) {
                oy0.d(Q1(), null, null, new b(null), 3);
            }
        }
    }

    public final void e2() {
        l35 l35Var = this.I;
        if (l35Var != null) {
            this.H.b(new m35(l35Var));
            this.I = null;
        }
    }

    @Override // defpackage.g58
    public final void t0() {
        e2();
    }
}
