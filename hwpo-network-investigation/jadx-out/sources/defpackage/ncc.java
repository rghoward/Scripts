package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ncc extends bec {
    public final /* synthetic */ Object x;
    public final /* synthetic */ mec y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncc(mec mecVar, Object obj) {
        super(mecVar, true);
        this.x = obj;
        this.y = mecVar;
    }

    @Override // defpackage.bec
    public final void a() {
        lbc lbcVar = this.y.f;
        a78.g(lbcVar);
        lbcVar.setUserProperty("fcm", "_ln", new se7(this.x), true, this.t);
    }
}
