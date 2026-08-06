package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h16 {
    public int a;
    public int[] b = new int[16];
    public final h30<a> c = new h30<>();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public int[] b;

        public a(int[] iArr, int i) {
            this.a = i;
            this.b = iArr;
        }
    }

    public static int h(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = ((a) list.get(i3)).a - i;
            if (i4 < 0) {
                i2 = i3 + 1;
            } else {
                if (i4 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final boolean a(int i, int i2) {
        int iF = f(i);
        return iF == i2 || iF == -1 || iF == -2;
    }

    public final void b(int i, int i2) {
        if (i > 131072) {
            xc5.a("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = this.b;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            gz3.h(i2, 0, 12, this.b, iArr2);
            this.b = iArr2;
        }
    }

    public final void c(int i) {
        h30<a> h30Var;
        int i2 = this.a;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int iMax = Math.max(i - (this.b.length / 2), 0);
            this.a = iMax;
            int i4 = iMax - i2;
            int[] iArr = this.b;
            if (i4 >= 0) {
                if (i4 < iArr.length) {
                    gz3.e(0, i4, iArr.length, iArr, iArr);
                }
                int[] iArr2 = this.b;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i4), this.b.length, 0);
            } else {
                int i5 = -i4;
                if (iArr.length + i5 < 131072) {
                    b(iArr.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr.length) {
                        gz3.e(i5, 0, iArr.length - i5, iArr, iArr);
                    }
                    int[] iArr3 = this.b;
                    Arrays.fill(iArr3, 0, Math.min(iArr3.length, i5), 0);
                }
            }
        } else {
            b(i3 + 1, 0);
        }
        while (true) {
            h30Var = this.c;
            if (h30Var.isEmpty() || h30Var.first().a >= this.a) {
                break;
            } else {
                h30Var.removeFirst();
            }
        }
        while (!h30Var.isEmpty() && h30Var.last().a > this.a + this.b.length) {
            h30Var.removeLast();
        }
    }

    public final int d(int i, int i2) {
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!a(i, i2));
        return i;
    }

    public final int[] e(int i) {
        h30<a> h30Var = this.c;
        a aVar = (a) th1.B(h(i, h30Var), h30Var);
        if (aVar != null) {
            return aVar.b;
        }
        return null;
    }

    public final int f(int i) {
        int i2 = this.a;
        if (i < i2) {
            return -1;
        }
        int[] iArr = this.b;
        if (i >= iArr.length + i2) {
            return -1;
        }
        return iArr[i - i2] - 1;
    }

    public final void g() {
        gz3.n(this.b, 0, 0, 6);
        this.c.clear();
    }

    public final void i(int i, int i2) {
        if (i < 0) {
            xc5.a("Negative lanes are not supported");
        }
        c(i);
        this.b[i - this.a] = i2 + 1;
    }
}
