package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kn9 {
    public final long a;
    public final ub5<Float> b;
    public final float c = 0.6f;

    public kn9(long j, ub5 ub5Var) {
        this.a = j;
        this.b = ub5Var;
    }

    public final float a(float f) {
        float f2 = this.c;
        return f <= f2 ? vk6.c(0.0f, 1.0f, f / f2) : vk6.c(1.0f, 0.0f, (f - f2) / (1.0f - f2));
    }

    public final qh8 b(float f, long j) {
        long j2 = this.a;
        List listI = ws0.i(new uh1(uh1.b(0.0f, j2)), new uh1(j2), new uh1(uh1.b(0.0f, j2)));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        float fMax = Math.max(cr9.d(j), cr9.b(j)) * f * 2.0f;
        if (fMax < 0.01f) {
            fMax = 0.01f;
        }
        return new qh8(listI, jFloatToRawIntBits, fMax);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn9)) {
            return false;
        }
        kn9 kn9Var = (kn9) obj;
        return uh1.c(this.a, kn9Var.a) && xj5.a(this.b, kn9Var.b) && Float.compare(this.c, kn9Var.c) == 0;
    }

    public final int hashCode() {
        int i = uh1.l;
        return Float.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shimmer(highlightColor=");
        a83.b(this.a, ", animationSpec=", sb);
        sb.append(this.b);
        sb.append(", progressForMaxAlpha=");
        return ho.a(sb, this.c, ')');
    }
}
