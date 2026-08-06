package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ob6 extends g5b<a, List<? extends m89>> {
    public final f70 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final sn6 a;

        public a(sn6 sn6Var) {
            this.a = sn6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            sn6 sn6Var = this.a;
            return Integer.hashCode(30) + ((sn6Var == null ? 0 : sn6Var.hashCode()) * 31);
        }

        public final String toString() {
            return "Params(type=" + this.a + ", itemsPerPage=30)";
        }
    }

    public ob6(f70 f70Var) {
        f70Var.getClass();
        this.a = f70Var;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        return this.a.a(((a) obj).a, 30, bVar);
    }
}
