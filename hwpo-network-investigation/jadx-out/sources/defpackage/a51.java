package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a51 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public a51(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a51)) {
            return false;
        }
        a51 a51Var = (a51) obj;
        return uh1.c(this.a, a51Var.a) && uh1.c(this.b, a51Var.b) && uh1.c(this.c, a51Var.c) && uh1.c(this.d, a51Var.d);
    }

    public final int hashCode() {
        int i = uh1.l;
        return Long.hashCode(this.d) + al.c(this.c, al.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }
}
