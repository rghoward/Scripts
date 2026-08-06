package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r2b {
    public static final r2b f = new r2b(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public r2b(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final int a() {
        int iK1;
        int iM1;
        int iK2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        f01 f01Var = (f01) this.c[i2];
                        int iK3 = tg1.k1(i4);
                        int size = f01Var.size();
                        iB = h44.b(size, size, iK3, iB);
                    } else if (i5 == 3) {
                        iK1 = tg1.k1(i4) * 2;
                        iM1 = ((r2b) this.c[i2]).a();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(gk5.a());
                        }
                        ((Integer) this.c[i2]).getClass();
                        iK2 = tg1.k1(i4) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).getClass();
                    iK2 = tg1.k1(i4) + 8;
                }
                iB = iK2 + iB;
            } else {
                long jLongValue = ((Long) this.c[i2]).longValue();
                iK1 = tg1.k1(i4);
                iM1 = tg1.m1(jLongValue);
            }
            iB = iM1 + iK1 + iB;
        }
        this.d = iB;
        return iB;
    }

    public final void b(crb crbVar) {
        if (this.a == 0) {
            return;
        }
        crbVar.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                ((ug1) crbVar).a.H1(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                ((ug1) crbVar).a.u1(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                ((ug1) crbVar).a.q1(i3, (f01) obj);
            } else if (i4 == 3) {
                tg1 tg1Var = ((ug1) crbVar).a;
                tg1Var.E1(i3, 3);
                ((r2b) obj).b(crbVar);
                tg1Var.E1(i3, 4);
            } else {
                if (i4 != 5) {
                    d55.a(gk5.a());
                    return;
                }
                ((ug1) crbVar).a.s1(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r2b)) {
            return false;
        }
        r2b r2bVar = (r2b) obj;
        int i = this.a;
        if (i == r2bVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = r2bVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = r2bVar.c;
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

    public r2b() {
        this(0, new int[8], new Object[8], true);
    }
}
