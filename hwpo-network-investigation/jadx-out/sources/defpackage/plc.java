package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class plc implements Runnable {
    public final /* synthetic */ q1d t;
    public final /* synthetic */ zmc u;

    public plc(zmc zmcVar, q1d q1dVar) {
        this.t = q1dVar;
        this.u = zmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zmc zmcVar = this.u;
        zmcVar.b.W();
        lzc lzcVar = zmcVar.b;
        lzcVar.e().g();
        lzcVar.m0();
        q1d q1dVar = this.t;
        a78.d(q1dVar.t);
        lzcVar.d0(q1dVar);
    }
}
