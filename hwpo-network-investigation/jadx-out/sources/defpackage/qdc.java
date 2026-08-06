package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qdc implements Runnable {
    public final /* synthetic */ r9a t;
    public final /* synthetic */ uec u;

    public qdc(uec uecVar, r9a r9aVar) {
        this.t = r9aVar;
        this.u = uecVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uec uecVar = this.u;
        try {
            r9a r9aVar = (r9a) uecVar.u.a(this.t);
            if (r9aVar == null) {
                uecVar.d(new NullPointerException("Continuation returned null"));
                return;
            }
            r3d r3dVar = u9a.b;
            r9aVar.f(r3dVar, uecVar);
            r9aVar.e(r3dVar, uecVar);
            r9aVar.a(r3dVar, uecVar);
        } catch (az8 e) {
            if (!(e.getCause() instanceof Exception)) {
                uecVar.v.r(e);
            } else {
                uecVar.v.r((Exception) e.getCause());
            }
        } catch (Exception e2) {
            uecVar.v.r(e2);
        }
    }
}
