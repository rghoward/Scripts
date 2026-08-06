package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iwa implements b33 {
    public final /* synthetic */ tva a;
    public final /* synthetic */ tva.d b;

    public iwa(tva tvaVar, tva.d dVar) {
        this.a = tvaVar;
        this.b = dVar;
    }

    @Override // defpackage.b33
    public final void dispose() {
        this.a.i.remove(this.b);
    }
}
