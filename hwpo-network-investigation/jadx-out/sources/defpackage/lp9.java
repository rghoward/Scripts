package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lp9 {
    public static final void a(final ox6 ox6Var, final fr1 fr1Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1854833411);
        int i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = kp9.a;
                bj4VarO.C(objF);
            }
            fl6 fl6Var = (fl6) objF;
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
            rd7.d(bj4VarO, bt1.a.f, fl6Var);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            fr1Var.invoke(bj4VarO, 6);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(fr1Var, i) { // from class: jp9
                public final /* synthetic */ fr1 u;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(49);
                    lp9.a(this.t, this.u, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
