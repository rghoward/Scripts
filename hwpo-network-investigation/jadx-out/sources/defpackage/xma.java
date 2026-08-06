package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xma {
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
    public final long k;
    public final long l;
    public final long m;
    public final long n;

    public xma(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
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
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xma.class != obj.getClass()) {
            return false;
        }
        xma xmaVar = (xma) obj;
        return uh1.c(this.a, xmaVar.a) && uh1.c(this.b, xmaVar.b) && uh1.c(this.c, xmaVar.c) && uh1.c(this.d, xmaVar.d) && uh1.c(this.g, xmaVar.g) && uh1.c(this.h, xmaVar.h) && uh1.c(this.i, xmaVar.i) && uh1.c(this.j, xmaVar.j) && uh1.c(this.k, xmaVar.k) && uh1.c(this.l, xmaVar.l) && uh1.c(this.m, xmaVar.m) && uh1.c(this.n, xmaVar.n);
    }

    public final int hashCode() {
        int i = uh1.l;
        return Long.hashCode(this.n) + al.c(this.m, al.c(this.l, al.c(this.k, al.c(this.j, al.c(this.i, al.c(this.h, al.c(this.g, al.c(this.d, al.c(this.c, al.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
