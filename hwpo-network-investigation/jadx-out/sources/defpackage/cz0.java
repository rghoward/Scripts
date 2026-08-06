package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cz0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public cz0(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cz0)) {
            return false;
        }
        cz0 cz0Var = (cz0) obj;
        return y43.e(this.a, cz0Var.a) && y43.e(this.b, cz0Var.b) && y43.e(this.c, cz0Var.c) && y43.e(this.d, cz0Var.d) && y43.e(this.e, cz0Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + h44.a(h44.a(h44.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }
}
