package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ko7 implements go7 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ko7(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            sc5.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.go7
    public final float a() {
        return this.d;
    }

    @Override // defpackage.go7
    public final float b(tq5 tq5Var) {
        return tq5Var == tq5.t ? this.a : this.c;
    }

    @Override // defpackage.go7
    public final float c(tq5 tq5Var) {
        return tq5Var == tq5.t ? this.c : this.a;
    }

    @Override // defpackage.go7
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ko7)) {
            return false;
        }
        ko7 ko7Var = (ko7) obj;
        return y43.e(this.a, ko7Var.a) && y43.e(this.b, ko7Var.b) && y43.e(this.c, ko7Var.c) && y43.e(this.d, ko7Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + h44.a(h44.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) y43.f(this.a)) + ", top=" + ((Object) y43.f(this.b)) + ", end=" + ((Object) y43.f(this.c)) + ", bottom=" + ((Object) y43.f(this.d)) + ')';
    }
}
