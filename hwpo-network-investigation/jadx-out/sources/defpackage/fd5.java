package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fd5 extends mb7 {
    public static final np p0;
    public final m8a n0;
    public a o0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends ff6 {
        @Override // defpackage.pj5
        public final int A(int i) {
            dk5 dk5VarH = this.H.H.H();
            fl6 fl6VarA = dk5VarH.a();
            qr5 qr5Var = dk5VarH.a;
            return fl6VarA.e(qr5Var.Y.d, qr5Var.z(), i);
        }

        @Override // defpackage.pj5
        public final int C(int i) {
            dk5 dk5VarH = this.H.H.H();
            fl6 fl6VarA = dk5VarH.a();
            qr5 qr5Var = dk5VarH.a;
            return fl6VarA.a(qr5Var.Y.d, qr5Var.z(), i);
        }

        @Override // defpackage.cl6
        public final jz7 E(long j) {
            m0(j);
            mb7 mb7Var = this.H;
            k37<qr5> k37VarL = mb7Var.H.L();
            qr5[] qr5VarArr = k37VarL.t;
            int i = k37VarL.v;
            for (int i2 = 0; i2 < i; i2++) {
                hf6 hf6Var = qr5VarArr[i2].Z.q;
                hf6Var.getClass();
                hf6Var.C = qr5.f.v;
            }
            qr5 qr5Var = mb7Var.H;
            ff6.G0(this, qr5Var.P.d(this, qr5Var.z(), j));
            return this;
        }

        @Override // defpackage.ff6
        public final void K0() {
            hf6 hf6Var = this.H.H.Z.q;
            hf6Var.getClass();
            hf6Var.t0();
        }

        @Override // defpackage.pj5
        public final int c0(int i) {
            dk5 dk5VarH = this.H.H.H();
            fl6 fl6VarA = dk5VarH.a();
            qr5 qr5Var = dk5VarH.a;
            return fl6VarA.i(qr5Var.Y.d, qr5Var.z(), i);
        }

        @Override // defpackage.pj5
        public final int o(int i) {
            dk5 dk5VarH = this.H.H.H();
            fl6 fl6VarA = dk5VarH.a();
            qr5 qr5Var = dk5VarH.a;
            return fl6VarA.g(qr5Var.Y.d, qr5Var.z(), i);
        }

        @Override // defpackage.df6
        public final int p0(ei eiVar) {
            hf6 hf6Var = this.H.H.Z.q;
            hf6Var.getClass();
            cf6 cf6Var = hf6Var.L;
            if (!hf6Var.D) {
                vr5 vr5Var = hf6Var.y;
                if (vr5Var.d == qr5.d.u) {
                    cf6Var.f = true;
                    if (cf6Var.b) {
                        vr5Var.f = true;
                        vr5Var.g = true;
                    }
                } else {
                    cf6Var.g = true;
                }
            }
            a aVar = hf6Var.t().o0;
            if (aVar != null) {
                aVar.D = true;
            }
            hf6Var.S();
            a aVar2 = hf6Var.t().o0;
            if (aVar2 != null) {
                aVar2.D = false;
            }
            Integer num = (Integer) cf6Var.i.get(eiVar);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            this.M.h(iIntValue, eiVar);
            return iIntValue;
        }
    }

    static {
        np npVar = new np();
        npVar.f(uh1.f);
        npVar.o(1.0f);
        npVar.p(1);
        p0 = npVar;
    }

    public fd5(qr5 qr5Var) {
        super(qr5Var);
        m8a m8aVar = new m8a();
        m8aVar.w = 0;
        this.n0 = m8aVar;
        m8aVar.A = this;
        this.o0 = qr5Var.A != null ? new a(this) : null;
    }

    @Override // defpackage.pj5
    public final int A(int i) {
        dk5 dk5VarH = this.H.H();
        fl6 fl6VarA = dk5VarH.a();
        qr5 qr5Var = dk5VarH.a;
        return fl6VarA.e(qr5Var.Y.d, qr5Var.A(), i);
    }

    @Override // defpackage.pj5
    public final int C(int i) {
        dk5 dk5VarH = this.H.H();
        fl6 fl6VarA = dk5VarH.a();
        qr5 qr5Var = dk5VarH.a;
        return fl6VarA.a(qr5Var.Y.d, qr5Var.A(), i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mb7
    public final void D1(mb7.e eVar, long j, vy4 vy4Var, int i, boolean z) {
        int i2;
        boolean z2;
        qr5[] qr5VarArr;
        int i3;
        qr5 qr5Var;
        long jD;
        qr5 qr5Var2 = this.H;
        boolean z3 = false;
        if (eVar.f(qr5Var2)) {
            if (!e2(j)) {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(L0(j, f1())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = vy4Var.v;
                    k37<qr5> k37VarK = qr5Var2.K();
                    qr5VarArr = k37VarK.t;
                    i3 = k37VarK.v - 1;
                    while (i3 >= 0) {
                        qr5Var = qr5VarArr[i3];
                        if (qr5Var.j()) {
                            eVar.d(qr5Var, j, vy4Var, i2, z2);
                            jD = vy4Var.d();
                            if (m33.c(jD) >= 0.0f && m33.e(jD) && !m33.d(jD) && !eVar.e(vy4Var, qr5Var)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    vy4Var.v = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = vy4Var.v;
                k37<qr5> k37VarK2 = qr5Var2.K();
                qr5VarArr = k37VarK2.t;
                i3 = k37VarK2.v - 1;
                while (i3 >= 0) {
                    qr5Var = qr5VarArr[i3];
                    if (qr5Var.j()) {
                        eVar.d(qr5Var, j, vy4Var, i2, z2);
                        jD = vy4Var.d();
                        if (m33.c(jD) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                vy4Var.v = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = vy4Var.v;
            k37<qr5> k37VarK3 = qr5Var2.K();
            qr5VarArr = k37VarK3.t;
            i3 = k37VarK3.v - 1;
            while (i3 >= 0) {
                qr5Var = qr5VarArr[i3];
                if (qr5Var.j()) {
                    eVar.d(qr5Var, j, vy4Var, i2, z2);
                    jD = vy4Var.d();
                    if (m33.c(jD) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            vy4Var.v = i6;
        }
    }

    @Override // defpackage.cl6
    public final jz7 E(long j) {
        if (this.J) {
            a aVar = this.o0;
            aVar.getClass();
            j = aVar.w;
        }
        m0(j);
        qr5 qr5Var = this.H;
        k37<qr5> k37VarL = qr5Var.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5VarArr[i2].Z.p.E = qr5.f.v;
        }
        W1(qr5Var.P.d(this, qr5Var.A(), j));
        N1();
        return this;
    }

    @Override // defpackage.mb7
    public final void S1(n41 n41Var, ko4 ko4Var) {
        qr5 qr5Var = this.H;
        mn7 mn7VarA = ur5.a(qr5Var);
        k37<qr5> k37VarK = qr5Var.K();
        qr5[] qr5VarArr = k37VarK.t;
        int i = k37VarK.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var2 = qr5VarArr[i2];
            if (qr5Var2.j()) {
                qr5Var2.x(n41Var, ko4Var);
            }
        }
        if (mn7VarA.getShowLayoutBounds()) {
            long j = this.v;
            n41Var.s(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, p0);
        }
    }

    @Override // defpackage.mb7
    public final void V0() {
        if (this.o0 == null) {
            this.o0 = new a(this);
        }
    }

    @Override // defpackage.pj5
    public final int c0(int i) {
        dk5 dk5VarH = this.H.H();
        fl6 fl6VarA = dk5VarH.a();
        qr5 qr5Var = dk5VarH.a;
        return fl6VarA.i(qr5Var.Y.d, qr5Var.A(), i);
    }

    @Override // defpackage.mb7
    public final ff6 e1() {
        return this.o0;
    }

    @Override // defpackage.mb7
    public final ox6.c g1() {
        return this.n0;
    }

    @Override // defpackage.mb7, defpackage.jz7
    public final void i0(long j, float f, oh4<? super ro4, g2b> oh4Var) {
        super.i0(j, f, oh4Var);
        if (this.C) {
            return;
        }
        this.H.Z.p.s0();
    }

    @Override // defpackage.mb7, defpackage.jz7
    public final void k0(long j, float f, ko4 ko4Var) {
        super.k0(j, f, ko4Var);
        if (this.C) {
            return;
        }
        this.H.Z.p.s0();
    }

    @Override // defpackage.pj5
    public final int o(int i) {
        dk5 dk5VarH = this.H.H();
        fl6 fl6VarA = dk5VarH.a();
        qr5 qr5Var = dk5VarH.a;
        return fl6VarA.g(qr5Var.Y.d, qr5Var.A(), i);
    }

    @Override // defpackage.df6
    public final int p0(ei eiVar) {
        a aVar = this.o0;
        if (aVar != null) {
            return aVar.p0(eiVar);
        }
        el6 el6Var = this.H.Z.p;
        sr5 sr5Var = el6Var.R;
        if (!el6Var.F) {
            if (el6Var.y.d == qr5.d.t) {
                sr5Var.f = true;
                if (sr5Var.b) {
                    el6Var.P = true;
                    el6Var.Q = true;
                }
            } else {
                sr5Var.g = true;
            }
        }
        fd5 fd5VarT = el6Var.t();
        boolean z = fd5VarT.D;
        fd5VarT.D = true;
        el6Var.S();
        fd5VarT.D = z;
        Integer num = (Integer) sr5Var.i.get(eiVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
