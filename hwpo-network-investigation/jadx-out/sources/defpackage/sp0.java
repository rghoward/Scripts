package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sp0 implements di {
    public final float a;
    public final float b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements di.b {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // di.b
        public final int a(int i, int i2, tq5 tq5Var) {
            float f = (i2 - i) / 2.0f;
            tq5 tq5Var2 = tq5.t;
            float f2 = this.a;
            if (tq5Var != tq5Var2) {
                f2 *= -1.0f;
            }
            return Math.round((1.0f + f2) * f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return ho.a(new StringBuilder("Horizontal(bias="), this.a, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements di.c {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        @Override // di.c
        public final int a(int i, int i2) {
            return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return ho.a(new StringBuilder("Vertical(bias="), this.a, ')');
        }
    }

    public sp0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.di
    public final long a(long j, long j2, tq5 tq5Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        tq5 tq5Var2 = tq5.t;
        float f3 = this.a;
        if (tq5Var != tq5Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp0)) {
            return false;
        }
        sp0 sp0Var = (sp0) obj;
        return Float.compare(this.a, sp0Var.a) == 0 && Float.compare(this.b, sp0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return ho.a(sb, this.b, ')');
    }
}
