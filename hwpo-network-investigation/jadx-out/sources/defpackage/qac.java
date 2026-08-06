package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qac implements Runnable {
    public final /* synthetic */ r9a t;
    public final /* synthetic */ fcc u;

    public qac(fcc fccVar, r9a r9aVar) {
        this.t = r9aVar;
        this.u = fccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9a r9aVar = this.t;
        boolean zL = r9aVar.l();
        fcc fccVar = this.u;
        if (zL) {
            fccVar.v.s();
            return;
        }
        try {
            fccVar.v.p(fccVar.u.a(r9aVar));
        } catch (az8 e) {
            if (!(e.getCause() instanceof Exception)) {
                fccVar.v.r(e);
            } else {
                fccVar.v.r((Exception) e.getCause());
            }
        } catch (Exception e2) {
            fccVar.v.r(e2);
        }
    }
}
