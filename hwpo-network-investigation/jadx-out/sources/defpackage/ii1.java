package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ii1 {
    public final String a;
    public final long b;
    public final int c;

    public ii1(int i, long j, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            z90.a("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            z90.a("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i);

    public abstract float c(int i);

    public boolean d() {
        return false;
    }

    public long e(float f, float f2, float f3) {
        float[] fArrF = f(new float[]{f, f2, f3});
        return (((long) Float.floatToRawIntBits(fArrF[0])) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fArrF[1])));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ii1 ii1Var = (ii1) obj;
        if (this.c == ii1Var.c && this.a.equals(ii1Var.a)) {
            return q69.d(this.b, ii1Var.b);
        }
        return false;
    }

    public abstract float[] f(float[] fArr);

    public float g(float f, float f2, float f3) {
        return f(new float[]{f, f2, f3})[2];
    }

    public long h(float f, float f2, float f3, float f4, ii1 ii1Var) {
        float[] fArr = new float[(int) (this.b >> 32)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        float[] fArrA = a(fArr);
        return u7d.a(fArrA[0], fArrA[1], fArrA[2], f4, ii1Var);
    }

    public int hashCode() {
        return al.c(this.b, this.a.hashCode() * 31, 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) q69.g(this.b)) + ')';
    }
}
