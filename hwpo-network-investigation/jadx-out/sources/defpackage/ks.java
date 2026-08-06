package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ks {
    public static final void a(final ox6 ox6Var, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(2064964257);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            b(ox6Var, fr1Var, bj4VarO, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: es
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    ks.a(ox6Var, fr1Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final ox6 ox6Var, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(771959668);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 256 : 128;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
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
                objF2 = new mh4() { // from class: gs
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        qq5 qq5Var = (qq5) h37Var.getValue();
                        if (qq5Var != null) {
                            return qq5Var;
                        }
                        xc5.d("Required value was null.");
                        fl.a();
                        return null;
                    }
                };
                bj4VarO.C(objF2);
            }
            nu1.a(yca.b.a(c((mh4) objF2, bj4VarO, 0)), gr1.b(-291176396, new ci4() { // from class: hs
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    jt1 jt1Var2 = (jt1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objF3 = jt1Var2.f();
                        if (objF3 == jt1.a.a) {
                            objF3 = new ds(0, h37Var);
                            jt1Var2.C(objF3);
                        }
                        ox6 ox6VarB = oh7.b(ox6Var, (oh4) objF3);
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
                        fr1Var.invoke(jt1Var2, 0);
                        jt1Var2.I();
                    } else {
                        jt1Var2.u();
                    }
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 56);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: is
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    ks.b(ox6Var, fr1Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final zr c(mh4 mh4Var, jt1 jt1Var, int i) {
        View view = (View) jt1Var.F(AndroidCompositionLocals_androidKt.f);
        boolean zJ = jt1Var.J(view);
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (zJ || objF == obj) {
            objF = new zr(view, null, mh4Var);
            jt1Var.C(objF);
        }
        zr zrVar = (zr) objF;
        boolean zJ2 = jt1Var.j(zrVar);
        Object objF2 = jt1Var.f();
        if (zJ2 || objF2 == obj) {
            objF2 = new fs(0, zrVar);
            jt1Var.C(objF2);
        }
        wd3.a(zrVar, (oh4) objF2, jt1Var);
        return zrVar;
    }
}
