package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p08 {
    public static final void a(ox6 ox6Var, fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        final ox6 ox6Var2;
        final fr1 fr1Var2;
        bj4 bj4VarO = jt1Var.o(790527681);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                dt7 dt7Var = new dt7(null, ha7.u);
                bj4VarO.C(dt7Var);
                objF = dt7Var;
            }
            final h37 h37Var = (h37) objF;
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = new pt5(1, h37Var);
                bj4VarO.C(objF2);
            }
            final mh4 mh4Var = (mh4) objF2;
            m68 m68Var = nu2.a;
            final ol0 ol0VarB = wl0.b(aj0.z, bj4VarO, 6);
            ox6Var2 = ox6Var;
            fr1Var2 = fr1Var;
            nu1.b(new kf8[]{yca.b.a(ks.c(mh4Var, bj4VarO, 2)), yca.a.a(ol0VarB)}, gr1.b(1070596993, new ci4() { // from class: m08
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    jt1 jt1Var2 = (jt1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objF3 = jt1Var2.f();
                        if (objF3 == jt1.a.a) {
                            final h37 h37Var2 = h37Var;
                            objF3 = new oh4() { // from class: o08
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj3) {
                                    h37Var2.setValue((qq5) obj3);
                                    return g2b.a;
                                }
                            };
                            jt1Var2.C(objF3);
                        }
                        ox6 ox6VarB = oh7.b(ox6Var2, (oh4) objF3);
                        fl6 fl6VarD = dv0.d(di.a.a, true);
                        int iHashCode = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC = it1.c(jt1Var2, ox6VarB);
                        bt1.c.getClass();
                        qr5.a aVar = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                        fr1Var2.invoke(jt1Var2, 0);
                        ol0VarB.b(mh4Var, jt1Var2, 6);
                        jt1Var2.I();
                    } else {
                        jt1Var2.u();
                    }
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 56);
        } else {
            ox6Var2 = ox6Var;
            fr1Var2 = fr1Var;
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: n08
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    p08.a(ox6Var2, fr1Var2, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(ox6 ox6Var, fr1 fr1Var, jt1 jt1Var, int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(155925518);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            boolean z = bj4VarO.F(yca.a) != null;
            boolean z2 = bj4VarO.F(yca.b) != null;
            if (z && z2) {
                bj4VarO.K(-1977187922);
                fl6 fl6VarD = dv0.d(di.a.a, true);
                int iHashCode = Long.hashCode(bj4VarO.T);
                kw7 kw7VarP = bj4VarO.P();
                ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
                bt1.c.getClass();
                qr5.a aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                fr1Var.invoke(bj4VarO, Integer.valueOf((i2 >> 3) & 14));
                bj4VarO.U(true);
                bj4VarO.U(false);
            } else if (z) {
                bj4VarO.K(-1976997706);
                ks.a(ox6Var, fr1Var, bj4VarO, i2 & 126);
                bj4VarO.U(false);
            } else if (z2) {
                bj4VarO.K(-1976846922);
                nu2.d(ox6Var, fr1Var, bj4VarO, i2 & 126);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(-1976716505);
                a(ox6Var, fr1Var, bj4VarO, i2 & 126);
                bj4VarO.U(false);
            }
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new nt5(ox6Var, fr1Var, i);
        }
    }
}
