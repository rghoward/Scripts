package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class c61 {
    public static final c61 c = new c61(th1.X(new ArrayList()), null);
    public final Set<a> a;
    public final ln4 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public c61(Set<a> set, ln4 ln4Var) {
        this.a = set;
        this.b = ln4Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c61)) {
            return false;
        }
        c61 c61Var = (c61) obj;
        return c61Var.a.equals(this.a) && xj5.a(c61Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        ln4 ln4Var = this.b;
        return iHashCode + (ln4Var != null ? ln4Var.hashCode() : 0);
    }
}
