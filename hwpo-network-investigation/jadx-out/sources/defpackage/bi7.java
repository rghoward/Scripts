package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class bi7 extends vx6<ci7> {
    public final oh4<kg5, g2b> t;

    /* JADX WARN: Multi-variable type inference failed */
    public bi7(oh4<? super kg5, g2b> oh4Var) {
        this.t = oh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new ci7(this.t);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ci7 ci7Var = (ci7) cVar;
        ci7Var.H = this.t;
        ci7Var.J = -9223372034707292160L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bi7) {
            return this.t == ((bi7) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
