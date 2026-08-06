package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface y74 extends jy8 {
    @Override // defpackage.jy8
    default void b(int i, int[] iArr, int[] iArr2, hl6 hl6Var) {
        if (n()) {
            l().a(hl6Var, i, iArr, hl6Var.getLayoutDirection(), iArr2);
        } else {
            m().arrange(hl6Var, i, iArr, iArr2);
        }
    }

    @Override // defpackage.jy8
    default long c(int i, int i2, int i3, boolean z) {
        if (n()) {
            ny8 ny8Var = ly8.a;
            return !z ? zx1.a(i, i2, 0, i3) : xx1.a.b(i, i2, 0, i3);
        }
        aj1 aj1Var = yi1.a;
        return !z ? zx1.a(0, i3, i, i2) : xx1.a.a(0, i3, i, i2);
    }

    @Override // defpackage.jy8
    default gl6 f(final jz7[] jz7VarArr, hl6 hl6Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        if (n()) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
        }
        final tq5 layoutDirection = n() ? tq5.t : hl6Var.getLayoutDirection();
        return hl6Var.y0(i7, i6, if3.t, new oh4() { // from class: x74
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                nb2 nb2VarK;
                jz7.a aVar = (jz7.a) obj;
                int[] iArr3 = iArr2;
                int i8 = iArr3 != null ? iArr3[i3] : 0;
                int i9 = i4;
                for (int i10 = i9; i10 < i5; i10++) {
                    jz7 jz7Var = jz7VarArr[i10];
                    jz7Var.getClass();
                    Object objG = jz7Var.g();
                    ky8 ky8Var = objG instanceof ky8 ? (ky8) objG : null;
                    y74 y74Var = this;
                    if (ky8Var == null || (nb2VarK = ky8Var.c) == null) {
                        nb2VarK = y74Var.k();
                    }
                    int iA = nb2VarK.a(i2, y74Var.h(jz7Var), layoutDirection) + i8;
                    boolean zN = y74Var.n();
                    int[] iArr4 = iArr;
                    if (zN) {
                        aVar.l(jz7Var, iArr4[i10 - i9], iA, 0.0f);
                    } else {
                        aVar.l(jz7Var, iA, iArr4[i10 - i9], 0.0f);
                    }
                }
                return g2b.a;
            }
        });
    }

    @Override // defpackage.jy8
    default int h(jz7 jz7Var) {
        return n() ? jz7Var.f0() : jz7Var.g0();
    }

    @Override // defpackage.jy8
    default int j(jz7 jz7Var) {
        return n() ? jz7Var.g0() : jz7Var.f0();
    }

    nb2 k();

    c30.e l();

    c30.l m();

    boolean n();
}
