package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gtc implements Runnable {
    public final /* synthetic */ q1d t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ szc v;
    public final /* synthetic */ tvc w;

    public gtc(tvc tvcVar, q1d q1dVar, boolean z, szc szcVar) {
        this.t = q1dVar;
        this.u = z;
        this.v = szcVar;
        this.w = tvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        tvc tvcVar = this.w;
        jgc jgcVar = tvcVar.d;
        if (jgcVar != null) {
            tvcVar.y(jgcVar, this.u ? null : this.v, this.t);
            tvcVar.t();
        } else {
            thc thcVar = tvcVar.a.f;
            tkc.m(thcVar);
            thcVar.f.a("Discarding data. Failed to set user property");
        }
    }
}
