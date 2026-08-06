package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d2a implements iw.a {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof d2a) {
            return xj5.a(this.a, ((d2a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return eca.a(')', "StringAnnotation(value=", this.a);
    }
}
