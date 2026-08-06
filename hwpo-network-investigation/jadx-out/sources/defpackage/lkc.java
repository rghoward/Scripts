package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lkc implements Runnable {
    public final /* synthetic */ r9a t;
    public final /* synthetic */ pmc u;

    public lkc(pmc pmcVar, r9a r9aVar) {
        this.t = r9aVar;
        this.u = pmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pmc pmcVar = this.u;
        synchronized (pmcVar.u) {
            pmcVar.v.b(this.t);
        }
    }
}
