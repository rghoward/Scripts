package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xi6 {
    public final String a;
    public final fg5 b;

    public xi6(String str, fg5 fg5Var) {
        this.a = str;
        this.b = fg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi6)) {
            return false;
        }
        xi6 xi6Var = (xi6) obj;
        return this.a.equals(xi6Var.a) && this.b.equals(xi6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
