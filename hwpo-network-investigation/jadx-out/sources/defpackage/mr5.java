package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mr5 extends mb7 {
    public static final np r0;
    public lr5 n0;
    public xx1 o0;
    public a p0;
    public t20 q0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends ff6 {
        public a() {
            super(mr5.this);
        }

        @Override // defpackage.pj5
        public final int A(int i) {
            mr5 mr5Var = mr5.this;
            lr5 lr5Var = mr5Var.n0;
            mb7 mb7Var = mr5Var.K;
            mb7Var.getClass();
            ff6 ff6VarE1 = mb7Var.e1();
            ff6VarE1.getClass();
            return lr5Var.v(this, ff6VarE1, i);
        }

        @Override // defpackage.pj5
        public final int C(int i) {
            mr5 mr5Var = mr5.this;
            lr5 lr5Var = mr5Var.n0;
            mb7 mb7Var = mr5Var.K;
            mb7Var.getClass();
            ff6 ff6VarE1 = mb7Var.e1();
            ff6VarE1.getClass();
            return lr5Var.x(this, ff6VarE1, i);
        }

        @Override // defpackage.cl6
        public final jz7 E(long j) {
            m0(j);
            xx1 xx1Var = new xx1(j);
            mr5 mr5Var = mr5.this;
            mr5Var.o0 = xx1Var;
            lr5 lr5Var = mr5Var.n0;
            mb7 mb7Var = mr5Var.K;
            mb7Var.getClass();
            ff6 ff6VarE1 = mb7Var.e1();
            ff6VarE1.getClass();
            ff6.G0(this, lr5Var.e(this, ff6VarE1, j));
            return this;
        }

        @Override // defpackage.pj5
        public final int c0(int i) {
            mr5 mr5Var = mr5.this;
            lr5 lr5Var = mr5Var.n0;
            mb7 mb7Var = mr5Var.K;
            mb7Var.getClass();
            ff6 ff6VarE1 = mb7Var.e1();
            ff6VarE1.getClass();
            return lr5Var.j(this, ff6VarE1, i);
        }

        @Override // defpackage.pj5
        public final int o(int i) {
            mr5 mr5Var = mr5.this;
            lr5 lr5Var = mr5Var.n0;
            mb7 mb7Var = mr5Var.K;
            mb7Var.getClass();
            ff6 ff6VarE1 = mb7Var.e1();
            ff6VarE1.getClass();
            return lr5Var.f(this, ff6VarE1, i);
        }

        @Override // defpackage.df6
        public final int p0(ei eiVar) {
            int iA = nr5.a(this, eiVar);
            this.M.h(iA, eiVar);
            return iA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements gl6 {
        public final /* synthetic */ gl6 a;
        public final int b;
        public final int c;

        public b(gl6 gl6Var, mr5 mr5Var) {
            this.a = gl6Var;
            a aVar = mr5Var.p0;
            aVar.getClass();
            this.b = aVar.t;
            a aVar2 = mr5Var.p0;
            aVar2.getClass();
            this.c = aVar2.u;
        }

        @Override // defpackage.gl6
        public final int h() {
            return this.c;
        }

        @Override // defpackage.gl6
        public final int j() {
            return this.b;
        }

        @Override // defpackage.gl6
        public final Map<ei, Integer> l() {
            return this.a.l();
        }

        @Override // defpackage.gl6
        public final void m() {
            this.a.m();
        }

        @Override // defpackage.gl6
        public final oh4<wy8, g2b> n() {
            return this.a.n();
        }
    }

    static {
        np npVar = new np();
        npVar.f(uh1.h);
        npVar.o(1.0f);
        npVar.p(1);
        r0 = npVar;
    }

    public mr5(qr5 qr5Var, lr5 lr5Var) {
        super(qr5Var);
        this.n0 = lr5Var;
        this.p0 = qr5Var.A != null ? new a() : null;
        this.q0 = (lr5Var.q().v & 512) != 0 ? new t20(this, (s20) lr5Var) : null;
    }

    @Override // defpackage.pj5
    public final int A(int i) {
        t20 t20Var = this.q0;
        if (t20Var != null) {
            s20 s20Var = t20Var.u;
            mb7 mb7Var = this.K;
            mb7Var.getClass();
            return s20Var.q0(t20Var, mb7Var, i);
        }
        lr5 lr5Var = this.n0;
        mb7 mb7Var2 = this.K;
        mb7Var2.getClass();
        return lr5Var.v(this, mb7Var2, i);
    }

    @Override // defpackage.pj5
    public final int C(int i) {
        t20 t20Var = this.q0;
        if (t20Var != null) {
            s20 s20Var = t20Var.u;
            mb7 mb7Var = this.K;
            mb7Var.getClass();
            return s20Var.n0(t20Var, mb7Var, i);
        }
        lr5 lr5Var = this.n0;
        mb7 mb7Var2 = this.K;
        mb7Var2.getClass();
        return lr5Var.x(this, mb7Var2, i);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    @Override // defpackage.cl6
    public final jz7 E(long j) {
        gl6 gl6VarE;
        boolean z;
        xx1 xx1Var;
        if (this.J) {
            xx1 xx1Var2 = this.o0;
            if (xx1Var2 == null) {
                z90.a("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j = xx1Var2.a;
        }
        m0(j);
        t20 t20Var = this.q0;
        if (t20Var != null) {
            s20 s20Var = t20Var.u;
            a aVar = t20Var.t.p0;
            aVar.getClass();
            gl6 gl6VarV0 = aVar.v0();
            gl6VarV0.j();
            gl6VarV0.h();
            boolean z2 = s20Var.s0() || (xx1Var = this.o0) == null || j != xx1Var.a;
            t20Var.v = z2;
            if (!z2) {
                mb7 mb7Var = this.K;
                mb7Var.getClass();
                mb7Var.J = true;
            }
            this.K.getClass();
            gl6VarE = s20Var.p0();
            mb7 mb7Var2 = this.K;
            mb7Var2.getClass();
            mb7Var2.J = false;
            int iJ = gl6VarE.j();
            a aVar2 = this.p0;
            aVar2.getClass();
            if (iJ == aVar2.t) {
                int iH = gl6VarE.h();
                a aVar3 = this.p0;
                aVar3.getClass();
                z = iH == aVar3.u;
            }
            if (!t20Var.v) {
                mb7 mb7Var3 = this.K;
                mb7Var3.getClass();
                long j2 = mb7Var3.v;
                mb7 mb7Var4 = this.K;
                mb7Var4.getClass();
                ff6 ff6VarE1 = mb7Var4.e1();
                if (kg5.a(j2, ff6VarE1 != null ? new kg5(ff6VarE1.H0()) : null) && !z) {
                    gl6VarE = new b(gl6VarE, this);
                }
            }
        } else {
            lr5 lr5Var = this.n0;
            mb7 mb7Var5 = this.K;
            mb7Var5.getClass();
            gl6VarE = lr5Var.e(this, mb7Var5, j);
        }
        W1(gl6VarE);
        N1();
        return this;
    }

    @Override // defpackage.mb7
    public final void S1(n41 n41Var, ko4 ko4Var) {
        mb7 mb7Var;
        mb7 mb7Var2 = this.K;
        mb7Var2.getClass();
        mb7Var2.M0(n41Var, ko4Var);
        if (!ur5.a(this.H).getShowLayoutBounds() || (mb7Var = this.K) == null) {
            return;
        }
        if (kg5.b(this.v, mb7Var.v) && bg5.b(mb7Var.U, 0L)) {
            return;
        }
        long j = this.v;
        n41Var.s(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, r0);
    }

    @Override // defpackage.mb7
    public final void V0() {
        if (this.p0 == null) {
            this.p0 = new a();
        }
    }

    @Override // defpackage.pj5
    public final int c0(int i) {
        t20 t20Var = this.q0;
        if (t20Var != null) {
            s20 s20Var = t20Var.u;
            mb7 mb7Var = this.K;
            mb7Var.getClass();
            return s20Var.q1(t20Var, mb7Var, i);
        }
        lr5 lr5Var = this.n0;
        mb7 mb7Var2 = this.K;
        mb7Var2.getClass();
        return lr5Var.j(this, mb7Var2, i);
    }

    @Override // defpackage.mb7
    public final ff6 e1() {
        return this.p0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    public final void f2() {
        boolean z;
        if (this.C) {
            return;
        }
        O1();
        mb7 mb7Var = this.K;
        mb7Var.getClass();
        t20 t20Var = this.q0;
        if (t20Var != null) {
            this.p0.getClass();
            if (t20Var.v) {
                z = false;
            } else {
                long j = this.v;
                a aVar = this.p0;
                if (kg5.a(j, aVar != null ? new kg5(aVar.H0()) : null)) {
                    long j2 = mb7Var.v;
                    ff6 ff6VarE1 = mb7Var.e1();
                    if (kg5.a(j2, ff6VarE1 != null ? new kg5(ff6VarE1.H0()) : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            mb7Var.I = z;
        }
        mb7Var.D = this.D;
        v0().m();
        mb7Var.D = false;
        mb7Var.I = false;
    }

    @Override // defpackage.mb7
    public final ox6.c g1() {
        return this.n0.q();
    }

    public final void g2(lr5 lr5Var) {
        if (!lr5Var.equals(this.n0)) {
            if ((lr5Var.q().v & 512) != 0) {
                s20 s20Var = (s20) lr5Var;
                t20 t20Var = this.q0;
                if (t20Var != null) {
                    t20Var.u = s20Var;
                } else {
                    t20Var = new t20(this, s20Var);
                }
                this.q0 = t20Var;
            } else {
                this.q0 = null;
            }
        }
        this.n0 = lr5Var;
    }

    @Override // defpackage.mb7, defpackage.jz7
    public final void i0(long j, float f, oh4<? super ro4, g2b> oh4Var) {
        super.i0(j, f, oh4Var);
        f2();
    }

    @Override // defpackage.mb7, defpackage.jz7
    public final void k0(long j, float f, ko4 ko4Var) {
        super.k0(j, f, ko4Var);
        f2();
    }

    @Override // defpackage.pj5
    public final int o(int i) {
        t20 t20Var = this.q0;
        if (t20Var != null) {
            s20 s20Var = t20Var.u;
            mb7 mb7Var = this.K;
            mb7Var.getClass();
            return s20Var.P1(t20Var, mb7Var, i);
        }
        lr5 lr5Var = this.n0;
        mb7 mb7Var2 = this.K;
        mb7Var2.getClass();
        return lr5Var.f(this, mb7Var2, i);
    }

    @Override // defpackage.df6
    public final int p0(ei eiVar) {
        a aVar = this.p0;
        if (aVar == null) {
            return nr5.a(this, eiVar);
        }
        s27<ei> s27Var = aVar.M;
        int iD = s27Var.d(eiVar);
        if (iD >= 0) {
            return s27Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }
}
