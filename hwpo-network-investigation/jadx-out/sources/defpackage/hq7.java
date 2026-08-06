package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hq7 {
    public static final void a(final dr7 dr7Var, final ox6 ox6Var, go7 go7Var, lp7 lp7Var, di.c cVar, n9a n9aVar, boolean z, b97 b97Var, du9 du9Var, in7 in7Var, final fr1 fr1Var, jt1 jt1Var, final int i) {
        final go7 go7Var2;
        final lp7 lp7Var2;
        final di.c cVar2;
        final n9a n9aVar2;
        final boolean z2;
        final b97 b97Var2;
        final du9 du9Var2;
        final in7 in7Var2;
        b97 b97Var3;
        int i2;
        in7 in7VarA;
        go7 go7Var3;
        boolean z3;
        lp7 lp7Var3;
        n9a n9aVar3;
        di.c cVar3;
        bj4 bj4VarO = jt1Var.o(1860873769);
        int i3 = i | (bj4VarO.J(dr7Var) ? 4 : 2) | (bj4VarO.J(ox6Var) ? 32 : 16) | 911961472;
        if (bj4VarO.A(i3 & 1, (306783379 & i3) != 306783378)) {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                ko7 ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                int i4 = (i3 & 14) | 196608;
                uq7 uq7Var = new uq7();
                an2 an2VarA = ky9.a(bj4VarO);
                Map<cza<?, ?>, Float> map = njb.a;
                ty9 ty9VarB = xv.b(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                tx2 tx2Var = (tx2) bj4VarO.F(qu1.h);
                tq5 tq5Var = (tq5) bj4VarO.F(qu1.n);
                boolean zJ = ((((i4 & 14) ^ 6) > 4 && bj4VarO.J(dr7Var)) || (i4 & 6) == 4) | bj4VarO.J(an2VarA) | bj4VarO.J(ty9VarB) | bj4VarO.J(uq7Var) | bj4VarO.J(tx2Var) | bj4VarO.h(tq5Var.ordinal());
                Object objF = bj4VarO.f();
                jt1.a.C0187a c0187a = jt1.a.a;
                if (zJ || objF == c0187a) {
                    xt9 xt9Var = new xt9(new vq7(dr7Var, new wp7(dr7Var, tq5Var), uq7Var), an2VarA, ty9VarB);
                    bj4VarO.C(xt9Var);
                    objF = xt9Var;
                }
                n9a n9aVar4 = (n9a) objF;
                int i5 = (-29360129) & i3;
                int i6 = (i3 & 14) | 432;
                boolean z4 = (((i6 & 14) ^ 6) > 4 && bj4VarO.J(dr7Var)) || (i6 & 6) == 4;
                Object objF2 = bj4VarO.f();
                if (z4 || objF2 == c0187a) {
                    objF2 = new ts2(dr7Var);
                    bj4VarO.C(objF2);
                }
                b97Var3 = (ts2) objF2;
                i2 = i5;
                in7VarA = kn7.a(bj4VarO);
                go7Var3 = ko7Var;
                z3 = true;
                lp7Var3 = lp7.a.a;
                n9aVar3 = n9aVar4;
                cVar3 = di.a.k;
                du9Var2 = du9.b.a;
            } else {
                bj4VarO.u();
                i2 = i3 & (-29360129);
                go7Var3 = go7Var;
                lp7Var3 = lp7Var;
                cVar3 = cVar;
                n9aVar3 = n9aVar;
                z3 = z;
                b97Var3 = b97Var;
                du9Var2 = du9Var;
                in7VarA = in7Var;
            }
            bj4VarO.V();
            fx5.a(ox6Var, dr7Var, go7Var3, n9aVar3, z3, in7VarA, lp7Var3, b97Var3, cVar3, du9Var2, fr1Var, bj4VarO, ((i2 << 3) & 112) | ((i2 >> 3) & 14) | 24576 | 907545984, 1797510);
            in7Var2 = in7VarA;
            cVar2 = cVar3;
            b97Var2 = b97Var3;
            z2 = z3;
            lp7Var2 = lp7Var3;
            n9aVar2 = n9aVar3;
            go7Var2 = go7Var3;
        } else {
            bj4VarO.u();
            go7Var2 = go7Var;
            lp7Var2 = lp7Var;
            cVar2 = cVar;
            n9aVar2 = n9aVar;
            z2 = z;
            b97Var2 = b97Var;
            du9Var2 = du9Var;
            in7Var2 = in7Var;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(ox6Var, go7Var2, lp7Var2, cVar2, n9aVar2, z2, b97Var2, du9Var2, in7Var2, fr1Var, i) { // from class: zp7
                public final /* synthetic */ b97 A;
                public final /* synthetic */ du9 B;
                public final /* synthetic */ in7 C;
                public final /* synthetic */ fr1 D;
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ go7 v;
                public final /* synthetic */ lp7 w;
                public final /* synthetic */ di.c x;
                public final /* synthetic */ n9a y;
                public final /* synthetic */ boolean z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    hq7.a(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
