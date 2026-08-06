package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yy5 implements hy5, uw5 {
    public final int a;
    public final List<jz7> b;
    public final boolean c;
    public final di.b d;
    public final di.c e;
    public final tq5 f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final Object k;
    public final Object l;
    public final vv5<yy5> m;
    public final long n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public final int[] x;

    public yy5() {
        throw null;
    }

    public yy5(int i, List list, boolean z, di.b bVar, di.c cVar, tq5 tq5Var, int i2, int i3, int i4, long j, Object obj, Object obj2, vv5 vv5Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = bVar;
        this.e = cVar;
        this.f = tq5Var;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = j;
        this.k = obj;
        this.l = obj2;
        this.m = vv5Var;
        this.n = j2;
        this.q = 1;
        this.u = Integer.MIN_VALUE;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            jz7 jz7Var = (jz7) list.get(i6);
            boolean z2 = this.c;
            i5 += z2 ? jz7Var.u : jz7Var.t;
            iMax = Math.max(iMax, !z2 ? jz7Var.u : jz7Var.t);
        }
        this.p = i5;
        int i7 = i5 + this.i;
        this.r = i7 >= 0 ? i7 : 0;
        this.s = iMax;
        this.x = new int[this.b.size() * 2];
    }

    public final int a(long j) {
        return (int) (this.c ? j & 4294967295L : j >> 32);
    }

    @Override // defpackage.uw5
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.uw5
    public final long c() {
        return this.n;
    }

    @Override // defpackage.uw5
    public final int d() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(jz7.a aVar, boolean z) {
        ko4 ko4Var;
        if (this.u == Integer.MIN_VALUE) {
            xc5.a("position() should be called first");
        }
        List<jz7> list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jz7 jz7Var = list.get(i);
            int i2 = this.v;
            boolean z2 = this.c;
            int i3 = i2 - (z2 ? jz7Var.u : jz7Var.t);
            int i4 = this.w;
            long jN = n(i);
            sv5 sv5VarA = this.m.a(i, this.k);
            if (sv5VarA != null) {
                if (z) {
                    sv5VarA.q = jN;
                } else {
                    if (!bg5.b(sv5VarA.q, 9223372034707292159L)) {
                        jN = sv5VarA.q;
                    }
                    long jD = bg5.d(jN, ((bg5) sv5VarA.p.getValue()).a);
                    if ((a(jN) <= i3 && a(jD) <= i3) || (a(jN) >= i4 && a(jD) >= i4)) {
                        sv5VarA.b();
                    }
                    jN = jD;
                }
                ko4Var = sv5VarA.m;
            } else {
                ko4Var = null;
            }
            long jD2 = bg5.d(jN, this.j);
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

    @Override // defpackage.uw5
    public final void f(int i, int i2, int i3, int i4) {
        k(i, i3, i4);
    }

    @Override // defpackage.uw5
    public final int g() {
        return this.r;
    }

    @Override // defpackage.hy5, defpackage.uw5
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.hy5, defpackage.uw5
    public final Object getKey() {
        return this.k;
    }

    @Override // defpackage.hy5
    public final int getOffset() {
        return this.o;
    }

    @Override // defpackage.hy5
    public final int getSize() {
        return this.p;
    }

    @Override // defpackage.uw5
    public final boolean h() {
        return this.t;
    }

    @Override // defpackage.uw5
    public final int i() {
        return this.q;
    }

    @Override // defpackage.uw5
    public final Object j(int i) {
        return this.b.get(i).g();
    }

    public final void k(int i, int i2, int i3) {
        int i4;
        this.o = i;
        boolean z = this.c;
        this.u = z ? i3 : i2;
        List<jz7> list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            jz7 jz7Var = list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.x;
            if (z) {
                di.b bVar = this.d;
                if (bVar == null) {
                    throw x70.a("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = bVar.a(jz7Var.t, i2, this.f);
                iArr[i6 + 1] = i;
                i4 = jz7Var.u;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                di.c cVar = this.e;
                if (cVar == null) {
                    throw x70.a("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = cVar.a(jz7Var.u, i3);
                i4 = jz7Var.t;
            }
            i += i4;
        }
        this.v = -this.g;
        this.w = this.u + this.h;
    }

    @Override // defpackage.uw5
    public final boolean l() {
        return this.c;
    }

    @Override // defpackage.uw5
    public final void m() {
        this.t = true;
    }

    @Override // defpackage.uw5
    public final long n(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.o;
            return this.c ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.x;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }
}
