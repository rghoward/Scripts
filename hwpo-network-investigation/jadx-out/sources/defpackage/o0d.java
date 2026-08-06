package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o0d extends rmc {
    public final /* synthetic */ s1d u;

    public o0d(s1d s1dVar) {
        this.u = s1dVar;
    }

    @Override // defpackage.rmc
    public final void a() {
        s3d s3dVar = this.u.t;
        s3dVar.b.a("unlinkToDeath", new Object[0]);
        s3dVar.m.asBinder().unlinkToDeath(s3dVar.j, 0);
        s3dVar.m = null;
        s3dVar.g = false;
    }
}
