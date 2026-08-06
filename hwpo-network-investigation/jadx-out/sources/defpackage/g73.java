package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class g73 extends vx6<q01> {
    public final oh4<s01, c73> t;

    /* JADX WARN: Multi-variable type inference failed */
    public g73(oh4<? super s01, c73> oh4Var) {
        this.t = oh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new q01(new s01(), this.t);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        q01 q01Var = (q01) cVar;
        q01Var.J = this.t;
        q01Var.M();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g73) {
            return this.t == ((g73) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
