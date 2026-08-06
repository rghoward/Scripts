package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pda {
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public final long J;
    public final long K;
    public final long L;
    public final long M;
    public final long N;
    public final long O;
    public final long P;
    public final long Q;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final qja k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;
    public final long y;
    public final long z;

    public pda(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, qja qjaVar, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = qjaVar;
        this.l = j11;
        this.m = j12;
        this.n = j13;
        this.o = j14;
        this.p = j15;
        this.q = j16;
        this.r = j17;
        this.s = j18;
        this.t = j19;
        this.u = j20;
        this.v = j21;
        this.w = j22;
        this.x = j23;
        this.y = j24;
        this.z = j25;
        this.A = j26;
        this.B = j27;
        this.C = j28;
        this.D = j29;
        this.E = j30;
        this.F = j31;
        this.G = j32;
        this.H = j33;
        this.I = j34;
        this.J = j35;
        this.K = j36;
        this.L = j37;
        this.M = j38;
        this.N = j39;
        this.O = j40;
        this.P = j41;
        this.Q = j42;
    }

    public final pda a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, qja qjaVar, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        return new pda(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f, j7 != 16 ? j7 : this.g, j8 != r1 ? j8 : this.h, j9 != r1 ? j9 : this.i, j10 != r1 ? j10 : this.j, qjaVar == null ? this.k : qjaVar, j11 != 16 ? j11 : this.l, j12 != 16 ? j12 : this.m, j13 != 16 ? j13 : this.n, j14 != 16 ? j14 : this.o, j15 != 16 ? j15 : this.p, j16 != 16 ? j16 : this.q, j17 != 16 ? j17 : this.r, j18 != 16 ? j18 : this.s, j19 != 16 ? j19 : this.t, j20 != 16 ? j20 : this.u, j21 != 16 ? j21 : this.v, j22 != 16 ? j22 : this.w, j23 != 16 ? j23 : this.x, j24 != 16 ? j24 : this.y, j25 != 16 ? j25 : this.z, j26 != 16 ? j26 : this.A, j27 != 16 ? j27 : this.B, j28 != 16 ? j28 : this.C, j29 != 16 ? j29 : this.D, j30 != 16 ? j30 : this.E, j31 != 16 ? j31 : this.F, j32 != 16 ? j32 : this.G, j33 != 16 ? j33 : this.H, j34 != 16 ? j34 : this.I, j35 != 16 ? j35 : this.J, j36 != 16 ? j36 : this.K, j37 != 16 ? j37 : this.L, j38 != 16 ? j38 : this.M, j39 != 16 ? j39 : this.N, j40 != 16 ? j40 : this.O, j41 != 16 ? j41 : this.P, j42 != 16 ? j42 : this.Q);
    }

    public final long c(boolean z, boolean z2, boolean z3) {
        if (!z) {
            return this.n;
        }
        if (z2) {
            return this.o;
        }
        return z3 ? this.l : this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pda)) {
            return false;
        }
        pda pdaVar = (pda) obj;
        return uh1.c(this.a, pdaVar.a) && uh1.c(this.b, pdaVar.b) && uh1.c(this.c, pdaVar.c) && uh1.c(this.d, pdaVar.d) && uh1.c(this.e, pdaVar.e) && uh1.c(this.f, pdaVar.f) && uh1.c(this.g, pdaVar.g) && uh1.c(this.h, pdaVar.h) && uh1.c(this.i, pdaVar.i) && uh1.c(this.j, pdaVar.j) && xj5.a(this.k, pdaVar.k) && uh1.c(this.l, pdaVar.l) && uh1.c(this.m, pdaVar.m) && uh1.c(this.n, pdaVar.n) && uh1.c(this.o, pdaVar.o) && uh1.c(this.p, pdaVar.p) && uh1.c(this.q, pdaVar.q) && uh1.c(this.r, pdaVar.r) && uh1.c(this.s, pdaVar.s) && uh1.c(this.t, pdaVar.t) && uh1.c(this.u, pdaVar.u) && uh1.c(this.v, pdaVar.v) && uh1.c(this.w, pdaVar.w) && uh1.c(this.x, pdaVar.x) && uh1.c(this.y, pdaVar.y) && uh1.c(this.z, pdaVar.z) && uh1.c(this.A, pdaVar.A) && uh1.c(this.B, pdaVar.B) && uh1.c(this.C, pdaVar.C) && uh1.c(this.D, pdaVar.D) && uh1.c(this.E, pdaVar.E) && uh1.c(this.F, pdaVar.F) && uh1.c(this.G, pdaVar.G) && uh1.c(this.H, pdaVar.H) && uh1.c(this.I, pdaVar.I) && uh1.c(this.J, pdaVar.J) && uh1.c(this.K, pdaVar.K) && uh1.c(this.L, pdaVar.L) && uh1.c(this.M, pdaVar.M) && uh1.c(this.N, pdaVar.N) && uh1.c(this.O, pdaVar.O) && uh1.c(this.P, pdaVar.P) && uh1.c(this.Q, pdaVar.Q);
    }

    public final int hashCode() {
        int i = uh1.l;
        return Long.hashCode(this.Q) + al.c(this.P, al.c(this.O, al.c(this.N, al.c(this.M, al.c(this.L, al.c(this.K, al.c(this.J, al.c(this.I, al.c(this.H, al.c(this.G, al.c(this.F, al.c(this.E, al.c(this.D, al.c(this.C, al.c(this.B, al.c(this.A, al.c(this.z, al.c(this.y, al.c(this.x, al.c(this.w, al.c(this.v, al.c(this.u, al.c(this.t, al.c(this.s, al.c(this.r, al.c(this.q, al.c(this.p, al.c(this.o, al.c(this.n, al.c(this.m, al.c(this.l, (this.k.hashCode() + al.c(this.j, al.c(this.i, al.c(this.h, al.c(this.g, al.c(this.f, al.c(this.e, al.c(this.d, al.c(this.c, al.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
