package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nb2 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends nb2 {
        public final di.b a;

        public a(sp0.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.nb2
        public final int a(int i, int i2, tq5 tq5Var) {
            return this.a.a(i2, i, tq5Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && xj5.a(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends nb2 {
        public final di.c a;

        public b(sp0.b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.nb2
        public final int a(int i, int i2, tq5 tq5Var) {
            return this.a.a(i2, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && xj5.a(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.a + ')';
        }
    }

    public abstract int a(int i, int i2, tq5 tq5Var);
}
