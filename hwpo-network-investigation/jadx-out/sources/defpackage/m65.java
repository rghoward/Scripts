package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m65 {
    public static final ox6 a = ir9.j(ox6.a.t, zd6.w);

    public static final void a(final n85 n85Var, final String str, ox6 ox6Var, long j, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final ox6 ox6Var2;
        final long j2;
        int i4;
        long j3;
        ox6 ox6Var3;
        bj4 bj4VarO = jt1Var.o(-126890956);
        int i5 = i | (bj4VarO.J(n85Var) ? 4 : 2) | (bj4VarO.J(str) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
        } else {
            i3 = i5 | (bj4VarO.J(ox6Var) ? 256 : 128);
        }
        int i7 = i3 | 1024;
        if (bj4VarO.A(i7 & 1, (i7 & 1171) != 1170)) {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                ox6 ox6Var4 = i6 != 0 ? ox6.a.t : ox6Var;
                i4 = i7 & (-7169);
                j3 = ((uh1) bj4VarO.F(zy1.a)).a;
                ox6Var3 = ox6Var4;
            } else {
                bj4VarO.u();
                i4 = i7 & (-7169);
                ox6Var3 = ox6Var;
                j3 = j;
            }
            bj4VarO.V();
            b(cdb.c(n85Var, bj4VarO), str, ox6Var3, j3, bj4VarO, (i4 & 112) | 8 | (i4 & 896), 0);
            ox6Var2 = ox6Var3;
            j2 = j3;
        } else {
            bj4VarO.u();
            ox6Var2 = ox6Var;
            j2 = j;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(str, ox6Var2, j2, i, i2) { // from class: l65
                public final /* synthetic */ String u;
                public final /* synthetic */ ox6 v;
                public final /* synthetic */ long w;
                public final /* synthetic */ int x;

                {
                    this.x = i2;
                }

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    m65.a(this.t, this.u, this.v, this.w, (jt1) obj, iS, this.x);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x011e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0145  */
    /* JADX WARN: Code duplicated, block: B:95:0x0165  */
    /* JADX WARN: Code duplicated, block: B:98:0x0170  */
    public static final void b(final es7 es7Var, final String str, ox6 ox6Var, long j, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        long j2;
        boolean z;
        final ox6 ox6Var3;
        final long j3;
        xj8 xj8VarW;
        int i4;
        ox6 ox6Var4;
        boolean z2;
        Object objF;
        ox6 ox6VarB;
        long jH;
        boolean z3;
        Object objF2;
        int i5;
        bj4 bj4VarO = jt1Var.o(-2142239481);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.j(es7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !bj4VarO.i(j2)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bj4VarO.A(i3 & 1, z)) {
                bj4VarO.v0();
                i4 = i & 1;
                ox6Var4 = ox6.a.t;
                if (i4 != 0 || bj4VarO.c0()) {
                    if (i6 != 0) {
                        ox6Var2 = ox6Var4;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((uh1) bj4VarO.F(zy1.a)).a;
                        i3 &= -7169;
                    }
                } else {
                    bj4VarO.u();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                bj4VarO.V();
                z2 = (((i3 & 7168) ^ 3072) <= 2048 && bj4VarO.i(j2)) || (i3 & 3072) == 2048;
                objF = bj4VarO.f();
                jt1.a.C0187a c0187a = jt1.a.a;
                if (z2 || objF == c0187a) {
                    if (uh1.c(j2, uh1.k)) {
                        objF = null;
                    } else {
                        objF = new wq0(5, j2);
                    }
                    bj4VarO.C(objF);
                }
                wh1 wh1Var = (wh1) objF;
                if (str != null) {
                    bj4VarO.K(-536990979);
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objF2 = bj4VarO.f();
                    if (z3 || objF2 == c0187a) {
                        objF2 = new oh4() { // from class: j65
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                hc9 hc9Var = (hc9) obj;
                                ec9.b(str, hc9Var);
                                ec9.e(hc9Var, 5);
                                return g2b.a;
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    ox6VarB = pb9.b(ox6Var4, false, (oh4) objF2);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(-536832197);
                    bj4VarO.U(false);
                    ox6VarB = ox6Var4;
                }
                ox6 ox6Var5 = ox6Var2;
                if (cr9.a(es7Var.h(), 9205357640488583168L)) {
                    ox6Var4 = a;
                } else {
                    jH = es7Var.h();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jH >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jH & 4294967295L)))) {
                        ox6Var4 = a;
                    }
                }
                dv0.a(gs7.a(ox6Var5.H(ox6Var4), es7Var, null, nz1.a.b, 0.0f, wh1Var, 22).H(ox6VarB), bj4VarO, 0);
                ox6Var3 = ox6Var5;
                j3 = j2;
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var2;
                j3 = j2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: k65
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        m65.b(es7Var, str, ox6Var3, j3, (jt1) obj, gz3.s(i | 1), i2);
                        return g2b.a;
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i5 = 1024;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bj4VarO.A(i3 & 1, z)) {
            bj4VarO.v0();
            i4 = i & 1;
            ox6Var4 = ox6.a.t;
            if (i4 != 0) {
                if (i6 != 0) {
                    ox6Var2 = ox6Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((uh1) bj4VarO.F(zy1.a)).a;
                    i3 &= -7169;
                }
            } else {
                if (i6 != 0) {
                    ox6Var2 = ox6Var4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((uh1) bj4VarO.F(zy1.a)).a;
                    i3 &= -7169;
                }
            }
            bj4VarO.V();
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            objF = bj4VarO.f();
            jt1.a.C0187a c0187a2 = jt1.a.a;
            if (z2) {
                if (uh1.c(j2, uh1.k)) {
                    objF = null;
                } else {
                    objF = new wq0(5, j2);
                }
                bj4VarO.C(objF);
            } else {
                if (uh1.c(j2, uh1.k)) {
                    objF = null;
                } else {
                    objF = new wq0(5, j2);
                }
                bj4VarO.C(objF);
            }
            wh1 wh1Var2 = (wh1) objF;
            if (str != null) {
                bj4VarO.K(-536990979);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objF2 = bj4VarO.f();
                if (z3) {
                    objF2 = new oh4() { // from class: j65
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            hc9 hc9Var = (hc9) obj;
                            ec9.b(str, hc9Var);
                            ec9.e(hc9Var, 5);
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: j65
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            hc9 hc9Var = (hc9) obj;
                            ec9.b(str, hc9Var);
                            ec9.e(hc9Var, 5);
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF2);
                }
                ox6VarB = pb9.b(ox6Var4, false, (oh4) objF2);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-536832197);
                bj4VarO.U(false);
                ox6VarB = ox6Var4;
            }
            ox6 ox6Var6 = ox6Var2;
            if (cr9.a(es7Var.h(), 9205357640488583168L)) {
                jH = es7Var.h();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jH >> 32)))) {
                    ox6Var4 = a;
                }
            } else {
                ox6Var4 = a;
            }
            dv0.a(gs7.a(ox6Var6.H(ox6Var4), es7Var, null, nz1.a.b, 0.0f, wh1Var2, 22).H(ox6VarB), bj4VarO, 0);
            ox6Var3 = ox6Var6;
            j3 = j2;
        } else {
            bj4VarO.u();
            ox6Var3 = ox6Var2;
            j3 = j2;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: k65
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m65.b(es7Var, str, ox6Var3, j3, (jt1) obj, gz3.s(i | 1), i2);
                    return g2b.a;
                }
            };
        }
    }
}
