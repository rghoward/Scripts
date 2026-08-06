package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class js7<A, B> implements Serializable {
    public final A t;
    public final B u;

    public js7(A a, B b) {
        this.t = a;
        this.u = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js7)) {
            return false;
        }
        js7 js7Var = (js7) obj;
        return xj5.a(this.t, js7Var.t) && xj5.a(this.u, js7Var.u);
    }

    public final int hashCode() {
        A a = this.t;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.u;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.t + ", " + this.u + ')';
    }
}
