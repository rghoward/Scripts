package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class kra {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public kra(long j, long j2, long j3, long j4, long j5, long j6) {
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
        if (obj == null || !(obj instanceof kra)) {
            return false;
        }
        kra kraVar = (kra) obj;
        return uh1.c(this.a, kraVar.a) && uh1.c(this.b, kraVar.b) && uh1.c(this.c, kraVar.c) && uh1.c(this.d, kraVar.d) && uh1.c(this.e, kraVar.e) && uh1.c(this.f, kraVar.f);
    }

    public final int hashCode() {
        int i = uh1.l;
        return Long.hashCode(this.f) + al.c(this.e, al.c(this.d, al.c(this.c, al.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
    }
}
