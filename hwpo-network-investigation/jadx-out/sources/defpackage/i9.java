package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i9 implements Runnable {
    public final /* synthetic */ l9.a t;
    public final /* synthetic */ Object u;

    public i9(l9.a aVar, Object obj) {
        this.t = aVar;
        this.u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.t = this.u;
    }
}
