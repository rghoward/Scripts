package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vq9 implements Runnable {
    public final /* synthetic */ boolean t;
    public final /* synthetic */ uq9.c.a u;

    public vq9(uq9.c.a aVar, boolean z) {
        this.u = aVar;
        this.t = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l6b.a();
        uq9.c cVar = uq9.c.this;
        boolean z = cVar.a;
        boolean z2 = this.t;
        cVar.a = z2;
        if (z != z2) {
            cVar.b.a(z2);
        }
    }
}
