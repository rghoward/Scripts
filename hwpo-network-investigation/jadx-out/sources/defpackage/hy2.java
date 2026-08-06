package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hy2 {
    public final fw9<qr5> a = new fw9<>(iy2.a);

    public final void a(qr5 qr5Var) {
        if (!qr5Var.e()) {
            uc5.b("DepthSortedSet.add called on an unattached node");
        }
        this.a.add(qr5Var);
    }

    public final boolean b(qr5 qr5Var) {
        if (!qr5Var.e()) {
            uc5.b("DepthSortedSet.remove called on an unattached node");
        }
        return this.a.remove(qr5Var);
    }

    public final String toString() {
        return this.a.toString();
    }
}
