package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i44 {
    public final float a;
    public final tx2 b;
    public final float c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final float a;
        public final float b;
        public final long c;

        public a(float f, float f2, long j) {
            this.a = f;
            this.b = f2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + h44.a(Float.hashCode(this.a) * 31, this.b, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
            sb.append(this.a);
            sb.append(", distance=");
            sb.append(this.b);
            sb.append(", duration=");
            return fh0.b(sb, this.c, ')');
        }
    }

    public i44(float f, tx2 tx2Var) {
        this.a = f;
        this.b = tx2Var;
        float density = tx2Var.getDensity();
        float f2 = j44.a;
        this.c = density * 386.0878f * 160.0f * 0.84f;
    }

    public final a a(float f) {
        double dB = b(f);
        double d = j44.a;
        double d2 = d - 1.0d;
        return new a(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.c))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = io.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.c)));
    }
}
