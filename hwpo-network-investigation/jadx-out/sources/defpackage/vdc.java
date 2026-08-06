package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vdc extends bec {
    public final /* synthetic */ String x;
    public final /* synthetic */ ibc y;
    public final /* synthetic */ mec z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdc(mec mecVar, String str, ibc ibcVar) {
        super(mecVar, true);
        this.x = str;
        this.y = ibcVar;
        Objects.requireNonNull(mecVar);
        this.z = mecVar;
    }

    @Override // defpackage.bec
    public final void a() {
        lbc lbcVar = this.z.f;
        a78.g(lbcVar);
        lbcVar.getMaxUserProperties(this.x, this.y);
    }

    @Override // defpackage.bec
    public final void b() {
        this.y.D(null);
    }
}
