package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gu5 implements cu5, gl6 {
    public final iu5 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final gl6 e;
    public final float f;
    public final boolean g;
    public final t72 h;
    public final tx2 i;
    public final int j;
    public final oh4<Integer, List<js7<Integer, xx1>>> k;
    public final oh4<Integer, Integer> l;
    public final List<hu5> m;
    public final int n;
    public final int o;
    public final int p;
    public final fl7 q;
    public final int r;
    public final int s;

    public gu5(iu5 iu5Var, int i, boolean z, float f, gl6 gl6Var, float f2, boolean z2, t72 t72Var, tx2 tx2Var, int i2, oh4 oh4Var, oh4 oh4Var2, List list, int i3, int i4, int i5, fl7 fl7Var, int i6, int i7) {
        this.a = iu5Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = gl6Var;
        this.f = f2;
        this.g = z2;
        this.h = t72Var;
        this.i = tx2Var;
        this.j = i2;
        this.k = oh4Var;
        this.l = oh4Var2;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = fl7Var;
        this.r = i6;
        this.s = i7;
    }

    @Override // defpackage.cu5
    public final long a() {
        gl6 gl6Var = this.e;
        return (((long) gl6Var.j()) << 32) | (((long) gl6Var.h()) & 4294967295L);
    }

    @Override // defpackage.cu5
    public final int b() {
        return this.r;
    }

    @Override // defpackage.cu5
    public final fl7 c() {
        return this.q;
    }

    @Override // defpackage.cu5
    public final int d() {
        return -this.n;
    }

    @Override // defpackage.cu5
    public final int e() {
        return this.p;
    }

    @Override // defpackage.cu5
    public final int f() {
        return this.s;
    }

    @Override // defpackage.cu5
    public final List<hu5> g() {
        return this.m;
    }

    @Override // defpackage.gl6
    public final int h() {
        return this.e.h();
    }

    @Override // defpackage.cu5
    public final int i() {
        return this.o;
    }

    @Override // defpackage.gl6
    public final int j() {
        return this.e.j();
    }

    @Override // defpackage.cu5
    public final int k() {
        return this.n;
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

    public final gu5 o(int i, boolean z) {
        iu5 iu5Var;
        List<hu5> list;
        int i2;
        if (this.g) {
            return null;
        }
        List<hu5> list2 = this.m;
        if (list2.isEmpty() || (iu5Var = this.a) == null) {
            return null;
        }
        int i3 = iu5Var.g;
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= i3) {
            return null;
        }
        hu5 hu5Var = (hu5) th1.y(list2);
        hu5 hu5Var2 = (hu5) th1.G(list2);
        if (hu5Var.x || hu5Var2.x) {
            return null;
        }
        int i5 = this.o;
        int i6 = this.n;
        fl7 fl7Var = this.q;
        if (i < 0) {
            if (Math.min((pu5.a(hu5Var, fl7Var) + hu5Var.p) - i6, (pu5.a(hu5Var2, fl7Var) + hu5Var2.p) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - pu5.a(hu5Var, fl7Var), i5 - pu5.a(hu5Var2, fl7Var)) <= i) {
            return null;
        }
        int size = list2.size();
        int i7 = 0;
        while (i7 < size) {
            hu5 hu5Var3 = list2.get(i7);
            boolean z2 = hu5Var3.c;
            if (hu5Var3.x) {
                list = list2;
                i2 = size;
            } else {
                long j = hu5Var3.u;
                long j2 = 4294967295L;
                hu5Var3.u = (((long) (z2 ? (int) (j >> 32) : ((int) (j >> 32)) + i)) << 32) | (((long) (z2 ? ((int) (j & 4294967295L)) + i : (int) (j & 4294967295L))) & 4294967295L);
                if (z) {
                    int size2 = hu5Var3.h.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        sv5 sv5VarA = hu5Var3.k.a(i8, hu5Var3.b);
                        if (sv5VarA != null) {
                            long j3 = sv5VarA.k;
                            sv5VarA.k = (((long) (z2 ? ((int) (j3 & j2)) + i : (int) (j3 & j2))) & j2) | (((long) (z2 ? (int) (j3 >> 32) : ((int) (j3 >> 32)) + i)) << 32);
                        } else {
                            j2 = j2;
                        }
                        i8++;
                        list2 = list2;
                        j2 = j2;
                        size = size;
                    }
                }
                list = list2;
                i2 = size;
            }
            i7++;
            i4 = i4;
            list2 = list;
            size = i2;
        }
        return new gu5(this.a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, list2, this.n, this.o, this.p, fl7Var, this.r, this.s);
    }
}
