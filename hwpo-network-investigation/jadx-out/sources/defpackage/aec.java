package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aec extends bec {
    public final /* synthetic */ mec A;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ Bundle z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aec(mec mecVar, String str, String str2, Bundle bundle) {
        super(mecVar, true);
        this.x = str;
        this.y = str2;
        this.z = bundle;
        Objects.requireNonNull(mecVar);
        this.A = mecVar;
    }

    @Override // defpackage.bec
    public final void a() {
        long j = this.t;
        long j2 = this.u;
        lbc lbcVar = this.A.f;
        a78.g(lbcVar);
        lbcVar.logEventWithElapsedTime(this.x, this.y, this.z, true, true, j, j2);
    }
}
