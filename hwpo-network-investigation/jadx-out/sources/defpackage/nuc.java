package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nuc implements Runnable {
    public final /* synthetic */ jgc t;
    public final /* synthetic */ hvc u;

    public nuc(hvc hvcVar, jgc jgcVar) {
        this.t = jgcVar;
        this.u = hvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hvc hvcVar = this.u;
        synchronized (hvcVar) {
            try {
                hvcVar.t = false;
                tvc tvcVar = hvcVar.v;
                if (!tvcVar.x()) {
                    thc thcVar = tvcVar.a.f;
                    tkc.m(thcVar);
                    thcVar.n.a("Connected to service");
                    jgc jgcVar = this.t;
                    tvcVar.g();
                    tvcVar.d = jgcVar;
                    tvcVar.t();
                    tvcVar.v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
