package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class mj5 extends vx6<nj5> {
    public final sj5 t = sj5.u;
    public final boolean u = true;

    @Override // defpackage.vx6
    public final ox6.c a() {
        nj5 nj5Var = new nj5();
        nj5Var.H = this.t;
        nj5Var.I = this.u;
        return nj5Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        nj5 nj5Var = (nj5) cVar;
        nj5Var.H = this.t;
        nj5Var.I = this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        mj5 mj5Var = obj instanceof mj5 ? (mj5) obj : null;
        return mj5Var != null && this.t == mj5Var.t && this.u == mj5Var.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + (this.t.hashCode() * 31);
    }
}
