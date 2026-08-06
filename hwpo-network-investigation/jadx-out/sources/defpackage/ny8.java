package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ny8 implements fl6, jy8 {
    public final c30.e a;
    public final di.c b;

    public ny8(c30.e eVar, di.c cVar) {
        this.a = eVar;
        this.b = cVar;
    }

    @Override // defpackage.fl6
    public final int a(qj5 qj5Var, List<? extends pj5> list, int i) {
        int iN1 = qj5Var.n1(this.a.mo1getSpacingD9Ej5fM());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            pj5 pj5Var = list.get(i3);
            float f2 = zv.f(zv.e(pj5Var));
            int iC = pj5Var.C(i);
            if (f2 == 0.0f) {
                i2 += iC;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iC / f2));
            }
        }
        return ((list.size() - 1) * iN1) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.jy8
    public final void b(int i, int[] iArr, int[] iArr2, hl6 hl6Var) {
        this.a.a(hl6Var, i, iArr, hl6Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.jy8
    public final long c(int i, int i2, int i3, boolean z) {
        ny8 ny8Var = ly8.a;
        return !z ? zx1.a(i, i2, 0, i3) : xx1.a.b(i, i2, 0, i3);
    }

    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        return gw.c(this, xx1.j(j), xx1.i(j), xx1.h(j), xx1.g(j), hl6Var.n1(this.a.mo1getSpacingD9Ej5fM()), hl6Var, list, new jz7[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.fl6
    public final int e(qj5 qj5Var, List<? extends pj5> list, int i) {
        int iN1 = qj5Var.n1(this.a.mo1getSpacingD9Ej5fM());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            pj5 pj5Var = list.get(i3);
            float f2 = zv.f(zv.e(pj5Var));
            int iA = pj5Var.A(i);
            if (f2 == 0.0f) {
                i2 += iA;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iA / f2));
            }
        }
        return ((list.size() - 1) * iN1) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny8)) {
            return false;
        }
        ny8 ny8Var = (ny8) obj;
        return this.a.equals(ny8Var.a) && xj5.a(this.b, ny8Var.b);
    }

    @Override // defpackage.jy8
    public final gl6 f(final jz7[] jz7VarArr, hl6 hl6Var, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return hl6Var.y0(i, i2, if3.t, new oh4() { // from class: my8
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                jz7.a aVar = (jz7.a) obj;
                jz7[] jz7VarArr2 = jz7VarArr;
                int length = jz7VarArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    jz7 jz7Var = jz7VarArr2[i6];
                    int i8 = i7 + 1;
                    jz7Var.getClass();
                    Object objG = jz7Var.g();
                    ky8 ky8Var = objG instanceof ky8 ? (ky8) objG : null;
                    nb2 nb2Var = ky8Var != null ? ky8Var.c : null;
                    int i9 = i2;
                    aVar.l(jz7Var, iArr[i7], nb2Var != null ? nb2Var.a(i9, jz7Var.u, tq5.t) : this.b.a(jz7Var.u, i9), 0.0f);
                    i6++;
                    i7 = i8;
                }
                return g2b.a;
            }
        });
    }

    @Override // defpackage.fl6
    public final int g(qj5 qj5Var, List<? extends pj5> list, int i) {
        int iN1 = qj5Var.n1(this.a.mo1getSpacingD9Ej5fM());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iN1, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            pj5 pj5Var = list.get(i2);
            float f2 = zv.f(zv.e(pj5Var));
            if (f2 == 0.0f) {
                int iMin2 = Math.min(pj5Var.C(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pj5Var.o(iMin2));
            } else if (f2 > 0.0f) {
                f += f2;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pj5 pj5Var2 = list.get(i3);
            float f3 = zv.f(zv.e(pj5Var2));
            if (f3 > 0.0f) {
                iMax = Math.max(iMax, pj5Var2.o(iRound != Integer.MAX_VALUE ? Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.jy8
    public final int h(jz7 jz7Var) {
        return jz7Var.u;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.fl6
    public final int i(qj5 qj5Var, List<? extends pj5> list, int i) {
        int iN1 = qj5Var.n1(this.a.mo1getSpacingD9Ej5fM());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iN1, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            pj5 pj5Var = list.get(i2);
            float f2 = zv.f(zv.e(pj5Var));
            if (f2 == 0.0f) {
                int iMin2 = Math.min(pj5Var.C(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pj5Var.c0(iMin2));
            } else if (f2 > 0.0f) {
                f += f2;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pj5 pj5Var2 = list.get(i3);
            float f3 = zv.f(zv.e(pj5Var2));
            if (f3 > 0.0f) {
                iMax = Math.max(iMax, pj5Var2.c0(iRound != Integer.MAX_VALUE ? Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.jy8
    public final int j(jz7 jz7Var) {
        return jz7Var.t;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
