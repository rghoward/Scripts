package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tsc extends rmc {
    public final /* synthetic */ t9a u;
    public final /* synthetic */ vec v;
    public final /* synthetic */ s3d w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsc(s3d s3dVar, t9a t9aVar, t9a t9aVar2, vec vecVar) {
        super(t9aVar);
        this.u = t9aVar2;
        this.v = vecVar;
        this.w = s3dVar;
    }

    @Override // defpackage.rmc
    public final void a() {
        synchronized (this.w.f) {
            try {
                final s3d s3dVar = this.w;
                final t9a t9aVar = this.u;
                s3dVar.e.add(t9aVar);
                t9aVar.a.b(new fh7() { // from class: oqc
                    @Override // defpackage.fh7
                    public final void b(r9a r9aVar) {
                        s3d s3dVar2 = s3dVar;
                        t9a t9aVar2 = t9aVar;
                        synchronized (s3dVar2.f) {
                            s3dVar2.e.remove(t9aVar2);
                        }
                    }
                });
                if (this.w.k.getAndIncrement() > 0) {
                    this.w.b.a("Already connected to the service.", new Object[0]);
                }
                s3d.b(this.w, this.v);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
