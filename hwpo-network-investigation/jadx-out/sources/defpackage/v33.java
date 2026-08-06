package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v33 {
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    public static final void a(ox6 ox6Var, float f, final long j, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final float f2;
        final float f3;
        boolean z;
        boolean z2;
        Object objF;
        bj4 bj4VarO = jt1Var.o(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.g(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bj4VarO.i(j) ? 256 : 128;
        }
        boolean z3 = true;
        if (bj4VarO.A(i3 & 1, (i3 & 147) != 146)) {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                if (i4 != 0) {
                    ox6Var = ox6.a.t;
                }
                if (i5 != 0) {
                    f3 = q33.a;
                }
                bj4VarO.V();
                ox6 ox6VarD = ir9.d(ir9.c(ox6Var, 1.0f), f3);
                if ((i3 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                if ((((i3 & 896) ^ 384) > 256 || !bj4VarO.i(j)) && (i3 & 384) != 256) {
                }
                z2 = z | z3;
                objF = bj4VarO.f();
                if (z2 || objF == jt1.a.a) {
                    objF = new oh4() { // from class: r33
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            d73 d73Var = (d73) obj;
                            float f4 = f3;
                            float fU0 = d73Var.U0(f4);
                            float fU1 = d73Var.U0(f4) / 2.0f;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fU1)) & 4294967295L);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (d73Var.c() >> 32));
                            float fU2 = d73Var.U0(f4) / 2.0f;
                            d73Var.H1(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fU2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fU0, (480 & 16) != 0 ? 0 : 0, 3);
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF);
                }
                us3.b(ox6VarD, (oh4) objF, bj4VarO, 0);
                f2 = f3;
            } else {
                bj4VarO.u();
            }
            f3 = f;
            bj4VarO.V();
            ox6 ox6VarD2 = ir9.d(ir9.c(ox6Var, 1.0f), f3);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            z3 = ((i3 & 896) ^ 384) > 256 ? false : false;
            z2 = z | z3;
            objF = bj4VarO.f();
            if (z2) {
                objF = new oh4() { // from class: r33
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        d73 d73Var = (d73) obj;
                        float f4 = f3;
                        float fU0 = d73Var.U0(f4);
                        float fU1 = d73Var.U0(f4) / 2.0f;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fU1)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (d73Var.c() >> 32));
                        float fU2 = d73Var.U0(f4) / 2.0f;
                        d73Var.H1(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fU2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fU0, (480 & 16) != 0 ? 0 : 0, 3);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new oh4() { // from class: r33
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        d73 d73Var = (d73) obj;
                        float f4 = f3;
                        float fU0 = d73Var.U0(f4);
                        float fU1 = d73Var.U0(f4) / 2.0f;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fU1)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (d73Var.c() >> 32));
                        float fU2 = d73Var.U0(f4) / 2.0f;
                        d73Var.H1(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fU2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fU0, (480 & 16) != 0 ? 0 : 0, 3);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            }
            us3.b(ox6VarD2, (oh4) objF, bj4VarO, 0);
            f2 = f3;
        } else {
            bj4VarO.u();
            f2 = f;
        }
        final ox6 ox6Var2 = ox6Var;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: s33
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v33.a(ox6Var2, f2, j, (jt1) obj, gz3.s(i | 1), i2);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final ox6 ox6Var, final float f, final long j, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1534852205);
        int i2 = (bj4VarO.i(j) ? 256 : 128) | i;
        boolean z = true;
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            bj4VarO.v0();
            if ((i & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            ox6 ox6VarN = ir9.n(ox6Var.H(ir9.b), f);
            if ((((i2 & 896) ^ 384) <= 256 || !bj4VarO.i(j)) && (i2 & 384) != 256) {
                z = false;
            }
            Object objF = bj4VarO.f();
            if (z || objF == jt1.a.a) {
                objF = new oh4() { // from class: t33
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        d73 d73Var = (d73) obj;
                        float f2 = f;
                        float fU0 = d73Var.U0(f2);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(d73Var.U0(f2) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        float fU1 = d73Var.U0(f2) / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (d73Var.c() & 4294967295L));
                        d73Var.H1(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fU1)) << 32), fU0, (480 & 16) != 0 ? 0 : 0, 3);
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            }
            us3.b(ox6VarN, (oh4) objF, bj4VarO, 0);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(f, j, i) { // from class: u33
                public final /* synthetic */ float u;
                public final /* synthetic */ long v;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(55);
                    v33.b(this.t, this.u, this.v, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
