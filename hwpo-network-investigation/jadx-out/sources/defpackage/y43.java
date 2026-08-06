package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y43 implements Comparable<y43> {
    public final float t;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean e(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String f(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(y43 y43Var) {
        return a(this.t, y43Var.t);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y43) {
            return Float.compare(this.t, ((y43) obj).t) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.t);
    }

    public final String toString() {
        return f(this.t);
    }
}
