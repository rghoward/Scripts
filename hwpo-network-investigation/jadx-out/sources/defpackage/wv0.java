package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class wv0 extends vx6<cw0> {
    public final bt.k t;

    public wv0(bt.k kVar) {
        this.t = kVar;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new cw0(this.t);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        cw0 cw0Var = (cw0) cVar;
        bt.k kVar = this.t;
        cw0Var.H = kVar;
        if (cw0Var.G) {
            kVar.invoke(cw0Var.I);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wv0) {
            return this.t == ((wv0) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
