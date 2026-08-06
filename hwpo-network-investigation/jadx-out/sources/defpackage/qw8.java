package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qw8 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qw8);
    }

    public final int hashCode() {
        return Float.hashCode(0.1f) + h44.a(h44.a(Float.hashCode(0.16f) * 31, 0.1f, 31), 0.08f, 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=0.16, focusedAlpha=0.1, hoveredAlpha=0.08, pressedAlpha=0.1)";
    }
}
