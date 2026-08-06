package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xz6 implements su6.a {
    public final long a;
    public final long b;
    public final long c;

    public xz6(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz6)) {
            return false;
        }
        xz6 xz6Var = (xz6) obj;
        return this.a == xz6Var.a && this.b == xz6Var.b && this.c == xz6Var.c;
    }

    public final int hashCode() {
        return bf6.b(this.c) + ((bf6.b(this.b) + ((bf6.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
