package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jfa {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends jfa {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends jfa {
        public final sp0.a a;
        public final sp0.a b;

        public b(int i) {
            sp0.a aVar = di.a.m;
            this.a = aVar;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return xj5.a(this.a, bVar.a) && xj5.a(this.b, bVar.b);
        }

        public final int hashCode() {
            return Float.hashCode(this.b.a) + h44.a(Boolean.hashCode(false) * 31, this.a.a, 31);
        }

        public final String toString() {
            return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
        }
    }
}
