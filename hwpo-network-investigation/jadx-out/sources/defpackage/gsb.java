package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gsb implements bl0 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends gsb {
        public static final a a = new a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends gsb {
        public final yp4 a;

        public b(yp4 yp4Var) {
            this.a = yp4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && xj5.a(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            yp4 yp4Var = this.a;
            if (yp4Var == null) {
                return 0;
            }
            return yp4Var.hashCode();
        }

        public final String toString() {
            return "InitGym(gym=" + this.a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends gsb {
        public final yp4 a;

        public c(yp4 yp4Var) {
            this.a = yp4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && xj5.a(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            yp4 yp4Var = this.a;
            if (yp4Var == null) {
                return 0;
            }
            return yp4Var.hashCode();
        }

        public final String toString() {
            return "SetGym(gym=" + this.a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends gsb {
        public static final d a = new d();
    }
}
