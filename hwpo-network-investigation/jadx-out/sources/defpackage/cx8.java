package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cx8 implements bb5 {
    public final boolean a;
    public final long b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements di1 {
        public a() {
        }

        @Override // defpackage.di1
        public final long a() {
            return cx8.this.b;
        }
    }

    public cx8(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    @Override // defpackage.bb5
    public final dw2 a(h27 h27Var) {
        return new zw2(h27Var, this.a, new a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx8)) {
            return false;
        }
        cx8 cx8Var = (cx8) obj;
        if (this.a == cx8Var.a && y43.e(Float.NaN, Float.NaN)) {
            return uh1.c(this.b, cx8Var.b);
        }
        return false;
    }

    @Override // defpackage.bb5
    public final int hashCode() {
        int iA = h44.a(Boolean.hashCode(this.a) * 31, Float.NaN, 961);
        int i = uh1.l;
        return Long.hashCode(this.b) + iA;
    }
}
