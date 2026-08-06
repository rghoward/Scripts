package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hk4 {
    public final int a;
    public final hjb b;

    public hk4(int i, hjb hjbVar) {
        hjbVar.getClass();
        this.a = i;
        this.b = hjbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk4)) {
            return false;
        }
        hk4 hk4Var = (hk4) obj;
        return this.a == hk4Var.a && xj5.a(this.b, hk4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}
