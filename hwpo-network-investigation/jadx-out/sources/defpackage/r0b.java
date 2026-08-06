package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0b implements Comparable<r0b> {
    public final int t;

    @Override // java.lang.Comparable
    public final int compareTo(r0b r0bVar) {
        return xj5.b(this.t ^ Integer.MIN_VALUE, r0bVar.t ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0b) {
            return this.t == ((r0b) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.t);
    }

    public final String toString() {
        return String.valueOf(((long) this.t) & 4294967295L);
    }
}
