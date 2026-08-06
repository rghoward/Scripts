package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class w8b implements oh4<Boolean, g2b> {
    public final /* synthetic */ o8b t;

    public w8b(o8b o8bVar) {
        this.t = o8bVar;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        o8b o8bVar = this.t;
        o8bVar.k(new i9b(o8bVar, zBooleanValue));
        return g2b.a;
    }
}
