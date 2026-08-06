package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class q38 extends gm3<g2b> {
    public final s10 b;

    public q38(s10 s10Var) {
        super(g2b.a);
        this.b = s10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q38) && this.b == ((q38) obj).b;
    }

    public final int hashCode() {
        s10 s10Var = this.b;
        if (s10Var == null) {
            return 0;
        }
        return s10Var.hashCode();
    }

    public final String toString() {
        return "InitializePlayer(appLanguage=" + this.b + ")";
    }
}
