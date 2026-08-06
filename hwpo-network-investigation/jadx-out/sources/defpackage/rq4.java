package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rq4 extends gm3<g2b> {
    public final oq4 b;

    public rq4(oq4 oq4Var) {
        super(g2b.a);
        this.b = oq4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rq4) && xj5.a(this.b, ((rq4) obj).b);
    }

    public final int hashCode() {
        oq4 oq4Var = this.b;
        if (oq4Var == null) {
            return 0;
        }
        return oq4Var.hashCode();
    }

    public final String toString() {
        return "SetResultAndClose(result=" + this.b + ")";
    }
}
