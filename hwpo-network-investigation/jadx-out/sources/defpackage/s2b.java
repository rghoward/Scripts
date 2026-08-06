package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s2b {
    public static final s2b f = new s2b(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public s2b(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(int i) {
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

    public final int b() {
        int iM1;
        int iO1;
        int iM2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iM2 = sg1.m1(i5) + 8;
                } else if (i6 == 2) {
                    iM2 = sg1.h1(i5, (e01) this.c[i3]);
                } else if (i6 == 3) {
                    iM1 = sg1.m1(i5) * 2;
                    iO1 = ((s2b) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(fk5.b());
                    }
                    ((Integer) this.c[i3]).getClass();
                    iM2 = sg1.m1(i5) + 4;
                }
                i2 = iM2 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iM1 = sg1.m1(i5);
                iO1 = sg1.o1(jLongValue);
            }
            i2 = iO1 + iM1 + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            e44.b();
            return;
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(drb drbVar) {
        if (this.a == 0) {
            return;
        }
        drbVar.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                ((vg1) drbVar).a.K1(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                ((vg1) drbVar).a.x1(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                ((vg1) drbVar).a.t1(i3, (e01) obj);
            } else if (i4 == 3) {
                sg1 sg1Var = ((vg1) drbVar).a;
                sg1Var.H1(i3, 3);
                ((s2b) obj).d(drbVar);
                sg1Var.H1(i3, 4);
            } else {
                if (i4 != 5) {
                    d55.a(fk5.b());
                    return;
                }
                ((vg1) drbVar).a.v1(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s2b)) {
            return false;
        }
        s2b s2bVar = (s2b) obj;
        int i = this.a;
        if (i == s2bVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = s2bVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = s2bVar.c;
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
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public s2b() {
        this(0, new int[8], new Object[8], true);
    }
}
