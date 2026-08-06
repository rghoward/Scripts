package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g4c {
    public static final g4c f = new g4c(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public g4c(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static g4c a() {
        return new g4c(0, new int[8], new Object[8], true);
    }

    public final void b(c1c c1cVar) {
        b1c b1cVar = c1cVar.a;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    b1cVar.j(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    b1cVar.k(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    b1cVar.n(i4, (p0c) obj);
                } else if (i3 == 3) {
                    b1cVar.f(i4, 3);
                    ((g4c) obj).b(c1cVar);
                    b1cVar.f(i4, 4);
                } else {
                    if (i3 != 5) {
                        d55.a(new j2c());
                        return;
                    }
                    b1cVar.i(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iA;
        int iB;
        int iA2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iA3 = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        p0c p0cVar = (p0c) this.c[i2];
                        int iA4 = b1c.a(i6);
                        int iE = p0cVar.e();
                        iA3 = yj.a(iE, iE, iA4, iA3);
                    } else if (i5 == 3) {
                        int iA5 = b1c.a(i4 << 3);
                        iA = iA5 + iA5;
                        iB = ((g4c) this.c[i2]).c();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new j2c());
                        }
                        ((Integer) this.c[i2]).getClass();
                        iA2 = b1c.a(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).getClass();
                    iA2 = b1c.a(i4 << 3) + 8;
                }
                iA3 = iA2 + iA3;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iA = b1c.a(i7);
                iB = b1c.b(jLongValue);
            }
            iA3 = iB + iA + iA3;
        }
        this.d = iA3;
        return iA3;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            e44.b();
            return;
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g4c)) {
            return false;
        }
        g4c g4cVar = (g4c) obj;
        int i = this.a;
        if (i == g4cVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = g4cVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = g4cVar.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public g4c() {
        this(0, new int[8], new Object[8], true);
    }
}
