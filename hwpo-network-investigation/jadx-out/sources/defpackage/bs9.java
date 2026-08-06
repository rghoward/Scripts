package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bs9 {
    public static final int a(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int iF = f(arrayList, i, i2);
        return iF >= 0 ? iF : -(iF + 1);
    }

    public static final int c(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void d(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final zr9 e(ln4 ln4Var) {
        zr9 zr9Var = ln4Var instanceof zr9 ? (zr9) ln4Var : null;
        if (zr9Var != null) {
            return zr9Var;
        }
        pt1.b("Inconsistent composition");
        fl.a();
        return null;
    }

    public static final int f(ArrayList<vi4> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = arrayList.get(i4).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iB = xj5.b(i5, i);
            if (iB < 0) {
                i3 = i4 + 1;
            } else {
                if (iB <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void g() {
        throw new ConcurrentModificationException();
    }
}
