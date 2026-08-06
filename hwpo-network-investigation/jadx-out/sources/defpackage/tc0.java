package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tc0 extends bi0 {
    public final bi0.a a;
    public final long b;

    public tc0(bi0.a aVar, long j) {
        this.a = aVar;
        this.b = j;
    }

    @Override // defpackage.bi0
    public final long a() {
        return this.b;
    }

    @Override // defpackage.bi0
    public final bi0.a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bi0)) {
            return false;
        }
        bi0 bi0Var = (bi0) obj;
        return this.a.equals(bi0Var.b()) && this.b == bi0Var.a();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.a);
        sb.append(", nextRequestWaitMillis=");
        return jp2.a(this.b, "}", sb);
    }
}
