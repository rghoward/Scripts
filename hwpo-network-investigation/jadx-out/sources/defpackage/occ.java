package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class occ extends bec {
    public final /* synthetic */ Bundle x;
    public final /* synthetic */ mec y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public occ(mec mecVar, Bundle bundle) {
        super(mecVar, true);
        this.x = bundle;
        Objects.requireNonNull(mecVar);
        this.y = mecVar;
    }

    @Override // defpackage.bec
    public final void a() {
        lbc lbcVar = this.y.f;
        a78.g(lbcVar);
        lbcVar.setConditionalUserProperty(this.x, this.t);
    }
}
