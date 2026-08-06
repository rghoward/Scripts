package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yp4 implements Serializable {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends yp4 {
        public static final C0288a Companion = new C0288a();
        public final int t;
        public final String u;
        public final String v;
        public final String w;
        public final String x;

        /* JADX INFO: renamed from: yp4$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0288a {
        }

        public a(String str, String str2, String str3, String str4, int i) {
            fk.b(str, str2, str3);
            this.t = i;
            this.u = str;
            this.v = str2;
            this.w = str3;
            this.x = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.t == aVar.t && xj5.a(this.u, aVar.u) && xj5.a(this.v, aVar.v) && xj5.a(this.w, aVar.w) && xj5.a(this.x, aVar.x);
        }

        public final int hashCode() {
            int iC = ru3.c(ru3.c(ru3.c(Integer.hashCode(this.t) * 31, 31, this.u), 31, this.v), 31, this.w);
            String str = this.x;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "affiliated";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends yp4 {
        public static final b t = new b();

        public final String toString() {
            return "garage";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends yp4 {
        public static final c t = new c();

        public final String toString() {
            return "unaffiliated";
        }
    }
}
