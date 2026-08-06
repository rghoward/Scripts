package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xuc extends rmc {
    public final /* synthetic */ s3d u;

    public xuc(s3d s3dVar) {
        this.u = s3dVar;
    }

    @Override // defpackage.rmc
    public final void a() {
        synchronized (this.u.f) {
            try {
                if (this.u.k.get() > 0 && this.u.k.decrementAndGet() > 0) {
                    this.u.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                s3d s3dVar = this.u;
                if (s3dVar.m != null) {
                    s3dVar.b.a("Unbind from service.", new Object[0]);
                    s3d s3dVar2 = this.u;
                    s3dVar2.a.unbindService(s3dVar2.l);
                    s3d s3dVar3 = this.u;
                    s3dVar3.g = false;
                    s3dVar3.m = null;
                    s3dVar3.l = null;
                }
                this.u.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
