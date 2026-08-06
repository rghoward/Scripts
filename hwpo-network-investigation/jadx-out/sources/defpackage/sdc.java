package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sdc extends bec {
    public final /* synthetic */ Exception x;
    public final /* synthetic */ mec y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdc(mec mecVar, Exception exc) {
        super(mecVar, false);
        this.x = exc;
        this.y = mecVar;
    }

    @Override // defpackage.bec
    public final void a() {
        lbc lbcVar = this.y.f;
        a78.g(lbcVar);
        lbcVar.logHealthData(5, "Error with data collection. Data lost.", new se7(this.x), new se7(null), new se7(null));
    }
}
