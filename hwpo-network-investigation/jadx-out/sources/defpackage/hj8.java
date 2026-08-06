package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hj8 implements lr9 {
    public final br9 t;

    public hj8(br9 br9Var) {
        this.t = br9Var;
    }

    @Override // defpackage.lr9
    public final Object b(wi8 wi8Var) {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hj8) {
            return xj5.a(this.t, ((hj8) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
