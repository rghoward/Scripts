package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class scc extends bec {
    public final /* synthetic */ mec A;
    public final /* synthetic */ lcc x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scc(mec mecVar, lcc lccVar, String str, String str2) {
        super(mecVar, true);
        this.x = lccVar;
        this.y = str;
        this.z = str2;
        Objects.requireNonNull(mecVar);
        this.A = mecVar;
    }

    @Override // defpackage.bec
    public final void a() {
        lbc lbcVar = this.A.f;
        a78.g(lbcVar);
        lbcVar.setCurrentScreenByScionActivityInfo(this.x, this.y, this.z, this.t);
    }
}
