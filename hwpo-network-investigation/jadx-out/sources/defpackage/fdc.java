package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fdc extends bec {
    public final /* synthetic */ ibc A;
    public final /* synthetic */ mec B;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdc(mec mecVar, String str, String str2, boolean z, ibc ibcVar) {
        super(mecVar, true);
        this.x = str;
        this.y = str2;
        this.z = z;
        this.A = ibcVar;
        Objects.requireNonNull(mecVar);
        this.B = mecVar;
    }

    @Override // defpackage.bec
    public final void a() {
        lbc lbcVar = this.B.f;
        a78.g(lbcVar);
        lbcVar.getUserProperties(this.x, this.y, this.z, this.A);
    }

    @Override // defpackage.bec
    public final void b() {
        this.A.D(null);
    }
}
