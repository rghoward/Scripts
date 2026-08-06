package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xk4 extends g5b<a, k49> {
    public final kd8 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            return jp2.a(this.b, ")", ao3.b("Params(from=", this.a, ", to="));
        }
    }

    public xk4(kd8 kd8Var) {
        kd8Var.getClass();
        this.a = kd8Var;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        a aVar = (a) obj;
        return this.a.e(aVar.a, aVar.b, bVar);
    }
}
