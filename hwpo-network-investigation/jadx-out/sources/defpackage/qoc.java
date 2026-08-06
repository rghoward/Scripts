package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qoc implements Runnable {
    public final /* synthetic */ r9a t;
    public final /* synthetic */ nqc u;

    public qoc(nqc nqcVar, r9a r9aVar) {
        this.t = r9aVar;
        this.u = nqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nqc nqcVar = this.u;
        synchronized (nqcVar.u) {
            try {
                lh7 lh7Var = nqcVar.v;
                if (lh7Var != null) {
                    Exception excI = this.t.i();
                    a78.g(excI);
                    lh7Var.d(excI);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
