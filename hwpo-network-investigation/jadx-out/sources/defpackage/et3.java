package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class et3 {
    public final float a;
    public final a04<Float> b;

    public et3(float f, a04<Float> a04Var) {
        this.a = f;
        this.b = a04Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et3)) {
            return false;
        }
        et3 et3Var = (et3) obj;
        return Float.compare(this.a, et3Var.a) == 0 && xj5.a(this.b, et3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
