package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m0d implements tnc {
    public final tbc a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public m0d(AppMeasurementDynamiteService appMeasurementDynamiteService, tbc tbcVar) {
        this.b = appMeasurementDynamiteService;
        this.a = tbcVar;
    }

    @Override // defpackage.tnc
    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.l(str, str2, bundle, j);
        } catch (RemoteException e) {
            tkc tkcVar = this.b.b;
            if (tkcVar != null) {
                thc thcVar = tkcVar.f;
                tkc.m(thcVar);
                thcVar.i.b(e, "Event listener threw exception");
            }
        }
    }
}
