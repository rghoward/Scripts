package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hf6 extends jz7 implements cl6, hi, ty6 {
    public boolean D;
    public boolean E;
    public boolean F;
    public xx1 G;
    public oh4<? super ro4, g2b> I;
    public ko4 J;
    public boolean O;
    public Object R;
    public boolean V;
    public final vr5 y;
    public boolean z;
    public int A = Integer.MAX_VALUE;
    public int B = Integer.MAX_VALUE;
    public qr5.f C = qr5.f.v;
    public long H = 0;
    public a K = a.v;
    public final cf6 L = new cf6(this);
    public final k37<hf6> M = new k37<>(new hf6[16]);
    public boolean N = true;
    public final b P = new b();
    public boolean Q = true;
    public long S = zx1.b(0, 0, 0, 0, 15);
    public final d T = new d();
    public final c U = new c();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final a v;
        public static final /* synthetic */ a[] w;

        static {
            a aVar = new a("IsPlacedInLookahead", 0);
            t = aVar;
            a aVar2 = new a("IsPlacedInApproach", 1);
            u = aVar2;
            a aVar3 = new a("IsNotPlaced", 2);
            v = aVar3;
            w = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) w.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements mh4<g2b> {
        public b() {
            super(0);
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            hf6 hf6Var = hf6.this;
            vr5 vr5Var = hf6Var.y;
            vr5Var.h = 0;
            k37<qr5> k37VarL = vr5Var.a.L();
            qr5[] qr5VarArr = k37VarL.t;
            int i = k37VarL.v;
            for (int i2 = 0; i2 < i; i2++) {
                hf6 hf6Var2 = qr5VarArr[i2].Z.q;
                hf6Var2.getClass();
                hf6Var2.A = hf6Var2.B;
                hf6Var2.B = Integer.MAX_VALUE;
                if (hf6Var2.C == qr5.f.u) {
                    hf6Var2.C = qr5.f.v;
                }
            }
            qr5 qr5Var = vr5Var.a;
            qr5 qr5Var2 = vr5Var.a;
            k37<qr5> k37VarL2 = qr5Var.L();
            qr5[] qr5VarArr2 = k37VarL2.t;
            int i3 = k37VarL2.v;
            for (int i4 = 0; i4 < i3; i4++) {
                hf6 hf6Var3 = qr5VarArr2[i4].Z.q;
                hf6Var3.getClass();
                hf6Var3.L.d = false;
                g2b g2bVar = g2b.a;
            }
            fd5.a aVar = hf6Var.t().o0;
            if (aVar != null) {
                boolean z = aVar.D;
                k37.a aVar2 = (k37.a) qr5Var2.B();
                int i5 = aVar2.t.v;
                for (int i6 = 0; i6 < i5; i6++) {
                    ff6 ff6VarE1 = ((qr5) aVar2.get(i6)).Y.d.e1();
                    if (ff6VarE1 != null) {
                        ff6VarE1.D = z;
                    }
                }
            }
            fd5.a aVar3 = hf6Var.t().o0;
            aVar3.getClass();
            aVar3.v0().m();
            if (hf6Var.t().o0 != null) {
                k37.a aVar4 = (k37.a) qr5Var2.B();
                int i7 = aVar4.t.v;
                for (int i8 = 0; i8 < i7; i8++) {
                    ff6 ff6VarE2 = ((qr5) aVar4.get(i8)).Y.d.e1();
                    if (ff6VarE2 != null) {
                        ff6VarE2.D = false;
                    }
                }
            }
            k37<qr5> k37VarL3 = qr5Var2.L();
            qr5[] qr5VarArr3 = k37VarL3.t;
            int i9 = k37VarL3.v;
            for (int i10 = 0; i10 < i9; i10++) {
                hf6 hf6Var4 = qr5VarArr3[i10].Z.q;
                hf6Var4.getClass();
                int i11 = hf6Var4.A;
                int i12 = hf6Var4.B;
                if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                    hf6Var4.p0(true);
                }
            }
            k37<qr5> k37VarL4 = qr5Var2.L();
            qr5[] qr5VarArr4 = k37VarL4.t;
            int i13 = k37VarL4.v;
            for (int i14 = 0; i14 < i13; i14++) {
                hf6 hf6Var5 = qr5VarArr4[i14].Z.q;
                hf6Var5.getClass();
                cf6 cf6Var = hf6Var5.L;
                cf6Var.e = cf6Var.d;
                g2b g2bVar2 = g2b.a;
            }
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
            ff6 ff6VarE1;
            hf6 hf6Var = hf6.this;
            vr5 vr5Var = hf6Var.y;
            jz7.a placementScope = null;
            if (x10.d(vr5Var.a) || vr5Var.c) {
                mb7 mb7Var = vr5Var.a().L;
                if (mb7Var != null) {
                    placementScope = mb7Var.E;
                }
            } else {
                mb7 mb7Var2 = vr5Var.a().L;
                if (mb7Var2 != null && (ff6VarE1 = mb7Var2.e1()) != null) {
                    placementScope = ff6VarE1.E;
                }
            }
            if (placementScope == null) {
                placementScope = ur5.a(vr5Var.a).getPlacementScope();
            }
            ff6 ff6VarE2 = vr5Var.a().e1();
            ff6VarE2.getClass();
            jz7.a.q(placementScope, ff6VarE2, hf6Var.H);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements mh4<g2b> {
        public d() {
            super(0);
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            hf6 hf6Var = hf6.this;
            ff6 ff6VarE1 = hf6Var.y.a().e1();
            ff6VarE1.getClass();
            ff6VarE1.E(hf6Var.S);
            return g2b.a;
        }
    }

    public hf6(vr5 vr5Var) {
        this.y = vr5Var;
        this.R = vr5Var.p.L;
    }

    @Override // defpackage.pj5
    public final int A(int i) {
        s0();
        ff6 ff6VarE1 = this.y.a().e1();
        ff6VarE1.getClass();
        return ff6VarE1.A(i);
    }

    @Override // defpackage.hi
    public final int B() {
        return this.B;
    }

    @Override // defpackage.pj5
    public final int C(int i) {
        s0();
        ff6 ff6VarE1 = this.y.a().e1();
        ff6VarE1.getClass();
        return ff6VarE1.C(i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Override // defpackage.cl6
    public final jz7 E(long j) {
        qr5.f fVar;
        vr5 vr5Var = this.y;
        qr5 qr5Var = vr5Var.a;
        qr5 qr5Var2 = vr5Var.a;
        qr5 qr5VarI = qr5Var.I();
        if ((qr5VarI != null ? qr5VarI.Z.d : null) == qr5.d.u) {
            vr5Var.b = false;
        } else {
            qr5 qr5VarI2 = qr5Var2.I();
            if ((qr5VarI2 != null ? qr5VarI2.Z.d : null) == qr5.d.w) {
                vr5Var.b = false;
            }
        }
        qr5 qr5VarI3 = qr5Var2.I();
        qr5.f fVar2 = qr5.f.v;
        if (qr5VarI3 != null) {
            vr5 vr5Var2 = qr5VarI3.Z;
            if (this.C != fVar2 && !qr5Var2.X) {
                uc5.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = vr5Var2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fVar = qr5.f.t;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    v92.b(vr5Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                fVar = qr5.f.u;
            }
            this.C = fVar;
        } else {
            this.C = fVar2;
        }
        if (qr5Var2.V == fVar2) {
            qr5Var2.o();
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
            hf6 hf6Var = qr5VarArr[i2].Z.q;
            hf6Var.getClass();
            aVar.invoke(hf6Var);
        }
    }

    @Override // defpackage.ty6
    public final void M(boolean z) {
        ff6 ff6VarE1;
        vr5 vr5Var = this.y;
        ff6 ff6VarE2 = vr5Var.a().e1();
        if (Boolean.valueOf(z).equals(ff6VarE2 != null ? Boolean.valueOf(ff6VarE2.B) : null) || (ff6VarE1 = vr5Var.a().e1()) == null) {
            return;
        }
        ff6VarE1.B = z;
    }

    @Override // defpackage.kl6
    public final int R(ei eiVar) {
        vr5 vr5Var = this.y;
        qr5 qr5VarI = vr5Var.a.I();
        qr5.d dVar = qr5VarI != null ? qr5VarI.Z.d : null;
        qr5.d dVar2 = qr5.d.u;
        cf6 cf6Var = this.L;
        if (dVar == dVar2) {
            cf6Var.c = true;
        } else {
            qr5 qr5VarI2 = vr5Var.a.I();
            if ((qr5VarI2 != null ? qr5VarI2.Z.d : null) == qr5.d.w) {
                cf6Var.d = true;
            }
        }
        this.D = true;
        ff6 ff6VarE1 = vr5Var.a().e1();
        ff6VarE1.getClass();
        int iR = ff6VarE1.R(eiVar);
        this.D = false;
        return iR;
    }

    @Override // defpackage.hi
    public final void S() {
        this.O = true;
        cf6 cf6Var = this.L;
        cf6Var.i();
        vr5 vr5Var = this.y;
        boolean z = vr5Var.f;
        qr5 qr5Var = vr5Var.a;
        if (z) {
            k37<qr5> k37VarL = qr5Var.L();
            qr5[] qr5VarArr = k37VarL.t;
            int i = k37VarL.v;
            for (int i2 = 0; i2 < i; i2++) {
                qr5 qr5Var2 = qr5VarArr[i2];
                vr5 vr5Var2 = qr5Var2.Z;
                if (vr5Var2.e && qr5Var2.G() == qr5.f.t) {
                    hf6 hf6Var = vr5Var2.q;
                    hf6Var.getClass();
                    hf6 hf6Var2 = vr5Var2.q;
                    xx1 xx1Var = hf6Var2 != null ? hf6Var2.G : null;
                    xx1Var.getClass();
                    if (hf6Var.x0(xx1Var.a)) {
                        qr5.e0(qr5Var, false, 7);
                    }
                }
            }
        }
        fd5.a aVar = t().o0;
        aVar.getClass();
        if (vr5Var.g || (!this.D && !aVar.D && vr5Var.f)) {
            vr5Var.f = false;
            qr5.d dVar = vr5Var.d;
            vr5Var.d = qr5.d.w;
            vr5Var.i(false);
            un7 snapshotObserver = ur5.a(qr5Var).getSnapshotObserver();
            snapshotObserver.a.d(qr5Var, snapshotObserver.h, this.P);
            vr5Var.d = dVar;
            if (vr5Var.m && aVar.D) {
                requestLayout();
            }
            vr5Var.g = false;
        }
        if (cf6Var.d) {
            cf6Var.e = true;
        }
        if (cf6Var.b && cf6Var.f()) {
            cf6Var.h();
        }
        this.O = false;
    }

    @Override // defpackage.hi
    public final void b0() {
        qr5.e0(this.y.a, false, 7);
    }

    @Override // defpackage.pj5
    public final int c0(int i) {
        s0();
        ff6 ff6VarE1 = this.y.a().e1();
        ff6VarE1.getClass();
        return ff6VarE1.c0(i);
    }

    @Override // defpackage.jz7
    public final int f0() {
        ff6 ff6VarE1 = this.y.a().e1();
        ff6VarE1.getClass();
        return ff6VarE1.f0();
    }

    @Override // defpackage.kl6, defpackage.pj5
    public final Object g() {
        return this.R;
    }

    @Override // defpackage.jz7
    public final int g0() {
        ff6 ff6VarE1 = this.y.a().e1();
        ff6VarE1.getClass();
        return ff6VarE1.g0();
    }

    @Override // defpackage.jz7
    public final void i0(long j, float f, oh4<? super ro4, g2b> oh4Var) {
        v0(j, oh4Var, null);
    }

    @Override // defpackage.jz7
    public final void k0(long j, float f, ko4 ko4Var) {
        v0(j, null, ko4Var);
    }

    @Override // defpackage.hi
    public final gi l() {
        return this.L;
    }

    public final boolean n0() {
        vr5 vr5Var = this.y;
        return x10.d(vr5Var.a) || vr5Var.c;
    }

    @Override // defpackage.pj5
    public final int o(int i) {
        s0();
        ff6 ff6VarE1 = this.y.a().e1();
        ff6VarE1.getClass();
        return ff6VarE1.o(i);
    }

    public final void p0(boolean z) {
        if (z && n0()) {
            return;
        }
        if (z || n0()) {
            this.K = a.v;
            k37<qr5> k37VarL = this.y.a.L();
            qr5[] qr5VarArr = k37VarL.t;
            int i = k37VarL.v;
            for (int i2 = 0; i2 < i; i2++) {
                hf6 hf6Var = qr5VarArr[i2].Z.q;
                hf6Var.getClass();
                hf6Var.p0(true);
            }
        }
    }

    public final void q0() {
        a aVar = this.K;
        vr5 vr5Var = this.y;
        boolean z = vr5Var.c;
        qr5 qr5Var = vr5Var.a;
        a aVar2 = a.t;
        if (z) {
            this.K = a.u;
        } else {
            this.K = aVar2;
        }
        if (aVar != aVar2 && vr5Var.e) {
            qr5.e0(qr5Var, true, 6);
        }
        k37<qr5> k37VarL = qr5Var.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var2 = qr5VarArr[i2];
            hf6 hf6Var = qr5Var2.Z.q;
            if (hf6Var == null) {
                z90.a("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (hf6Var.B != Integer.MAX_VALUE) {
                hf6Var.q0();
                qr5.h0(qr5Var2);
            }
        }
    }

    public final void r0() {
        vr5 vr5Var = this.y;
        if (vr5Var.o > 0) {
            k37<qr5> k37VarL = vr5Var.a.L();
            qr5[] qr5VarArr = k37VarL.t;
            int i = k37VarL.v;
            for (int i2 = 0; i2 < i; i2++) {
                qr5 qr5Var = qr5VarArr[i2];
                vr5 vr5Var2 = qr5Var.Z;
                if ((vr5Var2.m || vr5Var2.n) && !vr5Var2.f) {
                    qr5Var.d0(false);
                }
                hf6 hf6Var = vr5Var2.q;
                if (hf6Var != null) {
                    hf6Var.r0();
                }
            }
        }
    }

    @Override // defpackage.hi
    public final void requestLayout() {
        this.y.a.d0(false);
    }

    public final void s0() {
        qr5.f fVar;
        vr5 vr5Var = this.y;
        qr5.e0(vr5Var.a, false, 7);
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
    public final fd5 t() {
        return this.y.a.Y.c;
    }

    public final void t0() {
        qr5.d dVar;
        this.V = true;
        vr5 vr5Var = this.y;
        qr5 qr5VarI = vr5Var.a.I();
        a aVar = this.K;
        if ((aVar != a.t && !vr5Var.c) || (aVar != a.u && vr5Var.c)) {
            q0();
            if (this.z && qr5VarI != null) {
                qr5VarI.d0(false);
            }
        }
        if (qr5VarI != null) {
            vr5 vr5Var2 = qr5VarI.Z;
            if (!this.z && ((dVar = vr5Var2.d) == qr5.d.v || dVar == qr5.d.w)) {
                if (this.B != Integer.MAX_VALUE) {
                    uc5.b("Place was called on a node which was placed already");
                }
                int i = vr5Var2.h;
                this.B = i;
                vr5Var2.h = i + 1;
            }
        } else {
            this.B = 0;
        }
        S();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001e, B:14:0x0022, B:15:0x0027, B:17:0x0036, B:19:0x003a, B:22:0x0040, B:21:0x003e, B:23:0x0043, B:25:0x004d, B:30:0x0057, B:32:0x0083, B:31:0x006f), top: B:36:0x0007 }] */
    public final void v0(long j, oh4 oh4Var, ko4 ko4Var) {
        vr5 vr5Var = this.y;
        qr5 qr5Var = vr5Var.a;
        qr5 qr5Var2 = vr5Var.a;
        try {
            qr5 qr5VarI = qr5Var.I();
            qr5.d dVar = qr5VarI != null ? qr5VarI.Z.d : null;
            qr5.d dVar2 = qr5.d.w;
            if (dVar == dVar2) {
                vr5Var.c = false;
            }
            if (qr5Var2.j0) {
                uc5.a("place is called on a deactivated node");
            }
            vr5Var.d = dVar2;
            boolean z = true;
            this.E = true;
            this.V = false;
            if (!bg5.b(j, this.H)) {
                if (vr5Var.n || vr5Var.m) {
                    vr5Var.f = true;
                }
                r0();
            }
            mn7 mn7VarA = ur5.a(qr5Var2);
            this.H = j;
            if (vr5Var.f) {
                vr5Var.h(false);
                this.L.g = false;
                un7 snapshotObserver = mn7VarA.getSnapshotObserver();
                snapshotObserver.a.d(qr5Var2, snapshotObserver.g, this.U);
            } else {
                if (this.K == a.v) {
                    z = false;
                }
                if (z) {
                    ff6 ff6VarE1 = vr5Var.a().e1();
                    ff6VarE1.getClass();
                    ff6VarE1.L0(bg5.d(j, ff6VarE1.x));
                    t0();
                } else {
                    vr5Var.h(false);
                    this.L.g = false;
                    un7 snapshotObserver2 = mn7VarA.getSnapshotObserver();
                    snapshotObserver2.a.d(qr5Var2, snapshotObserver2.g, this.U);
                }
            }
            this.I = oh4Var;
            this.J = ko4Var;
            vr5Var.d = qr5.d.x;
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
        return vr5Var.q;
    }

    public final boolean x0(long j) {
        vr5 vr5Var = this.y;
        qr5 qr5Var = vr5Var.a;
        qr5 qr5Var2 = vr5Var.a;
        try {
            if (qr5Var.j0) {
                uc5.a("measure is called on a deactivated node");
            }
            qr5 qr5VarI = qr5Var2.I();
            qr5Var2.X = qr5Var2.X || (qr5VarI != null && qr5VarI.X);
            if (!qr5Var2.Z.e) {
                xx1 xx1Var = this.G;
                if (xx1Var == null ? false : xx1.b(xx1Var.a, j)) {
                    mn7 mn7Var = qr5Var2.G;
                    if (mn7Var != null) {
                        mn7Var.B(qr5Var2, true);
                    }
                    qr5Var2.i0();
                    return false;
                }
            }
            this.G = new xx1(j);
            m0(j);
            this.L.f = false;
            k37<qr5> k37VarL = qr5Var2.L();
            qr5[] qr5VarArr = k37VarL.t;
            int i = k37VarL.v;
            for (int i2 = 0; i2 < i; i2++) {
                hf6 hf6Var = qr5VarArr[i2].Z.q;
                hf6Var.getClass();
                hf6Var.L.c = false;
                g2b g2bVar = g2b.a;
            }
            long j2 = this.F ? this.v : -9223372034707292160L;
            this.F = true;
            ff6 ff6VarE1 = vr5Var.a().e1();
            if (ff6VarE1 == null) {
                uc5.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            vr5Var.c(j);
            l0((((long) ff6VarE1.t) << 32) | (((long) ff6VarE1.u) & 4294967295L));
            return (((int) (j2 >> 32)) == ff6VarE1.t && ((int) (j2 & 4294967295L)) == ff6VarE1.u) ? false : true;
        } catch (Throwable th) {
            qr5Var.j0(th);
            throw null;
        }
    }
}
