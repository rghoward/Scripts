package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gsc implements Runnable {
    public final /* synthetic */ dsc t;
    public final /* synthetic */ dsc u;
    public final /* synthetic */ long v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ xsc x;

    public gsc(xsc xscVar, dsc dscVar, dsc dscVar2, long j, boolean z) {
        this.t = dscVar;
        this.u = dscVar2;
        this.v = j;
        this.w = z;
        this.x = xscVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.x.m(this.t, this.u, this.v, this.w, null);
    }
}
