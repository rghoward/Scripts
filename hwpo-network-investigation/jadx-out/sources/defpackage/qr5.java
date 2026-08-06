package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qr5 implements ls1, fm8, nn7, br5, mb9, bt1, mn7.a {
    public static final c k0 = new c("Undefined intrinsics block and it is required");
    public static final b l0 = new b();
    public static final pr5 m0 = new pr5();
    public qr5 A;
    public int B;
    public final m37<qr5> C;
    public k37<qr5> D;
    public boolean E;
    public qr5 F;
    public mn7 G;
    public zgb H;
    public int I;
    public boolean J;
    public boolean K;
    public lb9 L;
    public boolean M;
    public final k37<qr5> N;
    public boolean O;
    public fl6 P;
    public dk5 Q;
    public tx2 R;
    public tq5 S;
    public lgb T;
    public ou1 U;
    public f V;
    public f W;
    public boolean X;
    public final kb7 Y;
    public final vr5 Z;
    public xr5 a0;
    public mb7 b0;
    public boolean c0;
    public ox6 d0;
    public ox6 e0;
    public bt.e f0;
    public bt.f g0;
    public boolean h0;
    public int i0;
    public boolean j0;
    public final boolean t;
    public int u;
    public boolean v;
    public long w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<qr5> {
        public static final a u = new a(0);

        @Override // defpackage.mh4
        public final qr5 invoke() {
            return new qr5(3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements lgb {
        @Override // defpackage.lgb
        public final long a() {
            return 300L;
        }

        @Override // defpackage.lgb
        public final long b() {
            return 400L;
        }

        @Override // defpackage.lgb
        public final long d() {
            return 0L;
        }

        @Override // defpackage.lgb
        public final float f() {
            return 16.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends e {
        @Override // defpackage.fl6
        public final gl6 d(hl6 hl6Var, List list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public static final d t;
        public static final d u;
        public static final d v;
        public static final d w;
        public static final d x;
        public static final /* synthetic */ d[] y;

        static {
            d dVar = new d("Measuring", 0);
            t = dVar;
            d dVar2 = new d("LookaheadMeasuring", 1);
            u = dVar2;
            d dVar3 = new d("LayingOut", 2);
            v = dVar3;
            d dVar4 = new d("LookaheadLayingOut", 3);
            w = dVar4;
            d dVar5 = new d("Idle", 4);
            x = dVar5;
            y = new d[]{dVar, dVar2, dVar3, dVar4, dVar5};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) y.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class e implements fl6 {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        @Override // defpackage.fl6
        public final int a(qj5 qj5Var, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.fl6
        public final int e(qj5 qj5Var, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.fl6
        public final int g(qj5 qj5Var, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.fl6
        public final int i(qj5 qj5Var, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f {
        public static final f t;
        public static final f u;
        public static final f v;
        public static final /* synthetic */ f[] w;

        static {
            f fVar = new f("InMeasureBlock", 0);
            t = fVar;
            f fVar2 = new f("InLayoutBlock", 1);
            u = fVar2;
            f fVar3 = new f("NotUsed", 2);
            v = fVar3;
            w = new f[]{fVar, fVar2, fVar3};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) w.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h extends wp5 implements mh4<g2b> {
        public h() {
            super(0);
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            vr5 vr5Var = qr5.this.Z;
            vr5Var.p.T = true;
            hf6 hf6Var = vr5Var.q;
            if (hf6Var != null) {
                hf6Var.N = true;
            }
            return g2b.a;
        }
    }

    public qr5(int i, boolean z) {
        this.t = z;
        this.u = i;
        this.w = 9223372034707292159L;
        this.x = true;
        this.y = true;
        this.C = new m37<>(new k37(new qr5[16]), new h());
        this.N = new k37<>(new qr5[16]);
        this.O = true;
        this.P = k0;
        this.R = ur5.a;
        this.S = tq5.t;
        this.T = l0;
        ou1.d.getClass();
        this.U = ou1.a.b;
        f fVar = f.v;
        this.V = fVar;
        this.W = fVar;
        this.Y = new kb7(this);
        this.Z = new vr5(this);
        this.c0 = true;
        this.d0 = ox6.a.t;
    }

    public static void e0(qr5 qr5Var, boolean z, int i) {
        qr5 qr5VarI;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (qr5Var.A == null) {
            uc5.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        mn7 mn7Var = qr5Var.G;
        if (mn7Var == null || qr5Var.J || qr5Var.t) {
            return;
        }
        mn7Var.D(qr5Var, true, z, z2);
        if (z3) {
            hf6 hf6Var = qr5Var.Z.q;
            hf6Var.getClass();
            vr5 vr5Var = hf6Var.y;
            qr5 qr5VarI2 = vr5Var.a.I();
            f fVar = vr5Var.a.V;
            if (qr5VarI2 == null || fVar == f.v) {
                return;
            }
            while (qr5VarI2.V == fVar && (qr5VarI = qr5VarI2.I()) != null) {
                qr5VarI2 = qr5VarI;
            }
            int iOrdinal = fVar.ordinal();
            if (iOrdinal == 0) {
                if (qr5VarI2.A != null) {
                    e0(qr5VarI2, z, 6);
                    return;
                } else {
                    g0(qr5VarI2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                aa0.c("Intrinsics isn't used by the parent");
            } else if (qr5VarI2.A != null) {
                qr5VarI2.d0(z);
            } else {
                qr5VarI2.f0(z);
            }
        }
    }

    public static void g0(qr5 qr5Var, boolean z, int i) {
        mn7 mn7Var;
        qr5 qr5VarI;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (qr5Var.J || qr5Var.t || (mn7Var = qr5Var.G) == null) {
            return;
        }
        mn7Var.D(qr5Var, false, z, z2);
        if (z3) {
            vr5 vr5Var = qr5Var.Z.p.y;
            qr5 qr5VarI2 = vr5Var.a.I();
            f fVar = vr5Var.a.V;
            if (qr5VarI2 == null || fVar == f.v) {
                return;
            }
            while (qr5VarI2.V == fVar && (qr5VarI = qr5VarI2.I()) != null) {
                qr5VarI2 = qr5VarI;
            }
            int iOrdinal = fVar.ordinal();
            if (iOrdinal == 0) {
                g0(qr5VarI2, z, 6);
            } else if (iOrdinal == 1) {
                qr5VarI2.f0(z);
            } else {
                aa0.c("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void h0(qr5 qr5Var) {
        vr5 vr5Var = qr5Var.Z;
        if (g.a[vr5Var.d.ordinal()] != 1) {
            v92.b(vr5Var.d, "Unexpected state ");
            return;
        }
        if (vr5Var.e) {
            e0(qr5Var, true, 6);
            return;
        }
        if (vr5Var.f) {
            qr5Var.d0(true);
        }
        if (qr5Var.E()) {
            g0(qr5Var, true, 6);
        } else if (qr5Var.D()) {
            qr5Var.f0(true);
        }
    }

    private final String y(qr5 qr5Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(qr5Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(v(0));
        sb.append(" Other tree: ");
        qr5 qr5Var2 = qr5Var.F;
        sb.append(qr5Var2 != null ? qr5Var2.v(0) : null);
        return sb.toString();
    }

    public final List<cl6> A() {
        return this.Z.p.n0();
    }

    public final List<qr5> B() {
        return L().j();
    }

    public final List<qr5> C() {
        return this.C.a.j();
    }

    public final boolean D() {
        return this.Z.p.P;
    }

    public final boolean E() {
        return this.Z.p.O;
    }

    public final f F() {
        return this.Z.p.E;
    }

    public final f G() {
        f fVar;
        hf6 hf6Var = this.Z.q;
        return (hf6Var == null || (fVar = hf6Var.C) == null) ? f.v : fVar;
    }

    public final dk5 H() {
        dk5 dk5Var = this.Q;
        if (dk5Var != null) {
            return dk5Var;
        }
        dk5 dk5Var2 = new dk5(this, this.P);
        this.Q = dk5Var2;
        return dk5Var2;
    }

    public final qr5 I() {
        qr5 qr5Var = this.F;
        while (qr5Var != null && qr5Var.t) {
            qr5Var = qr5Var.F;
        }
        return qr5Var;
    }

    public final int J() {
        return this.Z.p.B;
    }

    public final k37<qr5> K() {
        boolean z = this.O;
        k37<qr5> k37Var = this.N;
        if (z) {
            k37Var.k();
            k37Var.e(k37Var.v, L());
            Arrays.sort(k37Var.t, 0, k37Var.v, m0);
            this.O = false;
        }
        return k37Var;
    }

    public final k37<qr5> L() {
        o0();
        if (this.B == 0) {
            return this.C.a;
        }
        k37<qr5> k37Var = this.D;
        k37Var.getClass();
        return k37Var;
    }

    public final void M(long j, vy4 vy4Var, int i, boolean z) {
        kb7 kb7Var = this.Y;
        mb7 mb7Var = kb7Var.d;
        sv8 sv8Var = mb7.i0;
        kb7Var.d.A1(mb7.l0, mb7Var.a1(j), vy4Var, i, z);
    }

    public final void N(int i, qr5 qr5Var) {
        if (qr5Var.F != null && qr5Var.G != null) {
            uc5.b(y(qr5Var));
        }
        qr5Var.F = this;
        m37<qr5> m37Var = this.C;
        m37Var.a.c(i, qr5Var);
        m37Var.b.invoke();
        Z();
        if (qr5Var.t) {
            this.B++;
        }
        S();
        mn7 mn7Var = this.G;
        if (mn7Var != null) {
            qr5Var.n(mn7Var);
        }
        if (qr5Var.Z.l > 0) {
            vr5 vr5Var = this.Z;
            vr5Var.d(vr5Var.l + 1);
        }
        if (qr5Var.i0 > 0) {
            l0(this.i0 + 1);
        }
    }

    public final void O() {
        if (this.c0) {
            kb7 kb7Var = this.Y;
            mb7 mb7Var = kb7Var.c;
            mb7 mb7Var2 = kb7Var.d.L;
            this.b0 = null;
            while (!xj5.a(mb7Var, mb7Var2)) {
                if ((mb7Var != null ? mb7Var.g0 : null) != null) {
                    this.b0 = mb7Var;
                    break;
                }
                mb7Var = mb7Var != null ? mb7Var.L : null;
            }
            this.c0 = false;
        }
        mb7 mb7Var3 = this.b0;
        if (mb7Var3 != null && mb7Var3.g0 == null) {
            throw ik.a("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (mb7Var3 != null) {
            mb7Var3.E1();
            return;
        }
        qr5 qr5VarI = I();
        if (qr5VarI != null) {
            qr5VarI.O();
            return;
        }
        mn7 mn7Var = this.G;
        if (mn7Var != null) {
            mn7Var.n();
        }
    }

    public final void P() {
        kb7 kb7Var = this.Y;
        mb7 mb7Var = kb7Var.d;
        fd5 fd5Var = kb7Var.c;
        while (mb7Var != fd5Var) {
            mb7Var.getClass();
            mr5 mr5Var = (mr5) mb7Var;
            ln7 ln7Var = mr5Var.g0;
            if (ln7Var != null) {
                ln7Var.invalidate();
            }
            mb7Var = mr5Var.K;
        }
        ln7 ln7Var2 = kb7Var.c.g0;
        if (ln7Var2 != null) {
            ln7Var2.invalidate();
        }
    }

    public final void Q() {
        if (this.t) {
            qr5 qr5VarI = I();
            if (qr5VarI != null) {
                qr5VarI.Q();
                return;
            }
            return;
        }
        if (this.A != null) {
            e0(this, false, 7);
        } else {
            g0(this, false, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, lb9] */
    public final void R() {
        if (this.M) {
            return;
        }
        if (this.Y.b.y != null || this.e0 != null) {
            this.K = true;
            return;
        }
        lb9 lb9Var = this.L;
        this.M = true;
        gl8 gl8Var = new gl8();
        gl8Var.t = new lb9();
        un7 snapshotObserver = ur5.a(this).getSnapshotObserver();
        rr5 rr5Var = new rr5(this, gl8Var);
        snapshotObserver.a.d(this, snapshotObserver.d, rr5Var);
        this.M = false;
        this.L = (lb9) gl8Var.t;
        this.K = false;
        mn7 mn7VarA = ur5.a(this);
        t27<nb9> t27Var = mn7VarA.getSemanticsOwner().d;
        Object[] objArr = t27Var.a;
        int i = t27Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((nb9) objArr[i2]).a(this, lb9Var);
        }
        mn7VarA.A();
    }

    public final void S() {
        qr5 qr5Var;
        if (this.B > 0) {
            this.E = true;
        }
        if (!this.t || (qr5Var = this.F) == null) {
            return;
        }
        qr5Var.S();
    }

    public final Boolean T() {
        hf6 hf6Var = this.Z.q;
        if (hf6Var != null) {
            return Boolean.valueOf(hf6Var.K != hf6.a.v);
        }
        return null;
    }

    public final void U() {
        qr5 qr5VarI;
        if (this.V == f.v) {
            q();
        }
        hf6 hf6Var = this.Z.q;
        hf6Var.getClass();
        boolean z = true;
        try {
            hf6Var.z = true;
            if (!hf6Var.E) {
                uc5.b("replace() called on item that was not placed");
            }
            hf6Var.V = false;
            if (hf6Var.K == hf6.a.v) {
                z = false;
            }
            hf6Var.v0(hf6Var.H, hf6Var.I, hf6Var.J);
            if (z && !hf6Var.V && (qr5VarI = hf6Var.y.a.I()) != null) {
                qr5VarI.d0(false);
            }
        } finally {
            hf6Var.z = false;
        }
    }

    @Override // defpackage.nn7
    public final boolean V() {
        return e();
    }

    public final void W(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            m37<qr5> m37Var = this.C;
            k37<qr5> k37Var = m37Var.a;
            h hVar = m37Var.b;
            qr5 qr5VarO = k37Var.o(i5);
            hVar.invoke();
            m37Var.a.c(i6, qr5VarO);
            hVar.invoke();
        }
        Z();
        S();
        Q();
    }

    public final void X(qr5 qr5Var) {
        if (qr5Var.Z.l > 0) {
            vr5 vr5Var = this.Z;
            vr5Var.d(vr5Var.l - 1);
        }
        if (this.G != null) {
            qr5Var.w();
        }
        qr5Var.F = null;
        if (qr5Var.i0 > 0) {
            l0(this.i0 - 1);
        }
        qr5Var.Y.d.L = null;
        if (qr5Var.t) {
            this.B--;
            k37<qr5> k37Var = qr5Var.C.a;
            qr5[] qr5VarArr = k37Var.t;
            int i = k37Var.v;
            for (int i2 = 0; i2 < i; i2++) {
                qr5VarArr[i2].Y.d.L = null;
            }
        }
        S();
        Z();
    }

    public final void Y(mb7 mb7Var) {
        mn7 mn7Var = this.G;
        xk8 rectManager = mn7Var != null ? mn7Var.getRectManager() : null;
        vr5 vr5Var = this.Z;
        boolean z = vr5Var.d != d.x || E() || D();
        if (this.z && rectManager != null) {
            if (mb7Var == this.Y.d) {
                this.y = true;
                if (!z) {
                    rectManager.e(this);
                }
            } else {
                this.x = true;
                k37<qr5> k37VarL = L();
                qr5[] qr5VarArr = k37VarL.t;
                int i = k37VarL.v;
                for (int i2 = 0; i2 < i; i2++) {
                    qr5 qr5Var = qr5VarArr[i2];
                    qr5Var.y = true;
                    if (!z) {
                        rectManager.e(qr5Var);
                    }
                }
                if (this.z) {
                    rectManager.e = true;
                    uk8 uk8Var = rectManager.b;
                    int i3 = this.u & 33554431;
                    long[] jArr = uk8Var.a;
                    int i4 = uk8Var.c;
                    for (int i5 = 0; i5 < jArr.length - 2 && i5 < i4; i5 += 3) {
                        int i6 = i5 + 2;
                        long j = jArr[i6];
                        if ((((int) j) & 33554431) == i3) {
                            jArr[i6] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                    }
                }
                rectManager.h();
            }
        }
        vr5Var.p.z0();
    }

    public final void Z() {
        if (!this.t) {
            this.O = true;
            return;
        }
        qr5 qr5VarI = I();
        if (qr5VarI != null) {
            qr5VarI.Z();
        }
    }

    @Override // defpackage.ls1
    public final void a() {
        zgb zgbVar = this.H;
        if (zgbVar != null) {
            zgbVar.a();
        }
        xr5 xr5Var = this.a0;
        if (xr5Var != null) {
            xr5Var.a();
        }
        kb7 kb7Var = this.Y;
        mb7 mb7Var = kb7Var.c.K;
        for (mb7 mb7Var2 = kb7Var.d; !xj5.a(mb7Var2, mb7Var) && mb7Var2 != null; mb7Var2 = mb7Var2.K) {
            mb7Var2.P1();
        }
    }

    public final void a0() {
        m37<qr5> m37Var = this.C;
        int i = m37Var.a.v;
        while (true) {
            i--;
            k37<qr5> k37Var = m37Var.a;
            if (-1 >= i) {
                k37Var.k();
                m37Var.b.invoke();
                return;
            }
            X(k37Var.t[i]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // mn7.a
    public final void b() {
        ox6.c cVar;
        kb7 kb7Var = this.Y;
        fd5 fd5Var = kb7Var.c;
        boolean zG = qb7.g(4194304);
        if (zG) {
            cVar = fd5Var.n0;
        } else {
            cVar = fd5Var.n0.x;
            if (cVar == null) {
                return;
            }
        }
        sv8 sv8Var = mb7.i0;
        for (ox6.c cVarS1 = fd5Var.s1(zG); cVarS1 != null && (cVarS1.w & 4194304) != 0; cVarS1 = cVarS1.y) {
            if ((cVarS1.v & 4194304) != 0) {
                ?? B = cVarS1;
                ?? k37Var = 0;
                while (B != 0) {
                    if (B instanceof nq5) {
                        ((nq5) B).F(kb7Var.c);
                    } else if ((B.v & 4194304) != 0 && (B instanceof gw2)) {
                        ox6.c cVar2 = ((gw2) B).I;
                        int i = 0;
                        B = B;
                        k37Var = k37Var;
                        while (cVar2 != null) {
                            if ((cVar2.v & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    k37Var = k37Var;
                                    B = cVar2;
                                } else {
                                    if (k37Var == 0) {
                                        k37Var = new k37(new ox6.c[16]);
                                    }
                                    if (B != 0) {
                                        k37Var.d(B);
                                        B = 0;
                                    }
                                    k37Var.d(cVar2);
                                }
                            }
                            cVar2 = cVar2.y;
                            B = B;
                            k37Var = k37Var;
                        }
                        if (i == 1) {
                        }
                    }
                    B = ew2.b(k37Var);
                }
            }
            if (cVarS1 == cVar) {
                return;
            }
        }
    }

    public final void b0(int i, int i2) {
        if (i2 < 0) {
            uc5.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            m37<qr5> m37Var = this.C;
            X(m37Var.a.t[i3]);
            m37Var.a.o(i3);
            m37Var.b.invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    @Override // defpackage.bt1
    public final void c(fl6 fl6Var) {
        if (xj5.a(this.P, fl6Var)) {
            return;
        }
        this.P = fl6Var;
        dk5 dk5Var = this.Q;
        if (dk5Var != null) {
            dk5Var.b.setValue(fl6Var);
        }
        Q();
    }

    public final void c0() {
        qr5 qr5VarI;
        if (this.V == f.v) {
            q();
        }
        el6 el6Var = this.Z.p;
        vr5 vr5Var = el6Var.y;
        try {
            el6Var.z = true;
            if (!el6Var.D) {
                uc5.b("replace called on unplaced item");
            }
            boolean z = el6Var.M;
            el6Var.t0(el6Var.G, el6Var.J, el6Var.H, el6Var.I);
            if (z && !el6Var.Z && (qr5VarI = vr5Var.a.I()) != null) {
                qr5VarI.f0(false);
            }
            el6Var.z = false;
        } catch (Throwable th) {
            try {
                vr5Var.a.j0(th);
                throw null;
            } catch (Throwable th2) {
                el6Var.z = false;
                throw th2;
            }
        }
    }

    @Override // defpackage.br5
    public final int d() {
        return this.u;
    }

    public final void d0(boolean z) {
        mn7 mn7Var;
        if (this.t || (mn7Var = this.G) == null) {
            return;
        }
        mn7Var.K(this, true, z);
    }

    @Override // defpackage.br5
    public final boolean e() {
        return this.G != null;
    }

    public final void f0(boolean z) {
        mn7 mn7Var;
        if (this.t || (mn7Var = this.G) == null) {
            return;
        }
        mn7Var.K(this, false, z);
    }

    @Override // defpackage.ls1
    public final void g() {
        zgb zgbVar = this.H;
        if (zgbVar != null) {
            zgbVar.g();
        }
        xr5 xr5Var = this.a0;
        if (xr5Var != null) {
            xr5Var.i(true);
        }
        this.j0 = true;
        ox6.c cVar = this.Y.e;
        for (ox6.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.x) {
            if (cVar2.G) {
                cVar2.X1();
            }
        }
        for (ox6.c cVar3 = cVar; cVar3 != null; cVar3 = cVar3.x) {
            if (cVar3.G) {
                cVar3.Z1();
            }
        }
        while (cVar != null) {
            if (cVar.G) {
                cVar.T1();
            }
            cVar = cVar.x;
        }
        if (e()) {
            this.L = null;
            this.K = false;
        }
        mn7 mn7Var = this.G;
        if (mn7Var != null) {
            mn7Var.p(this);
        }
    }

    @Override // defpackage.br5
    public final boolean h() {
        return this.j0;
    }

    @Override // defpackage.fm8
    public final void i() {
        if (this.A != null) {
            e0(this, false, 5);
        } else {
            g0(this, false, 5);
        }
        el6 el6Var = this.Z.p;
        xx1 xx1Var = el6Var.C ? new xx1(el6Var.w) : null;
        mn7 mn7Var = this.G;
        if (xx1Var != null) {
            if (mn7Var != null) {
                mn7Var.c(this, xx1Var.a);
            }
        } else if (mn7Var != null) {
            mn7Var.a(true);
        }
    }

    public final void i0() {
        k37<qr5> k37VarL = L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var = qr5VarArr[i2];
            f fVar = qr5Var.W;
            qr5Var.V = fVar;
            if (fVar != f.v) {
                qr5Var.i0();
            }
        }
    }

    @Override // defpackage.br5
    public final boolean j() {
        return this.Z.p.M;
    }

    public final void j0(Throwable th) {
        bu1 bu1Var = (bu1) this.U.a(fu1.a);
        if (bu1Var == null) {
            throw th;
        }
        bu1Var.b(this, th);
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [k37] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [k37] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // defpackage.bt1
    public final void k(ou1 ou1Var) {
        this.U = ou1Var;
        k0((tx2) ou1Var.a(qu1.h));
        tq5 tq5Var = (tq5) ou1Var.a(qu1.n);
        tq5 tq5Var2 = this.S;
        kb7 kb7Var = this.Y;
        if (tq5Var2 != tq5Var) {
            this.S = tq5Var;
            Q();
            qr5 qr5VarI = I();
            if (qr5VarI != null) {
                qr5VarI.O();
            } else {
                mn7 mn7Var = this.G;
                if (mn7Var != null) {
                    mn7Var.n();
                }
            }
            P();
            for (ox6.c cVar = kb7Var.f; cVar != null; cVar = cVar.y) {
                cVar.H0();
            }
        }
        n0((lgb) ou1Var.a(qu1.t));
        ox6.c cVar2 = kb7Var.f;
        if ((cVar2.w & 32768) != 0) {
            while (cVar2 != null) {
                if ((cVar2.v & 32768) != 0) {
                    ?? B = cVar2;
                    ?? k37Var = 0;
                    while (B != 0) {
                        if (B instanceof ju1) {
                            ox6.c cVarQ = ((ju1) B).q();
                            if (cVarQ.G) {
                                qb7.c(cVarQ);
                            } else {
                                cVarQ.C = true;
                            }
                        } else if ((B.v & 32768) != 0 && (B instanceof gw2)) {
                            ox6.c cVar3 = ((gw2) B).I;
                            int i = 0;
                            while (cVar3 != null) {
                                if ((cVar3.v & 32768) != 0) {
                                    i++;
                                    if (i == 1) {
                                        B = B;
                                        k37Var = k37Var;
                                        k37Var = k37Var;
                                        B = cVar3;
                                    } else {
                                        if (k37Var == 0) {
                                            k37Var = new k37(new ox6.c[16]);
                                        }
                                        if (B != 0) {
                                            k37Var.d(B);
                                            B = 0;
                                        }
                                        k37Var.d(cVar3);
                                    }
                                } else {
                                    B = B;
                                    k37Var = k37Var;
                                }
                                cVar3 = cVar3.y;
                                B = B;
                                k37Var = k37Var;
                            }
                            if (i == 1) {
                                B = B;
                                k37Var = k37Var;
                            } else {
                                B = B;
                                k37Var = k37Var;
                            }
                        }
                        B = ew2.b(k37Var);
                    }
                }
                if ((cVar2.w & 32768) == 0) {
                    return;
                } else {
                    cVar2 = cVar2.y;
                }
            }
        }
    }

    public final void k0(tx2 tx2Var) {
        if (xj5.a(this.R, tx2Var)) {
            return;
        }
        this.R = tx2Var;
        Q();
        qr5 qr5VarI = I();
        if (qr5VarI != null) {
            qr5VarI.O();
        } else {
            mn7 mn7Var = this.G;
            if (mn7Var != null) {
                mn7Var.n();
            }
        }
        P();
        for (ox6.c cVar = this.Y.f; cVar != null; cVar = cVar.y) {
            cVar.l();
        }
    }

    @Override // defpackage.bt1
    public final void l(ox6 ox6Var) {
        if (this.t && this.d0 != ox6.a.t) {
            uc5.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.j0) {
            uc5.a("modifier is updated when deactivated");
        }
        if (!e()) {
            this.e0 = ox6Var;
            return;
        }
        m(ox6Var);
        if (this.K) {
            R();
        }
    }

    public final void l0(int i) {
        qr5 qr5VarI;
        qr5 qr5VarI2;
        int i2 = this.i0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (qr5VarI2 = I()) != null) {
                qr5VarI2.l0(qr5VarI2.i0 + 1);
            }
            if (i == 0 && this.i0 > 0 && (qr5VarI = I()) != null) {
                qr5VarI.l0(qr5VarI.i0 - 1);
            }
            this.i0 = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [mb7, ox6$c] */
    public final void m(ox6 ox6Var) {
        ?? r7;
        k37<ox6.b> k37Var;
        boolean z;
        kb7 kb7Var;
        boolean z2;
        k37<ox6.b> k37Var2;
        kb7 kb7Var2;
        k37<ox6.b> k37Var3;
        k37<ox6.b> k37Var4;
        boolean z3;
        k37<ox6.b> k37Var5;
        k37<ox6.b> k37Var6;
        k37<ox6.b> k37Var7;
        k37<ox6.b> k37Var8;
        char c2;
        k37<ox6.b> k37Var9;
        lb7 lb7Var;
        kb7 kb7Var3 = this.Y;
        boolean zD = kb7Var3.d(16);
        ox6.c cVar = kb7Var3.e;
        boolean zD2 = kb7Var3.d(1024);
        this.d0 = ox6Var;
        fd5 fd5Var = kb7Var3.c;
        qr5 qr5Var = kb7Var3.a;
        ox6.c cVar2 = kb7Var3.f;
        kb7.b bVar = kb7Var3.b;
        if (cVar2 == bVar) {
            uc5.b("padChain called on already padded chain");
        }
        ox6.c cVar3 = kb7Var3.f;
        cVar3.x = bVar;
        bVar.y = cVar3;
        k37<ox6.b> k37Var10 = kb7Var3.g;
        int i = k37Var10 != null ? k37Var10.v : 0;
        k37<ox6.b> k37Var11 = kb7Var3.h;
        if (k37Var11 == null) {
            k37Var11 = new k37<>(new ox6.b[16]);
        }
        k37<ox6> k37Var12 = kb7Var3.i;
        k37Var12.d(ox6Var);
        lb7 lb7Var2 = null;
        while (true) {
            int i2 = k37Var12.v;
            if (i2 == 0) {
                break;
            }
            ox6 ox6VarO = k37Var12.o(i2 - 1);
            if (ox6VarO instanceof kj1) {
                kj1 kj1Var = (kj1) ox6VarO;
                k37Var12.d(kj1Var.u);
                k37Var12.d(kj1Var.t);
            } else if (ox6VarO instanceof ox6.b) {
                k37Var11.d(ox6VarO);
            } else {
                if (lb7Var2 == null) {
                    lb7Var = new lb7(k37Var11);
                    lb7Var2 = lb7Var;
                } else {
                    lb7Var = lb7Var2;
                }
                ox6VarO.l(lb7Var);
            }
        }
        int i3 = k37Var11.v;
        if (i3 == i) {
            ox6.c cVar4 = bVar.y;
            int i4 = 0;
            while (true) {
                if (cVar4 == null) {
                    k37Var6 = k37Var10;
                } else if (i4 < i) {
                    if (k37Var6 == null) {
                        throw ik.a("expected prior modifier list to be non-empty");
                    }
                    ox6.b bVar2 = k37Var6.t[i4];
                    ox6.b bVar3 = k37Var11.t[i4];
                    if (xj5.a(bVar2, bVar3)) {
                        k37Var9 = k37Var6;
                        c2 = 2;
                    } else {
                        k37Var8 = k37Var6;
                        c2 = bVar2.getClass() == bVar3.getClass() ? (char) 1 : (char) 0;
                    }
                    if (c2 == 0) {
                        k37Var9 = k37Var8;
                        k37Var9 = k37Var8;
                        cVar4 = cVar4.x;
                        k37Var7 = k37Var9;
                        break;
                    }
                    k37Var9 = k37Var8;
                    k37Var9 = k37Var8;
                    if (c2 == 1) {
                        kb7.h(bVar2, bVar3, cVar4);
                    }
                    cVar4 = cVar4.y;
                    i4++;
                    k37Var6 = k37Var9;
                }
                k37Var7 = k37Var6;
                break;
            }
            if (i4 >= i) {
                kb7Var3 = kb7Var3;
                k37Var2 = k37Var7;
                z2 = false;
                kb7Var2 = kb7Var3;
                bVar = bVar;
                k37Var = k37Var11;
                z = false;
                k37Var3 = k37Var2;
                r7 = z2;
            } else {
                if (k37Var7 == null) {
                    throw ik.a("expected prior modifier list to be non-empty");
                }
                if (cVar4 == null) {
                    throw ik.a("structuralUpdate requires a non-null tail");
                }
                boolean z4 = qr5Var.e0 != null;
                ox6.c cVar5 = cVar4;
                kb7 kb7Var4 = kb7Var3;
                k37Var = k37Var11;
                k37<ox6.b> k37Var13 = k37Var7;
                z3 = false;
                kb7Var4.f(i4, k37Var13, k37Var, cVar5, !z4);
                kb7Var = kb7Var4;
                k37Var5 = k37Var13;
                z = true;
                kb7Var2 = kb7Var;
                k37Var3 = k37Var5;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z3 = false;
            z2 = false;
            ox6 ox6Var2 = qr5Var.e0;
            if (ox6Var2 != null && i == 0) {
                ox6.c cVarB = bVar;
                for (int i5 = 0; i5 < k37Var11.v; i5++) {
                    cVarB = kb7.b(k37Var11.t[i5], cVarB);
                }
                int i6 = 0;
                for (ox6.c cVar6 = cVar.x; cVar6 != null && cVar6 != bVar; cVar6 = cVar6.x) {
                    i6 |= cVar6.v;
                    cVar6.w = i6;
                }
                kb7Var = kb7Var3;
                k37Var = k37Var11;
                k37Var5 = k37Var10;
                z = true;
                kb7Var2 = kb7Var;
                k37Var3 = k37Var5;
                r7 = z3;
            } else if (i3 != 0) {
                if (k37Var10 == null) {
                    k37Var10 = new k37<>(new ox6.b[16]);
                }
                kb7 kb7Var5 = kb7Var3;
                bVar = bVar;
                k37Var = k37Var11;
                kb7Var5.f(0, k37Var10, k37Var, bVar, !(ox6Var2 != null));
                z = true;
                kb7Var2 = kb7Var5;
                k37Var3 = k37Var10;
            } else {
                if (k37Var10 == null) {
                    throw ik.a("expected prior modifier list to be non-empty");
                }
                ox6.c cVar7 = bVar.y;
                for (int i7 = 0; cVar7 != null && i7 < k37Var10.v; i7++) {
                    cVar7 = kb7.c(cVar7).y;
                }
                qr5 qr5VarI = qr5Var.I();
                fd5Var.L = qr5VarI != null ? qr5VarI.Y.c : null;
                kb7Var3.d = fd5Var;
                k37Var2 = k37Var10;
                kb7Var2 = kb7Var3;
                bVar = bVar;
                k37Var = k37Var11;
                z = false;
                k37Var3 = k37Var2;
                r7 = z2;
            }
        }
        kb7Var2.g = k37Var;
        if (k37Var3 != null) {
            k37Var3.k();
            k37Var4 = k37Var3;
        } else {
            k37Var4 = r7;
        }
        kb7Var2.h = k37Var4;
        ox6.c cVar8 = bVar.y;
        if (cVar8 != null) {
            cVar = cVar8;
        }
        cVar.x = r7;
        bVar.y = r7;
        bVar.w = -1;
        bVar.A = r7;
        if (cVar == bVar) {
            uc5.b("trimChain did not update the head");
        }
        kb7Var2.f = cVar;
        if (z) {
            kb7Var2.g();
        }
        boolean zD3 = kb7Var2.d(16);
        boolean zD4 = kb7Var2.d(1024);
        this.Z.j();
        if (this.A == null && kb7Var2.d(512)) {
            m0(this);
        }
        if (zD == zD3 && zD2 == zD4) {
            return;
        }
        xk8 rectManager = ur5.a(this).getRectManager();
        rectManager.getClass();
        if (e()) {
            uk8 uk8Var = rectManager.b;
            int i8 = this.u & 33554431;
            long[] jArr = uk8Var.a;
            int i9 = uk8Var.c;
            for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                int i11 = i10 + 2;
                long j = jArr[i11];
                if ((((int) j) & 33554431) == i8) {
                    jArr[i11] = ((-6917529027641081857L) & j) | ((zD4 ? 1L : 0L) * 2305843009213693952L) | ((zD3 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    public final void m0(qr5 qr5Var) {
        if (xj5.a(qr5Var, this.A)) {
            return;
        }
        this.A = qr5Var;
        vr5 vr5Var = this.Z;
        if (qr5Var != null) {
            if (vr5Var.q == null) {
                vr5Var.q = new hf6(vr5Var);
            }
            kb7 kb7Var = this.Y;
            mb7 mb7Var = kb7Var.c.K;
            for (mb7 mb7Var2 = kb7Var.d; !xj5.a(mb7Var2, mb7Var) && mb7Var2 != null; mb7Var2 = mb7Var2.K) {
                mb7Var2.V0();
            }
        } else {
            vr5Var.q = null;
            vr5Var.f = false;
            vr5Var.e = false;
        }
        Q();
    }

    public final void n(mn7 mn7Var) {
        qr5 qr5Var;
        if (this.G != null) {
            uc5.b("Cannot attach " + this + " as it already is attached.  Tree: " + v(0));
        }
        qr5 qr5Var2 = this.F;
        if (qr5Var2 != null && !xj5.a(qr5Var2.G, mn7Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(mn7Var);
            sb.append(") than the parent's owner(");
            qr5 qr5VarI = I();
            sb.append(qr5VarI != null ? qr5VarI.G : null);
            sb.append("). This tree: ");
            sb.append(v(0));
            sb.append(" Parent tree: ");
            qr5 qr5Var3 = this.F;
            sb.append(qr5Var3 != null ? qr5Var3.v(0) : null);
            uc5.b(sb.toString());
        }
        qr5 qr5VarI2 = I();
        vr5 vr5Var = this.Z;
        if (qr5VarI2 == null) {
            vr5Var.p.M = true;
            mn7Var.getRectManager().e(this);
            hf6 hf6Var = vr5Var.q;
            if (hf6Var != null) {
                hf6Var.K = hf6.a.t;
            }
        }
        kb7 kb7Var = this.Y;
        kb7Var.d.L = qr5VarI2 != null ? qr5VarI2.Y.c : null;
        this.G = mn7Var;
        this.I = (qr5VarI2 != null ? qr5VarI2.I : -1) + 1;
        ox6 ox6Var = this.e0;
        if (ox6Var != null) {
            m(ox6Var);
        }
        this.e0 = null;
        mn7Var.l(this);
        qr5 qr5Var4 = this.F;
        if (qr5Var4 == null || (qr5Var = qr5Var4.A) == null) {
            qr5Var = this.A;
        }
        m0(qr5Var);
        if (this.A == null && kb7Var.d(512)) {
            m0(this);
        }
        if (!this.j0) {
            for (ox6.c cVar = kb7Var.f; cVar != null; cVar = cVar.y) {
                cVar.S1();
            }
        }
        k37<qr5> k37Var = this.C.a;
        qr5[] qr5VarArr = k37Var.t;
        int i = k37Var.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5VarArr[i2].n(mn7Var);
        }
        if (!this.j0) {
            kb7Var.e();
        }
        Q();
        if (qr5VarI2 != null) {
            qr5VarI2.Q();
        }
        bt.e eVar = this.f0;
        if (eVar != null) {
            eVar.invoke(mn7Var);
        }
        vr5Var.j();
        if (!this.j0 && kb7Var.d(8)) {
            R();
        }
        mn7Var.C(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void n0(lgb lgbVar) {
        if (xj5.a(this.T, lgbVar)) {
            return;
        }
        this.T = lgbVar;
        ox6.c cVar = this.Y.f;
        if ((cVar.w & 16) != 0) {
            while (cVar != null) {
                if ((cVar.v & 16) != 0) {
                    ?? B = cVar;
                    ?? k37Var = 0;
                    while (B != 0) {
                        if (B instanceof g58) {
                            ((g58) B).A1();
                        } else if ((B.v & 16) != 0 && (B instanceof gw2)) {
                            ox6.c cVar2 = ((gw2) B).I;
                            int i = 0;
                            B = B;
                            k37Var = k37Var;
                            while (cVar2 != null) {
                                if ((cVar2.v & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        k37Var = k37Var;
                                        B = cVar2;
                                    } else {
                                        if (k37Var == 0) {
                                            k37Var = new k37(new ox6.c[16]);
                                        }
                                        if (B != 0) {
                                            k37Var.d(B);
                                            B = 0;
                                        }
                                        k37Var.d(cVar2);
                                    }
                                }
                                cVar2 = cVar2.y;
                                B = B;
                                k37Var = k37Var;
                            }
                            if (i == 1) {
                            }
                        }
                        B = ew2.b(k37Var);
                    }
                }
                if ((cVar.w & 16) == 0) {
                    return;
                } else {
                    cVar = cVar.y;
                }
            }
        }
    }

    public final void o() {
        this.W = this.V;
        f fVar = f.v;
        this.V = fVar;
        k37<qr5> k37VarL = L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var = qr5VarArr[i2];
            if (qr5Var.V != fVar) {
                qr5Var.o();
            }
        }
    }

    public final void o0() {
        if (this.B <= 0 || !this.E) {
            return;
        }
        this.E = false;
        k37<qr5> k37Var = this.D;
        if (k37Var == null) {
            k37Var = new k37<>(new qr5[16]);
            this.D = k37Var;
        }
        k37Var.k();
        k37<qr5> k37Var2 = this.C.a;
        qr5[] qr5VarArr = k37Var2.t;
        int i = k37Var2.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var = qr5VarArr[i2];
            if (qr5Var.t) {
                k37Var.e(k37Var.v, qr5Var.L());
            } else {
                k37Var.d(qr5Var);
            }
        }
        vr5 vr5Var = this.Z;
        vr5Var.p.T = true;
        hf6 hf6Var = vr5Var.q;
        if (hf6Var != null) {
            hf6Var.N = true;
        }
    }

    @Override // defpackage.ls1
    public final void p() {
        xk8 rectManager;
        xk8 rectManager2;
        if (!e()) {
            uc5.a("onReuse is only expected on attached node");
        }
        zgb zgbVar = this.H;
        if (zgbVar != null) {
            zgbVar.p();
        }
        xr5 xr5Var = this.a0;
        if (xr5Var != null) {
            xr5Var.i(false);
        }
        this.M = false;
        boolean z = this.j0;
        kb7 kb7Var = this.Y;
        if (z) {
            this.j0 = false;
        } else {
            ox6.c cVar = kb7Var.e;
            for (ox6.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.x) {
                if (cVar2.G) {
                    cVar2.X1();
                }
            }
            for (ox6.c cVar3 = cVar; cVar3 != null; cVar3 = cVar3.x) {
                if (cVar3.G) {
                    cVar3.Z1();
                }
            }
            while (cVar != null) {
                if (cVar.G) {
                    cVar.T1();
                }
                cVar = cVar.x;
            }
        }
        int i = this.u;
        mn7 mn7Var = this.G;
        if (mn7Var != null && (rectManager2 = mn7Var.getRectManager()) != null) {
            rectManager2.f(this);
        }
        this.u = pb9.a.addAndGet(1);
        mn7 mn7Var2 = this.G;
        if (mn7Var2 != null) {
            mn7Var2.x(i, this);
        }
        for (ox6.c cVar4 = kb7Var.f; cVar4 != null; cVar4 = cVar4.y) {
            cVar4.S1();
        }
        kb7Var.e();
        if (kb7Var.d(8)) {
            R();
        }
        h0(this);
        mn7 mn7Var3 = this.G;
        if (mn7Var3 != null) {
            mn7Var3.o(i, this);
        }
        mn7 mn7Var4 = this.G;
        if (mn7Var4 == null || (rectManager = mn7Var4.getRectManager()) == null) {
            return;
        }
        rectManager.e(this);
    }

    public final void q() {
        this.W = this.V;
        this.V = f.v;
        k37<qr5> k37VarL = L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var = qr5VarArr[i2];
            if (qr5Var.V == f.u) {
                qr5Var.q();
            }
        }
    }

    @Override // defpackage.mb9
    public final lb9 r() {
        if (e() && !this.j0 && this.Y.d(8)) {
            return this.L;
        }
        return null;
    }

    @Override // defpackage.mb9
    public final qr5 s() {
        return I();
    }

    @Override // defpackage.mb9
    public final List<mb9> t() {
        return B();
    }

    public final String toString() {
        return ie3.b(this) + " children: " + ((k37.a) B()).t.v + " measurePolicy: " + this.P + " deactivated: " + this.j0;
    }

    @Override // defpackage.mb9
    public final boolean u() {
        return this.Y.d.G1();
    }

    public final String v(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        k37<qr5> k37VarL = L();
        qr5[] qr5VarArr = k37VarL.t;
        int i3 = k37VarL.v;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(qr5VarArr[i4].v(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    public final void w() {
        cf6 cf6Var;
        mn7 mn7Var = this.G;
        if (mn7Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            qr5 qr5VarI = I();
            sb.append(qr5VarI != null ? qr5VarI.v(0) : null);
            uc5.c(sb.toString());
            fl.a();
            return;
        }
        qr5 qr5VarI2 = I();
        vr5 vr5Var = this.Z;
        if (qr5VarI2 != null) {
            qr5VarI2.O();
            qr5VarI2.Q();
            el6 el6Var = vr5Var.p;
            f fVar = f.v;
            el6Var.E = fVar;
            hf6 hf6Var = vr5Var.q;
            if (hf6Var != null) {
                hf6Var.C = fVar;
            }
        }
        sr5 sr5Var = vr5Var.p.R;
        sr5Var.b = true;
        sr5Var.c = false;
        sr5Var.e = false;
        sr5Var.d = false;
        sr5Var.f = false;
        sr5Var.g = false;
        sr5Var.h = null;
        hf6 hf6Var2 = vr5Var.q;
        if (hf6Var2 != null && (cf6Var = hf6Var2.L) != null) {
            cf6Var.b = true;
            cf6Var.c = false;
            cf6Var.e = false;
            cf6Var.d = false;
            cf6Var.f = false;
            cf6Var.g = false;
            cf6Var.h = null;
        }
        kb7 kb7Var = this.Y;
        ox6.c cVar = kb7Var.e;
        mb7 mb7Var = kb7Var.c.K;
        for (mb7 mb7Var2 = kb7Var.d; !xj5.a(mb7Var2, mb7Var) && mb7Var2 != null; mb7Var2 = mb7Var2.K) {
            mb7Var2.V1();
            if (mb7Var2.H.j()) {
                mb7Var2.Q1();
            }
        }
        bt.f fVar2 = this.g0;
        if (fVar2 != null) {
            fVar2.invoke(mn7Var);
        }
        for (ox6.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.x) {
            if (cVar2.G) {
                cVar2.Z1();
            }
        }
        this.J = true;
        k37<qr5> k37Var = this.C.a;
        qr5[] qr5VarArr = k37Var.t;
        int i = k37Var.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5VarArr[i2].w();
        }
        g2b g2bVar = g2b.a;
        this.J = false;
        while (cVar != null) {
            if (cVar.G) {
                cVar.T1();
            }
            cVar = cVar.x;
        }
        mn7Var.G(this);
        mn7Var.getRectManager().f(this);
        this.G = null;
        m0(null);
        this.I = 0;
        el6 el6Var2 = vr5Var.p;
        el6Var2.B = Integer.MAX_VALUE;
        el6Var2.A = Integer.MAX_VALUE;
        el6Var2.M = false;
        hf6 hf6Var3 = vr5Var.q;
        if (hf6Var3 != null) {
            hf6Var3.B = Integer.MAX_VALUE;
            hf6Var3.A = Integer.MAX_VALUE;
            hf6Var3.K = hf6.a.v;
        }
        if (kb7Var.d(8)) {
            lb9 lb9Var = this.L;
            this.L = null;
            this.K = false;
            t27<nb9> t27Var = mn7Var.getSemanticsOwner().d;
            Object[] objArr = t27Var.a;
            int i3 = t27Var.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((nb9) objArr[i4]).a(this, lb9Var);
            }
            mn7Var.A();
        }
    }

    public final void x(n41 n41Var, ko4 ko4Var) {
        try {
            this.Y.d.M0(n41Var, ko4Var);
            g2b g2bVar = g2b.a;
        } catch (Throwable th) {
            j0(th);
            throw null;
        }
    }

    public final List<cl6> z() {
        hf6 hf6Var = this.Z.q;
        hf6Var.getClass();
        k37<hf6> k37Var = hf6Var.M;
        vr5 vr5Var = hf6Var.y;
        vr5Var.a.B();
        if (!hf6Var.N) {
            return k37Var.j();
        }
        qr5 qr5Var = vr5Var.a;
        k37<qr5> k37VarL = qr5Var.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var2 = qr5VarArr[i2];
            if (k37Var.v <= i2) {
                hf6 hf6Var2 = qr5Var2.Z.q;
                hf6Var2.getClass();
                k37Var.d(hf6Var2);
            } else {
                hf6 hf6Var3 = qr5Var2.Z.q;
                hf6Var3.getClass();
                hf6[] hf6VarArr = k37Var.t;
                hf6 hf6Var4 = hf6VarArr[i2];
                hf6VarArr[i2] = hf6Var3;
            }
        }
        k37Var.p(((k37.a) qr5Var.B()).t.v, k37Var.v);
        hf6Var.N = false;
        return k37Var.j();
    }

    @Override // defpackage.bt1
    public final void f(int i) {
    }

    public qr5(int i) {
        this(pb9.a.addAndGet(1), (i & 1) == 0);
    }

    public qr5() {
        this(3);
    }
}
