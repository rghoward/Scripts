package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fj4 implements au1 {
    public final xt1 t;

    public fj4(xt1 xt1Var) {
        this.t = xt1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fj4) {
            return xj5.a(this.t, ((fj4) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode() * 31;
    }
}
