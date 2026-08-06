package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xd1 extends vx6<q52> implements ob9 {
    public final oh4<hc9, g2b> t;

    /* JADX WARN: Multi-variable type inference failed */
    public xd1(oh4<? super hc9, g2b> oh4Var) {
        this.t = oh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new q52(false, true, this.t);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((q52) cVar).J = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xd1) {
            return this.t == ((xd1) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    @Override // defpackage.ob9
    public final lb9 r() {
        lb9 lb9Var = new lb9();
        lb9Var.v = false;
        lb9Var.w = true;
        this.t.invoke(lb9Var);
        return lb9Var;
    }
}
