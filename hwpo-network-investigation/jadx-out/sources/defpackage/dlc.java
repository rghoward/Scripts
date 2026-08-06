package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dlc implements Runnable {
    public final /* synthetic */ e5c t;
    public final /* synthetic */ q1d u;
    public final /* synthetic */ zmc v;

    public dlc(zmc zmcVar, e5c e5cVar, q1d q1dVar) {
        this.t = e5cVar;
        this.u = q1dVar;
        this.v = zmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lzc lzcVar = this.v.b;
        lzcVar.W();
        e5c e5cVar = this.t;
        Object objJ = e5cVar.v.j();
        q1d q1dVar = this.u;
        if (objJ == null) {
            lzcVar.b0(e5cVar, q1dVar);
        } else {
            lzcVar.a0(e5cVar, q1dVar);
        }
    }
}
