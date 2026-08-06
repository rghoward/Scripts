package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vs0 {
    public final float a;
    public final aw9 b;

    public vs0(float f, aw9 aw9Var) {
        this.a = f;
        this.b = aw9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs0)) {
            return false;
        }
        vs0 vs0Var = (vs0) obj;
        return y43.e(this.a, vs0Var.a) && this.b.equals(vs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) y43.f(this.a)) + ", brush=" + this.b + ')';
    }
}
