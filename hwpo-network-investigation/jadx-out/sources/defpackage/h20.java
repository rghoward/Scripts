package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h20 extends vx6<q52> implements ob9 {
    public final boolean t;
    public final oh4<hc9, g2b> u;

    public h20(oh4 oh4Var, boolean z) {
        this.t = z;
        this.u = oh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new q52(this.t, false, this.u);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        q52 q52Var = (q52) cVar;
        q52Var.H = this.t;
        q52Var.J = this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h20)) {
            return false;
        }
        h20 h20Var = (h20) obj;
        return this.t == h20Var.t && this.u == h20Var.u;
    }

    public final int hashCode() {
        return this.u.hashCode() + (Boolean.hashCode(this.t) * 31);
    }

    @Override // defpackage.ob9
    public final lb9 r() {
        lb9 lb9Var = new lb9();
        lb9Var.v = this.t;
        this.u.invoke(lb9Var);
        return lb9Var;
    }
}
