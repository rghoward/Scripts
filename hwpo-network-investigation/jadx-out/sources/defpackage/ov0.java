package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ov0 {
    public static final void a(final ox6 ox6Var, di diVar, boolean z, final fr1 fr1Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final boolean z2;
        bj4 bj4VarO = jt1Var.o(380139498);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(diVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.c(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(fr1Var) ? 2048 : 1024;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                diVar = di.a.a;
            }
            boolean z3 = i5 != 0 ? false : z;
            final fl6 fl6VarD = dv0.d(diVar, z3);
            boolean zJ = bj4VarO.J(fl6VarD) | ((i3 & 7168) == 2048);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new ci4() { // from class: lv0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        g4a g4aVar = (g4a) obj;
                        xx1 xx1Var = (xx1) obj2;
                        final qv0 qv0Var = new qv0(g4aVar, xx1Var.a);
                        g2b g2bVar = g2b.a;
                        final fr1 fr1Var2 = fr1Var;
                        return fl6VarD.d(g4aVar, g4aVar.H(new fr1(true, -431986394, new ci4() { // from class: nv0
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj3, Object obj4) {
                                jt1 jt1Var2 = (jt1) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    fr1Var2.invoke(qv0Var, jt1Var2, 0);
                                } else {
                                    jt1Var2.u();
                                }
                                return g2b.a;
                            }
                        }), g2bVar), xx1Var.a);
                    }
                };
                bj4VarO.C(objF);
            }
            c4a.a(ox6Var, (ci4) objF, bj4VarO, i3 & 14, 0);
            z2 = z3;
        } else {
            bj4VarO.u();
            z2 = z;
        }
        final di diVar2 = diVar;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: mv0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ov0.a(ox6Var, diVar2, z2, fr1Var, (jt1) obj, gz3.s(i | 1), i2);
                    return g2b.a;
                }
            };
        }
    }
}
