package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class oo9 extends g5b<a, ha0> {
    public final w5b a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return op3.a("Params(email=", this.a, ", password=", this.b, ")");
        }
    }

    public oo9(w5b w5bVar) {
        w5bVar.getClass();
        this.a = w5bVar;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        a aVar = (a) obj;
        return this.a.j(aVar.a, aVar.b, bVar);
    }
}
