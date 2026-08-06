package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lb2 {
    public final LinkedHashMap a = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends lb2 {
        public static final a b = new a();

        @Override // defpackage.lb2
        public final <T> T a(b<T> bVar) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final boolean equals(Object obj) {
        if (obj instanceof lb2) {
            return xj5.a(this.a, ((lb2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
