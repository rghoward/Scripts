package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dl6 {
    public final qr5 a;
    public boolean c;
    public boolean d;
    public xx1 i;
    public final jy2 b = new jy2();
    public final vh7 e = new vh7();
    public final k37<mn7.a> f = new k37<>(new mn7.a[16]);
    public final long g = 1;
    public final k37<a> h = new k37<>(new a[16]);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final qr5 a;
        public final boolean b;
        public final boolean c;

        public a(qr5 qr5Var, boolean z, boolean z2) {
            this.a = qr5Var;
            this.b = z;
            this.c = z2;
        }
    }

    public dl6(qr5 qr5Var) {
        this.a = qr5Var;
    }

    public static final boolean a(dl6 dl6Var, qr5 qr5Var, boolean z) {
        xx1 xx1Var;
        jz7.a placementScope;
        fd5 fd5Var;
        qr5 qr5VarI;
        qr5 qr5Var2 = dl6Var.a;
        boolean z2 = qr5Var.j0;
        vr5 vr5Var = qr5Var.Z;
        boolean zC = false;
        if (!z2 && k(qr5Var)) {
            if (qr5Var == qr5Var2) {
                xx1Var = dl6Var.i;
                xx1Var.getClass();
            } else {
                xx1Var = null;
            }
            if (z) {
                zC = vr5Var.e ? c(qr5Var, xx1Var) : false;
                if ((zC || vr5Var.f) && xj5.a(qr5Var.T(), Boolean.TRUE)) {
                    qr5Var.U();
                }
            } else {
                boolean zD = qr5Var.E() ? d(qr5Var, xx1Var) : false;
                if (qr5Var.D() && (qr5Var == qr5Var2 || ((qr5VarI = qr5Var.I()) != null && qr5VarI.j() && vr5Var.p.N))) {
                    if (qr5Var == qr5Var2) {
                        if (qr5Var.V == qr5.f.v) {
                            qr5Var.q();
                        }
                        qr5 qr5VarI2 = qr5Var.I();
                        if (qr5VarI2 == null || (fd5Var = qr5VarI2.Y.c) == null || (placementScope = fd5Var.E) == null) {
                            placementScope = ur5.a(qr5Var).getPlacementScope();
                        }
                        jz7.a.t(placementScope, vr5Var.p, 0, 0);
                    } else {
                        qr5Var.c0();
                    }
                    vh7 vh7Var = dl6Var.e;
                    vh7Var.getClass();
                    if (qr5Var.i0 > 0) {
                        vh7Var.a.d(qr5Var);
                        qr5Var.h0 = true;
                    }
                }
                zC = zD;
            }
            dl6Var.e();
        }
        return zC;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean c(qr5 qr5Var, xx1 xx1Var) {
        boolean zX0;
        qr5 qr5Var2 = qr5Var.A;
        vr5 vr5Var = qr5Var.Z;
        if (qr5Var2 == null) {
            return false;
        }
        if (xx1Var == null) {
            hf6 hf6Var = vr5Var.q;
            xx1 xx1Var2 = hf6Var != null ? hf6Var.G : null;
            if (xx1Var2 == null || qr5Var2 == null) {
                zX0 = false;
            } else {
                hf6Var.getClass();
                zX0 = hf6Var.x0(xx1Var2.a);
            }
        } else if (qr5Var2 != null) {
            hf6 hf6Var2 = vr5Var.q;
            hf6Var2.getClass();
            zX0 = hf6Var2.x0(xx1Var.a);
        } else {
            zX0 = false;
        }
        qr5 qr5VarI = qr5Var.I();
        if (zX0 && qr5VarI != null) {
            if (qr5VarI.A == null) {
                qr5.g0(qr5VarI, false, 3);
                return zX0;
            }
            if (qr5Var.G() == qr5.f.t) {
                qr5.e0(qr5VarI, false, 3);
                return zX0;
            }
            if (qr5Var.G() == qr5.f.u) {
                qr5VarI.d0(false);
            }
        }
        return zX0;
    }

    public static boolean d(qr5 qr5Var, xx1 xx1Var) {
        boolean zX0;
        qr5.f fVar = qr5.f.v;
        if (xx1Var != null) {
            if (qr5Var.V == fVar) {
                qr5Var.o();
            }
            zX0 = qr5Var.Z.p.x0(xx1Var.a);
        } else {
            el6 el6Var = qr5Var.Z.p;
            xx1 xx1Var2 = el6Var.C ? new xx1(el6Var.w) : null;
            if (xx1Var2 != null) {
                if (qr5Var.V == fVar) {
                    qr5Var.o();
                }
                zX0 = qr5Var.Z.p.x0(xx1Var2.a);
            } else {
                qr5Var.getClass();
                zX0 = false;
            }
        }
        qr5 qr5VarI = qr5Var.I();
        if (zX0 && qr5VarI != null) {
            if (qr5Var.F() == qr5.f.t) {
                qr5.g0(qr5VarI, false, 3);
                return zX0;
            }
            if (qr5Var.F() == qr5.f.u) {
                qr5VarI.f0(false);
            }
        }
        return zX0;
    }

    public static boolean i(qr5 qr5Var) {
        hf6 hf6Var;
        cf6 cf6Var;
        if (qr5Var.Z.e) {
            return (qr5Var.G() == qr5.f.v && ((hf6Var = qr5Var.Z.q) == null || (cf6Var = hf6Var.L) == null || !cf6Var.f())) ? false : true;
        }
        return false;
    }

    public static boolean j(qr5 qr5Var) {
        if (!qr5Var.E()) {
            return false;
        }
        do {
            if (qr5Var.F() == qr5.f.v && !qr5Var.Z.p.R.f()) {
                qr5 qr5VarI = qr5Var.I();
                if ((qr5VarI != null ? qr5VarI.Z.d : null) != qr5.d.t) {
                    return false;
                }
            }
            qr5Var = qr5Var.I();
            if (qr5Var == null) {
                return false;
            }
        } while (!qr5Var.j());
        return true;
    }

    public static boolean k(qr5 qr5Var) {
        hf6 hf6Var;
        cf6 cf6Var;
        vr5 vr5Var = qr5Var.Z;
        return qr5Var.j() || vr5Var.p.N || j(qr5Var) || xj5.a(qr5Var.T(), Boolean.TRUE) || i(qr5Var) || vr5Var.p.R.f() || !((hf6Var = vr5Var.q) == null || (cf6Var = hf6Var.L) == null || !cf6Var.f());
    }

    public final void b(boolean z) {
        vh7 vh7Var = this.e;
        if (z) {
            k37<qr5> k37Var = vh7Var.a;
            qr5 qr5Var = this.a;
            if (qr5Var.i0 > 0) {
                k37Var.k();
                k37Var.d(qr5Var);
                qr5Var.h0 = true;
            }
        }
        if (vh7Var.a.v != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                vh7Var.a();
                g2b g2bVar = g2b.a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        k37<a> k37Var = this.h;
        int i = k37Var.v;
        if (i != 0) {
            a[] aVarArr = k37Var.t;
            for (int i2 = 0; i2 < i; i2++) {
                a aVar = aVarArr[i2];
                if (aVar.a.e()) {
                    boolean z = aVar.b;
                    qr5 qr5Var = aVar.a;
                    boolean z2 = aVar.c;
                    if (z) {
                        qr5.e0(qr5Var, z2, 2);
                    } else {
                        qr5.g0(qr5Var, z2, 2);
                    }
                }
            }
            k37Var.k();
        }
    }

    public final void f(qr5 qr5Var) {
        k37<qr5> k37VarL = qr5Var.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var2 = qr5VarArr[i2];
            if (xj5.a(qr5Var2.T(), Boolean.TRUE) && !qr5Var2.j0) {
                if (this.b.b(qr5Var2)) {
                    qr5Var2.U();
                }
                f(qr5Var2);
            }
        }
    }

    public final void g(qr5 qr5Var, boolean z) {
        if (!this.c) {
            uc5.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? qr5Var.Z.e : qr5Var.E()) {
            uc5.a("node not yet measured");
        }
        h(qr5Var, z);
    }

    public final void h(qr5 qr5Var, boolean z) {
        hf6 hf6Var;
        cf6 cf6Var;
        k37<qr5> k37VarL = qr5Var.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var2 = qr5VarArr[i2];
            qr5.f fVar = qr5.f.t;
            if ((!z && (qr5Var2.F() == fVar || qr5Var2.Z.p.R.f())) || (z && (qr5Var2.G() == fVar || ((hf6Var = qr5Var2.Z.q) != null && (cf6Var = hf6Var.L) != null && cf6Var.f())))) {
                boolean zD = x10.d(qr5Var2);
                vr5 vr5Var = qr5Var2.Z;
                if (zD && !z) {
                    if (vr5Var.e && this.b.b(qr5Var2)) {
                        o(qr5Var2, true);
                    } else {
                        g(qr5Var2, true);
                    }
                }
                if (z ? vr5Var.e : qr5Var2.E()) {
                    o(qr5Var2, z);
                }
                if (!(z ? vr5Var.e : qr5Var2.E())) {
                    h(qr5Var2, z);
                }
            }
        }
        if (z ? qr5Var.Z.e : qr5Var.E()) {
            o(qr5Var, z);
        }
    }

    public final boolean l(cm.n nVar) {
        boolean z;
        boolean z2;
        qr5 qr5VarFirst;
        boolean z3;
        boolean zO;
        jy2 jy2Var = this.b;
        qr5 qr5Var = this.a;
        if (!qr5Var.e()) {
            uc5.a("performMeasureAndLayout called with unattached root");
        }
        if (!qr5Var.j()) {
            uc5.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            uc5.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean zC = jy2Var.c();
                hy2 hy2Var = jy2Var.a;
                if (zC) {
                    z = false;
                    while (true) {
                        hy2 hy2Var2 = jy2Var.c;
                        hy2 hy2Var3 = jy2Var.b;
                        if (!hy2Var.a.isEmpty()) {
                            qr5VarFirst = hy2Var.a.first();
                            hy2Var.b(qr5VarFirst);
                            z3 = qr5VarFirst.A != null;
                            z2 = false;
                        } else if (!hy2Var3.a.isEmpty()) {
                            qr5VarFirst = hy2Var3.a.first();
                            hy2Var3.b(qr5VarFirst);
                            z3 = qr5VarFirst.A != null;
                            z2 = true;
                        } else {
                            if (hy2Var2.a.isEmpty()) {
                                break;
                            }
                            qr5 qr5VarFirst2 = hy2Var2.a.first();
                            hy2Var2.b(qr5VarFirst2);
                            z2 = true;
                            qr5VarFirst = qr5VarFirst2;
                            z3 = false;
                        }
                        if (z2) {
                            zO = a(this, qr5VarFirst, z3);
                        } else {
                            zO = o(qr5VarFirst, z3);
                            if (qr5VarFirst.Z.f) {
                                jy2Var.a(qr5VarFirst, jk5.u);
                            }
                            if (qr5VarFirst.D()) {
                                jy2Var.a(qr5VarFirst, jk5.w);
                            }
                        }
                        if (qr5VarFirst == qr5Var && zO) {
                            z = true;
                        }
                    }
                    if (nVar != null) {
                        nVar.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.c = false;
                    this.d = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        k37<mn7.a> k37Var = this.f;
        mn7.a[] aVarArr = k37Var.t;
        int i = k37Var.v;
        for (int i2 = 0; i2 < i; i2++) {
            aVarArr[i2].b();
        }
        k37Var.k();
        return z;
    }

    public final void m(qr5 qr5Var, long j) {
        boolean z = qr5Var.j0;
        vr5 vr5Var = qr5Var.Z;
        if (z) {
            return;
        }
        qr5 qr5Var2 = this.a;
        if (qr5Var == qr5Var2) {
            uc5.a("measureAndLayout called on root");
        }
        if (!qr5Var2.e()) {
            uc5.a("performMeasureAndLayout called with unattached root");
        }
        if (!qr5Var2.j()) {
            uc5.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            uc5.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                jy2 jy2Var = this.b;
                jy2Var.a.b(qr5Var);
                jy2Var.b.b(qr5Var);
                jy2Var.c.b(qr5Var);
                if (c(qr5Var, new xx1(j)) || vr5Var.f) {
                    if (xj5.a(qr5Var.T(), Boolean.TRUE)) {
                        qr5Var.U();
                    }
                }
                f(qr5Var);
                if (qr5Var.V == qr5.f.v) {
                    qr5Var.o();
                }
                boolean zX0 = vr5Var.p.x0(j);
                qr5 qr5VarI = qr5Var.I();
                if (zX0 && qr5VarI != null) {
                    if (qr5Var.F() == qr5.f.t) {
                        qr5.g0(qr5VarI, false, 3);
                    } else if (qr5Var.F() == qr5.f.u) {
                        qr5VarI.f0(false);
                    }
                }
                if (qr5Var.D() && qr5Var.j()) {
                    qr5Var.c0();
                    vh7 vh7Var = this.e;
                    vh7Var.getClass();
                    if (qr5Var.i0 > 0) {
                        vh7Var.a.d(qr5Var);
                        qr5Var.h0 = true;
                    }
                }
                e();
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.c = false;
                    this.d = false;
                    throw th2;
                }
            }
        }
        k37<mn7.a> k37Var = this.f;
        mn7.a[] aVarArr = k37Var.t;
        int i = k37Var.v;
        for (int i2 = 0; i2 < i; i2++) {
            aVarArr[i2].b();
        }
        k37Var.k();
    }

    public final void n() {
        jy2 jy2Var = this.b;
        if (jy2Var.c()) {
            qr5 qr5Var = this.a;
            if (!qr5Var.e()) {
                uc5.a("performMeasureAndLayout called with unattached root");
            }
            if (!qr5Var.j()) {
                uc5.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                uc5.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((jy2Var.c.a.isEmpty() || jy2Var.a.a.isEmpty()) ? false : true) {
                        if (qr5Var.A != null) {
                            q(qr5Var, true);
                        } else {
                            p(qr5Var);
                        }
                    }
                    q(qr5Var, false);
                    this.c = false;
                    this.d = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.c = false;
                        this.d = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean o(qr5 qr5Var, boolean z) {
        xx1 xx1Var;
        boolean zD = false;
        if (!qr5Var.j0 && k(qr5Var)) {
            if (qr5Var == this.a) {
                xx1Var = this.i;
                xx1Var.getClass();
            } else {
                xx1Var = null;
            }
            if (z) {
                if (qr5Var.Z.e) {
                    zD = c(qr5Var, xx1Var);
                }
            } else if (qr5Var.E()) {
                zD = d(qr5Var, xx1Var);
            }
            e();
        }
        return zD;
    }

    public final void p(qr5 qr5Var) {
        k37<qr5> k37VarL = qr5Var.L();
        qr5[] qr5VarArr = k37VarL.t;
        int i = k37VarL.v;
        for (int i2 = 0; i2 < i; i2++) {
            qr5 qr5Var2 = qr5VarArr[i2];
            if (qr5Var2.F() == qr5.f.t || qr5Var2.Z.p.R.f()) {
                if (x10.d(qr5Var2)) {
                    q(qr5Var2, true);
                } else {
                    p(qr5Var2);
                }
            }
        }
    }

    public final void q(qr5 qr5Var, boolean z) {
        xx1 xx1Var;
        if (qr5Var.j0) {
            return;
        }
        if (qr5Var == this.a) {
            xx1Var = this.i;
            xx1Var.getClass();
        } else {
            xx1Var = null;
        }
        if (z) {
            c(qr5Var, xx1Var);
        } else {
            d(qr5Var, xx1Var);
        }
    }

    public final boolean r(qr5 qr5Var, boolean z) {
        int iOrdinal = qr5Var.Z.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.d(new a(qr5Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    u.b();
                    return false;
                }
                if (!qr5Var.E() || z) {
                    qr5Var.Z.p.O = true;
                    if (!qr5Var.j0 && (qr5Var.j() || j(qr5Var))) {
                        qr5 qr5VarI = qr5Var.I();
                        if (qr5VarI == null || !qr5VarI.E()) {
                            this.b.a(qr5Var, jk5.v);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void s(long j) {
        xx1 xx1Var = this.i;
        if (xx1Var == null ? false : xx1.b(xx1Var.a, j)) {
            return;
        }
        if (this.c) {
            uc5.a("updateRootConstraints called while measuring");
        }
        this.i = new xx1(j);
        qr5 qr5Var = this.a;
        qr5 qr5Var2 = qr5Var.A;
        vr5 vr5Var = qr5Var.Z;
        if (qr5Var2 != null) {
            vr5Var.e = true;
        }
        vr5Var.p.O = true;
        this.b.a(qr5Var, qr5Var2 != null ? jk5.t : jk5.v);
    }
}
