package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l87 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends l87 {
        public static final a a = new a();

        public final String toString() {
            return "Idle()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends l87 {
        public final d87 a;
        public final int b;

        public b(d87 d87Var, int i) {
            d87Var.getClass();
            this.a = d87Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && xj5.a(this.a, bVar.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + (this.b * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
            sb.append(this.a);
            sb.append(", direction=");
            return e44.a(sb, this.b, ')');
        }
    }
}
