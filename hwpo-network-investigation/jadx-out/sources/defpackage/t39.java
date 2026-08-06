package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t39 {
    public final float a;
    public final long b;
    public final a04<Float> c;

    public t39(float f, long j, a04 a04Var) {
        this.a = f;
        this.b = j;
        this.c = a04Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t39)) {
            return false;
        }
        t39 t39Var = (t39) obj;
        return Float.compare(this.a, t39Var.a) == 0 && ava.a(this.b, t39Var.b) && xj5.a(this.c, t39Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = ava.c;
        return this.c.hashCode() + al.c(this.b, iHashCode, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) ava.b(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
