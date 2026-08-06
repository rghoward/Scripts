package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gwa implements b33 {
    public final /* synthetic */ tva a;
    public final /* synthetic */ tva b;

    public gwa(tva tvaVar, tva tvaVar2) {
        this.a = tvaVar;
        this.b = tvaVar2;
    }

    @Override // defpackage.b33
    public final void dispose() {
        this.a.j.remove(this.b);
    }
}
