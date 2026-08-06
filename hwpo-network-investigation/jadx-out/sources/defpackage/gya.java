package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gya<A, B, C> implements Serializable {
    public final A t;
    public final B u;
    public final C v;

    public gya(A a, B b, C c) {
        this.t = a;
        this.u = b;
        this.v = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gya)) {
            return false;
        }
        gya gyaVar = (gya) obj;
        return xj5.a(this.t, gyaVar.t) && xj5.a(this.u, gyaVar.u) && xj5.a(this.v, gyaVar.v);
    }

    public final int hashCode() {
        A a = this.t;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.u;
        int iHashCode2 = (iHashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.v;
        return iHashCode2 + (c != null ? c.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.t + ", " + this.u + ", " + this.v + ')';
    }
}
