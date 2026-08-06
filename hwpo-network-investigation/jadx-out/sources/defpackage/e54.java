package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e54 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public e54(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e54)) {
            return false;
        }
        e54 e54Var = (e54) obj;
        if (y43.e(this.a, e54Var.a) && y43.e(this.b, e54Var.b) && y43.e(this.c, e54Var.c)) {
            return y43.e(this.d, e54Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + h44.a(h44.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
