package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class amc implements Runnable {
    public final /* synthetic */ szc t;
    public final /* synthetic */ q1d u;
    public final /* synthetic */ zmc v;

    public amc(zmc zmcVar, szc szcVar, q1d q1dVar) {
        this.t = szcVar;
        this.u = q1dVar;
        this.v = zmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lzc lzcVar = this.v.b;
        lzcVar.W();
        szc szcVar = this.t;
        Object objJ = szcVar.j();
        q1d q1dVar = this.u;
        if (objJ == null) {
            lzcVar.Y(szcVar.u, q1dVar);
        } else {
            lzcVar.X(szcVar, q1dVar);
        }
    }
}
