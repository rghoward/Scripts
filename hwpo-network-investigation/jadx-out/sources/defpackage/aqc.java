package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aqc implements Runnable {
    public final /* synthetic */ nnc t;
    public final /* synthetic */ long u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ hrc w;

    public aqc(hrc hrcVar, nnc nncVar, long j, boolean z) {
        this.t = nncVar;
        this.u = j;
        this.v = z;
        this.w = hrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hrc hrcVar = this.w;
        nnc nncVar = this.t;
        hrcVar.G(nncVar);
        hrcVar.w(nncVar, this.u, this.v);
    }
}
