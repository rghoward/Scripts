package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eq implements w48 {
    public final int b;

    public eq(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!eq.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((eq) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return e44.a(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
