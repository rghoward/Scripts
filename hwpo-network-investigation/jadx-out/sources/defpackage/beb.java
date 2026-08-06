package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class beb extends vx6<ceb> {
    public final sp0.b t = di.a.k;

    @Override // defpackage.vx6
    public final ox6.c a() {
        ceb cebVar = new ceb();
        cebVar.H = this.t;
        return cebVar;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((ceb) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        beb bebVar = obj instanceof beb ? (beb) obj : null;
        if (bebVar == null) {
            return false;
        }
        return xj5.a(this.t, bebVar.t);
    }

    public final int hashCode() {
        return Float.hashCode(this.t.a);
    }
}
