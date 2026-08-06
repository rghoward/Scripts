package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ns7 {
    public final qp a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public ns7(qp qpVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = qpVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final sk8 a(sk8 sk8Var) {
        return sk8Var.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = lja.b;
            if (lja.b(j, j2)) {
                return j2;
            }
        }
        int i = lja.c;
        int i2 = this.b;
        return ay.c(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final sk8 c(sk8 sk8Var) {
        float f = -this.f;
        return sk8Var.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return uh8.g(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ns7) {
            ns7 ns7Var = (ns7) obj;
            if (this.a == ns7Var.a && this.b == ns7Var.b && this.c == ns7Var.c && this.d == ns7Var.d && this.e == ns7Var.e && Float.compare(this.f, ns7Var.f) == 0 && Float.compare(this.g, ns7Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + h44.a(os2.a(this.e, os2.a(this.d, os2.a(this.c, os2.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return ho.a(sb, this.g, ')');
    }
}
