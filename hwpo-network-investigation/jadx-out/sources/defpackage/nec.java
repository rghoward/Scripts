package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nec implements AppMeasurementSdk.a {
    public final /* synthetic */ ggc a;

    public nec(ggc ggcVar) {
        this.a = ggcVar;
    }

    @Override // defpackage.tnc
    public final void a(String str, String str2, Bundle bundle, long j) {
        if (str == null || tac.a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.a.a.a(3, bundle2);
    }
}
