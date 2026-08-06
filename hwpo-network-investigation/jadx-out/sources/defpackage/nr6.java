package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nr6 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public nr6(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nr6)) {
            return false;
        }
        nr6 nr6Var = (nr6) obj;
        return uh1.c(this.a, nr6Var.a) && uh1.c(this.b, nr6Var.b) && uh1.c(this.c, nr6Var.c) && uh1.c(this.d, nr6Var.d) && uh1.c(this.e, nr6Var.e) && uh1.c(this.f, nr6Var.f);
    }

    public final int hashCode() {
        int i = uh1.l;
        return Long.hashCode(this.f) + al.c(this.e, al.c(this.d, al.c(this.c, al.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
    }
}
