package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hu5 implements kt5, uw5 {
    public final int a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final tq5 e;
    public final int f;
    public final int g;
    public final List<jz7> h;
    public final long i;
    public final Object j;
    public final vv5<hu5> k;
    public final long l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public int q;
    public int r;
    public int s;
    public final long t;
    public long u;
    public int v;
    public int w;
    public boolean x;

    public hu5() {
        throw null;
    }

    public hu5(int i, Object obj, int i2, int i3, tq5 tq5Var, int i4, int i5, List list, long j, Object obj2, vv5 vv5Var, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = true;
        this.d = i2;
        this.e = tq5Var;
        this.f = i4;
        this.g = i5;
        this.h = list;
        this.i = j;
        this.j = obj2;
        this.k = vv5Var;
        this.l = j2;
        this.m = i6;
        this.n = i7;
        this.q = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            jz7 jz7Var = (jz7) list.get(i8);
            iMax = Math.max(iMax, this.c ? jz7Var.u : jz7Var.t);
        }
        this.o = iMax;
        int i9 = i3 + iMax;
        this.p = i9 >= 0 ? i9 : 0;
        boolean z = this.c;
        int i10 = this.d;
        this.t = z ? (((long) i10) << 32) | (4294967295L & ((long) iMax)) : (((long) i10) & 4294967295L) | (((long) iMax) << 32);
        this.u = 0L;
        this.v = -1;
        this.w = -1;
    }

    @Override // defpackage.kt5
    public final long a() {
        return this.t;
    }

    @Override // defpackage.uw5
    public final int b() {
        return this.h.size();
    }

    @Override // defpackage.uw5
    public final long c() {
        return this.l;
    }

    @Override // defpackage.uw5
    public final int d() {
        return this.m;
    }

    @Override // defpackage.kt5
    public final long e() {
        return this.u;
    }

    @Override // defpackage.uw5
    public final void f(int i, int i2, int i3, int i4) {
        r(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.uw5
    public final int g() {
        return this.p;
    }

    @Override // defpackage.kt5, defpackage.uw5
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.uw5
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.uw5
    public final boolean h() {
        return this.x;
    }

    @Override // defpackage.uw5
    public final int i() {
        return this.n;
    }

    @Override // defpackage.uw5
    public final Object j(int i) {
        return this.h.get(i).g();
    }

    @Override // defpackage.kt5
    public final int k() {
        return this.v;
    }

    @Override // defpackage.uw5
    public final boolean l() {
        return this.c;
    }

    @Override // defpackage.uw5
    public final void m() {
        this.x = true;
    }

    @Override // defpackage.uw5
    public final long n(int i) {
        return this.u;
    }

    @Override // defpackage.kt5
    public final int o() {
        return this.w;
    }

    public final int p(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(jz7.a aVar, boolean z) {
        ko4 ko4Var;
        if (this.q == Integer.MIN_VALUE) {
            xc5.a("position() should be called first");
        }
        List<jz7> list = this.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jz7 jz7Var = list.get(i);
            int i2 = this.r;
            boolean z2 = this.c;
            int i3 = i2 - (z2 ? jz7Var.u : jz7Var.t);
            int i4 = this.s;
            long j = this.u;
            sv5 sv5VarA = this.k.a(i, this.b);
            if (sv5VarA != null) {
                if (z) {
                    sv5VarA.q = j;
                } else {
                    long jD = bg5.d(!bg5.b(sv5VarA.q, 9223372034707292159L) ? sv5VarA.q : j, ((bg5) sv5VarA.p.getValue()).a);
                    if ((p(j) <= i3 && p(jD) <= i3) || (p(j) >= i4 && p(jD) >= i4)) {
                        sv5VarA.b();
                    }
                    j = jD;
                }
                ko4Var = sv5VarA.m;
            } else {
                ko4Var = null;
            }
            long jD2 = bg5.d(j, this.i);
            if (!z && sv5VarA != null) {
                sv5VarA.l = jD2;
            }
            if (z2) {
                if (ko4Var != null) {
                    aVar.getClass();
                    jz7.a.e(jz7Var, aVar);
                    jz7Var.k0(bg5.d(jD2, jz7Var.x), 0.0f, ko4Var);
                } else {
                    jz7.a.A(aVar, jz7Var, jD2);
                }
            } else if (ko4Var != null) {
                jz7.a.y(aVar, jz7Var, jD2, ko4Var);
            } else {
                jz7.a.x(aVar, jz7Var, jD2);
            }
        }
    }

    public final void r(int i, int i2, int i3, int i4, int i5, int i6) {
        long j;
        long j2;
        boolean z = this.c;
        int i7 = z ? i4 : i3;
        this.q = i7;
        if (!z) {
            i3 = i4;
        }
        if (z && this.e == tq5.u) {
            i2 = (i3 - i2) - this.d;
        }
        if (z) {
            j = ((long) i2) << 32;
            j2 = i;
        } else {
            j = ((long) i) << 32;
            j2 = i2;
        }
        this.u = (j2 & 4294967295L) | j;
        this.v = i5;
        this.w = i6;
        this.r = -this.f;
        this.s = i7 + this.g;
    }
}
