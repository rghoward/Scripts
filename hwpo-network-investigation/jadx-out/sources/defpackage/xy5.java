package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xy5 implements ty5, gl6 {
    public final yy5 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final gl6 e;
    public final float f;
    public final boolean g;
    public final t72 h;
    public final tx2 i;
    public final long j;
    public final List<yy5> k;
    public final int l;
    public final int m;
    public final int n;
    public final fl7 o;
    public final int p;
    public final int q;

    public xy5() {
        throw null;
    }

    public xy5(yy5 yy5Var, int i, boolean z, float f, gl6 gl6Var, float f2, boolean z2, t72 t72Var, tx2 tx2Var, long j, List list, int i2, int i3, int i4, fl7 fl7Var, int i5, int i6) {
        this.a = yy5Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = gl6Var;
        this.f = f2;
        this.g = z2;
        this.h = t72Var;
        this.i = tx2Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = fl7Var;
        this.p = i5;
        this.q = i6;
    }

    @Override // defpackage.ty5
    public final long a() {
        gl6 gl6Var = this.e;
        return (((long) gl6Var.j()) << 32) | (((long) gl6Var.h()) & 4294967295L);
    }

    @Override // defpackage.ty5
    public final int b() {
        return this.p;
    }

    @Override // defpackage.ty5
    public final fl7 c() {
        return this.o;
    }

    @Override // defpackage.ty5
    public final int d() {
        return -this.l;
    }

    @Override // defpackage.ty5
    public final int e() {
        return this.n;
    }

    @Override // defpackage.ty5
    public final int f() {
        return this.q;
    }

    @Override // defpackage.ty5
    public final List<yy5> g() {
        return this.k;
    }

    @Override // defpackage.gl6
    public final int h() {
        return this.e.h();
    }

    @Override // defpackage.ty5
    public final int i() {
        return this.m;
    }

    @Override // defpackage.gl6
    public final int j() {
        return this.e.j();
    }

    @Override // defpackage.ty5
    public final int k() {
        return this.l;
    }

    @Override // defpackage.gl6
    public final Map<ei, Integer> l() {
        return this.e.l();
    }

    @Override // defpackage.gl6
    public final void m() {
        this.e.m();
    }

    @Override // defpackage.gl6
    public final oh4<wy8, g2b> n() {
        return this.e.n();
    }

    public final xy5 o(int i, boolean z) {
        yy5 yy5Var;
        int i2;
        int i3;
        if (this.g) {
            return null;
        }
        List<yy5> list = this.k;
        if (list.isEmpty() || (yy5Var = this.a) == null) {
            return null;
        }
        int i4 = yy5Var.r;
        int i5 = this.b - i;
        if (i5 < 0 || i5 >= i4) {
            return null;
        }
        yy5 yy5Var2 = (yy5) th1.y(list);
        yy5 yy5Var3 = (yy5) th1.G(list);
        if (yy5Var2.t || yy5Var3.t) {
            return null;
        }
        int i6 = yy5Var2.o;
        int i7 = this.m;
        int i8 = this.l;
        if (i < 0) {
            if (Math.min((i6 + yy5Var2.r) - i8, (yy5Var3.o + yy5Var3.r) - i7) <= (-i)) {
                return null;
            }
        } else if (Math.min(i8 - i6, i7 - yy5Var3.o) <= i) {
            return null;
        }
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            yy5 yy5Var4 = list.get(i9);
            boolean z2 = yy5Var4.c;
            int[] iArr = yy5Var4.x;
            if (!yy5Var4.t) {
                yy5Var4.o += i;
                int length = iArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 & 1;
                    if ((z2 && i11 != 0) || (!z2 && i11 == 0)) {
                        iArr[i10] = iArr[i10] + i;
                    }
                }
                if (z) {
                    int size2 = yy5Var4.b.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        sv5 sv5VarA = yy5Var4.m.a(i12, yy5Var4.k);
                        if (sv5VarA != null) {
                            long j = sv5VarA.k;
                            if (z2) {
                                i2 = (int) (j >> 32);
                                i3 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = ((int) (j >> 32)) + i;
                                i3 = (int) (j & 4294967295L);
                            }
                            sv5VarA.k = (((long) i3) & 4294967295L) | (((long) i2) << 32);
                        } else {
                            i9 = i9;
                        }
                        i12++;
                        i9 = i9;
                    }
                }
            }
            i9++;
        }
        return new xy5(this.a, i5, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }
}
