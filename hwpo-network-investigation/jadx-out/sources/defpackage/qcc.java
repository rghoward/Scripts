package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qcc extends bec {
    public final /* synthetic */ mec A;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ ibc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcc(mec mecVar, String str, String str2, ibc ibcVar) {
        super(mecVar, true);
        this.x = str;
        this.y = str2;
        this.z = ibcVar;
        Objects.requireNonNull(mecVar);
        this.A = mecVar;
    }

    @Override // defpackage.bec
    public final void a() {
        lbc lbcVar = this.A.f;
        a78.g(lbcVar);
        lbcVar.getConditionalUserProperties(this.x, this.y, this.z);
    }

    @Override // defpackage.bec
    public final void b() {
        this.z.D(null);
    }
}
