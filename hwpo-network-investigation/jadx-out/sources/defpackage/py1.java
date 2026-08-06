package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class py1 extends vx6<qy1> {
    public final oh4<omb, g2b> t;

    public py1(oh4 oh4Var) {
        this.t = oh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        qy1 qy1Var = new qy1();
        qy1Var.J = this.t;
        return qy1Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        qy1 qy1Var = (qy1) cVar;
        oh4<? super omb, g2b> oh4Var = qy1Var.J;
        oh4<omb, g2b> oh4Var2 = this.t;
        if (oh4Var2 != oh4Var) {
            qy1Var.J = oh4Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof py1) && ((py1) obj).t == this.t;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
