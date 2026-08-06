package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class l40 extends vx6<o40> {
    public final float t = 1.0f;

    @Override // defpackage.vx6
    public final ox6.c a() {
        o40 o40Var = new o40();
        o40Var.H = this.t;
        return o40Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((o40) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        l40 l40Var = obj instanceof l40 ? (l40) obj : null;
        if (l40Var == null || this.t != l40Var.t) {
            return false;
        }
        ((l40) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.t) * 31);
    }
}
