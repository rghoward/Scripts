package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fe extends gm3<ed6> {
    public final ed6 b;

    public fe(ed6 ed6Var) {
        super(ed6Var);
        this.b = ed6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe) && this.b.equals(((fe) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShowLocationFilterDialog(request=" + this.b + ")";
    }
}
