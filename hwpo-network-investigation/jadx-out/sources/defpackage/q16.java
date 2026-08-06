package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q16 implements i16, gl6 {
    public final int[] a;
    public final int[] b;
    public final float c;
    public final gl6 d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final x16 i;
    public final y16 j;
    public final tx2 k;
    public final int l;
    public final List<s16> m;
    public final long n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final t72 t;
    public final fl7 u;

    public q16() {
        throw null;
    }

    public q16(int[] iArr, int[] iArr2, float f, gl6 gl6Var, float f2, boolean z, boolean z2, boolean z3, x16 x16Var, y16 y16Var, tx2 tx2Var, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, t72 t72Var) {
        this.a = iArr;
        this.b = iArr2;
        this.c = f;
        this.d = gl6Var;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = x16Var;
        this.j = y16Var;
        this.k = tx2Var;
        this.l = i;
        this.m = list;
        this.n = j;
        this.o = i2;
        this.p = i3;
        this.q = i4;
        this.r = i5;
        this.s = i6;
        this.t = t72Var;
        this.u = z2 ? fl7.t : fl7.u;
    }

    @Override // defpackage.i16
    public final long a() {
        return this.n;
    }

    @Override // defpackage.i16
    public final int b() {
        return this.r;
    }

    @Override // defpackage.i16
    public final fl7 c() {
        return this.u;
    }

    @Override // defpackage.i16
    public final int d() {
        return this.q;
    }

    @Override // defpackage.i16
    public final int e() {
        return this.l;
    }

    @Override // defpackage.i16
    public final int f() {
        return this.s;
    }

    @Override // defpackage.i16
    public final List<s16> g() {
        return this.m;
    }

    @Override // defpackage.gl6
    public final int h() {
        return this.d.h();
    }

    public final q16 i(int i, boolean z) {
        char c;
        long j;
        long j2;
        int i2;
        if (this.h) {
            return null;
        }
        List<s16> list = this.m;
        if (list.isEmpty() || this.a.length == 0) {
            return null;
        }
        int[] iArr = this.b;
        if (iArr.length == 0) {
            return null;
        }
        int i3 = this.r;
        int i4 = this.p;
        int i5 = i4 - i3;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            s16 s16Var = list.get(i6);
            boolean z2 = s16Var.r;
            int i7 = s16Var.n;
            if (z2) {
                return null;
            }
            if ((s16Var.o() <= 0) != (s16Var.o() + i <= 0)) {
                return null;
            }
            int iO = s16Var.o();
            int i8 = this.o;
            if (iO <= i8) {
                if (i < 0) {
                    if ((s16Var.o() + i7) - i8 <= (-i)) {
                        return null;
                    }
                } else if (i8 - s16Var.o() <= i) {
                    return null;
                }
            }
            if (s16Var.o() + i7 >= i5) {
                if (i < 0) {
                    if ((s16Var.o() + i7) - i4 <= (-i)) {
                        return null;
                    }
                } else if (i4 - s16Var.o() <= i) {
                    return null;
                }
            }
        }
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            s16 s16Var2 = list.get(i9);
            boolean z3 = s16Var2.d;
            if (!s16Var2.r) {
                long j3 = s16Var2.t;
                char c2 = ' ';
                long j4 = 4294967295L;
                s16Var2.t = (((long) (z3 ? (int) (j3 >> 32) : ((int) (j3 >> 32)) + i)) << 32) | (((long) (z3 ? ((int) (j3 & 4294967295L)) + i : (int) (j3 & 4294967295L))) & 4294967295L);
                if (z) {
                    int size3 = s16Var2.c.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        sv5 sv5VarA = s16Var2.j.a(i10, s16Var2.b);
                        if (sv5VarA != null) {
                            char c3 = c2;
                            long j5 = sv5VarA.k;
                            if (z3) {
                                c = c3;
                                j2 = j5;
                                i2 = (int) (j2 >> c);
                            } else {
                                c = c3;
                                j2 = j5;
                                i2 = ((int) (j2 >> c)) + i;
                            }
                            int i11 = z3 ? ((int) (j2 & j4)) + i : (int) (j2 & j4);
                            j = j4;
                            sv5VarA.k = (((long) i11) & j) | (((long) i2) << c);
                        } else {
                            c = c2;
                            j = j4;
                        }
                        i10++;
                        c2 = c;
                        j4 = j;
                    }
                }
            }
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr2[i12] = iArr[i12] - i;
        }
        return new q16(this.a, iArr2, i, this.d, this.e, this.f || i > 0, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
    }

    @Override // defpackage.gl6
    public final int j() {
        return this.d.j();
    }

    @Override // defpackage.gl6
    public final Map<ei, Integer> l() {
        return this.d.l();
    }

    @Override // defpackage.gl6
    public final void m() {
        this.d.m();
    }

    @Override // defpackage.gl6
    public final oh4<wy8, g2b> n() {
        return this.d.n();
    }
}
