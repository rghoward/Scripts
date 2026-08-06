package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class egc implements Runnable {
    public final /* synthetic */ iic t;

    public egc(iic iicVar) {
        this.t = iicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iic iicVar = this.t;
        synchronized (iicVar.u) {
            try {
                ch7 ch7Var = iicVar.v;
                if (ch7Var != null) {
                    ch7Var.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
