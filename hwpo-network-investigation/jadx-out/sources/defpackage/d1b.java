package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1b implements Comparable<d1b> {
    public final short t;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(d1b d1bVar) {
        return xj5.b(this.t & 65535, d1bVar.t & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d1b) {
            return this.t == ((d1b) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.t);
    }

    public final String toString() {
        return String.valueOf(this.t & 65535);
    }
}
