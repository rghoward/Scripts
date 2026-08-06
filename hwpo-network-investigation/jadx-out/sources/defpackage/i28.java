package defpackage;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i28 {
    public static final bq6.b u = new bq6.b(new Object());
    public final toa a;
    public final bq6.b b;
    public final long c;
    public final long d;
    public final int e;
    public final lo3 f;
    public final boolean g;
    public final gsa h;
    public final nsa i;
    public final List<su6> j;
    public final bq6.b k;
    public final boolean l;
    public final int m;
    public final int n;
    public final k28 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public i28(toa toaVar, bq6.b bVar, long j, long j2, int i, lo3 lo3Var, boolean z, gsa gsaVar, nsa nsaVar, List<su6> list, bq6.b bVar2, boolean z2, int i2, int i3, k28 k28Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = toaVar;
        this.b = bVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = lo3Var;
        this.g = z;
        this.h = gsaVar;
        this.i = nsaVar;
        this.j = list;
        this.k = bVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = k28Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static i28 k(nsa nsaVar) {
        toa.a aVar = toa.a;
        gsa gsaVar = gsa.d;
        ul8 ul8Var = ul8.x;
        k28 k28Var = k28.d;
        bq6.b bVar = u;
        return new i28(aVar, bVar, -9223372036854775807L, 0L, 1, null, false, gsaVar, nsaVar, ul8Var, bVar, false, 1, 0, k28Var, 0L, 0L, 0L, 0L, false);
    }

    public final i28 a() {
        return new i28(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final i28 b(boolean z) {
        return new i28(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final i28 c(bq6.b bVar) {
        return new i28(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, bVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final i28 d(bq6.b bVar, long j, long j2, long j3, long j4, gsa gsaVar, nsa nsaVar, List<su6> list) {
        return new i28(this.a, bVar, j2, j3, this.e, this.f, this.g, gsaVar, nsaVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final i28 e(int i, boolean z, int i2) {
        return new i28(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final i28 f(lo3 lo3Var) {
        return new i28(this.a, this.b, this.c, this.d, this.e, lo3Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final i28 g(k28 k28Var) {
        return new i28(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, k28Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final i28 h(int i) {
        return new i28(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final i28 i(boolean z) {
        return new i28(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final i28 j(toa toaVar) {
        return new i28(toaVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return n6b.N(n6b.Z(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
