package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pp0 {
    public static final void a(final qga qgaVar, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(2080741862);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(qgaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            no1.a(qgaVar, fr1Var, bj4VarO, i2 & 126);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: n02
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    pp0.a(qgaVar, fr1Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static void b(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                ac4.c(pp2.a(i2, "at index "));
                return;
            }
        }
    }

    public static final void c(int i) {
        if (i >= 1) {
            return;
        }
        ca0.a(pp2.a(i, "Expected positive parallelism level, but got "));
    }

    public static final int d(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }
}
