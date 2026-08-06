package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pq7 implements iq7, gl6 {
    public final List<ll6> a;
    public final int b;
    public final int c;
    public final int d;
    public final fl7 e;
    public final int f;
    public final int g;
    public final int h;
    public final ll6 i;
    public final ll6 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final du9 n;
    public final gl6 o;
    public final boolean p;
    public final List<ll6> q;
    public final List<ll6> r;
    public final t72 s;
    public final tx2 t;
    public final long u;

    public pq7() {
        throw null;
    }

    public pq7(List list, int i, int i2, int i3, fl7 fl7Var, int i4, int i5, int i6, ll6 ll6Var, ll6 ll6Var2, float f, int i7, boolean z, du9 du9Var, gl6 gl6Var, boolean z2, List list2, List list3, t72 t72Var, tx2 tx2Var, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = fl7Var;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = ll6Var;
        this.j = ll6Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = du9Var;
        this.o = gl6Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = t72Var;
        this.t = tx2Var;
        this.u = j;
    }

    @Override // defpackage.iq7
    public final long a() {
        gl6 gl6Var = this.o;
        return (((long) gl6Var.j()) << 32) | (((long) gl6Var.h()) & 4294967295L);
    }

    @Override // defpackage.iq7
    public final int b() {
        return this.d;
    }

    @Override // defpackage.iq7
    public final fl7 c() {
        return this.e;
    }

    @Override // defpackage.iq7
    public final int d() {
        return -this.f;
    }

    @Override // defpackage.iq7
    public final boolean e() {
        return false;
    }

    @Override // defpackage.iq7
    public final List<ll6> f() {
        return this.a;
    }

    @Override // defpackage.iq7
    public final int g() {
        return this.b;
    }

    @Override // defpackage.gl6
    public final int h() {
        return this.o.h();
    }

    @Override // defpackage.iq7
    public final int i() {
        return this.c;
    }

    @Override // defpackage.gl6
    public final int j() {
        return this.o.j();
    }

    @Override // defpackage.iq7
    public final du9 k() {
        return this.n;
    }

    @Override // defpackage.gl6
    public final Map<ei, Integer> l() {
        return this.o.l();
    }

    @Override // defpackage.gl6
    public final void m() {
        this.o.m();
    }

    @Override // defpackage.gl6
    public final oh4<wy8, g2b> n() {
        return this.o.n();
    }

    public final pq7 o(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List<ll6> list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        ll6 ll6Var = (ll6) th1.y(list);
        ll6 ll6Var2 = (ll6) th1.G(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((ll6Var.k + i3) - i5, (ll6Var2.k + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - ll6Var.k, i4 - ll6Var2.k) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            list.get(i6).a(i);
        }
        List<ll6> list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            list2.get(i7).a(i);
        }
        List<ll6> list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            list3.get(i8).a(i);
        }
        return new pq7(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ pq7(int i, int i2, int i3, int i4, int i5, int i6, du9 du9Var, gl6 gl6Var, t72 t72Var, tx2 tx2Var, long j) {
        hf3 hf3Var = hf3.t;
        this(hf3Var, i, i2, i3, fl7.u, i4, i5, i6, null, null, 0.0f, 0, false, du9Var, gl6Var, false, hf3Var, hf3Var, t72Var, tx2Var, j);
    }
}
