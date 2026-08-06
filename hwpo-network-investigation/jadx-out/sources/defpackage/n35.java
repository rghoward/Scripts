package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class n35 extends vx6<r35> {
    public final h27 t;

    public n35(h27 h27Var) {
        this.t = h27Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        r35 r35Var = new r35();
        r35Var.H = this.t;
        return r35Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        r35 r35Var = (r35) cVar;
        h27 h27Var = r35Var.H;
        h27 h27Var2 = this.t;
        if (xj5.a(h27Var, h27Var2)) {
            return;
        }
        r35Var.e2();
        r35Var.H = h27Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n35) && xj5.a(((n35) obj).t, this.t);
    }

    public final int hashCode() {
        return this.t.hashCode() * 31;
    }
}
