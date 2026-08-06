package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vu8 extends g5b<a, String> {
    public final w5b a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return sk0.c("Params(email=", this.a, ")");
        }
    }

    public vu8(w5b w5bVar) {
        w5bVar.getClass();
        this.a = w5bVar;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        return this.a.d(((a) obj).a, bVar);
    }
}
