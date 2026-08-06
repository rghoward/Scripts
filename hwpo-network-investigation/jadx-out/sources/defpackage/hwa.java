package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hwa implements b33 {
    public final /* synthetic */ tva a;
    public final /* synthetic */ tva.a b;

    public hwa(tva tvaVar, tva.a aVar) {
        this.a = tvaVar;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b33
    public final void dispose() {
        tva tvaVar = this.a;
        tvaVar.getClass();
        tva.a.C0252a c0252a = (tva.a.C0252a) this.b.b.getValue();
        if (c0252a != null) {
            tvaVar.i.remove(c0252a.t);
        }
    }
}
