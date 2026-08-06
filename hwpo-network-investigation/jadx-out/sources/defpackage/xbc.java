package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xbc implements AppMeasurementSdk.a {
    public final /* synthetic */ hdc a;

    public xbc(hdc hdcVar) {
        this.a = hdcVar;
    }

    @Override // defpackage.tnc
    public final void a(String str, String str2, Bundle bundle, long j) {
        hdc hdcVar = this.a;
        if (hdcVar.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            q95 q95Var = tac.a;
            String strE = s7.e(str2, oh7.f, oh7.a);
            if (strE != null) {
                str2 = strE;
            }
            bundle2.putString("events", str2);
            hdcVar.b.a(2, bundle2);
        }
    }
}
