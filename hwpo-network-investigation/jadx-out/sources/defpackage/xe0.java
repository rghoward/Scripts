package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xe0 {
    public final ef0 a;
    public final String b;
    public final ae0 c;
    public final nva<?, byte[]> d;
    public final ag3 e;

    public xe0(ef0 ef0Var, String str, ae0 ae0Var, nva nvaVar, ag3 ag3Var) {
        this.a = ef0Var;
        this.b = str;
        this.c = ae0Var;
        this.d = nvaVar;
        this.e = ag3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xe0)) {
            return false;
        }
        xe0 xe0Var = (xe0) obj;
        return this.a.equals(xe0Var.a) && this.b.equals(xe0Var.b) && this.c.equals(xe0Var.c) && this.d.equals(xe0Var.d) && this.e.equals(xe0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}
