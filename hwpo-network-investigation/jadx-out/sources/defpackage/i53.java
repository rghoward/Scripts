package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i53 extends ox6.c implements txa, k53, nq5 {
    public final g53 H;
    public i53 I;
    public k53 J;
    public long K;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<i53, sxa> {
        public final /* synthetic */ e53 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e53 e53Var) {
            super(1);
            this.u = e53Var;
        }

        @Override // defpackage.oh4
        public final sxa invoke(i53 i53Var) {
            i53 i53Var2 = i53Var;
            if (!i53Var2.t.G) {
                return sxa.u;
            }
            k53 k53Var = i53Var2.J;
            if (k53Var != null) {
                k53Var.i0(this.u);
            }
            i53Var2.J = null;
            i53Var2.I = null;
            return sxa.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<i53, sxa> {
        public final /* synthetic */ gl8 u;
        public final /* synthetic */ i53 v;
        public final /* synthetic */ e53 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gl8 gl8Var, i53 i53Var, e53 e53Var) {
            super(1);
            this.u = gl8Var;
            this.v = i53Var;
            this.w = e53Var;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, txa] */
        @Override // defpackage.oh4
        public final sxa invoke(i53 i53Var) {
            i53 i53Var2 = i53Var;
            i53 i53Var3 = i53Var2;
            if (!ew2.g(this.v).getDragAndDropManager().a(i53Var3) || !j53.a(i53Var3, yk2.n(this.w))) {
                return sxa.t;
            }
            this.u.t = i53Var2;
            return sxa.v;
        }
    }

    public i53(Object obj) {
        this.H = g53.a;
        this.K = 0L;
    }

    @Override // defpackage.txa
    public final Object G() {
        return this.H;
    }

    @Override // defpackage.k53
    public final boolean I1(e53 e53Var) {
        i53 i53Var = this.I;
        if (i53Var != null) {
            return i53Var.I1(e53Var);
        }
        k53 k53Var = this.J;
        if (k53Var != null) {
            return k53Var.I1(e53Var);
        }
        return false;
    }

    @Override // defpackage.k53
    public final void T(e53 e53Var) {
        k53 k53Var = this.J;
        if (k53Var != null) {
            k53Var.T(e53Var);
            return;
        }
        i53 i53Var = this.I;
        if (i53Var != null) {
            i53Var.T(e53Var);
        }
    }

    @Override // defpackage.k53
    public final void V0(e53 e53Var) {
        k53 k53Var = this.J;
        if (k53Var != null) {
            k53Var.V0(e53Var);
        }
        i53 i53Var = this.I;
        if (i53Var != null) {
            i53Var.V0(e53Var);
        }
        this.I = null;
    }

    @Override // ox6.c
    public final void V1() {
        this.J = null;
        this.I = null;
    }

    @Override // defpackage.k53
    public final void f1(e53 e53Var) {
        k53 k53Var = this.J;
        if (k53Var != null) {
            k53Var.f1(e53Var);
            return;
        }
        i53 i53Var = this.I;
        if (i53Var != null) {
            i53Var.f1(e53Var);
        }
    }

    @Override // defpackage.nq5, defpackage.ml6
    public final void g(long j) {
        this.K = j;
    }

    @Override // defpackage.k53
    public final void g1(e53 e53Var) {
        txa txaVar;
        i53 i53Var;
        i53 i53Var2 = this.I;
        if (i53Var2 == null || !j53.a(i53Var2, yk2.n(e53Var))) {
            if (this.t.G) {
                gl8 gl8Var = new gl8();
                yx.h(this, new b(gl8Var, this, e53Var));
                txaVar = (txa) gl8Var.t;
            } else {
                txaVar = null;
            }
            i53Var = (i53) txaVar;
        } else {
            i53Var = i53Var2;
        }
        if (i53Var != null && i53Var2 == null) {
            i53Var.T(e53Var);
            i53Var.g1(e53Var);
            k53 k53Var = this.J;
            if (k53Var != null) {
                k53Var.V0(e53Var);
            }
        } else if (i53Var == null && i53Var2 != null) {
            k53 k53Var2 = this.J;
            if (k53Var2 != null) {
                k53Var2.T(e53Var);
                k53Var2.g1(e53Var);
            }
            i53Var2.V0(e53Var);
        } else if (!xj5.a(i53Var, i53Var2)) {
            if (i53Var != null) {
                i53Var.T(e53Var);
                i53Var.g1(e53Var);
            }
            if (i53Var2 != null) {
                i53Var2.V0(e53Var);
            }
        } else if (i53Var != null) {
            i53Var.g1(e53Var);
        } else {
            k53 k53Var3 = this.J;
            if (k53Var3 != null) {
                k53Var3.g1(e53Var);
            }
        }
        this.I = i53Var;
    }

    @Override // defpackage.k53
    public final void i0(e53 e53Var) {
        a aVar = new a(e53Var);
        if (aVar.invoke(this) != sxa.t) {
            return;
        }
        yx.h(this, aVar);
    }

    public i53() {
        this(null);
    }
}
