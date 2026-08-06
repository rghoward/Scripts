package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w74 {
    public final t74.a a;
    public cl6 b;
    public jz7 c;
    public cl6 d;
    public jz7 e;
    public sf5 f;
    public sf5 g;

    public w74(t74.a aVar) {
        this.a = aVar;
    }

    public final sf5 a(int i, boolean z, int i2) {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            if (z) {
                return this.f;
            }
            return null;
        }
        if (iOrdinal != 3) {
            u.b();
            return null;
        }
        if (z) {
            return this.f;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.g;
    }

    public final void b(pj5 pj5Var, pj5 pj5Var2, long j) {
        long jB = gl7.b(j, ds5.t);
        if (pj5Var != null) {
            int iG = xx1.g(jB);
            int i = s74.a;
            int iA = pj5Var.A(iG);
            this.f = new sf5(sf5.a(iA, pj5Var.c0(iA)));
            this.b = pj5Var instanceof cl6 ? (cl6) pj5Var : null;
            this.c = null;
        }
        if (pj5Var2 != null) {
            int iG2 = xx1.g(jB);
            int i2 = s74.a;
            int iA2 = pj5Var2.A(iG2);
            this.g = new sf5(sf5.a(iA2, pj5Var2.c0(iA2)));
            this.d = pj5Var2 instanceof cl6 ? (cl6) pj5Var2 : null;
            this.e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w74) && this.a == ((w74) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + os2.a(0, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
