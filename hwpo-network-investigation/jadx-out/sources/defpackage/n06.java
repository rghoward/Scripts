package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n06 {
    public static final float a = 64.0f;

    public static final void a(final fr1 fr1Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-709502251);
        int i2 = 1;
        if (bj4VarO.A(i & 1, (i & 3) != 2)) {
            y0a y0aVar = o09.a;
            final m09 m09Var = (m09) bj4VarO.F(y0aVar);
            final l09 l09VarB = kt7.b(bj4VarO);
            Object[] objArr = {m09Var};
            au3 au3Var = new au3(new h06(), new oh4() { // from class: i06
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    return new k06(m09Var, (Map) obj, l09VarB);
                }
            });
            boolean zJ = bj4VarO.j(m09Var) | bj4VarO.j(l09VarB);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new sr(i2, m09Var, l09VarB);
                bj4VarO.C(objF);
            }
            final k06 k06Var = (k06) mm8.e(objArr, au3Var, (mh4) objF, bj4VarO, 0);
            nu1.a(y0aVar.a(k06Var), gr1.b(-412824043, new ci4() { // from class: l06
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    jt1 jt1Var2 = (jt1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        fr1Var.invoke(k06Var, jt1Var2, 0);
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
            xj8VarW.d = new ci4(i) { // from class: m06
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(7);
                    n06.a(this.t, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static void b(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void c(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
