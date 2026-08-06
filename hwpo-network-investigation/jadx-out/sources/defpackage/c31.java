package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c31 implements Runnable {
    public final /* synthetic */ kza.a t;
    public final /* synthetic */ int u;

    public c31(kza.a aVar, int i) {
        this.t = aVar;
        this.u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iu8.c cVar = this.t.u;
        if (cVar != null) {
            cVar.b(this.u);
        }
    }
}
