package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zdc extends bec {
    public final /* synthetic */ cec x;
    public final /* synthetic */ mec y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdc(mec mecVar, cec cecVar) {
        super(mecVar, true);
        this.x = cecVar;
        this.y = mecVar;
    }

    @Override // defpackage.bec
    public final void a() {
        lbc lbcVar = this.y.f;
        a78.g(lbcVar);
        lbcVar.registerOnMeasurementEventListener(this.x);
    }
}
