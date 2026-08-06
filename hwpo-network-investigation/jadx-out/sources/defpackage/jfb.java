package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jfb implements Runnable {
    public final /* synthetic */ rfb.a t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ long v;

    public /* synthetic */ jfb(rfb.a aVar, Object obj, long j) {
        this.t = aVar;
        this.u = obj;
        this.v = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rfb rfbVar = this.t.b;
        String str = n6b.a;
        rfbVar.k(this.v, this.u);
    }
}
