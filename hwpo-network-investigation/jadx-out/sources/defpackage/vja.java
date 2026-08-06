package defpackage;

import android.os.Trace;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vja extends ox6.c implements lr5, a73, qb9 {
    public String H;
    public wja I;
    public qa4.a J;
    public int K;
    public boolean L;
    public int M;
    public int N;
    public HashMap O;
    public rs7 P;
    public wja Q;
    public tja R;
    public a S;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String a;
        public String b;
        public boolean c = false;
        public rs7 d = null;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.a, aVar.a) && xj5.a(this.b, aVar.b) && this.c == aVar.c && xj5.a(this.d, aVar.d);
        }

        public final int hashCode() {
            int iA = uo2.a(ru3.c(this.a.hashCode() * 31, 31, this.b), this.c, 31);
            rs7 rs7Var = this.d;
            return iA + (rs7Var == null ? 0 : rs7Var.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
            sb.append(this.d);
            sb.append(", isShowingSubstitution=");
            return pi1.a(sb, this.c, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [oh4] */
    /* JADX WARN: Type inference failed for: r0v2, types: [tja] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        tja tjaVar = this.R;
        ?? r0 = tjaVar;
        if (tjaVar == null) {
            ?? r1 = new oh4() { // from class: tja
                /* JADX WARN: Code duplicated, block: B:4:0x0024  */
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    tx2 tx2Var;
                    ria riaVar;
                    List list = (List) obj;
                    vja vjaVar = this.t;
                    rs7 rs7VarC2 = vjaVar.c2();
                    wja wjaVarE = wja.e(vjaVar.I, uh1.k, 0L, null, 0L, 0, 0L, 16777214);
                    tq5 tq5Var = rs7VarC2.o;
                    ria riaVar2 = null;
                    if (tq5Var == null || (tx2Var = rs7VarC2.i) == null) {
                        riaVar = null;
                    } else {
                        iw iwVar = new iw(rs7VarC2.a);
                        if (rs7VarC2.j == null || rs7VarC2.n == null) {
                            riaVar = null;
                        } else {
                            long j = rs7VarC2.p & (-8589934589L);
                            int i = rs7VarC2.f;
                            boolean z = rs7VarC2.e;
                            int i2 = rs7VarC2.d;
                            qa4.a aVar = rs7VarC2.c;
                            hf3 hf3Var = hf3.t;
                            riaVar = new ria(new qia(iwVar, wjaVarE, hf3Var, i, z, i2, tx2Var, tq5Var, aVar, j), new l07(new m07(iwVar, wjaVarE, hf3Var, tx2Var, aVar), j, rs7VarC2.f, rs7VarC2.d), rs7VarC2.l);
                        }
                    }
                    if (riaVar != null) {
                        list.add(riaVar);
                        riaVar2 = riaVar;
                    }
                    return Boolean.valueOf(riaVar2 != null);
                }
            };
            this.R = r1;
            r0 = r1;
        }
        iw iwVar = new iw(this.H);
        ho5<Object>[] ho5VarArr = ec9.a;
        hc9Var.d(ac9.C, ws0.h(iwVar));
        a aVar = this.S;
        if (aVar != null) {
            boolean z = aVar.c;
            gc9<Boolean> gc9Var = ac9.E;
            ho5<Object>[] ho5VarArr2 = ec9.a;
            ho5<Object> ho5Var = ho5VarArr2[17];
            hc9Var.d(gc9Var, Boolean.valueOf(z));
            iw iwVar2 = new iw(aVar.b);
            gc9<iw> gc9Var2 = ac9.D;
            ho5<Object> ho5Var2 = ho5VarArr2[16];
            hc9Var.d(gc9Var2, iwVar2);
        }
        hc9Var.d(kb9.l, new k3(null, new mf(1, this)));
        hc9Var.d(kb9.m, new k3(null, new md3(1, this)));
        hc9Var.d(kb9.n, new k3(null, new mh4() { // from class: uja
            @Override // defpackage.mh4
            public final Object invoke() {
                vja vjaVar = this.t;
                vjaVar.S = null;
                ew2.f(vjaVar).R();
                ew2.f(vjaVar).Q();
                b73.a(vjaVar);
                return Boolean.TRUE;
            }
        }));
        ec9.a(hc9Var, r0);
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    public final rs7 c2() {
        wja wjaVar = this.Q;
        if (wjaVar == null) {
            wjaVar = this.I;
        }
        wja wjaVar2 = wjaVar;
        if (this.P == null) {
            this.P = new rs7(this.H, wjaVar2, this.J, this.K, this.L, this.M, this.N);
        }
        rs7 rs7Var = this.P;
        rs7Var.getClass();
        return rs7Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    public final rs7 d2(hl6 hl6Var) {
        rs7 rs7VarC2;
        if (e2(1)) {
            wja wjaVar = this.Q;
            if (wjaVar == null) {
                wjaVar = this.I;
            }
            c2().f(this.H, wjaVar, this.J, this.K, this.L, this.M, this.N);
        }
        a aVar = this.S;
        if (aVar == null) {
            rs7VarC2 = c2();
        } else {
            if (!aVar.c) {
                aVar = null;
            }
            if (aVar == null || (rs7VarC2 = aVar.d) == null) {
                rs7VarC2 = c2();
            }
        }
        rs7VarC2.d(hl6Var);
        return rs7VarC2;
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            rs7 rs7VarD2 = d2(hl6Var);
            boolean zB = rs7VarD2.b(j, hl6Var.getLayoutDirection());
            ps7 ps7Var = rs7VarD2.n;
            if (ps7Var != null) {
                ps7Var.a();
            }
            g2b g2bVar = g2b.a;
            qp qpVar = rs7VarD2.j;
            qpVar.getClass();
            long j2 = rs7VarD2.l;
            if (zB) {
                ew2.d(this, 2).E1();
                HashMap map = this.O;
                if (map == null) {
                    map = new HashMap(2);
                    this.O = map;
                }
                map.put(fi.a, Integer.valueOf(Math.round(qpVar.b())));
                map.put(fi.b, Integer.valueOf(Math.round(qpVar.d())));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            jz7 jz7VarE = cl6Var.E(xx1.a.b(i, i, i2, i2));
            HashMap map2 = this.O;
            map2.getClass();
            return hl6Var.y0(i, i2, map2, new ql0(2, jz7VarE));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, wja] */
    public final boolean e2(int i) {
        wja wjaVar = this.Q;
        ?? r0 = this.I;
        gl8 gl8Var = new gl8();
        gl8Var.t = r0;
        yx.e(this, "StyleOuterNode", new e71(2));
        wja wjaVar2 = (wja) gl8Var.t;
        this.Q = wjaVar2;
        if (wjaVar == null) {
            return false;
        }
        return !wjaVar.equals(wjaVar2);
    }

    @Override // defpackage.lr5
    public final int f(df6 df6Var, pj5 pj5Var, int i) {
        return d2(df6Var).a(i, df6Var.getLayoutDirection());
    }

    @Override // defpackage.lr5
    public final int j(df6 df6Var, pj5 pj5Var, int i) {
        return d2(df6Var).a(i, df6Var.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // defpackage.a73
    public final void t(tr5 tr5Var) {
        rs7 rs7VarC2;
        if (this.G) {
            a aVar = this.S;
            if (aVar == null) {
                rs7VarC2 = c2();
            } else {
                if (!aVar.c) {
                    aVar = null;
                }
                if (aVar == null || (rs7VarC2 = aVar.d) == null) {
                    rs7VarC2 = c2();
                }
            }
            qp qpVar = rs7VarC2.j;
            if (qpVar == null) {
                xc5.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.P + ", textSubstitution=" + this.S + ')');
                fl.a();
                return;
            }
            n41 n41VarA = tr5Var.t.u.a();
            boolean z = rs7VarC2.k;
            if (z) {
                long j = rs7VarC2.l;
                n41VarA.f();
                n41VarA.m(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                e2(2);
                wja wjaVar = this.Q;
                if (wjaVar == null) {
                    wjaVar = this.I;
                }
                ww9 ww9Var = wjaVar.a;
                fda fdaVar = ww9Var.m;
                if (fdaVar == null) {
                    fdaVar = fda.b;
                }
                fda fdaVar2 = fdaVar;
                el9 el9Var = ww9Var.n;
                if (el9Var == null) {
                    el9Var = el9.d;
                }
                el9 el9Var2 = el9Var;
                e73 e73Var = ww9Var.p;
                if (e73Var == null) {
                    e73Var = zy3.a;
                }
                e73 e73Var2 = e73Var;
                fx0 fx0VarE = ww9Var.a.e();
                if (fx0VarE != null) {
                    qpVar.i(n41VarA, fx0VarE, wjaVar.a.a.a(), el9Var2, fdaVar2, e73Var2);
                } else {
                    long jB = uh1.k;
                    if (jB == 16) {
                        jB = wjaVar.b() != 16 ? wjaVar.b() : uh1.b;
                    }
                    qpVar.h(n41VarA, jB, el9Var2, fdaVar2, e73Var2);
                }
            } finally {
                if (z) {
                    n41VarA.o();
                }
            }
        }
    }

    @Override // defpackage.lr5
    public final int v(df6 df6Var, pj5 pj5Var, int i) {
        return ida.a(d2(df6Var).e(df6Var.getLayoutDirection()).b());
    }

    @Override // defpackage.lr5
    public final int x(df6 df6Var, pj5 pj5Var, int i) {
        return ida.a(d2(df6Var).e(df6Var.getLayoutDirection()).c());
    }
}
