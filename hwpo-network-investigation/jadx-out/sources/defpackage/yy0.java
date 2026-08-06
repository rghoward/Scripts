package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yy0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public yy0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final yy0 a(long j, long j2, long j3, long j4) {
        return new yy0(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yy0)) {
            return false;
        }
        yy0 yy0Var = (yy0) obj;
        return uh1.c(this.a, yy0Var.a) && uh1.c(this.b, yy0Var.b) && uh1.c(this.c, yy0Var.c) && uh1.c(this.d, yy0Var.d);
    }

    public final int hashCode() {
        int i = uh1.l;
        return Long.hashCode(this.d) + al.c(this.c, al.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
