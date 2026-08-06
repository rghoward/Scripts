package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yqa {
    public static final ko7 a = new ko7(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(final bra braVar, ox6 ox6Var, float f, jl9 jl9Var, long j, long j2, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4Var;
        final ox6 ox6Var2;
        final float f2;
        final jl9 jl9Var2;
        final long j3;
        final long j4;
        long jD;
        int i3;
        long jD2;
        ox6 ox6Var3;
        jl9 jl9Var3;
        bj4 bj4VarO = jt1Var.o(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bj4VarO.J(braVar) : bj4VarO.j(braVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= bj4VarO.j(fr1Var) ? 536870912 : 268435456;
        }
        if (bj4VarO.A(i5 & 1, (306783379 & i5) != 306783378)) {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                f2 = sqa.a;
                jl9 jl9VarB = wl9.b(x10.c, bj4VarO);
                jD = hi1.d(x10.d, bj4VarO);
                i3 = i5 & (-4186113);
                jD2 = hi1.d(x10.b, bj4VarO);
                ox6Var3 = ox6.a.t;
                jl9Var3 = jl9VarB;
            } else {
                bj4VarO.u();
                i3 = i5 & (-4186113);
                ox6Var3 = ox6Var;
                f2 = f;
                jl9Var3 = jl9Var;
                jD = j;
                jD2 = j2;
            }
            bj4VarO.V();
            bj4VarO.K(-1719831991);
            bj4VarO.U(false);
            int i6 = i3 >> 9;
            bj4Var = bj4VarO;
            v5a.a(ox6Var3, jl9Var3, jD2, 0L, 0.0f, 0.0f, null, gr1.b(-1573998995, new vqa(f2, jD, fr1Var), bj4VarO), bj4Var, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            j3 = jD;
            ox6Var2 = ox6Var3;
            jl9Var2 = jl9Var3;
            j4 = jD2;
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
            ox6Var2 = ox6Var;
            f2 = f;
            jl9Var2 = jl9Var;
            j3 = j;
            j4 = j2;
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: tqa
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yqa.a(braVar, ox6Var2, f2, jl9Var2, j3, j4, fr1Var, (jt1) obj, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(l68 l68Var, final fr1 fr1Var, fra fraVar, ox6 ox6Var, boolean z, final fr1 fr1Var2, jt1 jt1Var, final int i) {
        int i2;
        l68 l68Var2;
        fra fraVar2;
        final boolean z2;
        bj4 bj4VarO = jt1Var.o(-293753984);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(l68Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bj4VarO.J(fraVar) : bj4VarO.j(fraVar) ? 256 : 128;
        }
        int i3 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i3 |= bj4VarO.j(fr1Var2) ? 67108864 : 33554432;
        }
        if (bj4VarO.A(i3 & 1, (38347923 & i3) != 38347922)) {
            tva tvaVarE = owa.e(fraVar.b, "tooltip transition", bj4VarO, 48);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(null);
                bj4VarO.C(objF);
            }
            h37 h37Var = (h37) objF;
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                new dr(3, h37Var);
                objF2 = new cra();
                bj4VarO.C(objF2);
            }
            l68Var2 = l68Var;
            fraVar2 = fraVar;
            pn0.a(l68Var2, gr1.b(-527401546, new wqa(tvaVarE, fr1Var, (cra) objF2), bj4VarO), fraVar2, gr1.b(-23901870, new xqa(h37Var, fr1Var2), bj4VarO), bj4VarO, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3));
            ox6Var = ox6.a.t;
            z2 = true;
        } else {
            l68Var2 = l68Var;
            fraVar2 = fraVar;
            bj4VarO.u();
            z2 = z;
        }
        final ox6 ox6Var2 = ox6Var;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final l68 l68Var3 = l68Var2;
            final fra fraVar3 = fraVar2;
            xj8VarW.d = new ci4() { // from class: uqa
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yqa.b(l68Var3, fr1Var, fraVar3, ox6Var2, z2, fr1Var2, (jt1) obj, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }

    public static final fra c(jt1 jt1Var) {
        w37 w37Var = zm0.a;
        boolean zC = jt1Var.c(false) | jt1Var.J(w37Var);
        Object objF = jt1Var.f();
        if (zC || objF == jt1.a.a) {
            objF = new fra(w37Var);
            jt1Var.C(objF);
        }
        return (fra) objF;
    }
}
