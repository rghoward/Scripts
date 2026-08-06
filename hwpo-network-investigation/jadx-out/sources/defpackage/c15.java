package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c15 extends vx6<d15> {
    public final sp0.a t;

    public c15(sp0.a aVar) {
        this.t = aVar;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        d15 d15Var = new d15();
        d15Var.H = this.t;
        return d15Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((d15) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c15 c15Var = obj instanceof c15 ? (c15) obj : null;
        if (c15Var == null) {
            return false;
        }
        return xj5.a(this.t, c15Var.t);
    }

    public final int hashCode() {
        return Float.hashCode(this.t.a);
    }
}
