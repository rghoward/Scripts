package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0b implements Comparable<w0b> {
    public final long t;

    public /* synthetic */ w0b(long j) {
        this.t = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(w0b w0bVar) {
        return xj5.c(this.t ^ Long.MIN_VALUE, w0bVar.t ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0b) {
            return this.t == ((w0b) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.t);
    }

    public final String toString() {
        return yq5.f(10, this.t);
    }
}
