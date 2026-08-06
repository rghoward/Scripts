package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class av8<T> implements Serializable {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Serializable {
        public final Throwable t;

        public a(Throwable th) {
            th.getClass();
            this.t = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return xj5.a(this.t, ((a) obj).t);
            }
            return false;
        }

        public final int hashCode() {
            return this.t.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.t + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).t;
        }
        return null;
    }
}
