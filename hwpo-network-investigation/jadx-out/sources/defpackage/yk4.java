package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yk4 extends g5b<a, Integer> {
    public final d08 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pk.d(this.a, "Params(planId=", ")");
        }
    }

    public yk4(d08 d08Var) {
        d08Var.getClass();
        this.a = d08Var;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        return this.a.b(((a) obj).a);
    }
}
