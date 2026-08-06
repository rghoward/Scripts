package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iu5 {
    public final int a;
    public final hu5[] b;
    public final nu5 c;
    public final List<yo4> d;
    public final int e;
    public final int f;
    public final int g;

    public iu5(int i, hu5[] hu5VarArr, nu5 nu5Var, List list, int i2) {
        this.a = i;
        this.b = hu5VarArr;
        this.c = nu5Var;
        this.d = list;
        this.e = i2;
        int iMax = 0;
        for (hu5 hu5Var : hu5VarArr) {
            iMax = Math.max(iMax, hu5Var.o);
        }
        this.f = iMax;
        int i3 = iMax + this.e;
        this.g = i3 >= 0 ? i3 : 0;
    }

    public final hu5[] a(int i, int i2, int i3) {
        hu5[] hu5VarArr = this.b;
        int length = hu5VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            hu5 hu5Var = hu5VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) this.d.get(i5).a;
            int i9 = i;
            hu5Var.r(i9, this.c.b[i6], i2, i3, this.a, i6);
            g2b g2bVar = g2b.a;
            i6 += i8;
            i4++;
            i = i9;
            i5 = i7;
        }
        return hu5VarArr;
    }
}
