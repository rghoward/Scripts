package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class ha4 extends vx6<la4> {
    public final h27 t;

    public ha4(h27 h27Var) {
        this.t = h27Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new la4(this.t, 1, null);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((la4) cVar).h2(this.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ha4) {
            return xj5.a(this.t, ((ha4) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        h27 h27Var = this.t;
        if (h27Var != null) {
            return h27Var.hashCode();
        }
        return 0;
    }
}
