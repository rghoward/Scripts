package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class db6<L> {
    public final jt4 a;
    public volatile a b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<L> {
        public final t0d a;
        public final String b;

        public a(t0d t0dVar, String str) {
            this.a = t0dVar;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
        }
    }

    public db6(Looper looper, t0d t0dVar, String str) {
        this.a = new jt4(looper);
        a78.d(str);
        this.b = new a(t0dVar, str);
    }
}
