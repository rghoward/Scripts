package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l86 implements iw.a {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends l86 {
        public final String a;
        public final fja b;
        public final m86 c;

        public a(String str, fja fjaVar, m86 m86Var) {
            this.a = str;
            this.b = fjaVar;
            this.c = m86Var;
        }

        @Override // defpackage.l86
        public final m86 a() {
            return this.c;
        }

        @Override // defpackage.l86
        public final fja b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.a, aVar.a) && xj5.a(this.b, aVar.b) && xj5.a(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            fja fjaVar = this.b;
            int iHashCode2 = (iHashCode + (fjaVar != null ? fjaVar.hashCode() : 0)) * 31;
            m86 m86Var = this.c;
            return iHashCode2 + (m86Var != null ? m86Var.hashCode() : 0);
        }

        public final String toString() {
            return wu0.a(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends l86 {
        public final String a;
        public final fja b;
        public final m86 c;

        public b(String str, fja fjaVar, m86 m86Var) {
            this.a = str;
            this.b = fjaVar;
            this.c = m86Var;
        }

        @Override // defpackage.l86
        public final m86 a() {
            return this.c;
        }

        @Override // defpackage.l86
        public final fja b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return xj5.a(this.a, bVar.a) && xj5.a(this.b, bVar.b) && xj5.a(this.c, bVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            fja fjaVar = this.b;
            int iHashCode2 = (iHashCode + (fjaVar != null ? fjaVar.hashCode() : 0)) * 31;
            m86 m86Var = this.c;
            return iHashCode2 + (m86Var != null ? m86Var.hashCode() : 0);
        }

        public final String toString() {
            return wu0.a(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
        }
    }

    public abstract m86 a();

    public abstract fja b();
}
