package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d53 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d53) && y43.e(10.0f, 10.0f) && y43.e(40.0f, 40.0f) && y43.e(10.0f, 10.0f) && y43.e(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + h44.a(h44.a(h44.a(Float.hashCode(10.0f) * 31, 40.0f, 31), 10.0f, 31), 40.0f, 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) y43.f(10.0f)) + ", top=" + ((Object) y43.f(40.0f)) + ", end=" + ((Object) y43.f(10.0f)) + ", bottom=" + ((Object) y43.f(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
