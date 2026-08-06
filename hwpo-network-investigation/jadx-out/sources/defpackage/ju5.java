package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ju5 {
    public final nu5 a;
    public final int b;
    public final int c;
    public final yt5 d;
    public final qu5 e;

    public ju5(nu5 nu5Var, int i, int i2, yt5 yt5Var, qu5 qu5Var) {
        this.a = nu5Var;
        this.b = i;
        this.c = i2;
        this.d = yt5Var;
        this.e = qu5Var;
    }

    public final long a(int i, int i2) {
        int i3;
        nu5 nu5Var = this.a;
        int[] iArr = nu5Var.a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = nu5Var.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            wc5.a("width must be >= 0");
        }
        return zx1.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public abstract iu5 b(int i, hu5[] hu5VarArr, List<yo4> list, int i2);

    public final iu5 c(int i) {
        qu5.c cVarB = this.e.b(i);
        int i2 = cVarB.a;
        List<yo4> list = cVarB.b;
        int size = list.size();
        int i3 = (size == 0 || i2 + size == this.b) ? 0 : this.c;
        hu5[] hu5VarArr = new hu5[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = (int) list.get(i5).a;
            hu5 hu5VarU = this.d.u(i2 + i5, i4, i6, i3, a(i4, i6));
            i4 += i6;
            g2b g2bVar = g2b.a;
            hu5VarArr[i5] = hu5VarU;
        }
        return b(i, hu5VarArr, list, i3);
    }
}
