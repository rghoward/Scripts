package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b28 {
    public final r18 a;
    public final h18 b;

    public b28(r18 r18Var, h18 h18Var) {
        this.a = r18Var;
        this.b = h18Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b28)) {
            return false;
        }
        b28 b28Var = (b28) obj;
        return xj5.a(this.b, b28Var.b) && xj5.a(this.a, b28Var.a);
    }

    public final int hashCode() {
        r18 r18Var = this.a;
        int iHashCode = (r18Var != null ? r18Var.hashCode() : 0) * 31;
        h18 h18Var = this.b;
        return iHashCode + (h18Var != null ? h18Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}
