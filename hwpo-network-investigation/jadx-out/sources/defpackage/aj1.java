package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aj1 implements fl6, jy8 {
    public final c30.l a;
    public final di.b b;

    public aj1(c30.l lVar, di.b bVar) {
        this.a = lVar;
        this.b = bVar;
    }

    @Override // defpackage.fl6
    public final int a(qj5 qj5Var, List<? extends pj5> list, int i) {
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
                int iMin2 = Math.min(pj5Var.o(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pj5Var.C(iMin2));
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
                iMax = Math.max(iMax, pj5Var2.C(iRound != Integer.MAX_VALUE ? Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.jy8
    public final void b(int i, int[] iArr, int[] iArr2, hl6 hl6Var) {
        this.a.arrange(hl6Var, i, iArr, iArr2);
    }

    @Override // defpackage.jy8
    public final long c(int i, int i2, int i3, boolean z) {
        aj1 aj1Var = yi1.a;
        return !z ? zx1.a(0, i3, i, i2) : xx1.a.a(0, i3, i, i2);
    }

    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        return gw.c(this, xx1.i(j), xx1.j(j), xx1.g(j), xx1.h(j), hl6Var.n1(this.a.mo1getSpacingD9Ej5fM()), hl6Var, list, new jz7[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.fl6
    public final int e(qj5 qj5Var, List<? extends pj5> list, int i) {
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
                int iMin2 = Math.min(pj5Var.o(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pj5Var.A(iMin2));
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
                iMax = Math.max(iMax, pj5Var2.A(iRound != Integer.MAX_VALUE ? Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj1)) {
            return false;
        }
        aj1 aj1Var = (aj1) obj;
        return this.a.equals(aj1Var.a) && xj5.a(this.b, aj1Var.b);
    }

    @Override // defpackage.jy8
    public final gl6 f(final jz7[] jz7VarArr, final hl6 hl6Var, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return hl6Var.y0(i2, i, if3.t, new oh4() { // from class: zi1
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
                    tq5 layoutDirection = hl6Var.getLayoutDirection();
                    nb2 nb2Var = ky8Var != null ? ky8Var.c : null;
                    int i9 = i2;
                    aVar.l(jz7Var, nb2Var != null ? nb2Var.a(i9, jz7Var.t, layoutDirection) : this.b.a(jz7Var.t, i9, layoutDirection), iArr[i7], 0.0f);
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
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            pj5 pj5Var = list.get(i3);
            float f2 = zv.f(zv.e(pj5Var));
            int iO = pj5Var.o(i);
            if (f2 == 0.0f) {
                i2 += iO;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iO / f2));
            }
        }
        return ((list.size() - 1) * iN1) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.jy8
    public final int h(jz7 jz7Var) {
        return jz7Var.t;
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
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            pj5 pj5Var = list.get(i3);
            float f2 = zv.f(zv.e(pj5Var));
            int iC0 = pj5Var.c0(i);
            if (f2 == 0.0f) {
                i2 += iC0;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iC0 / f2));
            }
        }
        return ((list.size() - 1) * iN1) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.jy8
    public final int j(jz7 jz7Var) {
        return jz7Var.u;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
