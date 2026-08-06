package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class el6 extends jz7 implements cl6, hi, ty6 {
    public boolean C;
    public boolean D;
    public boolean F;
    public oh4<? super ro4, g2b> H;
    public ko4 I;
    public float J;
    public Object L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean U;
    public float Y;
    public boolean Z;
    public oh4<? super ro4, g2b> a0;
    public ko4 b0;
    public float d0;
    public boolean f0;
    public final vr5 y;
    public boolean z;
    public int A = Integer.MAX_VALUE;
    public int B = Integer.MAX_VALUE;
    public qr5.f E = qr5.f.v;
    public long G = 0;
    public boolean K = true;
    public final sr5 R = new sr5(this);
    public final k37<el6> S = new k37<>(new el6[16]);
    public boolean T = true;
    public long V = zx1.b(0, 0, 0, 0, 15);
    public final b W = new b();
    public final a X = new a();
    public long c0 = 0;
    public final c e0 = new c();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<g2b> {
        public a() {
            super(0);
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            el6 el6Var = el6.this;
            vr5 vr5Var = el6Var.y;
            vr5Var.i = 0;
            k37<qr5> k37VarL = vr5Var.a.L();
            qr5[] qr5VarArr = k37VarL.t;
            int i = k37VarL.v;
            for (int i2 = 0; i2 < i; i2++) {
                el6 el6Var2 = qr5VarArr[i2].Z.p;
                el6Var2.A = el6Var2.B;
                el6Var2.B = Integer.MAX_VALUE;
                el6Var2.N = false;
                if (el6Var2.E == qr5.f.u) {
                    el6Var2.E = qr5.f.v;
                }
            }
            qr5 qr5Var = vr5Var.a;
            qr5 qr5Var2 = vr5Var.a;
            k37<qr5> k37VarL2 = qr5Var.L();
            qr5[] qr5VarArr2 = k37VarL2.t;
            int i3 = k37VarL2.v;
            for (int i4 = 0; i4 < i3; i4++) {
                qr5VarArr2[i4].Z.p.R.d = false;
                g2b g2bVar = g2b.a;
            }
            if (el6Var.t().D) {
                k37.a aVar = (k37.a) qr5Var2.B();
                int i5 = aVar.t.v;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((qr5) aVar.get(i6)).Y.d.D = true;
                }
            }
            el6Var.t().v0().m();
            if (el6Var.t().D) {
                k37.a aVar2 = (k37.a) qr5Var2.B();
                int i7 = aVar2.t.v;
                for (int i8 = 0; i8 < i7; i8++) {
                    ((qr5) aVar2.get(i8)).Y.d.D = false;
                }
            }
            k37<qr5> k37VarL3 = qr5Var2.L();
            qr5[] qr5VarArr3 = k37VarL3.t;
            int i9 = k37VarL3.v;
            for (int i10 = 0; i10 < i9; i10++) {
                qr5 qr5Var3 = qr5VarArr3[i10];
                vr5 vr5Var2 = qr5Var3.Z;
                if (vr5Var2.p.A != qr5Var3.J()) {
                    qr5Var2.Z();
                    qr5Var2.O();
                    if (qr5Var3.J() == Integer.MAX_VALUE) {
                        if (vr5Var2.c || x10.d(qr5Var3)) {
                            hf6 hf6Var = vr5Var2.q;
                            hf6Var.getClass();
                            hf6Var.p0(false);
                        }
                        vr5Var2.p.q0();
                    }
                }
            }
            k37<qr5> k37VarL4 = qr5Var2.L();
            qr5[] qr5VarArr4 = k37VarL4.t;
            int i11 = k37VarL4.v;
            for (int i12 = 0; i12 < i11; i12++) {
                sr5 sr5Var = qr5VarArr4[i12].Z.p.R;
                sr5Var.e = sr5Var.d;
                g2b g2bVar2 = g2b.a;
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements mh4<g2b> {
        public b() {
            super(0);
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            el6 el6Var = el6.this;
            el6Var.y.a().E(el6Var.V);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements mh4<g2b> {
        public c() {
            super(0);
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            jz7.a placementScope;
            el6 el6Var = el6.this;
            vr5 vr5Var = el6Var.y;
            mb7 mb7Var = vr5Var.a().L;
            if (mb7Var == null || (placementScope = mb7Var.E) == null) {
                placementScope = ur5.a(vr5Var.a).getPlacementScope();
            }
            oh4<? super ro4, g2b> oh4Var = el6Var.a0;
            ko4 ko4Var = el6Var.b0;
            if (ko4Var != null) {
                mb7 mb7VarA = vr5Var.a();
                long j = el6Var.c0;
                float f = el6Var.d0;
                placementScope.getClass();
                jz7.a.e(mb7VarA, placementScope);
                mb7VarA.k0(bg5.d(j, mb7VarA.x), f, ko4Var);
            } else if (oh4Var == null) {
                mb7 mb7VarA2 = vr5Var.a();
                long j2 = el6Var.c0;
                float f2 = el6Var.d0;
                placementScope.getClass();
                jz7.a.e(mb7VarA2, placementScope);
                mb7VarA2.i0(bg5.d(j2, mb7VarA2.x), f2, null);
            } else {
                mb7 mb7VarA3 = vr5Var.a();
                long j3 = el6Var.c0;
                float f3 = el6Var.d0;
                placementScope.getClass();
                jz7.a.e(mb7VarA3, placementScope);
                mb7VarA3.i0(bg5.d(j3, mb7VarA3.x), f3, oh4Var);
            }
            return g2b.a;
        }
    }

    public el6(vr5 vr5Var) {
        this.y = vr5Var;
    }

    @Override // defpackage.pj5
    public final int A(int i) {
        vr5 vr5Var = this.y;
        if (!x10.d(vr5Var.a)) {
            r0();
            return vr5Var.a().A(i);
        }
        hf6 hf6Var = vr5Var.q;
        hf6Var.getClass();
        return hf6Var.A(i);
    }

    @Override // defpackage.hi
    public final int B() {
        return this.B;
    }

    @Override // defpackage.pj5
    public final int C(int i) {
        vr5 vr5Var = this.y;
        if (!x10.d(vr5Var.a)) {
            r0();
            return vr5Var.a().C(i);
        }
        hf6 hf6Var = vr5Var.q;
        hf6Var.getClass();
        return hf6Var.C(i);
    }

    @Override // defpackage.cl6
    public final jz7 E(long j) {
        qr5.f fVar;
        vr5 vr5Var = this.y;
        qr5 qr5Var = vr5Var.a;
        qr5 qr5Var2 = vr5Var.a;
        qr5.f fVar2 = qr5Var.V;
        qr5.f fVar3 = qr5.f.v;
        if (fVar2 == fVar3) {
            qr5Var.o();
        }
        if (x10.d(qr5Var2)) {
            hf6 hf6Var = vr5Var.q;
            hf6Var.getClass();
            hf6Var.C = fVar3;
            hf6Var.E(j);
        }
        qr5 qr5VarI = qr5Var2.I();
        if (qr5VarI != null) {
            vr5 vr5Var2 = qr5VarI.Z;
            if (this.E != fVar3 && !qr5Var2.X) {
                uc5.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = vr5Var2.d.ordinal();
            if (iOrdinal == 0) {
                fVar = qr5.f.t;
            } else {
                if (iOrdinal != 2) {
                    v92.b(vr5Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                fVar = qr5.f.u;
            }
            this.E = fVar;
        } else {
            this.E = fVar3;
        }
        x0(j);
        return this;
    }

    @Override // defpackage.hi
    public final void J(gi.a aVar) {
        k37<qr5> k37VarL = this.y.a.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            aVar.invoke(qr5VarArr[i2].Z.p);
        }
    }

    @Override // defpackage.ty6
    public final void M(boolean z) {
        vr5 vr5Var = this.y;
        if (z != vr5Var.a().B) {
            vr5Var.a().B = z;
            this.f0 = true;
        }
    }

    @Override // defpackage.kl6
    public final int R(ei eiVar) {
        vr5 vr5Var = this.y;
        qr5 qr5VarI = vr5Var.a.I();
        qr5.d dVar = qr5VarI != null ? qr5VarI.Z.d : null;
        qr5.d dVar2 = qr5.d.t;
        sr5 sr5Var = this.R;
        if (dVar == dVar2) {
            sr5Var.c = true;
        } else {
            qr5 qr5VarI2 = vr5Var.a.I();
            if ((qr5VarI2 != null ? qr5VarI2.Z.d : null) == qr5.d.v) {
                sr5Var.d = true;
            }
        }
        this.F = true;
        int iR = vr5Var.a().R(eiVar);
        this.F = false;
        return iR;
    }

    @Override // defpackage.hi
    public final void S() {
        boolean zX0;
        this.U = true;
        sr5 sr5Var = this.R;
        sr5Var.i();
        boolean z = this.P;
        vr5 vr5Var = this.y;
        if (z) {
            k37<qr5> k37VarL = vr5Var.a.L();
            qr5[] qr5VarArr = k37VarL.t;
            int i = k37VarL.v;
            for (int i2 = 0; i2 < i; i2++) {
                qr5 qr5Var = qr5VarArr[i2];
                boolean zE = qr5Var.E();
                vr5 vr5Var2 = qr5Var.Z;
                if (zE && qr5Var.F() == qr5.f.t) {
                    el6 el6Var = vr5Var2.p;
                    xx1 xx1Var = el6Var.C ? new xx1(el6Var.w) : null;
                    if (xx1Var != null) {
                        if (qr5Var.V == qr5.f.v) {
                            qr5Var.o();
                        }
                        zX0 = vr5Var2.p.x0(xx1Var.a);
                    } else {
                        zX0 = false;
                    }
                    if (zX0) {
                        qr5.g0(vr5Var.a, false, 7);
                    }
                }
            }
        }
        if (this.Q || (!this.F && !t().D && this.P)) {
            this.P = false;
            qr5.d dVar = vr5Var.d;
            vr5Var.d = qr5.d.v;
            vr5Var.g(false);
            qr5 qr5Var2 = vr5Var.a;
            un7 snapshotObserver = ur5.a(qr5Var2).getSnapshotObserver();
            snapshotObserver.a.d(qr5Var2, snapshotObserver.e, this.X);
            vr5Var.d = dVar;
            this.Q = false;
        }
        if (sr5Var.d) {
            sr5Var.e = true;
        }
        if (sr5Var.b && sr5Var.f()) {
            sr5Var.h();
        }
        this.U = false;
    }

    @Override // defpackage.hi
    public final void b0() {
        qr5.g0(this.y.a, false, 7);
    }

    @Override // defpackage.pj5
    public final int c0(int i) {
        vr5 vr5Var = this.y;
        if (!x10.d(vr5Var.a)) {
            r0();
            return vr5Var.a().c0(i);
        }
        hf6 hf6Var = vr5Var.q;
        hf6Var.getClass();
        return hf6Var.c0(i);
    }

    @Override // defpackage.jz7
    public final int f0() {
        return this.y.a().f0();
    }

    @Override // defpackage.kl6, defpackage.pj5
    public final Object g() {
        return this.L;
    }

    @Override // defpackage.jz7
    public final int g0() {
        return this.y.a().g0();
    }

    @Override // defpackage.jz7
    public final void i0(long j, float f, oh4<? super ro4, g2b> oh4Var) {
        v0(j, f, oh4Var, null);
    }

    @Override // defpackage.jz7
    public final void k0(long j, float f, ko4 ko4Var) {
        v0(j, f, null, ko4Var);
    }

    @Override // defpackage.hi
    public final gi l() {
        return this.R;
    }

    public final List<el6> n0() {
        vr5 vr5Var = this.y;
        vr5Var.a.o0();
        boolean z = this.T;
        k37<el6> k37Var = this.S;
        if (!z) {
            return k37Var.j();
        }
        qr5 qr5Var = vr5Var.a;
        k37<qr5> k37VarL = qr5Var.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var2 = qr5VarArr[i2];
            if (k37Var.v <= i2) {
                k37Var.d(qr5Var2.Z.p);
            } else {
                el6 el6Var = qr5Var2.Z.p;
                el6[] el6VarArr = k37Var.t;
                el6 el6Var2 = el6VarArr[i2];
                el6VarArr[i2] = el6Var;
            }
        }
        k37Var.p(((k37.a) qr5Var.B()).t.v, k37Var.v);
        this.T = false;
        return k37Var.j();
    }

    @Override // defpackage.pj5
    public final int o(int i) {
        vr5 vr5Var = this.y;
        if (!x10.d(vr5Var.a)) {
            r0();
            return vr5Var.a().o(i);
        }
        hf6 hf6Var = vr5Var.q;
        hf6Var.getClass();
        return hf6Var.o(i);
    }

    public final void p0() {
        boolean z = this.M;
        this.M = true;
        vr5 vr5Var = this.y;
        qr5 qr5Var = vr5Var.a;
        kb7 kb7Var = qr5Var.Y;
        if (!z) {
            kb7Var.c.O1();
            ur5.a(qr5Var).getRectManager().e(vr5Var.a);
            if (qr5Var.E()) {
                qr5.g0(qr5Var, true, 6);
            } else if (qr5Var.Z.e) {
                qr5.e0(qr5Var, true, 6);
            }
        }
        mb7 mb7Var = kb7Var.c.K;
        for (mb7 mb7Var2 = kb7Var.d; !xj5.a(mb7Var2, mb7Var) && mb7Var2 != null; mb7Var2 = mb7Var2.K) {
            if (mb7Var2.f0) {
                mb7Var2.E1();
            }
        }
        k37<qr5> k37VarL = qr5Var.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var2 = qr5VarArr[i2];
            if (qr5Var2.J() != Integer.MAX_VALUE) {
                qr5Var2.Z.p.p0();
                qr5.h0(qr5Var2);
            }
        }
    }

    public final void q0() {
        if (this.M) {
            this.M = false;
            vr5 vr5Var = this.y;
            qr5 qr5Var = vr5Var.a;
            qr5 qr5Var2 = vr5Var.a;
            ur5.a(qr5Var).getRectManager().f(qr5Var2);
            kb7 kb7Var = qr5Var2.Y;
            mb7 mb7Var = kb7Var.c.K;
            for (mb7 mb7Var2 = kb7Var.d; !xj5.a(mb7Var2, mb7Var) && mb7Var2 != null; mb7Var2 = mb7Var2.K) {
                mb7Var2.Q1();
                mb7Var2.V1();
            }
            k37<qr5> k37VarL = qr5Var2.L();
            qr5[] qr5VarArr = k37VarL.t;
            int i = k37VarL.v;
            for (int i2 = 0; i2 < i; i2++) {
                qr5VarArr[i2].Z.p.q0();
            }
        }
    }

    public final void r0() {
        qr5.f fVar;
        vr5 vr5Var = this.y;
        qr5.g0(vr5Var.a, false, 7);
        qr5 qr5Var = vr5Var.a;
        qr5 qr5VarI = qr5Var.I();
        if (qr5VarI == null || qr5Var.V != qr5.f.v) {
            return;
        }
        int iOrdinal = qr5VarI.Z.d.ordinal();
        if (iOrdinal != 0) {
            fVar = iOrdinal != 2 ? qr5VarI.V : qr5.f.u;
        } else {
            fVar = qr5.f.t;
        }
        qr5Var.V = fVar;
    }

    @Override // defpackage.hi
    public final void requestLayout() {
        this.y.a.f0(false);
    }

    public final void s0() {
        this.Z = true;
        vr5 vr5Var = this.y;
        qr5 qr5VarI = vr5Var.a.I();
        float f = t().V;
        qr5 qr5Var = vr5Var.a;
        kb7 kb7Var = qr5Var.Y;
        mb7 mb7Var = kb7Var.d;
        fd5 fd5Var = kb7Var.c;
        while (mb7Var != fd5Var) {
            mb7Var.getClass();
            mr5 mr5Var = (mr5) mb7Var;
            f += mr5Var.V;
            mb7Var = mr5Var.K;
        }
        if (f != this.Y) {
            this.Y = f;
            if (qr5VarI != null) {
                qr5VarI.Z();
            }
            if (qr5VarI != null) {
                qr5VarI.O();
            }
        }
        if (!t().D) {
            boolean z = this.M;
            if (!z || this.R.e()) {
                p0();
            }
            if (z) {
                qr5Var.Y.c.O1();
            } else {
                if (qr5VarI != null) {
                    qr5VarI.O();
                }
                if (this.z && qr5VarI != null) {
                    qr5VarI.f0(false);
                }
            }
        }
        if (qr5VarI != null) {
            vr5 vr5Var2 = qr5VarI.Z;
            if (!this.z && vr5Var2.d == qr5.d.v) {
                if (this.B != Integer.MAX_VALUE) {
                    uc5.b("Place was called on a node which was placed already");
                }
                int i = vr5Var2.i;
                this.B = i;
                vr5Var2.i = i + 1;
            }
        } else {
            this.B = 0;
        }
        S();
    }

    @Override // defpackage.hi
    public final fd5 t() {
        return this.y.a.Y.c;
    }

    public final void t0(long j, float f, oh4<? super ro4, g2b> oh4Var, ko4 ko4Var) {
        vr5 vr5Var = this.y;
        qr5 qr5Var = vr5Var.a;
        qr5 qr5Var2 = vr5Var.a;
        if (qr5Var.j0) {
            uc5.a("place is called on a deactivated node");
        }
        vr5Var.d = qr5.d.v;
        this.G = j;
        this.J = f;
        this.H = oh4Var;
        this.I = ko4Var;
        this.Z = false;
        mn7 mn7VarA = ur5.a(qr5Var2);
        if (this.P || !this.M) {
            this.R.g = false;
            vr5Var.f(false);
            this.a0 = oh4Var;
            this.c0 = j;
            this.d0 = f;
            this.b0 = ko4Var;
            un7 snapshotObserver = mn7VarA.getSnapshotObserver();
            snapshotObserver.a.d(qr5Var2, snapshotObserver.f, this.e0);
        } else {
            mb7 mb7VarA = vr5Var.a();
            mb7VarA.T1(bg5.d(j, mb7VarA.x), f, oh4Var, ko4Var);
            s0();
        }
        vr5Var.d = qr5.d.x;
        if (vr5Var.a().D && (vr5Var.k || vr5Var.j)) {
            requestLayout();
        }
        this.D = true;
    }

    public final void v0(long j, float f, oh4<? super ro4, g2b> oh4Var, ko4 ko4Var) {
        jz7.a placementScope;
        vr5 vr5Var = this.y;
        qr5 qr5Var = vr5Var.a;
        qr5 qr5Var2 = vr5Var.a;
        try {
            this.N = true;
            if (!bg5.b(j, this.G) || oh4Var != this.H || this.f0) {
                if (vr5Var.k || vr5Var.j || this.f0) {
                    this.P = true;
                    this.f0 = false;
                }
            }
            hf6 hf6Var = vr5Var.q;
            if (hf6Var != null) {
                vr5 vr5Var2 = hf6Var.y;
                if (hf6Var.K == hf6.a.v && !x10.d(vr5Var2.a)) {
                    vr5Var2.c = true;
                }
            }
            hf6 hf6Var2 = vr5Var.q;
            if (hf6Var2 != null && hf6Var2.n0()) {
                mb7 mb7Var = vr5Var.a().L;
                if (mb7Var == null || (placementScope = mb7Var.E) == null) {
                    placementScope = ur5.a(qr5Var2).getPlacementScope();
                }
                hf6 hf6Var3 = vr5Var.q;
                hf6Var3.getClass();
                qr5 qr5VarI = qr5Var2.I();
                if (qr5VarI != null) {
                    qr5VarI.Z.h = 0;
                }
                hf6Var3.B = Integer.MAX_VALUE;
                placementScope.l(hf6Var3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            hf6 hf6Var4 = vr5Var.q;
            if (hf6Var4 != null && !hf6Var4.E) {
                uc5.b("Error: Placement happened before lookahead.");
            }
            t0(j, f, oh4Var, ko4Var);
            g2b g2bVar = g2b.a;
        } catch (Throwable th) {
            qr5Var.j0(th);
            throw null;
        }
    }

    @Override // defpackage.hi
    public final hi x() {
        vr5 vr5Var;
        qr5 qr5VarI = this.y.a.I();
        if (qr5VarI == null || (vr5Var = qr5VarI.Z) == null) {
            return null;
        }
        return vr5Var.p;
    }

    public final boolean x0(long j) {
        vr5 vr5Var = this.y;
        qr5 qr5Var = vr5Var.a;
        qr5 qr5Var2 = vr5Var.a;
        try {
            if (qr5Var.j0) {
                uc5.a("measure is called on a deactivated node");
            }
            mn7 mn7VarA = ur5.a(qr5Var2);
            qr5 qr5VarI = qr5Var2.I();
            boolean z = true;
            qr5Var2.X = qr5Var2.X || (qr5VarI != null && qr5VarI.X);
            if (!qr5Var2.E() && xx1.b(this.w, j)) {
                mn7VarA.B(qr5Var2, false);
                qr5Var2.i0();
                return false;
            }
            this.R.f = false;
            k37<qr5> k37VarL = qr5Var2.L();
            qr5[] qr5VarArr = k37VarL.t;
            int i = k37VarL.v;
            for (int i2 = 0; i2 < i; i2++) {
                qr5VarArr[i2].Z.p.R.c = false;
                g2b g2bVar = g2b.a;
            }
            this.C = true;
            long j2 = vr5Var.a().v;
            m0(j);
            qr5.d dVar = vr5Var.d;
            qr5.d dVar2 = qr5.d.x;
            if (dVar != dVar2) {
                uc5.b("layout state is not idle before measure starts");
            }
            this.V = j;
            qr5.d dVar3 = qr5.d.t;
            vr5Var.d = dVar3;
            this.O = false;
            un7 snapshotObserver = ur5.a(qr5Var2).getSnapshotObserver();
            snapshotObserver.a.d(qr5Var2, snapshotObserver.c, this.W);
            if (vr5Var.d == dVar3) {
                this.P = true;
                this.Q = true;
                vr5Var.d = dVar2;
            }
            if (kg5.b(vr5Var.a().v, j2) && vr5Var.a().t == this.t && vr5Var.a().u == this.u) {
                z = false;
            }
            l0((((long) vr5Var.a().u) & 4294967295L) | (((long) vr5Var.a().t) << 32));
            return z;
        } catch (Throwable th) {
            qr5Var.j0(th);
            throw null;
        }
    }

    public final void z0() {
        vr5 vr5Var = this.y;
        qr5 qr5Var = vr5Var.a;
        qr5 qr5Var2 = vr5Var.a;
        if (!qr5Var.j() || vr5Var.l <= 0) {
            return;
        }
        vr5 vr5Var2 = qr5Var2.Z;
        if ((vr5Var2.j || vr5Var2.k) && !vr5Var2.p.P) {
            qr5Var2.f0(false);
        }
        k37<qr5> k37VarL = qr5Var2.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5VarArr[i2].Z.p.z0();
        }
    }
}
