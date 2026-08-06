package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gg1 {
    public final float a;

    public gg1(float f) {
        this.a = f;
    }

    public final Float a() {
        return Float.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gg1)) {
            return false;
        }
        float f = this.a;
        return (0.0f > f && 0.0f > ((gg1) obj).a) || f == ((gg1) obj).a;
    }

    public final int hashCode() {
        float f = this.a;
        if (0.0f > f) {
            return -1;
        }
        return Float.hashCode(f) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.a;
    }
}
