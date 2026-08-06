package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cec extends sbc {
    public final AppMeasurementSdk.a b;

    public cec(AppMeasurementSdk.a aVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.b = aVar;
    }

    @Override // defpackage.tbc
    public final int f() {
        return System.identityHashCode(this.b);
    }

    @Override // defpackage.tbc
    public final void l(String str, String str2, Bundle bundle, long j) {
        this.b.a(str, str2, bundle, j);
    }
}
