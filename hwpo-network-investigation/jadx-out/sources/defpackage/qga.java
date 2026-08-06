package defpackage;

import android.content.ClipDescription;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qga {
    public final a A;
    public boolean B;
    public final z1b a;
    public ag7 b;
    public oh4<? super kha, g2b> c;
    public u56 d;
    public final dt7 e;
    public mh4<g2b> f;
    public pf1 g;
    public t72 h;
    public j18 i;
    public xja j;
    public st4 k;
    public p94 l;
    public final dt7 m;
    public final dt7 n;
    public long o;
    public lja p;
    public long q;
    public final dt7 r;
    public final dt7 s;
    public int t;
    public kha u;
    public rq9 v;
    public lja w;
    public final dt7 x;
    public final mqa y;
    public final b z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements bz6 {
        public boolean a = true;
        public lja b;

        public a() {
        }

        @Override // defpackage.bz6
        public final boolean a(long j, ca9 ca9Var) {
            u56 u56Var;
            qga qgaVar = qga.this;
            if (!qgaVar.k() || qgaVar.n().a.u.length() == 0 || (u56Var = qgaVar.d) == null || u56Var.d() == null) {
                return false;
            }
            f(qgaVar.n(), j, false, ca9Var);
            return true;
        }

        @Override // defpackage.bz6
        public final boolean b(long j) {
            u56 u56Var;
            qga qgaVar = qga.this;
            if (!qgaVar.k() || qgaVar.n().a.u.length() == 0 || (u56Var = qgaVar.d) == null || u56Var.d() == null) {
                return false;
            }
            f(qgaVar.n(), j, false, ca9.a.a);
            return true;
        }

        @Override // defpackage.bz6
        public final void c() {
            if (this.a) {
                qga.b(qga.this, this.b);
            }
        }

        @Override // defpackage.bz6
        public final boolean d(long j) {
            qga qgaVar = qga.this;
            u56 u56Var = qgaVar.d;
            if (u56Var == null || u56Var.d() == null || !qgaVar.k()) {
                return false;
            }
            qgaVar.t = -1;
            p94 p94Var = qgaVar.l;
            if (p94Var != null) {
                p94.a(p94Var);
            }
            f(qgaVar.n(), j, false, ca9.a.a);
            return true;
        }

        @Override // defpackage.bz6
        public final boolean e(long j, ca9 ca9Var, int i) {
            u56 u56Var;
            qga qgaVar = qga.this;
            if (!qgaVar.k() || qgaVar.n().a.u.length() == 0 || (u56Var = qgaVar.d) == null || u56Var.d() == null) {
                return false;
            }
            p94 p94Var = qgaVar.l;
            if (p94Var != null) {
                p94.a(p94Var);
            }
            qgaVar.o = j;
            qgaVar.t = -1;
            qgaVar.h(true);
            long jF = f(qgaVar.n(), qgaVar.o, true, ca9Var);
            if (i >= 2) {
                this.a = true;
                this.b = new lja(jF);
            }
            return true;
        }

        public final long f(kha khaVar, long j, boolean z, ca9 ca9Var) {
            qga qgaVar = qga.this;
            long jC = qga.c(qgaVar, khaVar, j, z, false, ca9Var, false, null);
            if (!lja.a(jC, this.b)) {
                this.a = false;
            }
            qgaVar.q(lja.c(jC) ? bt4.v : bt4.u);
            return jC;
        }
    }

    public qga(z1b z1bVar) {
        this.a = z1bVar;
        this.b = n7b.a;
        this.c = new o57(2);
        this.e = bl7.i(new kha(7, 0L, (String) null));
        Boolean bool = Boolean.TRUE;
        this.m = bl7.i(bool);
        this.n = bl7.i(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = bl7.i(null);
        this.s = bl7.i(null);
        this.t = -1;
        this.u = new kha(7, 0L, (String) null);
        this.x = bl7.i(Boolean.FALSE);
        mqa mqaVar = new mqa();
        mqaVar.b = lqa.t;
        this.y = mqaVar;
        this.z = new b();
        this.A = new a();
    }

    public static final js7 a(qga qgaVar) {
        String str;
        lja ljaVar;
        iw iwVarM = qgaVar.m();
        if (iwVarM == null || (str = iwVarM.u) == null || (ljaVar = qgaVar.w) == null) {
            return null;
        }
        long j = ljaVar.a;
        return new js7(str, new lja(ay.c(qgaVar.b.b((int) (j >> 32)), qgaVar.b.b((int) (j & 4294967295L)))));
    }

    public static final void b(qga qgaVar, lja ljaVar) {
        iw iwVarM;
        String str;
        t72 t72Var;
        if (ljaVar == null) {
            return;
        }
        long j = ljaVar.a;
        j18 j18Var = qgaVar.i;
        if (j18Var == null || (iwVarM = qgaVar.m()) == null || (str = iwVarM.u) == null) {
            return;
        }
        ag7 ag7Var = qgaVar.b;
        long jC = ay.c(ag7Var.b((int) (j >> 32)), ag7Var.b((int) (j & 4294967295L)));
        if (str.length() <= 0 || lja.c(jC) || (t72Var = qgaVar.h) == null) {
            return;
        }
        oy0.d(t72Var, null, null, new pga(j18Var, str, jC, ljaVar, qgaVar, ag7Var, null), 3);
    }

    public static final long c(qga qgaVar, kha khaVar, long j, boolean z, boolean z2, ca9 ca9Var, boolean z3, tt4 tt4Var) {
        sia siaVarD;
        long j2;
        int i;
        long j3;
        ba9 ba9Var;
        boolean z4;
        boolean z5;
        st4 st4Var;
        u56 u56Var = qgaVar.d;
        if (u56Var == null || (siaVarD = u56Var.d()) == null) {
            return lja.b;
        }
        ag7 ag7Var = qgaVar.b;
        long j4 = khaVar.b;
        iw iwVar = khaVar.a;
        int i2 = lja.c;
        long jC = ay.c(ag7Var.b((int) (j4 >> 32)), qgaVar.b.b((int) (j4 & 4294967295L)));
        int iB = siaVarD.b(j, false);
        int i3 = (z2 || z) ? iB : (int) (jC >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iB;
        } else {
            j2 = 4294967295L;
            i = (int) (jC & 4294967295L);
        }
        rq9 rq9Var = qgaVar.v;
        int i4 = -1;
        if (z || rq9Var == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i5 = qgaVar.t;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        ria riaVar = siaVarD.a;
        if (z) {
            ba9Var = null;
        } else {
            int i6 = (int) (jC >> 32);
            int i7 = (int) (jC & j3);
            ba9Var = new ba9(new ba9.a(b47.c(riaVar, i6), i6, 1L), new ba9.a(b47.c(riaVar, i7), i7, 1L), lja.g(jC));
        }
        rq9 rq9Var2 = new rq9(z2, ba9Var, new u99(i3, i, i4, riaVar));
        if (ba9Var != null && rq9Var != null && z2 == rq9Var.a) {
            u99 u99Var = rq9Var.c;
            if (i3 == u99Var.a && i == u99Var.b) {
                return j4;
            }
        }
        qgaVar.v = rq9Var2;
        qgaVar.t = iB;
        ba9 ba9VarA = ca9Var.a(rq9Var2);
        long jC2 = ay.c(qgaVar.b.a(ba9VarA.a.b), qgaVar.b.a(ba9VarA.b.b));
        if (lja.b(jC2, j4)) {
            return j4;
        }
        boolean z6 = lja.g(jC2) != lja.g(j4) && lja.b(ay.c((int) (jC2 & j3), (int) (jC2 >> 32)), j4);
        boolean z7 = lja.c(jC2) && lja.c(j4);
        if (z3 && iwVar.u.length() > 0 && !z6 && !z7 && tt4Var != null && (st4Var = qgaVar.k) != null) {
            st4Var.a(tt4Var.a);
        }
        qgaVar.c.invoke(e(iwVar, jC2));
        qgaVar.w = new lja(jC2);
        if (!z3) {
            qgaVar.t(!lja.c(jC2));
        }
        u56 u56Var2 = qgaVar.d;
        if (u56Var2 != null) {
            u56Var2.q.setValue(Boolean.valueOf(z3));
        }
        u56 u56Var3 = qgaVar.d;
        if (u56Var3 != null) {
            u56Var3.m.setValue(Boolean.valueOf(!lja.c(jC2) && eha.a(qgaVar, true)));
        }
        u56 u56Var4 = qgaVar.d;
        if (u56Var4 != null) {
            if (lja.c(jC2)) {
                z4 = false;
            } else {
                z4 = false;
                if (eha.a(qgaVar, false)) {
                    z5 = true;
                }
                u56Var4.n.setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            u56Var4.n.setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        u56 u56Var5 = qgaVar.d;
        if (u56Var5 != null) {
            u56Var5.o.setValue(Boolean.valueOf((lja.c(jC2) && eha.a(qgaVar, true)) ? true : z4));
        }
        return jC2;
    }

    public static kha e(iw iwVar, long j) {
        return new kha(iwVar, j, (lja) null);
    }

    public final dz9 d(boolean z) {
        t72 t72Var = this.h;
        if (t72Var == null) {
            return null;
        }
        return oy0.d(t72Var, null, x72.w, new lga(this, z, null), 1);
    }

    public final void f() {
        t72 t72Var = this.h;
        if (t72Var != null) {
            oy0.d(t72Var, null, x72.w, new nga(this, null), 1);
        }
    }

    public final void g(vf7 vf7Var) {
        if (!lja.c(n().b)) {
            u56 u56Var = this.d;
            sia siaVarD = u56Var != null ? u56Var.d() : null;
            int iE = (vf7Var == null || siaVarD == null) ? lja.e(n().b) : this.b.a(siaVarD.b(vf7Var.a, true));
            kha khaVarA = kha.a(n(), null, ay.c(iE, iE), 5);
            this.c.invoke(khaVarA);
            this.w = new lja(khaVarA.b);
        }
        q((vf7Var == null || n().a.u.length() <= 0) ? bt4.t : bt4.v);
        t(false);
    }

    public final void h(boolean z) {
        p94 p94Var;
        u56 u56Var = this.d;
        if (u56Var != null && !u56Var.b() && (p94Var = this.l) != null) {
            p94.a(p94Var);
        }
        this.u = n();
        t(z);
        q(bt4.u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vf7 i() {
        return (vf7) this.s.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long l(boolean z) {
        sia siaVarD;
        long j;
        u56 u56Var = this.d;
        if (u56Var == null || (siaVarD = u56Var.d()) == null) {
            return 9205357640488583168L;
        }
        ria riaVar = siaVarD.a;
        l07 l07Var = riaVar.b;
        iw iwVarM = m();
        if (iwVarM == null) {
            return 9205357640488583168L;
        }
        if (!xj5.a(iwVarM.u, riaVar.a.a.u)) {
            return 9205357640488583168L;
        }
        kha khaVarN = n();
        if (z) {
            long j2 = khaVarN.b;
            int i = lja.c;
            j = j2 >> 32;
        } else {
            long j3 = khaVarN.b;
            int i2 = lja.c;
            j = j3 & 4294967295L;
        }
        int iB = this.b.b((int) j);
        boolean zG = lja.g(n().b);
        long j4 = riaVar.c;
        int iD = l07Var.d(iB);
        if (iD >= l07Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = riaVar.a(((!z || zG) && (z || !zG)) ? Math.max(iB + (-1), 0) : iB) == riaVar.h(iB);
        l07Var.l(iB);
        int length = l07Var.a.a.u.length();
        ArrayList arrayList = l07Var.h;
        ns7 ns7Var = (ns7) arrayList.get(iB == length ? ws0.g(arrayList) : sm3.b(iB, arrayList));
        qp qpVar = ns7Var.a;
        int iD2 = ns7Var.d(iB);
        nia niaVar = qpVar.d;
        return (((long) Float.floatToRawIntBits(uh8.f(l07Var.b(iD), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(uh8.f(z2 ? niaVar.h(iD2, false) : niaVar.i(iD2, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    public final iw m() {
        u56 u56Var = this.d;
        if (u56Var != null) {
            return u56Var.a.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kha n() {
        return (kha) this.e.getValue();
    }

    public final void o() {
        dz9 dz9Var;
        eda edaVar = this.y.a;
        if (edaVar == null || (dz9Var = edaVar.N) == null) {
            return;
        }
        dz9Var.k(null);
        edaVar.N = null;
    }

    public final void p() {
        t72 t72Var = this.h;
        if (t72Var != null) {
            oy0.d(t72Var, null, x72.w, new rga(this, null), 1);
        }
    }

    public final void q(bt4 bt4Var) {
        u56 u56Var = this.d;
        if (u56Var != null) {
            if (u56Var.a() == bt4Var) {
                u56Var = null;
            }
            if (u56Var != null) {
                u56Var.k.setValue(bt4Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        u56 u56Var;
        wca wcaVar;
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            if (k() && ((u56Var = this.d) == null || ((Boolean) u56Var.q.getValue()).booleanValue())) {
                g2b g2bVar = g2b.a;
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                mqa mqaVar = this.y;
                if (mqaVar.b == lqa.t) {
                    xc5.c("ToolbarRequester is not initialized.");
                }
                eda edaVar = mqaVar.a;
                if (edaVar == null || !edaVar.G) {
                    return;
                }
                dz9 dz9Var = edaVar.N;
                if ((dz9Var == null || !dz9Var.h()) && (wcaVar = (wca) ku1.a(edaVar, yca.b)) != null) {
                    edaVar.N = oy0.d(edaVar.Q1(), null, x72.w, new dda(edaVar, wcaVar, null), 1);
                    return;
                }
                return;
            }
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
        } catch (Throwable th) {
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(u02 u02Var) throws Throwable {
        sga sgaVar;
        if (u02Var instanceof sga) {
            sgaVar = (sga) u02Var;
            int i = sgaVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgaVar.w = i - Integer.MIN_VALUE;
            } else {
                sgaVar = new sga(this, u02Var);
            }
        } else {
            sgaVar = new sga(this, u02Var);
        }
        Object objValueOf = sgaVar.u;
        int i2 = sgaVar.w;
        if (i2 == 0) {
            dv8.b(objValueOf);
            pf1 pf1Var = this.g;
            if (pf1Var != null) {
                sgaVar.t = this;
                sgaVar.w = 1;
                ClipDescription primaryClipDescription = pf1Var.b().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                Object obj = v72.t;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return g2b.a;
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = sgaVar.t;
        dv8.b(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.x.setValue(bool);
        return g2b.a;
    }

    public final void t(boolean z) {
        u56 u56Var = this.d;
        if (u56Var != null) {
            u56Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            r();
        } else {
            o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements lda {
        public lja b;
        public boolean a = true;
        public ca9 c = ca9.a.a;

        public b() {
        }

        @Override // defpackage.lda
        public final void a() {
            f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lda
        public final void b(long j, ca9 ca9Var) {
            long j2;
            sia siaVarD;
            sia siaVarD2;
            qga qgaVar = qga.this;
            dt7 dt7Var = qgaVar.r;
            if (qgaVar.k() && ((ys4) dt7Var.getValue()) == null) {
                dt7Var.setValue(ys4.v);
                qgaVar.t = -1;
                this.a = true;
                this.c = ca9Var;
                qgaVar.o();
                u56 u56Var = qgaVar.d;
                if (u56Var == null || (siaVarD2 = u56Var.d()) == null || !siaVarD2.c(j)) {
                    j2 = j;
                    u56 u56Var2 = qgaVar.d;
                    if (u56Var2 != null && (siaVarD = u56Var2.d()) != null) {
                        int iA = qgaVar.b.a(siaVarD.b(j2, true));
                        kha khaVarE = qga.e(qgaVar.n().a, ay.c(iA, iA));
                        qgaVar.h(false);
                        st4 st4Var = qgaVar.k;
                        if (st4Var != null) {
                            st4Var.a(0);
                        }
                        qgaVar.c.invoke(khaVarE);
                        qgaVar.w = new lja(khaVarE.b);
                    }
                    this.a = false;
                } else {
                    if (qgaVar.n().a.u.length() == 0) {
                        return;
                    }
                    qgaVar.h(false);
                    long jC = qga.c(qgaVar, kha.a(qgaVar.n(), null, lja.b, 5), j, true, false, this.c, true, new tt4(0));
                    j2 = j;
                    qgaVar.p = new lja(jC);
                    this.b = new lja(jC);
                }
                qgaVar.q(bt4.t);
                qgaVar.o = j2;
                qgaVar.s.setValue(new vf7(j2));
                qgaVar.q = 0L;
            }
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0096  */
        /* JADX WARN: Code duplicated, block: B:23:0x009a  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
        @Override // defpackage.lda
        public final void e(long j) {
            sia siaVarD;
            lja ljaVar;
            int iB;
            long jC;
            qga qgaVar = qga.this;
            if (!qgaVar.k() || qgaVar.n().a.u.length() == 0) {
                return;
            }
            qgaVar.q = vf7.e(qgaVar.q, j);
            u56 u56Var = qgaVar.d;
            if (u56Var != null && (siaVarD = u56Var.d()) != null) {
                qgaVar.s.setValue(new vf7(vf7.e(qgaVar.o, qgaVar.q)));
                if (qgaVar.p == null) {
                    vf7 vf7VarI = qgaVar.i();
                    vf7VarI.getClass();
                    if (siaVarD.c(vf7VarI.a)) {
                        ljaVar = qgaVar.p;
                        if (ljaVar != null) {
                            iB = (int) (ljaVar.a >> 32);
                        } else {
                            iB = siaVarD.b(qgaVar.o, false);
                        }
                        vf7 vf7VarI2 = qgaVar.i();
                        vf7VarI2.getClass();
                        int iB2 = siaVarD.b(vf7VarI2.a, false);
                        if (qgaVar.p != null && iB == iB2) {
                            return;
                        }
                        kha khaVarN = qgaVar.n();
                        vf7 vf7VarI3 = qgaVar.i();
                        vf7VarI3.getClass();
                        jC = qga.c(qgaVar, khaVarN, vf7VarI3.a, false, false, this.c, true, new tt4(9));
                    } else {
                        int iA = qgaVar.b.a(siaVarD.b(qgaVar.o, true));
                        ag7 ag7Var = qgaVar.b;
                        vf7 vf7VarI4 = qgaVar.i();
                        vf7VarI4.getClass();
                        ca9 ca9Var = iA == ag7Var.a(siaVarD.b(vf7VarI4.a, true)) ? ca9.a.a : ca9.a.b;
                        kha khaVarN2 = qgaVar.n();
                        vf7 vf7VarI5 = qgaVar.i();
                        vf7VarI5.getClass();
                        jC = qga.c(qgaVar, khaVarN2, vf7VarI5.a, false, false, ca9Var, true, new tt4(9));
                    }
                } else {
                    ljaVar = qgaVar.p;
                    if (ljaVar != null) {
                        iB = (int) (ljaVar.a >> 32);
                    } else {
                        iB = siaVarD.b(qgaVar.o, false);
                    }
                    vf7 vf7VarI6 = qgaVar.i();
                    vf7VarI6.getClass();
                    int iB3 = siaVarD.b(vf7VarI6.a, false);
                    if (qgaVar.p != null) {
                    }
                    kha khaVarN3 = qgaVar.n();
                    vf7 vf7VarI7 = qgaVar.i();
                    vf7VarI7.getClass();
                    jC = qga.c(qgaVar, khaVarN3, vf7VarI7.a, false, false, this.c, true, new tt4(9));
                }
                this.b = new lja(jC);
                if (!lja.a(jC, qgaVar.p)) {
                    this.a = false;
                }
            }
            qgaVar.t(false);
        }

        public final void f() {
            qga qgaVar = qga.this;
            qgaVar.r.setValue(null);
            qgaVar.s.setValue(null);
            this.c = ca9.a.a;
            qgaVar.t(true);
            lja ljaVar = this.b;
            boolean zC = lja.c(ljaVar != null ? ljaVar.a : qgaVar.n().b);
            qgaVar.q(zC ? bt4.v : bt4.u);
            u56 u56Var = qgaVar.d;
            if (u56Var != null) {
                u56Var.m.setValue(Boolean.valueOf(!zC && eha.a(qgaVar, true)));
            }
            u56 u56Var2 = qgaVar.d;
            if (u56Var2 != null) {
                u56Var2.n.setValue(Boolean.valueOf(!zC && eha.a(qgaVar, false)));
            }
            u56 u56Var3 = qgaVar.d;
            if (u56Var3 != null) {
                u56Var3.o.setValue(Boolean.valueOf(zC && eha.a(qgaVar, true)));
            }
            if (this.a) {
                qga.b(qgaVar, qgaVar.p);
            }
            qgaVar.p = null;
        }

        @Override // defpackage.lda
        public final void onCancel() {
            f();
        }

        @Override // defpackage.lda
        public final void c() {
        }

        @Override // defpackage.lda
        public final void d() {
        }
    }

    public qga() {
        this(null);
    }
}
