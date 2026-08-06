package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ssc implements Runnable {
    public final /* synthetic */ r9a t;
    public final /* synthetic */ wuc u;

    public ssc(wuc wucVar, r9a r9aVar) {
        this.t = r9aVar;
        this.u = wucVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wuc wucVar = this.u;
        synchronized (wucVar.u) {
            try {
                di7 di7Var = wucVar.v;
                if (di7Var != null) {
                    di7Var.onSuccess(this.t.j());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
