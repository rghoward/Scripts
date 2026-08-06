package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class jo7 extends vx6<no7> {
    public final go7 t;

    public jo7(go7 go7Var, co7 co7Var) {
        this.t = go7Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        no7 no7Var = new no7();
        no7Var.H = this.t;
        return no7Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((no7) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        jo7 jo7Var = obj instanceof jo7 ? (jo7) obj : null;
        if (jo7Var == null) {
            return false;
        }
        return xj5.a(this.t, jo7Var.t);
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
