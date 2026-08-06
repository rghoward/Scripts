package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sk8 {
    public static final sk8 e = new sk8(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public sk8(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long c() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final sk8 e(sk8 sk8Var) {
        return new sk8(Math.max(this.a, sk8Var.a), Math.max(this.b, sk8Var.b), Math.min(this.c, sk8Var.c), Math.min(this.d, sk8Var.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk8)) {
            return false;
        }
        sk8 sk8Var = (sk8) obj;
        return Float.compare(this.a, sk8Var.a) == 0 && Float.compare(this.b, sk8Var.b) == 0 && Float.compare(this.c, sk8Var.c) == 0 && Float.compare(this.d, sk8Var.d) == 0;
    }

    public final boolean f() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean g(sk8 sk8Var) {
        return (this.a < sk8Var.c) & (sk8Var.a < this.c) & (this.b < sk8Var.d) & (sk8Var.b < this.d);
    }

    public final sk8 h(float f, float f2) {
        return new sk8(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + h44.a(h44.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final sk8 i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new sk8(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + ds6.c(this.a) + ", " + ds6.c(this.b) + ", " + ds6.c(this.c) + ", " + ds6.c(this.d) + ')';
    }
}
