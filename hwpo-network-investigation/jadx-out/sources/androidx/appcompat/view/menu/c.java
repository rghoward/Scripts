package androidx.appcompat.view.menu;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ b.d t;
    public final /* synthetic */ h u;
    public final /* synthetic */ f v;
    public final /* synthetic */ b.c w;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.w = cVar;
        this.t = dVar;
        this.u = hVar;
        this.v = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = b.this;
        b.d dVar = this.t;
        if (dVar != null) {
            bVar.S = true;
            dVar.b.c(false);
            bVar.S = false;
        }
        h hVar = this.u;
        if (hVar.isEnabled() && hVar.hasSubMenu()) {
            this.v.q(hVar, null, 4);
        }
    }
}
