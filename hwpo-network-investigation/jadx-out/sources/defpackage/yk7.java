package defpackage;

import java.util.ArrayList;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yk7 extends m1<g01> implements RandomAccess {
    public final g01[] t;
    public final int[] u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static void a(long j, tx0 tx0Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
            int i4;
            int i5;
            ArrayList arrayList3;
            long j2;
            int i6;
            int i7 = i;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i2 >= i3) {
                z90.a("Failed requirement.");
                return;
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (((g01) arrayList4.get(i8)).g() < i7) {
                    z90.a("Failed requirement.");
                    return;
                }
            }
            g01 g01Var = (g01) arrayList.get(i2);
            g01 g01Var2 = (g01) arrayList4.get(i3 - 1);
            if (i7 == g01Var.g()) {
                int iIntValue = ((Number) arrayList5.get(i2)).intValue();
                int i9 = i2 + 1;
                g01 g01Var3 = (g01) arrayList4.get(i9);
                i4 = i9;
                i5 = iIntValue;
                g01Var = g01Var3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (g01Var.l(i7) == g01Var2.l(i7)) {
                int iMin = Math.min(g01Var.g(), g01Var2.g());
                int i10 = 0;
                for (int i11 = i7; i11 < iMin && g01Var.l(i11) == g01Var2.l(i11); i11++) {
                    i10++;
                }
                long j3 = (tx0Var.u / 4) + j + 2 + ((long) i10) + 1;
                tx0Var.d0(-i10);
                tx0Var.d0(i5);
                int i12 = i7 + i10;
                while (i7 < i12) {
                    tx0Var.d0(g01Var.l(i7) & 255);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (i12 == ((g01) arrayList4.get(i4)).g()) {
                        tx0Var.d0(((Number) arrayList5.get(i4)).intValue());
                        return;
                    } else {
                        aa0.c("Check failed.");
                        return;
                    }
                }
                tx0 tx0Var2 = new tx0();
                tx0Var.d0(((int) ((tx0Var2.u / 4) + j3)) * (-1));
                a(j3, tx0Var2, i12, arrayList4, i4, i3, arrayList5);
                tx0Var.F(tx0Var2);
                return;
            }
            int i13 = 1;
            for (int i14 = i4 + 1; i14 < i3; i14++) {
                if (((g01) arrayList4.get(i14 - 1)).l(i7) != ((g01) arrayList4.get(i14)).l(i7)) {
                    i13++;
                }
            }
            long j4 = (tx0Var.u / 4) + j + 2 + ((long) (i13 * 2));
            tx0Var.d0(i13);
            tx0Var.d0(i5);
            for (int i15 = i4; i15 < i3; i15++) {
                int iL = ((g01) arrayList4.get(i15)).l(i7);
                if (i15 == i4 || iL != ((g01) arrayList4.get(i15 - 1)).l(i7)) {
                    tx0Var.d0(iL & 255);
                }
            }
            tx0 tx0Var3 = new tx0();
            int i16 = i4;
            while (i16 < i3) {
                byte bL = ((g01) arrayList4.get(i16)).l(i7);
                int i17 = i16 + 1;
                int i18 = i17;
                while (true) {
                    if (i18 >= i3) {
                        i18 = i3;
                        break;
                    } else if (bL != ((g01) arrayList4.get(i18)).l(i7)) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i17 == i18 && i7 + 1 == ((g01) arrayList4.get(i16)).g()) {
                    tx0Var.d0(((Number) arrayList5.get(i16)).intValue());
                    arrayList3 = arrayList5;
                    j2 = j4;
                    i6 = i18;
                } else {
                    tx0Var.d0(((int) ((tx0Var3.u / 4) + j4)) * (-1));
                    arrayList3 = arrayList5;
                    j2 = j4;
                    i6 = i18;
                    a(j2, tx0Var3, i7 + 1, arrayList, i16, i6, arrayList3);
                    arrayList4 = arrayList;
                }
                j4 = j2;
                i16 = i6;
                arrayList5 = arrayList3;
            }
            tx0Var.F(tx0Var3);
        }
    }

    public yk7(g01[] g01VarArr, int[] iArr) {
        this.t = g01VarArr;
        this.u = iArr;
    }

    @Override // defpackage.s0, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof g01) {
            return super.contains((g01) obj);
        }
        return false;
    }

    @Override // defpackage.s0
    public final int d() {
        return this.t.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.t[i];
    }

    @Override // defpackage.m1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof g01) {
            return super.indexOf((g01) obj);
        }
        return -1;
    }

    @Override // defpackage.m1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof g01) {
            return super.lastIndexOf((g01) obj);
        }
        return -1;
    }
}
