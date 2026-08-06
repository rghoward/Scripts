package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xd3<L, R> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<L> extends xd3 {
        public final L a;

        public a(L l) {
            this.a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && xj5.a(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            L l = this.a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return "Left(a=" + this.a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<R> extends xd3 {
        public final R a;

        public b(R r) {
            this.a = r;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && xj5.a(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            R r = this.a;
            if (r == null) {
                return 0;
            }
            return r.hashCode();
        }

        public final String toString() {
            return "Right(b=" + this.a + ")";
        }
    }

    public final void a(oh4 oh4Var, oh4 oh4Var2) {
        if (this instanceof a) {
            oh4Var2.invoke(((a) this).a);
        } else if (this instanceof b) {
            oh4Var.invoke(((b) this).a);
        } else {
            u.b();
        }
    }
}
