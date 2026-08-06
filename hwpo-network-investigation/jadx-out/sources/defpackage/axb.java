package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class axb extends kn4 {
    public final paa U;

    public axb(Context context, Looper looper, nf1 nf1Var, paa paaVar, rub rubVar, rub rubVar2) {
        super(context, looper, 270, nf1Var, rubVar, rubVar2);
        this.U = paaVar;
    }

    @Override // defpackage.ik0
    public final boolean A() {
        return true;
    }

    @Override // defpackage.ik0, zw.e
    public final int l() {
        return 203400000;
    }

    @Override // defpackage.ik0
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof iwb ? (iwb) iInterfaceQueryLocalInterface : new iwb(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // defpackage.ik0
    public final fu3[] t() {
        return ovb.c;
    }

    @Override // defpackage.ik0
    public final Bundle v() {
        paa paaVar = this.U;
        paaVar.getClass();
        Bundle bundle = new Bundle();
        String str = paaVar.b;
        if (str != null) {
            bundle.putString(MetricTracker.Place.API, str);
        }
        return bundle;
    }

    @Override // defpackage.ik0
    public final String y() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.ik0
    public final String z() {
        return "com.google.android.gms.common.telemetry.service.START";
    }
}
