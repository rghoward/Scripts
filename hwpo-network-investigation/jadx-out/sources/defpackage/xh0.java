package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xh0 implements lj1 {
    public final z59 a;

    public xh0(rf4 rf4Var) {
        this.a = rf4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh0) && xj5.a(this.a, ((xh0) obj).a);
    }

    public final int hashCode() {
        z59 z59Var = this.a;
        if (z59Var == null) {
            return 0;
        }
        return z59Var.hashCode();
    }

    public final String toString() {
        return "BackTo(screen=" + this.a + ')';
    }
}
