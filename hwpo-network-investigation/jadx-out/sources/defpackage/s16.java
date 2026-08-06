package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s16 implements w06, uw5 {
    public final int a;
    public final Object b;
    public final List<jz7> c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Object i;
    public final vv5<s16> j;
    public final long k;
    public boolean l;
    public final int m;
    public final int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final long s;
    public long t;

    public s16() {
        throw null;
    }

    public s16(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, vv5 vv5Var, long j) {
        int i7;
        this.a = i;
        this.b = obj;
        this.c = list;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = obj2;
        this.j = vv5Var;
        this.k = j;
        int i8 = 1;
        this.l = true;
        int i9 = 0;
        if (!list.isEmpty()) {
            jz7 jz7Var = (jz7) list.get(0);
            i7 = z ? jz7Var.u : jz7Var.t;
            int size = list.size() - 1;
            if (1 <= size) {
                int i10 = 1;
                while (true) {
                    jz7 jz7Var2 = (jz7) list.get(i10);
                    int i11 = this.d ? jz7Var2.u : jz7Var2.t;
                    i7 = i11 > i7 ? i11 : i7;
                    if (i10 == size) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            i7 = 0;
        }
        this.m = i7;
        int i12 = i7 + i2;
        this.n = i12 < 0 ? 0 : i12;
        List<jz7> list2 = this.c;
        if (!list2.isEmpty()) {
            jz7 jz7Var3 = list2.get(0);
            int i13 = this.d ? jz7Var3.t : jz7Var3.u;
            int size2 = list2.size() - 1;
            if (1 <= size2) {
                while (true) {
                    jz7 jz7Var4 = list2.get(i8);
                    int i14 = this.d ? jz7Var4.t : jz7Var4.u;
                    i13 = i14 > i13 ? i14 : i13;
                    if (i8 == size2) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            i9 = i13;
        }
        this.o = Integer.MIN_VALUE;
        boolean z2 = this.d;
        int i15 = this.m;
        this.s = z2 ? (((long) i15) & 4294967295L) | (((long) i9) << 32) : (((long) i15) << 32) | (4294967295L & ((long) i9));
        this.t = 0L;
    }

    @Override // defpackage.w06
    public final long a() {
        return this.s;
    }

    @Override // defpackage.uw5
    public final int b() {
        return this.c.size();
    }

    @Override // defpackage.uw5
    public final long c() {
        return this.k;
    }

    @Override // defpackage.w06, defpackage.uw5
    public final int d() {
        return this.e;
    }

    @Override // defpackage.w06
    public final long e() {
        return this.t;
    }

    @Override // defpackage.uw5
    public final void f(int i, int i2, int i3, int i4) {
        if (this.d) {
            i3 = i4;
        }
        p(i, i2, i3);
    }

    @Override // defpackage.uw5
    public final int g() {
        return this.n;
    }

    @Override // defpackage.w06, defpackage.uw5
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.uw5
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.uw5
    public final boolean h() {
        return this.r;
    }

    @Override // defpackage.uw5
    public final int i() {
        return this.f;
    }

    @Override // defpackage.uw5
    public final Object j(int i) {
        return this.c.get(i).g();
    }

    public final int k(long j) {
        return (int) (this.d ? j & 4294967295L : j >> 32);
    }

    @Override // defpackage.uw5
    public final boolean l() {
        return this.d;
    }

    @Override // defpackage.uw5
    public final void m() {
        this.r = true;
    }

    @Override // defpackage.uw5
    public final long n(int i) {
        return this.t;
    }

    public final int o() {
        long j = this.t;
        return (int) (!this.d ? j >> 32 : j & 4294967295L);
    }

    public final void p(int i, int i2, int i3) {
        long j;
        this.o = i3;
        this.p = -this.g;
        this.q = i3 + this.h;
        if (this.d) {
            j = (((long) i2) << 32) | (4294967295L & ((long) i));
        } else {
            j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        this.t = j;
    }
}
